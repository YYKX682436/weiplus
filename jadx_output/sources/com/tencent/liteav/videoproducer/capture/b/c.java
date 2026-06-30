package com.tencent.liteav.videoproducer.capture.b;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 f47070a;

    /* renamed from: b, reason: collision with root package name */
    private final android.hardware.camera2.TotalCaptureResult f47071b;

    /* renamed from: c, reason: collision with root package name */
    private final android.hardware.camera2.CaptureRequest f47072c;

    private c(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
        this.f47070a = anonymousClass4;
        this.f47071b = totalCaptureResult;
        this.f47072c = captureRequest;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
        return new com.tencent.liteav.videoproducer.capture.b.c(anonymousClass4, totalCaptureResult, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.b.a.AnonymousClass4.a(this.f47070a, this.f47071b, this.f47072c);
    }
}
