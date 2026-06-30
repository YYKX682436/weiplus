package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f183142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z f183143e;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z zVar, boolean z17) {
        this.f183143e = zVar;
        this.f183142d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f183142d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z zVar = this.f183143e;
        if (!z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae c6437x6cfac3ae = zVar.f183169e;
            if (c6437x6cfac3ae != null) {
                c6437x6cfac3ae.f137758j = 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "no data, send item now, type %d", java.lang.Integer.valueOf(zVar.f183168d.f67657x2262335f));
            o72.r2 r2Var = zVar.f183168d;
            int i17 = r2Var.f67644x3059914a;
            r2Var.f67644x3059914a = 9;
            o72.s2.m("MicroMsg.Fav.FavAddService", zVar.f183170f, r2Var.f67645x88be67a1, i17, 9);
            o72.r2 r2Var2 = zVar.f183168d;
            r2Var2.f67660x4b6e9352 = o72.r2.G0(r2Var2);
            if (o72.x1.d(zVar.f183168d)) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(zVar.f183168d, new java.lang.String[0])) {
                    o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f183170f, "UPDATE", zVar.f183168d.f67645x88be67a1, true);
                } else {
                    o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f183170f, "ERR_DB_UPDATE_FAILED", "CopyRunnable", zVar.f183168d.f67645x88be67a1, 0, "Database update failed before send", new java.lang.Object[0]);
                }
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo880xb970c2b9(zVar.f183168d)) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f183170f, "INSERT", zVar.f183168d.f67645x88be67a1, true);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f183170f, "ERR_DB_INSERT_FAILED", "CopyRunnable", zVar.f183168d.f67645x88be67a1, 0, "Database insert failed before send", new java.lang.Object[0]);
            }
            o72.s2.g("MicroMsg.Fav.FavAddService", zVar.f183170f, "Start send service: localId=%d", java.lang.Long.valueOf(zVar.f183168d.f67645x88be67a1));
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae c6437x6cfac3ae2 = zVar.f183169e;
        if (c6437x6cfac3ae2 != null) {
            c6437x6cfac3ae2.f137758j = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "has data, check cdn now, type %d, localId:%s", java.lang.Integer.valueOf(zVar.f183168d.f67657x2262335f), java.lang.Long.valueOf(zVar.f183168d.f67645x88be67a1));
        o72.r2 r2Var3 = zVar.f183168d;
        int i18 = r2Var3.f67644x3059914a;
        r2Var3.f67644x3059914a = 1;
        o72.s2.m("MicroMsg.Fav.FavAddService", zVar.f183170f, r2Var3.f67645x88be67a1, i18, 1);
        o72.r2 r2Var4 = zVar.f183168d;
        r2Var4.f67660x4b6e9352 = o72.r2.G0(r2Var4);
        if (o72.x1.d(zVar.f183168d)) {
            boolean mo9952xce0038c9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(zVar.f183168d, new java.lang.String[0]);
            if (mo9952xce0038c9) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f183170f, "UPDATE", zVar.f183168d.f67645x88be67a1, mo9952xce0038c9);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f183170f, "ERR_DB_UPDATE_FAILED", "CopyRunnable", zVar.f183168d.f67645x88be67a1, 0, "db update failed after CDN check", new java.lang.Object[0]);
            }
        } else {
            boolean mo880xb970c2b9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo880xb970c2b9(zVar.f183168d);
            if (mo880xb970c2b9) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f183170f, "INSERT", zVar.f183168d.f67645x88be67a1, mo880xb970c2b9);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f183170f, "ERR_DB_INSERT_FAILED", "CopyRunnable", zVar.f183168d.f67645x88be67a1, 0, "db insert failed after CDN check", new java.lang.Object[0]);
            }
        }
        long j17 = zVar.f183168d.f67645x88be67a1;
        java.util.HashSet hashSet = o72.d2.f424852a;
        long d17 = o72.w2.f425042a.d(1);
        o72.w2.f425047f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(d17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.FavReportManager", "[registerLocalIdToSession] localId = " + j17 + ", session = " + d17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[linkFavAddReport] session = " + d17 + ", localId = " + j17);
        o72.s2.g("MicroMsg.Fav.FavAddService", zVar.f183170f, "Start CDN check service: localId=%d", java.lang.Long.valueOf(zVar.f183168d.f67645x88be67a1));
        ((a82.o0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
    }
}
