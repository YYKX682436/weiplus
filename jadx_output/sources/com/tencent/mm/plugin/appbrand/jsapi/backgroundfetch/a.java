package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes.dex */
public class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.c f79842f;

    public a(com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.c cVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79842f = cVar;
        this.f79840d = lVar;
        this.f79841e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.c cVar = this.f79842f;
        int i17 = this.f79841e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79840d;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken fail");
            lVar.a(i17, cVar.o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken success");
        java.lang.String str = iPCString.f68406d;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetBackgroundFetchToken", "getBackgroundFetchToken, token:%s", str);
        lVar.a(i17, cVar.p("ok", hashMap));
    }
}
