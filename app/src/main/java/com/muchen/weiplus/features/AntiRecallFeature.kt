package com.muchen.weiplus.features

import android.util.Log
import com.muchen.weiplus.ui.MainActivity
import io.github.libxposed.api.XposedModule
import java.lang.reflect.Field
import java.lang.reflect.Method

/**
 * 防撤回 — Hook 微信 XmlParser.parseXml 拦截 revokemsg sysmsg
 *
 * 联动: MainActivity "禁止消息撤回" 开关 -> SharedPreferences -> isEnabled() -> onEnable()
 */
class AntiRecallFeature : BaseFeature() {
    override val key = MainActivity.KEY_ANTI_RECALL
    override val name = "防撤回"
    override val description = "防止好友撤回消息"

    companion object {
        private const val TAG = "WeiPlus/AntiRecall"
        private const val REVOKE_KEY = ".sysmsg.\$type"
        private const val REVOKE_VALUE = "revokemsg"
    }

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        try {
            val xmlParserClass = findXmlParserClass(classLoader)
            if (xmlParserClass == null) {
                Log.w(TAG, "XmlParser 未找到, 尝试备选...")
                tryAlternative(module, classLoader)
                return
            }
            Log.i(TAG, "找到 XmlParser: ${xmlParserClass.name}")

            val parseMethod = findParseXmlMethod(xmlParserClass)
            if (parseMethod == null) {
                Log.w(TAG, "parseXml 方法未找到")
                return
            }
            Log.i(TAG, "找到: ${parseMethod.name}")

            module.hook(parseMethod).intercept { chain ->
                val result = chain.proceed()
                try {
                    val args = chain.args
                    if (args.size < 2) return@intercept result
                    val rootTag = args[1] as? String ?: return@intercept result
                    if (rootTag != "sysmsg") return@intercept result

                    @Suppress("UNCHECKED_CAST")
                    val resultMap = result as? MutableMap<String, Any?> ?: return@intercept result
                    if (resultMap[REVOKE_KEY] == REVOKE_VALUE) {
                        resultMap[REVOKE_KEY] = null
                        Log.i(TAG, "已阻止一条消息撤回")
                    }
                } catch (e: Throwable) {
                    Log.e(TAG, "Hook 处理异常", e)
                }
                result
            }
            Log.i(TAG, "防撤回 Hook 已激活 (XmlParser)")

        } catch (e: Throwable) {
            Log.e(TAG, "防撤回初始化失败", e)
        }
    }

    // ====== 类查找 ======

    private fun findXmlParserClass(classLoader: ClassLoader): Class<*>? {
        val known = arrayOf(
            "com.tencent.mm.sdk.platformtools.XmlParser",
            "com.tencent.mm.sdk.platformtools.ag",
        )
        for (path in known) {
            try { return classLoader.loadClass(path) } catch (_: Throwable) {}
        }
        return findClassBySimpleName(classLoader, "XmlParser")
    }

    private fun findParseXmlMethod(clz: Class<*>): Method? {
        return clz.declaredMethods.firstOrNull { m ->
            m.name == "parseXml" &&
            java.util.Map::class.java.isAssignableFrom(m.returnType) &&
            m.parameterTypes.size >= 2
        }
    }

    // ====== 备选方案: 搜索 doRevokeMsg ======

    private fun tryAlternative(module: XposedModule, classLoader: ClassLoader) {
        Log.i(TAG, "备选: 搜索 doRevokeMsg...")
        try {
            val dexElements = getDexElements(classLoader) ?: return

            for (element in dexElements) {
                val dexFileField = findField(element.javaClass, "dexFile") ?: continue
                val dexFile = dexFileField.get(element) ?: continue
                val entries = try {
                    val m = dexFile.javaClass.getDeclaredMethod("entries")
                    m.invoke(dexFile) as? java.util.Enumeration<String>
                } catch (_: Throwable) { null } ?: continue

                while (entries.hasMoreElements()) {
                    val className = entries.nextElement()
                    if (!className.startsWith("com.tencent.mm.model")) continue
                    try {
                        val clz = classLoader.loadClass(className)
                        for (field in clz.declaredFields) {
                            if (field.type != String::class.java) continue
                            field.isAccessible = true
                            val value = try { field.get(null) as? String } catch (_: Throwable) { null }
                            if (value != null && value.contains("doRevokeMsg") && value.contains("xmlSrvMsgId")) {
                                Log.i(TAG, "找到目标: ${clz.name} (via 字符串常量)")
                                // Hook 类中所有非静态 void 多参数方法
                                for (method in clz.declaredMethods) {
                                    if (method.parameterTypes.size >= 2 && method.returnType == Void.TYPE) {
                                        try {
                                            module.hook(method).intercept { chain -> null }
                                            Log.i(TAG, "备选 Hook: ${clz.simpleName}.${method.name}")
                                        } catch (_: Throwable) {}
                                    }
                                }
                                return
                            }
                        }
                    } catch (_: Throwable) {}
                }
            }
            Log.w(TAG, "备选也未找到撤回方法")
        } catch (e: Throwable) {
            Log.e(TAG, "备选异常", e)
        }
    }

    // ====== 反射工具 ======

    @Suppress("UNCHECKED_CAST")
    private fun getDexElements(classLoader: ClassLoader): Array<Any>? {
        val pathListField = findField(classLoader.javaClass, "pathList") ?: return null
        val pathList = pathListField.get(classLoader) ?: return null
        val dexElementsField = findField(pathList.javaClass, "dexElements") ?: return null
        return dexElementsField.get(pathList) as? Array<Any>
    }

    private fun findClassBySimpleName(classLoader: ClassLoader, simpleName: String): Class<*>? {
        val dexElements = getDexElements(classLoader) ?: return null
        for (element in dexElements) {
            val dexFileField = findField(element.javaClass, "dexFile") ?: continue
            val dexFile = dexFileField.get(element) ?: continue
            val entries = try {
                val m = dexFile.javaClass.getDeclaredMethod("entries")
                m.invoke(dexFile) as? java.util.Enumeration<String>
            } catch (_: Throwable) { null } ?: continue

            while (entries.hasMoreElements()) {
                val className = entries.nextElement()
                if (className.endsWith(".$simpleName")) {
                    try { return classLoader.loadClass(className) } catch (_: Throwable) {}
                }
            }
        }
        return null
    }

    private fun findField(clazz: Class<*>, fieldName: String): Field? {
        var current: Class<*>? = clazz
        while (current != null) {
            try {
                val field = current.getDeclaredField(fieldName)
                field.isAccessible = true
                return field
            } catch (_: NoSuchFieldException) {
                current = current.superclass
            }
        }
        return null
    }
}
