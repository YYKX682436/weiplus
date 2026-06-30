package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.ApkDownUrl */
/* loaded from: classes13.dex */
public final class C26739x2105efd1 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cache_urlList */
    static java.util.ArrayList<java.lang.String> f56577xfaa94ef0;

    /* renamed from: type */
    public byte f56578x368f3a;

    /* renamed from: urlList */
    public java.util.ArrayList<java.lang.String> f56579xf5d79aad;

    public C26739x2105efd1() {
        this.f56578x368f3a = (byte) 0;
        this.f56579xf5d79aad = null;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56578x368f3a = c2859xe10ac61e.m21296x355996(this.f56578x368f3a, 0, true);
        if (f56577xfaa94ef0 == null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            f56577xfaa94ef0 = arrayList;
            arrayList.add("");
        }
        this.f56579xf5d79aad = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f56577xfaa94ef0, 1, true);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21335x6c257df(this.f56578x368f3a, 0);
        c2860x6de9642d.m21350x6c257df((java.util.Collection) this.f56579xf5d79aad, 1);
    }

    public C26739x2105efd1(byte b17, java.util.ArrayList<java.lang.String> arrayList) {
        this.f56578x368f3a = b17;
        this.f56579xf5d79aad = arrayList;
    }
}
