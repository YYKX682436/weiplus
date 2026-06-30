package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct */
/* loaded from: classes10.dex */
public final class C6516x7962e81f extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f138678e;

    /* renamed from: g, reason: collision with root package name */
    public long f138680g;

    /* renamed from: h, reason: collision with root package name */
    public int f138681h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138677d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138679f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138682i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f138683j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f138684k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f138685l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f138686m = "";

    @Override // jx3.a
    public int g() {
        return 25510;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138677d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138678e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138679f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138680g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138681h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138682i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138683j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138684k);
        stringBuffer.append(",");
        stringBuffer.append(this.f138685l);
        stringBuffer.append(",");
        stringBuffer.append(this.f138686m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("playerLeaksTrace:");
        stringBuffer.append(this.f138677d);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f138678e);
        stringBuffer.append("\r\nopMsg:");
        stringBuffer.append(this.f138679f);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f138680g);
        stringBuffer.append("\r\nplayScene:");
        stringBuffer.append(this.f138681h);
        stringBuffer.append("\r\ntraceId:");
        stringBuffer.append(this.f138682i);
        stringBuffer.append("\r\nfirstTraceActivity:");
        stringBuffer.append(this.f138683j);
        stringBuffer.append("\r\nscanSouce:");
        stringBuffer.append(this.f138684k);
        stringBuffer.append("\r\nviewLink:");
        stringBuffer.append(this.f138685l);
        stringBuffer.append("\r\nleakReason:");
        stringBuffer.append(this.f138686m);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f p(java.lang.String str) {
        this.f138679f = b("opMsg", str, true);
        return this;
    }
}
