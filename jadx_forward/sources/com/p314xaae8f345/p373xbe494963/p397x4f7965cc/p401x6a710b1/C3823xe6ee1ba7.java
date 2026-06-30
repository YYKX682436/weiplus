package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.utils.ProducerChainTimestamp */
/* loaded from: classes13.dex */
public class C3823xe6ee1ba7 {

    /* renamed from: mCaptureTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14975xffc81afd = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: mPreprocessTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14978x440a125d = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: mEncodeTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14977xe848b373 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: mEncodeFinishTimestamp */
    private java.util.concurrent.atomic.AtomicLong f14976xee2ec260 = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: copy */
    public void m31185x2eaf75(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 c3823xe6ee1ba7) {
        this.f14975xffc81afd = c3823xe6ee1ba7.f14975xffc81afd;
        this.f14978x440a125d = c3823xe6ee1ba7.f14978x440a125d;
        this.f14977xe848b373 = c3823xe6ee1ba7.f14977xe848b373;
        this.f14976xee2ec260 = c3823xe6ee1ba7.f14976xee2ec260;
    }

    /* renamed from: getCaptureTimestamp */
    public long m31186x8188b7e6() {
        return this.f14975xffc81afd.get();
    }

    /* renamed from: getEncodeFinishTimestamp */
    public long m31187x4608cf17() {
        return this.f14976xee2ec260.get();
    }

    /* renamed from: getEncodeTimestamp */
    public long m31188xfcfc556a() {
        return this.f14977xe848b373.get();
    }

    /* renamed from: getPreprocessTimestamp */
    public long m31189xb19de0d4() {
        return this.f14978x440a125d.get();
    }

    /* renamed from: setCaptureTimestamp */
    public void m31190x25854cf2(long j17) {
        this.f14975xffc81afd.set(j17);
    }

    /* renamed from: setEncodeFinishTimestamp */
    public void m31191x161b818b(long j17) {
        this.f14976xee2ec260.set(j17);
    }

    /* renamed from: setEncodeTimestamp */
    public void m31192x33d2eede(long j17) {
        this.f14977xe848b373.set(j17);
    }

    /* renamed from: setPreprocessTimestamp */
    public void m31193xffe2a048(long j17) {
        this.f14978x440a125d.set(j17);
    }
}
