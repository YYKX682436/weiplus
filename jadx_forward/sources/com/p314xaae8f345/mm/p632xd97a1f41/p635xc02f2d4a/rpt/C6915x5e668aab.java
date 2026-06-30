package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SocialBizErrorReportStruct */
/* loaded from: classes4.dex */
public final class C6915x5e668aab extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f142343d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f142344e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142345f = "";

    @Override // jx3.a
    public int g() {
        return 31506;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142343d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142344e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142345f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f142343d);
        stringBuffer.append("\r\nErrorType:");
        stringBuffer.append(this.f142344e);
        stringBuffer.append("\r\nErrorMsg:");
        stringBuffer.append(this.f142345f);
        return stringBuffer.toString();
    }
}
