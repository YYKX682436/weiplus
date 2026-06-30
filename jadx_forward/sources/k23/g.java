package k23;

/* loaded from: classes12.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f385105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f385106e;

    public g(k23.q qVar, android.animation.ValueAnimator valueAnimator) {
        this.f385105d = qVar;
        this.f385106e = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d e17 = this.f385105d.m141837x5db1ca2().e();
        java.lang.Object animatedValue = this.f385106e.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        e17.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }
}
