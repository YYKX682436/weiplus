package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class b3 implements com.tencent.mm.plugin.appbrand.utils.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f79818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f79821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f79823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f79824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.z2 f79825h;

    public b3(com.tencent.mm.plugin.appbrand.jsapi.z2 z2Var, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, java.lang.String str2, boolean z17, int i17, boolean z18, int i18) {
        this.f79825h = z2Var;
        this.f79818a = n7Var;
        this.f79819b = str;
        this.f79820c = str2;
        this.f79821d = z17;
        this.f79822e = i17;
        this.f79823f = z18;
        this.f79824g = i18;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddToFavorites", "onLoad %s", str);
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f79818a;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = n7Var.getRuntime().u0();
        int i17 = n7Var.getRuntime().E0().f77343z1;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest jsApiAddToFavorites$IPCFavRequest = new com.tencent.mm.plugin.appbrand.jsapi.JsApiAddToFavorites$IPCFavRequest();
        jsApiAddToFavorites$IPCFavRequest.f78496d = u07.f47278x;
        jsApiAddToFavorites$IPCFavRequest.f78497e = u07.f77278d;
        jsApiAddToFavorites$IPCFavRequest.f78498f = this.f79819b;
        jsApiAddToFavorites$IPCFavRequest.f78499g = u07.f77280f;
        jsApiAddToFavorites$IPCFavRequest.f78503n = str;
        jsApiAddToFavorites$IPCFavRequest.f78502m = this.f79820c;
        jsApiAddToFavorites$IPCFavRequest.f78500h = u07.L;
        jsApiAddToFavorites$IPCFavRequest.f78501i = u07.f77281g;
        jsApiAddToFavorites$IPCFavRequest.f78504o = (n7Var.H1(3).f85995c || this.f79821d) ? 1 : 0;
        jsApiAddToFavorites$IPCFavRequest.f78505p = i17;
        jsApiAddToFavorites$IPCFavRequest.f78506q = u07.f47269b2.f87790f;
        jsApiAddToFavorites$IPCFavRequest.f78507r = u07.D.f77326h;
        jsApiAddToFavorites$IPCFavRequest.f78508s = this.f79822e;
        jsApiAddToFavorites$IPCFavRequest.f78509t = this.f79823f;
        jsApiAddToFavorites$IPCFavRequest.f78510u = com.tencent.mm.plugin.appbrand.ui.na.j(n7Var.getF147807d());
        android.content.Context f147807d = n7Var.getF147807d();
        com.tencent.mm.plugin.appbrand.jsapi.a3 a3Var = new com.tencent.mm.plugin.appbrand.jsapi.a3(this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiAddToFavorites$IPCFavRequest, a3Var, null);
    }
}
