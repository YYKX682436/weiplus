package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SolitaireDropReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60835d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60836e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60837f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60838g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60839h = "";

    @Override // jx3.a
    public int g() {
        return 18252;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60835d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60836e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60837f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60838g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60839h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60835d);
        stringBuffer.append("\r\nLaunchUserName:");
        stringBuffer.append(this.f60836e);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60837f);
        stringBuffer.append("\r\nreason:");
        stringBuffer.append(this.f60838g);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f60839h);
        return stringBuffer.toString();
    }
}
