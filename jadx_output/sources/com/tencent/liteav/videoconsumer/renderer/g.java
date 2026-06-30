package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.e f46960a;

    private g(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        this.f46960a = eVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        return new com.tencent.liteav.videoconsumer.renderer.g(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.e.c(this.f46960a);
    }
}
