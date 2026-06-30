package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AlarmCrashStatisticsStruct */
/* loaded from: classes9.dex */
public final class C6296xe2cbaee extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136565d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136566e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f136567f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136568g = "";

    @Override // jx3.a
    public int g() {
        return 19574;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136565d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136566e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136567f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136568g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Requestcode:");
        stringBuffer.append(this.f136565d);
        stringBuffer.append("\r\nProcessName:");
        stringBuffer.append(this.f136566e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f136567f);
        stringBuffer.append("\r\nStack:");
        stringBuffer.append(this.f136568g);
        return stringBuffer.toString();
    }
}
