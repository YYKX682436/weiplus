package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class SdkNewFinderReportErrorReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60159d = "";

    @Override // jx3.a
    public int g() {
        return 30513;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f60159d);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ErrorType:0\r\nErrorSource:");
        stringBuffer.append(this.f60159d);
        return stringBuffer.toString();
    }
}
