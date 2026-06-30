package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.BatchDownloadActionRequest */
/* loaded from: classes13.dex */
public final class C26720xd19704d7 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_batchData */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249> f56484xdcd6bd87;

    /* renamed from: batchData */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249> f56485xc5a10e04;

    /* renamed from: batchRequestType */
    public int f56486xc346fecf;
    public java.lang.String uin;

    /* renamed from: uinType */
    public java.lang.String f56487xe69c0ab4;
    public java.lang.String via;

    public C26720xd19704d7() {
        this.f56486xc346fecf = 0;
        this.f56485xc5a10e04 = null;
        this.uin = "";
        this.f56487xe69c0ab4 = "";
        this.via = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56486xc346fecf = c2859xe10ac61e.m21299x355996(this.f56486xc346fecf, 0, true);
        if (f56484xdcd6bd87 == null) {
            f56484xdcd6bd87 = new java.util.ArrayList<>();
            f56484xdcd6bd87.add(new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249());
        }
        this.f56485xc5a10e04 = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56484xdcd6bd87, 1, false);
        this.uin = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56487xe69c0ab4 = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.via = c2859xe10ac61e.m21321xe22f9d47(4, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56486xc346fecf, 0);
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249> arrayList = this.f56485xc5a10e04;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 1);
        }
        java.lang.String str = this.uin;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 2);
        }
        java.lang.String str2 = this.f56487xe69c0ab4;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 3);
        }
        java.lang.String str3 = this.via;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 4);
        }
    }

    public C26720xd19704d7(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26726xb4dee249> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f56486xc346fecf = i17;
        this.f56485xc5a10e04 = arrayList;
        this.uin = str;
        this.f56487xe69c0ab4 = str2;
        this.via = str3;
    }
}
