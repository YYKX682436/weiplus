package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SolitaireClickReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60830d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60831e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60832f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f60833g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60834h = "";

    @Override // jx3.a
    public int g() {
        return 18258;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60830d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60831e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60832f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60833g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60834h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f60830d);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f60831e);
        stringBuffer.append("\r\nClickType:");
        stringBuffer.append(this.f60832f);
        stringBuffer.append("\r\nSourceType:");
        stringBuffer.append(this.f60833g);
        stringBuffer.append("\r\nIdentifier:");
        stringBuffer.append(this.f60834h);
        return stringBuffer.toString();
    }
}
