package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public enum x2 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f76645d;

    static {
        java.util.concurrent.TimeUnit.DAYS.toSeconds(1L);
    }

    public static int h() {
        java.lang.Integer num = f76645d;
        return num != null ? num.intValue() : com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77223u;
    }

    public static void i(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.modelbase.o oVar, java.lang.Long l17) {
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandStarListLogic[collection]", "onResp, NULL CommReqResp");
            return;
        }
        if ((((r45.ct3) oVar.f70710a.f70684a).f371821e & 2) == 0) {
            return;
        }
        r45.dt3 dt3Var = (r45.dt3) oVar.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandStarListLogic[collection]", "onResp, errType %d, errCode %d, errMsg %s, ticket %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, l17);
        if (i18 == 0 && i19 == 0 && dt3Var != null) {
            if (com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class) != null) {
                ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).n0(r45.pc7.class, dt3Var.f372741e, l17);
                com.tencent.mm.plugin.appbrand.appusage.a3.a(i17, null, dt3Var.f372741e, null);
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, java.lang.Boolean.valueOf((dt3Var.f372743g & 1) > 0));
        }
    }

    public static void j(int i17) {
        java.util.LinkedList linkedList;
        f76645d = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.appbrand.appusage.w2 w2Var = (com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class);
        android.database.Cursor E = w2Var.f76618d.E("AppBrandStarApp", new java.lang.String[]{"rowid"}, null, null, null, null, java.lang.String.format(java.util.Locale.US, "%s desc limit %d offset %d", "orderSequence", java.lang.Long.valueOf(com.tencent.wcdb.core.Database.DictDefaultMatchValue), java.lang.Integer.valueOf(h())));
        if (E == null) {
            return;
        }
        if (E.moveToFirst()) {
            linkedList = new java.util.LinkedList();
            do {
                linkedList.add(java.lang.String.valueOf(E.getLong(0)));
            } while (E.moveToNext());
        } else {
            linkedList = null;
        }
        E.close();
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = w2Var.f76618d;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            strArr[0] = (java.lang.String) it.next();
            k0Var.delete("AppBrandStarApp", "rowid=?", strArr);
        }
        k0Var.w(java.lang.Long.valueOf(F));
        w2Var.doNotify("batch", 5, null);
    }

    public static com.tencent.mm.plugin.appbrand.appusage.x2 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appusage.x2.class, str));
        return null;
    }
}
