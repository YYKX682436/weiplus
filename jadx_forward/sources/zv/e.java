package zv;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f557469d;

    public e(boolean z17) {
        this.f557469d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        zv.l.f557551c = true;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (!this.f557469d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32325, "EcsBrandEntryActive", 2, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.util.List<java.lang.String> c17 = zv.l.f557549a.c(zv.g.f557504d);
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            for (java.lang.String str : c17) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di.p(str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17 != null ? p17.W0() : null, "service_officialaccounts")) {
                    Di.M(str);
                }
            }
            Di.k("service_officialaccounts");
            zv.l lVar = zv.l.f557549a;
            lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32325, "EcsBrandEntryActive", 3, "" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, expand finish, using " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", false);
            lVar.d().putBoolean("key_mmkv_had_checked_place_top", false);
            zv.l.f557551c = false;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(32325, "EcsBrandEntryActive", 0, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        zv.l lVar2 = zv.l.f557549a;
        h0Var.f391656d = lVar2.c(zv.d.f557460d);
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        h0Var.f391656d = zv.l.a(lVar2, (java.util.List) h0Var.f391656d);
        if (!r12.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.Collection) h0Var.f391656d);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (arrayList.size() > 3) {
                arrayList2.addAll(arrayList.subList(arrayList.size() - 3, arrayList.size()));
                arrayList.removeAll(kz5.n0.X0(arrayList2));
                z17 = false;
            } else {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, delayList:%d, batchList:%d", java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
            Di2.Q((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), "service_officialaccounts", z17, true);
            Di2.b(5, Di2, "");
            ku5.u0 u0Var = ku5.t0.f394148d;
            zv.c cVar = new zv.c(Di2, arrayList2, h0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(cVar, 5000L, null);
            ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).getClass();
            if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
                dw.f.f325603a.a();
            }
            g0Var.d(32325, "EcsBrandEntryActive", 1, "" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, collect finish, using " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: no brand service account in conversation! no need to display entry");
            lVar2.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", true);
        }
        zv.l.f557551c = false;
    }
}
