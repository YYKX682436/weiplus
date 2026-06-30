package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.e f46958a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.SurfaceView f46959b;

    private f(com.tencent.liteav.videoconsumer.renderer.e eVar, android.view.SurfaceView surfaceView) {
        this.f46958a = eVar;
        this.f46959b = surfaceView;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.e eVar, android.view.SurfaceView surfaceView) {
        return new com.tencent.liteav.videoconsumer.renderer.f(eVar, surfaceView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.e.a(this.f46958a, this.f46959b);
    }
}
