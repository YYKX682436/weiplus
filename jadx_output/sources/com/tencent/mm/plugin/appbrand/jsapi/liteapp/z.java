package com.tencent.mm.plugin.appbrand.jsapi.liteapp;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.jsapi.liteapp.z f81563b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f81564a = new java.util.concurrent.ConcurrentHashMap();

    public void a(java.lang.String str, com.tencent.mm.ipcinvoker.r rVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f81564a;
        if (concurrentHashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppStoreListenerManager", "appId already exists");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppStoreListenerManager", "add listener appId: %s", str);
        com.tencent.mm.plugin.appbrand.jsapi.liteapp.y yVar = new com.tencent.mm.plugin.appbrand.jsapi.liteapp.y(str, rVar);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Di(yVar);
        concurrentHashMap.put(str, yVar);
    }

    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppStoreListenerManager", "remove listener appId: %s", str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f81564a;
        q80.a0 a0Var = (q80.a0) concurrentHashMap.get(str);
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppStoreListenerManager", "listener not found for appId: %s", str);
        } else {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ak(a0Var);
            concurrentHashMap.remove(str);
        }
    }
}
