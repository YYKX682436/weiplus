package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionResponse */
/* loaded from: classes13.dex */
public final class C26721x64714af9 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_batchData */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2> f56488xdcd6bd87;

    /* renamed from: batchData */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2> f56489xc5a10e04;

    /* renamed from: batchRequestType */
    public int f56490xc346fecf;

    public C26721x64714af9() {
        this.f56490xc346fecf = 0;
        this.f56489xc5a10e04 = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56490xc346fecf = c2859xe10ac61e.m21299x355996(this.f56490xc346fecf, 0, true);
        if (f56488xdcd6bd87 == null) {
            f56488xdcd6bd87 = new java.util.ArrayList<>();
            f56488xdcd6bd87.add(new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2());
        }
        this.f56489xc5a10e04 = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56488xdcd6bd87, 1, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56490xc346fecf, 0);
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2> arrayList = this.f56489xc5a10e04;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 1);
        }
    }

    public C26721x64714af9(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26728x7220b9a2> arrayList) {
        this.f56490xc346fecf = i17;
        this.f56489xc5a10e04 = arrayList;
    }
}
