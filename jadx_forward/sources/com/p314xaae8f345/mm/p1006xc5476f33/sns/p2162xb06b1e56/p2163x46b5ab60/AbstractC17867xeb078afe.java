package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60;

/* renamed from: com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher */
/* loaded from: classes4.dex */
public abstract class AbstractC17867xeb078afe extends android.content.BroadcastReceiver {
    public abstract boolean a(android.content.Context context, java.lang.String str);

    public abstract boolean b(android.content.Context context, java.lang.String str);

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
        if (intent != null) {
            try {
                java.lang.String action = intent.getAction();
                java.lang.String str = "";
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    try {
                        str = intent.getData().getSchemeSpecificPart();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } catch (java.lang.Throwable unused) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        a(context, str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageAdd", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    try {
                        str = intent.getData().getSchemeSpecificPart();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } catch (java.lang.Throwable unused2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                    if (android.text.TextUtils.isEmpty(str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    } else {
                        b(context, str);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageRemove", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
                    }
                }
            } catch (java.lang.Throwable unused3) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcher");
    }
}
