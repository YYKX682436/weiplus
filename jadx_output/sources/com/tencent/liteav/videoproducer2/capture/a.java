package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener f47174a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47175b;

    private a(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, int i17) {
        this.f47174a = nativeCameraCaptureListener;
        this.f47175b = i17;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeCameraCaptureListener nativeCameraCaptureListener, int i17) {
        return new com.tencent.liteav.videoproducer2.capture.a(nativeCameraCaptureListener, i17);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.runInNative(com.tencent.liteav.videoproducer2.capture.d.a(this.f47174a, this.f47175b));
    }
}
