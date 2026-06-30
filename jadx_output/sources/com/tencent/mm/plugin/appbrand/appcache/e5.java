package com.tencent.mm.plugin.appbrand.appcache;

@j95.b
/* loaded from: classes7.dex */
public class e5 extends i95.w implements l81.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static final bm5.p1 f75506i = new com.tencent.mm.plugin.appbrand.appcache.f5();

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f75507m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_common_lib_update_serial, true);

    /* renamed from: d, reason: collision with root package name */
    public int f75508d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f75509e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f75510f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.y4 f75511g = new com.tencent.mm.plugin.appbrand.utils.y4(1, ((ku5.t0) ku5.t0.f312615d).p("AppBrandPkgDownloadService"));

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.appcache.m8 f75512h;

    public e5(com.tencent.mm.plugin.appbrand.appcache.f5 f5Var) {
    }

    public static com.tencent.mm.plugin.appbrand.appcache.e5 Bi() {
        return (com.tencent.mm.plugin.appbrand.appcache.e5) f75506i.b();
    }

    public void Ai(boolean z17, com.tencent.mm.plugin.appbrand.appcache.p5 p5Var) {
        final com.tencent.mm.plugin.appbrand.appcache.n9 n9Var;
        android.util.Pair a17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.a(z17, true);
        if (a17.second != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "checkLibUnbrokenOrDownload, releaseLib:%b, skipLocalDevPack:true, already cached, version:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) a17.second).pkgVersion()));
            if (p5Var != null) {
                p5Var.a(false, ((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) a17.second).pkgVersion());
                return;
            }
            return;
        }
        if (a17.first != com.tencent.mm.plugin.appbrand.appcache.l9.APP_BROKEN) {
            if (p5Var != null) {
                p5Var.a(false, 0);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord e17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.e(z17);
        if (e17 != null) {
            n9Var = com.tencent.mm.plugin.appbrand.appcache.r7.f(e17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgDownloadService", "allowControlLogicByKV fail. stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            n9Var = null;
        }
        if (n9Var == null || com.tencent.mm.sdk.platformtools.t8.K0(n9Var.field_downloadURL)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appcache.o5 o5Var = new com.tencent.mm.plugin.appbrand.appcache.o5(this, z17, z17 ? n9Var.field_version : 0, p5Var);
        if (!z17) {
            com.tencent.mm.plugin.appbrand.appcache.m8 m8Var = new com.tencent.mm.plugin.appbrand.appcache.m8("@LibraryAppId", 999, null, n9Var.field_downloadURL, new m81.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.e5$$b
                @Override // m81.a
                public final java.lang.String a() {
                    return "_" + com.tencent.mm.plugin.appbrand.appcache.n9.this.field_versionMd5;
                }
            });
            this.f75512h = m8Var;
            m8Var.f189720i = (int) java.util.concurrent.TimeUnit.SECONDS.toMillis(300L);
            com.tencent.mm.plugin.appbrand.appcache.ua.Ui(m8Var, o5Var);
            if (this.f75510f) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.appcache.e5$$c());
            return;
        }
        if (this.f75508d > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f75509e)) {
            boolean a18 = gm0.j1.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] lib can be patch, abtest open %b", java.lang.Boolean.valueOf(a18));
            if (a18) {
                if (com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.b("@LibraryAppId", 0, this.f75508d, null).first == com.tencent.mm.plugin.appbrand.appcache.l9.APP_READY) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "[incremental] start incremental lib download");
                    com.tencent.mm.plugin.appbrand.appcache.p8 p8Var = new com.tencent.mm.plugin.appbrand.appcache.p8("@LibraryAppId", this.f75508d, n9Var.field_version, this.f75509e, o5Var);
                    p8Var.f324691o = null;
                    com.tencent.mm.plugin.appbrand.appcache.ua.Ui(p8Var, o5Var);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgDownloadService", "[incremental] OldLibPkg[%d] or PatchUrl[%s] Invalid", java.lang.Integer.valueOf(this.f75508d), this.f75509e);
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.ua.Ri("@LibraryAppId", 0, n9Var.field_version, n9Var.field_downloadURL, null, o5Var);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.e5.Di(java.lang.String, java.lang.String, java.lang.String, long, long, int):void");
    }

    public final void Ni(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.p4 p4Var) {
        boolean z17 = f75507m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "submitAndCollectTimeout, taskTag=%s, sSerial=%b", str, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            p4Var.a(new com.tencent.mm.plugin.appbrand.appcache.k5(this));
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.appbrand.appcache.l5 l5Var = new com.tencent.mm.plugin.appbrand.appcache.l5(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f75511g.f(str, new com.tencent.mm.plugin.appbrand.appcache.m5(this, t0Var.w(l5Var, 600000L, null), p4Var));
        if (this.f75511g.f90394e.size() >= 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.PkgDownloadService", "queuePendingSize>=3");
            com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct appBrandLegacyBizStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct();
            appBrandLegacyBizStruct.p("queuePendingSize>=3");
            appBrandLegacyBizStruct.k();
        }
    }

    public void wi(int i17, r45.fc7 fc7Var, com.tencent.mm.plugin.appbrand.appcache.h8 h8Var, java.lang.Runnable runnable) {
        Ni("checkLibUnbrokenOrDownloadByCgiResp", new com.tencent.mm.plugin.appbrand.appcache.j5(this, i17, fc7Var, h8Var, runnable));
    }
}
