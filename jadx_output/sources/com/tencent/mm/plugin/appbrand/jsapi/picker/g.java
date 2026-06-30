package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f82730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.i f82732f;

    public g(com.tencent.mm.plugin.appbrand.jsapi.picker.i iVar, java.lang.ref.WeakReference weakReference, int i17) {
        this.f82732f = iVar;
        this.f82730d = weakReference;
        this.f82731e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) com.tencent.mm.plugin.appbrand.jsapi.picker.i.f82736g.get();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (com.tencent.mm.sdk.platformtools.x2.m()) {
                try {
                    str = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.jsapi.picker.h.class)).f68406d;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e17, "query updated address path", new java.lang.Object[0]);
                    str = null;
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiGetRegionData", "MMProcessExist==FALSE, will fallback assets file");
                str = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use updatedAddressPath[%s]", str);
                try {
                    str2 = com.tencent.mm.vfs.w6.M(str);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e18, "read address from file %s", str);
                    str2 = null;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use assets");
                try {
                    str2 = com.tencent.mm.sdk.platformtools.t8.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("address"));
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e19, "read address from assets", new java.lang.Object[0]);
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiGetRegionData", "get invalid data");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "update process shared data, size[%d]", java.lang.Integer.valueOf(str2.length()));
                com.tencent.mm.plugin.appbrand.jsapi.picker.i.f82736g.set(str2);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiGetRegionData", "use process shared cache, size[%d]", java.lang.Integer.valueOf(str2.length()));
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) this.f82730d.get();
        if (v5Var == null || !v5Var.isRunning()) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
        v5Var.a(this.f82731e, this.f82732f.p("ok", hashMap));
    }
}
