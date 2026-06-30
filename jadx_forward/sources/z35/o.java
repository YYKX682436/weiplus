package z35;

/* loaded from: classes4.dex */
public final class o implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 f551564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f551565e;

    public o(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2, android.animation.ObjectAnimator objectAnimator) {
        this.f551564d = c19716x17d12db2;
        this.f551565e = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.ObjectAnimator objectAnimator;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f551564d.f272645n;
        do {
            objectAnimator = this.f551565e;
            if (atomicReference.compareAndSet(objectAnimator, null)) {
                return;
            }
        } while (atomicReference.get() == objectAnimator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
