package qh2;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qh2.d f444970d;

    public b(qh2.d dVar) {
        this.f444970d = dVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        qh2.d dVar = this.f444970d;
        android.view.ViewGroup mo124433x9681e6d = dVar.mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setAlpha(floatValue);
        }
        android.view.ViewGroup mo124433x9681e6d2 = dVar.mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(i65.a.b(dVar.getContext(), 32) * floatValue);
    }
}
