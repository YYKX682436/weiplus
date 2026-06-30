package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class ResortZipStartTimeReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59998f;

    /* renamed from: h, reason: collision with root package name */
    public long f60000h;

    /* renamed from: j, reason: collision with root package name */
    public long f60002j;

    /* renamed from: k, reason: collision with root package name */
    public int f60003k;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59996d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59997e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59999g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60001i = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60004l = "";

    @Override // jx3.a
    public int g() {
        return 26008;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59996d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59997e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59998f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59999g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60000h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60001i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60002j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60003k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60004l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActivityName:");
        stringBuffer.append(this.f59996d);
        stringBuffer.append("\r\nContent:");
        stringBuffer.append(this.f59997e);
        stringBuffer.append("\r\nStartCostTime:");
        stringBuffer.append(this.f59998f);
        stringBuffer.append("\r\nresourceName:");
        stringBuffer.append(this.f59999g);
        stringBuffer.append("\r\nresourceType:");
        stringBuffer.append(this.f60000h);
        stringBuffer.append("\r\nisFirstLoad:0\r\ncpuModel:");
        stringBuffer.append(this.f60001i);
        stringBuffer.append("\r\ndevLevel:");
        stringBuffer.append(this.f60002j);
        stringBuffer.append("\r\nloadTimes:");
        stringBuffer.append(this.f60003k);
        stringBuffer.append("\r\nloadScene:0\r\nprocessName:");
        stringBuffer.append(this.f60004l);
        return stringBuffer.toString();
    }
}
