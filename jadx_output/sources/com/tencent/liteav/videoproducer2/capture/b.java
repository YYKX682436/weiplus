package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener f47176a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f47177b;

    private b(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        this.f47176a = nativeCameraCaptureListener;
        this.f47177b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.tencent.liteav.videoproducer2.capture.b(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.runInNative(com.tencent.liteav.videoproducer2.capture.c.a(this.f47176a, this.f47177b));
    }
}
