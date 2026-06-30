package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Response */
/* loaded from: classes13.dex */
public final class C4376xef917861 extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> f130241a = new java.util.ArrayList<>();

    /* renamed from: detail */
    public java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> f17307xb06a1851;

    /* renamed from: error */
    public short f17308x5c4d208;
    public java.lang.String msg;

    static {
        f130241a.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471());
    }

    public C4376xef917861() {
        this.f17308x5c4d208 = (short) 0;
        this.msg = "";
        this.f17307xb06a1851 = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17308x5c4d208 = mVar.a(this.f17308x5c4d208, 0, true);
        this.msg = mVar.b(1, false);
        this.f17307xb06a1851 = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130241a, 2, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17308x5c4d208, 0);
        java.lang.String str = this.msg;
        if (str != null) {
            nVar.a(str, 1);
        }
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> arrayList = this.f17307xb06a1851;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 2);
        }
    }

    public C4376xef917861(short s17, java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4375x79cf0471> arrayList) {
        this.f17308x5c4d208 = s17;
        this.msg = str;
        this.f17307xb06a1851 = arrayList;
    }
}
