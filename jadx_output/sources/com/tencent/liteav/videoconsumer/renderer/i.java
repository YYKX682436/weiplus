package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.e f46962a;

    private i(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        this.f46962a = eVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        return new com.tencent.liteav.videoconsumer.renderer.i(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46962a.b();
    }
}
