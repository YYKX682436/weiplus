package cg2;

/* loaded from: classes5.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ai1 f41136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f41137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cg2.r f41138f;

    public u(r45.ai1 ai1Var, double d17, cg2.r rVar) {
        this.f41136d = ai1Var;
        this.f41137e = d17;
        this.f41138f = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        r45.ai1 ai1Var = this.f41136d;
        int min = java.lang.Math.min(ai1Var.getInteger(3) + ((int) (intValue * this.f41137e)), ai1Var.getInteger(4));
        this.f41138f.f41124f.setText(" x" + min);
    }
}
