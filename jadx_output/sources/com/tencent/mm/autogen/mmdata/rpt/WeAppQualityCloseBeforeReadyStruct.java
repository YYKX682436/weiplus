package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityCloseBeforeReadyStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.u f62446g;

    /* renamed from: s, reason: collision with root package name */
    public long f62458s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62443d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62444e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62445f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62447h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62448i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62449j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62450k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62451l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62452m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62453n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62454o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62455p = "";

    /* renamed from: q, reason: collision with root package name */
    public long f62456q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f62457r = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f62459t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f62460u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f62461v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f62462w = 0;

    @Override // jx3.a
    public int g() {
        return 18033;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62443d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62444e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62445f);
        stringBuffer.append(",");
        cm.u uVar = this.f62446g;
        stringBuffer.append(uVar != null ? uVar.f43221d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62447h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62448i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62449j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62450k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62451l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62452m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62453n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62454o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62455p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62456q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62457r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62458s);
        stringBuffer.append(",");
        stringBuffer.append(this.f62459t);
        stringBuffer.append(",");
        stringBuffer.append(this.f62460u);
        stringBuffer.append(",");
        stringBuffer.append(this.f62461v);
        stringBuffer.append(",");
        stringBuffer.append(this.f62462w);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62443d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62444e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62445f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62446g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62447h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62448i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62449j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62450k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62451l);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f62452m);
        stringBuffer.append("\r\nisDownloadCode:");
        stringBuffer.append(this.f62453n);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62454o);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62455p);
        stringBuffer.append("\r\nisContactSync:");
        stringBuffer.append(this.f62456q);
        stringBuffer.append("\r\nisLaunchSync:");
        stringBuffer.append(this.f62457r);
        stringBuffer.append("\r\nphase:");
        stringBuffer.append(this.f62458s);
        stringBuffer.append("\r\nshowAd:");
        stringBuffer.append(this.f62459t);
        stringBuffer.append("\r\ncheckShowAdTimeThreshold:");
        stringBuffer.append(this.f62460u);
        stringBuffer.append("\r\nisCheckJsApiInfoSync:");
        stringBuffer.append(this.f62461v);
        stringBuffer.append("\r\nisCheckAppidABTestInfoSync:");
        stringBuffer.append(this.f62462w);
        return stringBuffer.toString();
    }
}
