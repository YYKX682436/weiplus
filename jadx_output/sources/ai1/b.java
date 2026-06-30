package ai1;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ai1.b f5081a = new ai1.b();

    public final java.lang.String a(java.util.List materialModelList) {
        kotlin.jvm.internal.o.g(materialModelList, "materialModelList");
        x.d dVar = new x.d(0);
        java.util.Iterator it = materialModelList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel = (com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel) it.next();
            java.lang.String mimeType = materialModel.f86269d;
            kotlin.jvm.internal.o.f(mimeType, "mimeType");
            if ((mimeType.length() > 0) && !dVar.contains(materialModel.f86269d) && !kotlin.jvm.internal.o.b(materialModel.f86269d, "unsupported")) {
                dVar.add(materialModel.f86269d);
            }
        }
        return kz5.n0.g0(kz5.n0.D0(dVar), "#", null, null, 0, null, null, 62, null);
    }

    public final nm5.b b(com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel materialModel) {
        kotlin.jvm.internal.o.g(materialModel, "materialModel");
        java.lang.String materialExtension = materialModel.f86270e;
        kotlin.jvm.internal.o.f(materialExtension, "materialExtension");
        if (materialExtension.length() > 0) {
            java.lang.String concat = "OpenMaterialsRsp###".concat(materialExtension);
            java.lang.String concat2 = "OpenMaterialsRspTime###_".concat(materialExtension);
            com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
            com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
            java.lang.String string = a17 != null ? a17.getString(concat, null) : null;
            com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.getLong(concat2, 0L)) : null;
            if (!(string == null || string.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKey: " + concat);
                try {
                    r45.ji3 ji3Var = new r45.ji3();
                    byte[] bytes = string.getBytes(r26.c.f368867c);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    ji3Var.parseFrom(bytes);
                    return nm5.j.c(ji3Var, valueOf);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e17);
                    return null;
                }
            }
        }
        java.lang.String mimeType = materialModel.f86269d;
        kotlin.jvm.internal.o.f(mimeType, "mimeType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(mimeType)) {
            return null;
        }
        java.lang.String concat3 = "OpenMaterialsRsp###".concat(mimeType);
        java.lang.String concat4 = "OpenMaterialsRspTime###_".concat(mimeType);
        com.tencent.mm.plugin.appbrand.app.q0 q0Var2 = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
        com.tencent.mm.sdk.platformtools.o4 a19 = q0Var2.a();
        java.lang.String string2 = a19 != null ? a19.getString(concat3, null) : null;
        com.tencent.mm.sdk.platformtools.o4 a27 = q0Var2.a();
        java.lang.Long valueOf2 = a27 != null ? java.lang.Long.valueOf(a27.getLong(concat4, 0L)) : null;
        if (string2 == null || string2.length() == 0) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKeyFallback: " + concat3);
        com.tencent.mm.sdk.platformtools.o4 a28 = q0Var2.a();
        if (a28 != null) {
            a28.remove(concat3);
        }
        if (materialExtension.length() > 0) {
            java.lang.String concat5 = "OpenMaterialsRsp###".concat(materialExtension);
            com.tencent.mm.sdk.platformtools.o4 a29 = q0Var2.a();
            if (a29 != null) {
                a29.putString(concat5, string2);
            }
        }
        try {
            r45.ji3 ji3Var2 = new r45.ji3();
            byte[] bytes2 = string2.getBytes(r26.c.f368867c);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            ji3Var2.parseFrom(bytes2);
            return nm5.j.c(ji3Var2, valueOf2);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e18);
            return null;
        }
    }
}
