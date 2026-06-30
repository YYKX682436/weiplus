package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* renamed from: com.tencent.mm.rfx.inner.RfxDisplayLink */
/* loaded from: classes13.dex */
class C20957xc6196498 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: mAnimator */
    private final android.animation.ValueAnimator f39139xf597d274;

    /* renamed from: nativeDisplayLink */
    private long f39141x3fb63f45 = 0;

    /* renamed from: mHandler */
    private final android.os.Handler f39140xc7640a1d = new android.os.Handler(android.os.Looper.getMainLooper());

    private C20957xc6196498() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39139xf597d274 = ofFloat;
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(this);
        ofFloat.setRepeatCount(-1);
    }

    /* renamed from: Create */
    public static com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20957xc6196498 m77589x78ca8d1c(long j17) {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20957xc6196498 c20957xc6196498 = new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20957xc6196498();
        c20957xc6196498.f39141x3fb63f45 = j17;
        return c20957xc6196498;
    }

    /* renamed from: onUpdate */
    private native void m77591x5cf50f88(long j17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        m77591x5cf50f88(this.f39141x3fb63f45);
    }

    /* renamed from: start */
    public void m77592x68ac462() {
        this.f39140xc7640a1d.post(new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.a(this));
    }

    /* renamed from: stop */
    public void m77593x360802() {
        this.f39140xc7640a1d.post(new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.b(this));
    }
}
