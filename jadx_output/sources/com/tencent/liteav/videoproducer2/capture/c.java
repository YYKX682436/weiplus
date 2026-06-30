package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener f47178a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f47179b;

    private c(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        this.f47178a = nativeCameraCaptureListener;
        this.f47179b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.tencent.liteav.videoproducer2.capture.c(nativeCameraCaptureListener, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener.nativeOnFrameAvailable(this.f47178a.mNativeHandle, this.f47179b);
    }
}
