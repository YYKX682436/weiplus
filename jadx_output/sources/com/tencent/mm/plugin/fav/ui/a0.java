package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public abstract class a0 {
    public static void a(o72.r2 r2Var) {
        r2Var.field_updateTime = java.lang.System.currentTimeMillis();
        if (!o72.x1.d(r2Var)) {
            r2Var.field_localId = java.lang.System.currentTimeMillis();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavAddService", "addItem localId: %s", java.lang.Long.valueOf(r2Var.field_localId));
        c(r2Var, 0);
        o72.x1.Q0(r2Var);
    }

    public static long b(o72.r2 r2Var, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent) {
        java.lang.String str = doFavoriteEvent.f54090g.f6315a.f370962d.f378040m;
        long j17 = -1;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            o72.r2 rc6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(str);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            if (rc6 != null) {
                r45.jq0 jq0Var = c4Var.f6315a.f370962d;
                r2Var.field_fromUser = jq0Var.f378036f;
                r2Var.field_toUser = jq0Var.f378038h;
                r2Var.field_sourceId = jq0Var.f378040m;
                r2Var.field_sourceCreateTime = jq0Var.f378044q;
                r2Var.field_sourceType = jq0Var.f378034d;
                j17 = rc6.field_localId;
            }
            c4Var.f6315a.f370962d.i(str);
        }
        return j17;
    }

    public static void c(o72.r2 r2Var, int i17) {
        java.lang.String f17 = o72.s2.f(r2Var.field_localId);
        long j17 = r2Var.field_localId;
        java.util.HashMap hashMap = (java.util.HashMap) o72.v2.f343502a;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        a82.j1.f2045a.h(r2Var, false, false, i17);
        if (r2Var.field_favProto.f370964f.size() > 0) {
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b17 = o72.w2.f343509a.b();
            o72.s2.g("MicroMsg.Fav.FavAddService", f17, "Start file copy task: localId=%d, dataCount=%d", java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(r2Var.field_favProto.f370964f.size()));
            s75.d.b(new com.tencent.mm.plugin.fav.ui.z(r2Var, b17, f17), "AddFavService_copy");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct b18 = o72.w2.f343509a.b();
        if (b18 != null) {
            b18.f56225j = 0;
        }
        o72.s2.g("MicroMsg.Fav.FavAddService", f17, "No data files, localId=%d", java.lang.Long.valueOf(r2Var.field_localId));
        int i18 = r2Var.field_itemStatus;
        r2Var.field_itemStatus = 9;
        o72.s2.m("MicroMsg.Fav.FavAddService", f17, r2Var.field_localId, i18, 9);
        if (!o72.x1.d(r2Var)) {
            boolean insert = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(r2Var);
            if (insert) {
                o72.s2.i("MicroMsg.Fav.FavAddService", f17, "INSERT", r2Var.field_localId, insert);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", f17, "ERR_DB_INSERT_FAILED", "dealWithData", r2Var.field_localId, 0, "db insert failed for no-data item", new java.lang.Object[0]);
            }
        } else if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().update(r2Var, new java.lang.String[0])) {
            o72.s2.i("MicroMsg.Fav.FavAddService", f17, "UPDATE", r2Var.field_localId, true);
        } else {
            o72.s2.j("MicroMsg.Fav.FavAddService", f17, "ERR_DB_UPDATE_FAILED", "dealWithData", r2Var.field_localId, 0, "db update failed for no-data item", new java.lang.Object[0]);
        }
        ((a82.h2) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x013a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x011e, code lost:
    
        if (r9 != (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0138, code lost:
    
        if (r9 != (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r7.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e9, code lost:
    
        if (r9 != (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013c, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(com.tencent.mm.autogen.events.DoFavoriteEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.a0.d(com.tencent.mm.autogen.events.DoFavoriteEvent, int):int");
    }
}
