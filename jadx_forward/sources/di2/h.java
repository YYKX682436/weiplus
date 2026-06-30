package di2;

/* loaded from: classes10.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di2.j f314180d;

    public h(di2.j jVar) {
        this.f314180d = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 1.0f;
        di2.j jVar = this.f314180d;
        android.view.ViewGroup mo124433x9681e6d = jVar.mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setAlpha(floatValue);
        }
        android.view.ViewGroup mo124433x9681e6d2 = jVar.mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(i65.a.b(jVar.getContext(), 12) * floatValue);
    }
}
