package ch5;

/* loaded from: classes14.dex */
public final class o extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41613f;

    public o(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41611d = circleToSearchHalfScreen;
        this.f41612e = valueAnimator;
        this.f41613f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = this.f41611d;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
        if (C0 != null) {
            C0.c(false, false, 0);
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C02 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
        if (C02 != null) {
            C02.b();
        }
        yz5.a aVar = circleToSearchHalfScreen.f208804e.f232620f;
        if (aVar != null) {
            aVar.invoke();
        }
        android.animation.ValueAnimator valueAnimator = this.f41612e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41613f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(this.f41611d);
        if (C0 != null) {
            C0.c(false, true, 0);
        }
    }
}
