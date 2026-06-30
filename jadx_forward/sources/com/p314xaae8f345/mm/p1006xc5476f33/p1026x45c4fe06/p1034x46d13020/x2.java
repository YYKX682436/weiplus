package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public enum x2 {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Integer f158178d;

    static {
        java.util.concurrent.TimeUnit.DAYS.toSeconds(1L);
    }

    public static int h() {
        java.lang.Integer num = f158178d;
        return num != null ? num.intValue() : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158756u;
    }

    public static void i(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, java.lang.Long l17) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandStarListLogic[collection]", "onResp, NULL CommReqResp");
            return;
        }
        if ((((r45.ct3) oVar.f152243a.f152217a).f453354e & 2) == 0) {
            return;
        }
        r45.dt3 dt3Var = (r45.dt3) oVar.f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandStarListLogic[collection]", "onResp, errType %d, errCode %d, errMsg %s, ticket %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, l17);
        if (i18 == 0 && i19 == 0 && dt3Var != null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class)).n0(r45.pc7.class, dt3Var.f454274e, l17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.a3.a(i17, null, dt3Var.f454274e, null);
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_USAGE_RECORD_HAS_FAVORITE_BOOLEAN, java.lang.Boolean.valueOf((dt3Var.f454276g & 1) > 0));
        }
    }

    public static void j(int i17) {
        java.util.LinkedList linkedList;
        f158178d = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2 w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w2.class);
        android.database.Cursor E = w2Var.f158151d.E("AppBrandStarApp", new java.lang.String[]{"rowid"}, null, null, null, null, java.lang.String.format(java.util.Locale.US, "%s desc limit %d offset %d", "orderSequence", java.lang.Long.valueOf(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697), java.lang.Integer.valueOf(h())));
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[1];
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = w2Var.f158151d;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            strArr[0] = (java.lang.String) it.next();
            k0Var.mo70514xb06685ab("AppBrandStarApp", "rowid=?", strArr);
        }
        k0Var.w(java.lang.Long.valueOf(F));
        w2Var.mo142179xf35bbb4("batch", 5, null);
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2 m49846xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x2.class, str));
        return null;
    }
}
