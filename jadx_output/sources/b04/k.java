package b04;

/* loaded from: classes2.dex */
public final class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16921d;

    public k(android.widget.ImageView imageView) {
        this.f16921d = imageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.widget.ImageView imageView = this.f16921d;
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        imageView.setAlpha(floatValue);
    }
}
