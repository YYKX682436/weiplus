package li2;

/* loaded from: classes10.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.o f400301d;

    public l(li2.o oVar) {
        this.f400301d = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        li2.o oVar = this.f400301d;
        android.view.ViewGroup mo124433x9681e6d = oVar.mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setAlpha(floatValue);
        }
        android.view.ViewGroup mo124433x9681e6d2 = oVar.mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(i65.a.b(oVar.getContext(), 12) * floatValue);
    }
}
