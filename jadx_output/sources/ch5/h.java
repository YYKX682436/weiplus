package ch5;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41573f;

    public h(yz5.a aVar, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41571d = aVar;
        this.f41572e = valueAnimator;
        this.f41573f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f41571d;
        if (aVar != null) {
        }
        android.animation.ValueAnimator valueAnimator = this.f41572e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41573f);
    }
}
