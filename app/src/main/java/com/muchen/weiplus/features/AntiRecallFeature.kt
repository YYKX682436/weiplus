package com.muchen.weiplus.features

import com.muchen.weiplus.ui.MainActivity
import io.github.libxposed.api.XposedModule

/**
 * 禁止消息撤回 — 阻止好友撤回消息
 *
 * 联动: MainActivity "禁止消息撤回" 开关 -> SharedPreferences -> isEnabled() -> onEnable()
 */
class AntiRecallFeature : BaseFeature() {
    override val key = MainActivity.KEY_ANTI_RECALL
    override val name = "禁止消息撤回"

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        // TODO: Hook 消息撤回相关方法 — 待实际开发
    }
}
