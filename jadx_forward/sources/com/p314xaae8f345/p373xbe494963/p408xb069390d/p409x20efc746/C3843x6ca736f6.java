package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.capture.NativeVideoCaptureListener */
/* loaded from: classes14.dex */
class C3843x6ca736f6 implements com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.c, com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58.CaptureSourceListener {
    private static final java.lang.String TAG = "NativeVideoCaptureListener";

    /* renamed from: mNativeHandler */
    private long f15044x4b50afc6;

    public C3843x6ca736f6(long j17) {
        this.f15044x4b50afc6 = j17;
    }

    /* renamed from: nativeOnAutoFocusEnabled */
    private static native void m31397x6d18d70e(long j17, boolean z17);

    /* renamed from: nativeOnCaptureError */
    private static native void m31398x6f7fe9d8(long j17, int i17, java.lang.String str);

    /* renamed from: nativeOnCaptureFirstFrame */
    private static native void m31399xa945ecd(long j17);

    /* renamed from: nativeOnCapturePaused */
    private static native void m31400x92547b5e(long j17);

    /* renamed from: nativeOnCaptureResumed */
    private static native void m31401x28bfa1a7(long j17);

    /* renamed from: nativeOnCaptureStopped */
    private static native void m31402x7703f59d(long j17);

    /* renamed from: nativeOnFrameAvailable */
    private static native void m31403x7f8b79d2(long j17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7);

    /* renamed from: nativeOnScreenDisplayOrientationChanged */
    private static native void m31404x3f3830e4(long j17, int i17);

    /* renamed from: nativeOnStartFinish */
    private static native void m31405x3a13715f(long j17, boolean z17);

    /* renamed from: nativeOnZoomEnabled */
    private static native void m31406x28c421b8(long j17, boolean z17);

    /* renamed from: notifyError */
    public synchronized void m31407x96b2703f(com.tencent.liteav.videobase.videobase.e.a aVar, java.lang.String str) {
        if (this.f15044x4b50afc6 == 0) {
            return;
        }
        int a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.e.a(aVar);
        if (a17 != 0) {
            m31398x6f7fe9d8(this.f15044x4b50afc6, a17, str);
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "notifyError error code:" + aVar + ", do not need transfer to LiteAvCode:" + a17);
    }

    /* renamed from: notifyEvent */
    public void m31408x96b410d1(com.tencent.liteav.videobase.videobase.e.b bVar, int i17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.c
    /* renamed from: notifyWarning */
    public synchronized void mo31253x4f049c13(com.tencent.liteav.videobase.videobase.e.c cVar, java.lang.String str) {
    }

    /* renamed from: onCameraTouchEnable */
    public synchronized void m31410x679efd1e(boolean z17) {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31397x6d18d70e(j17, !z17);
        }
    }

    /* renamed from: onCameraZoomEnable */
    public synchronized void m31411x4e94343a(boolean z17) {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31406x28c421b8(j17, z17);
        }
    }

    /* renamed from: onCaptureError */
    public synchronized void m31412xa18c41e1() {
    }

    /* renamed from: onCaptureFirstFrame */
    public synchronized void m31413x79daa464() {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31399xa945ecd(j17);
        }
    }

    /* renamed from: onFrameAvailable */
    public synchronized void m31414x5fe1f39b(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.AbstractC3840x4ef27b58 abstractC3840x4ef27b58, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31403x7f8b79d2(j17, c3817x73c266a7);
        }
    }

    /* renamed from: onScreenDisplayOrientationChanged */
    public synchronized void m31415xa00d623b(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31404x3f3830e4(j17, com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(kVar));
        }
    }

    /* renamed from: onStartFinish */
    public synchronized void m31416x96877436(boolean z17) {
        long j17 = this.f15044x4b50afc6;
        if (j17 != 0) {
            m31405x3a13715f(j17, z17);
        }
    }

    /* renamed from: resetNativeHandle */
    public synchronized void m31417xfcc9f00e() {
        this.f15044x4b50afc6 = 0L;
    }

    /* renamed from: updateStatus */
    public synchronized void m31418xc7ed7a1b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.f fVar, java.lang.Object obj) {
    }

    /* renamed from: notifyEvent */
    public synchronized void m31409x96b410d1(com.tencent.liteav.videobase.videobase.e.b bVar, java.lang.Object obj, java.lang.String str) {
        long j17 = this.f15044x4b50afc6;
        if (j17 == 0) {
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_FIRST_FRAME) {
            m31399xa945ecd(j17);
            return;
        }
        if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_INTERRUPTED) {
            m31400x92547b5e(j17);
        } else if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_RESUME) {
            m31401x28bfa1a7(j17);
        } else {
            if (bVar == com.tencent.liteav.videobase.videobase.e.b.EVT_VIDEO_CAPTURE_SCREEN_CAPTURE_STOP_SUCCESS) {
                m31402x7703f59d(j17);
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.c
    /* renamed from: updateStatus */
    public synchronized void mo31254xc7ed7a1b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.f fVar, int i17, java.lang.Object obj) {
    }
}
