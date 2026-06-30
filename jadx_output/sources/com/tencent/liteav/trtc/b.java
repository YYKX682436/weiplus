package com.tencent.liteav.trtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.trtc.TrtcCloudJni f46618a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams f46619b;

    private b(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f46618a = trtcCloudJni;
        this.f46619b = tRTCScreenShareParams;
    }

    public static java.lang.Runnable a(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        return new com.tencent.liteav.trtc.b(trtcCloudJni, tRTCScreenShareParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46618a.showFloatingWindow(this.f46619b.floatingView);
    }
}
