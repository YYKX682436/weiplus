package at4;

/* loaded from: classes9.dex */
public final class c2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final at4.c2 f13816d = new at4.c2();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f13817e = new java.util.HashMap();

    public final at4.z1 a(int i17, ss4.e0 e0Var, at4.a2 a2Var, boolean z17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        if (i17 == 8 || i17 == 12 || i17 == 26) {
            dt4.c Ni = ((pg0.a3) i95.n0.c(pg0.a3.class)).Ni();
            Ni.getClass();
            android.database.Cursor f17 = Ni.f243231d.f("select * from WalletBankcardScene where scene=" + i17, null, 2);
            if (f17 == null) {
                arrayList = null;
            } else {
                if (f17.moveToFirst()) {
                    arrayList = new java.util.ArrayList();
                    do {
                        com.tencent.mm.plugin.wallet_core.model.BankcardScene bankcardScene = new com.tencent.mm.plugin.wallet_core.model.BankcardScene();
                        bankcardScene.convertFrom(f17);
                        arrayList.add(bankcardScene);
                    } while (f17.moveToNext());
                } else {
                    arrayList = null;
                }
                f17.close();
            }
            if (arrayList == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.tencent.mm.plugin.wallet_core.utils.w0.a((com.tencent.mm.plugin.wallet_core.model.BankcardScene) it.next()));
                }
            }
            kotlin.jvm.internal.o.d(arrayList2);
        } else {
            arrayList2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        }
        java.util.ArrayList arrayList3 = arrayList2;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        pm0.v.b0(arrayList3, new at4.b2(h0Var, h0Var2));
        at4.v1 r17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().r();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) h0Var.f310123d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = (com.tencent.mm.plugin.wallet_core.model.Bankcard) h0Var2.f310123d;
        kotlin.jvm.internal.o.d(r17);
        return new at4.z1(arrayList3, bankcard, bankcard2, r17, e0Var, a2Var, z17);
    }

    public final void b(at4.y1 y1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "do bind query: " + y1Var.f14016a);
        ss4.e0 e0Var = new ss4.e0(null, y1Var.f14016a);
        f13817e.put(e0Var, y1Var);
        gm0.j1.d().a(385, this);
        gm0.j1.d().g(e0Var);
    }

    public final void c(ss4.e0 e0Var, at4.z1 z1Var) {
        yz5.l lVar;
        int i17 = e0Var.f412047r;
        java.util.HashMap hashMap = f13817e;
        java.util.Objects.toString(hashMap.get(e0Var));
        at4.y1 y1Var = (at4.y1) hashMap.get(e0Var);
        if (y1Var != null && (lVar = y1Var.f14019d) != null) {
            lVar.invoke(z1Var);
        }
        hashMap.remove(e0Var);
    }

    public final void d(at4.y1 request) {
        kotlin.jvm.internal.o.g(request, "request");
        java.util.HashMap hashMap = f13817e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (kotlin.jvm.internal.o.b(entry.getValue(), request)) {
                hashMap.remove(entry.getKey());
                com.tencent.mars.xlog.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "remove request " + request);
                break;
            }
        }
        if (hashMap.isEmpty()) {
            gm0.j1.d().q(385, this);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ss4.e0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayBindQueryDataFetcher", "on scene end: " + i17 + ", " + i18);
            if (i17 == 0 && i18 == 0) {
                ss4.e0 e0Var = (ss4.e0) m1Var;
                c(e0Var, a(e0Var.f412047r, e0Var, at4.a2.f13807e, true));
            } else {
                ss4.e0 e0Var2 = (ss4.e0) m1Var;
                c(e0Var2, a(e0Var2.f412047r, e0Var2, at4.a2.f13807e, false));
            }
        }
    }
}
