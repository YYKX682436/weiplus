package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayResetPwdClickReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62114d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62115e = 0;

    @Override // jx3.a
    public int g() {
        return 15522;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62114d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62115e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportScene:");
        stringBuffer.append(this.f62114d);
        stringBuffer.append("\r\nResetScece:");
        stringBuffer.append(this.f62115e);
        return stringBuffer.toString();
    }
}
