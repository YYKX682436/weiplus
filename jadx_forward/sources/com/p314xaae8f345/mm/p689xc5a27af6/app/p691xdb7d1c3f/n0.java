package com.p314xaae8f345.mm.p689xc5a27af6.app.p691xdb7d1c3f;

/* loaded from: classes14.dex */
public class n0 implements hm0.q {
    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b abstractC18931xc27fcc5b;
        if (com.p314xaae8f345.mm.ui.bk.I() && com.p314xaae8f345.mm.ui.bk.F()) {
            com.p314xaae8f345.p3210x3857dc.a3.v(com.p314xaae8f345.mm.ui.bk.D(configuration));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.H0(com.p314xaae8f345.mm.ui.bk.D(configuration));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getInt("uimode_change", 0);
                int i18 = configuration.uiMode;
                if (i17 == 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("uimode_change", i18);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMUIModeManager", "dancy test uimode change, mUimode:%s,mCurrentUimode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 && i17 != i18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMUIModeManager", "uiModeChange true !! reStart!!!");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt("uimode_change", i18);
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    r2 = com.p314xaae8f345.mm.ui.bk.F() ? com.p314xaae8f345.mm.ui.bk.I() ? 1 : 2 : 0;
                    jx3.f.INSTANCE.d(18893, 2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.D(configuration) ? 1 : 0), 2, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.bk.F() ? 1 : 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMUIModeManager", "dark mode change kvReport logID:%s , action: %s, isDark:%s, mode:%s", 18893, 2, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.D(configuration)), java.lang.Integer.valueOf(r2));
                    r2 = 1;
                }
                if (r2 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginBigBallOfMud", "dancy test uiModeChange true, uimode:%s", java.lang.Integer.valueOf(configuration.uiMode));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h3.f();
                    l01.n nVar = (l01.n) l01.d0.f396294a.f396276e;
                    synchronized (nVar.f396314a) {
                        ((l01.m) nVar.f396314a).mo143584x5a5b64d();
                    }
                    if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
                        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a();
                        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n0();
                        if (gm0.j1.a()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.C18918x502f85f5 c18918x502f85f5 = gq4.v.Ai().f258520a;
                            if (c18918x502f85f5 != null && (abstractC18931xc27fcc5b = c18918x502f85f5.f258465d) != null) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.h1) abstractC18931xc27fcc5b;
                                h1Var.f258491n.setBackground(com.p314xaae8f345.mm.ui.uk.e(h1Var.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b_6, h1Var.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c)));
                            }
                            sj3.q3 q3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi().f490008d;
                            if (q3Var != null) {
                                q3Var.n();
                            }
                        }
                    }
                    if (gm0.j1.i().f354741a.f354832d) {
                        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).getClass();
                        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                        kd2.p1.N.a().k0().getClass();
                    }
                }
                j65.m.c(configuration, com.p314xaae8f345.mm.ui.bk.C());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources() != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().updateFrom(configuration);
                }
            }
        }
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        if (resources instanceof j65.j) {
            ((j65.j) resources).i(configuration);
        }
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", bm5.f1.a());
        com.p314xaae8f345.mm.ui.vb vbVar = aq1.l1.f94597f;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.ui.C21396xc5757e1c c21396xc5757e1c = vbVar.f292685c;
        if (c21396xc5757e1c != null) {
            context.unregisterReceiver(c21396xc5757e1c);
        }
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LegacyAppStatus", "onTrimMemory, level = %d, process = %s", java.lang.Integer.valueOf(i17), bm5.f1.a());
        kt0.g b17 = kt0.g.b();
        b17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CacheInvoke", "CacheInvoke onTrimMemory");
        java.util.Iterator it = b17.f393448b.values().iterator();
        while (it.hasNext()) {
            kt0.e eVar = (kt0.e) ((kt0.f) it.next());
            eVar.getClass();
            lt0.a aVar = kt0.g.f393446d;
            lt0.a aVar2 = eVar.f393444c;
            boolean m146309xb2c87fbf = aVar.m146309xb2c87fbf(aVar2);
            lt0.c cVar = eVar.f393442a;
            if (m146309xb2c87fbf) {
                ((lt0.i) cVar).f402706a.d(aVar2.f402696a / 2);
            } else {
                ((lt0.i) cVar).f402706a.mo143584x5a5b64d();
            }
        }
    }
}
