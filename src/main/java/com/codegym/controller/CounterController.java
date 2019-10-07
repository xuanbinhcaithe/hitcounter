package com.codegym.controller;

import com.codegym.model.MyCount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
    @ModelAttribute("mycounter")
    public MyCount setUpCounter() {
        return  new MyCount();
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCount myCount) {
        myCount.increment();
        return "index";
    }
}
