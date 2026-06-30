package ch5;

/* loaded from: classes3.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41542f;

    public c(yz5.a aVar, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41540d = aVar;
        this.f41541e = valueAnimator;
        this.f41542f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f41540d;
        if (aVar != null) {
        }
        android.animation.ValueAnimator valueAnimator = this.f41541e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41542f);
    }
}
