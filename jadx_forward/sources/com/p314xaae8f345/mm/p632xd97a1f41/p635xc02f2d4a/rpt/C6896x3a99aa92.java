package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct */
/* loaded from: classes15.dex */
public final class C6896x3a99aa92 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142116d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142117e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f142118f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f142119g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f142120h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142121i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f142122j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f142123k = "";

    @Override // jx3.a
    public int g() {
        return 26077;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142116d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142117e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142118f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142119g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142120h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142121i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142122j);
        stringBuffer.append(",");
        stringBuffer.append(this.f142123k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f142116d);
        stringBuffer.append("\r\nFrameStartNanos:");
        stringBuffer.append(this.f142117e);
        stringBuffer.append("\r\nFrameDurationUiNanos:");
        stringBuffer.append(this.f142118f);
        stringBuffer.append("\r\nFrameDurationCpuNanos:");
        stringBuffer.append(this.f142119g);
        stringBuffer.append("\r\nFrameOverrunNanos:");
        stringBuffer.append(this.f142120h);
        stringBuffer.append("\r\nJankState:");
        stringBuffer.append(this.f142121i);
        stringBuffer.append("\r\nEnableItemImprove:");
        stringBuffer.append(this.f142122j);
        stringBuffer.append("\r\nCpuInfo:");
        stringBuffer.append(this.f142123k);
        return stringBuffer.toString();
    }
}
