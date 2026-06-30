package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySystemContactCGIStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.g0 f62726g;

    /* renamed from: m, reason: collision with root package name */
    public cm.i0 f62732m;

    /* renamed from: n, reason: collision with root package name */
    public cm.h0 f62733n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62723d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62724e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62725f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62727h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62728i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62729j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62730k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62731l = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62734o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62735p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f62736q = "";

    @Override // jx3.a
    public int g() {
        return 15764;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62723d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62724e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62725f);
        stringBuffer.append(",");
        cm.g0 g0Var = this.f62726g;
        stringBuffer.append(g0Var != null ? g0Var.f43090d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62727h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62728i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62729j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62730k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62731l);
        stringBuffer.append(",");
        cm.i0 i0Var = this.f62732m;
        stringBuffer.append(i0Var != null ? i0Var.f43108d : -1);
        stringBuffer.append(",");
        cm.h0 h0Var = this.f62733n;
        stringBuffer.append(h0Var != null ? h0Var.f43099d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62734o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62735p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62736q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62723d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62724e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62725f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62726g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62727h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62728i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62729j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62730k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62731l);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f62732m);
        stringBuffer.append("\r\nIsSync:");
        stringBuffer.append(this.f62733n);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62734o);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f62735p);
        stringBuffer.append("\r\nNetworkTypeStr:");
        stringBuffer.append(this.f62736q);
        return stringBuffer.toString();
    }
}
