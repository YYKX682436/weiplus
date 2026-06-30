package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746;

/* loaded from: classes16.dex */
final /* synthetic */ class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.C3853xd6178817 f128715a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f128716b;

    private e(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.C3853xd6178817 c3853xd6178817, android.graphics.SurfaceTexture surfaceTexture) {
        this.f128715a = c3853xd6178817;
        this.f128716b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.C3853xd6178817 c3853xd6178817, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.p314xaae8f345.p373xbe494963.p412x5cbde8c5.p413x20efc746.e(c3853xd6178817, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f128715a.m31599x2a5fbb85(this.f128716b);
    }
}
