package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualitySystemLaunchCGIStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.n0 f62767g;

    /* renamed from: m, reason: collision with root package name */
    public cm.p0 f62773m;

    /* renamed from: n, reason: collision with root package name */
    public cm.o0 f62774n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62764d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62765e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62766f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62768h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62769i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62770j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62771k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62772l = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62775o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f62776p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f62777q = "";

    /* renamed from: r, reason: collision with root package name */
    public long f62778r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f62779s = "";

    @Override // jx3.a
    public int g() {
        return 15765;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62764d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62765e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62766f);
        stringBuffer.append(",");
        cm.n0 n0Var = this.f62767g;
        stringBuffer.append(n0Var != null ? n0Var.f43158d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62768h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62769i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62770j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62771k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62772l);
        stringBuffer.append(",");
        cm.p0 p0Var = this.f62773m;
        stringBuffer.append(p0Var != null ? p0Var.f43178d : -1);
        stringBuffer.append(",");
        cm.o0 o0Var = this.f62774n;
        stringBuffer.append(o0Var != null ? o0Var.f43167d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62775o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62776p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62777q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62778r);
        stringBuffer.append(",");
        stringBuffer.append(this.f62779s);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62764d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62765e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62766f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62767g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62768h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62769i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62770j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62771k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62772l);
        stringBuffer.append("\r\nRet:");
        stringBuffer.append(this.f62773m);
        stringBuffer.append("\r\nIsSync:");
        stringBuffer.append(this.f62774n);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f62775o);
        stringBuffer.append("\r\nIsNormalOpen:");
        stringBuffer.append(this.f62776p);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f62777q);
        stringBuffer.append("\r\nisParallel:");
        stringBuffer.append(this.f62778r);
        stringBuffer.append("\r\nNetworkTypeStr:");
        stringBuffer.append(this.f62779s);
        return stringBuffer.toString();
    }
}
