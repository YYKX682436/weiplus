package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveStreamStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f57384f;

    /* renamed from: h, reason: collision with root package name */
    public long f57386h;

    /* renamed from: i, reason: collision with root package name */
    public long f57387i;

    /* renamed from: k, reason: collision with root package name */
    public long f57389k;

    /* renamed from: n, reason: collision with root package name */
    public int f57392n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57382d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57383e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57385g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57388j = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f57390l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f57391m = "";

    @Override // jx3.a
    public int g() {
        return 21017;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57382d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57383e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57384f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57385g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57386h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57387i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57388j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57389k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57390l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57391m);
        stringBuffer.append(",");
        stringBuffer.append(this.f57392n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinderUsrname:");
        stringBuffer.append(this.f57382d);
        stringBuffer.append("\r\nFinderWxAppInfo:");
        stringBuffer.append(this.f57383e);
        stringBuffer.append("\r\nIsPrivate:");
        stringBuffer.append(this.f57384f);
        stringBuffer.append("\r\nFinderSessionId:");
        stringBuffer.append(this.f57385g);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f57386h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f57387i);
        stringBuffer.append("\r\nActionJson:");
        stringBuffer.append(this.f57388j);
        stringBuffer.append("\r\nSourceScene:");
        stringBuffer.append(this.f57389k);
        stringBuffer.append("\r\nConnectCount:0\r\nConnectDuration:");
        stringBuffer.append(this.f57390l);
        stringBuffer.append("\r\nParams:");
        stringBuffer.append(this.f57391m);
        stringBuffer.append("\r\nScreenType:");
        stringBuffer.append(this.f57392n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct p(java.lang.String str) {
        this.f57388j = b("ActionJson", str, true);
        return this;
    }
}
