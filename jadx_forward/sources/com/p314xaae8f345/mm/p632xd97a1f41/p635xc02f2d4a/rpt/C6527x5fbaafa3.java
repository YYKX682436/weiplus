package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLivePagAssetsUsageReportStruct */
/* loaded from: classes15.dex */
public final class C6527x5fbaafa3 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f138800f;

    /* renamed from: g, reason: collision with root package name */
    public int f138801g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138798d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138799e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138802h = "";

    @Override // jx3.a
    public int g() {
        return 37819;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138798d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138799e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138800f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138801g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138802h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PagFileName:");
        stringBuffer.append(this.f138798d);
        stringBuffer.append("\r\nLiveId:");
        stringBuffer.append(this.f138799e);
        stringBuffer.append("\r\nLiveMode:");
        stringBuffer.append(this.f138800f);
        stringBuffer.append("\r\nResourceType:");
        stringBuffer.append(this.f138801g);
        stringBuffer.append("\r\nResourceName:");
        stringBuffer.append(this.f138802h);
        return stringBuffer.toString();
    }
}
