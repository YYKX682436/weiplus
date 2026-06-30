package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhonePlaceOrderExceptionReportStruct */
/* loaded from: classes5.dex */
public final class C7057xf29162c5 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143657d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143658e = "";

    @Override // jx3.a
    public int g() {
        return 18263;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143657d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143658e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f143657d);
        stringBuffer.append("\r\nReqKey:");
        stringBuffer.append(this.f143658e);
        return stringBuffer.toString();
    }
}
