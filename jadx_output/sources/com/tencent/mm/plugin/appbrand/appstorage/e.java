package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final void a(long j17, java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.Map map = com.tencent.mm.plugin.appbrand.appstorage.f.f76163m;
        synchronized (map) {
            java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (r26.n0.D((java.lang.CharSequence) entry.getKey(), java.lang.String.valueOf(j17), false, 2, null) && r26.n0.D((java.lang.CharSequence) entry.getKey(), appId, false, 2, null)) {
                    it.remove();
                }
            }
        }
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.appstorage.f.f76164n;
        synchronized (map2) {
            java.util.Iterator it6 = ((java.util.LinkedHashMap) map2).entrySet().iterator();
            while (it6.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it6.next();
                if (r26.n0.D((java.lang.CharSequence) entry2.getKey(), java.lang.String.valueOf(j17), false, 2, null) && r26.n0.D((java.lang.CharSequence) entry2.getKey(), appId, false, 2, null)) {
                    it6.remove();
                }
            }
        }
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.f b(long j17, java.lang.String appId, java.lang.String encryptMMKVStorageSecretKey, com.tencent.mm.plugin.appbrand.appstorage.g0 g0Var) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(encryptMMKVStorageSecretKey, "encryptMMKVStorageSecretKey");
        java.lang.String str = j17 + '-' + appId;
        if (g0Var != null) {
            java.util.Map map = com.tencent.mm.plugin.appbrand.appstorage.f.f76164n;
            synchronized (map) {
                if (!((java.util.LinkedHashMap) map).keySet().contains(str)) {
                    map.put(str, new com.tencent.mm.plugin.appbrand.appstorage.f(j17, appId, encryptMMKVStorageSecretKey, g0Var));
                }
            }
            java.lang.Object obj = ((java.util.LinkedHashMap) map).get(str);
            kotlin.jvm.internal.o.d(obj);
            return (com.tencent.mm.plugin.appbrand.appstorage.f) obj;
        }
        java.util.Map map2 = com.tencent.mm.plugin.appbrand.appstorage.f.f76163m;
        synchronized (map2) {
            if (!((java.util.LinkedHashMap) map2).keySet().contains(str)) {
                map2.put(str, new com.tencent.mm.plugin.appbrand.appstorage.f(j17, appId, encryptMMKVStorageSecretKey, null));
            }
        }
        java.lang.Object obj2 = ((java.util.LinkedHashMap) map2).get(str);
        kotlin.jvm.internal.o.d(obj2);
        return (com.tencent.mm.plugin.appbrand.appstorage.f) obj2;
    }
}
