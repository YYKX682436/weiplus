package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail */
/* loaded from: classes13.dex */
public final class C4375x79cf0471 extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: a, reason: collision with root package name */
    static com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e f130239a = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e();

    /* renamed from: b, reason: collision with root package name */
    static java.util.ArrayList<java.lang.Float> f130240b = new java.util.ArrayList<>();

    /* renamed from: basic */
    public com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e f17305x592d42e;

    /* renamed from: coord */
    public java.util.ArrayList<java.lang.Float> f17306x5a73af5;

    static {
        f130240b.add(java.lang.Float.valueOf(0.0f));
    }

    public C4375x79cf0471() {
        this.f17305x592d42e = null;
        this.f17306x5a73af5 = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17305x592d42e = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) f130239a, 0, true);
        this.f17306x5a73af5 = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130240b, 1, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) this.f17305x592d42e, 0);
        java.util.ArrayList<java.lang.Float> arrayList = this.f17306x5a73af5;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 1);
        }
    }

    public C4375x79cf0471(com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p524x324b06bd.C4374x3cfe40e c4374x3cfe40e, java.util.ArrayList<java.lang.Float> arrayList) {
        this.f17305x592d42e = c4374x3cfe40e;
        this.f17306x5a73af5 = arrayList;
    }
}
