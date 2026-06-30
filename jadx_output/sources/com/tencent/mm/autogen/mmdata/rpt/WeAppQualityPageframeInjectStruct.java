package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityPageframeInjectStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.b0 f62627g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62624d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62625e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62626f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62628h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62629i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62630j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62631k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62632l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62633m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62634n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f62635o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f62636p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f62637q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f62638r = "";

    @Override // jx3.a
    public int g() {
        return 16005;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62624d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62625e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62626f);
        stringBuffer.append(",");
        cm.b0 b0Var = this.f62627g;
        stringBuffer.append(b0Var != null ? b0Var.f43033d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62628h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62629i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62630j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62631k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62632l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62633m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62634n);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f62635o);
        stringBuffer.append(",");
        stringBuffer.append(this.f62636p);
        stringBuffer.append(",");
        stringBuffer.append(this.f62637q);
        stringBuffer.append(",");
        stringBuffer.append(this.f62638r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62624d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62625e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62626f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62627g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62628h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62629i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62630j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62631k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62632l);
        stringBuffer.append("\r\npackage:");
        stringBuffer.append(this.f62633m);
        stringBuffer.append("\r\nfileSize:");
        stringBuffer.append(this.f62634n);
        stringBuffer.append("\r\nisPreloadPageFrame:0\r\nuseCodeCache:");
        stringBuffer.append(this.f62635o);
        stringBuffer.append("\r\nengineType:");
        stringBuffer.append(this.f62636p);
        stringBuffer.append("\r\nengineVersion:");
        stringBuffer.append(this.f62637q);
        stringBuffer.append("\r\nlazyLoadKey:");
        stringBuffer.append(this.f62638r);
        return stringBuffer.toString();
    }
}
