package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct */
/* loaded from: classes4.dex */
public final class C6877x5525f5a6 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141966d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141967e = "";

    @Override // jx3.a
    public int g() {
        return 31314;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141966d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141967e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f141966d);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f141967e);
        return stringBuffer.toString();
    }
}
