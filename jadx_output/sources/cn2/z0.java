package cn2;

/* loaded from: classes3.dex */
public final class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.e1 f43664d;

    public z0(cn2.e1 e1Var) {
        this.f43664d = e1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        cn2.e1 e1Var = this.f43664d;
        e1Var.f43505h = floatValue;
        if (e1Var.f43505h >= e1Var.f43501d) {
            e1Var.a().cancel();
        }
        e1Var.f43498a.invalidate();
    }
}
