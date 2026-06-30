package al1;

/* loaded from: classes7.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al1.q f5796d;

    public o(al1.q qVar) {
        this.f5796d = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f5796d.setAlpha(e06.p.e(((java.lang.Float) animatedValue).floatValue(), 0.0f, 1.0f));
    }
}
