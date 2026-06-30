package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class BLEDeviceMonitorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55349d;

    /* renamed from: g, reason: collision with root package name */
    public long f55352g;

    /* renamed from: m, reason: collision with root package name */
    public long f55358m;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55350e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55351f = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55353h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55354i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55355j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55356k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55357l = "";

    @Override // jx3.a
    public int g() {
        return 25092;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55349d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55350e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55351f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55352g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55353h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55354i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55355j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55356k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55357l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55358m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Event:");
        stringBuffer.append(this.f55349d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f55350e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f55351f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f55352g);
        stringBuffer.append("\r\nSn:");
        stringBuffer.append(this.f55353h);
        stringBuffer.append("\r\nBluetoothDeviceid:");
        stringBuffer.append(this.f55354i);
        stringBuffer.append("\r\nEntryPackage:");
        stringBuffer.append(this.f55355j);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f55356k);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f55357l);
        stringBuffer.append("\r\nStartErrCode:");
        stringBuffer.append(this.f55358m);
        return stringBuffer.toString();
    }
}
