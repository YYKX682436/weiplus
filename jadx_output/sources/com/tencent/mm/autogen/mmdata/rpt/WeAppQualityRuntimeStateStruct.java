package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityRuntimeStateStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.c0 f62649g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62646d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62647e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62648f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62650h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62651i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62652j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62653k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62654l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f62655m = 0;

    @Override // jx3.a
    public int g() {
        return 18032;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62646d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62647e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62648f);
        stringBuffer.append(",");
        cm.c0 c0Var = this.f62649g;
        stringBuffer.append(c0Var != null ? c0Var.f43044d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62650h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62651i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f62652j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62653k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62654l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62655m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62646d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62647e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62648f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62649g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62650h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f62651i);
        stringBuffer.append("\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0\r\nprocessNum:");
        stringBuffer.append(this.f62652j);
        stringBuffer.append("\r\nruntimeNum:");
        stringBuffer.append(this.f62653k);
        stringBuffer.append("\r\ndistribution:");
        stringBuffer.append(this.f62654l);
        stringBuffer.append("\r\nmmtoolsAlive:");
        stringBuffer.append(this.f62655m);
        return stringBuffer.toString();
    }
}
