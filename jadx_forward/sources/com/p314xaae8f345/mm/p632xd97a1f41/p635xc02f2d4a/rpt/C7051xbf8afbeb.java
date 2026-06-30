package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct */
/* loaded from: classes9.dex */
public final class C7051xbf8afbeb extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143644d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f143645e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143646f = "";

    @Override // jx3.a
    public int g() {
        return 17072;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143644d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143645e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143646f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f143644d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f143645e);
        stringBuffer.append("\r\nOrderId:");
        stringBuffer.append(this.f143646f);
        return stringBuffer.toString();
    }
}
