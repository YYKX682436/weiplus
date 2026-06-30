package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener */
/* loaded from: classes16.dex */
public class C3853xd6178817 implements android.graphics.SurfaceTexture.OnFrameAvailableListener, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener {

    /* renamed from: mCallbackHandler */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f15109xe0431718 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.myLooper());

    /* renamed from: mNativeHandle */
    private long f15110x12f2162c;

    public C3853xd6178817(long j17) {
        this.f15110x12f2162c = j17;
    }

    /* renamed from: nativeOnCaptureError */
    private static native void m31595x6f7fe9d8(long j17);

    /* renamed from: nativeOnFrameAvailable */
    private static native void m31596x7f8b79d2(long j17, android.graphics.SurfaceTexture surfaceTexture);

    /* renamed from: nativeOnStartFinish */
    private static native void m31597x3a13715f(long j17, boolean z17, boolean z18);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyCaptureError */
    public synchronized void m31598x71cefc4b() {
        long j17 = this.f15110x12f2162c;
        if (j17 != 0) {
            m31595x6f7fe9d8(j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyFrameAvailable */
    public synchronized void m31599x2a5fbb85(android.graphics.SurfaceTexture surfaceTexture) {
        long j17 = this.f15110x12f2162c;
        if (j17 != 0) {
            m31596x7f8b79d2(j17, surfaceTexture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyStartFinish */
    public synchronized void m31600x5b2ec48c(boolean z17, boolean z18) {
        long j17 = this.f15110x12f2162c;
        if (j17 != 0) {
            m31597x3a13715f(j17, z17, z18);
        }
    }

    /* renamed from: getCallbackHandler */
    public android.os.Handler m31601xf4f6b90f() {
        return this.f15109xe0431718;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener
    /* renamed from: onCaptureError */
    public void mo31419xa18c41e1() {
        this.f15109xe0431718.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.g.a(this));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f15109xe0431718.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.e.a(this, surfaceTexture));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.C3844x7a121c56.VirtualDisplayListener
    /* renamed from: onStartFinish */
    public void mo31420x96877436(boolean z17, boolean z18) {
        this.f15109xe0431718.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.f.a(this, z17, z18));
    }

    /* renamed from: resetNativeHandle */
    public synchronized void m31602xfcc9f00e() {
        this.f15110x12f2162c = 0L;
    }
}
