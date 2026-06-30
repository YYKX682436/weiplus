package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.PaymentCodeClassifier */
/* loaded from: classes14.dex */
public class C27766xc0682b74 {

    /* renamed from: nativeObject */
    private long f60727x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27766xc0682b74(java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60727x875b3236 = 0L;
        this.f60727x875b3236 = m119912xfe168d52(str, c27754x55cfdd69);
    }

    /* renamed from: classify */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27765x79188f3 m119911x2945da84(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, android.graphics.PointF[] pointFArr);

    /* renamed from: createNativeObject */
    private native long m119912xfe168d52(java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119913x9677ff50(long j17);

    /* renamed from: classify */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr.C27765x79188f3 m119914x2945da84(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46, android.graphics.PointF[] pointFArr) {
        return m119911x2945da84(this.f60727x875b3236, c27752xfde37e46, pointFArr);
    }

    /* renamed from: destroy */
    public void m119915x5cd39ffa() {
        m119913x9677ff50(this.f60727x875b3236);
        this.f60727x875b3236 = 0L;
    }
}
