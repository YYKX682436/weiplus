package com.p314xaae8f345.p3194x3786ebc.p3196x49292787.ocr;

/* renamed from: com.tencent.wevision2.modules.ocr.Reporter */
/* loaded from: classes14.dex */
public class C27768xea664901 {

    /* renamed from: nativeObject */
    private long f60729x875b3236;

    static {
        int i17 = fx5.a.f348690a;
    }

    public C27768xea664901(int i17) {
        this.f60729x875b3236 = 0L;
        this.f60729x875b3236 = m119923xfe168d52(i17);
    }

    /* renamed from: createNativeObject */
    private native long m119923xfe168d52(int i17);

    /* renamed from: destroyNativeObject */
    private native void m119924x9677ff50(long j17);

    /* renamed from: purgeData */
    private native java.lang.String m119925x9bd346f5(long j17);

    /* renamed from: destroy */
    public void m119926x5cd39ffa() {
        m119924x9677ff50(this.f60729x875b3236);
        this.f60729x875b3236 = 0L;
    }

    /* renamed from: purgeData */
    public java.lang.String m119927x9bd346f5() {
        return m119925x9bd346f5(this.f60729x875b3236);
    }
}
