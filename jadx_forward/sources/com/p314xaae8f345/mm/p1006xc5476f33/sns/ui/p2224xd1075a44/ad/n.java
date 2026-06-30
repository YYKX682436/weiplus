package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes3.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 f252554d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var) {
        this.f252554d = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.v0 v0Var = this.f252554d;
        android.widget.TextView D = v0Var.D();
        if (D != null) {
            D.setTranslationY(0.0f);
        }
        android.widget.TextView C = v0Var.C();
        if (C != null) {
            C.setTranslationY(0.0f);
        }
        android.widget.TextView D2 = v0Var.D();
        if (D2 != null) {
            D2.setAlpha(floatValue);
        }
        android.widget.TextView C2 = v0Var.C();
        if (C2 != null) {
            C2.setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$processSingleImageViews$5");
    }
}
