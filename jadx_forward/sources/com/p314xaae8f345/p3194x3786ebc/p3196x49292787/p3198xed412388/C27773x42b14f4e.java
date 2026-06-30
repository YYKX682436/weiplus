package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3198xed412388;

/* renamed from: com.tencent.wevision2.modules.privacy.PrivacyDetector */
/* loaded from: classes14.dex */
public class C27773x42b14f4e {

    /* renamed from: nativeObject */
    private long f60737x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27773x42b14f4e(java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60737x875b3236 = 0L;
        this.f60737x875b3236 = m119950xfe168d52(str, c27754x55cfdd69);
    }

    /* renamed from: createNativeObject */
    private native long m119950xfe168d52(java.lang.String str, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119951x9677ff50(long j17);

    /* renamed from: detect */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3198xed412388.C27772xbcfd0c15[] m119952xb06a26a3(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: destroy */
    public void m119953x5cd39ffa() {
        m119951x9677ff50(this.f60737x875b3236);
        this.f60737x875b3236 = 0L;
    }

    /* renamed from: detect */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3198xed412388.C27772xbcfd0c15[] m119954xb06a26a3(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119952xb06a26a3(this.f60737x875b3236, c27752xfde37e46);
    }
}
