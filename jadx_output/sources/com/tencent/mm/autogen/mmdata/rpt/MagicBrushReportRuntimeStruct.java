package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class MagicBrushReportRuntimeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59058d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59059e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59060f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59061g = "";

    @Override // jx3.a
    public int g() {
        return 26778;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59058d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59059e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59060f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59061g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizName:");
        stringBuffer.append(this.f59058d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f59059e);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f59060f);
        stringBuffer.append("\r\nExtras:");
        stringBuffer.append(this.f59061g);
        return stringBuffer.toString();
    }
}
