package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderFaceVerifyStreamStruct */
/* loaded from: classes3.dex */
public final class C6488x1f77a3b1 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f138291f;

    /* renamed from: h, reason: collision with root package name */
    public long f138293h;

    /* renamed from: i, reason: collision with root package name */
    public long f138294i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138289d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138290e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138292g = "";

    @Override // jx3.a
    public int g() {
        return 21113;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138289d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138290e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138291f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138292g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138293h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138294i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FinderUsrname:");
        stringBuffer.append(this.f138289d);
        stringBuffer.append("\r\nFinderWxAppInfo:");
        stringBuffer.append(this.f138290e);
        stringBuffer.append("\r\nIsPrivate:");
        stringBuffer.append(this.f138291f);
        stringBuffer.append("\r\nFinderSessionId:");
        stringBuffer.append(this.f138292g);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f138293h);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f138294i);
        return stringBuffer.toString();
    }
}
