package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FinderLiveThermalStateReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57394e;

    /* renamed from: g, reason: collision with root package name */
    public int f57396g;

    /* renamed from: h, reason: collision with root package name */
    public int f57397h;

    /* renamed from: i, reason: collision with root package name */
    public int f57398i;

    /* renamed from: k, reason: collision with root package name */
    public int f57400k;

    /* renamed from: n, reason: collision with root package name */
    public long f57403n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57393d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57395f = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f57399j = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f57401l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f57402m = "";

    @Override // jx3.a
    public int g() {
        return 23558;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f57393d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57394e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57395f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57396g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57397h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57398i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57399j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57400k);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57401l);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57402m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57403n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ThermalState:0\r\nIsLowPowerModeEnabled:0\r\nLiveId:");
        stringBuffer.append(this.f57393d);
        stringBuffer.append("\r\nCurrentLiveScene:");
        stringBuffer.append(this.f57394e);
        stringBuffer.append("\r\nFinderNickname:");
        stringBuffer.append(this.f57395f);
        stringBuffer.append("\r\nBatteryState:");
        stringBuffer.append(this.f57396g);
        stringBuffer.append("\r\nBatteryLevelPercentage:");
        stringBuffer.append(this.f57397h);
        stringBuffer.append("\r\nDeviceTemperature:");
        stringBuffer.append(this.f57398i);
        stringBuffer.append("\r\nGPUUtilization:0\r\nNetworkType:");
        stringBuffer.append(this.f57399j);
        stringBuffer.append("\r\nAppCpuUsage:");
        stringBuffer.append(this.f57400k);
        stringBuffer.append("\r\nOverheatingEvent:0\r\nOverheatingDuration:");
        stringBuffer.append(this.f57401l);
        stringBuffer.append("\r\nOverheatingTorchStatus:0\r\nEnergyMode:0\r\nEnergyRuleID:");
        stringBuffer.append(this.f57402m);
        stringBuffer.append("\r\nDeviceCPUUsage:0\r\nAppFootprintMemory:");
        stringBuffer.append(this.f57403n);
        return stringBuffer.toString();
    }
}
