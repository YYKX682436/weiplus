package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272221d;

    public v0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272221d = c19666xfd6e2f33;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setFloatValues(1.0f, 0.0f);
        valueAnimator.setDuration(150L);
        valueAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        valueAnimator.start();
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t0(this));
        valueAnimator.addListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u0(this));
    }
}
