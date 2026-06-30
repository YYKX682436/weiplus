package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppPreDownloadStruct */
/* loaded from: classes7.dex */
public final class C7080x809107ed extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.l f143882g;

    /* renamed from: h, reason: collision with root package name */
    public cm.m f143883h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143879d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143880e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143881f = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f143884i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f143885j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f143886k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f143887l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f143888m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f143889n = 0;

    @Override // jx3.a
    public int g() {
        return 16602;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143879d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143880e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143881f);
        stringBuffer.append(",");
        cm.l lVar = this.f143882g;
        stringBuffer.append(lVar != null ? lVar.f124663d : -1);
        stringBuffer.append(",");
        cm.m mVar = this.f143883h;
        stringBuffer.append(mVar != null ? mVar.f124677d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f143884i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143885j);
        stringBuffer.append(",");
        stringBuffer.append(this.f143886k);
        stringBuffer.append(",");
        stringBuffer.append(this.f143887l);
        stringBuffer.append(",");
        stringBuffer.append(this.f143888m);
        stringBuffer.append(",");
        stringBuffer.append(this.f143889n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f143879d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f143880e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f143881f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f143882g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f143883h);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f143884i);
        stringBuffer.append("\r\nPreloadKey:");
        stringBuffer.append(this.f143885j);
        stringBuffer.append("\r\nPreloadValue:");
        stringBuffer.append(this.f143886k);
        stringBuffer.append("\r\nisDownloadCode:");
        stringBuffer.append(this.f143887l);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f143888m);
        stringBuffer.append("\r\nhasSplashScreen:");
        stringBuffer.append(this.f143889n);
        return stringBuffer.toString();
    }
}
