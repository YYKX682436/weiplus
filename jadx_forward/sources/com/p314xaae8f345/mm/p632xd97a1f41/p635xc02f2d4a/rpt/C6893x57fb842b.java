package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct */
/* loaded from: classes4.dex */
public final class C6893x57fb842b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f142084d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142085e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f142086f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f142087g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f142088h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f142089i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f142090j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f142091k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f142092l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f142093m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142094n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f142095o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f142096p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f142097q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f142098r = 0;

    @Override // jx3.a
    public int g() {
        return 26122;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142084d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142085e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142086f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142087g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142088h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142089i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142090j);
        stringBuffer.append(",");
        stringBuffer.append(this.f142091k);
        stringBuffer.append(",");
        stringBuffer.append(this.f142092l);
        stringBuffer.append(",");
        stringBuffer.append(this.f142093m);
        stringBuffer.append(",");
        stringBuffer.append(this.f142094n);
        stringBuffer.append(",");
        stringBuffer.append(this.f142095o);
        stringBuffer.append(",");
        stringBuffer.append(this.f142096p);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f142097q);
        stringBuffer.append(",");
        stringBuffer.append(this.f142098r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f142084d);
        stringBuffer.append("\r\nWorkId:");
        stringBuffer.append(this.f142085e);
        stringBuffer.append("\r\nMuxCode:");
        stringBuffer.append(this.f142086f);
        stringBuffer.append("\r\nLastWorkType:");
        stringBuffer.append(this.f142087g);
        stringBuffer.append("\r\nCurrentWorkType:");
        stringBuffer.append(this.f142088h);
        stringBuffer.append("\r\nConfirmEditTimeStamp:");
        stringBuffer.append(this.f142089i);
        stringBuffer.append("\r\nConfirmPublishTimeStamp:");
        stringBuffer.append(this.f142090j);
        stringBuffer.append("\r\nStartMuxTimeStamp:");
        stringBuffer.append(this.f142091k);
        stringBuffer.append("\r\nFinishMuxTimeStamp:");
        stringBuffer.append(this.f142092l);
        stringBuffer.append("\r\nFakeVideoIsPlaySuccess:");
        stringBuffer.append(this.f142093m);
        stringBuffer.append("\r\nEncodeConfig:");
        stringBuffer.append(this.f142094n);
        stringBuffer.append("\r\nIsSnsDoubleCheck:");
        stringBuffer.append(this.f142095o);
        stringBuffer.append("\r\nMixVideoInfo:");
        stringBuffer.append(this.f142096p);
        stringBuffer.append("\r\nIsUseSoftRetry:0\r\nIsKilledProcessReStart:");
        stringBuffer.append(this.f142097q);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f142098r);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6893x57fb842b p(java.lang.String str) {
        this.f142085e = b("WorkId", str, true);
        return this;
    }
}
