package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes3.dex */
public final class o0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 f241499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f241500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorSet f241501f;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var, android.widget.RelativeLayout relativeLayout, android.animation.AnimatorSet animatorSet) {
        this.f241499d = t0Var;
        this.f241500e = relativeLayout;
        this.f241501f = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.t0 t0Var = this.f241499d;
        boolean z17 = t0Var.f241530y0;
        android.animation.AnimatorSet animatorSet = this.f241501f;
        if (z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f241500e, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.n0(animatorSet));
            ofFloat.start();
            return;
        }
        animatorSet.cancel();
        android.widget.TextView textView = t0Var.f241524u;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = t0Var.T;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = t0Var.S;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setRotationX(-10.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
