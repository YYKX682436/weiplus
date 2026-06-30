package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class MultiDeleteContactsReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59297d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59298e = "";

    @Override // jx3.a
    public int g() {
        return 24832;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59297d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59298e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f59297d);
        stringBuffer.append("\r\nactionInfo:");
        stringBuffer.append(this.f59298e);
        return stringBuffer.toString();
    }
}
