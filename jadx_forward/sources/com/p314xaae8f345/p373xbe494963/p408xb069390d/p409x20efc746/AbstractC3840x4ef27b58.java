package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.capture.CaptureSourceInterface */
/* loaded from: classes14.dex */
public abstract class AbstractC3840x4ef27b58 {
    private static final java.lang.String TAG = "CaptureSourceInterface";

    /* renamed from: com.tencent.liteav.videoproducer.capture.CaptureSourceInterface$CaptureParams */
    /* loaded from: classes14.dex */
    public static class CaptureParams {

        /* renamed from: b, reason: collision with root package name */
        public int f128531b;

        /* renamed from: c, reason: collision with root package name */
        public int f128532c;

        /* renamed from: d, reason: collision with root package name */
        public int f128533d;

        /* renamed from: equals */
        public boolean mo31356xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams)) {
                return false;
            }
            com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams captureParams = (com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams) obj;
            return this.f128531b == captureParams.f128531b && this.f128532c == captureParams.f128532c && this.f128533d == captureParams.f128533d;
        }

        /* renamed from: toString */
        public java.lang.String mo31357x9616526c() {
            return java.lang.String.format(java.util.Locale.ENGLISH, "size: %dx%d, fps: %d", java.lang.Integer.valueOf(this.f128532c), java.lang.Integer.valueOf(this.f128533d), java.lang.Integer.valueOf(this.f128531b));
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.CaptureSourceInterface$CaptureSourceListener */
    /* loaded from: classes14.dex */
    public interface CaptureSourceListener {
    }

    /* renamed from: pause */
    public abstract void m31383x65825f6();

    /* renamed from: resume */
    public abstract void m31384xc84dc82d();

    /* renamed from: setServerConfig */
    public void m31385xed846de7(com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92.C3848xea956a6c c3848xea956a6c) {
    }

    /* renamed from: start */
    public abstract void m31386x68ac462(java.lang.Object obj, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams captureParams, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureSourceListener captureSourceListener);

    /* renamed from: stop */
    public abstract void m31387x360802();

    /* renamed from: updateParams */
    public abstract void m31388xc1caa3af(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureParams captureParams);
}
