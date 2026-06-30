package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.LanguageDetector */
/* loaded from: classes14.dex */
public class C27762x12f7b5e {

    /* renamed from: nativeObject */
    private long f60715x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27762x12f7b5e(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60715x875b3236 = 0L;
        this.f60715x875b3236 = m119899xfe168d52(str, str2, c27754x55cfdd69);
    }

    /* renamed from: createNativeObject */
    private native long m119899xfe168d52(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119900x9677ff50(long j17);

    /* renamed from: detect */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27761xa3acf778[] m119901xb06a26a3(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: destroy */
    public void m119902x5cd39ffa() {
        m119900x9677ff50(this.f60715x875b3236);
        this.f60715x875b3236 = 0L;
    }

    /* renamed from: detect */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27761xa3acf778[] m119903xb06a26a3(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119901xb06a26a3(this.f60715x875b3236, c27752xfde37e46);
    }
}
