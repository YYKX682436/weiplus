package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b;

/* loaded from: classes14.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 f128606a;

    /* renamed from: b, reason: collision with root package name */
    private final android.hardware.camera2.CaptureRequest f128607b;

    private d(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
        this.f128606a = anonymousClass4;
        this.f128607b = captureRequest;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4 anonymousClass4, android.hardware.camera2.CaptureRequest captureRequest) {
        return new com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.d(anonymousClass4, captureRequest);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746.b.a.AnonymousClass4.a(this.f128606a, this.f128607b);
    }
}
