package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public abstract class k0 {
    public static void a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorAdReportHelper", "[rewardAD] addReportTask: appId: %s, adInfo: %s", str, appBrandStatObject.f87794m);
        java.lang.String str3 = appBrandStatObject.f87794m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.x0.a(str, new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.j0(str, str2, str3, java.lang.System.currentTimeMillis(), appBrandStatObject));
    }

    public static void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17) {
        int i18;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str3);
        sb6.append(",");
        sb6.append(str2);
        sb6.append(",");
        sb6.append(str);
        sb6.append(",");
        sb6.append(currentTimeMillis);
        sb6.append(",");
        sb6.append(j17);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        switch (com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            case -1:
                i18 = 255;
                break;
            case 0:
                i18 = 1;
                break;
            case 1:
            case 6:
            case 8:
                i18 = 3;
                break;
            case 2:
            case 5:
            case 7:
                i18 = 2;
                break;
            case 3:
            case 4:
                i18 = 4;
                break;
            case 9:
            default:
                i18 = 6;
                break;
            case 10:
                i18 = 5;
                break;
        }
        sb6.append(i18);
        sb6.append(",,,,");
        com.tencent.mm.plugin.appbrand.report.model.f.a(16004, sb6.toString(), null);
    }
}
