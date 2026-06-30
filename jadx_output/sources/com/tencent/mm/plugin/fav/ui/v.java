package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class v extends com.tencent.mm.sdk.event.n {
    public v() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17;
        long j17;
        boolean z17;
        java.lang.String str;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = (com.tencent.mm.autogen.events.DoFavoriteEvent) iEvent;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        long j18 = 0;
        if (-2 == c4Var.f6317c) {
            long V = com.tencent.mm.sdk.platformtools.t8.V(c4Var.f6320f, -1L);
            if (0 >= V) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavAddItemListener", "error fav info local id");
            } else {
                o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(V);
                if (F == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavAddItemListener", "error fav info null");
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(F.field_favProto.f370970o)) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10873, 6);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10874, 6);
                    }
                    r45.bq0 bq0Var = F.field_favProto;
                    bq0Var.f370970o = c4Var.f6319e;
                    bq0Var.f370971p = true;
                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(F, "rowid");
                    java.lang.String str2 = c4Var.f6319e;
                    int i18 = F.field_id;
                    if (i18 <= 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavAddItemListener", "modRemark favid:%d", java.lang.Integer.valueOf(i18));
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.bo4 bo4Var = new r45.bo4();
                        bo4Var.f370918d = 4;
                        bo4Var.f370919e = 0;
                        linkedList.add(bo4Var);
                        java.util.LinkedList linkedList2 = new java.util.LinkedList();
                        r45.eo4 eo4Var = new r45.eo4();
                        eo4Var.f373622d = "favitem.remark";
                        eo4Var.f373624f = str2;
                        linkedList2.add(eo4Var);
                        r45.eo4 eo4Var2 = new r45.eo4();
                        eo4Var2.f373622d = "favitem.remark";
                        eo4Var2.f373623e = "time";
                        eo4Var2.f373624f = currentTimeMillis + "";
                        linkedList2.add(eo4Var2);
                        gm0.j1.d().g(new o72.l5(F, linkedList, linkedList2));
                    }
                }
            }
        } else {
            java.util.HashSet hashSet = o72.d2.f343319a;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            o72.w2 w2Var = o72.w2.f343509a;
            w2Var.f(1, currentTimeMillis2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[startFavAddReportEnv] session = " + currentTimeMillis2);
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b17 = w2Var.b();
            b17.f56219d = c4Var.f6317c;
            if (c4Var.f6315a == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavAddService", "handleEvent error, event is null");
                if (c4Var.f6326l == 0) {
                    c4Var.f6326l = com.tencent.mm.R.string.cac;
                }
                i17 = c4Var.f6326l;
            } else {
                i17 = 0;
            }
            if (c4Var.f6323i == null && c4Var.f6324j == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "handleEvent context = null && frament = null");
            }
            int i19 = c4Var.f6326l;
            if (i19 > 0) {
                i17 = i19;
            } else {
                r45.bq0 bq0Var2 = c4Var.f6315a;
                com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
                if (bq0Var2 != null) {
                    java.util.Iterator it = bq0Var2.f370964f.iterator();
                    long j19 = 0;
                    while (it.hasNext()) {
                        r45.gp0 gp0Var = (r45.gp0) it.next();
                        long j27 = gp0Var.R;
                        if (j27 <= j18 && (str = gp0Var.V) != null && !str.isEmpty()) {
                            j27 = com.tencent.mm.vfs.w6.k(gp0Var.V);
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
                    int i27 = c4Var.f6317c;
                    int[] iArr = o72.a.f343302a;
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
                        i17 = c4Var.f6326l;
                        c4Var.f6329o = new com.tencent.mm.plugin.fav.ui.x(doFavoriteEvent, i17, doFavoriteEvent);
                    }
                }
            }
            if (c4Var.f6328n && ((java.lang.Integer) gm0.j1.u().c().l(225281, 0)).intValue() != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "try show intro ui");
                o72.x1.L0(c4Var.f6323i, ".ui.FavTipsUI", new android.content.Intent(), null);
                gm0.j1.u().c().w(225281, 1);
            }
            com.tencent.mm.plugin.fav.ui.u1.e(c4Var.f6317c, i17, c4Var.f6327m, c4Var.f6323i, c4Var.f6324j, c4Var.f6325k, c4Var.f6330p, c4Var.f6329o, null, c4Var.f6331q, 0, c4Var.f6315a);
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "err Type = %d", java.lang.Integer.valueOf(i17));
            if (i17 == -9) {
                b17.f56220e = i17;
                i17 = com.tencent.mm.plugin.fav.ui.a0.d(doFavoriteEvent, i17);
            } else if (i17 == 0 || i17 == -11) {
                b17.f56220e = i17;
                i17 = com.tencent.mm.plugin.fav.ui.a0.d(doFavoriteEvent, i17);
            } else {
                b17.f56220e = i17;
                b17.k();
                o72.w2.f343509a.g(1);
            }
            doFavoriteEvent.f54091h.f6433a = i17;
        }
        return false;
    }
}
