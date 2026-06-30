package com.tencent.luggage.skyline.wxa;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/luggage/skyline/wxa/AppServiceSkylineExtensionImpl;", "Lcom/tencent/luggage/sdk/jsapi/component/service/z;", "Lcom/tencent/mm/plugin/appbrand/page/jb;", "luggage-skyline-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppServiceSkylineExtensionImpl implements com.tencent.luggage.sdk.jsapi.component.service.z, com.tencent.mm.plugin.appbrand.page.jb {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.y f47705a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f47706b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47707c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.skyline.SkylineRuntime f47708d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseArray f47709e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f47710f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f47711g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f47712h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f47713i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47714j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f47715k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f47716l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47717m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f47718n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f47719o;

    public AppServiceSkylineExtensionImpl(com.tencent.luggage.sdk.jsapi.component.service.y appService) {
        kotlin.jvm.internal.o.g(appService, "appService");
        this.f47705a = appService;
        this.f47706b = new java.util.LinkedList();
        this.f47709e = new android.util.SparseArray();
        this.f47713i = new java.util.LinkedList();
        this.f47718n = new java.util.ArrayList();
        this.f47719o = new java.lang.Object();
    }

    public final synchronized void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runnable, "runnable");
        com.tencent.skyline.SkylineRuntime skylineRuntime = this.f47708d;
        if (skylineRuntime == null) {
            this.f47706b.add(runnable);
        } else {
            skylineRuntime.waitForBootstrap(new gf.a(runnable));
        }
    }

    public final com.tencent.skyline.SkylineRuntime b() {
        com.tencent.skyline.SkylineRuntime skylineRuntime;
        df.c1 c1Var = df.c1.f229435a;
        com.tencent.luggage.sdk.jsapi.component.service.y appService = this.f47705a;
        kotlin.jvm.internal.o.g(appService, "appService");
        com.tencent.skyline.SkylineLog.i("SkylinePreloader", "useForAppService appService:" + appService + " useForAppService:" + df.c1.f229438d + " appService.componentId:" + appService.getComponentId());
        if (df.c1.f229438d) {
            skylineRuntime = null;
        } else {
            df.c1.f229438d = true;
            df.c1.f229439e = appService.getComponentId();
            if (df.c1.f229437c == null) {
                com.tencent.skyline.SkylineLog.i("SkylinePreloader", "preloadSkylineRuntime");
                df.c1.f229437c = c1Var.a();
            }
            skylineRuntime = df.c1.f229437c;
            kotlin.jvm.internal.o.d(skylineRuntime);
        }
        return skylineRuntime == null ? c1Var.a() : skylineRuntime;
    }

    public final android.util.Pair c() {
        ze.n t37 = this.f47705a.t3();
        if (t37 == null) {
            return new android.util.Pair(java.lang.Boolean.FALSE, com.tencent.skyline.ColorScheme.None);
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(t37.m0().f()), (t37.f74795d.getResources().getConfiguration().uiMode & 48) == 32 ? com.tencent.skyline.ColorScheme.Dark : com.tencent.skyline.ColorScheme.Light);
    }

    public final void d(com.tencent.luggage.sdk.jsapi.component.service.y yVar, boolean z17) {
        if (z17 && !this.f47715k) {
            synchronized (this) {
                if (!this.f47715k) {
                    int hashCode = hashCode();
                    com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", "injectSkylineBindings " + hashCode + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    if (yVar.x() != null && gf.l0.f271115a.a(yVar.x())) {
                        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = yVar.getJsRuntime();
                        if (jsRuntime != null) {
                            com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
                            com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
                            if (l0Var != null && f0Var != null) {
                                this.f47714j = true;
                                com.tencent.skyline.SkylineRuntime skylineRuntime = this.f47708d;
                                if (skylineRuntime == null) {
                                    skylineRuntime = b();
                                    this.f47708d = skylineRuntime;
                                }
                                df.a1.f229421a.a(skylineRuntime.getRuntimePtr());
                                skylineRuntime.initResourceLoader(new gf.x0(yVar));
                                skylineRuntime.initFileSystem(new gf.o0(yVar));
                                skylineRuntime.initNativeHandler(new gf.b(f0Var));
                                skylineRuntime.initMapHandler(new gf.c(yVar));
                                skylineRuntime.waitForWindowReady(new gf.d(hashCode, this, yVar));
                                skylineRuntime.waitForWindowDestroy(new gf.f(hashCode, this, skylineRuntime));
                                skylineRuntime.waitForBootstrap(new gf.h(this, yVar, hashCode, f0Var));
                                skylineRuntime.waitForBootstrap(new gf.i(this));
                                skylineRuntime.waitForBack(new gf.k(this));
                                f0Var.post(new gf.l(hashCode, jsRuntime, skylineRuntime, l0Var));
                                com.tencent.mm.plugin.appbrand.jsruntime.u h07 = jsRuntime.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
                                kotlin.jvm.internal.o.f(h07, "getAddon(...)");
                                ((com.tencent.mm.plugin.appbrand.jsruntime.y) h07).r(new gf.n(hashCode, this, skylineRuntime));
                                this.f47715k = true;
                            }
                        }
                    }
                }
            }
        }
        if (this.f47716l) {
            return;
        }
        e(new gf.s(yVar));
        this.f47716l = true;
    }

    public final void e(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f47710f) {
            runnable.run();
            return;
        }
        synchronized (this.f47713i) {
            this.f47713i.addLast(runnable);
        }
    }

    public void f(long j17, java.lang.String url, boolean z17, int i17, int i18, boolean z18, int i19, int i27, com.tencent.mm.plugin.appbrand.page.wd type, org.json.JSONObject jSONObject, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "skylineRoute " + type + ' ' + url + " ,isFromSkyline:[" + z17 + "] [" + i17 + "]-[" + i18 + "] to isToSkyline:[" + z18 + "] [" + i19 + "]-[" + i27 + ']', new java.lang.Object[0]);
        ze.n t37 = this.f47705a.t3();
        if (t37 == null) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("AppServiceSkylineExtensionImpl", "skylineRoute error because of runtime ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        android.util.SparseArray sparseArray = this.f47709e;
        if (!z18) {
            if (type == com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO) {
                java.util.LinkedList linkedList = (java.util.LinkedList) sparseArray.get(i17);
                com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "RedirectTo form skyline to webview ,cur window page is " + linkedList, new java.lang.Object[0]);
                if (linkedList != null && linkedList.size() > 1) {
                    g(j17, i19, i27, false, false, null);
                }
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.String a17 = nf.z.a(url);
        k91.f c17 = t37.m0().c(a17);
        kotlin.jvm.internal.o.f(c17, "getPageConfig(...)");
        boolean g17 = t37.m0().g();
        k91.z3 r17 = t37.u0().r();
        we.a x07 = t37.x0();
        int K = com.tencent.mm.plugin.appbrand.page.a.K(c17, g17, r17, (x07 != null && !x07.f0(url, type)) && i19 != i27);
        k91.l d17 = t37.m0().d(a17);
        com.tencent.skyline.PageConfig pageConfig = new com.tencent.skyline.PageConfig(K, url, d17 != null, d17 != null ? d17.f305667a : 0, d17 != null ? d17.f305668b : -1);
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "before route ," + i19 + " pageData " + sparseArray.get(i19), new java.lang.Object[0]);
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.tencent.skyline.SkylineRuntime skylineRuntime = this.f47708d;
            if (skylineRuntime != null) {
                skylineRuntime.appLaunch(i19, i27, pageConfig);
            }
            if (runnable != null) {
                runnable.run();
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList2);
        } else if (ordinal == 1) {
            com.tencent.skyline.SkylineRuntime skylineRuntime2 = this.f47708d;
            if (skylineRuntime2 != null) {
                skylineRuntime2.navigateTo(i19, i27, pageConfig, new gf.t(runnable));
            }
            java.util.LinkedList linkedList3 = (java.util.LinkedList) sparseArray.get(i19);
            if (linkedList3 == null) {
                linkedList3 = new java.util.LinkedList();
                sparseArray.put(i19, linkedList3);
            }
            linkedList3.addLast(java.lang.Integer.valueOf(i27));
        } else if (ordinal == 3) {
            boolean z19 = i19 == i27;
            gf.u uVar = new gf.u(runnable);
            if (z19) {
                com.tencent.skyline.SkylineRuntime skylineRuntime3 = this.f47708d;
                if (skylineRuntime3 != null) {
                    skylineRuntime3.navigateTo(i19, i27, pageConfig, uVar);
                }
            } else {
                com.tencent.skyline.SkylineRuntime skylineRuntime4 = this.f47708d;
                if (skylineRuntime4 != null) {
                    skylineRuntime4.redirectTo(i19, i27, pageConfig, uVar);
                }
            }
            java.util.LinkedList linkedList4 = (java.util.LinkedList) sparseArray.get(i19);
            if (linkedList4 == null) {
                linkedList4 = new java.util.LinkedList();
                sparseArray.put(i19, linkedList4);
            }
            if (linkedList4.size() > 0) {
                linkedList4.removeLast();
            }
            linkedList4.addLast(java.lang.Integer.valueOf(i27));
        } else if (ordinal == 5) {
            com.tencent.skyline.SkylineRuntime skylineRuntime5 = this.f47708d;
            if (skylineRuntime5 != null) {
                skylineRuntime5.reLaunch(i19, i27, pageConfig);
            }
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            linkedList5.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList5);
            if (runnable != null) {
                runnable.run();
            }
        } else if (ordinal == 6) {
            com.tencent.skyline.SkylineRuntime skylineRuntime6 = this.f47708d;
            if (skylineRuntime6 != null) {
                skylineRuntime6.autoReLaunch(i19, i27, pageConfig);
            }
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            linkedList6.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList6);
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (ordinal != 7) {
                throw new java.lang.UnsupportedOperationException();
            }
            com.tencent.skyline.SkylineRuntime skylineRuntime7 = this.f47708d;
            if (skylineRuntime7 != null) {
                skylineRuntime7.switchTab(i19, i27, pageConfig);
            }
            if (runnable != null) {
                runnable.run();
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            linkedList7.addLast(java.lang.Integer.valueOf(i27));
            sparseArray.put(i19, linkedList7);
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "after route ," + i19 + " pageData " + sparseArray.get(i19), new java.lang.Object[0]);
    }

    public void g(long j17, int i17, int i18, boolean z17, boolean z18, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList = (java.util.LinkedList) this.f47709e.get(i17);
        com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "routeBack to [" + i17 + "]-[" + i18 + "]; pages: " + linkedList, new java.lang.Object[0]);
        if (linkedList == null || linkedList.size() <= 1) {
            com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of pages.size ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (!linkedList.contains(java.lang.Integer.valueOf(i18))) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("AppServiceSkylineExtensionImpl", "routeBack stop ,because of pages don't contains ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.Integer num = (java.lang.Integer) linkedList.peekLast();
        if (num != null && num.intValue() == i18) {
            com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of isTopPage ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        java.lang.Object peekLast = linkedList.peekLast();
        kotlin.jvm.internal.o.d(peekLast);
        int intValue = ((java.lang.Number) peekLast).intValue();
        int i19 = 0;
        while (true) {
            java.lang.Integer num2 = (java.lang.Integer) linkedList.peekLast();
            if (num2 != null && num2.intValue() == i18) {
                break;
            }
            linkedList.pollLast();
            i19++;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.utils.s3.b("AppServiceSkylineExtensionImpl", "routeBack stop ,because of navigateBackFromSkyline ", new java.lang.Object[0]);
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.tencent.skyline.SkylineRuntime skylineRuntime = this.f47708d;
        if (skylineRuntime != null) {
            skylineRuntime.navigateBack(i17, intValue, i19, z18, new gf.v(runnable));
        }
    }
}
