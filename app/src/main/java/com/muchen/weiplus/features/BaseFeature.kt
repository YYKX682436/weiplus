package com.muchen.weiplus.features

import android.content.Context
import com.muchen.weiplus.ui.MainActivity
import io.github.libxposed.api.XposedModule

/**
 * 功能基类 — 所有功能模块继承此类
 */
abstract class BaseFeature {

    /** 功能唯一标识（对应 SharedPreferences key） */
    abstract val key: String

    /** 功能名称（UI 显示） */
    abstract val name: String

    /** 当前是否启用 */
    fun isEnabled(ctx: Context): Boolean =
        MainActivity.isFeatureEnabled(ctx, key)

    /**
     * 激活功能（绑定 Hook）
     * @param module XposedModule 实例，用于调用 hook() 方法
     * @param classLoader 微信的 ClassLoader
     */
    abstract fun onEnable(module: XposedModule, classLoader: ClassLoader)

    /** 停用功能（解绑 Hook — 暂不实现，需重启微信生效） */
    open fun onDisable() {}
}
