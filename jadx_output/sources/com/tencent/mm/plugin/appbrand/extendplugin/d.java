package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public class d implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.e f78032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f78033e;

    public d(com.tencent.mm.plugin.appbrand.extendplugin.b bVar, sf.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f78032d = eVar;
        this.f78033e = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandInvokeContext", "onBackground");
        sf.e eVar = this.f78032d;
        if (eVar != null) {
            eVar.a(tf1.h.b(this.f78033e.getAppId()));
        }
    }
}
