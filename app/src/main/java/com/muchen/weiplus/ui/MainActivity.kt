package com.muchen.weiplus.ui

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewConfiguration
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.widget.*

class MainActivity : Activity() {

    private var antiRecall = false
    private var chatEnhance = false
    private var automation = false
    private var timedTask = false
    private var momentEnhance = false
    private var cleaner = false

    private lateinit var prefs: android.content.SharedPreferences

    // 下拉手势
    private var panel: LinearLayout? = null
    private var dragStartY = 0f
    private var panelStartTY = 0f
    private var isDragging = false
    private var touchInPanel = false
    private val touchSlop by lazy { ViewConfiguration.get(this).scaledTouchSlop }

    companion object {
        const val PREF_NAME = "weiplus_prefs"
        const val KEY_ANTI_RECALL = "anti_recall"
        const val KEY_CHAT_ENHANCE = "chat_enhance"
        const val KEY_AUTOMATION = "automation"
        const val KEY_TIMED_TASK = "timed_task"
        const val KEY_MOMENT_ENHANCE = "moment_enhance"
        const val KEY_CLEANER = "cleaner"

        fun isFeatureEnabled(ctx: Context, key: String): Boolean {
            return ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getBoolean(key, false)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        val p = panel ?: return super.dispatchTouchEvent(ev)
        when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
                val loc = IntArray(2)
                p.getLocationOnScreen(loc)
                touchInPanel = ev.rawY >= loc[1]
                if (touchInPanel) {
                    dragStartY = ev.rawY
                    panelStartTY = p.translationY
                    isDragging = false
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (touchInPanel) {
                    val dy = ev.rawY - dragStartY
                    if (!isDragging && dy > touchSlop) {
                        isDragging = true
                    }
                    if (isDragging) {
                        p.translationY = (panelStartTY + dy).coerceAtLeast(0f)
                        val progress = (p.translationY / (p.height * 0.6f)).coerceIn(0f, 1f)
                        p.alpha = 1f - progress * 0.5f
                        return true
                    }
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (isDragging) {
                    isDragging = false
                    touchInPanel = false
                    val threshold = p.height * 0.22f
                    if (p.translationY > threshold) {
                        p.animate().translationY(p.height.toFloat()).alpha(0f)
                            .setDuration(220).setInterpolator(DecelerateInterpolator())
                            .withEndAction { finish() }.start()
                    } else {
                        p.animate().translationY(0f).alpha(1f)
                            .setDuration(200).setInterpolator(DecelerateInterpolator()).start()
                    }
                    return true
                }
                touchInPanel = false
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        prefs = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        loadPrefs()

        window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            decorView.setBackgroundColor(Color.TRANSPARENT)
            decorView.setOnClickListener { v -> if (v == decorView) finish() }
        }
        setContentView(buildUI())
    }

    override fun onPause() { super.onPause(); savePrefs() }

    private fun loadPrefs() {
        antiRecall = prefs.getBoolean(KEY_ANTI_RECALL, false)
        chatEnhance = prefs.getBoolean(KEY_CHAT_ENHANCE, false)
        automation = prefs.getBoolean(KEY_AUTOMATION, false)
        timedTask = prefs.getBoolean(KEY_TIMED_TASK, false)
        momentEnhance = prefs.getBoolean(KEY_MOMENT_ENHANCE, false)
        cleaner = prefs.getBoolean(KEY_CLEANER, false)
    }

    private fun savePrefs() {
        prefs.edit()
            .putBoolean(KEY_ANTI_RECALL, antiRecall)
            .putBoolean(KEY_CHAT_ENHANCE, chatEnhance)
            .putBoolean(KEY_AUTOMATION, automation)
            .putBoolean(KEY_TIMED_TASK, timedTask)
            .putBoolean(KEY_MOMENT_ENHANCE, momentEnhance)
            .putBoolean(KEY_CLEANER, cleaner)
            .apply()
    }

    private fun buildUI(): FrameLayout {
        val root = FrameLayout(this)
        root.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        panel = LinearLayout(this)
        panel!!.orientation = LinearLayout.VERTICAL
        panel!!.setPadding(0, 0, 0, dip(36))

        // iOS 液态玻璃面板：低不透明度白底 + 白微边框 + 柔和投影
        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(20), dpf(20), dpf(20), dpf(20), 0f, 0f, 0f, 0f)
        bg.setColor(Color.argb(0x99, 0xF2, 0xF3, 0xF7))
        // 极淡半透明白色描边
        bg.setStroke(dip(1), Color.argb(0x18, 0xFF, 0xFF, 0xFF))
        panel!!.background = bg
        // 柔和投影
        panel!!.elevation = dpf(12)

        val handle = View(this)
        handle.setBackgroundColor(Color.argb(0x35, 0x00, 0x00, 0x00))
        val hl = LinearLayout.LayoutParams(dip(36), dip(4))
        hl.gravity = Gravity.CENTER_HORIZONTAL
        hl.topMargin = dip(10); hl.bottomMargin = dip(10)
        panel!!.addView(handle, hl)

        panel!!.addView(titleBar())
        panel!!.addView(space(8))

        val scroll = ScrollView(this)
        val content = LinearLayout(this)
        content.orientation = LinearLayout.VERTICAL
        content.setPadding(0, 0, 0, dip(8))

        content.addView(featureCard("\uD83D\uDCAC", "聊天增强", "防撤回 · 多选转发 · 长截图") {
            addView(bigToggle("防撤回", "阻止好友撤回消息", { antiRecall }, { antiRecall = it }))
            addView(thinDivider())
            addView(bigToggle("聊天增强", "多选转发、长截图", { chatEnhance }, { chatEnhance = it }))
        })

        content.addView(featureCard("\u26A1", "自动化", "定时消息 · 自动回复 · 定时朋友圈") {
            addView(bigToggle("自动任务", "定时消息、自动回复", { automation }, { automation = it }))
            addView(thinDivider())
            addView(bigToggle("定时任务", "定时发送消息、朋友圈", { timedTask }, { timedTask = it }))
        })

        content.addView(featureCard("\uD83D\uDC63", "朋友圈", "去广告 · 强制深色 · 长按保存") {
            addView(bigToggle("朋友圈增强", "去广告、强制深色模式", { momentEnhance }, { momentEnhance = it }))
            addView(thinDivider())
            addView(bigToggle("清理工具", "缓存清理、文件管理", { cleaner }, { cleaner = it }))
        })

        scroll.addView(content)
        panel!!.addView(scroll, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

        // 入场动画
        panel!!.post {
            panel!!.translationY = panel!!.height.toFloat() * 0.3f
            panel!!.alpha = 0f
            panel!!.animate()
                .translationY(0f)
                .alpha(1f)
                .setDuration(300)
                .setInterpolator(DecelerateInterpolator())
                .start()
        }

        val lp = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.gravity = Gravity.BOTTOM
        root.addView(panel!!, lp)
        root.setOnClickListener {}
        return root
    }

    // === 组件 ===

    private fun titleBar(): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(20), dip(8), dip(20), dip(2))
        row.gravity = Gravity.CENTER_VERTICAL
        val tv = TextView(this)
        tv.text = "微+"; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E)); tv.textSize = 26f
        row.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val badge = TextView(this)
        badge.text = "微信增强"; badge.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        badge.textSize = 12f; badge.setPadding(dip(10), dip(3), dip(10), dip(4))
        badge.background = GradientDrawable().apply { cornerRadius = dpf(10); setColor(Color.argb(0x20, 0x00, 0x00, 0x00)) }
        row.addView(badge)
        return row
    }

    private fun featureCard(emoji: String, title: String, subtitle: String, content: LinearLayout.() -> Unit): LinearLayout {
        val card = LinearLayout(this)
        card.orientation = LinearLayout.VERTICAL
        val m = dip(14)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.setMargins(m, dip(6), m, dip(6))
        card.layoutParams = lp
        val cardBg = GradientDrawable()
        cardBg.cornerRadius = dpf(14)
        // 卡片：玻璃白底，保持可读性
        cardBg.setColor(Color.argb(0xCC, 0xFF, 0xFF, 0xFF))
        cardBg.setStroke(dip(1), Color.argb(0x12, 0xFF, 0xFF, 0xFF))
        card.background = cardBg
        card.elevation = dpf(1)

        val header = LinearLayout(this)
        header.orientation = LinearLayout.HORIZONTAL
        header.setPadding(dip(16), dip(12), dip(16), dip(12))
        header.gravity = Gravity.CENTER_VERTICAL
        header.isClickable = true
        header.isFocusable = true

        val icon = TextView(this)
        icon.text = emoji; icon.textSize = 20f; icon.setPadding(0, 0, dip(10), 0)
        header.addView(icon)

        val col = LinearLayout(this); col.orientation = LinearLayout.VERTICAL
        header.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))
        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E)); tv.textSize = 15f
        col.addView(tv)
        val ts = TextView(this)
        ts.text = subtitle; ts.setTextColor(Color.argb(0xFF, 0x99, 0x99, 0xA0)); ts.textSize = 11f
        col.addView(ts)

        val chevron = TextView(this)
        chevron.text = "\u25B8"
        chevron.textSize = 16f
        chevron.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93))
        chevron.setPadding(dip(4), 0, 0, 0)
        header.addView(chevron)

        card.addView(header)

        val expandable = LinearLayout(this)
        expandable.orientation = LinearLayout.VERTICAL
        expandable.visibility = View.GONE
        expandable.addView(cardDivider())
        expandable.content()

        card.addView(expandable)

        header.setOnClickListener {
            val isExpanded = expandable.visibility == View.VISIBLE
            if (isExpanded) {
                expandable.visibility = View.GONE
                chevron.text = "\u25B8"
            } else {
                expandable.visibility = View.VISIBLE
                chevron.text = "\u25BE"
            }
        }

        return card
    }

    private fun bigToggle(title: String, subtitle: String, getter: () -> Boolean, setter: (Boolean) -> Unit): LinearLayout {
        val row = LinearLayout(this)
        row.orientation = LinearLayout.HORIZONTAL
        row.setPadding(dip(16), dip(12), dip(16), dip(12))
        row.gravity = Gravity.CENTER_VERTICAL

        val col = LinearLayout(this)
        col.orientation = LinearLayout.VERTICAL
        col.setPadding(0, 0, dip(8), 0)
        row.addView(col, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E)); tv.textSize = 17f
        col.addView(tv)
        val ts = TextView(this)
        ts.text = subtitle; ts.setTextColor(Color.argb(0xFF, 0x8E, 0x8E, 0x93)); ts.textSize = 13f
        col.addView(ts)

        val sw = IosSwitch(this, 1.3f)
        sw.setChecked(getter(), false)
        val swLp = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        swLp.gravity = Gravity.CENTER_VERTICAL or Gravity.END
        row.addView(sw, swLp)

        row.setOnClickListener {
            val nv = !sw.isChecked
            sw.setChecked(nv, true)
            setter(nv)
        }
        sw.onToggle = setter
        return row
    }

    private fun cardDivider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x0C, 0x00, 0x00, 0x00))
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        return v
    }

    private fun thinDivider(): View {
        val v = View(this)
        v.setBackgroundColor(Color.argb(0x08, 0x00, 0x00, 0x00))
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(1))
        lp.setMargins(dip(16), 0, dip(16), 0)
        v.layoutParams = lp
        return v
    }

    private fun space(h: Int): View {
        val v = View(this)
        v.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dip(h))
        return v
    }

    private fun dip(v: Int): Int = (v * resources.displayMetrics.density + 0.5f).toInt()
    private fun dpf(v: Int): Float = v * resources.displayMetrics.density
}
