package ai1;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ai1.b f86614a = new ai1.b();

    public final java.lang.String a(java.util.List materialModelList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModelList, "materialModelList");
        x.d dVar = new x.d(0);
        java.util.Iterator it = materialModelList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) it.next();
            java.lang.String mimeType = c12476xea20f622.f167802d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
            if ((mimeType.length() > 0) && !dVar.contains(c12476xea20f622.f167802d) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12476xea20f622.f167802d, "unsupported")) {
                dVar.add(c12476xea20f622.f167802d);
            }
        }
        return kz5.n0.g0(kz5.n0.D0(dVar), "#", null, null, 0, null, null, 62, null);
    }

    public final nm5.b b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        java.lang.String materialExtension = materialModel.f167803e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialExtension, "materialExtension");
        if (materialExtension.length() > 0) {
            java.lang.String concat = "OpenMaterialsRsp###".concat(materialExtension);
            java.lang.String concat2 = "OpenMaterialsRspTime###_".concat(materialExtension);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
            java.lang.String string = a17 != null ? a17.getString(concat, null) : null;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
            java.lang.Long valueOf = a18 != null ? java.lang.Long.valueOf(a18.getLong(concat2, 0L)) : null;
            if (!(string == null || string.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKey: " + concat);
                try {
                    r45.ji3 ji3Var = new r45.ji3();
                    byte[] bytes = string.getBytes(r26.c.f450400c);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    ji3Var.mo11468x92b714fd(bytes);
                    return nm5.j.c(ji3Var, valueOf);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e17);
                    return null;
                }
            }
        }
        java.lang.String mimeType = materialModel.f167802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mimeType)) {
            return null;
        }
        java.lang.String concat3 = "OpenMaterialsRsp###".concat(mimeType);
        java.lang.String concat4 = "OpenMaterialsRspTime###_".concat(mimeType);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = q0Var2.a();
        java.lang.String string2 = a19 != null ? a19.getString(concat3, null) : null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = q0Var2.a();
        java.lang.Long valueOf2 = a27 != null ? java.lang.Long.valueOf(a27.getLong(concat4, 0L)) : null;
        if (string2 == null || string2.length() == 0) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.OpenMaterialDataCache", "get, got rawCgiRsp for cacheKeyFallback: " + concat3);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a28 = q0Var2.a();
        if (a28 != null) {
            a28.remove(concat3);
        }
        if (materialExtension.length() > 0) {
            java.lang.String concat5 = "OpenMaterialsRsp###".concat(materialExtension);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a29 = q0Var2.a();
            if (a29 != null) {
                a29.putString(concat5, string2);
            }
        }
        try {
            r45.ji3 ji3Var2 = new r45.ji3();
            byte[] bytes2 = string2.getBytes(r26.c.f450400c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            ji3Var2.mo11468x92b714fd(bytes2);
            return nm5.j.c(ji3Var2, valueOf2);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.OpenMaterialDataCache", "get, parse rawCgiRsp fail since " + e18);
            return null;
        }
    }
}
