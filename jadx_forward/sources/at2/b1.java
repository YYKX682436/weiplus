package at2;

/* loaded from: classes3.dex */
public final class b1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f95172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f95173e;

    public b1(at2.n1 n1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f95172d = n1Var;
        this.f95173e = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        dt2.a0 a0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        at2.n1 n1Var = this.f95172d;
        at2.u1 u1Var = (at2.u1) n1Var.X0(at2.u1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = (u1Var == null || (a0Var = u1Var.f95295q) == null) ? null : a0Var.f324691a;
        if (c14932xfc4acec9 != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            c14932xfc4acec9.setAlpha(1 - ((java.lang.Float) animatedValue).floatValue());
        }
        int i17 = this.f95173e.f391649d;
        java.lang.Object animatedValue2 = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = i17 - ((int) (i17 * ((java.lang.Float) animatedValue2).floatValue()));
        java.lang.Object mo141623x754a37bb = ((jz5.n) n1Var.f95252u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(java.lang.String.valueOf(floatValue));
    }
}
