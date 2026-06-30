package com.tencent.liteav.trtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.trtc.TrtcCloudJni f46620a;

    private c(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni) {
        this.f46620a = trtcCloudJni;
    }

    public static java.lang.Runnable a(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni) {
        return new com.tencent.liteav.trtc.c(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46620a.hideFloatingWindow();
    }
}
