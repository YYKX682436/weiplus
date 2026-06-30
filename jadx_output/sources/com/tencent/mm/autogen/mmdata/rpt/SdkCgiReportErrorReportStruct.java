package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class SdkCgiReportErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60157d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60158e = "";

    @Override // jx3.a
    public int g() {
        return 30513;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60157d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60158e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorType:");
        stringBuffer.append(this.f60157d);
        stringBuffer.append("\r\nErrorSource:");
        stringBuffer.append(this.f60158e);
        return stringBuffer.toString();
    }
}
