package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public abstract class u0 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0 f170732h;

    /* renamed from: i, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 f170733i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f170734m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170735g = true;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.h0(null);
        f170732h = h0Var;
        cf.b.a(h0Var);
        f170734m = 1;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 C() {
        return f170732h.a();
    }

    public static final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar, android.content.Intent intent) {
        u0Var.getClass();
        if (!c11809xbc286be4.f158829i2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2 g2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.g2.f156622d;
            g2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
            android.content.ComponentName component = intent.getComponent();
            g2Var.Bi(c11809xbc286be4, component != null ? component.getClassName() : null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w9.f171848b.mo50302x6b17ad39(null);
    }

    public static final void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var, android.content.Context context, android.content.Intent intent, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w params, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x strategy, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s appRecord) {
        u0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appRecord, "appRecord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageMiniProgramProcessManager", "onStartWxaApp--START-- strategy:" + strategy + ", app:" + appRecord);
        u0Var.v(new com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p(context, intent, strategy, appRecord));
    }

    public final int[] F() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33;
        java.util.List<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s> a17 = a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar : a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o oVar = sVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar : null;
            arrayList.add(java.lang.Integer.valueOf((oVar == null || (interfaceC11702x4ae7c33 = oVar.f170644o) == null) ? 0 : interfaceC11702x4ae7c33.i()));
        }
        return kz5.n0.R0(arrayList);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k G(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 serviceType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceType, "serviceType");
        if (L(serviceType)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "tryPreloadNextTaskProcess serviceType = [%s] reachedMaxLimit", serviceType);
            return null;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.a()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) l(k(), serviceType);
        }
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.n)) {
                arrayList.add(obj);
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) l(arrayList, serviceType);
    }

    public void H(java.lang.String appId, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 params, yz5.l ret) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAvailableTaskToPreRender appId:");
        sb6.append(appId);
        sb6.append(", mode:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = params.f170524d;
        sb6.append(c11809xbc286be4.W1);
        sb6.append(", instanceId:");
        sb6.append(c11809xbc286be4.f128810w);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
        if (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS == c11809xbc286be4.W1 || (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.y0)) {
            ret.mo146xb9724478(m(appId, params, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e));
            return;
        }
        java.util.List k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : k17) {
            if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj2) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.n)) {
                arrayList.add(obj2);
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxb1320569c2a2b6d2", appId) || 1190 != params.f170525e.f169323f) {
            ret.mo146xb9724478(n(arrayList, appId, params, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e));
            return;
        }
        java.util.Iterator it = k().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.n) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) obj;
        if (kVar == null) {
            kVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) n(arrayList, appId, params, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e);
        }
        ret.mo146xb9724478(kVar);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 I(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17 = c(str, -1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
            java.lang.String i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) f(c17)).i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65 c12597xe8378b65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12597xe8378b65) com.p314xaae8f345.mm.p794xb0fa9b5e.f.b(i17, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.i0.f170564a);
            if (c12597xe8378b65 == null) {
                return null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = c12597xe8378b65.f170519d;
            c11809xbc286be4.f128802b2 = c12597xe8378b65.f170520e;
            return c11809xbc286be4;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessesManager", "getInitConfigOfRunningApp findProcess get exception:" + e17);
            return null;
        }
    }

    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h J(java.lang.String appId, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w wVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 params = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1) wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        oe1.b2.a(appId);
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) m(appId, params, params.f129230b ? com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f : com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129159e);
    }

    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 params) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar;
        int i17;
        boolean z17;
        boolean z18;
        boolean z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = params.f170524d;
        boolean c17 = n91.t.c(c11809xbc286be4);
        java.lang.String str = params.f129229a;
        if (c17 && (oVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) c(str, params.f129231c)) != null && oVar.f170639j) {
            return false;
        }
        if (!c11809xbc286be4.L1.c()) {
            if (z65.c.a()) {
                z17 = true;
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            boolean z27 = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("appbrand_half_screen_debug_force_half_screen", false) : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenDebugger", "isForceHalfScreen[" + z27 + ']');
            if (z27) {
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().orientation == 2 ? com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x : com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l();
                lVar.f159054a = true;
                k91.s2 s2Var = k91.s2.f387293d;
                lVar.f159059f = s2Var;
                lVar.f159062i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), true, true, false, false, 24, null);
                lVar.f159060g = true;
                lVar.f159064k = k91.t2.f387300e;
                lVar.f159063j = false;
                lVar.f159055b = (int) (i18 * 0.7f);
                lVar.f159067n = true;
                lVar.f159065l = true;
                lVar.f159075v = false;
                lVar.f159076w = false;
                lVar.f159072s = true;
                lVar.f159074u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig(true, ya.a.f77453x4b357bf);
                if (z65.c.a()) {
                    z18 = true;
                } else {
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z18 = false;
                }
                boolean z28 = z18 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("appbrand_half_screen_debug_force_forbid_sliding_up_gesture", false) : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenDebugger", "isForbidSlidingUpGesture[" + z28 + ']');
                lVar.f159066m = z28;
                lVar.f159070q = true;
                lVar.f159061h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + ".ui.LauncherUI", s2Var);
                lVar.f159069p = k91.y2.f387360d;
                c11809xbc286be4.L1 = lVar.a();
                if (z65.c.a()) {
                    z19 = true;
                } else {
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z19 = false;
                }
                boolean z29 = z19 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("appbrand_half_screen_debug_force_finder_scene", false) : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenDebugger", "isForceFinderScene[" + z29 + ']');
                if (z29) {
                    params.f170525e.f169323f = 1177;
                }
            }
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s[] j17 = j(str, -1);
        int length = j17.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                sVar = null;
                break;
            }
            sVar = j17[i19];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) sVar).f170640k) {
                break;
            }
            i19++;
        }
        boolean z37 = c11809xbc286be4.L1.c() || (sVar != null);
        c11809xbc286be4.M1 = z37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11805x4202731e c11805x4202731e = c11809xbc286be4.A1;
        if (c11805x4202731e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class));
            u0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a;
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            c11805x4202731e.f158732d = !z65.c.a() ? false : u0Var.Ri().contains(str);
        }
        if (!c11809xbc286be4.f158825e2) {
            oe1.b2.a(c11809xbc286be4.f158811d);
            if (c11809xbc286be4.K1 != 1 && !z37 && !c11809xbc286be4.A2 && c11809xbc286be4.r() != k91.z3.TRANSPARENT && !c11809xbc286be4.h() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.b() && (((i17 = android.os.Build.VERSION.SDK_INT) < 31 || !kz5.z.G(new k91.y3[]{k91.y3.SLIDE, k91.y3.DISABLED}, c11809xbc286be4.o())) && (i17 < 31 || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.n(c11809xbc286be4) || f170734m != 1))) {
                return false;
            }
        }
        return true;
    }

    public final boolean L(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 serviceType) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceType, "serviceType");
        java.util.List k17 = k();
        if ((k17 instanceof java.util.Collection) && k17.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it = k17.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) it.next()).f129175c == serviceType) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        if (i17 > com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.v0.a(serviceType)) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                java.lang.String z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1("TaskManager count the serviceType [%s] in TASK_LIST, count = [%d], but max limit = [%d]", serviceType.name(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.v0.a(serviceType)));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "safeFormatString(...)");
                throw new java.lang.IllegalStateException(z17.toString());
            }
        }
        return i17 >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.v0.a(serviceType);
    }

    public jz5.l M(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w wVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 params = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1) wVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        if (params.f170524d.M1) {
            return new jz5.l(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x.f129233e, f(record));
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h f17 = f(record);
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x.f129233e;
        record.f129221e = true;
        return new jz5.l(xVar, f17);
    }

    public final void N(yz5.l messageFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageFactory, "messageFactory");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar : k()) {
            java.util.Iterator it = kVar.h().iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 abstractC3942x17b79479 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479) messageFactory.mo146xb9724478((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) it.next());
                if (abstractC3942x17b79479 != null) {
                    com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(kVar, abstractC3942x17b79479, null, 2, null);
                }
            }
        }
    }

    public final void O(java.lang.String appId, yz5.l messageFactory) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479 abstractC3942x17b79479;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(messageFactory, "messageFactory");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) kz5.z.O(j(appId, -1));
        if (sVar == null || (abstractC3942x17b79479 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479) messageFactory.mo146xb9724478(sVar)) == null) {
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(f(sVar), abstractC3942x17b79479, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x02e5, code lost:
    
        if (r11 != false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0241  */
    /* JADX WARN: Type inference failed for: r10v22, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 r25, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 r26) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.P(com.tencent.luggage.sdk.processes.LuggageServiceType, com.tencent.mm.plugin.appbrand.service.x6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
    
        if (kz5.z.G(r7, r5) != false) goto L34;
     */
    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h m(java.lang.String r5, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.w r6, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99 r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.m(java.lang.String, com.tencent.luggage.sdk.processes.w, com.tencent.luggage.sdk.processes.LuggageServiceType):com.tencent.luggage.sdk.processes.h");
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        this.f170735g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onAppBackground(" + str + ')');
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        this.f170735g = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onAppForeground(" + str + ')');
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r
    public void w(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "sendFinishMessage record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h.q(f(record), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e(record.f129217a, record.f129224h, false), null, 2, null);
    }
}
