package bh5;

/* loaded from: classes3.dex */
public final class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f20931d;

    public f0(android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f20931d = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.animation.ValueAnimator valueAnimator = this.f20931d;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(bh5.g0.f20935d);
    }
}
