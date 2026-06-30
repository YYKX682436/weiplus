package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public abstract class d4 {
    public static o72.r2 a(java.util.LinkedList linkedList, long j17) {
        o72.r2 r2Var;
        if (j17 != -1) {
            r2Var = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            if (r2Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavPostLogic", "ConvertNote2FavItem: insert db localId=%s", java.lang.Long.valueOf(j17));
                r2Var = e(j17, true);
            }
            r2Var.field_favProto.f370964f.clear();
        } else {
            r2Var = null;
        }
        if (r2Var != null) {
            r2Var.field_favProto.f370964f.size();
            o72.r2.G0(r2Var);
        }
        if (r2Var == null) {
            r2Var = new o72.r2();
            r2Var.field_type = 18;
            r2Var.field_sourceType = 6;
            f(r2Var);
            r2Var.field_favProto.s(1);
            r2Var.field_favProto.f(wo.w0.k());
            r2Var.field_favProto.c(127);
        }
        r2Var.field_edittime = com.tencent.mm.sdk.platformtools.t8.i1();
        r2Var.field_updateTime = java.lang.System.currentTimeMillis();
        r2Var.field_favProto.g(r2Var.field_edittime);
        r2Var.field_favProto.f370962d.c(java.lang.System.currentTimeMillis());
        r2Var.field_favProto.d(linkedList);
        r2Var.field_favProto.f370964f.size();
        o72.r2.G0(r2Var);
        return r2Var;
    }

    public static boolean b(java.util.List list) {
        if (list != null && list.size() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.io.InputStream inputStream = null;
                try {
                    inputStream = com.tencent.mm.vfs.w6.E(str);
                    if (inputStream != null && com.tencent.mm.sdk.platformtools.y1.f(str)) {
                        arrayList.add(str);
                    }
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    throw th6;
                }
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            }
            list = arrayList;
        }
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavPostLogic", "postImgs path null");
            return false;
        }
        o72.r2 r2Var = new o72.r2();
        r2Var.field_type = 2;
        r2Var.field_sourceType = 6;
        f(r2Var);
        for (java.lang.String str2 : list) {
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.A0(str2);
            java.lang.String obj = gp0Var.toString();
            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
            gp0Var.e0(o72.d2.d(obj, 2));
            com.tencent.mm.sdk.platformtools.x.x(str2, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, o72.x1.X(gp0Var), true);
            gp0Var.B0(o72.x1.X(gp0Var));
            gp0Var.h0(2);
            r2Var.field_favProto.f370964f.add(gp0Var);
        }
        com.tencent.mm.plugin.fav.ui.a0.a(r2Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10648, 2, java.lang.Integer.valueOf(list.size()));
        return true;
    }

    public static boolean c(java.lang.String str, java.util.LinkedList linkedList, long j17, java.lang.String str2) {
        r45.bq0 bq0Var;
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavPostLogic", "postNote null");
            return false;
        }
        o72.r2 a17 = -1 == j17 ? a(linkedList, j17) : ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (bq0Var = a17.field_favProto) != null) {
            bq0Var.p(str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavPostLogic", "postNote: add new, title=" + str2);
        java.lang.String f17 = o72.s2.f(j17);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        objArr[2] = java.lang.Boolean.valueOf(j17 == -1);
        o72.s2.g("MicroMsg.FavPostLogic", f17, "postNote: localId=%d, dataListSize=%d, isNew=%b", objArr);
        com.tencent.mm.plugin.fav.ui.a0.a(a17);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.autogen.events.FavoriteOperationEvent r20) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.d4.d(com.tencent.mm.autogen.events.FavoriteOperationEvent):void");
    }

    public static o72.r2 e(long j17, boolean z17) {
        o72.r2 r2Var = new o72.r2();
        r2Var.field_type = 18;
        r2Var.field_sourceType = 6;
        java.lang.String r17 = c01.z1.r();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.j(r17);
        jq0Var.g(r2Var.field_sourceType);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        r2Var.field_favProto.o(jq0Var);
        r2Var.field_fromUser = jq0Var.f378036f;
        r2Var.field_toUser = jq0Var.f378038h;
        r2Var.field_favProto.s(1);
        r2Var.field_favProto.f(wo.w0.k());
        r2Var.field_favProto.c(127);
        r2Var.field_edittime = com.tencent.mm.sdk.platformtools.t8.i1();
        r2Var.field_updateTime = java.lang.System.currentTimeMillis();
        r2Var.field_favProto.g(r2Var.field_edittime);
        r2Var.field_favProto.f370962d.c(java.lang.System.currentTimeMillis());
        r2Var.field_itemStatus = 9;
        r2Var.field_localId = j17;
        if (z17) {
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().insert(r2Var);
        }
        return r2Var;
    }

    public static void f(o72.r2 r2Var) {
        java.lang.String r17 = c01.z1.r();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.j(r17);
        jq0Var.g(r2Var.field_sourceType);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        r2Var.field_favProto.o(jq0Var);
        r2Var.field_fromUser = jq0Var.f378036f;
        r2Var.field_toUser = jq0Var.f378038h;
    }
}
