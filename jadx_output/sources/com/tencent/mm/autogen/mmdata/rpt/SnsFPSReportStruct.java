package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SnsFPSReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f60543d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f60544e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f60545f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f60546g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f60547h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f60548i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f60549j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f60550k = 0;

    @Override // jx3.a
    public int g() {
        return 22765;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60543d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60544e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60545f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60546g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60547h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60548i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60549j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60550k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FPS:");
        stringBuffer.append(this.f60543d);
        stringBuffer.append("\r\nDeviceLevel:");
        stringBuffer.append(this.f60544e);
        stringBuffer.append("\r\nDropBest:");
        stringBuffer.append(this.f60545f);
        stringBuffer.append("\r\nDropNormal:");
        stringBuffer.append(this.f60546g);
        stringBuffer.append("\r\nDropMiddle:");
        stringBuffer.append(this.f60547h);
        stringBuffer.append("\r\nDropHigh:");
        stringBuffer.append(this.f60548i);
        stringBuffer.append("\r\nDropFrozen:");
        stringBuffer.append(this.f60549j);
        stringBuffer.append("\r\nSensitivity:");
        stringBuffer.append(this.f60550k);
        return stringBuffer.toString();
    }
}
