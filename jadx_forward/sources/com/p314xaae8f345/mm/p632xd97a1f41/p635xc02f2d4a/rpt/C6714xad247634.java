package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MaasTipActionReportStruct */
/* loaded from: classes4.dex */
public final class C6714xad247634 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f140547d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140548e = "";

    @Override // jx3.a
    public int g() {
        return 31129;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140547d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140548e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f140547d);
        stringBuffer.append("\r\nsessionid_:");
        stringBuffer.append(this.f140548e);
        return stringBuffer.toString();
    }
}
