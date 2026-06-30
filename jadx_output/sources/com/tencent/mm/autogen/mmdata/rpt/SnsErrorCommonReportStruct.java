package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsErrorCommonReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60540d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60541e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60542f = "";

    @Override // jx3.a
    public int g() {
        return 23879;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60540d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60541e);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f60542f);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Code:");
        stringBuffer.append(this.f60540d);
        stringBuffer.append("\r\nStringParam1:");
        stringBuffer.append(this.f60541e);
        stringBuffer.append("\r\nLongParam1:0\r\nIntParam1:0\r\nStringParam2:");
        stringBuffer.append(this.f60542f);
        stringBuffer.append("\r\nLongParam2:0\r\nIntParam2:0");
        return stringBuffer.toString();
    }
}
