package com.tencent.liteav.videoproducer.capture.b;

/* loaded from: classes14.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 f47073a;

    /* renamed from: b, reason: collision with root package name */
    private final android.hardware.camera2.CaptureRequest f47074b;

    private d(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
        this.f47073a = anonymousClass4;
        this.f47074b = captureRequest;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
        return new com.tencent.liteav.videoproducer.capture.b.d(anonymousClass4, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4.a(this.f47073a, this.f47074b);
    }
}
