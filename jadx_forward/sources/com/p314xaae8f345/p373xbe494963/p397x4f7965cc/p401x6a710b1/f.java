package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

/* loaded from: classes14.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3824x47b9471a f128357a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f128358b;

    private f(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3824x47b9471a c3824x47b9471a, android.graphics.SurfaceTexture surfaceTexture) {
        this.f128357a = c3824x47b9471a;
        this.f128358b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3824x47b9471a c3824x47b9471a, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.f(c3824x47b9471a, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3824x47b9471a.m31194xe282ad64(this.f128357a, this.f128358b);
    }
}
