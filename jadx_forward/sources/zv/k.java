package zv;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f557541d;

    public k(boolean z17) {
        this.f557541d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = Di.p("notifymessage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: cluster parent ref is ");
        sb6.append(p17 != null ? p17.W0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", sb6.toString());
        int i17 = 0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p17 != null ? p17.W0() : null, "service_officialaccounts")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32325, "EcsBrandEntryErrReport", 0, "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Di.M("notifymessage");
        }
        if (this.f557541d) {
            zv.l lVar = zv.l.f557549a;
            if (lVar.d().getBoolean("key_mmkv_had_checked_place_top", false)) {
                return;
            }
            java.util.List<java.lang.String> c17 = lVar.c(zv.f.f557495d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: place top brand service list size:" + c17.size());
            if (!c17.isEmpty()) {
                for (java.lang.String str : c17) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 p18 = Di2.p(str);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p18 != null ? p18.W0() : null, "service_officialaccounts")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", "hy: releasing " + str + " outside");
                        i17++;
                        Di2.M(str);
                    } else {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hy: ");
                        sb7.append(str);
                        sb7.append(" is placed-top but parent is ");
                        sb7.append(p18 != null ? p18.W0() : null);
                        sb7.append(" so no need to remove parent");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceEntryStrategy", sb7.toString());
                    }
                }
                if (i17 > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(32325, "EcsBrandReleasePlaceTop", java.lang.Integer.valueOf(i17), "", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                }
            }
            zv.l.f557549a.d().putBoolean("key_mmkv_had_checked_place_top", true);
        }
    }
}
