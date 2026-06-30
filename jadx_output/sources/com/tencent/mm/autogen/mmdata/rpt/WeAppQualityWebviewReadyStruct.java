package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityWebviewReadyStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.x0 f62844g;

    /* renamed from: s, reason: collision with root package name */
    public long f62856s;

    /* renamed from: u, reason: collision with root package name */
    public long f62858u;

    /* renamed from: v, reason: collision with root package name */
    public long f62859v;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62841d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62842e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62843f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62845h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62846i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62847j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62848k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62849l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62850m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62851n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62852o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62853p = "";

    /* renamed from: q, reason: collision with root package name */
    public long f62854q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f62855r = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f62857t = "";

    @Override // jx3.a
    public int g() {
        return 16011;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62841d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62843f);
        stringBuffer.append(",");
        cm.x0 x0Var = this.f62844g;
        stringBuffer.append(x0Var != null ? x0Var.f43254d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62845h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62846i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62847j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62848k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62849l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62850m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62851n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62852o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62853p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62854q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62855r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62856s);
        stringBuffer.append(",");
        stringBuffer.append(this.f62857t);
        stringBuffer.append(",");
        stringBuffer.append(this.f62858u);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62859v);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62841d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62842e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62843f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62844g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62845h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62846i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62847j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62848k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62849l);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62850m);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62851n);
        stringBuffer.append("\r\nisPreloadPageFrame:");
        stringBuffer.append(this.f62852o);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62853p);
        stringBuffer.append("\r\ninitProcess:");
        stringBuffer.append(this.f62854q);
        stringBuffer.append("\r\nisFirstPageRenderingCacheAccepted:");
        stringBuffer.append(this.f62855r);
        stringBuffer.append("\r\nrunningState:");
        stringBuffer.append(this.f62856s);
        stringBuffer.append("\r\nSceneNote:");
        stringBuffer.append(this.f62857t);
        stringBuffer.append("\r\nEngineType:");
        stringBuffer.append(this.f62858u);
        stringBuffer.append("\r\nExptIOSUseByteCode:0\r\nwebviewType:");
        stringBuffer.append(this.f62859v);
        return stringBuffer.toString();
    }
}
