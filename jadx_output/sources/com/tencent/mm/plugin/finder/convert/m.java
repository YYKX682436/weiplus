package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RingProgressView f103957d;

    public m(com.tencent.mm.view.RingProgressView ringProgressView) {
        this.f103957d = ringProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.RingProgressView ringProgressView = this.f103957d;
        ringProgressView.setProgress(intValue);
        ringProgressView.invalidate();
    }
}
