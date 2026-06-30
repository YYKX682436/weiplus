package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final /* synthetic */ class k implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.j f46978a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.rtmp.ui.TXCloudVideoView f46979b;

    /* renamed from: c, reason: collision with root package name */
    private final android.view.TextureView f46980c;

    private k(com.tencent.liteav.videoconsumer.renderer.j jVar, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView) {
        this.f46978a = jVar;
        this.f46979b = tXCloudVideoView;
        this.f46980c = textureView;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoconsumer.renderer.j jVar, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView) {
        return new com.tencent.liteav.videoconsumer.renderer.k(jVar, tXCloudVideoView, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoconsumer.renderer.j.a(this.f46978a, this.f46979b, this.f46980c);
    }
}
