package com.tencent.liteav.videobase.utils;

/* loaded from: classes14.dex */
final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videobase.utils.SurfaceTextureHolder f46824a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.SurfaceTexture f46825b;

    private f(com.tencent.liteav.videobase.utils.SurfaceTextureHolder surfaceTextureHolder, android.graphics.SurfaceTexture surfaceTexture) {
        this.f46824a = surfaceTextureHolder;
        this.f46825b = surfaceTexture;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videobase.utils.SurfaceTextureHolder surfaceTextureHolder, android.graphics.SurfaceTexture surfaceTexture) {
        return new com.tencent.liteav.videobase.utils.f(surfaceTextureHolder, surfaceTexture);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videobase.utils.SurfaceTextureHolder.lambda$onFrameAvailable$0(this.f46824a, this.f46825b);
    }
}
