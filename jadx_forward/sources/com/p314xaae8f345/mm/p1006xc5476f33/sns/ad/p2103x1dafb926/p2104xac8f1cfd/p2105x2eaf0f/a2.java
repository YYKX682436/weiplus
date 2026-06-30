package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f244283d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var) {
        this.f244283d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showReqCardAnim$2";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showReqCardAnim$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var = this.f244283d;
        c54.c U = f2Var.U();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        c54.k kVar = U.f120208b;
        kVar.b().setVisibility(0);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kVar.b(), "alpha", 0.0f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController$Companion");
        ofFloat.setInterpolator(pathInterpolator);
        ofFloat.setDuration(250L);
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startBackgroundAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMComponentInfo$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        f54.v vVar = f2Var.f244340s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMComponentInfo$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (vVar.d().b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            f2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startPreAnim");
            c54.c U2 = f2Var.U();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b2(f2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            c54.k kVar2 = U2.f120208b;
            kVar2.h().setVisibility(0);
            kVar2.j().setVisibility(0);
            kVar2.i().setVisibility(0);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar2.j(), "alpha", 0.0f, 1.0f);
            ofFloat2.setInterpolator(U2.a());
            ofFloat2.setDuration(500L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(kVar2.i(), "alpha", 0.0f, 1.0f);
            ofFloat3.setInterpolator(U2.a());
            ofFloat3.setDuration(500L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (c54.o.f120248b * 20.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            float f17 = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i18 = (int) (c54.o.f120248b * 100.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            str = "run";
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(kVar2.j(), "translationY", f17, 0.0f);
            ofFloat4.setInterpolator(U2.a());
            ofFloat4.setDuration(500L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(kVar2.i(), "translationY", f17, 0.0f);
            ofFloat5.setInterpolator(U2.a());
            ofFloat5.setDuration(500L);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "translationY", i18, 0.0f);
            ofFloat6.setInterpolator(U2.a());
            ofFloat6.setDuration(1000L);
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "scaleX", 0.6756757f, 1.0f);
            ofFloat7.setInterpolator(U2.a());
            ofFloat7.setDuration(1000L);
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "scaleY", 0.6756757f, 1.0f);
            ofFloat8.setInterpolator(U2.a());
            ofFloat8.setDuration(1000L);
            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "alpha", 0.0f, 1.0f);
            ofFloat9.setInterpolator(U2.a());
            ofFloat9.setDuration(750L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i19 = (int) (c54.o.f120248b * 30.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            float f18 = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i27 = (int) (c54.o.f120248b * 50.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "translationY", 0.0f, f18);
            s74.q4 q4Var = s74.q4.f486046a;
            ofFloat10.setInterpolator(q4Var.e());
            ofFloat10.setDuration(500L);
            ofFloat10.setStartDelay(1000L);
            android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "translationY", f18, -i27);
            ofFloat11.setInterpolator(q4Var.e());
            ofFloat11.setDuration(250L);
            ofFloat11.setStartDelay(1500L);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(kVar2.h(), "alpha", 1.0f, 0.0f);
            ofFloat12.setInterpolator(U2.b());
            ofFloat12.setDuration(250L);
            ofFloat12.setStartDelay(1500L);
            android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat(kVar2.j(), "alpha", 1.0f, 0.0f);
            ofFloat13.setInterpolator(U2.b());
            ofFloat13.setDuration(250L);
            ofFloat13.setStartDelay(1500L);
            android.animation.ObjectAnimator ofFloat14 = android.animation.ObjectAnimator.ofFloat(kVar2.i(), "alpha", 1.0f, 0.0f);
            ofFloat14.setInterpolator(U2.b());
            ofFloat14.setDuration(250L);
            ofFloat14.setStartDelay(1500L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat9, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11, ofFloat12, ofFloat13, ofFloat14);
            animatorSet.start();
            ofFloat14.addListener(b2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startPreAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showReqCardAnim$2";
        } else {
            str = "run";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.R(f2Var, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
