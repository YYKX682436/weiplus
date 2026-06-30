package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class y8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f272296e;

    public y8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f272295d = h9Var;
        this.f272296e = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272295d;
        android.animation.ValueAnimator valueAnimator = h9Var.A;
        android.widget.FrameLayout.LayoutParams layoutParams = this.f272296e;
        if (valueAnimator == animation) {
            if (layoutParams != null) {
                android.content.Context context = h9Var.f271893f;
                java.lang.Object animatedValue = animation.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = com.p314xaae8f345.mm.ui.zk.a(context, ((java.lang.Integer) animatedValue).intValue());
            }
        } else if (h9Var.B == animation && layoutParams != null) {
            android.content.Context context2 = h9Var.f271893f;
            java.lang.Object animatedValue2 = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = com.p314xaae8f345.mm.ui.zk.a(context2, ((java.lang.Integer) animatedValue2).intValue());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = h9Var.f271902o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setLayoutParams(layoutParams);
        }
    }
}
