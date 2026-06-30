package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppInitLagMonitorStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.h f62281f;

    /* renamed from: n, reason: collision with root package name */
    public long f62289n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62279d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62280e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62282g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62283h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62284i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62285j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62286k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62287l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62288m = "";

    @Override // jx3.a
    public int g() {
        return 27224;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62279d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62280e);
        stringBuffer.append(",");
        cm.h hVar = this.f62281f;
        stringBuffer.append(hVar != null ? hVar.f43095d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62282g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62283h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62284i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62285j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62286k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62287l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62288m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62289n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62279d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62280e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62281f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62282g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62283h);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62284i);
        stringBuffer.append("\r\nProcessName:");
        stringBuffer.append(this.f62285j);
        stringBuffer.append("\r\nThreadName:");
        stringBuffer.append(this.f62286k);
        stringBuffer.append("\r\nStack:");
        stringBuffer.append(this.f62287l);
        stringBuffer.append("\r\nStackID:");
        stringBuffer.append(this.f62288m);
        stringBuffer.append("\r\nLagThreshold:");
        stringBuffer.append(this.f62289n);
        return stringBuffer.toString();
    }
}
