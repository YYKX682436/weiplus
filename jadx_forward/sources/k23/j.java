package k23;

/* loaded from: classes12.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f385125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.q f385126e;

    public j(android.animation.ValueAnimator valueAnimator, k23.q qVar) {
        this.f385125d = valueAnimator;
        this.f385126e = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = this.f385125d.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        k23.q qVar = this.f385126e;
        float height = qVar.m141837x5db1ca2().a().getHeight() * 0.39999998f * (1 - floatValue);
        qVar.m141837x5db1ca2().a().setTranslationY(height);
        qVar.m141837x5db1ca2().b().setTranslationY(height);
    }
}
