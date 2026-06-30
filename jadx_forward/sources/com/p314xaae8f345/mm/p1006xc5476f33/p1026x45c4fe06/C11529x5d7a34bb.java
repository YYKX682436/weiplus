package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC */
/* loaded from: classes7.dex */
public class C11529x5d7a34bb extends ze.l implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p2 {
    public static final android.util.SparseIntArray C;
    public static final java.lang.Class[] D;
    public int A;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 B;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.h.f167121a;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x8.f173912a;
        synchronized (set) {
            ((java.util.HashSet) set).add(hVar);
        }
        C = new android.util.SparseIntArray();
        D = new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.t.class};
    }

    public C11529x5d7a34bb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b1 b1Var) {
        super(b1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.class);
        this.A = 0;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (com.p314xaae8f345.mm.ui.bk.k(this.f169178d)) {
            android.app.Activity w17 = w();
            android.view.View decorView = w().getWindow().getDecorView();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0.f173301e;
            if (decorView != null && w17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0();
                android.view.View decorView2 = w17.getWindow().getDecorView();
                decorView.setBackground(n0Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.m0(n0Var, decorView2);
                if (decorView2 == decorView) {
                    com.p314xaae8f345.mm.ui.qk.c(w17, true).a(m0Var);
                } else {
                    decorView.setOnApplyWindowInsetsListener(m0Var);
                }
                n0Var.f173305d = w17.getWindow().getNavigationBarColor();
            }
        }
        if (i17 >= 26) {
            this.f156371q.setOnSystemUiVisibilityChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m5(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 I(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        return (ze.n) cf.i.a("AppBrandRuntimeProfile|createRuntime-" + c11808xe47dc718.f158811d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o5(this, c11808xe47dc718));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public boolean M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        ze.n nVar = (ze.n) c11510xdd90c2f2;
        ze.n nVar2 = (ze.n) mo48805xd384d23c();
        if (nVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar2).u0().L1;
            if (c11816x5915d2c1.c()) {
                if (c11816x5915d2c1.D == k91.x2.f387350e) {
                    return true;
                }
            }
        }
        return (nVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar).e3();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public void N(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = (ze.n) c11510xdd90c2f2;
        ze.n nVar = (ze.n) c11510xdd90c2f22;
        if (c11510xdd90c2f23 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(c11510xdd90c2f23.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.b(c11808xe47dc718)) {
            d0((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar);
        }
        k0(c11808xe47dc718);
        super.N(c11510xdd90c2f23, nVar, c11808xe47dc718);
        if (nVar.f156329e == this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.e((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c11808xe47dc718);
        }
        if (c11510xdd90c2f23 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).m(nVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p5(this, nVar), c11510xdd90c2f23, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public void O(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = (ze.n) c11510xdd90c2f2;
        ze.n nVar = (ze.n) c11510xdd90c2f22;
        if (c11510xdd90c2f23 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.g(c11510xdd90c2f23.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM);
        }
        if (c11510xdd90c2f23 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.n0.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f23, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c11808xe47dc718)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c11808xe47dc718;
            c11809xbc286be4.f158829i2 = true;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.b(c11808xe47dc718)) {
                d0(null);
            }
            k0(c11808xe47dc718);
            b0();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.b(c11808xe47dc718) && !ha1.m.a()) {
                java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165741a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandBridge", "clearRunningGames(exclude:%s)", nVar.f156336n);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedHashMap linkedHashMap2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.f165742b;
                synchronized (linkedHashMap2) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var : linkedHashMap2.values()) {
                        if (o6Var != null && o6Var.q2() && o6Var != nVar) {
                            linkedList.add(o6Var);
                        }
                    }
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) it.next()).K2();
                }
            }
            if (nVar.J0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "loadNew(), runtime[%s] initialized, should be persistent, use loadExisted() instead", nVar.f156336n);
                super.N(c11510xdd90c2f23, nVar, c11808xe47dc718);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(nVar);
                if (nVar.f156329e == this) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.e(c11809xbc286be4);
                }
            } else {
                super.O(c11510xdd90c2f23, nVar, c11808xe47dc718);
                if (nVar.f156329e == this) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.c(c11809xbc286be4);
                    if (c11510xdd90c2f23 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.a(1, c11809xbc286be4);
                    }
                }
            }
            i0();
            if (c11510xdd90c2f23 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).m(nVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n5(this, nVar), c11510xdd90c2f23, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public void Q() {
        super.Q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c();
        if (o6Var != null) {
            d0(o6Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public void R(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r5 r5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r5(this, runnable, c11510xdd90c2f2, c11510xdd90c2f22);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f22).J2.a(c11510xdd90c2f22, true, r5Var)) {
            r5Var.run();
        }
        if (c11510xdd90c2f22.N0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class);
            java.lang.String sessionId = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11510xdd90c2f22.u0()).f();
            java.lang.String appId = c11510xdd90c2f22.f156336n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) u5Var;
            u0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di = u0Var.Di();
            Di.getClass();
            java.lang.String a17 = Di.a(sessionId);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2.f173861a;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getString(a17 + '0', ""), appId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "onRuntimeClose wxAssistSessionId[%s], appId[%s], isFirstAppId[%b] isWxAssistantTraining[%b]", sessionId, appId, java.lang.Boolean.valueOf(b17), java.lang.Boolean.FALSE);
            java.lang.String str = null;
            if (b17) {
                java.lang.String appId2 = c11510xdd90c2f22.f156336n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId2, "appId");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n nVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a;
                nVar2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173773e.c(nVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173770b[0], java.lang.Boolean.TRUE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", "reOpenHeadless appId:".concat(appId2));
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                l81.b1 b1Var = new l81.b1();
                b1Var.f398565k = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208;
                b1Var.f398547b = appId2;
                b1Var.f398564j0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e(true, "", 0.0d, 0.0d, 12, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", "open weAppOpenBundle:" + b1Var);
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.f(context, b1Var, null), 3, null);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w2 Di2 = u0Var.Di();
            Di2.getClass();
            java.lang.String b18 = Di2.b(sessionId);
            java.lang.String a18 = Di2.a(sessionId);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getInt(b18, -1);
            if (i17 != -1) {
                java.lang.String str2 = a18 + i17;
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).getString(str2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).W(str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v2.a(v2Var).putInt(b18, i17 - 1);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: sessionId:" + sessionId + " not exist");
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, appId)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: appId not match realAppId:" + str + " appId:" + appId);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                    throw new java.lang.Exception("appId not match");
                }
            }
            u0Var.Ri().remove(appId);
            long g17 = u0Var.Ri().g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "removeTopAppId: sessionId:" + sessionId + " realAppId:" + str + " appId:" + appId + " count:" + g17);
            if (g17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173688f) {
                    ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.e.f173728d);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af
    public void U(java.lang.Exception exc) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = mo48805xd384d23c();
        if (mo48805xd384d23c == null || (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(mo48805xd384d23c)) == null) {
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) mo48805xd384d23c.u0()).f128811x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) mo48805xd384d23c.u0()).f128802b2;
        int i17 = ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) mo48805xd384d23c.u0()).L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c).S2(false);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7032x7add985d c7032x7add985d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7032x7add985d();
        c7032x7add985d.f143476d = c7032x7add985d.b("InstanceId", a17.f169667d, true);
        c7032x7add985d.f143477e = c7032x7add985d.b("Appid", mo48805xd384d23c.f156336n, true);
        c7032x7add985d.f143478f = c7032x7add985d.b("Username", str, true);
        c7032x7add985d.f143479g = a17.f169670g;
        c7032x7add985d.f143480h = c12559xbdae8559.f169323f;
        c7032x7add985d.f143481i = c7032x7add985d.b("SceneNote", u46.l.s(c12559xbdae8559.f169324g, 1024), true);
        c7032x7add985d.f143482j = i17;
        c7032x7add985d.f143483k = c7032x7add985d.b("PublibVersionStr", S2 == null ? "" : S2.W0(), true);
        c7032x7add985d.f143484l = c7032x7add985d.b("NetworkType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q2.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c7032x7add985d.f143485m = c7032x7add985d.b("ErrorStack", fp.s0.a(android.util.Log.getStackTraceString(exc)), true);
        c7032x7add985d.f143486n = java.lang.System.currentTimeMillis();
        c7032x7add985d.k();
    }

    @Override // ze.l
    public boolean a0() {
        boolean z17;
        if (mo48806x666b03f3() > 0) {
            return false;
        }
        android.app.Activity w17 = w();
        if (w17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) w17).F7() && w17.isTaskRoot()) {
                int taskId = w17.getTaskId();
                int hashCode = w17.hashCode();
                int i17 = 0;
                while (true) {
                    android.util.SparseIntArray sparseIntArray = C;
                    if (i17 >= sparseIntArray.size()) {
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i17);
                    if (sparseIntArray.valueAt(i17) == taskId && keyAt != hashCode) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
            }
        }
        z17 = false;
        if (z17) {
            try {
                b0();
            } finally {
                if (z17) {
                    i0();
                }
            }
        }
        c0(false);
        return true;
    }

    public void b0() {
        int i17 = this.A;
        int i18 = i17 + 1;
        this.A = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "addSkipCloseActivityOnceFlagRef for activity:%d, %d -> %d", java.lang.Integer.valueOf(w() != null ? w().hashCode() : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public void c0(final boolean z17) {
        if (this.A > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "closeActivity(%b), mSkipCloseActivityOnceFlag:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.A));
            if (mo48806x666b03f3() > 0 || !(w() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d)) {
                return;
            }
            db5.f.c(w(), null);
            return;
        }
        final ze.n nVar = (ze.n) mo48805xd384d23c();
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb c11529x5d7a34bb = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.this;
                android.app.Activity w17 = c11529x5d7a34bb.w();
                if (w17 != null && !w17.isFinishing()) {
                    boolean F7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b8) c11529x5d7a34bb.f156374t).f171112a.F7();
                    int mo48806x666b03f3 = c11529x5d7a34bb.mo48806x666b03f3();
                    com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = mo48806x666b03f3 > 0 ? ((ze.n) c11529x5d7a34bb.mo48805xd384d23c()).u0() : null;
                    if (F7 && z17) {
                        w17.moveTaskToBack(true);
                    } else {
                        w17.finish();
                    }
                    if (mo48806x666b03f3 <= 0) {
                        w17.overridePendingTransition(0, 0);
                    } else {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).j(w17, u07);
                    }
                }
                if ((c11529x5d7a34bb.w() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) && c11529x5d7a34bb.w().isFinishing()) {
                    ze.n nVar2 = nVar;
                    if (nVar2 != null) {
                        try {
                            if (!nVar2.x0().m52169xfdaa7672().R) {
                                return;
                            }
                        } catch (java.lang.NullPointerException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandRuntimeContainerWC", e17, "closeActivity", new java.lang.Object[0]);
                            return;
                        }
                    }
                    c11529x5d7a34bb.w().overridePendingTransition(0, 0);
                }
            }
        };
        android.app.Activity w17 = w();
        boolean z18 = false;
        if (nVar != null && nVar.u0().q() == k91.y3.DISABLED) {
            if (w17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) w();
                java.util.Objects.requireNonNull(activityC12666xc288131a);
                z18 = !activityC12666xc288131a.u7();
            } else if (w17 != null) {
                z18 = true;
            }
        }
        if (!z18) {
            runnable.run();
        } else {
            java.util.Objects.requireNonNull(w17);
            db5.f.c(w17, new db5.d() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC$$b
                @Override // db5.d
                /* renamed from: onComplete */
                public final void mo2162x815f5438(boolean z19) {
                    android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.C;
                    runnable.run();
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af, xi1.h, xi1.i
    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super.d(i17, c11510xdd90c2f2);
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2).u0().L1.c()) {
            if (w() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) {
                db5.f.b(w());
            }
        } else {
            try {
                if (i(c11510xdd90c2f2) == null) {
                    db5.f.c(w(), null);
                }
            } catch (java.lang.IllegalAccessError unused) {
            }
        }
    }

    public void d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        if (w() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12650x33e7e92d) {
            if (o6Var == null ? ((java.lang.Boolean) ha1.r.f361318c.e()).booleanValue() : o6Var.q2() && (o6Var.f167700d3 || ((java.lang.Boolean) ha1.r.f361318c.e()).booleanValue())) {
                db5.f.b(w());
            }
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 e0() {
        if (this.B == null) {
            android.content.Context w17 = w();
            if (w17 == null) {
                w17 = this.f169178d;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c2(w17, this);
            this.B = c2Var;
            c2Var.setBackgroundColor(this.f169178d.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        return this.B;
    }

    public void g0(android.view.WindowManager.LayoutParams layoutParams) {
        if (w() == null || w().getWindow() == null) {
            return;
        }
        android.view.View decorView = w().getWindow().getDecorView();
        if ((decorView.getWindowSystemUiVisibility() & 2) == 0) {
            android.graphics.drawable.Drawable background = decorView.getBackground();
            if (background instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.n0) background;
                int navigationBarColor = w().getWindow().getNavigationBarColor();
                boolean z17 = navigationBarColor != n0Var.f173305d;
                n0Var.f173305d = navigationBarColor;
                if (z17) {
                    n0Var.invalidateSelf();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public android.content.Context h() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(w());
    }

    public void h0(android.content.res.Configuration configuration) {
        n0(configuration);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s5(this, configuration));
        java.util.LinkedList linkedList = this.f156372r;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next()).a1(configuration);
            }
        }
    }

    public void i0() {
        int i17 = this.A;
        int i18 = i17 - 1;
        this.A = i18;
        if (i18 < 0) {
            this.A = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeContainerWC", "removeSkipCloseActivityOnceFlagRef for activity:%d, %d -> %d", java.lang.Integer.valueOf(w() != null ? w().hashCode() : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A));
    }

    public final void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (c11808xe47dc718 == null) {
            return;
        }
        boolean z17 = (c11808xe47dc718 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) && ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11808xe47dc718).k();
        android.widget.FrameLayout frameLayout = this.f156371q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 y17 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3.y(frameLayout) : ie.d.N(frameLayout);
        if (y17 != null && (y17.getParent() instanceof android.view.ViewGroup)) {
            y17.z();
            ((android.view.ViewGroup) y17.getParent()).removeView(y17);
        }
        if (z17) {
            return;
        }
        try {
            android.app.Activity w17 = w();
            java.util.Objects.requireNonNull(w17);
            w17.getWindow().setSoftInputMode(16);
            android.app.Activity w18 = w();
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.f172995u;
            ql1.a m53479xdaa76933 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1) w18.findViewById(com.p314xaae8f345.mm.R.id.a0o)).m53479xdaa76933();
            if (m53479xdaa76933 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) m53479xdaa76933).i(1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeContainerWC", "removeUnmatchedSoftInputPanel, fix SoftInputMode for MiniProgram, get exception:%s", e17);
        }
    }

    public void l0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t0 t0Var;
        long longValue;
        java.util.Iterator it = new java.util.LinkedList(this.f156372r).iterator();
        while (it.hasNext()) {
            ze.n nVar = (ze.n) it.next();
            if ((nVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && (t0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) nVar).M2) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6309x3b39feb c6309x3b39feb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6309x3b39feb();
                java.lang.Long l17 = t0Var.f169642a;
                c6309x3b39feb.f136661e = l17 != null ? l17.longValue() : -1L;
                c6309x3b39feb.f136660d = c6309x3b39feb.b("appId", t0Var.f169643b, true);
                c6309x3b39feb.f136664h = c6309x3b39feb.b("flags", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d.f169692a.a(), true);
                c6309x3b39feb.f136663g = 2L;
                c6309x3b39feb.f136665i = c6309x3b39feb.b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, t0Var.f169644c, true);
                if (t0Var.f169645d == null) {
                    longValue = 0;
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.Long l18 = t0Var.f169645d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l18);
                    longValue = currentTimeMillis - l18.longValue();
                }
                c6309x3b39feb.f136662f = longValue;
                c6309x3b39feb.n();
                bm5.f1.a();
                c6309x3b39feb.k();
            }
        }
    }

    public final void n0(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        configuration.uiMode &= -49;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            configuration.uiMode |= 32;
        } else {
            configuration.uiMode |= 16;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().updateConfiguration(configuration, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        android.graphics.Bitmap Y1;
        if (!(c11510xdd90c2f2 instanceof ze.n) || (Y1 = ((ze.n) c11510xdd90c2f2).Y1()) == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f169178d);
        android.view.ViewGroup.LayoutParams layoutParams = c11510xdd90c2f2.f156343s.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f2.f156343s;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(qVar.getWidth(), qVar.getHeight(), layoutParams != null ? ((android.widget.FrameLayout.LayoutParams) qVar.getLayoutParams()).gravity : 81);
        frameLayout.setBackground(new android.graphics.drawable.BitmapDrawable(this.f169178d.getResources(), Y1));
        frameLayout.setWillNotDraw(false);
        android.widget.FrameLayout frameLayout2 = this.f156371q;
        frameLayout2.addView(frameLayout, layoutParams2);
        frameLayout2.bringChildToFront(frameLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: NullPointerException | OutOfMemoryError -> 0x00e4, NullPointerException -> 0x00e6, TRY_LEAVE, TryCatch #2 {NullPointerException | OutOfMemoryError -> 0x00e4, blocks: (B:30:0x00b1, B:32:0x00bd, B:34:0x00c9, B:40:0x00e0), top: B:29:0x00b1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u5 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11529x5d7a34bb.o0(com.tencent.mm.plugin.appbrand.u5, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0, xi1.g
    /* renamed from: setWindowDescription */
    public void mo48810x4820daa(xi1.d dVar) {
        android.app.Activity w17 = w();
        if (w17 != null && (w17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) w17).F7()) {
            super.mo48810x4820daa(dVar);
        }
    }

    /* renamed from: toString */
    public java.lang.String m48811x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandRuntimeContainerWC@%d(%s)", java.lang.Integer.valueOf(hashCode()), w());
    }
}
