package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener */
/* loaded from: classes16.dex */
public class C3852xdd289c3e implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba {

    /* renamed from: mCallbackHandler */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f15107xe0431718 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.myLooper());

    /* renamed from: mNativeHandle */
    private long f15108x12f2162c;

    public C3852xdd289c3e(long j17) {
        this.f15108x12f2162c = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnCameraError */
    public static native void m31587x3967d3ad(long j17, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnFrameAvailable */
    public static native void m31588x7f8b79d2(long j17, android.graphics.SurfaceTexture surfaceTexture);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runInNative */
    public synchronized void m31589x8d9a7d47(java.lang.Runnable runnable) {
        if (this.f15108x12f2162c != 0) {
            runnable.run();
        }
    }

    /* renamed from: getCallbackHandler */
    public android.os.Handler m31590xf4f6b90f() {
        return this.f15107xe0431718;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.InterfaceC3839xf211f5ba
    /* renamed from: onCameraError */
    public void mo31382x95dbd684(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3838xfae8f978 abstractC3838xfae8f978, int i17) {
        this.f15107xe0431718.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.a.a(this, i17));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f15107xe0431718.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.b.a(this, surfaceTexture));
    }

    /* renamed from: resetNativeHandle */
    public synchronized void m31591xfcc9f00e() {
        this.f15108x12f2162c = 0L;
    }
}
