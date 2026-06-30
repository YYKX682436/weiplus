package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse */
/* loaded from: classes13.dex */
public final class C26744xcb4325af extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_appSimpleDetailList */
    static java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544> f56634xd02287e5;

    /* renamed from: appSimpleDetailList */
    public java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544> f56635xeff42022;
    public int ret;

    public C26744xcb4325af() {
        this.ret = 0;
        this.f56635xeff42022 = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.ret = c2859xe10ac61e.m21299x355996(this.ret, 0, true);
        if (f56634xd02287e5 == null) {
            f56634xd02287e5 = new java.util.ArrayList<>();
            f56634xd02287e5.add(new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544());
        }
        this.f56635xeff42022 = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56634xd02287e5, 1, true);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.ret, 0);
        c2860x6de9642d.m21350x6c257df((java.util.Collection) this.f56635xeff42022, 1);
    }

    public C26744xcb4325af(int i17, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26741x98500544> arrayList) {
        this.ret = i17;
        this.f56635xeff42022 = arrayList;
    }
}
