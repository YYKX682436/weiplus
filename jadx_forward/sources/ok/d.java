package ok;

/* loaded from: classes10.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.e f427455d;

    public d(ok.e eVar) {
        this.f427455d = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("rotation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ok.e eVar = this.f427455d;
        dl.y yVar = eVar.f427456c;
        int i17 = (int) floatValue;
        xk0.f M = yVar.M(eVar.f427458e);
        if (M != null) {
            M.y(0.0f, 0.0f, 0.0f, i17);
            yVar.r();
        }
    }
}
