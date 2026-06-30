package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsActivityPostActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60433d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60434e = "";

    @Override // jx3.a
    public int g() {
        return 31314;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60433d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60434e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f60433d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f60434e);
        return stringBuffer.toString();
    }
}
