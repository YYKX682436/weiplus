package xc5;

/* loaded from: classes3.dex */
public final class t1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.x1 f535104d;

    public t1(xc5.x1 x1Var) {
        this.f535104d = x1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        lf3.i iVar = this.f535104d.f535123h;
        if (iVar != null) {
            java.lang.Object animatedValue = animation.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            ((yh5.e) iVar).W6(((java.lang.Float) animatedValue).floatValue());
        }
    }
}
