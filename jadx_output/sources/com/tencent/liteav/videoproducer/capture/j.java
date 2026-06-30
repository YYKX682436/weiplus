package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes13.dex */
final /* synthetic */ class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47089a;

    private j(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager) {
        this.f47089a = virtualDisplayManager;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager) {
        return new com.tencent.liteav.videoproducer.capture.j(virtualDisplayManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.c(this.f47089a);
    }
}
