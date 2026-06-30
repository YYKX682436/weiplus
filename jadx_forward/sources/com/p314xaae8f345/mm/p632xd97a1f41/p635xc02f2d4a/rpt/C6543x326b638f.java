package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderMsgItemClickStruct */
/* loaded from: classes10.dex */
public final class C6543x326b638f extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f138955e;

    /* renamed from: f, reason: collision with root package name */
    public long f138956f;

    /* renamed from: g, reason: collision with root package name */
    public long f138957g;

    /* renamed from: i, reason: collision with root package name */
    public long f138959i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138954d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138958h = "";

    @Override // jx3.a
    public int g() {
        return 19946;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138954d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138955e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138956f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138957g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138958h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138959i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f138954d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f138955e);
        stringBuffer.append("\r\nIsOverlap:");
        stringBuffer.append(this.f138956f);
        stringBuffer.append("\r\nOverlapCount:");
        stringBuffer.append(this.f138957g);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f138958h);
        stringBuffer.append("\r\nTabType:");
        stringBuffer.append(this.f138959i);
        return stringBuffer.toString();
    }
}
