package gc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.d f351981a = new gc4.d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final gc4.e f351982b = new gc4.e();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f351983c;

    static {
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        f351983c = r17;
    }

    public static final gc4.e a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f351981a.a();
        gc4.e eVar = f351982b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return eVar;
    }

    public final int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_REMAINDER_SHOW_COUNT_INT, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return r17;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f351981a.a();
        if (f351982b.b() >= 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_USED_AFTER_BOOLEAN, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        }
    }
}
