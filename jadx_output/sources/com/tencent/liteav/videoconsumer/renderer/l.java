package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j f46981a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.TextureView f46982b;

    private l(com.tencent.liteav.videoconsumer.renderer.j jVar, android.view.TextureView textureView) {
        this.f46981a = jVar;
        this.f46982b = textureView;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j jVar, android.view.TextureView textureView) {
        return new com.tencent.liteav.videoconsumer.renderer.l(jVar, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46981a.a(this.f46982b);
    }
}
