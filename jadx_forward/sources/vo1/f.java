package vo1;

/* loaded from: classes3.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f520047d;

    public f(android.view.View view) {
        this.f520047d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f520047d;
        int width = view.getWidth();
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setClipBounds(new android.graphics.Rect(0, 0, width, ((java.lang.Integer) animatedValue).intValue()));
    }
}
