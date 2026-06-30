package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayScanBankCardNumberStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62119d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62120e = 0;

    @Override // jx3.a
    public int g() {
        return 15509;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62119d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62120e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62119d);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f62120e);
        return stringBuffer.toString();
    }
}
