package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class WeDeviceScoreReportInfoStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f62905d;

    /* renamed from: e, reason: collision with root package name */
    public int f62906e;

    /* renamed from: f, reason: collision with root package name */
    public int f62907f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f62908g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62909h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f62910i;

    @Override // jx3.a
    public int g() {
        return 26660;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62905d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62906e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62907f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62908g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62909h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62910i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CPUDeviceScore:");
        stringBuffer.append(this.f62905d);
        stringBuffer.append("\r\nMtlDeviceScore:0\r\nOclDeviceScore:");
        stringBuffer.append(this.f62906e);
        stringBuffer.append("\r\nBinaryArch:");
        stringBuffer.append(this.f62907f);
        stringBuffer.append("\r\nSocName:");
        stringBuffer.append(this.f62908g);
        stringBuffer.append("\r\nNeedBenchScore:");
        stringBuffer.append(this.f62909h);
        stringBuffer.append("\r\nBenchScoreCost:");
        stringBuffer.append(this.f62910i);
        return stringBuffer.toString();
    }
}
