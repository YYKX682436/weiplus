package ch0;

/* loaded from: classes8.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch0.h f122726d;

    public b(ch0.h hVar) {
        this.f122726d = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.View view = this.f122726d.f122748b;
        if (view == null) {
            return;
        }
        view.setTranslationY(floatValue);
    }
}
