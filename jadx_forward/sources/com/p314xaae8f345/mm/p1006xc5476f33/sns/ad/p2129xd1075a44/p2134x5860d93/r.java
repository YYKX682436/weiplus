package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class r implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y f244890d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar) {
        this.f244890d = yVar;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244890d;
        if (c22789xd23e9a9b != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.p pVar = yVar.G;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMPAGFlushListener$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
            c22789xd23e9a9b.b(pVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.j(), "PAG onAnimationStart");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y yVar = this.f244890d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = yVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        long j17 = c17933xe8d1b226 != null ? c17933xe8d1b226.f68891x29d1292e : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.j(), "PAG onAnimationEnd, snsId is " + j17);
        android.animation.ObjectAnimator a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.m0.f244664a.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.y.B(yVar), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.n0(0.66f, 0.0f, 0.32f, 1.0f, 700L), 1.0f, 0.0f);
        if (a17 != null) {
            a17.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.q(yVar));
        }
        if (a17 != null) {
            a17.start();
        }
        l44.b3 b3Var = l44.b3.f397574a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = yVar.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdBreakFramePAGPlayEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAdPAGPlayEnd() called with: snsInfo = ");
        sb6.append(c17933xe8d1b2262);
        sb6.append(", model snsId is ");
        sb6.append(c17933xe8d1b2262 != null ? c17933xe8d1b2262.m70367x7525eefd() : null);
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b2262 != null ? c17933xe8d1b2262.f68891x29d1292e : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdInteractHelper", sb6.toString());
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) l44.b3.f397585l).e(c17933xe8d1b2262);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdBreakFramePAGPlayEnd", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mPAGViewListener$1");
    }
}
