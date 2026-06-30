package cn2;

/* loaded from: classes3.dex */
public final class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.e1 f125197d;

    public z0(cn2.e1 e1Var) {
        this.f125197d = e1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        cn2.e1 e1Var = this.f125197d;
        e1Var.f125038h = floatValue;
        if (e1Var.f125038h >= e1Var.f125034d) {
            e1Var.a().cancel();
        }
        e1Var.f125031a.invalidate();
    }
}
