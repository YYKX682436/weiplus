package com.tencent.mm.feature.appbrand.support;

@j95.b
/* loaded from: classes7.dex */
public final class c0 extends i95.w implements ft.j {
    public com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData Ai() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.appusage.AppBrandCommonUsedTransferData appBrandCommonUsedTransferData = com.tencent.mm.plugin.appbrand.appusage.j0.f76479m;
        if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.appbrand.appusage.j0.f76471e)) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            str = b17 != null ? b17.f369766q : "";
            com.tencent.mm.plugin.appbrand.appusage.j0.f76471e = str;
        } else {
            str = com.tencent.mm.plugin.appbrand.appusage.j0.f76471e;
        }
        appBrandCommonUsedTransferData.f76343f = str;
        appBrandCommonUsedTransferData.f76342e = com.tencent.mm.plugin.appbrand.appusage.j0.d();
        appBrandCommonUsedTransferData.f76341d = com.tencent.mm.plugin.appbrand.appusage.j0.e();
        r45.ab7 ab7Var = com.tencent.mm.plugin.appbrand.appusage.j0.c(com.tencent.mm.sdk.platformtools.x2.f193071a).f387641d;
        appBrandCommonUsedTransferData.f76344g = ab7Var.f369906e;
        appBrandCommonUsedTransferData.f76345h = ab7Var.f369905d;
        return appBrandCommonUsedTransferData;
    }

    public int Bi() {
        int i17 = com.tencent.mm.plugin.appbrand.appusage.j0.f76468b;
        if (i17 == 0) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            i17 = b17 != null ? b17.f369758f : 0;
            com.tencent.mm.plugin.appbrand.appusage.j0.f76468b = i17;
        }
        return i17;
    }

    public void wi(int i17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "fetchCommonUsedAppFromServer scene:%d", java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.plugin.appbrand.appusage.j0.f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "don't support fetch CommonUsedWeApp");
            return;
        }
        if (com.tencent.mm.plugin.appbrand.appusage.j0.f76480n == 0) {
            com.tencent.mm.plugin.appbrand.appusage.j0.f76480n = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_LAST_REQUEST_TIME_LONG, 0L)).longValue();
        }
        long j17 = 1200;
        if (com.tencent.mm.plugin.appbrand.appusage.j0.f76481o == 0) {
            com.tencent.mm.plugin.appbrand.appusage.j0.f76481o = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_COMMON_USE_NEXT_REQ_INTERVAL_LONG, 1200L)).longValue();
        }
        long j18 = com.tencent.mm.plugin.appbrand.appusage.j0.f76481o;
        java.lang.String str2 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77231y1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "getDefaultNextRequestInterval wxaCommUseSetting:%s", str2);
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                j17 = new cl0.g(str2).optLong("UpdateRegularlyReqFreqSeconds", 1200L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCommonUsedAppLogic", e17, "", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.appbrand.appusage.j0.f76481o = java.lang.Math.max(j18, j17);
        int count = ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).getCount();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.i1() - com.tencent.mm.plugin.appbrand.appusage.j0.f76480n >= com.tencent.mm.plugin.appbrand.appusage.j0.f76481o;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "checkNeedUpdate, needUpdate:%b, count:%d， nextRequestInterval:%d", java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(count), java.lang.Long.valueOf(com.tencent.mm.plugin.appbrand.appusage.j0.f76481o));
        if (z18 && count > 0) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "don't need to do fetch CommonUsedWeApp");
            return;
        }
        if (com.tencent.mm.plugin.appbrand.appusage.j0.f76473g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppLogic", "is fetching data from server");
            return;
        }
        com.tencent.mm.plugin.appbrand.appusage.j0.f76473g = true;
        if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.appbrand.appusage.j0.f76470d)) {
            r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
            java.lang.String str3 = b17 != null ? b17.f369761i : "";
            com.tencent.mm.plugin.appbrand.appusage.j0.f76470d = str3;
            str = str3;
        } else {
            str = com.tencent.mm.plugin.appbrand.appusage.j0.f76470d;
        }
        new com.tencent.mm.plugin.appbrand.appusage.i0(i17, str).l();
    }
}
