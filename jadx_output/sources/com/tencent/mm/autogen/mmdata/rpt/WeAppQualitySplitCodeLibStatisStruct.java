package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySplitCodeLibStatisStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.f0 f62715f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62713d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62714e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62716g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62717h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f62718i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62719j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62720k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62721l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f62722m = 0;

    @Override // jx3.a
    public int g() {
        return 17120;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62713d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62714e);
        stringBuffer.append(",");
        cm.f0 f0Var = this.f62715f;
        stringBuffer.append(f0Var != null ? f0Var.f43080d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62716g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62717h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62718i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62719j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62720k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62721l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62722m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62713d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62714e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62715f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62716g);
        stringBuffer.append("\r\nProvider:");
        stringBuffer.append(this.f62717h);
        stringBuffer.append("\r\nVersion:");
        stringBuffer.append(this.f62718i);
        stringBuffer.append("\r\nStage:");
        stringBuffer.append(this.f62719j);
        stringBuffer.append("\r\nnetworkType:");
        stringBuffer.append(this.f62720k);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f62721l);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62722m);
        return stringBuffer.toString();
    }
}
