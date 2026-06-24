package com.muchen.weiplus.features

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import io.github.libxposed.api.XposedModule
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger

class GameCheatFeature : BaseFeature() {

    companion object { private const val TAG = "DiceCheat" }
    override val key = "game_cheat"
    override val name = "猜拳骰子作弊"

    private lateinit var module: XposedModule
    private val mainHandler = Handler(Looper.getMainLooper())

    // Click block state
    private var blockedChain: Any? = null
    private var gameType = 0 // 1=猜拳, 2=骰子

    // Random interception: set before click proceeds, consumed by Random.nextInt hook
    @Volatile private var expectGameRand = false
    private val presetRandVal = AtomicInteger(-1)

    override fun onEnable(module: XposedModule, classLoader: ClassLoader) {
        this.module = module
        hookViewClick()
        hookRandomNextInt()
        module.log(Log.INFO, TAG, "猜拳骰子作弊 V")
    }

    // ==================== View click hook ====================

    private fun hookViewClick() {
        try {
            val m = View::class.java.getDeclaredMethod("performClick")
            module.hook(m).intercept { chain ->
                if (!FeatureConfig.gameCheat) return@intercept chain.proceed()
                val v = chain.thisObject as? View ?: return@intercept chain.proceed()
                if (isGameEmojiView(v)) {
                    blockedChain = chain
                    expectGameRand = true
                    presetRandVal.set(-1)
                    mainHandler.post { showGameOverlay(v) }
                    return@intercept null
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "View.click V")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "View.click X: ${e.message}")
        }
    }

