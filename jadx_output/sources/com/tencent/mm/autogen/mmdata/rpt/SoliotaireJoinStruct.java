package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SoliotaireJoinStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60813d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60814e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60815f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60816g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60817h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60818i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60819j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60820k = "";

    @Override // jx3.a
    public int g() {
        return 18246;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60813d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60814e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60815f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60816g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60817h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60818i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60819j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60820k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60813d);
        stringBuffer.append("\r\nLaunchUserName:");
        stringBuffer.append(this.f60814e);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60815f);
        stringBuffer.append("\r\ndeleteCount:");
        stringBuffer.append(this.f60816g);
        stringBuffer.append("\r\naddCount:");
        stringBuffer.append(this.f60817h);
        stringBuffer.append("\r\nEditScene:");
        stringBuffer.append(this.f60818i);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f60819j);
        stringBuffer.append("\r\nPunctuation:");
        stringBuffer.append(this.f60820k);
        return stringBuffer.toString();
    }
}
