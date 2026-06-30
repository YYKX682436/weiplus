package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class PatSuffixActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59844d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f59845e;

    /* renamed from: f, reason: collision with root package name */
    public int f59846f;

    /* renamed from: g, reason: collision with root package name */
    public int f59847g;

    @Override // jx3.a
    public int g() {
        return 20379;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59844d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59845e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59846f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59847g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f59844d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59845e);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f59846f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59847g);
        return stringBuffer.toString();
    }
}