    private fun isGameEmojiView(view: View): Boolean {
        try {
            var p: Any? = view.parent
            while (p != null) {
                val cn = p.javaClass.name.lowercase()
                if (cn.contains("emoji") || cn.contains("sticker") || cn.contains("smiley") || cn.contains("expression")) {
                    val desc = view.contentDescription?.toString()?.lowercase() ?: ""
                    val tag = view.tag?.toString()?.lowercase() ?: ""
                    module.log(Log.INFO, TAG, "EMOJI view=${view.javaClass.simpleName} desc=[$desc] tag=[$tag] parent=${p.javaClass.simpleName}")

                    if (desc.contains("dice") || desc.contains("骰") || tag.contains("dice") || tag.contains("骰")) { gameType = 2; return true }
                    if (desc.contains("jsb") || desc.contains("猜拳") || desc.contains("mora") || tag.contains("jsb") || tag.contains("猜拳") || tag.contains("mora") || tag.contains("game")) { gameType = 1; return true }

                    val item = tryGetAdapterItem(p, view)
                    if (item != null) {
                        val s = item.lowercase()
                        if (s.contains("dice") || s.contains("骰")) { gameType = 2; return true }
                        if (s.contains("jsb") || s.contains("猜拳") || s.contains("mora") || s.contains("game")) { gameType = 1; return true }
                    }
                    break
                }
                p = (p as? ViewGroup)?.parent
            }
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "check err: ${e.message}")
        }
        return false
    }

    private fun tryGetAdapterItem(recycler: Any, child: View): String? {
        try {
            var c: Class<*>? = recycler.javaClass
            var gvh: java.lang.reflect.Method? = null
            while (c != null) {
                for (m in c.declaredMethods) {
                    if ((m.name == "getChildViewHolder" || m.name == "findContainingViewHolder") && m.parameterTypes.size == 1) { gvh = m; break }
                }
                if (gvh != null) break; c = c.superclass
            }
            val holder = gvh?.invoke(recycler, child) ?: return null

            var pos = -1
            c = holder.javaClass
            while (c != null) {
                for (m in c.declaredMethods) {
                    if ((m.name == "getAdapterPosition" || m.name == "getPosition" || m.name == "getLayoutPosition") && m.parameterTypes.isEmpty()) {
                        pos = m.invoke(holder) as? Int ?: -1; break
                    }
                }
                if (pos >= 0) break; c = c.superclass
            }
            if (pos < 0) return null

            var ga: java.lang.reflect.Method? = null
            c = recycler.javaClass
            while (c != null) {
                for (m in c.declaredMethods) {
                    if (m.name == "getAdapter" && m.parameterTypes.isEmpty()) { ga = m; break }
                }
                if (ga != null) break; c = c.superclass
            }
            val adapter = ga?.invoke(recycler) ?: return null

            c = adapter.javaClass
            while (c != null) {
                for (m in c.declaredMethods) {
                    if ((m.name == "getItem" || m.name == "get") && m.parameterTypes.size == 1) {
                        try { return m.invoke(adapter, pos)?.toString() } catch (_: Throwable) {}
                    }
                }
                c = c.superclass
            }
        } catch (e: Throwable) {
            module.log(Log.WARN, TAG, "adapter: ${e.message}")
        }
        return null
    }

    // ==================== Random.nextInt hook ====================

    private fun hookRandomNextInt() {
        try {
            val m = Random::class.java.getDeclaredMethod("nextInt", java.lang.Integer.TYPE)
            module.hook(m).intercept { chain ->
                val bound = chain.args[0] as Int
                if (expectGameRand && (bound == 3 || bound == 6)) {
                    expectGameRand = false
                    val preset = presetRandVal.getAndSet(-1)
                    if (preset >= 0) {
                        module.log(Log.INFO, TAG, "RAND -> preset=$preset (bound=$bound)")
                        return@intercept preset
                    }
                    module.log(Log.INFO, TAG, "RAND no preset, pass through")
                }
                chain.proceed()
            }
            module.log(Log.INFO, TAG, "Random.nextInt V")
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "Random.nextInt X: ${e.message}")
        }
    }

    // ==================== Overlay UI ====================

    private fun showGameOverlay(clickedView: View) {
        try {
            val activity = getActivity(clickedView.context) ?: run { proceedBlocked(); return }
            val root = activity.window.decorView.findViewById<ViewGroup>(android.R.id.content) ?: run { proceedBlocked(); return }
            val d = activity.resources.displayMetrics.density

            val overlay = FrameLayout(activity).apply {
                tag = "weiplus_game_cheat"
                setBackgroundColor(Color.argb(120, 0, 0, 0))
                setOnClickListener { root.removeView(this); proceedBlocked() }
            }

            val panel = LinearLayout(activity).apply {
                orientation = LinearLayout.VERTICAL
                background = GradientDrawable().apply {
                    cornerRadius = 16f * d
                    setColor(Color.argb(0xF0, 0x1C, 0x1C, 0x1E))
                }
                setPadding((32 * d).toInt(), (24 * d).toInt(), (32 * d).toInt(), (24 * d).toInt())
                elevation = 20f * d
            }

            val title = if (gameType == 2) "选择骰子点数" else "选择猜拳结果"
            panel.addView(TextView(activity).apply {
                text = title; setTextColor(Color.WHITE); textSize = 17f
                gravity = Gravity.CENTER; setPadding(0, 0, 0, (20 * d).toInt())
            })

            val items = if (gameType == 2)
                listOf("1点", "2点", "3点", "4点", "5点", "6点")
            else
                listOf("石头", "剪刀", "布")

            for ((idx, label) in items.withIndex()) {
                panel.addView(TextView(activity).apply {
                    text = label; setTextColor(Color.WHITE); textSize = 16f
                    setPadding(0, (10 * d).toInt(), 0, (10 * d).toInt())
                    setOnClickListener {
                        presetRandVal.set(idx)
                        root.removeView(overlay)
                        module.log(Log.INFO, TAG, "CHOSE type=$gameType idx=$idx")
                        proceedBlocked()
                    }
                })
            }

            panel.addView(TextView(activity).apply {
                text = "取消"; setTextColor(Color.argb(0xFF, 0x4A, 0x9E, 0xFF)); textSize = 14f
                gravity = Gravity.CENTER; setPadding(0, (16 * d).toInt(), 0, 0)
                setOnClickListener { root.removeView(overlay); proceedBlocked() }
            })

            val panelLp = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT).apply { gravity = Gravity.CENTER }
            overlay.addView(panel, panelLp)
            root.addView(overlay, FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT))
        } catch (e: Throwable) {
            module.log(Log.ERROR, TAG, "OVERLAY X: ${e.message}")
            proceedBlocked()
        }
    }

    private fun proceedBlocked() {
        val chain = blockedChain ?: return
        try { chain.javaClass.getMethod("proceed").invoke(chain) } catch (e: Throwable) {}
        blockedChain = null
    }

    private fun getActivity(ctx: Context): Activity? {
        var c: Context? = ctx
        while (c != null) {
            if (c is Activity) return c
            c = if (c is android.content.ContextWrapper) c.baseContext else null
        }
        return null
    }
}
