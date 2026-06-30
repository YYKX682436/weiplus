package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class BizGeneralExceptionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55394d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55395e = "";

    @Override // jx3.a
    public int g() {
        return 35254;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55394d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55395e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f55394d);
        stringBuffer.append("\r\ndata:");
        stringBuffer.append(this.f55395e);
        return stringBuffer.toString();
    }
}
