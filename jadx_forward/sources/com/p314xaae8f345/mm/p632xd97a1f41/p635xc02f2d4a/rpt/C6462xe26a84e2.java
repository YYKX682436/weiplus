package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderBacktoTopStruct */
/* loaded from: classes10.dex */
public final class C6462xe26a84e2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138049d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138050e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138051f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f138052g;

    /* renamed from: h, reason: collision with root package name */
    public long f138053h;

    /* renamed from: i, reason: collision with root package name */
    public long f138054i;

    @Override // jx3.a
    public int g() {
        return 19995;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138049d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138050e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138051f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138052g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138053h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138054i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:");
        stringBuffer.append(this.f138049d);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f138050e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f138051f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f138052g);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f138053h);
        stringBuffer.append("\r\nHasWording:");
        stringBuffer.append(this.f138054i);
        return stringBuffer.toString();
    }
}
