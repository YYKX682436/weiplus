package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAppServiceInitStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.s f62409g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62406d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62407e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62408f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62410h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62411i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62412j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62413k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62414l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62415m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f62416n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62417o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f62418p = "";

    @Override // jx3.a
    public int g() {
        return 15814;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62406d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62407e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62408f);
        stringBuffer.append(",");
        cm.s sVar = this.f62409g;
        stringBuffer.append(sVar != null ? sVar.f43203d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62410h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62411i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62412j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62413k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62414l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62415m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62416n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62417o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62418p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62406d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62407e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62408f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62409g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62410h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62411i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62412j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62413k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62414l);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62415m);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62416n);
        stringBuffer.append("\r\nisGame:");
        stringBuffer.append(this.f62417o);
        stringBuffer.append("\r\nengineVersion:");
        stringBuffer.append(this.f62418p);
        return stringBuffer.toString();
    }
}
