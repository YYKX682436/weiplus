package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderJointBusinessWithContextIDStruct */
/* loaded from: classes2.dex */
public final class C6507x62431375 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138519d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138520e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138521f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138522g = "";

    @Override // jx3.a
    public int g() {
        return 21140;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138519d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138520e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138521f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138522g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("contextid:");
        stringBuffer.append(this.f138519d);
        stringBuffer.append("\r\nReportExtraInfo:");
        stringBuffer.append(this.f138520e);
        stringBuffer.append("\r\nEnterSourceFeedid:");
        stringBuffer.append(this.f138521f);
        stringBuffer.append("\r\nEnterSourceUsername:");
        stringBuffer.append(this.f138522g);
        return stringBuffer.toString();
    }
}
