package bh5;

/* loaded from: classes14.dex */
public final class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment f20951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f20952e;

    public o0(com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment, android.animation.ValueAnimator valueAnimator) {
        this.f20951d = mMHalfScreenDialogFragment;
        this.f20952e = valueAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        ((jz5.n) this.f20951d.A).getValue();
        this.f20952e.removeListener(this);
    }
}
