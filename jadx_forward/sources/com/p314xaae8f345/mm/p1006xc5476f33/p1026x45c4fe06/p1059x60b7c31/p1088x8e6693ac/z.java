package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac;

/* loaded from: classes7.dex */
public abstract class z {
    public static void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 i0Var, boolean z17, java.lang.String str5) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "fetchBusinessAppInfoFromService businessType:%s, cacheKey:%s", str, str5);
        r45.p54 p54Var = new r45.p54();
        p54Var.f464302h = i17;
        p54Var.f464298d = str;
        p54Var.f464300f = str3;
        p54Var.f464301g = str4;
        p54Var.f464299e = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1268;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/launchbizwxaapp";
        lVar.f152197a = p54Var;
        lVar.f152198b = new r45.q54();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.d0(i0Var, z17, str2, str5));
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        c(o6Var, str, str2, str3, i17, null);
    }

    public static void c(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, final java.lang.String str, java.lang.String str2, final java.lang.String str3, final int i17, final java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, refererAppId:%s, businessType:%s, errCode:%d", str, str3, java.lang.Integer.valueOf(i17));
        final java.lang.String str4 = o6Var == null ? null : o6Var.u0().f128809v;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "{}";
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11925x45e74649(str, str2, str3, i17), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d8.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.z$$a
            @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
            public final void a(java.lang.Object obj) {
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj;
                final boolean z18 = c10750x9556b48c != null && c10750x9556b48c.f149933d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, refererAppId:%s, businessType:%s, errCode:%d, ok:%b", str, str3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
                final java.lang.String str5 = str4;
                if (u46.l.e(str5)) {
                    return;
                }
                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = o6Var;
                java.util.Objects.requireNonNull(o6Var2);
                final java.lang.Runnable runnable2 = runnable;
                o6Var2.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.z$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str6 = str5;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var3 = o6Var2;
                        boolean z19 = z18;
                        java.lang.Runnable runnable3 = runnable2;
                        if (u46.l.c(str6, o6Var3.u0().f128809v)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(o6Var3.f156336n).f167253m = z19;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    }
                });
            }
        });
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h0 h0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.wd wdVar;
        if (o6Var == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167250j;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167249i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, appId:%s, businessType:%s, launchScene:%s, reason:%s", o6Var.f156336n, str, java.lang.Integer.valueOf(i17), h0Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (i17 == 2) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167251k) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to H5, businessType:%s", str);
            e(str, null, -3);
            return;
        }
        if (i17 == 4) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167253m) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to Application, businessType:%s", str);
            if (o6Var.u0().D == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o6Var.u0().D.f158856e)) {
                return;
            }
            b(o6Var, o6Var.u0().D.f158856e, null, str, -2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(o6Var.f156336n).f167253m = true;
            return;
        }
        if (i17 != 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167252l) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h0.DetachFromStack == h0Var) {
            try {
                o6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) o6Var.B0();
            } catch (java.lang.Error unused) {
                o6Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) o6Var.f156337o;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar = (o6Var2 == null || (wdVar = o6Var2.E1) == null) ? null : wdVar.f172493d;
            if (tdVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.c) tdVar;
                if (cVar.f162475d == o6Var && cVar.f162476e && cVar.f162478g != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, ignore for sticky, host:%s, this:%s", o6Var2.f156336n, o6Var.f156336n);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to MiniProgram, businessType:%s", str);
        f(o6Var, str, -3, null);
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackH5, businessType:%s, errCode:%d", str, java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.C12097x8bcc78fd(str, str2, i17).d();
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895 c5726xa4aac895 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895();
        am.mk mkVar = c5726xa4aac895.f136048g;
        mkVar.getClass();
        mkVar.f88885a = i17;
        mkVar.f88886b = str2;
        c5726xa4aac895.e();
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackMiniProgram, businessType:%s, errCode:%d", str, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5 c5727xe19dcaa5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5727xe19dcaa5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2;
        if (o6Var.g2() == 1038) {
            try {
                c11510xdd90c2f22 = c11510xdd90c2f2.B0();
            } catch (java.lang.Error unused) {
                c11510xdd90c2f22 = c11510xdd90c2f2.f156337o;
            }
            if (c11510xdd90c2f22 != null) {
                c5727xe19dcaa5.f136049g.f88965d = c11510xdd90c2f22.f156336n;
            }
        } else {
            c5727xe19dcaa5.f136049g.f88965d = o6Var.u0().D.f158856e;
        }
        am.nk nkVar = c5727xe19dcaa5.f136049g;
        nkVar.f88962a = i17;
        nkVar.f88963b = str;
        nkVar.f88964c = str2;
        c5727xe19dcaa5.e();
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        if (o6Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = o6Var.u0().D;
        if (c11812xa040dc98 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11812xa040dc98.f158863o)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, referrer businessType is null");
            return;
        }
        java.lang.String str = o6Var.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167250j = c11812xa040dc98.f158855d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167249i = c11812xa040dc98.f158863o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167251k = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167253m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(str).f167252l = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, app:%s, businessType:%s, launchScene:%s", str, c11812xa040dc98.f158863o, java.lang.Integer.valueOf(c11812xa040dc98.f158855d));
    }

    public static void h(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.i0 i0Var) {
        java.lang.String str5 = str + "_" + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo cacheKey:%s", str5);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str5), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.f0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.a0(i17, str, str2, str3, str4, i0Var, str5));
    }
}
