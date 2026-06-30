package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayHongBaoRefundClickReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62101d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62102e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f62103f = 0;

    @Override // jx3.a
    public int g() {
        return 17573;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62101d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62102e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62103f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("clickScene:");
        stringBuffer.append(this.f62101d);
        stringBuffer.append("\r\nswitchWay:");
        stringBuffer.append(this.f62102e);
        stringBuffer.append("\r\nopenFrom:");
        stringBuffer.append(this.f62103f);
        return stringBuffer.toString();
    }
}
