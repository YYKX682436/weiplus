package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class cb implements com.tencent.mm.plugin.appbrand.service.p6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80192b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f80193c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.eb f80196f;

    public cb(java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i18, com.tencent.mm.plugin.appbrand.jsapi.eb ebVar) {
        this.f80191a = str;
        this.f80192b = str2;
        this.f80193c = i17;
        this.f80194d = lVar;
        this.f80195e = i18;
        this.f80196f = ebVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.p6
    public final void a(com.tencent.mm.plugin.appbrand.service.r6 r6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "preDownload appId:" + this.f80191a + " moduleName:" + this.f80192b + " scene:" + this.f80193c + " result:" + r6Var);
        com.tencent.mm.plugin.appbrand.service.r6 r6Var2 = com.tencent.mm.plugin.appbrand.service.r6.Success_AllPkgDownloaded;
        com.tencent.mm.plugin.appbrand.jsapi.eb ebVar = this.f80196f;
        int i17 = this.f80195e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80194d;
        if (r6Var == r6Var2 || r6Var == com.tencent.mm.plugin.appbrand.service.r6.Success_AllPkgDownloadedPrevious || r6Var == com.tencent.mm.plugin.appbrand.service.r6.Success_NoNeedGetCode) {
            lVar.a(i17, ebVar.o("ok"));
        } else {
            lVar.a(i17, ebVar.o("fail"));
        }
    }
}
