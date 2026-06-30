package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailRequest */
/* loaded from: classes13.dex */
public final class C26743xc463fb61 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_appReqList */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> f56632x543d45d8;

    /* renamed from: appReqList */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> f56633x84bd04fb;

    public C26743xc463fb61() {
        this.f56633x84bd04fb = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        if (f56632x543d45d8 == null) {
            f56632x543d45d8 = new java.util.ArrayList<>();
            f56632x543d45d8.add(new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb());
        }
        this.f56633x84bd04fb = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56632x543d45d8, 0, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> arrayList = this.f56633x84bd04fb;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 0);
        }
    }

    public C26743xc463fb61(java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26740xf8b7a5fb> arrayList) {
        this.f56633x84bd04fb = arrayList;
    }
}
