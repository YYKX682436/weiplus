package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class j5 implements com.tencent.mm.plugin.appbrand.utils.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc7 f75608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.h8 f75609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f75610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.e5 f75611e;

    public j5(com.tencent.mm.plugin.appbrand.appcache.e5 e5Var, int i17, r45.fc7 fc7Var, com.tencent.mm.plugin.appbrand.appcache.h8 h8Var, java.lang.Runnable runnable) {
        this.f75611e = e5Var;
        this.f75607a = i17;
        this.f75608b = fc7Var;
        this.f75609c = h8Var;
        this.f75610d = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.p4
    public void a(yz5.a aVar) {
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.appcache.e5 e5Var = this.f75611e;
        int i17 = this.f75607a;
        r45.fc7 fc7Var = this.f75608b;
        com.tencent.mm.plugin.appbrand.appcache.h8 h8Var = this.f75609c;
        com.tencent.mm.plugin.appbrand.appcache.i5 i5Var = new com.tencent.mm.plugin.appbrand.appcache.i5(this, aVar);
        e5Var.getClass();
        int ordinal = h8Var.ordinal();
        if (ordinal == 0) {
            if (fc7Var.f374215i > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 3);
            }
            if (fc7Var.f374214h > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 4);
            }
        } else if (ordinal == 2) {
            if (fc7Var.f374215i > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 22);
            }
            if (fc7Var.f374214h > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 23);
            }
        }
        if (fc7Var.f374215i != 1) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_common_lib_need_update_check, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "scene %s, need_update=%d, checkSwitch=%b", h8Var.name(), java.lang.Integer.valueOf(fc7Var.f374215i), java.lang.Boolean.valueOf(fj6));
            if (!fj6) {
                i5Var.run();
                return;
            }
            android.util.Pair a17 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.a(true, true);
            java.lang.Object obj2 = a17.first;
            if (obj2 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_READY && a17.second != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "skip update. checkRet=%d, version=%d", java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.l9) obj2).ordinal()), java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) a17.second).pkgVersion()));
                i5Var.run();
                return;
            }
        }
        if (com.tencent.mm.plugin.appbrand.app.r9.Di() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PkgDownloadService", "onResp, null storage");
            i5Var.run();
            return;
        }
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.b(fc7Var, pInt);
        boolean z17 = pInt.value > 0;
        android.util.Pair a18 = com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.a(true, true);
        java.lang.Object obj3 = a18.first;
        boolean z18 = obj3 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_BROKEN;
        boolean z19 = obj3 == com.tencent.mm.plugin.appbrand.appcache.l9.APP_LOCAL_EXIST;
        if (z17) {
            int ordinal2 = h8Var.ordinal();
            if (ordinal2 == 0) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 5);
                g0Var.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, z18 ? 7 : 6);
            } else if (ordinal2 == 2) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 24);
                g0Var2.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, z18 ? 26 : 25);
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.y7 y7Var = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "onResp, requestUsingLibVersion %d, scene %s, needDownload = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s, localMaxVersion = %d", java.lang.Integer.valueOf(i17), h8Var.name(), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(fc7Var.f374212f), java.lang.Integer.valueOf(fc7Var.f374214h), fc7Var.f374211e, fc7Var.f374210d, java.lang.Integer.valueOf(y7Var.f(true)));
        if (z18) {
            if (i17 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(fc7Var.f374216m)) {
                com.tencent.mm.plugin.appbrand.appcache.e5 Bi = com.tencent.mm.plugin.appbrand.appcache.e5.Bi();
                Bi.f75508d = -1;
                Bi.f75509e = null;
            } else {
                com.tencent.mm.plugin.appbrand.appcache.e5 Bi2 = com.tencent.mm.plugin.appbrand.appcache.e5.Bi();
                java.lang.String str = fc7Var.f374216m;
                Bi2.f75508d = i17;
                Bi2.f75509e = str;
            }
            e5Var.Ai(true, new com.tencent.mm.plugin.appbrand.appcache.n5(e5Var, i5Var));
            com.tencent.mm.plugin.appbrand.appcache.d6 d6Var = new com.tencent.mm.plugin.appbrand.appcache.d6();
            d6Var.field_key = "@LibraryAppId";
            d6Var.field_version = fc7Var.f374212f;
            if (!((com.tencent.mm.plugin.appbrand.appcache.e6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.e6.class)).get(d6Var, "key", "version")) {
                d6Var.field_updateTime = com.tencent.mm.sdk.platformtools.t8.i1();
                d6Var.field_scene = h8Var.ordinal() + 1;
                ((com.tencent.mm.plugin.appbrand.appcache.e6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.e6.class)).insert(d6Var);
            }
        } else if (z19 && (obj = a18.second) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PkgDownloadService", "find lib in public pkg storage, version: %d", java.lang.Integer.valueOf(((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) obj).pkgVersion));
            com.tencent.mm.plugin.appbrand.appcache.k8 k8Var = new com.tencent.mm.plugin.appbrand.appcache.k8();
            java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) a18.second).pkgPath;
            com.tencent.mm.plugin.appbrand.appcache.x4 x4Var = k8Var.f75628a;
            x4Var.f76048a = str2;
            x4Var.f76049b = true;
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) a18.second;
            y7Var.q(wxaPkgWrappingInfo.f75399d, wxaPkgWrappingInfo.pkgVersion, k8Var);
        }
        if (fc7Var.f374214h > 0 && pInt.value > 0) {
            com.tencent.mm.plugin.appbrand.appcache.v7.a();
        } else if (!z18 && z19) {
            com.tencent.mm.plugin.appbrand.appcache.v7.a();
        }
        if (z18) {
            return;
        }
        i5Var.run();
    }
}
