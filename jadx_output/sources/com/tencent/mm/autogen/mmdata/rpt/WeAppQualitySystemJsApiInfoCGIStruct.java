package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySystemJsApiInfoCGIStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.l0 f62755g;

    /* renamed from: n, reason: collision with root package name */
    public cm.m0 f62762n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62752d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62753e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62754f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62756h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62757i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62758j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62759k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62760l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62761m = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62763o = 0;

    @Override // jx3.a
    public int g() {
        return 19986;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62752d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62753e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62754f);
        stringBuffer.append(",");
        cm.l0 l0Var = this.f62755g;
        stringBuffer.append(l0Var != null ? l0Var.f43135d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62756h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62757i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62758j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62759k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62760l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62761m);
        stringBuffer.append(",");
        cm.m0 m0Var = this.f62762n;
        stringBuffer.append(m0Var != null ? m0Var.f43148d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62763o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62752d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62753e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62754f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62755g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62756h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62757i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62758j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62759k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62760l);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f62761m);
        stringBuffer.append("\r\nIsSync:");
        stringBuffer.append(this.f62762n);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62763o);
        return stringBuffer.toString();
    }
}
