package bh5;

/* loaded from: classes14.dex */
public final class v0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f20966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment f20967e;

    public v0(android.view.ViewGroup.LayoutParams layoutParams, com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment mMHalfScreenMaxHeightDialogFragment) {
        this.f20966d = layoutParams;
        this.f20967e = mMHalfScreenMaxHeightDialogFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f20966d;
        layoutParams.height = intValue;
        com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment mMHalfScreenMaxHeightDialogFragment = this.f20967e;
        mMHalfScreenMaxHeightDialogFragment.o0().setLayoutParams(layoutParams);
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = mMHalfScreenMaxHeightDialogFragment.f208812p;
    }
}
