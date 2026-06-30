package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class e7 extends com.tencent.mm.plugin.appbrand.uc {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f89683a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f89684b;

    /* renamed from: c, reason: collision with root package name */
    public int f89685c = 0;

    public e7(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f89683a = appBrandRuntime;
        this.f89684b = context;
    }

    @Override // com.tencent.mm.plugin.appbrand.uc, com.tencent.mm.plugin.appbrand.tc
    public void a(android.view.MotionEvent motionEvent) {
        ak3.a aVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        if (g(appBrandRuntime) && (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) && (aVar = ((rh1.e) ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).V2().f300111d).f395630r.f395628a.f5586h) != null) {
            aVar.a(motionEvent);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.uc, com.tencent.mm.plugin.appbrand.tc
    public int b(boolean z17) {
        ak3.a aVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        if (g(appBrandRuntime) && (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) && (aVar = ((rh1.e) ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).V2().f300111d).f395630r.f395628a.f5586h) != null) {
            return aVar.h(z17);
        }
        return 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.uc, com.tencent.mm.plugin.appbrand.tc
    public void c(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = appBrandRuntime.x0();
        if (x07 == null || (w2Var = x07.getCurrentPage()) == null || x07.r(w2Var) != null) {
            w2Var = null;
        }
        if (w2Var == null || (appBrandGlobalNativeWidgetContainerView = appBrandRuntime.C1) == null) {
            return;
        }
        appBrandGlobalNativeWidgetContainerView.setTranslationX(i17);
        appBrandGlobalNativeWidgetContainerView.setTranslationY(i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.tc
    public void d(int i17, float f17) {
        dk3.f fVar;
        com.tencent.mm.plugin.appbrand.page.i3 x07;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        if (1 == i17 && this.f89685c != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeSwipeBackListener", "convertActivityToTranslucent onScrollStateChange");
            android.app.Activity a17 = q75.a.a(this.f89684b);
            if (a17 instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                db5.f.c(a17, null);
                if (((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) a17).v7() && (x07 = appBrandRuntime.x0()) != null && (currentPage = x07.getCurrentPage()) != null && x07.r(currentPage) == null) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + 200;
                    currentPage.f325904z = uptimeMillis;
                    currentPage.h();
                    z26.d dVar = new z26.d(currentPage);
                    currentPage.B = dVar;
                    currentPage.A.postAtTime(dVar, uptimeMillis);
                }
            }
        }
        if (g(appBrandRuntime) && (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6)) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
            if (1 == i17 && 1 != this.f89685c && (fVar = o6Var.V2().f300115h) != null) {
                ((dk3.e) fVar).c();
            }
            ak3.a aVar = ((rh1.e) o6Var.V2().f300111d).f395630r.f395628a.f5586h;
            if (aVar != null) {
                aVar.f(f17);
            }
        }
        this.f89685c = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.uc, com.tencent.mm.plugin.appbrand.tc
    public void e(int i17) {
        ak3.a aVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        if (g(appBrandRuntime) && (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) && (aVar = ((rh1.e) ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).V2().f300111d).f395630r.f395628a.f5586h) != null) {
            aVar.c(1, 0);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.uc, com.tencent.mm.plugin.appbrand.tc
    public boolean f() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89683a;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = appBrandRuntime.x0().getCurrentPage();
        com.tencent.mm.plugin.appbrand.page.i3 x07 = appBrandRuntime.x0();
        x07.getClass();
        x07.c0(new com.tencent.mm.plugin.appbrand.page.l3(x07, currentPage, "scene_swipe_back", null));
        return true;
    }

    public final boolean g(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        if (!(appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        return (o6Var.V2() == null || o6Var.V2().a()) ? false : true;
    }
}
