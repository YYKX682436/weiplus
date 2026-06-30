package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AudioDeviceInfoKvReportStruct */
/* loaded from: classes11.dex */
public final class C6329xf4b4d64e extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f136872d;

    /* renamed from: e, reason: collision with root package name */
    public long f136873e;

    @Override // jx3.a
    public int g() {
        return 25192;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136872d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136873e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DeviceInfo:");
        stringBuffer.append(this.f136872d);
        stringBuffer.append("\r\nUseLast:");
        stringBuffer.append(this.f136873e);
        return stringBuffer.toString();
    }
}
