package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public enum f8 {
    ;

    public static void a(final boolean z17, final java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.f8$$a
            @Override // java.lang.Runnable
            public final void run() {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibVersionChecker", "cgiCheckUpdate, force true");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f8.d(false);
                }
                boolean a17 = gm0.j1.a();
                final java.lang.Runnable runnable2 = runnable;
                if (!a17 || gm0.m.r()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibVersionChecker", "check MMCore null, skip");
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, 0L);
                long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibVersionChecker", "check, nextSec = %d, nowSec = %d", l17, java.lang.Long.valueOf(i17));
                if (i17 < l17.longValue()) {
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                final r45.ec7 ec7Var = new r45.ec7();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.e(true);
                ec7Var.f454811d = e17 != null ? e17.f156910d : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
                lVar.f152197a = ec7Var;
                lVar.f152198b = new r45.fc7();
                lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/getpubliclibinfo";
                lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.e2.f34197x366c91de;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 0);
                pq5.g l18 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g8(lVar).l();
                l18.I(gm0.j1.b().f354778h);
                l18.i(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.f8$$b
                    @Override // gm5.a
                    /* renamed from: call */
                    public final java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
                        r45.ec7 ec7Var2 = ec7Var;
                        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
                        if (fVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibVersionChecker", "respWrap is null");
                            return -1;
                        }
                        int i18 = fVar.f152148a;
                        int i19 = fVar.f152149b;
                        java.lang.String str = fVar.f152150c;
                        r45.fc7 fc7Var = (r45.fc7) fVar.f152151d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.mo68477x336bdfd8(368L, 40L, 1L, false);
                        if (gm0.j1.a()) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + 86400));
                        }
                        java.lang.Runnable runnable3 = runnable2;
                        if (i18 != 0 || i19 != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                            g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 2);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                            return 0;
                        }
                        g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 1);
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi().wi(ec7Var2.f454811d, fc7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8.CGI, runnable3);
                        } catch (java.lang.RuntimeException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCommLibVersionChecker", "onResp, e %s", e18);
                        }
                        if (fc7Var != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o8.f157242a.d(fc7Var.f455750n, "CommLibVersionChecker");
                        }
                        return 0;
                    }
                }).B();
            }
        }, "WxaCommLibVersionChecker");
    }

    public static void d(boolean z17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 1));
        if (z17) {
            gm0.j1.u().c().i(true);
        }
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f8 m49297xdce0328(java.lang.String str) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(java.lang.Enum.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f8.class, str));
        return null;
    }
}
