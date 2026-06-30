package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

class ForwardLimitFeature : BaseFeature() {

    companion object {
        private const val TAG = "ForwardLimit"
        private val SELECT_LIMIT_CLASSES = listOf(
            "com.tencent.mm.ui.contact.SelectContactUI",
            "com.tencent.mm.ui.contact.MMBaseSelectContactUI",
            "com.tencent.mm.ui.mvvm.state.SelectContactState",
            "com.tencent.mm.pluginsdk.ui.MultiSelectContactView"
        )
        private val FORWARD_CHECK_CLASSES = listOf(
            "com.tencent.mm.feature.forward.ui.ForwardMsgPreviewUI",
            "com.tencent.mm.feature.forward.entry.BaseForwardUIC",
            "com.tencent.mm.feature.forward.preview.BaseForwardMsgPreviewUIC",
            "com.tencent.mm.feature.appmsg.ui.item.RecordDetailBaseItemConvert"
        )
    }

    override val key = "forward_limit"
    override val name = "RemoveForwardLimit"

    private lateinit var module: XposedModule

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module

        for (clsName in SELECT_LIMIT_CLASSES) {
            try { hookSelectLimit(classLoader, clsName) }
            catch (e: Throwable) { module.log(Log.WARN, TAG, clsName.substringAfterLast('.') + " not found") }
        }

        for (clsName in FORWARD_CHECK_CLASSES) {
            try { hookForwardCheck(classLoader, clsName) }
            catch (e: Throwable) { module.log(Log.WARN, TAG, clsName.substringAfterLast('.') + " not found") }
        }

        try { hookChatFooterForward(classLoader) }
        catch (_: Throwable) {}

        module.log(Log.INFO, TAG, "All hook strategies attempted")
    }

    private fun hookSelectLimit(classLoader: ClassLoader, clsName: String) {
        val clz = classLoader.loadClass(clsName)
        var hooked = 0
        for (m in clz.declaredMethods) {
            val rt = m.returnType
            val mn = m.name.lowercase()
            if (rt == Int::class.java || rt == Int::class.javaPrimitiveType) {
                if (mn.contains("max") || mn.contains("limit") || mn.contains("count") || mn.contains("select")) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        val orig = chain.proceed() as? Int ?: 9
                        if (orig in 1..100) {
                            module.log(Log.INFO, TAG, clsName.substringAfterLast('.') + "." + m.name + "() " + orig + " -> MAX")
                            return@intercept Int.MAX_VALUE
                        }
                        orig
                    }
                    hooked++
                }
            }
            if (rt == Boolean::class.javaPrimitiveType) {
                if (mn.contains("over") || mn.contains("reach") || mn.contains("exceed") || mn.contains("islimit") || mn.contains("ismax")) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        return@intercept false
                    }
                    hooked++
                }
            }
        }
        if (hooked > 0) {
            module.log(Log.INFO, TAG, clsName.substringAfterLast('.') + ": " + hooked + " methods hooked")
        }
    }

    private fun hookForwardCheck(classLoader: ClassLoader, clsName: String) {
        val clz = classLoader.loadClass(clsName)
        var hooked = 0
        for (m in clz.declaredMethods) {
            if (m.returnType == Boolean::class.javaPrimitiveType) {
                val mn = m.name.lowercase()
                if (mn.contains("can") || mn.contains("support") || mn.contains("check") || mn.contains("allow") || mn.contains("valid") || mn.contains("forward") || mn.contains("retransmit") || mn.contains("transmit")) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        val orig = chain.proceed()
                        if (orig as? Boolean == false) {
                            module.log(Log.INFO, TAG, clsName.substringAfterLast('.') + "." + m.name + "() false->true")
                        }
                        return@intercept true
                    }
                    hooked++
                }
            }
        }
        if (hooked > 0) {
            module.log(Log.INFO, TAG, clsName.substringAfterLast('.') + ": " + hooked + " methods hooked")
        }
    }

    private fun hookChatFooterForward(classLoader: ClassLoader) {
        val clz = classLoader.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
        for (m in clz.declaredMethods) {
            if (m.returnType == Boolean::class.javaPrimitiveType) {
                val mn = m.name.lowercase()
                if (mn.contains("can") || mn.contains("support") || mn.contains("forward") || mn.contains("transmit") || mn.contains("retransmit")) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.forwardLimit) return@intercept chain.proceed()
                        return@intercept true
                    }
                    module.log(Log.INFO, TAG, "ChatFooter." + m.name + "() Hook OK")
                }
            }
        }
    }
}
