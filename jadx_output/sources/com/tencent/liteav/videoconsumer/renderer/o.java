package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class o implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j f46986a;

    private o(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        this.f46986a = jVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        return new com.tencent.liteav.videoconsumer.renderer.o(jVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.b(this.f46986a.f46970h);
    }
}
