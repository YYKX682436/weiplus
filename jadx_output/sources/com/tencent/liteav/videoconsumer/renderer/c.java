package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.a f46944a;

    private c(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        this.f46944a = aVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        return new com.tencent.liteav.videoconsumer.renderer.c(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.a.b(this.f46944a);
    }
}
