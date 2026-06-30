package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipExceptionReportStruct */
/* loaded from: classes8.dex */
public final class C7015xf9eade38 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143291d;

    /* renamed from: e, reason: collision with root package name */
    public long f143292e;

    @Override // jx3.a
    public int g() {
        return 27080;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f143291d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143292e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ds:0\r\nreasonCode:");
        stringBuffer.append(this.f143291d);
        stringBuffer.append("\r\nrecall:");
        stringBuffer.append(this.f143292e);
        return stringBuffer.toString();
    }
}
