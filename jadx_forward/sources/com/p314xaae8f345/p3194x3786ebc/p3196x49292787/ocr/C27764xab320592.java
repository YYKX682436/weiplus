package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.ParagraphRecognizer */
/* loaded from: classes14.dex */
public class C27764xab320592 {

    /* renamed from: nativeObject */
    private long f60717x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27764xab320592(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60717x875b3236 = 0L;
        this.f60717x875b3236 = m119905xfe168d52(str, str2, str3, str4, c27754x55cfdd69);
    }

    /* renamed from: createNativeObject */
    private native long m119905xfe168d52(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119906x9677ff50(long j17);

    /* renamed from: recognize */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27763xeba1e94e[] m119907x3aa2088e(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: destroy */
    public void m119908x5cd39ffa() {
        m119906x9677ff50(this.f60717x875b3236);
        this.f60717x875b3236 = 0L;
    }

    /* renamed from: recognize */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27763xeba1e94e[] m119909x3aa2088e(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119907x3aa2088e(this.f60717x875b3236, c27752xfde37e46);
    }
}
