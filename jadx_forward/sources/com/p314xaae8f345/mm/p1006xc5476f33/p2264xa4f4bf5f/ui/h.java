package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes5.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b f255450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f255451e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b bVar, android.view.View view) {
        this.f255450d = bVar;
        this.f255451e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue() / this.f255450d.f255270a;
        android.view.View view = this.f255451e;
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
    }
}
