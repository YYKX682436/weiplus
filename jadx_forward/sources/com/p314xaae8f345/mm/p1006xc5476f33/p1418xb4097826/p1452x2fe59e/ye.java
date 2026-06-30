package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ye implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f192695d;

    public ye(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        this.f192695d = afVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f192695d;
        int V6 = afVar.V6(60);
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = afVar.I;
        if (c22645x24069159 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomAreaJumpGroup");
            throw null;
        }
        float f17 = V6;
        c22645x24069159.setTranslationY((animatedFraction * f17) - f17);
    }
}
