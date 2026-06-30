package com.tencent.mm.plugin.appbrand.luggage.customize;

/* loaded from: classes7.dex */
public class b implements oe.a {
    public void a(java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.appstorage.o Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        Bi.getClass();
        for (int i17 = 0; i17 <= com.tencent.mm.plugin.appbrand.appstorage.a2.f76137a; i17++) {
            Bi.k(i17, appId);
        }
        long longValue = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appId)).longValue();
        com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(longValue).a(appId);
        com.tencent.mm.plugin.appbrand.appstorage.e eVar = com.tencent.mm.plugin.appbrand.appstorage.f.f76162i;
        kotlin.jvm.internal.o.g(appId, "appId");
        new com.tencent.mm.plugin.appbrand.appstorage.f(longValue, appId, "", null).a(appId);
        w81.b bVar = (w81.b) com.tencent.mm.plugin.appbrand.app.r9.fj(w81.b.class);
        if (bVar != null) {
            iz5.a.g(null, com.tencent.mm.sdk.platformtools.x2.n());
            w81.c cVar = new w81.c();
            cVar.field_appId = appId;
            bVar.delete(cVar, "appId");
        }
        com.tencent.mm.plugin.appbrand.appstorage.h.f76191a.a(longValue, appId);
    }

    public com.tencent.mm.plugin.appbrand.appstorage.q1 b(java.lang.String str, int i17, java.lang.String str2) {
        if (i17 == 2) {
            return com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(str)).longValue());
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.appbrand.appstorage.g0 a17 = com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(str)).longValue());
            return com.tencent.mm.plugin.appbrand.appstorage.f.f76162i.b(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(str)).longValue(), str, str2, a17);
        }
        if (i17 != 5) {
            return com.tencent.mm.plugin.appbrand.appstorage.g0.f76181h.a(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(str)).longValue());
        }
        return com.tencent.mm.plugin.appbrand.appstorage.f.f76162i.b(new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(str)).longValue(), str, str2, null);
    }
}
