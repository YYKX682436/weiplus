package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class zc extends java.util.HashMap {
    public zc() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.predownload.export.WxaPkgStorageExportServiceImpl");
        for (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 c1Var : ((com.tencent.mm.plugin.appbrand.appcache.predownload.export.f1) c17).wi()) {
            if (c1Var != null) {
                put(c1Var.f75780d, c1Var);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) {
            return super.containsValue((com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj == null ? true : obj instanceof java.lang.String) ? obj2 : (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) super.getOrDefault((java.lang.String) obj, (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof java.lang.String) {
            return (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (!(obj == null ? true : obj instanceof java.lang.String)) {
            return false;
        }
        if (obj2 != null ? obj2 instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1 : true) {
            return super.remove((java.lang.String) obj, (com.tencent.mm.plugin.appbrand.appcache.predownload.export.c1) obj2);
        }
        return false;
    }
}
