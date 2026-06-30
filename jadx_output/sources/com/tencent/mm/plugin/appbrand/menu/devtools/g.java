package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class g implements nh1.b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.menu.devtools.g f85899a = new com.tencent.mm.plugin.appbrand.menu.devtools.g();

    @Override // nh1.b
    public void a(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.Boolean c17 = com.tencent.mm.plugin.appbrand.performance.m.c();
        kotlin.jvm.internal.o.d(c17);
        if (!c17.booleanValue()) {
            android.view.LayoutInflater.from(context);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.tencent.mm.plugin.appbrand.menu.devtools.d dVar = new com.tencent.mm.plugin.appbrand.menu.devtools.d(pageView);
            com.tencent.mm.plugin.appbrand.menu.devtools.f fVar = new com.tencent.mm.plugin.appbrand.menu.devtools.f(str, context, pageView);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(context);
            dVar.onCreateMMMenu(g4Var);
            if (g4Var.z()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f211872n = dVar;
            k0Var.f211881s = fVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SecondaryMenuDelegateAudits", "close Audits");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPerformanceTracer", "closeAudits");
        com.tencent.mm.plugin.appbrand.performance.m.f87366d = java.lang.Boolean.FALSE;
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(pageView)) {
            com.tencent.mm.plugin.appbrand.service.c0 C0 = pageView.getRuntime().C0();
            if (C0 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EventOnGameAuditsStateChange", "service is null");
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("state", 1);
                od1.b bVar = new od1.b();
                bVar.t(hashMap);
                bVar.u(C0);
                bVar.m();
            }
        } else {
            com.tencent.mm.plugin.appbrand.service.c0 C02 = pageView.getRuntime().C0();
            if (C02 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EventOnAppAuditsStateChange", "service is null");
            } else {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("state", 1);
                od1.a aVar = new od1.a();
                aVar.t(hashMap2);
                aVar.u(C02);
                aVar.m();
            }
        }
        va1.b bVar2 = va1.b.f434229a;
        com.tencent.mm.plugin.appbrand.o6 runtime = pageView.getRuntime();
        kotlin.jvm.internal.o.f(runtime, "getRuntime(...)");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("audits_instanceid", runtime.u0().f47277w);
        bundle.putString("audits_appid", runtime.f74803n);
        bundle.putLong("audits_app_start_time", runtime.u0().I);
        android.os.Bundle bundle2 = (android.os.Bundle) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, va1.a.class);
        com.tencent.mm.plugin.appbrand.performance.m.g(runtime.f74803n, bundle2 != null ? bundle2.getStringArrayList("audits_trace_event_list") : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuditsUtil", "tracer to write data");
        com.tencent.mm.plugin.appbrand.o6 runtime2 = pageView.getRuntime();
        if (runtime2.f86187s2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "stopDumpTrace");
            runtime2.f86187s2.d();
            runtime2.f86187s2 = null;
        }
        java.lang.String str2 = runtime2.f74803n;
        java.util.HashMap hashMap3 = com.tencent.mm.plugin.appbrand.performance.h.f87351a;
        com.tencent.mm.plugin.appbrand.performance.f fVar2 = (com.tencent.mm.plugin.appbrand.performance.f) hashMap3.get(str2);
        if (fVar2 != null) {
            hashMap3.remove(str2);
            fVar2.h();
        }
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        java.lang.Boolean c17 = com.tencent.mm.plugin.appbrand.performance.m.c();
        kotlin.jvm.internal.o.d(c17);
        if (c17.booleanValue()) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.euv);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.eux);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    @Override // nh1.b
    public boolean c(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.page.n7 pageView = (com.tencent.mm.plugin.appbrand.page.n7) v5Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageView, "pageView");
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.c(pageView) && pageView.getRuntime().s2()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.g0 b17 = pageView.b(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC.class);
        kotlin.jvm.internal.o.f(b17, "getConfig(...)");
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) b17;
        if ((java.lang.Boolean.parseBoolean(pageView.getRuntime().S2(false).qe("supportAudits")) && (appBrandSysConfigWC.f305852r.f75399d == 1 || appBrandSysConfigWC.f305852r.f75399d == 2)) || z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            return true;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }
}
