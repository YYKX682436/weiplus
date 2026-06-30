package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveMicConnectReportStruct */
/* loaded from: classes3.dex */
public final class C6518xdfc7e35e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138706d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138707e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138708f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138709g = "";

    @Override // jx3.a
    public int g() {
        return 28323;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138706d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138707e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138708f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138709g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("opType:");
        stringBuffer.append(this.f138706d);
        stringBuffer.append("\r\nopMsg:");
        stringBuffer.append(this.f138707e);
        stringBuffer.append("\r\nuserId:");
        stringBuffer.append(this.f138708f);
        stringBuffer.append("\r\nliveId:");
        stringBuffer.append(this.f138709g);
        return stringBuffer.toString();
    }
}
