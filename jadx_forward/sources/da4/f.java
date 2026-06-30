package da4;

/* loaded from: classes4.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ da4.h f309313a;

    public f(da4.h hVar, da4.e eVar) {
        this.f309313a = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe
    public boolean a(android.content.Context context, java.lang.String str) {
        da4.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        da4.h hVar = this.f309313a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        hVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
            iVar = null;
        } else {
            synchronized (hVar.f309319c) {
                try {
                    iVar = (da4.i) ((java.util.HashMap) hVar.f309319c).remove(str);
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
                    throw th6;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeTargetPackage", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager");
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInstalledWatcherManager", "onAppInstalled is called, but the pkg is not existed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
            return false;
        }
        java.lang.String str2 = "apkPackage=" + iVar.f309321a + "|op=5|exprValue=" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_apk_clickid_inject_android, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = iVar.f309327g;
        if (c17933xe8d1b226 != null) {
            str2 = str2 + "|aid" + c17933xe8d1b226.m70355xb5882a06() + "|traceId=" + iVar.f309327g.m70372xfe2dfcea() + "|fromSource=" + iVar.f309330j + "|fromAdType=" + iVar.f309331k;
        }
        ca4.e0.a("ad_app_download_op_report", "1", 0, 5, str2);
        int i17 = iVar.f309330j;
        if (i17 == 0 || i17 == 2) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            if (iVar.f309325e) {
                arrayMap.put("outSns", 1);
            }
            da4.a.h(iVar.f309322b, iVar.f309323c, iVar.f309324d, 3, "0", arrayMap);
        }
        int i18 = iVar.f309331k;
        if (i18 == 0) {
            java.lang.String str3 = iVar.f309323c;
            ca4.d dVar = new ca4.d(str3, iVar.f309324d, ca4.m0.D(str3), ca4.m0.P(iVar.f309323c), ca4.m0.L(iVar.f309323c));
            dVar.a((int) (java.lang.System.currentTimeMillis() - iVar.f309328h));
            java.lang.String str4 = iVar.f309329i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdReportParams", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            dVar.f121388e = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdReportParams", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            dVar.c(iVar.f309332l);
            l44.z.e(dVar, 1);
        } else if (i18 == 1) {
            ca4.f fVar = new ca4.f();
            fVar.m(4001011);
            fVar.o(iVar.f309323c);
            fVar.p(ca4.m0.D(iVar.f309323c));
            fVar.n(ca4.m0.P(iVar.f309323c));
            fVar.q(ca4.m0.P(iVar.f309323c));
            fVar.k(4);
            fVar.d(iVar.f309329i);
            a84.t0.a(fVar.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppInstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2162xb06b1e56.p2163x46b5ab60.AbstractC17867xeb078afe
    public boolean b(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppUninstalled", "com.tencent.mm.plugin.sns.device.appstore.ApkInstalledWatcherManager$DefaultInstalledWatcher");
        return false;
    }
}
