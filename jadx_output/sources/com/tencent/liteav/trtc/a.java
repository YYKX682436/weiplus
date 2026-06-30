package com.tencent.liteav.trtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.liteav.trtc.TrtcCloudJni f46617a;

    private a(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni) {
        this.f46617a = trtcCloudJni;
    }

    public static java.lang.Runnable a(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni) {
        return new com.tencent.liteav.trtc.a(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.trtc.TrtcCloudJni.lambda$enterRoom$0(this.f46617a);
    }
}
