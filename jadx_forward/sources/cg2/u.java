package cg2;

/* loaded from: classes5.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ai1 f122669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f122670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.r f122671f;

    public u(r45.ai1 ai1Var, double d17, cg2.r rVar) {
        this.f122669d = ai1Var;
        this.f122670e = d17;
        this.f122671f = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        r45.ai1 ai1Var = this.f122669d;
        int min = java.lang.Math.min(ai1Var.m75939xb282bd08(3) + ((int) (intValue * this.f122670e)), ai1Var.m75939xb282bd08(4));
        this.f122671f.f122657f.setText(" x" + min);
    }
}
