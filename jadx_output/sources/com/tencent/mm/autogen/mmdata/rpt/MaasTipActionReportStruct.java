package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class MaasTipActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f59014d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59015e = "";

    @Override // jx3.a
    public int g() {
        return 31129;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59014d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59015e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f59014d);
        stringBuffer.append("\r\nsessionid_:");
        stringBuffer.append(this.f59015e);
        return stringBuffer.toString();
    }
}
