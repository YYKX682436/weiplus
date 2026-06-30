package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public final class r1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView f89974d;

    public r1(com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView) {
        this.f89974d = appBrandCircleProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        float radius;
        float radius2;
        kotlin.jvm.internal.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = this.f89974d;
        appBrandCircleProgressView.f89347t = currentPlayTime;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        radius = appBrandCircleProgressView.getRadius();
        double d17 = floatValue;
        appBrandCircleProgressView.f89348u = radius * ((float) java.lang.Math.cos(d17));
        radius2 = appBrandCircleProgressView.getRadius();
        appBrandCircleProgressView.f89349v = radius2 * ((float) java.lang.Math.sin(d17));
        appBrandCircleProgressView.f89350w = (float) ((floatValue * 360.0f) / 6.283185307179586d);
        appBrandCircleProgressView.invalidate();
    }
}
