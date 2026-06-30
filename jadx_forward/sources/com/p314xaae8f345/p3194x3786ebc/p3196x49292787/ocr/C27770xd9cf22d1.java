package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.TextRecognizer */
/* loaded from: classes14.dex */
public class C27770xd9cf22d1 {

    /* renamed from: nativeObject */
    private long f60733x875b3236;

    /* renamed from: com.tencent.wevision2.modules.ocr.TextRecognizer$Options */
    /* loaded from: classes14.dex */
    public static class Options {
    }

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27770xd9cf22d1(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60733x875b3236 = 0L;
        this.f60733x875b3236 = m119929xfe168d52(str, str2, str3, c27754x55cfdd69);
    }

    /* renamed from: createNativeObject */
    private native long m119929xfe168d52(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119930x9677ff50(long j17);

    /* renamed from: detect */
    private native android.graphics.PointF[][] m119931xb06a26a3(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: locateKeyword */
    private native android.graphics.PointF[][] m119932x77192637(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, java.lang.String str, int i17);

    /* renamed from: recognize */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27769x27b94d[] m119933x3aa2088e(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: recognizeText */
    private native java.lang.String m119934x9256cadb(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: recognizeTexts */
    private native java.lang.String[] m119935xb88290f8(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: setOptions */
    private native void m119936x66c50fdc(long j17, com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1.Options options);

    /* renamed from: destroy */
    public void m119937x5cd39ffa() {
        m119930x9677ff50(this.f60733x875b3236);
        this.f60733x875b3236 = 0L;
    }

    /* renamed from: detect */
    public android.graphics.PointF[][] m119938xb06a26a3(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119931xb06a26a3(this.f60733x875b3236, c27752xfde37e46);
    }

    /* renamed from: locateKeyword */
    public android.graphics.PointF[][] m119939x77192637(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, java.lang.String str, int i17) {
        return m119932x77192637(this.f60733x875b3236, c27752xfde37e46, str, i17);
    }

    /* renamed from: recognize */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27769x27b94d[] m119940x3aa2088e(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119933x3aa2088e(this.f60733x875b3236, c27752xfde37e46);
    }

    /* renamed from: recognizeText */
    public java.lang.String m119941x9256cadb(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119934x9256cadb(this.f60733x875b3236, c27752xfde37e46);
    }

    /* renamed from: recognizeTexts */
    public java.lang.String[] m119942xb88290f8(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119935xb88290f8(this.f60733x875b3236, c27752xfde37e46);
    }

    /* renamed from: setOptions */
    public void m119943x66c50fdc(com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27770xd9cf22d1.Options options) {
        m119936x66c50fdc(this.f60733x875b3236, options);
    }
}
