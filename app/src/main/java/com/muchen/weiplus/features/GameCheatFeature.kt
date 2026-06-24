package com.muchen.weiplus.features

import android.app.AlertDialog
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
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
    private var blockedArgsIdx = 0
    private var currentDialog: AlertDialog? = null
    private val gameEmojiFiles = setOf("jsb.png", "dice.png", "jsb", "dice")

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        this.classLoader = classLoader
        hookEmojiInfoIntercept(classLoader)
        hookWcdbIntercept(classLoader)
        hookAdapterViewClick(classLoader)
        hookAllGameClasses(classLoader)
        module.log(Log.INFO, TAG, "OK")
    }

    // ========= Strategy 1: EmojiInfo intercept (primary) =========

    private fun hookEmojiInfoIntercept(cl: ClassLoader) {
        val clsNames = listOf(
            "com.tencent.mm.storage.emotion.EmojiInfo",
            "com.tencent.mm.plugin.emoji.model.EmojiInfo",
        )
        for (cn in clsNames) {
            try {
                val cls = cl.loadClass(cn)
                for (m in cls.declaredMethods) {
                    val mn = m.name.lowercase()
                    val isTarget = mn in listOf("setcontent", "getcontent", "getxmldata",
                        "setxmldata", "toxml", "getgamecontent", "setgamecontent",
                        "getgameresult", "setgameresult")
                    val hasStringParam = m.parameterTypes.any { it == String::class.java }
                    val hasStringReturn = m.returnType == String::class.java
                    if (isTarget || (hasStringParam && m.parameterTypes.size <= 2) || hasStringReturn) {
                        module.hook(m).intercept { chain ->
                            if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                            val result = chain.proceed()
                            val resStr = result as? String ?: ""
                            if (resStr.isNotEmpty() && isGameEmoji(resStr)) {
                                module.log(Log.INFO, TAG, "EI.${m.name} GAME: ${resStr.take(120)}")
                                blockedChain = chain; blockedContent = resStr
                                blockedGameType = if (resStr.lowercase().contains("dice") || resStr.lowercase().contains("gameext")) 2 else 1
                                mainHandler.post { showPicker() }
                                return@intercept resStr
                            }
                            for (i in chain.args.indices) {
                                val ar = chain.args[i]
                                if (ar is String && isGameEmoji(ar)) {
                                    module.log(Log.INFO, TAG, "EI.${m.name} ARG GAME: ${ar.take(120)}")
                                    blockedChain = chain; blockedContent = ar; blockedArgsIdx = i
                                    blockedGameType = if (ar.lowercase().contains("dice") || ar.lowercase().contains("gameext")) 2 else 1
                                    mainHandler.post { showPicker() }
                                    return@intercept null
                                }
                            }
                            result
                        }
                        module.log(Log.INFO, TAG, "EI.${m.name} hooked")
                    }
                }
            } catch (e: Throwable) { module.log(Log.DEBUG, TAG, "EI skip $cn: ${e.message}") }
        }
    }

    // ========= Strategy 2: WCDB intercept (fallback 1) =========

    private fun hookWcdbIntercept(cl: ClassLoader) {
        try {
            val wcdb = cl.loadClass("com.tencent.wcdb.database.SQLiteDatabase")
            for (m in wcdb.declaredMethods) {
                if ((m.name == "insert" || m.name == "replace") && m.parameterTypes.size >= 3) {
                    module.hook(m).intercept { chain ->
                        if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                        try {
                            val table = chain.args.getOrNull(0)?.toString() ?: ""
                            if (!table.contains("message", ignoreCase = true)) return@intercept chain.proceed()
                            for (arg in chain.args) {
                                if (arg?.javaClass?.name?.contains("ContentValues") == true) {
                                    val getStr = arg.javaClass.getMethod("getAsString", String::class.java)
                                    val content = getStr.invoke(arg, "content") as? String ?: continue
                                    if (isGameEmoji(content)) {
                                        val getAsInt = arg.javaClass.getMethod("getAsInteger", String::class.java)
                                        val type = try { (getAsInt.invoke(arg, "type") as? Number)?.toInt() } catch (_: Throwable) { -1 }
                                        module.log(Log.INFO, TAG, "WCDB GAME type=$type content=${content.take(120)}")
                                        blockedArgsIdx = 1; setupBlock(chain, content)
                                        return@intercept null
                                    }
                                    val getAsInt = arg.javaClass.getMethod("getAsInteger", String::class.java)
                                    val type = try { (getAsInt.invoke(arg, "type") as? Number)?.toInt() } catch (_: Throwable) { null }
                                    if (type != null && type != 0 && type != 1) {
                                        module.log(Log.INFO, TAG, "MSG t=$type: cnt=${getStr.invoke(arg, "content")?.toString()?.take(80)}")
                                    }
                                }
                            }
                        } catch (_: Throwable) {}
                        chain.proceed()
                    }
                    module.log(Log.INFO, TAG, "WCDB hooked")
                    return
                }
            }
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "WCDB: ${e.message}") }
    }

    // ========= Strategy 3: AdapterView click (fallback 2) =========

    private fun hookAdapterViewClick(cl: ClassLoader) {
        try {
            val av = cl.loadClass("android.widget.AdapterView")
            val m = av.getDeclaredMethod("performItemClick", View::class.java, Integer.TYPE, java.lang.Long.TYPE)
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val ao = chain.thisObject
                val cn = ao.javaClass.name
                val lc = cn.lowercase()
                if (lc.contains("emoji") || lc.contains("sticker") || lc.contains("smiley")) {
                    val pos = chain.args[1] as Int
                    try {
                        val ad = ao.javaClass.getMethod("getAdapter").invoke(ao)
                        val item = ad?.javaClass?.getMethod("getItem", Integer.TYPE)?.invoke(ad, pos)
                        val its = item?.toString() ?: ""
                        module.log(Log.INFO, TAG, "ADAPTER $cn pos=$pos item=${its.take(200)}")
                        if (isGameEmoji(its) || gameEmojiFiles.any { its.lowercase().contains(it) }) {
                            module.log(Log.INFO, TAG, "ADAPTER GAME: ${its.take(200)}")
                            blockedChain = chain; blockedContent = its; blockedArgsIdx = 1
                            blockedGameType = if (its.lowercase().contains("dice")) 2 else 1
                            mainHandler.post { showPicker() }
                            return@intercept null
                        }
                    } catch (e: Throwable) { module.log(Log.DEBUG, TAG, "ADAPTER err: ${e.message}") }
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "AdapterView hooked")
        } catch (e: Throwable) { module.log(Log.ERROR, TAG, "AdapterView: ${e.message}") }
    }

    // ========= Strategy 4: Diagnostic hooks (from v8) =========

    private fun hookAllGameClasses(cl: ClassLoader) {
        val targets = listOf(
            "com.tencent.mm.plugin.game.luggage",
            "com.tencent.mm.plugin.game.download.GameResourceDownloadProvider",
            "com.tencent.mm.plugin.game.ui.GameMessageUI",
            "com.tencent.mm.plugin.game.luggage.c",
            "com.tencent.mm.plugin.game.luggage.d",
            "com.tencent.mm.plugin.game.luggage.e",
            "com.tencent.mm.plugin.emoji.b.d",
            "com.tencent.mm.storage.emotion.EmojiInfo",
            "com.tencent.mm.plugin.emoji.model.EmojiInfo",
            "com.tencent.mm.message.AppMessage",
        )
        for (cn in targets) {
            try {
                val cls = cl.loadClass(cn)
                for (m in cls.declaredMethods) {
                    if (m.parameterTypes.size in 0..6) {
                        module.hook(m).intercept { chain ->
                            if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                            val sb = StringBuilder()
                            for (i in chain.args.indices) {
                                val a = chain.args[i]
                                val s = if (a is String) a.take(80) else a?.toString()?.take(40) ?: "null"
                                if (s != "null" && s.isNotEmpty()) sb.append("a$i=$s | ")
                            }
                            val result = chain.proceed()
                            if (result is String && result.length > 5) sb.append("ret=${result.take(120)}")
                            if (sb.isNotEmpty()) module.log(Log.INFO, TAG, "$cn.${m.name}: $sb")
                            result
                        }
                    }
                }
                module.log(Log.INFO, TAG, "$cn hooked")
            } catch (_: Throwable) {}
        }
    }

    // ========= Core logic =========

    private fun isGameEmoji(c: String): Boolean {
        if (c.length < 30) return false
        val lc = c.lowercase()
        return (lc.contains("<emoji") || lc.contains("<gameext") || lc.contains("gamecontent")) &&
               (lc.contains("<msg") || lc.contains("fromusername") || lc.contains("tousername") || lc.contains("<emotion"))
    }

    private fun setupBlock(chain: Any, content: String) {
        blockedChain = chain; blockedContent = content
        blockedGameType = if (content.lowercase().contains("dice") || content.lowercase().contains("gameext")) 2 else 1
        mainHandler.post { showPicker() }
    }

    private fun showPicker() {
        val ctx = tryGetActivity()
        if (ctx == null) {
            module.log(Log.WARN, TAG, "no activity, bypass")
            proceedBlocked()
            return
        }
        val gt = blockedGameType
        val title = if (gt == 2) "选择骰子点数" else "选择猜拳结果"
        val items = if (gt == 2)
            arrayOf("⚀ 1", "⚁ 2", "⚂ 3", "⚃ 4", "⚄ 5", "⚅ 6")
        else
            arrayOf("✊ 石头", "✌️ 剪刀", "🖐 布")

        currentDialog = AlertDialog.Builder(ctx)
            .setTitle(title)
            .setItems(items) { _, which ->
                val chosen = if (gt == 1)
                    when (which) { 0 -> 2; 1 -> 1; 2 -> 0; else -> 0 }
                else which + 1
                module.log(Log.INFO, TAG, "Chose: gt=$gt idx=$which val=$chosen")
                replaceContent(chosen, gt)
            }
            .setOnCancelListener { proceedBlocked() }
            .create()
        try {
            currentDialog?.window?.setType(android.view.WindowManager.LayoutParams.TYPE_APPLICATION)
        } catch (_: Throwable) {}
        currentDialog?.show()
        module.log(Log.INFO, TAG, "Dialog shown: gt=$gt")
    }

    private fun replaceContent(chosen: Int, gameType: Int) {
        try {
            val chain = blockedChain ?: run { proceedBlocked(); return }
            val c = blockedContent ?: run { proceedBlocked(); return }

            val newContent = if (gameType == 2) {
                c.replace(Regex("(content|type)=" + dq + "\\d+" + dq, RegexOption.IGNORE_CASE),
                    "content=" + dq + chosen + dq)
            } else {
                c.replace(Regex("type=" + dq + "\\d+" + dq, RegexOption.IGNORE_CASE),
                    "type=" + dq + chosen + dq)
            }

            module.log(Log.INFO, TAG, "Cheat: gt=$gameType v=$chosen old=${c.take(80)} new=${newContent.take(80)}")

            try {
                val af = chain.javaClass.getDeclaredField("args"); af.isAccessible = true
                val args = af.get(chain) as Array<Any?>
                var idx = blockedArgsIdx
                if (idx >= args.size) idx = 0
                if (args.isNotEmpty() && args[0] is String && isGameEmoji(args[0] as String)) idx = 0
                args[idx] = newContent
            } catch (_: Throwable) {}
            chain.javaClass.getMethod("proceed").invoke(chain)
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "replace err: ${e.message}")
            proceedBlocked()
        } finally {
            blockedChain = null; blockedContent = null
            currentDialog?.dismiss(); currentDialog = null
        }
    }

    private fun proceedBlocked() {
        try { blockedChain?.javaClass?.getMethod("proceed")?.invoke(blockedChain) } catch (_: Throwable) {}
        blockedChain = null; blockedContent = null
        currentDialog?.dismiss(); currentDialog = null
    }

    private fun tryGetActivity(): android.app.Activity? {
        return try {
            val c = Class.forName("android.app.ActivityThread")
            val am = c.getDeclaredMethod("currentActivityThread").invoke(null)
            val f = c.getDeclaredField("mActivities"); f.isAccessible = true
            @Suppress("UNCHECKED_CAST")
            val acts = f.get(am) as? Map<Any, Any>
            if (acts != null) for (rec in acts.values) {
                try {
                    val af = rec.javaClass.getDeclaredField("activity"); af.isAccessible = true
                    val a = af.get(rec)
                    if (a is android.app.Activity && !a.isFinishing) return a
                } catch (_: Throwable) {}
            }
            null
        } catch (_: Throwable) { null }
    }
}