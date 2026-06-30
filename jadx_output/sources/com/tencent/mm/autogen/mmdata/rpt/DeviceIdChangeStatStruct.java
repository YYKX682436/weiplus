package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class DeviceIdChangeStatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55791d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55792e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55793f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55794g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55795h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55796i = "";

    @Override // jx3.a
    public int g() {
        return 28619;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55791d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55792e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55793f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55794g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55795h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55796i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PreFirstInstallTime:");
        stringBuffer.append(this.f55791d);
        stringBuffer.append("\r\nCurFirstInstallTime:");
        stringBuffer.append(this.f55792e);
        stringBuffer.append("\r\nPreAndroidId:");
        stringBuffer.append(this.f55793f);
        stringBuffer.append("\r\nCurAndroidId:");
        stringBuffer.append(this.f55794g);
        stringBuffer.append("\r\nPreDeviceModel:");
        stringBuffer.append(this.f55795h);
        stringBuffer.append("\r\nCurDeviceModel:");
        stringBuffer.append(this.f55796i);
        return stringBuffer.toString();
    }
}
