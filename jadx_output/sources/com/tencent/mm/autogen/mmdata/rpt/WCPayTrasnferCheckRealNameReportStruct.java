package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayTrasnferCheckRealNameReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62126d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62127e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62128f = 0;

    @Override // jx3.a
    public int g() {
        return 16016;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62126d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62127e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62128f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportScene:");
        stringBuffer.append(this.f62126d);
        stringBuffer.append("\r\nTransferUserName:");
        stringBuffer.append(this.f62127e);
        stringBuffer.append("\r\nTransferAmount:");
        stringBuffer.append(this.f62128f);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct p(java.lang.String str) {
        this.f62127e = b("TransferUserName", str, true);
        return this;
    }
}
