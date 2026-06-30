package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class z8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f272308e;

    public z8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f272307d = h9Var;
        this.f272308e = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272307d;
        android.animation.ValueAnimator valueAnimator = h9Var.f271911x;
        android.widget.FrameLayout.LayoutParams layoutParams = this.f272308e;
        if (valueAnimator == animation) {
            android.content.Context context = h9Var.f271893f;
            java.lang.Object animatedValue = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = com.p314xaae8f345.mm.ui.zk.a(context, ((java.lang.Integer) animatedValue).intValue());
        } else if (h9Var.f271912y == animation) {
            android.content.Context context2 = h9Var.f271893f;
            java.lang.Object animatedValue2 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = com.p314xaae8f345.mm.ui.zk.a(context2, ((java.lang.Integer) animatedValue2).intValue());
        } else if (h9Var.f271913z == animation) {
            android.content.Context context3 = h9Var.f271893f;
            java.lang.Object animatedValue3 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(context3, ((java.lang.Integer) animatedValue3).intValue());
        }
        android.view.View view = h9Var.f271903p;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }
}
