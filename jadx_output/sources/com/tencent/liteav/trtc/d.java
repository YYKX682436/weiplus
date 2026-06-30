package com.tencent.liteav.trtc;

/* loaded from: classes16.dex */
final /* synthetic */ class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener f46621a;

    /* renamed from: b, reason: collision with root package name */
    private final android.graphics.Bitmap f46622b;

    private d(com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        this.f46621a = tRTCSnapshotListener;
        this.f46622b = bitmap;
    }

    public static java.lang.Runnable a(com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        return new com.tencent.liteav.trtc.d(tRTCSnapshotListener, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteav.trtc.TrtcCloudJni.lambda$onSnapshotComplete$2(this.f46621a, this.f46622b);
    }
}
