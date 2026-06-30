package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3199xd0ce8b26;

/* renamed from: com.tencent.wevision2.modules.wechat.WXImageClassifier */
/* loaded from: classes14.dex */
public class C27774x5b4358bb {

    /* renamed from: SCENE_APP_BRAND */
    public static final int f60738xf31af396 = 0;

    /* renamed from: SCENE_CAMERA */
    public static final int f60739x92468258 = 1;

    /* renamed from: nativeObject */
    private long f60740x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27774x5b4358bb(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69) {
        this.f60740x875b3236 = 0L;
        this.f60740x875b3236 = m119957xfe168d52(str, str2, i17, c27754x55cfdd69);
    }

    /* renamed from: classify */
    private native com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3199xd0ce8b26.C27775xd60d1ec8 m119956x2945da84(long j17, com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46);

    /* renamed from: createNativeObject */
    private native long m119957xfe168d52(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.p3194x3786ebc.dnn.C27754x55cfdd69 c27754x55cfdd69);

    /* renamed from: destroyNativeObject */
    private native void m119958x9677ff50(long j17);

    /* renamed from: classify */
    public com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3199xd0ce8b26.C27775xd60d1ec8 m119959x2945da84(com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46 c27752xfde37e46) {
        return m119956x2945da84(this.f60740x875b3236, c27752xfde37e46);
    }

    /* renamed from: destroy */
    public void m119960x5cd39ffa() {
        m119958x9677ff50(this.f60740x875b3236);
        this.f60740x875b3236 = 0L;
    }
}
