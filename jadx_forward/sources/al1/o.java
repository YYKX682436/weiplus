package al1;

/* loaded from: classes7.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al1.q f87329d;

    public o(al1.q qVar) {
        this.f87329d = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f87329d.setAlpha(e06.p.e(((java.lang.Float) animatedValue).floatValue(), 0.0f, 1.0f));
    }
}
