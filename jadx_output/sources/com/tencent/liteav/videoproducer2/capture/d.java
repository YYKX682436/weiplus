package com.tencent.liteav.videoproducer2.capture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener f47180a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47181b;

    private d(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, int i17) {
        this.f47180a = nativeCameraCaptureListener;
        this.f47181b = i17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, int i17) {
        return new com.tencent.liteav.videoproducer2.capture.d(nativeCameraCaptureListener, i17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener.nativeOnCameraError(this.f47180a.mNativeHandle, this.f47181b);
    }
}
