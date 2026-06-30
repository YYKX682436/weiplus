package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j f46985a;

    private n(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        this.f46985a = jVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        return new com.tencent.liteav.videoconsumer.renderer.n(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.j.b(this.f46985a);
    }
}
