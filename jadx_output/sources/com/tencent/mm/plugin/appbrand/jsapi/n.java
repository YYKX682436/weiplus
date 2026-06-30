package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class n implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.m f82354a;

    public n(com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        this.f82354a = mVar;
    }

    @Override // pd.d
    public void a(java.lang.Class cls, nd.d dVar) {
    }

    @Override // pd.d
    public void b(java.lang.Class cls, nd.b bVar) {
        if (cls == null || bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandComponentImpl", "registerCustomize failed, clazz(%s) or customize(%s) is null.", cls, bVar);
            return;
        }
        lm0.e eVar = this.f82354a.f81582o;
        eVar.getClass();
        eVar.a(cls, new lm0.f(bVar));
    }
}
