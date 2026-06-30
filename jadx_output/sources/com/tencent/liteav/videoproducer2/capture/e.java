package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener f47182a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f47183b;

    private e(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        this.f47182a = nativeScreenCaptureListener;
        this.f47183b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.tencent.liteav.videoproducer2.capture.e(nativeScreenCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47182a.notifyFrameAvailable(this.f47183b);
    }
}
