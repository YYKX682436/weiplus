package ch5;

/* loaded from: classes14.dex */
public final class i0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41584f;

    public i0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41582d = mPWebSearchHomeHalfScreen;
        this.f41583e = valueAnimator;
        this.f41584f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41582d;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
        if (C0 != null) {
            C0.c(false, false, 0);
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C02 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
        if (C02 != null) {
            C02.b();
        }
        yz5.a aVar = mPWebSearchHomeHalfScreen.f208804e.f232620f;
        if (aVar != null) {
            aVar.invoke();
        }
        android.animation.ValueAnimator valueAnimator = this.f41583e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41584f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(this.f41582d);
        if (C0 != null) {
            C0.c(false, true, 0);
        }
    }
}
