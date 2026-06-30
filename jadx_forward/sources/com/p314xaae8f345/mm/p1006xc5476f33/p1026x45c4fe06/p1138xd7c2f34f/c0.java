package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f166064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f166065e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f166064d = c11809xbc286be4;
        this.f166065e = c12559xbdae8559;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f166064d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = this.f166065e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.o0();
        o0Var.f158398a = c11809xbc286be4.f158811d;
        o0Var.f158399b = c11809xbc286be4.f128811x;
        o0Var.f158405h = c11809xbc286be4.f158816i;
        o0Var.f158401d = c11809xbc286be4.L;
        o0Var.f158404g = c12559xbdae8559.f169323f;
        o0Var.f158400c = c11809xbc286be4.f128810w;
        if (c11809xbc286be4.f158831k2 != null) {
            o0Var.f158402e = c11809xbc286be4.f158831k2.f169669f;
            o0Var.f158403f = c11809xbc286be4.f158831k2.f169670g;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11825xb74ac8c6 c11825xb74ac8c6 = c11809xbc286be4.R;
        if (c11825xb74ac8c6 != null) {
            o0Var.f158406i = c11825xb74ac8c6.A ? 1 : 0;
        }
        o0Var.f158415r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = c11809xbc286be4.N;
        java.lang.String str = c11829x68027553 != null ? c11829x68027553.f158978e : "";
        boolean z17 = true;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.c(c11809xbc286be4)) {
            o0Var.f158408k = i81.j.a(c11809xbc286be4) ? 1 : 0;
            java.lang.String str2 = c11809xbc286be4.f158811d;
            java.lang.String str3 = c11809xbc286be4.f128811x;
            java.lang.String str4 = c11809xbc286be4.f158816i;
            int i17 = c12559xbdae8559.f169323f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0(c11809xbc286be4.f128810w);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, username is null");
                return;
            } else {
                nm5.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.d(str4);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(str2, str3, (java.lang.String) d17.a(0), (java.lang.String) d17.a(1), str, i17, null, o0Var, t0Var);
                return;
            }
        }
        java.lang.String str5 = c11809xbc286be4.f158811d;
        java.lang.String str6 = c11809xbc286be4.f128811x;
        java.lang.String str7 = c11809xbc286be4.f158816i;
        java.lang.String str8 = c11809xbc286be4.f128810w;
        int i18 = c12559xbdae8559.f169323f;
        int i19 = c11809xbc286be4.Q1;
        if (i19 <= 0) {
            i19 = c11809xbc286be4.f158825e2 ? d85.f0.P.f308710e : d85.f0.N.f308710e;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0 t0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.t0(str8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, appid:%s, username:%s, instanceId:%s, scene:%d, sysAuthBiz:%d", str5, str6, str8, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        nm5.b d18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.d(str7);
        java.lang.String str9 = (java.lang.String) d18.a(0);
        java.lang.String str10 = (java.lang.String) d18.a(1);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()) {
            z17 = false;
        }
        d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.ACCESS_FINE_LOCATION", i19);
        o0Var.f158409l = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (z17 && ij6 == d85.h0.GRANTED) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.e(str8, o0Var, java.lang.System.currentTimeMillis(), str5, str6, str9, str10, str, i18, t0Var2));
            return;
        }
        o0Var.f158408k = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, locationEnable:" + z17 + ", permissionResult:" + ij6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.h.e(str5, str6, str9, str10, str, i18, null, o0Var, t0Var2);
    }
}
