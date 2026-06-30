package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public final class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f284591d;

    public q0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var) {
        this.f284591d = c1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = this.f284591d;
        android.view.ViewGroup viewGroup = c1Var.f284426i;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = intValue;
        }
        android.view.ViewGroup viewGroup2 = c1Var.f284426i;
        if (viewGroup2 != null) {
            viewGroup2.requestLayout();
        }
    }
}
