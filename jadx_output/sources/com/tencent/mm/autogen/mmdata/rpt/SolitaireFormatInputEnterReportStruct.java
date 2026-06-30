package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SolitaireFormatInputEnterReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60840d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60841e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60842f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60843g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f60844h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60845i = "";

    @Override // jx3.a
    public int g() {
        return 18256;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60840d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60841e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60842f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60843g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60844h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60845i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60840d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60841e);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f60842f);
        stringBuffer.append("\r\nExitType:");
        stringBuffer.append(this.f60843g);
        stringBuffer.append("\r\nOperateType:");
        stringBuffer.append(this.f60844h);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f60845i);
        return stringBuffer.toString();
    }
}
