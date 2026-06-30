package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class m implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        boolean isEmpty;
        java.util.LinkedHashMap linkedHashMap = com.tencent.mm.plugin.appbrand.l.f84208a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBridge", "onTrimMemory level=%d", java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_recycle_runtime_on_low_memory_moderate, 1) == 1) {
                ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                if (com.tencent.mm.plugin.performance.watchdogs.a.f153001f) {
                    z17 = true;
                }
            }
            if (z17) {
                synchronized (com.tencent.mm.plugin.appbrand.l.f84209b) {
                    java.util.Iterator it = new java.util.LinkedList(com.tencent.mm.plugin.appbrand.l.f84208a.values()).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) it.next();
                        if (!o6Var.V) {
                            com.tencent.mm.plugin.appbrand.l.f84208a.remove(o6Var.f74803n);
                            o6Var.k3(new com.tencent.mm.plugin.appbrand.h());
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i17 == 60 || i17 == 80) {
            java.util.LinkedHashMap linkedHashMap2 = com.tencent.mm.plugin.appbrand.l.f84209b;
            synchronized (linkedHashMap2) {
                isEmpty = linkedHashMap2.isEmpty();
            }
            if (isEmpty) {
                int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_recycle_backgroud_spare_appbrand_process, (671092576 > i18 || i18 >= 671092736) ? 0 : 1) == 1) {
                    ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                    if (com.tencent.mm.plugin.performance.watchdogs.a.f153001f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.tencent.mm.plugin.appbrand.app.r0.c(com.tencent.mm.plugin.appbrand.app.v0.BACKGROUND_MODERATE_AND_SPARE);
                }
            }
        }
    }
}
