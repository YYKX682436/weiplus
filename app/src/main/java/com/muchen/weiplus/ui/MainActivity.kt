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
    private var forwardVoiceCard = false
    private var anyMsgReply = false
    private var keyMsgReply = false

    // 好友功能强化
    private var autoAcceptFriend = false
    private var findOneWayDelete = false
    private var editFriendCount = false
    private var editFriendAvatar = false
    private var batchDelFriend = false

    // 群聊功能强化
    private var autoAcceptInvite = false
    private var editGroupAvatar = false
    private var batchExitGroup = false
    private var groupMsgMonitor = false
    private var groupNickMonitor = false
    private var groupJoinMonitor = false
    private var groupQuitMonitor = false
    private var newGroupNoDisturb = false
    private var msgQuoteLocate = false
    private var blockAtMsg = false
    private var batchKickGroup = false

    // 朋友圈类功能
    private var autoLikeMoment = false
    private var autoCommentMoment = false
    private var editLikeCount = false
    private var editComment = false
    private var removeAds = false
    private var sendHdImage = false
    private var fillMoments = false
    private var antiCommentRecall = false

    // 红包转账余额
    private var autoGrabRedpack = false
    private var autoAcceptTransfer = false
    private var editTransferAmount = false
    private var editBalance = false
    private var showRedpackDetail = false

    // 定时自动任务
    private var autoSendMsg = false
    private var autoPostMoment = false
    private var autoFindOneWayDel = false
    private var autoWechatCall = false

    // 系统功能修改
    private var editLocation = false
    private var editWechatSteps = false
    private var tabletMode = false
    private var breakEmojiLimit = false
    private var editAnyText = false

    private lateinit var prefs: android.content.SharedPreferences

    private var panel: LinearLayout? = null
    private var scrollView: ScrollView? = null
    private var headerHeight = 0
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
        const val KEY_FORWARD_VOICE_CARD = "forward_voice_card"
        const val KEY_ANY_MSG_REPLY = "any_msg_reply"
        const val KEY_KEY_MSG_REPLY = "key_msg_reply"
        const val KEY_AUTO_ACCEPT_FRIEND = "auto_accept_friend"
        const val KEY_FIND_ONE_WAY_DELETE = "find_one_way_delete"
        const val KEY_EDIT_FRIEND_COUNT = "edit_friend_count"
        const val KEY_EDIT_FRIEND_AVATAR = "edit_friend_avatar"
        const val KEY_BATCH_DEL_FRIEND = "batch_del_friend"
        const val KEY_AUTO_ACCEPT_INVITE = "auto_accept_invite"
        const val KEY_EDIT_GROUP_AVATAR = "edit_group_avatar"
        const val KEY_BATCH_EXIT_GROUP = "batch_exit_group"
        const val KEY_GROUP_MSG_MONITOR = "group_msg_monitor"
        const val KEY_GROUP_NICK_MONITOR = "group_nick_monitor"
        const val KEY_GROUP_JOIN_MONITOR = "group_join_monitor"
        const val KEY_GROUP_QUIT_MONITOR = "group_quit_monitor"
        const val KEY_NEW_GROUP_NO_DISTURB = "new_group_no_disturb"
        const val KEY_MSG_QUOTE_LOCATE = "msg_quote_locate"
        const val KEY_BLOCK_AT_MSG = "block_at_msg"
        const val KEY_BATCH_KICK_GROUP = "batch_kick_group"
        const val KEY_AUTO_LIKE_MOMENT = "auto_like_moment"
        const val KEY_AUTO_COMMENT_MOMENT = "auto_comment_moment"
        const val KEY_EDIT_LIKE_COUNT = "edit_like_count"
        const val KEY_EDIT_COMMENT = "edit_comment"
        const val KEY_REMOVE_ADS = "remove_ads"
        const val KEY_SEND_HD_IMAGE = "send_hd_image"
        const val KEY_FILL_MOMENTS = "fill_moments"
        const val KEY_ANTI_COMMENT_RECALL = "anti_comment_recall"
        const val KEY_AUTO_GRAB_REDPACK = "auto_grab_redpack"
        const val KEY_AUTO_ACCEPT_TRANSFER = "auto_accept_transfer"
        const val KEY_EDIT_TRANSFER_AMOUNT = "edit_transfer_amount"
        const val KEY_EDIT_BALANCE = "edit_balance"
        const val KEY_SHOW_REDPACK_DETAIL = "show_redpack_detail"
        const val KEY_AUTO_SEND_MSG = "auto_send_msg"
        const val KEY_AUTO_POST_MOMENT = "auto_post_moment"
        const val KEY_AUTO_FIND_ONE_WAY_DEL = "auto_find_one_way_del"
        const val KEY_AUTO_WECHAT_CALL = "auto_wechat_call"
        const val KEY_EDIT_LOCATION = "edit_location"
        const val KEY_EDIT_WECHAT_STEPS = "edit_wechat_steps"
        const val KEY_TABLET_MODE = "tablet_mode"
        const val KEY_BREAK_EMOJI_LIMIT = "break_emoji_limit"
        const val KEY_EDIT_ANY_TEXT = "edit_any_text"
        const val KEY_DISABLE_HOT_UPDATE = "disable_hot_update"

        fun isFeatureEnabled(ctx: Context, key: String): Boolean {
            val def = key == KEY_DISABLE_HOT_UPDATE
            return ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
                .getBoolean(key, def)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent): Boolean = when {
        panel == null -> super.dispatchTouchEvent(ev)
        else -> {
            val p = panel!!
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    val loc = IntArray(2); p.getLocationOnScreen(loc)
                    touchInPanel = ev.rawY >= loc[1] && ev.rawY < loc[1] + headerHeight
                    if (touchInPanel) { dragStartY = ev.rawY; panelStartTY = p.translationY; isDragging = false }
                }
                MotionEvent.ACTION_MOVE -> {
                    if (touchInPanel) {
                        val dy = ev.rawY - dragStartY
                        if (!isDragging && dy > touchSlop) isDragging = true
                        if (isDragging) {
                            p.translationY = (panelStartTY + dy).coerceAtLeast(0f)
                            p.alpha = 1f - (p.translationY / (p.height * 0.6f)).coerceIn(0f, 1f) * 0.5f
                            return true
                        }
                    }
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    if (isDragging) {
                        isDragging = false; touchInPanel = false
                        if (p.translationY > p.height * 0.22f)
                            p.animate().translationY(p.height.toFloat()).alpha(0f).setDuration(220)
                                .withEndAction { finish() }.start()
                        else p.animate().translationY(0f).alpha(1f).setDuration(200).start()
                        return true
                    }
                    touchInPanel = false
                }
            }
            super.dispatchTouchEvent(ev)
        }
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
        forwardVoiceCard = prefs.getBoolean(KEY_FORWARD_VOICE_CARD, false)
        anyMsgReply = prefs.getBoolean(KEY_ANY_MSG_REPLY, false)
        keyMsgReply = prefs.getBoolean(KEY_KEY_MSG_REPLY, false)
        autoAcceptFriend = prefs.getBoolean(KEY_AUTO_ACCEPT_FRIEND, false)
        findOneWayDelete = prefs.getBoolean(KEY_FIND_ONE_WAY_DELETE, false)
        editFriendCount = prefs.getBoolean(KEY_EDIT_FRIEND_COUNT, false)
        editFriendAvatar = prefs.getBoolean(KEY_EDIT_FRIEND_AVATAR, false)
        batchDelFriend = prefs.getBoolean(KEY_BATCH_DEL_FRIEND, false)
        autoAcceptInvite = prefs.getBoolean(KEY_AUTO_ACCEPT_INVITE, false)
        editGroupAvatar = prefs.getBoolean(KEY_EDIT_GROUP_AVATAR, false)
        batchExitGroup = prefs.getBoolean(KEY_BATCH_EXIT_GROUP, false)
        groupMsgMonitor = prefs.getBoolean(KEY_GROUP_MSG_MONITOR, false)
        groupNickMonitor = prefs.getBoolean(KEY_GROUP_NICK_MONITOR, false)
        groupJoinMonitor = prefs.getBoolean(KEY_GROUP_JOIN_MONITOR, false)
        groupQuitMonitor = prefs.getBoolean(KEY_GROUP_QUIT_MONITOR, false)
        newGroupNoDisturb = prefs.getBoolean(KEY_NEW_GROUP_NO_DISTURB, false)
        msgQuoteLocate = prefs.getBoolean(KEY_MSG_QUOTE_LOCATE, false)
        blockAtMsg = prefs.getBoolean(KEY_BLOCK_AT_MSG, false)
        batchKickGroup = prefs.getBoolean(KEY_BATCH_KICK_GROUP, false)
        autoLikeMoment = prefs.getBoolean(KEY_AUTO_LIKE_MOMENT, false)
        autoCommentMoment = prefs.getBoolean(KEY_AUTO_COMMENT_MOMENT, false)
        editLikeCount = prefs.getBoolean(KEY_EDIT_LIKE_COUNT, false)
        editComment = prefs.getBoolean(KEY_EDIT_COMMENT, false)
        removeAds = prefs.getBoolean(KEY_REMOVE_ADS, false)
        sendHdImage = prefs.getBoolean(KEY_SEND_HD_IMAGE, false)
        fillMoments = prefs.getBoolean(KEY_FILL_MOMENTS, false)
        antiCommentRecall = prefs.getBoolean(KEY_ANTI_COMMENT_RECALL, false)
        autoGrabRedpack = prefs.getBoolean(KEY_AUTO_GRAB_REDPACK, false)
        autoAcceptTransfer = prefs.getBoolean(KEY_AUTO_ACCEPT_TRANSFER, false)
        editTransferAmount = prefs.getBoolean(KEY_EDIT_TRANSFER_AMOUNT, false)
        editBalance = prefs.getBoolean(KEY_EDIT_BALANCE, false)
        showRedpackDetail = prefs.getBoolean(KEY_SHOW_REDPACK_DETAIL, false)
        autoSendMsg = prefs.getBoolean(KEY_AUTO_SEND_MSG, false)
        autoPostMoment = prefs.getBoolean(KEY_AUTO_POST_MOMENT, false)
        autoFindOneWayDel = prefs.getBoolean(KEY_AUTO_FIND_ONE_WAY_DEL, false)
        autoWechatCall = prefs.getBoolean(KEY_AUTO_WECHAT_CALL, false)
        editLocation = prefs.getBoolean(KEY_EDIT_LOCATION, false)
        editWechatSteps = prefs.getBoolean(KEY_EDIT_WECHAT_STEPS, false)
        tabletMode = prefs.getBoolean(KEY_TABLET_MODE, false)
        breakEmojiLimit = prefs.getBoolean(KEY_BREAK_EMOJI_LIMIT, false)
        editAnyText = prefs.getBoolean(KEY_EDIT_ANY_TEXT, false)
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
            .putBoolean(KEY_FORWARD_VOICE_CARD, forwardVoiceCard)
            .putBoolean(KEY_ANY_MSG_REPLY, anyMsgReply)
            .putBoolean(KEY_KEY_MSG_REPLY, keyMsgReply)
            .putBoolean(KEY_AUTO_ACCEPT_FRIEND, autoAcceptFriend)
            .putBoolean(KEY_FIND_ONE_WAY_DELETE, findOneWayDelete)
            .putBoolean(KEY_EDIT_FRIEND_COUNT, editFriendCount)
            .putBoolean(KEY_EDIT_FRIEND_AVATAR, editFriendAvatar)
            .putBoolean(KEY_BATCH_DEL_FRIEND, batchDelFriend)
            .putBoolean(KEY_AUTO_ACCEPT_INVITE, autoAcceptInvite)
            .putBoolean(KEY_EDIT_GROUP_AVATAR, editGroupAvatar)
            .putBoolean(KEY_BATCH_EXIT_GROUP, batchExitGroup)
            .putBoolean(KEY_GROUP_MSG_MONITOR, groupMsgMonitor)
            .putBoolean(KEY_GROUP_NICK_MONITOR, groupNickMonitor)
            .putBoolean(KEY_GROUP_JOIN_MONITOR, groupJoinMonitor)
            .putBoolean(KEY_GROUP_QUIT_MONITOR, groupQuitMonitor)
            .putBoolean(KEY_NEW_GROUP_NO_DISTURB, newGroupNoDisturb)
            .putBoolean(KEY_MSG_QUOTE_LOCATE, msgQuoteLocate)
            .putBoolean(KEY_BLOCK_AT_MSG, blockAtMsg)
            .putBoolean(KEY_BATCH_KICK_GROUP, batchKickGroup)
            .putBoolean(KEY_AUTO_LIKE_MOMENT, autoLikeMoment)
            .putBoolean(KEY_AUTO_COMMENT_MOMENT, autoCommentMoment)
            .putBoolean(KEY_EDIT_LIKE_COUNT, editLikeCount)
            .putBoolean(KEY_EDIT_COMMENT, editComment)
            .putBoolean(KEY_REMOVE_ADS, removeAds)
            .putBoolean(KEY_SEND_HD_IMAGE, sendHdImage)
            .putBoolean(KEY_FILL_MOMENTS, fillMoments)
            .putBoolean(KEY_ANTI_COMMENT_RECALL, antiCommentRecall)
            .putBoolean(KEY_AUTO_GRAB_REDPACK, autoGrabRedpack)
            .putBoolean(KEY_AUTO_ACCEPT_TRANSFER, autoAcceptTransfer)
            .putBoolean(KEY_EDIT_TRANSFER_AMOUNT, editTransferAmount)
            .putBoolean(KEY_EDIT_BALANCE, editBalance)
            .putBoolean(KEY_SHOW_REDPACK_DETAIL, showRedpackDetail)
            .putBoolean(KEY_AUTO_SEND_MSG, autoSendMsg)
            .putBoolean(KEY_AUTO_POST_MOMENT, autoPostMoment)
            .putBoolean(KEY_AUTO_FIND_ONE_WAY_DEL, autoFindOneWayDel)
            .putBoolean(KEY_AUTO_WECHAT_CALL, autoWechatCall)
            .putBoolean(KEY_EDIT_LOCATION, editLocation)
            .putBoolean(KEY_EDIT_WECHAT_STEPS, editWechatSteps)
            .putBoolean(KEY_TABLET_MODE, tabletMode)
            .putBoolean(KEY_BREAK_EMOJI_LIMIT, breakEmojiLimit)
            .putBoolean(KEY_EDIT_ANY_TEXT, editAnyText)
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
        headerHeight = dip(80)  // handle + title + space
        panel!!.addView(space(8))

        scrollView = ScrollView(this); val scroll = scrollView!!
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
            addView(thinDivider())
            addView(bigToggle("语音名片转发", "转发语音消息为名片格式", { forwardVoiceCard }, { forwardVoiceCard = it }))
            addView(thinDivider())
            addView(bigToggle("任意消息回复", "任意消息均可进行回复", { anyMsgReply }, { anyMsgReply = it }))
            addView(thinDivider())
            addView(bigToggle("关键消息回复", "关键词匹配自动回复消息", { keyMsgReply }, { keyMsgReply = it }))
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
        })

        // ── 群聊功能强化 ──
        content.addView(featureCard("\uD83D\uDC6B", "群聊功能强化") {
            addView(bigToggle("自动通过邀请", "群聊邀请自动确认加入", { autoAcceptInvite }, { autoAcceptInvite = it }))
            addView(thinDivider())
            addView(bigToggle("修改群聊头像", "自定义修改群聊头像显示", { editGroupAvatar }, { editGroupAvatar = it }))
            addView(thinDivider())
            addView(bigToggle("批量退出群聊", "一键批量退出选中群聊", { batchExitGroup }, { batchExitGroup = it }))
            addView(thinDivider())
            addView(bigToggle("群友消息监控", "实时监控群友发送消息", { groupMsgMonitor }, { groupMsgMonitor = it }))
            addView(thinDivider())
            addView(bigToggle("群友昵称监控", "监控群友昵称修改记录", { groupNickMonitor }, { groupNickMonitor = it }))
            addView(thinDivider())
            addView(bigToggle("群友进群监控", "监控群友加入群聊通知", { groupJoinMonitor }, { groupJoinMonitor = it }))
            addView(thinDivider())
            addView(bigToggle("群友退群监控", "监控群友退出群聊通知", { groupQuitMonitor }, { groupQuitMonitor = it }))
            addView(thinDivider())
            addView(bigToggle("新进群免打扰", "新进群聊默认免打扰模式", { newGroupNoDisturb }, { newGroupNoDisturb = it }))
            addView(thinDivider())
            addView(bigToggle("消息引用定位", "引用消息一键定位原文", { msgQuoteLocate }, { msgQuoteLocate = it }))
            addView(thinDivider())
            addView(bigToggle("屏蔽艾特消息", "屏蔽群聊艾特我的消息", { blockAtMsg }, { blockAtMsg = it }))
            addView(thinDivider())
            addView(bigToggle("批量踢出群聊", "一键批量踢出选中群友", { batchKickGroup }, { batchKickGroup = it }))
        })

        // ── 朋友圈类功能 ──
        content.addView(featureCard("\uD83C\uDF1F", "朋友圈类功能") {
            addView(bigToggle("自动点赞动态", "自动为好友动态点赞", { autoLikeMoment }, { autoLikeMoment = it }))
            addView(thinDivider())
            addView(bigToggle("自动评论内容", "自动为好友动态评论", { autoCommentMoment }, { autoCommentMoment = it }))
            addView(thinDivider())
            addView(bigToggle("修改点赞数量", "自定义动态点赞数量显示", { editLikeCount }, { editLikeCount = it }))
            addView(thinDivider())
            addView(bigToggle("修改评论内容", "自定义修改动态评论内容", { editComment }, { editComment = it }))
            addView(thinDivider())
            addView(bigToggle("去除烦人广告", "屏蔽朋友圈广告推送", { removeAds }, { removeAds = it }))
            addView(thinDivider())
            addView(bigToggle("发送高清原图", "朋友圈图片发送高清原图", { sendHdImage }, { sendHdImage = it }))
            addView(thinDivider())
            addView(bigToggle("一键补朋友圈", "一键补齐好友朋友圈内容", { fillMoments }, { fillMoments = it }))
            addView(thinDivider())
            addView(bigToggle("内容评论防撤", "好友评论动态防撤回", { antiCommentRecall }, { antiCommentRecall = it }))
        })

        // ── 红包转账余额 ──
        content.addView(featureCard("\uD83E\uDDE7", "红包转账余额") {
            addView(bigToggle("自动秒抢红包", "抢红包光速秒杀零延迟", { autoGrabRedpack }, { autoGrabRedpack = it }))
            addView(thinDivider())
            addView(bigToggle("自动接收转账", "转账消息自动确认收款", { autoAcceptTransfer }, { autoAcceptTransfer = it }))
            addView(thinDivider())
            addView(bigToggle("修改转账金额", "自定义修改转账金额显示", { editTransferAmount }, { editTransferAmount = it }))
            addView(thinDivider())
            addView(bigToggle("修改显示余额", "自定义修改钱包余额显示", { editBalance }, { editBalance = it }))
            addView(thinDivider())
            addView(bigToggle("显示红包详情", "红包打开前查看详情信息", { showRedpackDetail }, { showRedpackDetail = it }))
        })

        // ── 定时自动任务 ──
        content.addView(featureCard("\u23F0", "定时自动任务") {
            addView(bigToggle("自动发送消息", "定时自动发送指定消息", { autoSendMsg }, { autoSendMsg = it }))
            addView(thinDivider())
            addView(bigToggle("自动发朋友圈", "定时自动发布朋友圈动态", { autoPostMoment }, { autoPostMoment = it }))
            addView(thinDivider())
            addView(bigToggle("自动查找单删", "定时自动查找单向删除", { autoFindOneWayDel }, { autoFindOneWayDel = it }))
            addView(thinDivider())
            addView(bigToggle("自动微信电话", "定时自动拨打微信电话", { autoWechatCall }, { autoWechatCall = it }))
        })

        // ── 系统功能修改 ──
        content.addView(featureCard("\u2699\uFE0F", "系统功能修改") {
            addView(bigToggle("修改当前定位", "自定义修改当前地理位置", { editLocation }, { editLocation = it }))
            addView(thinDivider())
            addView(bigToggle("修改微信步数", "自定义修改微信运动步数", { editWechatSteps }, { editWechatSteps = it }))
            addView(thinDivider())
            addView(bigToggle("平板模式登录", "模拟平板设备登录微信", { tabletMode }, { tabletMode = it }))
            addView(thinDivider())
            addView(bigToggle("突破表情上限", "突破表情包收藏数量上限", { breakEmojiLimit }, { breakEmojiLimit = it }))
            addView(thinDivider())
            addView(bigToggle("修改任意文本", "自定义修改任意界面文本", { editAnyText }, { editAnyText = it }))
        })

        scroll.addView(content)
        panel!!.addView(scrollView!!, LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 1f))

        panel!!.post {
            panel!!.translationY = panel!!.height.toFloat() * 0.3f
            panel!!.alpha = 0f
            panel!!.animate().translationY(0f).alpha(1f).setDuration(300).setInterpolator(DecelerateInterpolator()).start()
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
        header.isClickable = true; header.isFocusable = true

        val icon = TextView(this)
        icon.text = emoji; icon.textSize = 20f; icon.setPadding(0, 0, dip(10), 0)
        header.addView(icon)

        val tv = TextView(this)
        tv.text = title; tv.setTextColor(Color.argb(0xFF, 0x1C, 0x1C, 0x1E)); tv.textSize = 15f
        header.addView(tv, LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f))

        val chevron = TextView(this)
        chevron.text = "\u25B8"; chevron.textSize = 16f
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
            if (isExpanded) { expandable.visibility = View.GONE; chevron.text = "\u25B8" }
            else { expandable.visibility = View.VISIBLE; chevron.text = "\u25BE" }
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
        val swLp = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        swLp.gravity = Gravity.CENTER_VERTICAL or Gravity.END
        row.addView(sw, swLp)

        row.setOnClickListener { val nv = !sw.isChecked; sw.setChecked(nv, true); setter(nv) }
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



