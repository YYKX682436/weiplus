package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityPageHtmlInjectStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.a0 f62612g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62609d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62610e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62611f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62613h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62614i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62615j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62616k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62617l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62618m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f62619n = "";

    /* renamed from: o, reason: collision with root package name */
    public long f62620o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f62621p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f62622q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f62623r = "";

    @Override // jx3.a
    public int g() {
        return 16006;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62609d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62610e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62611f);
        stringBuffer.append(",");
        cm.a0 a0Var = this.f62612g;
        stringBuffer.append(a0Var != null ? a0Var.f43017d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62613h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62614i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62615j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62616k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62617l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62618m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62619n);
        stringBuffer.append(",");
        stringBuffer.append(this.f62620o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62621p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62622q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62623r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62609d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62610e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62611f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62612g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62613h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62614i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62615j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62616k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62617l);
        stringBuffer.append("\r\npath:");
        stringBuffer.append(this.f62618m);
        stringBuffer.append("\r\nreferrer:");
        stringBuffer.append(this.f62619n);
        stringBuffer.append("\r\nfileSize:");
        stringBuffer.append(this.f62620o);
        stringBuffer.append("\r\nuseCodeCache:");
        stringBuffer.append(this.f62621p);
        stringBuffer.append("\r\nengineType:");
        stringBuffer.append(this.f62622q);
        stringBuffer.append("\r\nengineVersion:");
        stringBuffer.append(this.f62623r);
        return stringBuffer.toString();
    }
}
