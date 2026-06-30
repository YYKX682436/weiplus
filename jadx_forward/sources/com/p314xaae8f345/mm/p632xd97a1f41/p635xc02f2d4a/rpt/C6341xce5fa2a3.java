package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.BizGeneralExceptionReportStruct */
/* loaded from: classes5.dex */
public final class C6341xce5fa2a3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136927d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136928e = "";

    @Override // jx3.a
    public int g() {
        return 35254;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136927d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136928e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f136927d);
        stringBuffer.append("\r\ndata:");
        stringBuffer.append(this.f136928e);
        return stringBuffer.toString();
    }
}
