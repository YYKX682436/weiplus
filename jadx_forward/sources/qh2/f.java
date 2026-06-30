package qh2;

/* loaded from: classes5.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh2.i f444974d;

    public f(qh2.i iVar) {
        this.f444974d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        qh2.i iVar = this.f444974d;
        android.view.ViewGroup mo124433x9681e6d = iVar.mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setAlpha(floatValue);
        }
        android.view.ViewGroup mo124433x9681e6d2 = iVar.mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(i65.a.b(iVar.getContext(), 32) * floatValue);
    }
}
