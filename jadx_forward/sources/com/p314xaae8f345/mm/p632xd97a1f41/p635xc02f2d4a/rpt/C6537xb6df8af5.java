package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLiveThermalStateReportStruct */
/* loaded from: classes12.dex */
public final class C6537xb6df8af5 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f138927e;

    /* renamed from: g, reason: collision with root package name */
    public int f138929g;

    /* renamed from: h, reason: collision with root package name */
    public int f138930h;

    /* renamed from: i, reason: collision with root package name */
    public int f138931i;

    /* renamed from: k, reason: collision with root package name */
    public int f138933k;

    /* renamed from: n, reason: collision with root package name */
    public long f138936n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138926d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138928f = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f138932j = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f138934l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f138935m = "";

    @Override // jx3.a
    public int g() {
        return 23558;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f138926d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138927e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138928f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138929g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138930h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138931i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f138932j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138933k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f138934l);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f138935m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f138936n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ThermalState:0\r\nIsLowPowerModeEnabled:0\r\nLiveId:");
        stringBuffer.append(this.f138926d);
        stringBuffer.append("\r\nCurrentLiveScene:");
        stringBuffer.append(this.f138927e);
        stringBuffer.append("\r\nFinderNickname:");
        stringBuffer.append(this.f138928f);
        stringBuffer.append("\r\nBatteryState:");
        stringBuffer.append(this.f138929g);
        stringBuffer.append("\r\nBatteryLevelPercentage:");
        stringBuffer.append(this.f138930h);
        stringBuffer.append("\r\nDeviceTemperature:");
        stringBuffer.append(this.f138931i);
        stringBuffer.append("\r\nGPUUtilization:0\r\nNetworkType:");
        stringBuffer.append(this.f138932j);
        stringBuffer.append("\r\nAppCpuUsage:");
        stringBuffer.append(this.f138933k);
        stringBuffer.append("\r\nOverheatingEvent:0\r\nOverheatingDuration:");
        stringBuffer.append(this.f138934l);
        stringBuffer.append("\r\nOverheatingTorchStatus:0\r\nEnergyMode:0\r\nEnergyRuleID:");
        stringBuffer.append(this.f138935m);
        stringBuffer.append("\r\nDeviceCPUUsage:0\r\nAppFootprintMemory:");
        stringBuffer.append(this.f138936n);
        return stringBuffer.toString();
    }
}
