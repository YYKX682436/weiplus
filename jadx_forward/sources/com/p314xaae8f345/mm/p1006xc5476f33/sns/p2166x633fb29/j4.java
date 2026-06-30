package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f245856a = 30;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f245857b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f245858c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f245859d = 50;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f245860e = true;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f245861f;

    public static boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_WITH_TA_INT, 0);
        if (r17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return false;
        }
        if (r17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTogether", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return false;
    }

    public static boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_reddot_enabled, false) && com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("sns_with_together_at_contact_red", 0) == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTogetherRedDot", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z17;
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean z17 = false;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_together_reddot_enabled, false) && com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("sns_with_together_at_contact_red_second_version", 0) == 0) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableTogetherRedDotAgain", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return z17;
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_video_scale, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoScaleConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return fj6;
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_show_video_send_error, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isToShowSnsSendError", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return fj6;
    }

    public static int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        g();
        int i17 = f245856a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("linkCollapseCount", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i17;
    }

    public static void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        if (f245861f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return;
        }
        if (!gm0.j1.a() || !gm0.j1.i().f354741a.f354832d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsConfig", "Account not ready or startup not done");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            return;
        }
        f245856a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_link_collapse_enable, 30);
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        bf4.b bVar = bf4.b.f101229b;
        f245857b = bVar.f(ze4.g.TimeLine_Comment);
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        f245858c = bVar.f(ze4.g.TimeLine_Like);
        f245859d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_ws_fold_range_size, 50);
        f245860e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_sync_settext, 1) > 0;
        f245861f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
    }

    public static int h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        g();
        int i17 = f245859d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("wsFoldGroupSize", "com.tencent.mm.plugin.sns.model.SnsConfig");
        return i17;
    }
}
