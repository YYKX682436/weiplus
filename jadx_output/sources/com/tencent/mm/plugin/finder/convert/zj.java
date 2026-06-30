package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zj implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RingProgressView f105118d;

    public zj(com.tencent.mm.view.RingProgressView ringProgressView) {
        this.f105118d = ringProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.view.RingProgressView ringProgressView = this.f105118d;
        ringProgressView.setProgress(intValue);
        ringProgressView.invalidate();
    }
}
