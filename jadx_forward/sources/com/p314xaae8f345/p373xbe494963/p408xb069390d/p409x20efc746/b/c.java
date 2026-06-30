package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 f128603a;

    /* renamed from: b, reason: collision with root package name */
    private final android.hardware.camera2.TotalCaptureResult f128604b;

    /* renamed from: c, reason: collision with root package name */
    private final android.hardware.camera2.CaptureRequest f128605c;

    private c(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
        this.f128603a = anonymousClass4;
        this.f128604b = totalCaptureResult;
        this.f128605c = captureRequest;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.TotalCaptureResult totalCaptureResult, android.hardware.camera2.CaptureRequest captureRequest) {
        return new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.c(anonymousClass4, totalCaptureResult, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4.a(this.f128603a, this.f128604b, this.f128605c);
    }
}
