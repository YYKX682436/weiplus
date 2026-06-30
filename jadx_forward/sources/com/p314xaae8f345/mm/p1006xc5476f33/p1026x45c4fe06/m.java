package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class m implements hm0.q {
    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
        boolean isEmpty;
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165741a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBridge", "onTrimMemory level=%d", java.lang.Integer.valueOf(i17));
        boolean z17 = false;
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_recycle_runtime_on_low_memory_moderate, 1) == 1) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a.f234534f) {
                    z17 = true;
                }
            }
            if (z17) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b) {
                    java.util.Iterator it = new java.util.LinkedList(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165741a.values()).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) it.next();
                        if (!o6Var.V) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165741a.remove(o6Var.f156336n);
                            o6Var.k3(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h());
                        }
                    }
                }
                return;
            }
            return;
        }
        if (i17 == 60 || i17 == 80) {
            java.util.LinkedHashMap linkedHashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
            synchronized (linkedHashMap2) {
                isEmpty = linkedHashMap2.isEmpty();
            }
            if (isEmpty) {
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_recycle_backgroud_spare_appbrand_process, (671092576 > i18 || i18 >= 671092736) ? 0 : 1) == 1) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.a.f234534f) {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0.BACKGROUND_MODERATE_AND_SPARE);
                }
            }
        }
    }
}
