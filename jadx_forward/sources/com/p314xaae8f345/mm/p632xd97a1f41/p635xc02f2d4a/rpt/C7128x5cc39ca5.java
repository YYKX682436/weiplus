package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeDeviceScoreReportInfoStruct */
/* loaded from: classes5.dex */
public final class C7128x5cc39ca5 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f144438d;

    /* renamed from: e, reason: collision with root package name */
    public int f144439e;

    /* renamed from: f, reason: collision with root package name */
    public int f144440f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f144441g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f144442h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f144443i;

    @Override // jx3.a
    public int g() {
        return 26660;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144438d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f144439e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144440f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144441g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144442h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144443i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CPUDeviceScore:");
        stringBuffer.append(this.f144438d);
        stringBuffer.append("\r\nMtlDeviceScore:0\r\nOclDeviceScore:");
        stringBuffer.append(this.f144439e);
        stringBuffer.append("\r\nBinaryArch:");
        stringBuffer.append(this.f144440f);
        stringBuffer.append("\r\nSocName:");
        stringBuffer.append(this.f144441g);
        stringBuffer.append("\r\nNeedBenchScore:");
        stringBuffer.append(this.f144442h);
        stringBuffer.append("\r\nBenchScoreCost:");
        stringBuffer.append(this.f144443i);
        return stringBuffer.toString();
    }
}
