package com.tencent.liteav.videoproducer.capture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class i implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47087a;

    /* renamed from: b, reason: collision with root package name */
    private final android.media.projection.MediaProjection f47088b;

    private i(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.media.projection.MediaProjection mediaProjection) {
        this.f47087a = virtualDisplayManager;
        this.f47088b = mediaProjection;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.media.projection.MediaProjection mediaProjection) {
        return new com.tencent.liteav.videoproducer.capture.i(virtualDisplayManager, mediaProjection);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this.f47087a, this.f47088b);
    }
}
