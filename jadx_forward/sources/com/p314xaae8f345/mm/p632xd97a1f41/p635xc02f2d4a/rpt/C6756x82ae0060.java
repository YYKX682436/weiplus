package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct */
/* loaded from: classes.dex */
public final class C6756x82ae0060 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140830d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140831e = "";

    @Override // jx3.a
    public int g() {
        return 24832;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140830d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140831e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f140830d);
        stringBuffer.append("\r\nactionInfo:");
        stringBuffer.append(this.f140831e);
        return stringBuffer.toString();
    }
}
