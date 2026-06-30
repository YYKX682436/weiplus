package com.tencent.liteav.videoproducer.capture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47078a;

    private f(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager) {
        this.f47078a = virtualDisplayManager;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager) {
        return new com.tencent.liteav.videoproducer.capture.f(virtualDisplayManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47078a.a(false);
    }
}
