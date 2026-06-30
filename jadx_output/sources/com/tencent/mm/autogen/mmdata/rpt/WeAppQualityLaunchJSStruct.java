package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityLaunchJSStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.x f62518g;

    /* renamed from: s, reason: collision with root package name */
    public long f62530s;

    /* renamed from: t, reason: collision with root package name */
    public long f62531t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62515d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62516e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62517f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62519h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62520i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62521j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62522k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62523l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62524m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62525n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62526o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f62527p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f62528q = "";

    /* renamed from: r, reason: collision with root package name */
    public long f62529r = 0;

    @Override // jx3.a
    public int g() {
        return 16010;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62515d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62516e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62517f);
        stringBuffer.append(",");
        cm.x xVar = this.f62518g;
        stringBuffer.append(xVar != null ? xVar.f43249d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62519h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62520i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62521j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62522k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62523l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62524m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62525n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62526o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62527p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62528q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62529r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62530s);
        stringBuffer.append(",");
        stringBuffer.append(this.f62531t);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62515d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62516e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62517f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62518g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62519h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62520i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62521j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62522k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62523l);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62524m);
        stringBuffer.append("\r\nisDownloadCode:");
        stringBuffer.append(this.f62525n);
        stringBuffer.append("\r\nisPatch:");
        stringBuffer.append(this.f62526o);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62527p);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62528q);
        stringBuffer.append("\r\ninitProcess:");
        stringBuffer.append(this.f62529r);
        stringBuffer.append("\r\nrunningState:");
        stringBuffer.append(this.f62530s);
        stringBuffer.append("\r\nlazyCodeLoading:");
        stringBuffer.append(this.f62531t);
        return stringBuffer.toString();
    }
}
