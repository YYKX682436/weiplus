package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderUITimeStruct extends jx3.a {

    /* renamed from: o, reason: collision with root package name */
    public long f57948o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57937d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57938e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57939f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f57940g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f57941h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57942i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57943j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f57944k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57945l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57946m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f57947n = "";

    /* renamed from: p, reason: collision with root package name */
    public long f57949p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f57950q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f57951r = "";

    @Override // jx3.a
    public int g() {
        return 19943;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57937d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57938e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57939f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57940g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57941h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57942i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57943j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57944k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57945l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57946m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57947n);
        stringBuffer.append(",");
        stringBuffer.append(this.f57948o);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57949p);
        stringBuffer.append(",");
        stringBuffer.append(this.f57950q);
        stringBuffer.append(",");
        stringBuffer.append(this.f57951r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57937d);
        stringBuffer.append("\r\nPageName:");
        stringBuffer.append(this.f57938e);
        stringBuffer.append("\r\nStayTimeMs:");
        stringBuffer.append(this.f57939f);
        stringBuffer.append("\r\nEnterTimeMs:");
        stringBuffer.append(this.f57940g);
        stringBuffer.append("\r\nExitTimeMs:");
        stringBuffer.append(this.f57941h);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57942i);
        stringBuffer.append("\r\nSid:");
        stringBuffer.append(this.f57943j);
        stringBuffer.append("\r\nreportType:");
        stringBuffer.append(this.f57944k);
        stringBuffer.append("\r\nFinderContextID:");
        stringBuffer.append(this.f57945l);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f57946m);
        stringBuffer.append("\r\nenterSourceInfo:");
        stringBuffer.append(this.f57947n);
        stringBuffer.append("\r\nModeFlag:");
        stringBuffer.append(this.f57948o);
        stringBuffer.append("\r\nisNewNearbyLife:0\r\nenterType:");
        stringBuffer.append(this.f57949p);
        stringBuffer.append("\r\nlastSessionEnterType:");
        stringBuffer.append(this.f57950q);
        stringBuffer.append("\r\nsdkEnterMethod:");
        stringBuffer.append(this.f57951r);
        return stringBuffer.toString();
    }
}
