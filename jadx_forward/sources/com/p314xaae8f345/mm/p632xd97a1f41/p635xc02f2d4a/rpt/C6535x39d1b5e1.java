package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveStayTimeLogStruct */
/* loaded from: classes3.dex */
public final class C6535x39d1b5e1 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f138910f;

    /* renamed from: h, reason: collision with root package name */
    public long f138912h;

    /* renamed from: i, reason: collision with root package name */
    public long f138913i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138908d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138909e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138911g = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f138914j = "";

    @Override // jx3.a
    public int g() {
        return 32116;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138908d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138909e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138910f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138911g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138912h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138913i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138914j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Contextid:");
        stringBuffer.append(this.f138908d);
        stringBuffer.append("\r\nCommentScene:");
        stringBuffer.append(this.f138909e);
        stringBuffer.append("\r\nStayTimeMs:");
        stringBuffer.append(this.f138910f);
        stringBuffer.append("\r\nRedDotTipsID:");
        stringBuffer.append(this.f138911g);
        stringBuffer.append("\r\nEnterTimeMs:");
        stringBuffer.append(this.f138912h);
        stringBuffer.append("\r\nExitTimeMs:");
        stringBuffer.append(this.f138913i);
        stringBuffer.append("\r\nExtraInfo:");
        stringBuffer.append(this.f138914j);
        return stringBuffer.toString();
    }
}
