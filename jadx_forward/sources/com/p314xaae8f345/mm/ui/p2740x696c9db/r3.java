package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class r3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.p3 f292201d;

    public r3(com.p314xaae8f345.mm.ui.p2740x696c9db.p3 p3Var) {
        this.f292201d = p3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        float e17 = e06.p.e(animator.getAnimatedFraction(), 0.0f, 1.0f);
        com.p314xaae8f345.mm.ui.p2740x696c9db.p3 p3Var = this.f292201d;
        if (p3Var != null) {
            p3Var.b(e17);
        }
    }
}
