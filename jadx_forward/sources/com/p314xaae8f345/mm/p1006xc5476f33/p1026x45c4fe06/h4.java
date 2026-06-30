package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f159795d;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var) {
        this.f159795d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (this.f159795d.f159985d) {
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f159795d;
        if (j3Var.f159983b.s2()) {
            j3Var.h("service countDown by remoteDebug", new java.lang.Object[0]);
            j3Var.f159994m = null;
            j3Var.k();
        } else {
            if (j3Var.f159983b.g2() == 1030 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0.d(j3Var.f159983b.f156336n, "Needmainjs");
                java.lang.String d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0.d(j3Var.f159983b.f156336n, "Needjs");
                if (!android.text.TextUtils.isEmpty(d17) || !android.text.TextUtils.isEmpty(d18)) {
                    pq5.g q17 = j3Var.i("preloadMonkeyTestAppService").q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m4(j3Var, d17, d18));
                    lm5.j jVar = lm5.d.f401134b;
                    km5.q qVar = (km5.q) q17.b(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l4(j3Var));
                    qVar.t(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k4(j3Var));
                    j3Var.f159994m = qVar;
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170240a) {
                pq5.g q18 = j3Var.i("preloadAppServiceWithDevToolsSupport").q(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.j3$$a
                    @Override // gm5.a
                    /* renamed from: call */
                    public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3.this.f159983b.q2() ? new fa1.t() : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0();
                    }
                });
                lm5.j jVar2 = lm5.d.f401134b;
                km5.q qVar2 = (km5.q) q18.b(jVar2, new km5.f() { // from class: com.tencent.mm.plugin.appbrand.j3$$b
                    @Override // km5.f
                    public final void a(java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3.this;
                        j3Var2.f159989h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) obj;
                        j3Var2.h("preloadAppServiceWithDevToolsSupport onTerminate", new java.lang.Object[0]);
                        j3Var2.k();
                    }
                });
                qVar2.t(jVar2, new km5.e() { // from class: com.tencent.mm.plugin.appbrand.j3$$c
                    @Override // km5.e
                    public final void a(java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3.this;
                        j3Var2.f159989h = null;
                        j3Var2.h("preloadAppServiceWithDevToolsSupport onInterrupt", new java.lang.Object[0]);
                        j3Var2.k();
                    }
                });
                j3Var.f159994m = qVar2;
            } else {
                pq5.g q19 = j3Var.i("preloadAppService").q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m3(j3Var));
                q19.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l3(j3Var));
                lm5.j jVar3 = lm5.d.f401134b;
                km5.q qVar3 = (km5.q) q19.b(jVar3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o4(j3Var));
                qVar3.t(jVar3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n4(j3Var));
                j3Var.f159994m = qVar3;
            }
        }
        if (j3Var.f159983b.q2()) {
            j3Var.h("tryPreloadPageView ignore for game, countdown", new java.lang.Object[0]);
            j3Var.f159995n = null;
            j3Var.j();
        } else {
            if (j3Var.f159983b.g2() == 1030 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) {
                java.lang.String d19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c0.d(j3Var.f159983b.f156336n, "Needwebviewjs");
                if (!android.text.TextUtils.isEmpty(d19)) {
                    j3Var.f159995n = j3Var.i("tryPreloadMonkeyTestAppPageView").q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o3(j3Var)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n3(j3Var, d19));
                }
            }
            if ("wxb1320569c2a2b6d2".equals(j3Var.f159983b.f156336n) && 1190 == j3Var.f159983b.g2() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.of.a()) {
                j3Var.h("skyline only, skip preload pageview", new java.lang.Object[0]);
                j3Var.f159995n = null;
                j3Var.j();
            } else {
                pq5.g q27 = j3Var.i("tryPreloadPageView").q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.q3(j3Var));
                q27.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p3(j3Var));
                j3Var.f159995n = q27;
            }
        }
        if (!j3Var.f159983b.u0().d()) {
            try {
                j3Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4.X_CONFIG);
            } catch (km5.o e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", e17, "tryPreloadBeforeResourceDone(PreloadReason.X_CONFIG)", new java.lang.Object[0]);
            }
        }
        synchronized (j3Var.f159993l) {
            j3Var.f159992k.set(true);
            linkedList = new java.util.LinkedList(j3Var.f159993l);
            j3Var.f159993l.clear();
        }
        while (!linkedList.isEmpty()) {
            ((java.lang.Runnable) linkedList.poll()).run();
        }
    }
}
