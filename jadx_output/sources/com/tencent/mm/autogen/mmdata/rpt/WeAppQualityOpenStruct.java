package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityOpenStruct extends jx3.a {
    public long B;

    /* renamed from: g, reason: collision with root package name */
    public cm.z f62579g;

    /* renamed from: p, reason: collision with root package name */
    public long f62588p;

    /* renamed from: t, reason: collision with root package name */
    public int f62592t;

    /* renamed from: u, reason: collision with root package name */
    public long f62593u;

    /* renamed from: v, reason: collision with root package name */
    public long f62594v;

    /* renamed from: z, reason: collision with root package name */
    public long f62598z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62576d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62577e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62578f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62580h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62581i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62582j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62583k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f62584l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62585m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62586n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f62587o = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f62589q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f62590r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f62591s = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f62595w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f62596x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f62597y = "";
    public java.lang.String A = "";

    @Override // jx3.a
    public int g() {
        return 16367;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62576d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62577e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62578f);
        stringBuffer.append(",");
        cm.z zVar = this.f62579g;
        stringBuffer.append(zVar != null ? zVar.f43269d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62580h);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62581i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62582j);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62583k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62584l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62585m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62586n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62587o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62588p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62589q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62590r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62591s);
        stringBuffer.append(",");
        stringBuffer.append(this.f62592t);
        stringBuffer.append(",");
        stringBuffer.append(this.f62593u);
        stringBuffer.append(",");
        stringBuffer.append(this.f62594v);
        stringBuffer.append(",");
        stringBuffer.append(this.f62595w);
        stringBuffer.append(",");
        stringBuffer.append(this.f62596x);
        stringBuffer.append(",");
        stringBuffer.append(this.f62597y);
        stringBuffer.append(",");
        stringBuffer.append(this.f62598z);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.A);
        stringBuffer.append(",");
        stringBuffer.append(this.B);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62576d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62577e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62578f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62579g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62580h);
        stringBuffer.append("\r\nCostTimeMs:0\r\nScene:");
        stringBuffer.append(this.f62581i);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62582j);
        stringBuffer.append("\r\nEndTimeStampMs:0\r\nnetworkType:");
        stringBuffer.append(this.f62583k);
        stringBuffer.append("\r\nisLaunch:");
        stringBuffer.append(this.f62584l);
        stringBuffer.append("\r\nUserName:");
        stringBuffer.append(this.f62585m);
        stringBuffer.append("\r\nloadingType:");
        stringBuffer.append(this.f62586n);
        stringBuffer.append("\r\nscene_data:");
        stringBuffer.append(this.f62587o);
        stringBuffer.append("\r\nrunningState:");
        stringBuffer.append(this.f62588p);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62589q);
        stringBuffer.append("\r\nreload_referrer:");
        stringBuffer.append(this.f62590r);
        stringBuffer.append("\r\nreload_reason:");
        stringBuffer.append(this.f62591s);
        stringBuffer.append("\r\nuser_type:");
        stringBuffer.append(this.f62592t);
        stringBuffer.append("\r\nlaunchMode:");
        stringBuffer.append(this.f62593u);
        stringBuffer.append("\r\ncoldStartMode:");
        stringBuffer.append(this.f62594v);
        stringBuffer.append("\r\nshortLink:");
        stringBuffer.append(this.f62595w);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f62596x);
        stringBuffer.append("\r\nSceneNote:");
        stringBuffer.append(this.f62597y);
        stringBuffer.append("\r\nWeakNetType:");
        stringBuffer.append(this.f62598z);
        stringBuffer.append("\r\nEngineType:0\r\nExptIOSUseByteCode:0\r\nPCXWebVersion:0\r\nPubLibVersion:");
        stringBuffer.append(this.A);
        stringBuffer.append("\r\nWXProcessColdStartTimestamp:");
        stringBuffer.append(this.B);
        return stringBuffer.toString();
    }
}
