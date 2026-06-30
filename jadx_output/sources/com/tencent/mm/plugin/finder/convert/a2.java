package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class a2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RingProgressView f102850d;

    public a2(com.tencent.mm.view.RingProgressView ringProgressView) {
        this.f102850d = ringProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.RingProgressView ringProgressView = this.f102850d;
        ringProgressView.setProgress(intValue);
        ringProgressView.invalidate();
    }
}
