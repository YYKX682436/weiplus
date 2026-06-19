package com.muchen.weiplus.features

/**
 * 禁用微信热更新 — 拦截 Tinker 补丁加载，防止微信自动更新改变类结构
 */
class DisableHotUpdateFeature : BaseFeature() {
    override val key = "disable_hot_update"
    override val name = "禁用热更新"
    override val description = "阻止微信 Tinker 补丁加载，保持类结构稳定"

    override fun onEnable(module: io.github.libxposed.api.XposedModule, classLoader: ClassLoader) {
        // Hook 在 ModuleEntry.onPackageLoaded() 中执行（最早时机）
    }
}
