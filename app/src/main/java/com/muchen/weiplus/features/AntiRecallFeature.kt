package com.muchen.weiplus.features

import android.util.Log
import com.muchen.weiplus.ui.MainActivity
import io.github.libxposed.api.XposedModule
import java.lang.reflect.Method
import java.lang.reflect.Modifier

/**
 * 防撤回 — 穷举已知微信消息处理类，直接 hook doRevokeMsg。
 * 不扫描DEX，不找字符串，直接试。
 *
 * 联动: MainActivity "禁止消息撤回" 开关 -> SharedPreferences -> isEnabled() -> onEnable()
 */
class AntiRecallFeature : BaseFeature() {
    override val key = MainActivity.KEY_ANTI_RECALL
    override val name = "禁止消息撤回"

    companion object {
        private const val TAG = "WeiPlus"

        /** 已知微信消息处理类（可能含doRevokeMsg），穷举尝试 */
        private val REVOKE_HANDLER_CLASSES = arrayOf(
            "com.tencent.mm.model.bi",
            "com.tencent.mm.model.az",
            "com.tencent.mm.model.ay",
            "com.tencent.mm.model.bb",
            "com.tencent.mm.model.bc",
            "com.tencent.mm.model.bh",
            "com.tencent.mm.model.bj",
            "com.tencent.mm.modelmulti.k",
            "com.tencent.mm.modelmulti.j",
            "com.tencent.mm.modelmulti.h",
            "com.tencent.mm.modelmulti.i",
        )

        /** XmlParser 候选类名（按微信混淆命名排列） */
        private val XML_PARSER_CLASSES = arrayOf(
            "com.tencent.mm.sdk.platformtools.XmlParser",
            "com.tencent.mm.sdk.platformtools.ag",
            "com.tencent.mm.sdk.platformtools.ah",
            "com.tencent.mm.sdk.platformtools.ai",
            "com.tencent.mm.sdk.platformtools.aj",
            "com.tencent.mm.sdk.platformtools.ak",
            "com.tencent.mm.sdk.platformtools.al",
            "com.tencent.mm.sdk.platformtools.am",
            "com.tencent.mm.sdk.platformtools.an",
            "com.tencent.mm.sdk.platformtools.ao",
            "com.tencent.mm.sdk.platformtools.ap",
            "com.tencent.mm.sdk.platformtools.aq",
            "com.tencent.mm.sdk.platformtools.ar",
            "com.tencent.mm.sdk.platformtools.as",
            "com.tencent.mm.sdk.platformtools.at",
            "com.tencent.mm.sdk.platformtools.au",
            "com.tencent.mm.sdk.platformtools.av",
            "com.tencent.mm.sdk.platformtools.aw",
            "com.tencent.mm.sdk.platformtools.ax",
            "com.tencent.mm.sdk.platformtools.ay",
            "com.tencent.mm.sdk.platformtools.az",
            "com.tencent.mm.sdk.platformtools.ba",
        )
    }

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        // ====== 策略1: 穷举已知 doRevokeMsg 类 ======
        if (tryHookRevokeHandlers(module, classLoader)) {
            log(module, "防撤回已激活 (doRevokeMsg)")
            return
        }

        // ====== 策略2: XmlParser 拦截 ======
        if (tryHookXmlParser(module, classLoader)) {
            log(module, "防撤回已激活 (XmlParser)")
            return
        }

        log(module, "防撤回: 所有已知类均未匹配当前微信版本")
    }

    private fun log(module: XposedModule, msg: String) {
        module.log(Log.INFO, TAG, msg)
    }

    // ========================================================================
    // 策略1: 穷举已知消息处理类
    // ========================================================================

    private fun tryHookRevokeHandlers(module: XposedModule, classLoader: ClassLoader): Boolean {
        for (name in REVOKE_HANDLER_CLASSES) {
            try {
                val clz = classLoader.loadClass(name)
                if (hookRevokeMethods(module, clz, name)) return true
            } catch (_: Throwable) {}
        }
        return false
    }

    /**
     * 在给定类中查找并 hook 撤回方法。
     * 撤回方法特征: 非静态, void返回, 参数>=2, 含 long + String。
     */
    private fun hookRevokeMethods(module: XposedModule, clz: Class<*>, className: String): Boolean {
        var hooked = 0
        for (method in clz.declaredMethods) {
            if (method.returnType != java.lang.Void.TYPE) continue
            if (Modifier.isStatic(method.modifiers)) continue
            if (method.parameterTypes.size < 2) continue

            val hasLong = method.parameterTypes.any { it == java.lang.Long.TYPE }
            val hasString = method.parameterTypes.any { it == String::class.java }

            if (hasLong && hasString) {
                try {
                    method.isAccessible = true
                    module.hook(method).intercept {
                        // hookBefore: 不调用 proceed，阻止原方法执行
                        log(module, "已阻止: $className.${method.name}")
                        null
                    }
                    log(module, "Hook: $className.${method.name}")
                    hooked++
                } catch (e: Throwable) {
                    log(module, "Hook 失败: $className.${method.name}")
                }
            }
        }
        return hooked > 0
    }

    // ========================================================================
    // 策略2: XmlParser 拦截 sysmsg
    // ========================================================================

    private fun tryHookXmlParser(module: XposedModule, classLoader: ClassLoader): Boolean {
        for (path in XML_PARSER_CLASSES) {
            try {
                val clz = classLoader.loadClass(path) ?: continue

                val parseMethod = findParseXmlMethod(clz) ?: continue
                log(module, "找到 XmlParser: $path.${parseMethod.name}")

                module.hook(parseMethod).intercept { chain ->
                    try {
                        val result = chain.proceed()
                        val args = chain.args
                        val rootTag = if (args.size >= 2) args[1] as? String else null
                        if (rootTag != "sysmsg") return@intercept result

                        @Suppress("UNCHECKED_CAST")
                        val map = result as? MutableMap<String, Any?> ?: return@intercept result
                        if (map[".sysmsg.\$type"] == "revokemsg") {
                            map[".sysmsg.\$type"] = null
                            log(module, "已拦截 sysmsg revokemsg")
                        }
                        result
                    } catch (e: Throwable) {
                        chain.proceed()
                    }
                }
                return true
            } catch (_: Throwable) {}
        }
        log(module, "XmlParser 未找到 (已尝试 ${XML_PARSER_CLASSES.size} 个候选)")
        return false
    }

    private fun findParseXmlMethod(clz: Class<*>): Method? {
        // 找 parseXml 方法: 返回 Map, 参数 >= 2
        for (m in clz.declaredMethods) {
            if (m.name != "parseXml") continue
            if (java.util.Map::class.java.isAssignableFrom(m.returnType) && m.parameterTypes.size >= 2)
                return m
        }
        // 兜底: 任意 parseXml 且参数>=2
        return clz.declaredMethods.firstOrNull { it.name == "parseXml" && it.parameterTypes.size >= 2 }
    }
}
