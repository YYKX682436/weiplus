package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderNoticeLiveStreamStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f57449f;

    /* renamed from: h, reason: collision with root package name */
    public long f57451h;

    /* renamed from: i, reason: collision with root package name */
    public long f57452i;

    /* renamed from: k, reason: collision with root package name */
    public long f57454k;

    /* renamed from: m, reason: collision with root package name */
    public long f57456m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57447d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57448e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57450g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f57453j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f57455l = "";

    @Override // jx3.a
    public int g() {
        return 21106;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57447d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57448e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57449f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57450g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57451h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57452i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57453j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57454k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57455l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57456m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinderUsrname:");
        stringBuffer.append(this.f57447d);
        stringBuffer.append("\r\nFinderWxAppInfo:");
        stringBuffer.append(this.f57448e);
        stringBuffer.append("\r\nIsPrivate:");
        stringBuffer.append(this.f57449f);
        stringBuffer.append("\r\nFinderSessionId:");
        stringBuffer.append(this.f57450g);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f57451h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f57452i);
        stringBuffer.append("\r\nActionJson:");
        stringBuffer.append(this.f57453j);
        stringBuffer.append("\r\nSourceScene:");
        stringBuffer.append(this.f57454k);
        stringBuffer.append("\r\nDescription:");
        stringBuffer.append(this.f57455l);
        stringBuffer.append("\r\nAdvancetype:");
        stringBuffer.append(this.f57456m);
        return stringBuffer.toString();
    }
}
