package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppInitLagMonitorStruct */
/* loaded from: classes7.dex */
public final class C7074xa61db380 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.h f143814f;

    /* renamed from: n, reason: collision with root package name */
    public long f143822n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143812d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f143813e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f143815g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143816h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143817i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f143818j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f143819k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f143820l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f143821m = "";

    @Override // jx3.a
    public int g() {
        return 27224;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143812d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143813e);
        stringBuffer.append(",");
        cm.h hVar = this.f143814f;
        stringBuffer.append(hVar != null ? hVar.f124628d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143815g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143816h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143817i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143818j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143819k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143820l);
        stringBuffer.append(",");
        stringBuffer.append(this.f143821m);
        stringBuffer.append(",");
        stringBuffer.append(this.f143822n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f143812d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143813e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143814f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143815g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143816h);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f143817i);
        stringBuffer.append("\r\nProcessName:");
        stringBuffer.append(this.f143818j);
        stringBuffer.append("\r\nThreadName:");
        stringBuffer.append(this.f143819k);
        stringBuffer.append("\r\nStack:");
        stringBuffer.append(this.f143820l);
        stringBuffer.append("\r\nStackID:");
        stringBuffer.append(this.f143821m);
        stringBuffer.append("\r\nLagThreshold:");
        stringBuffer.append(this.f143822n);
        return stringBuffer.toString();
    }
}
