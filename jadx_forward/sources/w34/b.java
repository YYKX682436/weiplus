package w34;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        synchronized (w34.c.class) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                java.lang.String str = w34.c.f524253c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, already inited");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
                    return;
                }
                java.lang.String a17 = w34.c.a();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    w34.c.f524253c = a17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils");
                    p34.o.g("wv_ua_info", a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdDeviceInfo.DeviceInfoUtils", "UaInfo.getWebViewUAInfo, refresh");
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.device.utils.DeviceInfoUtils$1");
            }
        }
    }
}
