package com.tencent.mm.plugin.appbrand.app;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/app/AppBrandCriticalDataProvider;", "Lcom/tencent/luggage/wxa/storage/WxaCriticalDataProvider;", "Lhm0/u;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandCriticalDataProvider extends com.tencent.luggage.wxa.storage.WxaCriticalDataProvider implements hm0.u {
    @Override // hm0.u
    public void a() {
        try {
            this.f47737d.close();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.WxaCriticalDataProvider", th6, "uninstallDatabase", new java.lang.Object[0]);
        }
        this.f47737d = null;
    }

    @Override // com.tencent.luggage.wxa.storage.WxaCriticalDataProvider
    public l75.k0 d() {
        l75.k0 Ri = com.tencent.mm.plugin.appbrand.app.r9.Ri();
        if (Ri == null) {
            return null;
        }
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        java.util.Map map = this.f47738e;
        ((java.util.HashMap) map).put(k91.j4.class, ij6);
        ((java.util.HashMap) map).put(com.tencent.mm.plugin.appbrand.appcache.qa.class, com.tencent.mm.plugin.appbrand.app.r9.Di());
        ((java.util.HashMap) map).put(com.tencent.mm.plugin.appbrand.launching.a5.class, com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class));
        ((java.util.HashMap) map).put(t81.s.class, com.tencent.mm.plugin.appbrand.app.r9.fj(t81.s.class));
        im0.g gVar = im0.g.f292167g;
        gVar.getClass();
        if (!(Ri instanceof hm0.u)) {
            return Ri;
        }
        gVar.f292168d.v((hm0.u) Ri);
        return Ri;
    }

    @Override // com.tencent.luggage.wxa.storage.WxaCriticalDataProvider, android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        kotlin.jvm.internal.o.g(uri, "uri");
        android.net.Uri insert = super.insert(uri, contentValues);
        if (insert != null && com.tencent.luggage.wxa.storage.WxaCriticalDataProvider.f47735f.match(uri) == 5) {
            if (kotlin.jvm.internal.o.b(contentValues != null ? contentValues.getAsString("CONTENT_KEY_ACTION") : null, "ACTION_FLUSH_WXA_DEBUG_PKG_INFO")) {
                java.lang.String asString = contentValues.getAsString("CONTENT_KEY_APPID");
                java.lang.Integer asInteger = contentValues.getAsInteger("CONTENT_KEY_PKG_TYPE");
                int intValue = asInteger == null ? -1 : asInteger.intValue();
                if (!(asString == null || asString.length() == 0) && intValue != -1) {
                    com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
                    kotlin.jvm.internal.o.d(asString);
                    com.tencent.luggage.sdk.processes.r.u(a17, asString, intValue, false, 4, null);
                }
            }
        }
        return insert;
    }

    @Override // hm0.u
    public void r(gm0.m0 m0Var) {
    }
}
