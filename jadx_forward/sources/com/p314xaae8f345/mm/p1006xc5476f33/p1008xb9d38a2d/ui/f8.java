package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes2.dex */
public final class f8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f155378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f155379e;

    public f8(android.view.ViewGroup.LayoutParams layoutParams, android.view.View view) {
        this.f155378d = layoutParams;
        this.f155379e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f155378d;
        layoutParams.height = intValue;
        android.view.View view = this.f155379e;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
