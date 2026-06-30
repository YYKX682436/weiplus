package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes2.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f191387f;

    public k(android.view.View view, android.view.View view2, float f17) {
        this.f191385d = view;
        this.f191386e = view2;
        this.f191387f = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f191385d.setTranslationY(floatValue);
        this.f191386e.setTranslationY(floatValue - this.f191387f);
    }
}
