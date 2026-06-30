package ch5;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f123105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f123106f;

    public h(yz5.a aVar, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f123104d = aVar;
        this.f123105e = valueAnimator;
        this.f123106f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        yz5.a aVar = this.f123104d;
        if (aVar != null) {
        }
        android.animation.ValueAnimator valueAnimator = this.f123105e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f123106f);
    }
}
