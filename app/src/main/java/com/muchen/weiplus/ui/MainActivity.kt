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

    // 聊天功能增强
    private var antiRecall = false
    private var swipeQuote = false
    private var fakeVoiceTime = false
    private var showDetailTime = false
    private var unlimitCall = false
    private var diceCheat = false
    private var repeatMsg = false

    // 好友功能强化
    private var autoAcceptFriend = false
    private var findOneWayDelete = false
    private var editFriendCount = false
    private var editFriendAvatar = false
    private var batchDelFriend = false
    private var fillMoments = false

    // 朋友圈
    private var momentEnhance = false
    private var cleaner = false

    // 系统
    private var disableHotUpdate = true

    private lateinit var prefs: android.content.SharedPreferences

    private var panel: LinearLayout? = null
    private var dragStartY = 0f
    private var panelStartTY = 0f
    private var isDragging = false
    private var touchInPanel = false
    private val touchSlop by lazy { ViewConfiguration.get(this).scaledTouchSlop }

    companion object {
        const val PREF_NAME = "weiplus_prefs"
        const val KEY_ANTI_RECALL = "anti_recall"
        const val KEY_SWIPE_QUOTE = "swipe_quote"
        const val KEY_FAKE_VOICE_TIME = "fake_voice_time"
        const val KEY_SHOW_DETAIL_TIME = "show_detail_time"
        const val KEY_UNLIMIT_CALL = "unlimit_call"
        const val KEY_DICE_CHEAT = "dice_cheat"
        const val KEY_REPEAT_MSG = "repeat_msg"
        const val KEY_AUTO_ACCEPT_FRIEND = "auto_accept_friend"
        const val KEY_FIND_ONE_WAY_DELETE = "find_one_way_delete"
        const val KEY_EDIT_FRIEND_COUNT = "edit_friend_count"
        const val KEY_EDIT_FRIEND_AVATAR = "edit_friend_avatar"
        const val KEY_BATCH_DEL_FRIEND = "batch_del_friend"
        const val KEY_FILL_MOMENTS = "fill_moments"
        const val KEY_MOMENT_ENHANCE = "moment_enhance"
        const val KEY_CLEANER = "cleaner"
        const val KEY_DISABLE_HOT_UPDATE = "disable_hot_update"

        fun isFeatureEnabled(ctx: Context, key: String): Boolean {
            val def = key == KEY_DISABLE_HOT_UPDATE
            return ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getBoolean(key, def)
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
        swipeQuote = prefs.getBoolean(KEY_SWIPE_QUOTE, false)
        fakeVoiceTime = prefs.getBoolean(KEY_FAKE_VOICE_TIME, false)
        showDetailTime = prefs.getBoolean(KEY_SHOW_DETAIL_TIME, false)
        unlimitCall = prefs.getBoolean(KEY_UNLIMIT_CALL, false)
        diceCheat = prefs.getBoolean(KEY_DICE_CHEAT, false)
        repeatMsg = prefs.getBoolean(KEY_REPEAT_MSG, false)
        autoAcceptFriend = prefs.getBoolean(KEY_AUTO_ACCEPT_FRIEND, false)
        findOneWayDelete = prefs.getBoolean(KEY_FIND_ONE_WAY_DELETE, false)
        editFriendCount = prefs.getBoolean(KEY_EDIT_FRIEND_COUNT, false)
        editFriendAvatar = prefs.getBoolean(KEY_EDIT_FRIEND_AVATAR, false)
        batchDelFriend = prefs.getBoolean(KEY_BATCH_DEL_FRIEND, false)
        fillMoments = prefs.getBoolean(KEY_FILL_MOMENTS, false)
        momentEnhance = prefs.getBoolean(KEY_MOMENT_ENHANCE, false)
        cleaner = prefs.getBoolean(KEY_CLEANER, false)
        disableHotUpdate = prefs.getBoolean(KEY_DISABLE_HOT_UPDATE, true)
    }

    private fun savePrefs() {
        prefs.edit()
            .putBoolean(KEY_ANTI_RECALL, antiRecall)
            .putBoolean(KEY_SWIPE_QUOTE, swipeQuote)
            .putBoolean(KEY_FAKE_VOICE_TIME, fakeVoiceTime)
            .putBoolean(KEY_SHOW_DETAIL_TIME, showDetailTime)
            .putBoolean(KEY_UNLIMIT_CALL, unlimitCall)
            .putBoolean(KEY_DICE_CHEAT, diceCheat)
            .putBoolean(KEY_REPEAT_MSG, repeatMsg)
            .putBoolean(KEY_AUTO_ACCEPT_FRIEND, autoAcceptFriend)
            .putBoolean(KEY_FIND_ONE_WAY_DELETE, findOneWayDelete)
            .putBoolean(KEY_EDIT_FRIEND_COUNT, editFriendCount)
            .putBoolean(KEY_EDIT_FRIEND_AVATAR, editFriendAvatar)
            .putBoolean(KEY_BATCH_DEL_FRIEND, batchDelFriend)
            .putBoolean(KEY_FILL_MOMENTS, fillMoments)
            .putBoolean(KEY_MOMENT_ENHANCE, momentEnhance)
            .putBoolean(KEY_CLEANER, cleaner)
            .putBoolean(KEY_DISABLE_HOT_UPDATE, disableHotUpdate)
            .apply()
    }

    private fun buildUI(): FrameLayout {
        val root = FrameLayout(this)
        root.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)

        panel = LinearLayout(this)
        panel!!.orientation = LinearLayout.VERTICAL
        panel!!.setPadding(0, 0, 0, dip(36))

        val bg = GradientDrawable()
        bg.cornerRadii = floatArrayOf(dpf(20), dpf(20), dpf(20), dpf(20), 0f, 0f, 0f, 0f)
        bg.setColor(Color.argb(0x99, 0xF2, 0xF3, 0xF7))
        bg.setStroke(dip(1), Color.argb(0x18, 0xFF, 0xFF, 0xFF))
        panel!!.background = bg
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

        // ── 聊天功能增强 ──
        content.addView(featureCard("\uD83D\uDCAC", "聊天功能增强") {
            addView(bigToggle("禁止消息撤回", "阻止好友撤回已发消息", { antiRecall }, { antiRecall = it }))
            addView(thinDivider())
            addView(bigToggle("左滑消息引用", "左滑消息快速引用回复", { swipeQuote }, { swipeQuote = it }))
            addView(thinDivider())
            addView(bigToggle("伪装语音时长", "自定义语音消息时长显示", { fakeVoiceTime }, { fakeVoiceTime = it }))
            addView(thinDivider())
            addView(bigToggle("显示详细时间", "消息列表显示精确时间", { showDetailTime }, { showDetailTime = it }))
            addView(thinDivider())
            addView(bigToggle("解除通话限制", "解除语音视频通话限制", { unlimitCall }, { unlimitCall = it }))
            addView(thinDivider())
            addView(bigToggle("猜拳骰子作弊", "猜拳骰子结果随意控制", { diceCheat }, { diceCheat = it }))
            addView(thinDivider())
            addView(bigToggle("一键复读消息", "长按消息一键复读发送", { repeatMsg }, { repeatMsg = it }))
        })

        // ── 好友功能强化 ──
        content.addView(featureCard("\uD83D\uDC65", "好友功能强化") {
            addView(bigToggle("自动通过好友", "好友请求自动验证通过", { autoAcceptFriend }, { autoAcceptFriend = it }))
            addView(thinDivider())
            addView(bigToggle("查找单向删除", "查找已把你删除的好友", { findOneWayDelete }, { findOneWayDelete = it }))
            addView(thinDivider())
            addView(bigToggle("修改好友数量", "自定义修改好友数量显示", { editFriendCount }, { editFriendCount = it }))
            addView(thinDivider())
            addView(bigToggle("修改好友头像", "自定义修改好友头像显示", { editFriendAvatar }, { editFriendAvatar = it }))
            addView(thinDivider())
            addView(bigToggle("批量删除好友", "一键批量删除选中好友", { batchDelFriend }, { batchDelFriend = it }))
            addView(thinDivider())
            addView(bigToggle("一键补朋友圈", "一键补齐好友朋友圈内容", { fillMoments }, { fillMoments = it }))
        })

        // ── 朋友圈 ──
        content.addView(featureCard("\uD83D\uDC63", "朋友圈") {
            addView(bigToggle("朋友圈增强", "去广告深色长按保存", { momentEnhance }, { momentEnhance = it }))
            addView(thinDivider())
            addView(bigToggle("清理工具", "缓存清理文件管理工具", { cleaner }, { cleaner = it }))
        })

        // ── 系统 ──
        content.addView(featureCard("\uD83D\uDEE1\uFE0F", "系统") {
            addView(bigToggle("禁用热更新", "拦截补丁保持类结构", { disableHotUpdate }, { disableHotUpdate = it }))
        })

        scroll.addView(content)
        panel!!.addView(scroll, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

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

    private fun featureCard(emoji: String, title: String, content: LinearLayout.() -> Unit): LinearLayout {
        val card = LinearLayout(this)
        card.orientation = LinearLayout.VERTICAL
        val m = dip(14)
        val lp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        lp.setMargins(m, dip(6), m, dip(6))
        card.layoutParams = lp
        val cardBg = GradientDrawable()
        cardBg.cornerRadius = dpf(14)
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

        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E)); tv.textSize = 15f
        header.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

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
