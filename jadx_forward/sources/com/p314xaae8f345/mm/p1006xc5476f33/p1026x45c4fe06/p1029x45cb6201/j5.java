package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class j5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc7 f157141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8 f157142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f157143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 f157144e;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 e5Var, int i17, r45.fc7 fc7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8 h8Var, java.lang.Runnable runnable) {
        this.f157144e = e5Var;
        this.f157140a = i17;
        this.f157141b = fc7Var;
        this.f157142c = h8Var;
        this.f157143d = runnable;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4
    public void a(yz5.a aVar) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 e5Var = this.f157144e;
        int i17 = this.f157140a;
        r45.fc7 fc7Var = this.f157141b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8 h8Var = this.f157142c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i5 i5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i5(this, aVar);
        e5Var.getClass();
        int ordinal = h8Var.ordinal();
        if (ordinal == 0) {
            if (fc7Var.f455748i > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 3);
            }
            if (fc7Var.f455747h > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 4);
            }
        } else if (ordinal == 2) {
            if (fc7Var.f455748i > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 22);
            }
            if (fc7Var.f455747h > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 23);
            }
        }
        if (fc7Var.f455748i != 1) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_common_lib_need_update_check, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "scene %s, need_update=%d, checkSwitch=%b", h8Var.name(), java.lang.Integer.valueOf(fc7Var.f455748i), java.lang.Boolean.valueOf(fj6));
            if (!fj6) {
                i5Var.run();
                return;
            }
            android.util.Pair a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.a(true, true);
            java.lang.Object obj2 = a17.first;
            if (obj2 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_READY && a17.second != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "skip update. checkRet=%d, version=%d", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9) obj2).ordinal()), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) a17.second).mo49191x1c82a56c()));
                i5Var.run();
                return;
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgDownloadService", "onResp, null storage");
            i5Var.run();
            return;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f157481a.b(fc7Var, c19767x257d7f);
        boolean z17 = c19767x257d7f.f38864x6ac9171 > 0;
        android.util.Pair a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.a(true, true);
        java.lang.Object obj3 = a18.first;
        boolean z18 = obj3 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_BROKEN;
        boolean z19 = obj3 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_LOCAL_EXIST;
        if (z17) {
            int ordinal2 = h8Var.ordinal();
            if (ordinal2 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 5);
                g0Var.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, z18 ? 7 : 6);
            } else if (ordinal2 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, 24);
                g0Var2.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.o.f33909x366c91de, z18 ? 26 : 25);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7 y7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "onResp, requestUsingLibVersion %d, scene %s, needDownload = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s, localMaxVersion = %d", java.lang.Integer.valueOf(i17), h8Var.name(), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(fc7Var.f455745f), java.lang.Integer.valueOf(fc7Var.f455747h), fc7Var.f455744e, fc7Var.f455743d, java.lang.Integer.valueOf(y7Var.f(true)));
        if (z18) {
            if (i17 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fc7Var.f455749m)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi();
                Bi.f157041d = -1;
                Bi.f157042e = null;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 Bi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi();
                java.lang.String str = fc7Var.f455749m;
                Bi2.f157041d = i17;
                Bi2.f157042e = str;
            }
            e5Var.Ai(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n5(e5Var, i5Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d6 d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d6();
            d6Var.f66667x4b6e619a = "@LibraryAppId";
            d6Var.f66670x8987ca93 = fc7Var.f455745f;
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6.class)).get(d6Var, "key", "version")) {
                d6Var.f66669xa783a79b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                d6Var.f66668x29cbf907 = h8Var.ordinal() + 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e6.class)).mo880xb970c2b9(d6Var);
            }
        } else if (z19 && (obj = a18.second) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "find lib in public pkg storage, version: %d", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) obj).f33456x1c82a56c));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8 k8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k8();
            java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) a18.second).f33455xe121c411;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x4 x4Var = k8Var.f157161a;
            x4Var.f157581a = str2;
            x4Var.f157582b = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) a18.second;
            y7Var.q(c11667xc7e59dd6.f156932d, c11667xc7e59dd6.f33456x1c82a56c, k8Var);
        }
        if (fc7Var.f455747h > 0 && c19767x257d7f.f38864x6ac9171 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v7.a();
        } else if (!z18 && z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.v7.a();
        }
        if (z18) {
            return;
        }
        i5Var.run();
    }
}
