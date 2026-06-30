package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2101x60b7c31.p2102xb73a0fae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/jsapi/helper/ApkWatcher;", "Lcom/tencent/mm/plugin/sns/device/appstore/ApkInstalledWatcher;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher */
/* loaded from: classes4.dex */
public final class C17726xf6097c20 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe {

    /* renamed from: a, reason: collision with root package name */
    public final y44.d f244261a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f244262b;

    public C17726xf6097c20(y44.d action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f244261a = action;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe
    public boolean a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
            return false;
        }
        synchronized (((y44.a) this.f244261a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onApkInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.ApkWatcherManager", "the " + str + " is installed");
                y44.c cVar = (y44.c) ((java.util.LinkedHashMap) y44.a.f540890e).get(str);
                if (cVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAction", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAction", "com.tencent.mm.plugin.sns.ad.jsapi.helper.InstallPkgData");
                    y44.b bVar = cVar.f540896d;
                    if (bVar != null) {
                        ((x44.s0) bVar).a(str);
                    }
                }
                y44.a.f540889d.a(str);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("SnsAd.ApkWatcherManager", th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onApkInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcherManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppInstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe
    public boolean b(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppUninstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppUninstalled", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        return false;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        try {
            if (!this.f244262b) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                context.registerReceiver(this, intentFilter);
                this.f244262b = true;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("ApkWatcher", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
        try {
            if (this.f244262b) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this);
                this.f244262b = false;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("ApkWatcher", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unregister", "com.tencent.mm.plugin.sns.ad.jsapi.helper.ApkWatcher");
    }
}
