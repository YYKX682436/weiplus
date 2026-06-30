package bh5;

/* loaded from: classes3.dex */
public final class i0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f102472d;

    public i0(android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f102472d = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.animation.ValueAnimator valueAnimator = this.f102472d;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(bh5.j0.f102474d);
    }
}
