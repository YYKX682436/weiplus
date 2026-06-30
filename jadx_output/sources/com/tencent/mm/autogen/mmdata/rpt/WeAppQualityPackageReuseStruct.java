package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityPackageReuseStruct extends jx3.a {

    /* renamed from: k, reason: collision with root package name */
    public long f62606k;

    /* renamed from: l, reason: collision with root package name */
    public long f62607l;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62599d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62600e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62601f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62602g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62603h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62604i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62605j = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62608m = "";

    @Override // jx3.a
    public int g() {
        return 22832;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62599d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62600e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62601f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62602g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62603h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62604i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62605j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62606k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62607l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62608m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62599d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62600e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62601f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62602g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62603h);
        stringBuffer.append("\r\nmd5:");
        stringBuffer.append(this.f62604i);
        stringBuffer.append("\r\nmoduleName:");
        stringBuffer.append(this.f62605j);
        stringBuffer.append("\r\npackageType:");
        stringBuffer.append(this.f62606k);
        stringBuffer.append("\r\nreuse_type:");
        stringBuffer.append(this.f62607l);
        stringBuffer.append("\r\nresue_reason:");
        stringBuffer.append(this.f62608m);
        return stringBuffer.toString();
    }
}
