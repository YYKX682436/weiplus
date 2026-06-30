package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderLiveErrorReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f57145e;

    /* renamed from: g, reason: collision with root package name */
    public long f57147g;

    /* renamed from: h, reason: collision with root package name */
    public int f57148h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57144d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57146f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57149i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57150j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57151k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57152l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57153m = "";

    @Override // jx3.a
    public int g() {
        return 25510;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57144d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57145e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57146f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57147g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57148h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57149i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57150j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57151k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57152l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57153m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("playerLeaksTrace:");
        stringBuffer.append(this.f57144d);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f57145e);
        stringBuffer.append("\r\nopMsg:");
        stringBuffer.append(this.f57146f);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f57147g);
        stringBuffer.append("\r\nplayScene:");
        stringBuffer.append(this.f57148h);
        stringBuffer.append("\r\ntraceId:");
        stringBuffer.append(this.f57149i);
        stringBuffer.append("\r\nfirstTraceActivity:");
        stringBuffer.append(this.f57150j);
        stringBuffer.append("\r\nscanSouce:");
        stringBuffer.append(this.f57151k);
        stringBuffer.append("\r\nviewLink:");
        stringBuffer.append(this.f57152l);
        stringBuffer.append("\r\nleakReason:");
        stringBuffer.append(this.f57153m);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderLiveErrorReportStruct p(java.lang.String str) {
        this.f57146f = b("opMsg", str, true);
        return this;
    }
}
