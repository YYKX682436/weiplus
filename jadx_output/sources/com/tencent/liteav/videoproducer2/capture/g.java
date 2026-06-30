package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener f47187a;

    private g(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f47187a = nativeScreenCaptureListener;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener) {
        return new com.tencent.liteav.videoproducer2.capture.g(nativeScreenCaptureListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47187a.notifyCaptureError();
    }
}
