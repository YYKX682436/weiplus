package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
import io.github.libxposed.api.XposedModule

class GameCheatFeature : BaseFeature() {

    companion object { private const val TAG = "GameCheat" }
    override val key = "game_cheat"
    override val name = "Game Cheat"

    private val dq = "\""
    private lateinit var module: XposedModule
    private var classLoader: ClassLoader? = null
    private val mainHandler = Handler(Looper.getMainLooper())
    private var blockedChain: Any? = null
    private var blockedContent: String? = null
    private var blockedGameType = 0

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        hookWcdbDiagnostic(classLoader)
        hookChatFooter(classLoader)
        hookEmojiInfo(classLoader)
        module.log(Log.INFO, TAG, "OK")
    }

    private fun hookWcdbDiagnostic(cl: ClassLoader) {
        try {
            val wcdb = cl.loadClass("com.tencent.wcdb.database.SQLiteDatabase")
            var hooked = false
            for (m in wcdb.declaredMethods) {
                if ((m.name == "insert" || m.name == "replace") && m.parameterTypes.size >= 3) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        try {
                            val table = chain.args.getOrNull(0)?.toString() ?: ""
                            if (!table.contains("message", ignoreCase = true)) return@intercept chain.proceed()
                            for (arg in chain.args) {
                                if (arg?.javaClass?.name?.contains("ContentValues") == true) {
                                    // Dump all keys and values
                                    val keySet = arg.javaClass.getMethod("keySet").invoke(arg) as? Set<*> ?: continue
                                    val getAsStr = arg.javaClass.getMethod("getAsString", String::class.java)
                                    val getAsLong = arg.javaClass.getMethod("getAsLong", String::class.java)
                                    val getAsInt = arg.javaClass.getMethod("getAsInteger", String::class.java)
                                    val msgId = try { getAsLong.invoke(arg, "msgId") } catch (_: Throwable) { null }
                                    val type = try { getAsInt.invoke(arg, "type") } catch (_: Throwable) { null }
                                    val content = try { getAsStr.invoke(arg, "content") as? String } catch (_: Throwable) { null }
                                    val isSend = try { getAsInt.invoke(arg, "isSend") } catch (_: Throwable) { null }
                                    
                                    // Check if this is a game emoji message by type
                                    if (type != null) {
                                        if (type.toString() == "47") {
                                            try {
                                                val keys = arg.javaClass.getMethod("keySet").invoke(arg) as? Set<*>
                                                val gs = arg.javaClass.getMethod("getAsString", String::class.java)
                                                val sb = StringBuilder("DUMP47: ")
                                                for (kk in (keys ?: emptySet<Any>())) {
                                                    try { sb.append("$kk=${gs.invoke(arg, kk)?.toString()?.take(60)} | ") } catch (_: Throwable) {}
                                                }
                                                module.log(Log.INFO, TAG, sb.toString())
                                            } catch (_: Throwable) {}
                                        }
                                    }
                                }
                            }
                        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "dump err: ${e.message}") }
                        chain.proceed()
                    }
                    hooked = true
                    module.log(Log.INFO, TAG, "WCDB.${m.name} hooked")
                    break
                }
            }
            if (!hooked) module.log(Log.WARN, TAG, "WCDB no method")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "WCDB: ${e.message}") }
    }

    private fun hookChatFooter(cl: ClassLoader) {
        try {
            val cf = cl.loadClass("com.tencent.mm.pluginsdk.ui.chat.ChatFooter")
            for (m in cf.declaredMethods) {
                if (m.parameterTypes.size in 0..5) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        for (i in chain.args.indices) {
                            val a = chain.args[i]
                            if (a is String && a.length > 10) {
                                val lc = a.lowercase()
                                if (lc.contains("emoji") || lc.contains("game") || lc.contains("xml") || lc.contains("dice")) {
                                    module.log(Log.INFO, TAG, "CF.${m.name}: ${a.take(200)}")
                                }
                            }
                        }
                        chain.proceed()
                    }
                }
            }
            module.log(Log.INFO, TAG, "CF hooked")
        } catch (_: Throwable) {}
    }

    private fun hookEmojiInfo(cl: ClassLoader) {
        try {
            val sei = cl.loadClass("com.tencent.mm.storage.emotion.EmojiInfo")
            for (m in sei.declaredMethods) {
                if (m.parameterTypes.size == 1 && m.parameterTypes[0] == String::class.java) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        val c = chain.args[0] as String
                        if (c.length > 10) {
                            val lc = c.lowercase()
                            if (lc.contains("emoji") || lc.contains("game") || lc.contains("dice") || lc.contains("<msg")) {
                                module.log(Log.INFO, TAG, "SEI: ${c.take(250)}")
                            }
                        }
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "SEI hooked")
                    return
                }
            }
        } catch (_: Throwable) {}
    }

    private fun showPicker() {
        val ctx = tryGetActivity() ?: run { proceedBlocked(); return }
        val gt = blockedGameType
        val title = if (gt == 2) "Pick Dice" else "Pick RPS"
        val items = if (gt == 2) arrayOf("1","2","3","4","5","6") else arrayOf("Rock","Scissors","Paper")
        AlertDialog.Builder(ctx).setTitle(title).setItems(items) { _, which ->
            val chosen = if (gt == 2) which + 1 else when (which) { 0 -> 2; 1 -> 1; 2 -> 0; else -> 0 }
            replaceContent(chosen, gt)
        }.setOnCancelListener { proceedBlocked() }.show()
    }

    private fun replaceContent(chosen: Int, gameType: Int) {
        try {
            val chain = blockedChain ?: return
            val c = blockedContent ?: return
            val newContent = if (gameType == 2)
                c.replace(Regex("content=${dq}\\d+${dq}"), "content=${dq}${chosen}${dq}")
            else
                c.replace(Regex("type=${dq}\\d+${dq}"), "type=${dq}${chosen}${dq}")
            try {
                val af = chain.javaClass.getDeclaredField("args"); af.isAccessible = true
                (af.get(chain) as Array<Any?>)[0] = newContent
                chain.javaClass.getMethod("proceed").invoke(chain)
            } catch (_: Throwable) { chain.javaClass.getMethod("proceed").invoke(chain) }
            module.log(Log.INFO, TAG, "Cheat: t=$gameType v=$chosen")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "replace: ${e.message}"); proceedBlocked() }
        finally { blockedChain = null; blockedContent = null }
    }

    private fun proceedBlocked() {
        try { blockedChain?.javaClass?.getMethod("proceed")?.invoke(blockedChain) } catch (_: Throwable) {}
        blockedChain = null; blockedContent = null
    }

    private fun tryGetActivity(): android.app.Activity? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            val f = c.getDeclaredField("mActivities"); f.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val acts = f.get(am) as? Map<Any, Any>
            if (acts != null) for (rec in acts.values) {
                val af = rec.javaClass.getDeclaredField("activity"); af.isAccessible = true
                val a = af.get(rec)
                if (a is android.app.Activity && !a.isFinishing) return a
            }
            null
        } catch (_: Throwable) { null }
    }
}