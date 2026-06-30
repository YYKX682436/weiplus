package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.conf.CSFileUpdateReq */
/* loaded from: classes13.dex */
public final class C4365x53be5a69 extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: a, reason: collision with root package name */
    static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9> f130221a = new java.util.ArrayList<>();

    /* renamed from: sAppId */
    public java.lang.String f17232xc805de69;

    /* renamed from: sCity */
    public java.lang.String f17233x6749c7e;

    /* renamed from: sEngineVersion */
    public java.lang.String f17234x51d6ce83;
    public java.lang.String sId;

    /* renamed from: sSDKVersion */
    public java.lang.String f17235x5fdf5011;

    /* renamed from: vItems */
    public java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9> f17236xcd96d0ea;

    static {
        f130221a.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9());
    }

    public C4365x53be5a69() {
        this.f17236xcd96d0ea = null;
        this.f17232xc805de69 = "";
        this.f17235x5fdf5011 = "";
        this.f17233x6749c7e = "";
        this.f17234x51d6ce83 = "";
        this.sId = "";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "MapConfProtocol.CSFileUpdateReq";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17236xcd96d0ea = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130221a, 0, true);
        this.f17232xc805de69 = mVar.b(1, false);
        this.f17235x5fdf5011 = mVar.b(2, false);
        this.f17233x6749c7e = mVar.b(3, false);
        this.f17234x51d6ce83 = mVar.b(4, false);
        this.sId = mVar.b(5, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: toString */
    public final java.lang.String mo36075x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CSFileUpdateReq{vItems=");
        stringBuffer.append(this.f17236xcd96d0ea);
        stringBuffer.append(", sAppId='");
        stringBuffer.append(this.f17232xc805de69);
        stringBuffer.append("', sSDKVersion='");
        stringBuffer.append(this.f17235x5fdf5011);
        stringBuffer.append("', sCity='");
        stringBuffer.append(this.f17233x6749c7e);
        stringBuffer.append("', sEngineVersion='");
        stringBuffer.append(this.f17234x51d6ce83);
        stringBuffer.append("', sId='");
        stringBuffer.append(this.sId);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a((java.util.Collection) this.f17236xcd96d0ea, 0);
        java.lang.String str = this.f17232xc805de69;
        if (str != null) {
            nVar.a(str, 1);
        }
        java.lang.String str2 = this.f17235x5fdf5011;
        if (str2 != null) {
            nVar.a(str2, 2);
        }
        java.lang.String str3 = this.f17233x6749c7e;
        if (str3 != null) {
            nVar.a(str3, 3);
        }
        java.lang.String str4 = this.f17234x51d6ce83;
        if (str4 != null) {
            nVar.a(str4, 4);
        }
        java.lang.String str5 = this.sId;
        if (str5 != null) {
            nVar.a(str5, 5);
        }
    }

    public C4365x53be5a69(java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24.C4366x94692cd9> arrayList, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f17236xcd96d0ea = arrayList;
        this.f17232xc805de69 = str;
        this.f17235x5fdf5011 = str2;
        this.f17233x6749c7e = str3;
        this.f17234x51d6ce83 = str4;
        this.sId = str5;
    }
}
