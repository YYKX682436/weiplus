package com.tencent.mm.plugin.expansions;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map;
        ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_delivery_preload_so, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exp.Delivery", "skip preload so");
            return;
        }
        map = com.tencent.mm.plugin.expansions.Delivery.baseSoDepsMap;
        for (java.lang.String str : map.keySet()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exp.Delivery", "start preloadLibrary, libName: " + str);
            try {
                com.tencent.mm.plugin.expansions.Delivery.loadLibraryImpl(str, false);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exp.Delivery", "preloadLibrary fail, e = " + th6.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.Delivery", "finish preloadLibrary");
    }
}
