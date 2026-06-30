package ch5;

/* loaded from: classes14.dex */
public final class w0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f41631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f41632f;

    public w0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41630d = mPWebSearchHomeHalfScreen;
        this.f41631e = valueAnimator;
        this.f41632f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.Window window;
        android.view.Window window2;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41630d;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
        if (C0 != null) {
            C0.c(true, false, 0);
        }
        android.app.Dialog dialog = mPWebSearchHomeHalfScreen.getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setWindowAnimations(0);
        }
        android.app.Dialog dialog2 = mPWebSearchHomeHalfScreen.getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        android.animation.ValueAnimator valueAnimator = this.f41631e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f41632f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(this.f41630d);
        if (C0 != null) {
            C0.c(true, true, 0);
        }
    }
}
