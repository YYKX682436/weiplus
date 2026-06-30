package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class WCPayTransferToPhonePlaceOrderExceptionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62124d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62125e = "";

    @Override // jx3.a
    public int g() {
        return 18263;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62124d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62125e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62124d);
        stringBuffer.append("\r\nReqKey:");
        stringBuffer.append(this.f62125e);
        return stringBuffer.toString();
    }
}
