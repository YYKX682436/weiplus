package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public abstract class a0 {
    public static void a(o72.r2 r2Var) {
        r2Var.f67659xa783a79b = java.lang.System.currentTimeMillis();
        if (!o72.x1.d(r2Var)) {
            r2Var.f67645x88be67a1 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavAddService", "addItem localId: %s", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
        c(r2Var, 0);
        o72.x1.Q0(r2Var);
    }

    public static long b(o72.r2 r2Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73) {
        java.lang.String str = c5303xc75d2f73.f135623g.f87848a.f452495d.f459573m;
        long j17 = -1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            o72.r2 rc6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(str);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            if (rc6 != null) {
                r45.jq0 jq0Var = c4Var.f87848a.f452495d;
                r2Var.f67642xd3939c3a = jq0Var.f459569f;
                r2Var.f67655x1209e7cb = jq0Var.f459571h;
                r2Var.f67650x85d9e03b = jq0Var.f459573m;
                r2Var.f67649xde813d09 = jq0Var.f459577q;
                r2Var.f67651x76e81a5a = jq0Var.f459567d;
                j17 = rc6.f67645x88be67a1;
            }
            c4Var.f87848a.f452495d.i(str);
        }
        return j17;
    }

    public static void c(o72.r2 r2Var, int i17) {
        java.lang.String f17 = o72.s2.f(r2Var.f67645x88be67a1);
        long j17 = r2Var.f67645x88be67a1;
        java.util.HashMap hashMap = (java.util.HashMap) o72.v2.f425035a;
        if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        a82.j1.f83578a.h(r2Var, false, false, i17);
        if (r2Var.f67640x5ab01132.f452497f.size() > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b17 = o72.w2.f425042a.b();
            o72.s2.g("MicroMsg.Fav.FavAddService", f17, "Start file copy task: localId=%d, dataCount=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67640x5ab01132.f452497f.size()));
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z(r2Var, b17, f17), "AddFavService_copy");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6437x6cfac3ae b18 = o72.w2.f425042a.b();
        if (b18 != null) {
            b18.f137758j = 0;
        }
        o72.s2.g("MicroMsg.Fav.FavAddService", f17, "No data files, localId=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
        int i18 = r2Var.f67644x3059914a;
        r2Var.f67644x3059914a = 9;
        o72.s2.m("MicroMsg.Fav.FavAddService", f17, r2Var.f67645x88be67a1, i18, 9);
        if (!o72.x1.d(r2Var)) {
            boolean mo880xb970c2b9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo880xb970c2b9(r2Var);
            if (mo880xb970c2b9) {
                o72.s2.i("MicroMsg.Fav.FavAddService", f17, "INSERT", r2Var.f67645x88be67a1, mo880xb970c2b9);
            } else {
                o72.s2.j("MicroMsg.Fav.FavAddService", f17, "ERR_DB_INSERT_FAILED", "dealWithData", r2Var.f67645x88be67a1, 0, "db insert failed for no-data item", new java.lang.Object[0]);
            }
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, new java.lang.String[0])) {
            o72.s2.i("MicroMsg.Fav.FavAddService", f17, "UPDATE", r2Var.f67645x88be67a1, true);
        } else {
            o72.s2.j("MicroMsg.Fav.FavAddService", f17, "ERR_DB_UPDATE_FAILED", "dealWithData", r2Var.f67645x88be67a1, 0, "db update failed for no-data item", new java.lang.Object[0]);
        }
        ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
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
    
        if (r7.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/") != false) goto L30;
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
    public static int d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 r23, int r24) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.d(com.tencent.mm.autogen.events.DoFavoriteEvent, int):int");
    }
}
