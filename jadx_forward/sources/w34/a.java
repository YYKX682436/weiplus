package w34;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_harmony_os_info_switch, 1);
            if (Ni == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo is false");
            }
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportHarmonyOSInfo, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportHarmonyOSInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_oaid_switch, 1);
            if (Ni == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID is false");
            }
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportOAID, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportOAID", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_sys_ua_switch, 1);
            if (Ni == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA is false");
            }
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportSysUA, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportSysUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_webview_ua_build_info_switch, 0);
            if (Ni == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo is false");
            }
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isReportWebViewUABuildInfo, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReportWebViewUABuildInfo", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }

    public static boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_timeline_ad_chrome_ver_visit_dex_switch, 1);
            if (Ni == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA is false");
            }
            boolean z17 = Ni == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.AdDeviceIdSwitchHelper", "isVisitDexOrODexForWebViewUA, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVisitDexOrODexForWebViewUA", "com.tencent.mm.plugin.sns.ad.device.utils.AdDeviceIdSwitchHelper");
            return false;
        }
    }
}
