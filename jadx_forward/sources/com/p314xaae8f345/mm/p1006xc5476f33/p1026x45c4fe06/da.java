package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class da {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f159108a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f159109b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f159110c = new java.util.HashSet();

    public static void a() {
        java.util.HashSet hashSet;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class) {
            f159109b = true;
            f159108a = false;
            java.util.Set set = f159110c;
            hashSet = new java.util.HashSet(set);
            ((java.util.HashSet) set).clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadDone callbacks[%d]", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ca) it.next()).d();
        }
    }

    public static void b() {
        java.util.HashSet hashSet;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class) {
            f159109b = false;
            f159108a = false;
            java.util.Set set = f159110c;
            hashSet = new java.util.HashSet(set);
            ((java.util.HashSet) set).clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "notifyPreloadFailed callbacks[%d]", java.lang.Integer.valueOf(hashSet.size()));
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ca) it.next()).b();
        }
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ca caVar) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class) {
            boolean z17 = f159108a;
            boolean z18 = f159109b;
            boolean z19 = true;
            if (!z18) {
                if (caVar != null) {
                    ((java.util.HashSet) f159110c).add(caVar);
                }
                f159108a = true;
                f159109b = false;
            }
            if (z17) {
                return;
            }
            if (z18) {
                if (caVar != null) {
                    caVar.d();
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "start init");
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-2);
                if (com.p314xaae8f345.p3210x3857dc.a3.j()) {
                    a();
                    return;
                }
                com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XWeb.AppBrandXWebPreloader[preload]", "startPreload, for process:" + bm5.f1.a());
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                l81.a.f398535a = java.lang.System.currentTimeMillis();
                sh0.e eVar = (sh0.e) i95.n0.c(sh0.e.class);
                com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
                com.p314xaae8f345.p3210x3857dc.f1 f1Var2 = com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ba baVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ba(c19762x487075a);
                ((th0.a0) eVar).getClass();
                com.p314xaae8f345.mm.p2829xfa87f9de.y0.b(f1Var2, baVar);
                if (c19762x487075a.f38859x6ac9171) {
                    a();
                } else {
                    b();
                }
                l81.a.f398536b = java.lang.System.currentTimeMillis();
                if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de() != f1Var2 || !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.o() || !org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c)) {
                    z19 = false;
                }
                if (!z19 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    android.util.DisplayMetrics displayMetrics = j65.f.f379472c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWidgetAccessibility", "forceResetOpenScreenAdaptive");
                    j65.f.f379475f = false;
                }
            } finally {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(threadPriority);
            }
        }
    }
}
