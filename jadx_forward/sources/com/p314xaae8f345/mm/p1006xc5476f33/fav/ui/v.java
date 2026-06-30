package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class v extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public v() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        long j17;
        boolean z17;
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73) abstractC20979x809547d1;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        long j18 = 0;
        if (-2 == c4Var.f87850c) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(c4Var.f87853f, -1L);
            if (0 >= V) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavAddItemListener", "error fav info local id");
            } else {
                o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(V);
                if (F == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavAddItemListener", "error fav info null");
                } else {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(F.f67640x5ab01132.f452503o)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10873, 6);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10874, 6);
                    }
                    r45.bq0 bq0Var = F.f67640x5ab01132;
                    bq0Var.f452503o = c4Var.f87852e;
                    bq0Var.f452504p = true;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(F, "rowid");
                    java.lang.String str2 = c4Var.f87852e;
                    int i18 = F.f67643xc8a07680;
                    if (i18 <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavAddItemListener", "modRemark favid:%d", java.lang.Integer.valueOf(i18));
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.bo4 bo4Var = new r45.bo4();
                        bo4Var.f452451d = 4;
                        bo4Var.f452452e = 0;
                        linkedList.add(bo4Var);
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        r45.eo4 eo4Var = new r45.eo4();
                        eo4Var.f455155d = "favitem.remark";
                        eo4Var.f455157f = str2;
                        linkedList2.add(eo4Var);
                        r45.eo4 eo4Var2 = new r45.eo4();
                        eo4Var2.f455155d = "favitem.remark";
                        eo4Var2.f455156e = "time";
                        eo4Var2.f455157f = currentTimeMillis + "";
                        linkedList2.add(eo4Var2);
                        gm0.j1.d().g(new o72.l5(F, linkedList, linkedList2));
                    }
                }
            }
        } else {
            java.util.HashSet hashSet = o72.d2.f424852a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            o72.w2 w2Var = o72.w2.f425042a;
            w2Var.f(1, currentTimeMillis2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavApiUtil", "[startFavAddReportEnv] session = " + currentTimeMillis2);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b17 = w2Var.b();
            b17.f137752d = c4Var.f87850c;
            if (c4Var.f87848a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavAddService", "handleEvent error, event is null");
                if (c4Var.f87859l == 0) {
                    c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
                }
                i17 = c4Var.f87859l;
            } else {
                i17 = 0;
            }
            if (c4Var.f87856i == null && c4Var.f87857j == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "handleEvent context = null && frament = null");
            }
            int i19 = c4Var.f87859l;
            if (i19 > 0) {
                i17 = i19;
            } else {
                r45.bq0 bq0Var2 = c4Var.f87848a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
                if (bq0Var2 != null) {
                    java.util.Iterator it = bq0Var2.f452497f.iterator();
                    long j19 = 0;
                    while (it.hasNext()) {
                        r45.gp0 gp0Var = (r45.gp0) it.next();
                        long j27 = gp0Var.R;
                        if (j27 <= j18 && (str = gp0Var.V) != null && !str.isEmpty()) {
                            j27 = com.p314xaae8f345.mm.vfs.w6.k(gp0Var.V);
                        }
                        j19 += j27;
                        j18 = 0;
                    }
                    j17 = j19;
                } else {
                    j17 = 0;
                }
                if (java.lang.Long.valueOf(j17).longValue() > o72.x1.K()) {
                    i17 = -11;
                } else {
                    int i27 = c4Var.f87850c;
                    int[] iArr = o72.a.f424835a;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= 7) {
                            z17 = false;
                            break;
                        }
                        if (iArr[i28] == i27) {
                            z17 = true;
                            break;
                        }
                        i28++;
                    }
                    if (z17) {
                        i17 = c4Var.f87859l;
                        c4Var.f87862o = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x(c5303xc75d2f73, i17, c5303xc75d2f73);
                    }
                }
            }
            if (c4Var.f87861n && ((java.lang.Integer) gm0.j1.u().c().l(225281, 0)).intValue() != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "try show intro ui");
                o72.x1.L0(c4Var.f87856i, ".ui.FavTipsUI", new android.content.Intent(), null);
                gm0.j1.u().c().w(225281, 1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.e(c4Var.f87850c, i17, c4Var.f87860m, c4Var.f87856i, c4Var.f87857j, c4Var.f87858k, c4Var.f87863p, c4Var.f87862o, null, c4Var.f87864q, 0, c4Var.f87848a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "err Type = %d", java.lang.Integer.valueOf(i17));
            if (i17 == -9) {
                b17.f137753e = i17;
                i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.d(c5303xc75d2f73, i17);
            } else if (i17 == 0 || i17 == -11) {
                b17.f137753e = i17;
                i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.d(c5303xc75d2f73, i17);
            } else {
                b17.f137753e = i17;
                b17.k();
                o72.w2.f425042a.g(1);
            }
            c5303xc75d2f73.f135624h.f87966a = i17;
        }
        return false;
    }
}
