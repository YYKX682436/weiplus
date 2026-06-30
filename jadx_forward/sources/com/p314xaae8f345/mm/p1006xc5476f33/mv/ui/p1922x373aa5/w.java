package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 f233505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233508h;

    public w(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3) {
        this.f233504d = i17;
        this.f233505e = a0Var;
        this.f233506f = c0Var;
        this.f233507g = c0Var2;
        this.f233508h = c0Var3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = this.f233504d;
        int i18 = i17 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var = this.f233505e;
        if (intValue >= i18) {
            a0Var.f233301p = 2;
            if (a0Var.d().isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f233506f;
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            a0Var.d().cancel();
            a0Var.d().start();
            return;
        }
        float f17 = intValue;
        float f18 = 300;
        if (f17 >= ((i17 * 2.0f) / 3.0f) - f18) {
            a0Var.f233301p = 1;
            if (a0Var.d().isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f233507g;
            if (c0Var2.f391645d) {
                return;
            }
            c0Var2.f391645d = true;
            a0Var.d().cancel();
            a0Var.d().start();
            return;
        }
        if (f17 >= (i17 / 3.0f) - f18) {
            a0Var.f233301p = 0;
            if (a0Var.d().isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = this.f233508h;
            if (c0Var3.f391645d) {
                return;
            }
            c0Var3.f391645d = true;
            a0Var.d().cancel();
            a0Var.d().start();
        }
    }
}
