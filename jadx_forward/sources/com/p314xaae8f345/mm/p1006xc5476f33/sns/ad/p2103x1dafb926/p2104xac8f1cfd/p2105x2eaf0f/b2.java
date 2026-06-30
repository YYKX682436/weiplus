package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class b2 extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f244296e;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var) {
        this.f244296e = f2Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startPreAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startPreAnim-onAnimationEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var = this.f244296e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.P(f2Var);
        c54.b O = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.O(f2Var);
        if (O != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            boolean z17 = O.f120205j;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCardDoSideRotateAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCard");
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            bool = null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.AdLandingComponent", "startWishGiftReqCardAnim");
            c54.c U = f2Var.U();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.e2(f2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            c54.k kVar = U.f120208b;
            kVar.a().setVisibility(0);
            kVar.a().setAlpha(1.0f);
            float f17 = U.f120207a.getResources().getDisplayMetrics().density * (-4000);
            kVar.a().setCameraDistance(f17);
            kVar.e().setCameraDistance(f17);
            android.widget.ImageView a17 = kVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            int i17 = (int) (c54.o.f120248b * 520.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRelativeSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardUIUtils");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(a17, "translationY", i17, 0.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.25f, 0.11f, 0.0f, 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            ofFloat.setInterpolator(pathInterpolator);
            ofFloat.setDuration(1500L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "rotationY", -200.0f, 360.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(0.25f, 0.11f, 0.0f, 1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWishGiftRotateAnimInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            ofFloat2.setInterpolator(pathInterpolator2);
            ofFloat2.setDuration(1500L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(kVar.a(), "rotationY", 360.0f, 540.0f);
            s74.q4 q4Var = s74.q4.f486046a;
            ofFloat3.setInterpolator(q4Var.e());
            ofFloat3.setDuration(500L);
            ofFloat3.setStartDelay(1750L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(kVar.e(), "rotationY", 540.0f, 720.0f);
            ofFloat4.setInterpolator(q4Var.e());
            ofFloat4.setDuration(500L);
            ofFloat4.setStartDelay(1750L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
            ofFloat3.addListener(e2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$startWishGiftReqCardAnim", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2.R(f2Var, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$startPreAnim$1");
    }
}
