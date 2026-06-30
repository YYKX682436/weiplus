package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@j95.b
/* loaded from: classes7.dex */
public class e5 extends i95.w implements l81.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final bm5.p1 f157039i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f5();

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f157040m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_common_lib_update_serial, true);

    /* renamed from: d, reason: collision with root package name */
    public int f157041d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f157042e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f157043f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4 f157044g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.y4(1, ((ku5.t0) ku5.t0.f394148d).p("AppBrandPkgDownloadService"));

    /* renamed from: h, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m8 f157045h;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f5 f5Var) {
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5 Bi() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5) f157039i.b();
    }

    public void Ai(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p5 p5Var) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var;
        android.util.Pair a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.a(z17, true);
        if (a17.second != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "checkLibUnbrokenOrDownload, releaseLib:%b, skipLocalDevPack:true, already cached, version:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) a17.second).mo49191x1c82a56c()));
            if (p5Var != null) {
                p5Var.a(false, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6) a17.second).mo49191x1c82a56c());
                return;
            }
            return;
        }
        if (a17.first != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_BROKEN) {
            if (p5Var != null) {
                p5Var.a(false, 0);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.e(z17);
        if (e17 != null) {
            n9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f(e17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgDownloadService", "allowControlLogicByKV fail. stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            n9Var = null;
        }
        if (n9Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n9Var.f67181x238eac02)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o5 o5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.o5(this, z17, z17 ? n9Var.f67185x8987ca93 : 0, p5Var);
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m8 m8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m8("@LibraryAppId", 999, null, n9Var.f67181x238eac02, new m81.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.e5$$b
                @Override // m81.a
                public final java.lang.String a() {
                    return "_" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9.this.f67186x912ff5eb;
                }
            });
            this.f157045h = m8Var;
            m8Var.f271253i = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(300L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ui(m8Var, o5Var);
            if (this.f157043f) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.RunnableC11673x5a7e973());
            return;
        }
        if (this.f157041d > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f157042e)) {
            boolean a18 = gm0.j1.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] lib can be patch, abtest open %b", java.lang.Boolean.valueOf(a18));
            if (a18) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.EnumC11664x177167f4.b("@LibraryAppId", 0, this.f157041d, null).first == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l9.APP_READY) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] start incremental lib download");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8 p8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p8("@LibraryAppId", this.f157041d, n9Var.f67185x8987ca93, this.f157042e, o5Var);
                    p8Var.f406224o = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ui(p8Var, o5Var);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PkgDownloadService", "[incremental] OldLibPkg[%d] or PatchUrl[%s] Invalid", java.lang.Integer.valueOf(this.f157041d), this.f157042e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ua.Ri("@LibraryAppId", 0, n9Var.f67185x8987ca93, n9Var.f67181x238eac02, null, o5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, long r27, int r29) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Di(java.lang.String, java.lang.String, java.lang.String, long, long, int):void");
    }

    public final void Ni(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 p4Var) {
        boolean z17 = f157040m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PkgDownloadService", "submitAndCollectTimeout, taskTag=%s, sSerial=%b", str, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            p4Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.k5(this));
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l5 l5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l5(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f157044g.f(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m5(this, t0Var.w(l5Var, 600000L, null), p4Var));
        if (this.f157044g.f171927e.size() >= 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.PkgDownloadService", "queuePendingSize>=3");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219 c6313x17a23219 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219();
            c6313x17a23219.p("queuePendingSize>=3");
            c6313x17a23219.k();
        }
    }

    public void wi(int i17, r45.fc7 fc7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8 h8Var, java.lang.Runnable runnable) {
        Ni("checkLibUnbrokenOrDownloadByCgiResp", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.j5(this, i17, fc7Var, h8Var, runnable));
    }
}
