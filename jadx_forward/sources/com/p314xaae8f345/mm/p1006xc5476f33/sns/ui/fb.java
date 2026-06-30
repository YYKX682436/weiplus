package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fb implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f249870a;

    public fb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773) {
        this.f249870a = activityC18007x6d5e9773;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f249870a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC18007x6d5e9773.f248233d, "doAdNativeAntiAbuseScene end, errType = " + i17 + ", errNo = " + i18 + ", canvasAuthFailed = " + obj);
        if (i17 == 0 && i18 == 0 && obj != null) {
            try {
                r45.l2 l2Var = new r45.l2();
                l2Var.mo11468x92b714fd((byte[]) obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC18007x6d5e9773.f248233d, "checkNativeLandingPageAbuse, canvasAuthFailed=" + l2Var.f460616d);
                if (l2Var.f460616d != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    activityC18007x6d5e9773.O2 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eb(this), 500L);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 113);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC18007x6d5e9773.f248233d, th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }
}
