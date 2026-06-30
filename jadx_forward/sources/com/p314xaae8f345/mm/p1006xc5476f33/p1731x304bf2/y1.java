package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

@j95.b
/* loaded from: classes8.dex */
public class y1 extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        com.p314xaae8f345.mm.p971x6de15a2e.s sVar;
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGame", "onAccountInitialized");
        j53.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.E;
        g53.i iVar2 = g53.i.f350445a;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            gm0.y n17 = gm0.j1.n();
            if (n17 == null || (r1Var = n17.f354821b) == null || (sVar = r1Var.f152297d) == null) {
                f0Var = null;
            } else {
                sVar.h1(g53.i.f350446b);
                f0Var = f0Var2;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        try {
            gm0.y n18 = gm0.j1.n();
            if (n18 != null) {
                n18.a(g53.i.f350447c);
            } else {
                f0Var2 = null;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
        } catch (java.lang.Throwable th7) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
        }
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221990d == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221990d = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.r(null);
            }
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221990d, intentFilter);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "registerNetChange err:%s", e17.getMessage());
        }
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221991e == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221991e = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.p(null);
            }
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter2.addAction("android.intent.action.BATTERY_LOW");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221991e, intentFilter2);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSilentDownloadListener", "registerBatteryChange err:%s", e18.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.s.f221993g.m43071x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.G.m43071x58998cd();
        qc0.x0 x0Var = (qc0.x0) i95.n0.c(qc0.x0.class);
        j53.i iVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.E;
        ((pc0.c) x0Var).getClass();
        lt3.e eVar = lt3.e.f402742a;
        android.util.SparseArray sparseArray = lt3.e.f402743b;
        java.util.Set set = (java.util.Set) sparseArray.get(5);
        if (set == null) {
            set = new java.util.LinkedHashSet();
            sparseArray.put(5, set);
        }
        set.add(iVar3);
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.a2(this), 500L);
        m43.c.b().a("game_resource_check", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.z1(this));
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.RunnableC16042x6bfee09(), 1000L);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginGame", "onAccountRelease");
        if (r53.f.f474187b == null) {
            return;
        }
        synchronized (r53.f.f474188c) {
            if (r53.f.f474187b != null) {
                ((java.util.concurrent.ConcurrentHashMap) lm5.i.f401142a).remove("SubCoreGameCenter#WorkThread".toUpperCase(java.util.Locale.ENGLISH));
                r53.f.f474187b.mo50299x35224f();
                r53.f.f474187b = null;
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        super.mo8845x3e5a77bb(context);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(939L, 1L, 1L);
        }
    }
}
