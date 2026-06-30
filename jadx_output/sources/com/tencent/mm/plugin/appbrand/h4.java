package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.j3 f78262d;

    public h4(com.tencent.mm.plugin.appbrand.j3 j3Var) {
        this.f78262d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        if (this.f78262d.f78452d) {
            return;
        }
        final com.tencent.mm.plugin.appbrand.j3 j3Var = this.f78262d;
        if (j3Var.f78450b.s2()) {
            j3Var.h("service countDown by remoteDebug", new java.lang.Object[0]);
            j3Var.f78461m = null;
            j3Var.k();
        } else {
            if (j3Var.f78450b.g2() == 1030 && com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
                java.lang.String d17 = com.tencent.mm.plugin.appbrand.debugger.c0.d(j3Var.f78450b.f74803n, "Needmainjs");
                java.lang.String d18 = com.tencent.mm.plugin.appbrand.debugger.c0.d(j3Var.f78450b.f74803n, "Needjs");
                if (!android.text.TextUtils.isEmpty(d17) || !android.text.TextUtils.isEmpty(d18)) {
                    pq5.g q17 = j3Var.i("preloadMonkeyTestAppService").q(new com.tencent.mm.plugin.appbrand.m4(j3Var, d17, d18));
                    lm5.j jVar = lm5.d.f319601b;
                    km5.q qVar = (km5.q) q17.b(jVar, new com.tencent.mm.plugin.appbrand.l4(j3Var));
                    qVar.t(jVar, new com.tencent.mm.plugin.appbrand.k4(j3Var));
                    j3Var.f78461m = qVar;
                }
            }
            if (com.tencent.mm.plugin.appbrand.service.k7.f88707a) {
                pq5.g q18 = j3Var.i("preloadAppServiceWithDevToolsSupport").q(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.j3$$a
                    @Override // gm5.a
                    public final java.lang.Object call(java.lang.Object obj) {
                        return com.tencent.mm.plugin.appbrand.j3.this.f78450b.q2() ? new fa1.t() : new com.tencent.mm.plugin.appbrand.service.c0();
                    }
                });
                lm5.j jVar2 = lm5.d.f319601b;
                km5.q qVar2 = (km5.q) q18.b(jVar2, new km5.f() { // from class: com.tencent.mm.plugin.appbrand.j3$$b
                    @Override // km5.f
                    public final void a(java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.j3 j3Var2 = com.tencent.mm.plugin.appbrand.j3.this;
                        j3Var2.f78456h = (com.tencent.mm.plugin.appbrand.service.c0) obj;
                        j3Var2.h("preloadAppServiceWithDevToolsSupport onTerminate", new java.lang.Object[0]);
                        j3Var2.k();
                    }
                });
                qVar2.t(jVar2, new km5.e() { // from class: com.tencent.mm.plugin.appbrand.j3$$c
                    @Override // km5.e
                    public final void a(java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.j3 j3Var2 = com.tencent.mm.plugin.appbrand.j3.this;
                        j3Var2.f78456h = null;
                        j3Var2.h("preloadAppServiceWithDevToolsSupport onInterrupt", new java.lang.Object[0]);
                        j3Var2.k();
                    }
                });
                j3Var.f78461m = qVar2;
            } else {
                pq5.g q19 = j3Var.i("preloadAppService").q(new com.tencent.mm.plugin.appbrand.m3(j3Var));
                q19.K(new com.tencent.mm.plugin.appbrand.l3(j3Var));
                lm5.j jVar3 = lm5.d.f319601b;
                km5.q qVar3 = (km5.q) q19.b(jVar3, new com.tencent.mm.plugin.appbrand.o4(j3Var));
                qVar3.t(jVar3, new com.tencent.mm.plugin.appbrand.n4(j3Var));
                j3Var.f78461m = qVar3;
            }
        }
        if (j3Var.f78450b.q2()) {
            j3Var.h("tryPreloadPageView ignore for game, countdown", new java.lang.Object[0]);
            j3Var.f78462n = null;
            j3Var.j();
        } else {
            if (j3Var.f78450b.g2() == 1030 && com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
                java.lang.String d19 = com.tencent.mm.plugin.appbrand.debugger.c0.d(j3Var.f78450b.f74803n, "Needwebviewjs");
                if (!android.text.TextUtils.isEmpty(d19)) {
                    j3Var.f78462n = j3Var.i("tryPreloadMonkeyTestAppPageView").q(new com.tencent.mm.plugin.appbrand.o3(j3Var)).h(new com.tencent.mm.plugin.appbrand.n3(j3Var, d19));
                }
            }
            if ("wxb1320569c2a2b6d2".equals(j3Var.f78450b.f74803n) && 1190 == j3Var.f78450b.g2() && com.tencent.mm.plugin.appbrand.of.a()) {
                j3Var.h("skyline only, skip preload pageview", new java.lang.Object[0]);
                j3Var.f78462n = null;
                j3Var.j();
            } else {
                pq5.g q27 = j3Var.i("tryPreloadPageView").q(new com.tencent.mm.plugin.appbrand.q3(j3Var));
                q27.K(new com.tencent.mm.plugin.appbrand.p3(j3Var));
                j3Var.f78462n = q27;
            }
        }
        if (!j3Var.f78450b.u0().d()) {
            try {
                j3Var.l(com.tencent.mm.plugin.appbrand.p4.X_CONFIG);
            } catch (km5.o e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", e17, "tryPreloadBeforeResourceDone(PreloadReason.X_CONFIG)", new java.lang.Object[0]);
            }
        }
        synchronized (j3Var.f78460l) {
            j3Var.f78459k.set(true);
            linkedList = new java.util.LinkedList(j3Var.f78460l);
            j3Var.f78460l.clear();
        }
        while (!linkedList.isEmpty()) {
            ((java.lang.Runnable) linkedList.poll()).run();
        }
    }
}
