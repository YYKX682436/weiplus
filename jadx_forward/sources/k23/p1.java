package k23;

/* loaded from: classes12.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385183d;

    public p1(k23.j2 j2Var) {
        this.f385183d = j2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f385183d.m141803xca568c10().setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
    }
}
