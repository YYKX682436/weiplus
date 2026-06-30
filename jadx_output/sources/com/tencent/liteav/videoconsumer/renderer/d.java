package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.a f46945a;

    private d(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        this.f46945a = aVar;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        return new com.tencent.liteav.videoconsumer.renderer.d(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.a.a(this.f46945a);
    }
}
