package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityWebviewInitStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.w0 f62831g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62828d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62829e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62830f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62832h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62833i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62834j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62835k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62836l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62837m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f62838n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62839o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62840p = "";

    @Override // jx3.a
    public int g() {
        return 15813;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62828d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62829e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62830f);
        stringBuffer.append(",");
        cm.w0 w0Var = this.f62831g;
        stringBuffer.append(w0Var != null ? w0Var.f43244d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62832h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62833i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62834j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62835k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62836l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62837m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62838n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62839o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62840p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62828d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62829e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62830f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62831g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62832h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62833i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62834j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62835k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62836l);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62837m);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62838n);
        stringBuffer.append("\r\nengineVersion:");
        stringBuffer.append(this.f62839o);
        stringBuffer.append("\r\nengineVersionStr:");
        stringBuffer.append(this.f62840p);
        return stringBuffer.toString();
    }
}
