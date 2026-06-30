package com.tencent.mm.feature.app.extension;

/* loaded from: classes14.dex */
public class n0 implements hm0.q {
    @Override // hm0.q
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView;
        if (com.tencent.mm.ui.bk.I() && com.tencent.mm.ui.bk.F()) {
            com.tencent.xweb.a3.v(com.tencent.mm.ui.bk.D(configuration));
            com.tencent.mm.ui.widget.MMWebView.H0(com.tencent.mm.ui.bk.D(configuration));
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                int i17 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("uimode_change", 0);
                int i18 = configuration.uiMode;
                if (i17 == 0) {
                    com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("uimode_change", i18);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "dancy test uimode change, mUimode:%s,mCurrentUimode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 && i17 != i18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "uiModeChange true !! reStart!!!");
                    com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("uimode_change", i18);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    r2 = com.tencent.mm.ui.bk.F() ? com.tencent.mm.ui.bk.I() ? 1 : 2 : 0;
                    jx3.f.INSTANCE.d(18893, 2, java.lang.Integer.valueOf(com.tencent.mm.ui.bk.D(configuration) ? 1 : 0), 2, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(com.tencent.mm.ui.bk.F() ? 1 : 0));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMUIModeManager", "dark mode change kvReport logID:%s , action: %s, isDark:%s, mode:%s", 18893, 2, java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.D(configuration)), java.lang.Integer.valueOf(r2));
                    r2 = 1;
                }
                if (r2 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginBigBallOfMud", "dancy test uiModeChange true, uimode:%s", java.lang.Integer.valueOf(configuration.uiMode));
                    com.tencent.mm.plugin.sns.ui.widget.h3.f();
                    l01.n nVar = (l01.n) l01.d0.f314761a.f314743e;
                    synchronized (nVar.f314781a) {
                        ((l01.m) nVar.f314781a).clear();
                    }
                    if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null) {
                        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a();
                        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n0();
                        if (gm0.j1.a()) {
                            com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = gq4.v.Ai().f176987a;
                            if (voipViewFragment != null && (baseSmallView = voipViewFragment.f176932d) != null) {
                                com.tencent.mm.plugin.voip.ui.h1 h1Var = (com.tencent.mm.plugin.voip.ui.h1) baseSmallView;
                                h1Var.f176958n.setBackground(com.tencent.mm.ui.uk.e(h1Var.getContext(), com.tencent.mm.R.drawable.b_6, h1Var.getResources().getColor(com.tencent.mm.R.color.f478491c)));
                            }
                            sj3.q3 q3Var = com.tencent.mm.plugin.multitalk.model.e3.Zi().f408475d;
                            if (q3Var != null) {
                                q3Var.n();
                            }
                        }
                    }
                    if (gm0.j1.i().f273208a.f273299d) {
                        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).getClass();
                        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                        kd2.p1.N.a().k0().getClass();
                    }
                }
                j65.m.c(configuration, com.tencent.mm.ui.bk.C());
                if (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources() != null) {
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getConfiguration().updateFrom(configuration);
                }
            }
        }
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        if (resources instanceof j65.j) {
            ((j65.j) resources).i(configuration);
        }
    }

    @Override // hm0.q
    public void onLowMemory() {
    }

    @Override // hm0.q
    public void onTerminate() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginBigBallOfMud", "onTerminate(%s)", bm5.f1.a());
        com.tencent.mm.ui.vb vbVar = aq1.l1.f13064f;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.ui.MMAppMgr$Receiver mMAppMgr$Receiver = vbVar.f211152c;
        if (mMAppMgr$Receiver != null) {
            context.unregisterReceiver(mMAppMgr$Receiver);
        }
    }

    @Override // hm0.q
    public void onTrimMemory(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LegacyAppStatus", "onTrimMemory, level = %d, process = %s", java.lang.Integer.valueOf(i17), bm5.f1.a());
        kt0.g b17 = kt0.g.b();
        b17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CacheInvoke", "CacheInvoke onTrimMemory");
        java.util.Iterator it = b17.f311915b.values().iterator();
        while (it.hasNext()) {
            kt0.e eVar = (kt0.e) ((kt0.f) it.next());
            eVar.getClass();
            lt0.a aVar = kt0.g.f311913d;
            lt0.a aVar2 = eVar.f311911c;
            boolean equals = aVar.equals(aVar2);
            lt0.c cVar = eVar.f311909a;
            if (equals) {
                ((lt0.i) cVar).f321173a.d(aVar2.f321163a / 2);
            } else {
                ((lt0.i) cVar).f321173a.clear();
            }
        }
    }
}
