package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class AudioDeviceInfoKvReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55339d;

    /* renamed from: e, reason: collision with root package name */
    public long f55340e;

    @Override // jx3.a
    public int g() {
        return 25192;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55339d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55340e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DeviceInfo:");
        stringBuffer.append(this.f55339d);
        stringBuffer.append("\r\nUseLast:");
        stringBuffer.append(this.f55340e);
        return stringBuffer.toString();
    }
}
