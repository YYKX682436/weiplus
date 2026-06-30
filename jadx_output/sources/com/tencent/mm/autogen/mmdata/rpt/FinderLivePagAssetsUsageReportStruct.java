package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderLivePagAssetsUsageReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f57267f;

    /* renamed from: g, reason: collision with root package name */
    public int f57268g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57265d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57266e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57269h = "";

    @Override // jx3.a
    public int g() {
        return 37819;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57265d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57266e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57267f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57268g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57269h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PagFileName:");
        stringBuffer.append(this.f57265d);
        stringBuffer.append("\r\nLiveId:");
        stringBuffer.append(this.f57266e);
        stringBuffer.append("\r\nLiveMode:");
        stringBuffer.append(this.f57267f);
        stringBuffer.append("\r\nResourceType:");
        stringBuffer.append(this.f57268g);
        stringBuffer.append("\r\nResourceName:");
        stringBuffer.append(this.f57269h);
        return stringBuffer.toString();
    }
}
