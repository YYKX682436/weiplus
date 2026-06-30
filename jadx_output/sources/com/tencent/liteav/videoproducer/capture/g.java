package com.tencent.liteav.videoproducer.capture;

/* loaded from: classes13.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager f47079a;

    /* renamed from: b, reason: collision with root package name */
    private final android.view.Surface f47080b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47081c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47082d;

    /* renamed from: e, reason: collision with root package name */
    private final android.media.projection.MediaProjection f47083e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener f47084f;

    private g(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        this.f47079a = virtualDisplayManager;
        this.f47080b = surface;
        this.f47081c = i17;
        this.f47082d = i18;
        this.f47083e = mediaProjection;
        this.f47084f = virtualDisplayListener;
    }

    public static java.lang.Runnable a(com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager, android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        return new com.tencent.liteav.videoproducer.capture.g(virtualDisplayManager, surface, i17, i18, mediaProjection, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(this.f47079a, this.f47080b, this.f47081c, this.f47082d, this.f47083e, this.f47084f);
    }
}
