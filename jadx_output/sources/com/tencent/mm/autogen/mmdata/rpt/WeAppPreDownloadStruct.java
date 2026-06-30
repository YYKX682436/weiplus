package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppPreDownloadStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.l f62349g;

    /* renamed from: h, reason: collision with root package name */
    public cm.m f62350h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62346d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62347e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62348f = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62351i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62352j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62353k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62354l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62355m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f62356n = 0;

    @Override // jx3.a
    public int g() {
        return 16602;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62346d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62347e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62348f);
        stringBuffer.append(",");
        cm.l lVar = this.f62349g;
        stringBuffer.append(lVar != null ? lVar.f43130d : -1);
        stringBuffer.append(",");
        cm.m mVar = this.f62350h;
        stringBuffer.append(mVar != null ? mVar.f43144d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62351i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62352j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62353k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62354l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62355m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62356n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f62346d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62347e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62348f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62349g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62350h);
        stringBuffer.append("\r\nisPreload:");
        stringBuffer.append(this.f62351i);
        stringBuffer.append("\r\nPreloadKey:");
        stringBuffer.append(this.f62352j);
        stringBuffer.append("\r\nPreloadValue:");
        stringBuffer.append(this.f62353k);
        stringBuffer.append("\r\nisDownloadCode:");
        stringBuffer.append(this.f62354l);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62355m);
        stringBuffer.append("\r\nhasSplashScreen:");
        stringBuffer.append(this.f62356n);
        return stringBuffer.toString();
    }
}
