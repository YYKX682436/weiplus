package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class BizQualityReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55411d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f55412e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55413f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55414g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f55415h = "";

    @Override // jx3.a
    public int g() {
        return 26211;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55411d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55412e);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,");
        stringBuffer.append(this.f55413f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55414g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55415h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizTimeLineInfoDbType:");
        stringBuffer.append(this.f55411d);
        stringBuffer.append("\r\nBizTimeLineInfoDbMigrateOp:");
        stringBuffer.append(this.f55412e);
        stringBuffer.append("\r\nImpressionItemCount:0\r\nDataSetChangeCount:0\r\nInflateCount:0\r\nfillingCount:0\r\nCardAction:0\r\nATest:0\r\nBTest:0\r\nCTest:0\r\nDTest:0\r\nETest:0\r\nFTest:0\r\nStringTest1:");
        stringBuffer.append(this.f55413f);
        stringBuffer.append("\r\nStringTest2:");
        stringBuffer.append(this.f55414g);
        stringBuffer.append("\r\nStringTest3:");
        stringBuffer.append(this.f55415h);
        return stringBuffer.toString();
    }
}
