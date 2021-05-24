package com.github.xoax.mvptemplate.services

import com.github.xoax.mvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
