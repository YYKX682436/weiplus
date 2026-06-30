package com.p314xaae8f345.mm.rfx.p2589x5fb4e56;

/* renamed from: com.tencent.mm.rfx.inner.RfxPagAnimator */
/* loaded from: classes13.dex */
public class C20959x8fcda259 {

    /* renamed from: animationScale */
    private float f39156xa90d9026;

    /* renamed from: nativeAnimator */
    private long f39157xe88cd81e = 0;

    /* renamed from: weakListener */
    private java.lang.ref.WeakReference<com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g> f39158x2e53d04c;

    static {
        tq5.k.a("xlabeffect");
        m77620xb90145c7();
    }

    private C20959x8fcda259(android.content.Context context, com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar) {
        this.f39158x2e53d04c = null;
        this.f39156xa90d9026 = 1.0f;
        this.f39158x2e53d04c = new java.lang.ref.WeakReference<>(gVar);
        if (context != null) {
            this.f39156xa90d9026 = android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        m77622x67b070a6();
    }

    /* renamed from: MakeFrom */
    public static com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259 m77617x63e4ed8(android.content.Context context, com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar) {
        if (gVar == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.p2589x5fb4e56.C20959x8fcda259(context, gVar);
    }

    /* renamed from: doStart */
    private native void m77618x6c20e697();

    /* renamed from: nativeFinalize */
    private native void m77619xef578955();

    /* renamed from: nativeInit */
    private static native void m77620xb90145c7();

    /* renamed from: nativeRelease */
    private native void m77621x7f877f0();

    /* renamed from: nativeSetup */
    private native void m77622x67b070a6();

    /* renamed from: onAnimationCancel */
    private void m77623x827d33f() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77565x827d33f(this);
        }
    }

    /* renamed from: onAnimationEnd */
    private void m77624xbb3aa236() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77566xbb3aa236(this);
        }
    }

    /* renamed from: onAnimationRepeat */
    private void m77625x21f9d260() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77567x21f9d260(this);
        }
    }

    /* renamed from: onAnimationStart */
    private void m77626xd7e2f2fd() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77568xd7e2f2fd(this);
        }
    }

    /* renamed from: onAnimationUpdate */
    private void m77627x27addd8e() {
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77569x27addd8e(this);
        }
    }

    /* renamed from: cancel */
    public native void m77628xae7a2e7a();

    /* renamed from: duration */
    public native long m77629x89444d94();

    /* renamed from: finalize */
    public void m77630xd764dc1e() {
        m77619xef578955();
    }

    /* renamed from: isRunning */
    public native boolean m77631x39e05d35();

    /* renamed from: isSync */
    public native boolean m77632xb9a8f6e5();

    /* renamed from: progress */
    public native double m77633xc454c22d();

    /* renamed from: release */
    public void m77634x41012807() {
        m77621x7f877f0();
    }

    /* renamed from: repeatCount */
    public native int m77635x5dab7c34();

    /* renamed from: setDuration */
    public native void m77636xffd6ec16(long j17);

    /* renamed from: setProgress */
    public native void m77637x3ae760af(double d17);

    /* renamed from: setRepeatCount */
    public native void m77638xcde73672(int i17);

    /* renamed from: setSync */
    public native void m77639x76504a1d(boolean z17);

    /* renamed from: start */
    public void m77640x68ac462() {
        if (this.f39156xa90d9026 != 0.0f) {
            m77618x6c20e697();
            return;
        }
        com.p314xaae8f345.mm.rfx.p2589x5fb4e56.g gVar = this.f39158x2e53d04c.get();
        if (gVar != null) {
            gVar.mo77569x27addd8e(this);
            gVar.mo77566xbb3aa236(this);
        }
    }

    /* renamed from: update */
    public native void m77641xce0038c9();
}
