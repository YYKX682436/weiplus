package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes13.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47085a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.Surface f47086b;

    private h(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface) {
        this.f47085a = virtualDisplayManager;
        this.f47086b = surface;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface) {
        return new com.tencent.liteav.videoproducer.capture.h(virtualDisplayManager, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this.f47085a, this.f47086b);
    }
}
