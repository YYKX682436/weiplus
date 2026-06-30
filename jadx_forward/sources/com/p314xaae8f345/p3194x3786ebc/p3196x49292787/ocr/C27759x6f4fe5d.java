package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.CertificateDetector */
/* loaded from: classes14.dex */
public class C27759x6f4fe5d {

    /* renamed from: nativeObject */
    private long f60693x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27759x6f4fe5d(int i17, java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60693x875b3236 = 0L;
        this.f60693x875b3236 = m119891xfe168d52(i17, str, c27754x55cfdd69);
    }

    /* renamed from: createNativeObject */
    private native long m119891xfe168d52(int i17, java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119892x9677ff50(long j17);

    /* renamed from: detect */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27758xd7c8e977 m119893xb06a26a3(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: setThreshold */
    private native void m119894xffa31629(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: destroy */
    public void m119895x5cd39ffa() {
        m119892x9677ff50(this.f60693x875b3236);
        this.f60693x875b3236 = 0L;
    }

    /* renamed from: detect */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27758xd7c8e977 m119896xb06a26a3(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119893xb06a26a3(this.f60693x875b3236, c27752xfde37e46);
    }

    /* renamed from: setThreshold */
    public void m119897xffa31629(int i17, int i18, int i19, int i27) {
        m119894xffa31629(this.f60693x875b3236, i17, i18, i19, i27);
    }
}
