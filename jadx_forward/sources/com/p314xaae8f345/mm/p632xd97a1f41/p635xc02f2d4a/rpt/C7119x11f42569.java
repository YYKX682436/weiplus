package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewUsageStruct */
/* loaded from: classes7.dex */
public final class C7119x11f42569 extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.y0 f144396g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144393d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144394e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f144395f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f144397h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f144398i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f144399j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f144400k = 0;

    @Override // jx3.a
    public int g() {
        return 16368;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144393d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144394e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144395f);
        stringBuffer.append(",");
        cm.y0 y0Var = this.f144396g;
        stringBuffer.append(y0Var != null ? y0Var.f124797d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f144397h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f144398i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f144399j);
        stringBuffer.append(",");
        stringBuffer.append(this.f144400k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f144393d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f144394e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f144395f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f144396g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f144397h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f144398i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nisPreload:");
        stringBuffer.append(this.f144399j);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f144400k);
        return stringBuffer.toString();
    }
}
