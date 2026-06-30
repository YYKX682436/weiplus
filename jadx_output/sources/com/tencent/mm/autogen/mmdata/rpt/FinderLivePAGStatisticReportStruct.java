package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class FinderLivePAGStatisticReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f57258d;

    /* renamed from: e, reason: collision with root package name */
    public int f57259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57260f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f57261g;

    /* renamed from: h, reason: collision with root package name */
    public long f57262h;

    /* renamed from: i, reason: collision with root package name */
    public long f57263i;

    /* renamed from: j, reason: collision with root package name */
    public long f57264j;

    @Override // jx3.a
    public int g() {
        return 31499;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f57258d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57259e);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f57260f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57261g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57262h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57263i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57264j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("NotifyGiftPagCnt:0\r\nNotifyGiftRfxCnt:0\r\nMainGiftPagCnt:");
        stringBuffer.append(this.f57258d);
        stringBuffer.append("\r\nMainGiftRfxCnt:");
        stringBuffer.append(this.f57259e);
        stringBuffer.append("\r\nLibPagCnt:0\r\nRfxPagCnt:0\r\nMainGiftPagAvgFrameTime:0\r\nMainGiftRfxAvgFrameTime:0\r\nMainGiftPagAvgFrameTimeMax:0\r\nMainGiftRfxAvgFrameTimeMax:0\r\nLiveId:");
        stringBuffer.append(this.f57260f);
        stringBuffer.append("\r\nMainGiftPagAvgFrameTimeF:");
        stringBuffer.append(this.f57261g);
        stringBuffer.append("\r\nMainGiftRfxAvgFrameTimeF:");
        stringBuffer.append(this.f57262h);
        stringBuffer.append("\r\nMainGiftPagAvgFrameTimeMaxF:");
        stringBuffer.append(this.f57263i);
        stringBuffer.append("\r\nMainGiftRfxAvgFrameTimeMaxF:");
        stringBuffer.append(this.f57264j);
        return stringBuffer.toString();
    }
}
