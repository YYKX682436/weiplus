package com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map;
        ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Zi();
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_delivery_preload_so, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Delivery", "skip preload so");
            return;
        }
        map = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.f35471x58e176ab;
        for (java.lang.String str : map.keySet()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Delivery", "start preloadLibrary, libName: " + str);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.C13483x34ef8014.m55133x77d31cb5(str, false);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exp.Delivery", "preloadLibrary fail, e = " + th6.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exp.Delivery", "finish preloadLibrary");
    }
}
