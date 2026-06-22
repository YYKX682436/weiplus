package com.muchen.weiplus.features

import android.util.Log
import io.github.libxposed.api.XposedModule

/**
 * 防撤回 — 默认常开。
 * 开关联动(IPC)暂时搁置，后续通过 ContentProvider 或 root su 实现。
 */
class AntiRecallFeature : BaseFeature() {

    companion object { private const val TAG = "AntiRecall" }

    override val key = "anti_recall"
    override val name = "禁止消息撤回"

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        module.log(Log.INFO, TAG, "默认常开")
        try {
            val wcdb = classLoader.loadClass("com.tencent.wcdb.database.SQLiteDatabase")
            for (m in wcdb.declaredMethods) {
                if (m.name == "update" && m.parameterTypes.size >= 4) {
                    module.hook(m).intercept { chain ->
                        try {
                            val table = chain.args.getOrNull(0)?.toString() ?: ""
                            if (!table.contains("message")) return@intercept chain.proceed()
                            for (arg in chain.args) {
                                if (arg?.javaClass?.name?.contains("ContentValues") == true) {
                                    val getAsStr = arg.javaClass.getMethod("getAsString", String::class.java)
                                    val content = getAsStr.invoke(arg, "content") as? String
                                    if (content != null && content.contains("撤回")) {
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