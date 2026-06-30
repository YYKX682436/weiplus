package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p404xde2883f6;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer.consumer.NativeSnapshotListener */
/* loaded from: classes7.dex */
public class C3830x8ec42cef {

    /* renamed from: mNativeVideoSnapListener */
    private long f14996x6add2435;

    private C3830x8ec42cef(long j17) {
        this.f14996x6add2435 = j17;
    }

    /* renamed from: nativeDestroy */
    private native void m31268x23caefe3(long j17);

    /* renamed from: nativeOnComplete */
    private native void m31269x675b8faf(long j17, android.graphics.Bitmap bitmap);

    /* renamed from: finalize */
    public void m31270xd764dc1e() {
        long j17 = this.f14996x6add2435;
        if (j17 != 0) {
            m31268x23caefe3(j17);
            this.f14996x6add2435 = 0L;
        }
        super.finalize();
    }

    /* renamed from: onComplete */
    public void m31271x815f5438(android.graphics.Bitmap bitmap) {
        long j17 = this.f14996x6add2435;
        if (j17 != 0) {
            m31269x675b8faf(j17, bitmap);
            this.f14996x6add2435 = 0L;
        }
    }
}
