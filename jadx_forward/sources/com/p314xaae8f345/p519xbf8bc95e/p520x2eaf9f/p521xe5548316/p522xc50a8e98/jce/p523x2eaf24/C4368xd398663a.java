package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.conf.SCFileUpdateRsp */
/* loaded from: classes13.dex */
public final class C4368xd398663a extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> f130222a = new java.util.ArrayList<>();

    /* renamed from: iRet */
    public int f17247x30fb78;

    /* renamed from: vItems */
    public java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> f17248xcd96d0ea;

    static {
        f130222a.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a());
    }

    public C4368xd398663a() {
        this.f17247x30fb78 = 0;
        this.f17248xcd96d0ea = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "MapConfProtocol.SCFileUpdateRsp";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17247x30fb78 = mVar.a(this.f17247x30fb78, 0, true);
        this.f17248xcd96d0ea = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130222a, 1, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: toString */
    public final java.lang.String mo36075x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SCFileUpdateRsp{iRet=");
        stringBuffer.append(this.f17247x30fb78);
        stringBuffer.append(", vItems=");
        stringBuffer.append(this.f17248xcd96d0ea);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17247x30fb78, 0);
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> arrayList = this.f17248xcd96d0ea;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 1);
        }
    }

    public C4368xd398663a(int i17, java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4367x94692e8a> arrayList) {
        this.f17247x30fb78 = i17;
        this.f17248xcd96d0ea = arrayList;
    }
}
