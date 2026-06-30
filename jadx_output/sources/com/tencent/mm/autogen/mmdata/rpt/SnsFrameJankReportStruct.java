package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SnsFrameJankReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60583d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60584e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f60585f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f60586g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f60587h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60588i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f60589j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60590k = "";

    @Override // jx3.a
    public int g() {
        return 26077;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60583d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60584e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60585f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60586g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60587h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60588i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60589j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60590k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60583d);
        stringBuffer.append("\r\nFrameStartNanos:");
        stringBuffer.append(this.f60584e);
        stringBuffer.append("\r\nFrameDurationUiNanos:");
        stringBuffer.append(this.f60585f);
        stringBuffer.append("\r\nFrameDurationCpuNanos:");
        stringBuffer.append(this.f60586g);
        stringBuffer.append("\r\nFrameOverrunNanos:");
        stringBuffer.append(this.f60587h);
        stringBuffer.append("\r\nJankState:");
        stringBuffer.append(this.f60588i);
        stringBuffer.append("\r\nEnableItemImprove:");
        stringBuffer.append(this.f60589j);
        stringBuffer.append("\r\nCpuInfo:");
        stringBuffer.append(this.f60590k);
        return stringBuffer.toString();
    }
}
