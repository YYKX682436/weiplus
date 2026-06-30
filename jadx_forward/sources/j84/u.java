package j84;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f379764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j84.g0 f379765e;

    public u(android.app.Activity activity, j84.g0 g0Var) {
        this.f379764d = activity;
        this.f379765e = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
        if (this.f379764d.isFinishing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
            return;
        }
        j84.g0 g0Var = this.f379765e;
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = g0Var.f379732s;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else if (g0Var.f379733t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
            s34.w0 w0Var = m70354x74235b3e != null ? m70354x74235b3e.f38206x78154a55 : null;
            if (w0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            } else {
                w64.n nVar = new w64.n(g0Var.f379733t, g0Var.f379729p, g0Var.f379730q, null, null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k0) w0Var.f484352p).a(w0Var, s34.w0.f484336r[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScratchSuccessActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdScratchCardInfo");
                if (c17702x544f64e9 != null) {
                    c17702x544f64e9.f244102a = 39;
                }
                nVar.n(c17702x544f64e9, g0Var.f379732s);
                nVar.k(g0Var.F());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scratchSuccessJump", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
            }
        }
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        if (g0Var.f379733t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        } else {
            g0Var.j();
            g0Var.I();
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.63f, 0.01f, 0.35f, 1.0f);
            android.widget.FrameLayout C = g0Var.C();
            if (C != null) {
                C.setAlpha(0.0f);
                C.setVisibility(0);
                android.view.ViewPropertyAnimator animate = C.animate();
                if (animate != null) {
                    animate.alpha(1.0f);
                    animate.setDuration(600L);
                    animate.setInterpolator(pathInterpolator);
                    animate.start();
                }
            }
            android.widget.LinearLayout G = g0Var.G();
            if (G != null) {
                float b17 = (-G.getX()) + i65.a.b(g0Var.f379733t, 12);
                android.view.ViewPropertyAnimator animate2 = G.animate();
                if (animate2 != null) {
                    animate2.translationX(b17);
                    animate2.setDuration(600L);
                    animate2.setInterpolator(pathInterpolator);
                    animate2.withEndAction(new j84.b0(g0Var));
                    animate2.start();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCouponAnimation", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.adscratchcard.AdScratchCardComponent$setupScratchState$3$1");
    }
}
