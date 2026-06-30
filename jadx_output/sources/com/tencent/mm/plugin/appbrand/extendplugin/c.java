package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.e f78031d;

    public c(com.tencent.mm.plugin.appbrand.extendplugin.b bVar, sf.e eVar) {
        this.f78031d = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "onForeground");
        sf.e eVar = this.f78031d;
        if (eVar != null) {
            eVar.b();
        }
    }
}
