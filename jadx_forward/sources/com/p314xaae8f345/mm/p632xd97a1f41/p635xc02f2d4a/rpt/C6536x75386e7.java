package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct */
/* loaded from: classes3.dex */
public final class C6536x75386e7 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f138917f;

    /* renamed from: h, reason: collision with root package name */
    public long f138919h;

    /* renamed from: i, reason: collision with root package name */
    public long f138920i;

    /* renamed from: k, reason: collision with root package name */
    public long f138922k;

    /* renamed from: n, reason: collision with root package name */
    public int f138925n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138915d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138916e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138918g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f138921j = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f138923l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f138924m = "";

    @Override // jx3.a
    public int g() {
        return 21017;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138915d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138916e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138917f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138918g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138919h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138920i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138921j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138922k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f138923l);
        stringBuffer.append(",");
        stringBuffer.append(this.f138924m);
        stringBuffer.append(",");
        stringBuffer.append(this.f138925n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinderUsrname:");
        stringBuffer.append(this.f138915d);
        stringBuffer.append("\r\nFinderWxAppInfo:");
        stringBuffer.append(this.f138916e);
        stringBuffer.append("\r\nIsPrivate:");
        stringBuffer.append(this.f138917f);
        stringBuffer.append("\r\nFinderSessionId:");
        stringBuffer.append(this.f138918g);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f138919h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f138920i);
        stringBuffer.append("\r\nActionJson:");
        stringBuffer.append(this.f138921j);
        stringBuffer.append("\r\nSourceScene:");
        stringBuffer.append(this.f138922k);
        stringBuffer.append("\r\nConnectCount:0\r\nConnectDuration:");
        stringBuffer.append(this.f138923l);
        stringBuffer.append("\r\nParams:");
        stringBuffer.append(this.f138924m);
        stringBuffer.append("\r\nScreenType:");
        stringBuffer.append(this.f138925n);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6536x75386e7 p(java.lang.String str) {
        this.f138921j = b("ActionJson", str, true);
        return this;
    }
}
