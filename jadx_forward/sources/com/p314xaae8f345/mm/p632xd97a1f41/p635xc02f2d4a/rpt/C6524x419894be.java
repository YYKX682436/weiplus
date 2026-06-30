package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveOverPageReportStruct */
/* loaded from: classes3.dex */
public final class C6524x419894be extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138756d;

    /* renamed from: f, reason: collision with root package name */
    public long f138758f;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138757e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138759g = "";

    @Override // jx3.a
    public int g() {
        return 21919;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138756d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138757e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138758f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138759g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f138756d);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f138757e);
        stringBuffer.append("\r\nActionTimeMs:");
        stringBuffer.append(this.f138758f);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f138759g);
        return stringBuffer.toString();
    }
}
