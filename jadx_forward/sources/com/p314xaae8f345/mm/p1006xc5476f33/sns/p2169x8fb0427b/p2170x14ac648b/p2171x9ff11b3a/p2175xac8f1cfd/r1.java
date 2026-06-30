package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class r1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f246979a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f246980b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f246981c = new java.util.concurrent.ConcurrentHashMap();

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p1 p1Var) {
    }

    public final synchronized void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1 t1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.util.Iterator it = this.f246979a.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() == t1Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
                return;
            }
        }
        ((java.util.LinkedList) this.f246979a).add(new java.lang.ref.WeakReference(t1Var));
        ((java.util.concurrent.ConcurrentHashMap) this.f246980b).put(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.h0(t1Var), t1Var.u());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("add", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1 t1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        if (t1Var == null || android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.h0(t1Var))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "the btn comp is null or target apk pkg is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        } else {
            try {
                c();
                a(t1Var);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AdLandingPageAppMarketBtnComp", "add market btn has some error");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addMarketBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }
    }

    public final synchronized void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.util.Iterator it = this.f246979a.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null || weakReference.get() == null) {
                it.remove();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanNullRef", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public final java.lang.String d(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        try {
            java.lang.String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return schemeSpecificPart;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "getAppPackage, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppPackage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return "";
        }
    }

    public final void e(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.lang.String d17 = d(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageAdd, pkg=" + d17);
        if (android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
            return;
        }
        g(d17, true, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574707j72));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        try {
            ab4.n0 n0Var = (ab4.n0) ((java.util.concurrent.ConcurrentHashMap) this.f246980b).get(d17);
            if (n0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.o0(n0Var, 3, "0", "");
                ca4.d dVar = new ca4.d(n0Var.o(), n0Var.e(), n0Var.l(), n0Var.a(), n0Var.c(), n0Var.m(), n0Var.q());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.s1) ((java.util.concurrent.ConcurrentHashMap) this.f246981c).get(d17);
                    if (s1Var != null) {
                        dVar.a((int) (java.lang.System.currentTimeMillis() - s1Var.f247007a));
                    }
                    l44.z.e(dVar, 3);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "report error, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 3);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageAdd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    public final void f(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        java.lang.String d17 = d(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageAppMarketBtnComp", "onPackageRemove, pkg=" + d17);
        if (android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        } else {
            g(d17, false, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPackageRemove", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        }
    }

    public final synchronized void g(java.lang.String str, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        for (java.lang.ref.WeakReference weakReference : this.f246979a) {
            if (weakReference != null && weakReference.get() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1) weakReference.get();
                if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.h0(t1Var))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    t1Var.D = z17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    if (!z17) {
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.i0(t1Var).F;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str3);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.i0(t1Var).f84348a2)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str2);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    } else {
                        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.t1.i0(t1Var).f84348a2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                        t1Var.p0(str4);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppMarketBtnCmpText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
        if (intent != null) {
            try {
                java.lang.String action = intent.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    e(context, intent);
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    f(context, intent);
                }
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageAppMarketBtnComp", "there is a exception in receiver");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppMarketBtnComp$InnerPkgBroadcastReceiver");
    }
}
