package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class a0 {
    public a0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.g0 a(long j17) {
        java.util.Map map = com.tencent.mm.plugin.appbrand.appstorage.g0.f76182i;
        synchronized (map) {
            if (!((java.util.LinkedHashMap) map).keySet().contains(java.lang.Long.valueOf(j17))) {
                map.put(java.lang.Long.valueOf(j17), new com.tencent.mm.plugin.appbrand.appstorage.g0(j17, ""));
            }
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(j17));
        kotlin.jvm.internal.o.d(obj);
        return (com.tencent.mm.plugin.appbrand.appstorage.g0) obj;
    }
}
