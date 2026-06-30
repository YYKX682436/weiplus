package fn2;

/* loaded from: classes10.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.c f345744d;

    public b(fn2.c cVar) {
        this.f345744d = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        fn2.c cVar = this.f345744d;
        if (cVar.f345764d) {
            return;
        }
        android.view.View view = cVar.f345761a;
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((java.lang.Integer) animatedValue).intValue());
    }
}
