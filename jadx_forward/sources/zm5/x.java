package zm5;

/* loaded from: classes3.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f555817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555818e;

    public x(zm5.f0 f0Var, int i17) {
        this.f555817d = f0Var;
        this.f555818e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        zm5.f0 f0Var = this.f555817d;
        if (floatValue <= 0.1f) {
            f0Var.Q6().setAlpha(10 * floatValue);
        } else if (floatValue >= 0.9f) {
            f0Var.Q6().setAlpha((1.0f - floatValue) * 10);
        }
        f0Var.Q6().setTranslationY(floatValue * (this.f555818e - f0Var.Q6().getHeight()));
    }
}
