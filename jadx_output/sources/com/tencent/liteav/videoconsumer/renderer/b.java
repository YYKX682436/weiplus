package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.a f46942a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.Surface f46943b;

    private b(com.tencent.liteav.videoconsumer.renderer.a aVar, android.view.Surface surface) {
        this.f46942a = aVar;
        this.f46943b = surface;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.a aVar, android.view.Surface surface) {
        return new com.tencent.liteav.videoconsumer.renderer.b(aVar, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.a.a(this.f46942a, this.f46943b);
    }
}
