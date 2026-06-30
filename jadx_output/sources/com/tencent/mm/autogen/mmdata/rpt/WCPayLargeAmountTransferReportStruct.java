package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayLargeAmountTransferReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62111d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62112e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62113f = "";

    @Override // jx3.a
    public int g() {
        return 17072;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62111d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62112e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62113f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62111d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62112e);
        stringBuffer.append("\r\nOrderId:");
        stringBuffer.append(this.f62113f);
        return stringBuffer.toString();
    }
}
