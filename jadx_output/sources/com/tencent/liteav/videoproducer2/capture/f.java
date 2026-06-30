package com.tencent.liteav.videoproducer2.capture;

/* loaded from: classes16.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener f47184a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f47185b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f47186c;

    private f(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener, boolean z17, boolean z18) {
        this.f47184a = nativeScreenCaptureListener;
        this.f47185b = z17;
        this.f47186c = z18;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer2.capture.NativeScreenCaptureListener nativeScreenCaptureListener, boolean z17, boolean z18) {
        return new com.tencent.liteav.videoproducer2.capture.f(nativeScreenCaptureListener, z17, z18);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47184a.notifyStartFinish(this.f47185b, this.f47186c);
    }
}
