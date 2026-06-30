package cy1;

@j95.b
/* loaded from: classes13.dex */
public class q extends i95.w implements cy1.p {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PluginDataReport", "PluginDataReport onAccountInitialized [%d]", java.lang.Integer.valueOf(hashCode()));
        oz1.e a17 = oz1.e.a();
        oz1.b bVar = a17.f431767b;
        x51.k0 k0Var = null;
        if (bVar != null) {
            bVar.f431751b = null;
            x51.k0 k0Var2 = bVar.f431750a;
            if (k0Var2 != null) {
                k0Var2.W(bVar.hashCode());
            }
            bVar.f431750a = null;
            a17.f431767b = null;
        }
        oz1.b bVar2 = new oz1.b();
        a17.f431767b = bVar2;
        bVar2.f431751b = null;
        x51.k0 k0Var3 = bVar2.f431750a;
        if (k0Var3 != null) {
            k0Var3.W(bVar2.hashCode());
        }
        bVar2.f431750a = null;
        try {
            k0Var = x51.l0.a(bVar2.hashCode(), gm0.j1.u().h() + "newuba.db", oz1.b.f431749d, true, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.NewUserBehaviourCacheWCDB", "[createDataBase] throw Exception : " + e17.getMessage());
        }
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Amoeba.NewUserBehaviourCacheWCDB", "[reset] dataDB is null");
        } else {
            bVar2.f431750a = k0Var;
            bVar2.f431751b = new oz1.c(bVar2, k0Var, "NewUserBehaviourCache", new java.lang.String[0]);
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_smc_max_log_item_size, 15) > 0) {
            a17.f431766a = (r1 * 1024) - 50;
        }
        oy1.p pVar = oy1.p.f431444a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (pVar.b() == 3) {
                oy1.h hVar = new oy1.h();
                oy1.p.f431447d = hVar;
                hVar.h(context);
                return;
            }
            if (pVar.b() == 2) {
                oy1.s sVar = new oy1.s();
                oy1.p.f431447d = sVar;
                sVar.h(context);
                return;
            }
            oy1.q0 q0Var = oy1.q0.f431452d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                q0Var.a(context);
                q0Var.b();
                qy1.c cVar = qy1.c.f449250a;
                if (qy1.c.f449251b != null) {
                    cVar.a();
                }
                qy1.c.f449252c.put(428459010, qy1.b.f449234a);
                cVar.c();
                ez1.g.f339373i.P(q0Var);
                oy1.m.f431418a.d();
                java.util.List V0 = kz5.n0.V0(((java.util.LinkedHashMap) oy1.q0.f431455g).keySet());
                if (oy1.m.f431422e == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(V0);
                    oy1.m.f431422e = arrayList;
                }
                java.lang.Integer num = oy1.m.f431419b;
                if ((num != null ? num.intValue() : 1) == 1) {
                    ((ku5.t0) ku5.t0.f394148d).l(oy1.o0.f431443d, 60000L, "MicroMsg.CgiReportService");
                }
            }
            if (pVar.a() != 0) {
                oy1.h hVar2 = new oy1.h();
                oy1.p.f431448e = hVar2;
                hVar2.h(context);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.PluginDataReport", "PluginDataReport onAccountRelease [%d]", java.lang.Integer.valueOf(hashCode()));
        oz1.e a17 = oz1.e.a();
        oz1.b bVar = a17.f431767b;
        if (bVar != null) {
            bVar.f431751b = null;
            x51.k0 k0Var = bVar.f431750a;
            if (k0Var != null) {
                k0Var.W(bVar.hashCode());
            }
            bVar.f431750a = null;
            a17.f431767b = null;
        }
        oy1.p pVar = oy1.p.f431444a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (pVar.b() == 2 || pVar.b() == 3) {
                oy1.l lVar = oy1.p.f431447d;
                if (lVar != null) {
                    lVar.f(context);
                    return;
                }
                return;
            }
            oy1.q0 q0Var = oy1.q0.f431452d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                oy1.u.f431461a.d();
                qy1.c.f449250a.a();
                ez1.g.f339373i.Y(q0Var);
                java.lang.Object systemService = context.getSystemService("connectivity");
                android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    try {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = oy1.q0.f431454f;
                        if (networkCallback != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
            oy1.l lVar2 = oy1.p.f431448e;
            if (lVar2 != null) {
                lVar2.f(context);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        gm0.j1.p().a();
        java.lang.String str = ((km0.c) gm0.j1.p().a()).f390520a;
    }
}
