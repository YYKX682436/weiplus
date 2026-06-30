package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class o0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.p0 f178627d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.p0 p0Var) {
        this.f178627d = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.m48017xd0f4c159(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.p0 p0Var = this.f178627d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "yyb_pkg_sig_prefs", 4)).getString(p0Var.f178639d.f68429xa1e9e82c, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded sig[%s]", string);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(322L, 26L, 1L, false);
                h02.a aVar = p0Var.f178639d;
                g0Var.d(11098, 4026, java.lang.String.format("%s,%s", aVar.f68429xa1e9e82c, aVar.f68419xf1e9b966));
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                try {
                    java.lang.String j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.j(p0Var.f178639d.f68419xf1e9b966);
                    if (!p0Var.f178641f.getPackageName().equalsIgnoreCase(j17) || j62.e.g().a("clicfg_appcompat_pkg_sig", "0", false, true).equals("1")) {
                        uk.f.d(new java.io.File(com.p314xaae8f345.mm.vfs.w6.i(p0Var.f178639d.f68419xf1e9b966, true)), string);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "Skip writing apkSig for v2 signing, pkg = " + j17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode done");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var2.mo68477x336bdfd8(322L, 25L, 1L, false);
                    h02.a aVar2 = p0Var.f178639d;
                    g0Var2.d(11098, 4025, java.lang.String.format("%s,%s,%s", aVar2.f68429xa1e9e82c, aVar2.f68419xf1e9b966, string));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded writeSecurityCode e: " + e17.getMessage());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var3.mo68477x336bdfd8(322L, 27L, 1L, false);
                    h02.a aVar3 = p0Var.f178639d;
                    g0Var3.d(11098, 4027, java.lang.String.format("%s,%s,%s", aVar3.f68429xa1e9e82c, aVar3.f68419xf1e9b966, e17.getMessage()));
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FileDownloadManager", "summertoken onMD5CheckSucceeded get pkg sig error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var4.mo68477x336bdfd8(322L, 28L, 1L, false);
            h02.a aVar4 = p0Var.f178639d;
            g0Var4.d(11098, 4028, java.lang.String.format("%s,%s,%d,%d", aVar4.f68429xa1e9e82c, aVar4.f68419xf1e9b966, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f178639d.f68404x28d45f97) && com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.t(p0Var.f178639d.f68404x28d45f97)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadManager", "onSceneEnd, fail, appId: %s", p0Var.f178639d.f68404x28d45f97);
                g0Var4.mo68477x336bdfd8(710L, 24L, 1L, false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 r0Var = p0Var.f178643h;
        h02.a aVar5 = p0Var.f178639d;
        boolean z17 = p0Var.f178642g;
        r0Var.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.q0(r0Var, aVar5, z17));
    }
}
