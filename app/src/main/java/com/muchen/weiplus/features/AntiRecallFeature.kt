package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

/**
 * 跨进程开关 — 直接读取 WeiPlus 的 SharedPreferences XML 文件。
 * 微信进程 (root 权限) 可读 /data/data/com.muchen.weiplus/shared_prefs/weiplus_prefs.xml
 * WeiPlus 面板通过标准 SharedPreferences API 写入该文件。
 */
object ToggleStore {
    private val PREFS_XML = "/data/data/com.muchen.weiplus/shared_prefs/weiplus_prefs.xml"

    fun isEnabled(): Boolean {
        return try {
            val f = java.io.File(PREFS_XML)
            if (!f.exists()) return true // 默认开启
            val xml = f.readText()
            // 查找 name="anti_recall" value="false" — 只有明确设为 false 才关闭
            !xml.contains("""name="anti_recall" value="false"""")
        } catch (_: Throwable) { true }
    }

    fun setEnabled(enabled: Boolean) {
        // 由 WeiPlus 面板的 SharedPreferences 负责写入，这里不需要操作
    }

    fun toggle(): Boolean {
        val new = !isEnabled()
        setEnabled(new)
        return new
    }
}

class AntiRecallFeature : BaseFeature() {

    companion object { private const val TAG = "AntiRecall" }

    override val key = "anti_recall"
    override val name = "禁止消息撤回"

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        val enabled = ToggleStore.isEnabled()
        module.log(Log.INFO, TAG, "初始状态: ${if (enabled) "开启" else "关闭"}")
        try {
            val wcdb = classLoader.loadClass("com.tencent.wcdb.database.SQLiteDatabase")
            for (m in wcdb.declaredMethods) {
                if (m.name == "update" && m.parameterTypes.size >= 4) {
                    module.hook(m).intercept { chain ->
                        if (!ToggleStore.isEnabled()) return@intercept chain.proceed()
                        try {
                            val table = chain.args.getOrNull(0)?.toString() ?: ""
                            if (!table.contains("message")) return@intercept chain.proceed()
                            for (arg in chain.args) {
                                if (arg?.javaClass?.name?.contains("ContentValues") == true) {
                                    val getAsStr = arg.javaClass.getMethod("getAsString", String::class.java)
                                    val content = getAsStr.invoke(arg, "content") as? String
                                    val type = try { getAsStr.invoke(arg, "type") as? String } catch (_: Throwable) { null }
                                    val isRecall = (content != null && content.contains("撤回")) ||
                                                   (type != null && type.contains("10000"))
                                    if (isRecall) {
                                        module.log(Log.INFO, TAG, "拦截撤回更新")
                                        return@intercept 0
                                    }
                                }
                            }
                        } catch (_: Throwable) {}
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "WCDB Hook 已安装")
                    return
                }
            }
            module.log(Log.WARN, TAG, "未找到 WCDB update 方法")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Hook 失败", e)
        }
    }
}