package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z f101610e;

    public y(com.tencent.mm.plugin.fav.ui.z zVar, boolean z17) {
        this.f101610e = zVar;
        this.f101609d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f101609d;
        com.tencent.mm.plugin.fav.ui.z zVar = this.f101610e;
        if (!z17) {
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct favAddQualityStruct = zVar.f101636e;
            if (favAddQualityStruct != null) {
                favAddQualityStruct.f56225j = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "no data, send item now, type %d", java.lang.Integer.valueOf(zVar.f101635d.field_type));
            o72.r2 r2Var = zVar.f101635d;
            int i17 = r2Var.field_itemStatus;
            r2Var.field_itemStatus = 9;
            o72.s2.m("MicroMsg.Fav.FavAddService", zVar.f101637f, r2Var.field_localId, i17, 9);
            o72.r2 r2Var2 = zVar.f101635d;
            r2Var2.field_xml = o72.r2.G0(r2Var2);
            if (o72.x1.d(zVar.f101635d)) {
                if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(zVar.f101635d, new java.lang.String[0])) {
                    o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f101637f, "UPDATE", zVar.f101635d.field_localId, true);
                } else {
                    o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f101637f, "ERR_DB_UPDATE_FAILED", "CopyRunnable", zVar.f101635d.field_localId, 0, "Database update failed before send", new java.lang.Object[0]);
                }
            } else if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(zVar.f101635d)) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f101637f, "INSERT", zVar.f101635d.field_localId, true);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f101637f, "ERR_DB_INSERT_FAILED", "CopyRunnable", zVar.f101635d.field_localId, 0, "Database insert failed before send", new java.lang.Object[0]);
            }
            o72.s2.g("MicroMsg.Fav.FavAddService", zVar.f101637f, "Start send service: localId=%d", java.lang.Long.valueOf(zVar.f101635d.field_localId));
            ((a82.h2) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct favAddQualityStruct2 = zVar.f101636e;
        if (favAddQualityStruct2 != null) {
            favAddQualityStruct2.f56225j = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "has data, check cdn now, type %d, localId:%s", java.lang.Integer.valueOf(zVar.f101635d.field_type), java.lang.Long.valueOf(zVar.f101635d.field_localId));
        o72.r2 r2Var3 = zVar.f101635d;
        int i18 = r2Var3.field_itemStatus;
        r2Var3.field_itemStatus = 1;
        o72.s2.m("MicroMsg.Fav.FavAddService", zVar.f101637f, r2Var3.field_localId, i18, 1);
        o72.r2 r2Var4 = zVar.f101635d;
        r2Var4.field_xml = o72.r2.G0(r2Var4);
        if (o72.x1.d(zVar.f101635d)) {
            boolean update = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(zVar.f101635d, new java.lang.String[0]);
            if (update) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f101637f, "UPDATE", zVar.f101635d.field_localId, update);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f101637f, "ERR_DB_UPDATE_FAILED", "CopyRunnable", zVar.f101635d.field_localId, 0, "db update failed after CDN check", new java.lang.Object[0]);
            }
        } else {
            boolean insert = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(zVar.f101635d);
            if (insert) {
                o72.s2.i("MicroMsg.Fav.FavAddService", zVar.f101637f, "INSERT", zVar.f101635d.field_localId, insert);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", zVar.f101637f, "ERR_DB_INSERT_FAILED", "CopyRunnable", zVar.f101635d.field_localId, 0, "db insert failed after CDN check", new java.lang.Object[0]);
            }
        }
        long j17 = zVar.f101635d.field_localId;
        java.util.HashSet hashSet = o72.d2.f343319a;
        long d17 = o72.w2.f343509a.d(1);
        o72.w2.f343514f.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(d17));
        com.tencent.mars.xlog.Log.i("MircoMsg.FavReportManager", "[registerLocalIdToSession] localId = " + j17 + ", session = " + d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavApiUtil", "[linkFavAddReport] session = " + d17 + ", localId = " + j17);
        o72.s2.g("MicroMsg.Fav.FavAddService", zVar.f101637f, "Start CDN check service: localId=%d", java.lang.Long.valueOf(zVar.f101635d.field_localId));
        ((a82.o0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
    }
}
