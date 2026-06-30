package kj2;

/* loaded from: classes10.dex */
public final class h0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.j0 f389936d;

    public h0(kj2.j0 j0Var) {
        this.f389936d = j0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        kj2.j0 j0Var = this.f389936d;
        android.view.ViewGroup mo124433x9681e6d = j0Var.mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setAlpha(floatValue);
        }
        android.view.ViewGroup mo124433x9681e6d2 = j0Var.mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(i65.a.b(j0Var.getContext(), 12) * floatValue);
    }
}
