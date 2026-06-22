package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

/**
 * 跨进程开关 — 读取 WeiPlus 的 SharedPreferences XML。
 * 尝试双路径: /data/data/... 和 /data/user/0/...
 */
object ToggleStore {
    private val PREFS_PATHS = arrayOf(
        "/data/data/com.muchen.weiplus/shared_prefs/weiplus_prefs.xml",
        "/data/user/0/com.muchen.weiplus/shared_prefs/weiplus_prefs.xml"
    )

    fun isEnabled(): Boolean {
        for (path in PREFS_PATHS) {
            try {
                val f = java.io.File(path)
                if (f.exists()) {
                    val xml = f.readText()
                    val enabled = !xml.contains("""name="anti_recall" value="false"""")
                    return enabled
                }
            } catch (_: Throwable) {}
        }
        return true // 默认开启
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
                                    val isRecall = content != null && content.contains("撤回")
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