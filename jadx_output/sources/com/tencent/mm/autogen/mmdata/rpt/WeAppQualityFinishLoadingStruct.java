package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityFinishLoadingStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.v f62466g;

    /* renamed from: m, reason: collision with root package name */
    public long f62472m;

    /* renamed from: n, reason: collision with root package name */
    public long f62473n;

    /* renamed from: o, reason: collision with root package name */
    public long f62474o;

    /* renamed from: p, reason: collision with root package name */
    public long f62475p;

    /* renamed from: q, reason: collision with root package name */
    public long f62476q;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62463d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62464e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62465f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62467h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62468i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62469j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62470k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62471l = "";

    @Override // jx3.a
    public int g() {
        return 19266;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62463d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62464e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62465f);
        stringBuffer.append(",");
        cm.v vVar = this.f62466g;
        stringBuffer.append(vVar != null ? vVar.f43230d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62467h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62468i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62469j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62470k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62471l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62472m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62473n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62474o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62475p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62476q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62463d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62464e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62465f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62466g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62467h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62468i);
        stringBuffer.append("\r\nScene:0\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62469j);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62470k);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62471l);
        stringBuffer.append("\r\nisDownloadCode:");
        stringBuffer.append(this.f62472m);
        stringBuffer.append("\r\nisPatch:");
        stringBuffer.append(this.f62473n);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62474o);
        stringBuffer.append("\r\ninitProcess:");
        stringBuffer.append(this.f62475p);
        stringBuffer.append("\r\nLoadingInEndT:");
        stringBuffer.append(this.f62476q);
        return stringBuffer.toString();
    }
}
