package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class l8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f271997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f271998e;

    public l8(android.widget.FrameLayout.LayoutParams layoutParams, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var) {
        this.f271997d = layoutParams;
        this.f271998e = h9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.widget.FrameLayout.LayoutParams layoutParams = this.f271997d;
        layoutParams.topMargin = intValue;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f271998e;
        android.view.View view = h9Var.f271904q;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        android.view.View view2 = h9Var.f271904q;
        if (view2 != null) {
            view2.requestLayout();
        }
    }
}
