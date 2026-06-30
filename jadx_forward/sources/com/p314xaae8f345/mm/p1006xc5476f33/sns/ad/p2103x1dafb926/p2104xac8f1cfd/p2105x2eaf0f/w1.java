package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public final class w1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f244504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f244505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f244506f;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var, boolean z17, boolean z18) {
        this.f244504d = f2Var;
        this.f244505e = z17;
        this.f244506f = z18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.f2 f2Var = this.f244504d;
        f2Var.V().m().setAlpha(floatValue);
        f2Var.V().l().setAlpha(floatValue);
        f2Var.V().g().setAlpha(floatValue);
        f2Var.V().c().setAlpha(floatValue);
        android.widget.FrameLayout d17 = f2Var.V().d();
        if (d17 != null) {
            d17.setAlpha(floatValue);
        }
        if (!this.f244505e) {
            f2Var.V().e().setAlpha(floatValue);
        }
        if (this.f244506f) {
            f2Var.V().b().setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$showCardContent$anim$1$1");
    }
}
