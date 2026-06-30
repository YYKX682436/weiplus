package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@j95.b
/* loaded from: classes7.dex */
public final class c0 extends i95.w implements ft.j {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843 Ai() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11710x63f82843 c11710x63f82843 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158012m;
        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158004e)) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            str = b17 != null ? b17.f451299q : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158004e = str;
        } else {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158004e;
        }
        c11710x63f82843.f157876f = str;
        c11710x63f82843.f157875e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.d();
        c11710x63f82843.f157874d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.e();
        r45.ab7 ab7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f469174d;
        c11710x63f82843.f157877g = ab7Var.f451439e;
        c11710x63f82843.f157878h = ab7Var.f451438d;
        return c11710x63f82843;
    }

    public int Bi() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158001b;
        if (i17 == 0) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            i17 = b17 != null ? b17.f451291f : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158001b = i17;
        }
        return i17;
    }

    public void wi(int i17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetchCommonUsedAppFromServer scene:%d", java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "don't support fetch CommonUsedWeApp");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, 0L)).longValue();
        }
        long j17 = 1200;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_COMMON_USE_NEXT_REQ_INTERVAL_LONG, 1200L)).longValue();
        }
        long j18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158764y1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "getDefaultNextRequestInterval wxaCommUseSetting:%s", str2);
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                j17 = new cl0.g(str2).mo15081xb57957cf("UpdateRegularlyReqFreqSeconds", 1200L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o = java.lang.Math.max(j18, j17);
        int mo78086x7444f759 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).mo78086x7444f759();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158013n >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "checkNeedUpdate, needUpdate:%b, count:%d， nextRequestInterval:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(mo78086x7444f759), java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158014o));
        if (z18 && mo78086x7444f759 > 0) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "don't need to do fetch CommonUsedWeApp");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158006g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "is fetching data from server");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158006g = true;
        if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d)) {
            r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
            java.lang.String str3 = b17 != null ? b17.f451294i : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d = str3;
            str = str3;
        } else {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d;
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.i0(i17, str).l();
    }
}
