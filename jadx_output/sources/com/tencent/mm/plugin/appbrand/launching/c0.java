package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84532e;

    public c0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f84531d = appBrandInitConfigWC;
        this.f84532e = appBrandStatObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f84531d;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = this.f84532e;
        com.tencent.mm.plugin.appbrand.backgroundfetch.o0 o0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.o0();
        o0Var.f76865a = appBrandInitConfigWC.f77278d;
        o0Var.f76866b = appBrandInitConfigWC.f47278x;
        o0Var.f76872h = appBrandInitConfigWC.f77283i;
        o0Var.f76868d = appBrandInitConfigWC.L;
        o0Var.f76871g = appBrandStatObject.f87790f;
        o0Var.f76867c = appBrandInitConfigWC.f47277w;
        if (appBrandInitConfigWC.f77298k2 != null) {
            o0Var.f76869e = appBrandInitConfigWC.f77298k2.f88136f;
            o0Var.f76870f = appBrandInitConfigWC.f77298k2.f88137g;
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting = appBrandInitConfigWC.R;
        if (wxaAttributes$WxaDynamicInfo$Setting != null) {
            o0Var.f76873i = wxaAttributes$WxaDynamicInfo$Setting.A ? 1 : 0;
        }
        o0Var.f76882r = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = appBrandInitConfigWC.N;
        java.lang.String str = wxaAttributes$WxaVersionInfo != null ? wxaAttributes$WxaVersionInfo.f77445e : "";
        boolean z17 = true;
        if (!com.tencent.mm.plugin.appbrand.backgroundfetch.h.c(appBrandInitConfigWC)) {
            o0Var.f76875k = i81.j.a(appBrandInitConfigWC) ? 1 : 0;
            java.lang.String str2 = appBrandInitConfigWC.f77278d;
            java.lang.String str3 = appBrandInitConfigWC.f47278x;
            java.lang.String str4 = appBrandInitConfigWC.f77283i;
            int i17 = appBrandStatObject.f87790f;
            com.tencent.mm.plugin.appbrand.backgroundfetch.t0 t0Var = new com.tencent.mm.plugin.appbrand.backgroundfetch.t0(appBrandInitConfigWC.f47277w);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, username is null");
                return;
            } else {
                nm5.b d17 = com.tencent.mm.plugin.appbrand.backgroundfetch.h.d(str4);
                com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(str2, str3, (java.lang.String) d17.a(0), (java.lang.String) d17.a(1), str, i17, null, o0Var, t0Var);
                return;
            }
        }
        java.lang.String str5 = appBrandInitConfigWC.f77278d;
        java.lang.String str6 = appBrandInitConfigWC.f47278x;
        java.lang.String str7 = appBrandInitConfigWC.f77283i;
        java.lang.String str8 = appBrandInitConfigWC.f47277w;
        int i18 = appBrandStatObject.f87790f;
        int i19 = appBrandInitConfigWC.Q1;
        if (i19 <= 0) {
            i19 = appBrandInitConfigWC.f77292e2 ? d85.f0.P.f227177e : d85.f0.N.f227177e;
        }
        com.tencent.mm.plugin.appbrand.backgroundfetch.t0 t0Var2 = new com.tencent.mm.plugin.appbrand.backgroundfetch.t0(str8);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation, appid:%s, username:%s, instanceId:%s, scene:%d, sysAuthBiz:%d", str5, str6, str8, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        nm5.b d18 = com.tencent.mm.plugin.appbrand.backgroundfetch.h.d(str7);
        java.lang.String str9 = (java.lang.String) d18.a(0);
        java.lang.String str10 = (java.lang.String) d18.a(1);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.tencent.mm.sdk.platformtools.n2.a() && !com.tencent.mm.sdk.platformtools.n2.b()) {
            z17 = false;
        }
        d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.ACCESS_FINE_LOCATION", i19);
        o0Var.f76876l = java.lang.System.currentTimeMillis() - currentTimeMillis;
        if (z17 && ij6 == d85.h0.GRANTED) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.backgroundfetch.e(str8, o0Var, java.lang.System.currentTimeMillis(), str5, str6, str9, str10, str, i18, t0Var2));
            return;
        }
        o0Var.f76875k = 2;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataWithLocation fail, locationEnable:" + z17 + ", permissionResult:" + ij6);
        com.tencent.mm.plugin.appbrand.backgroundfetch.h.e(str5, str6, str9, str10, str, i18, null, o0Var, t0Var2);
    }
}
