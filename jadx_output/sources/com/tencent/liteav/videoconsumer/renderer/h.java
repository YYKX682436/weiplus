package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.e f46961a;

    private h(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        this.f46961a = eVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        return new com.tencent.liteav.videoconsumer.renderer.h(eVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.e.b(this.f46961a);
    }
}
