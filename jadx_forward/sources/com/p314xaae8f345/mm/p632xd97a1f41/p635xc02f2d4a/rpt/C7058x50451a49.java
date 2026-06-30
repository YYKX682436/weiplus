package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct */
/* loaded from: classes9.dex */
public final class C7058x50451a49 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143659d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143660e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143661f = 0;

    @Override // jx3.a
    public int g() {
        return 16016;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143659d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143660e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143661f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReportScene:");
        stringBuffer.append(this.f143659d);
        stringBuffer.append("\r\nTransferUserName:");
        stringBuffer.append(this.f143660e);
        stringBuffer.append("\r\nTransferAmount:");
        stringBuffer.append(this.f143661f);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49 p(java.lang.String str) {
        this.f143660e = b("TransferUserName", str, true);
        return this;
    }
}
