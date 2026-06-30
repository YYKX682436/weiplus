package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p523x2eaf24;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.conf.FileUpdateReq */
/* loaded from: classes13.dex */
public final class C4366x94692cd9 extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: iVersion */
    public int f17237x13891c2f;

    /* renamed from: sMd5 */
    public java.lang.String f17238x35740b;

    /* renamed from: sName */
    public java.lang.String f17239x6797d9e;

    public C4366x94692cd9() {
        this.f17239x6797d9e = "";
        this.f17237x13891c2f = 0;
        this.f17238x35740b = "";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "MapConfProtocol.FileUpdateReq";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17239x6797d9e = mVar.b(0, true);
        this.f17237x13891c2f = mVar.a(this.f17237x13891c2f, 1, true);
        this.f17238x35740b = mVar.b(2, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: toString */
    public final java.lang.String mo36075x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FileUpdateReq{sName='");
        stringBuffer.append(this.f17239x6797d9e);
        stringBuffer.append("', iVersion=");
        stringBuffer.append(this.f17237x13891c2f);
        stringBuffer.append(", sMd5='");
        stringBuffer.append(this.f17238x35740b);
        stringBuffer.append("'}");
        return stringBuffer.toString();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17239x6797d9e, 0);
        nVar.a(this.f17237x13891c2f, 1);
        java.lang.String str = this.f17238x35740b;
        if (str != null) {
            nVar.a(str, 2);
        }
    }

    public C4366x94692cd9(java.lang.String str, int i17, java.lang.String str2) {
        this.f17239x6797d9e = str;
        this.f17237x13891c2f = i17;
        this.f17238x35740b = str2;
    }
}
