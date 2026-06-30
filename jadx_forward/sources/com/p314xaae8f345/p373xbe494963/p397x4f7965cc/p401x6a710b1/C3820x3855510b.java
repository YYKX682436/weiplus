package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.utils.ConsumerChainTimestamp */
/* loaded from: classes13.dex */
public class C3820x3855510b {

    /* renamed from: mDeliverTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14973x617e83fe = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: mDecodeFinishTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14972xbce54388 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: mRenderFinishTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14974x96624ee0 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: copy */
    public void m31139x2eaf75(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3820x3855510b c3820x3855510b) {
        this.f14973x617e83fe = c3820x3855510b.f14973x617e83fe;
        this.f14972xbce54388 = c3820x3855510b.f14972xbce54388;
        this.f14974x96624ee0 = c3820x3855510b.f14974x96624ee0;
    }

    /* renamed from: getDecodeFinishTimestamp */
    public long m31140x14bf503f() {
        return this.f14972xbce54388.get();
    }

    /* renamed from: getDeliverTimestamp */
    public long m31141xe33f20e7() {
        return this.f14973x617e83fe.get();
    }

    /* renamed from: getRenderFinishTimestamp */
    public long m31142xee3c5b97() {
        return this.f14974x96624ee0.get();
    }

    /* renamed from: setDecodeFinishTimestamp */
    public void m31143xe4d202b3(long j17) {
        this.f14972xbce54388.set(j17);
    }

    /* renamed from: setDeliverTimestamp */
    public void m31144x873bb5f3(long j17) {
        this.f14973x617e83fe.set(j17);
    }

    /* renamed from: setRenderFinishTimestamp */
    public void m31145xbe4f0e0b(long j17) {
        this.f14974x96624ee0.set(j17);
    }
}
