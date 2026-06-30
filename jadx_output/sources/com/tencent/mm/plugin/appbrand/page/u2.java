package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class u2 extends z26.h {

    /* renamed from: a, reason: collision with root package name */
    public int f87133a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87134b;

    public u2(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        this.f87134b = w2Var;
    }

    @Override // z26.e
    public void a(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.appbrand.tc h17;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer() == null || w2Var.getContainer().getRuntime() == null || (h17 = h()) == null) {
            return;
        }
        h17.a(motionEvent);
    }

    @Override // z26.e
    public int b(boolean z17) {
        com.tencent.mm.plugin.appbrand.tc h17;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        w2Var.setEdgeSize(w2Var.L);
        if (w2Var.getContainer() == null || w2Var.getContainer().getRuntime() == null || (h17 = h()) == null) {
            return 0;
        }
        return h17.b(z17);
    }

    @Override // z26.e
    public void c(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.appbrand.tc h17;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer() == null || w2Var.getContainer().getRuntime() == null || (h17 = h()) == null) {
            return;
        }
        h17.c(view, i17, i18);
    }

    @Override // z26.e
    public void d(int i17, float f17) {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer() == null || w2Var.getContainer().getCurrentPage() != w2Var) {
            w2Var.setEnableGesture(false);
            return;
        }
        if (w2Var.G.m0("scene_swipe_back", null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "[onScrollStateChange] navigate back be intercepted");
            w2Var.e();
            return;
        }
        com.tencent.mm.plugin.appbrand.page.i3 container = w2Var.getContainer();
        com.tencent.mm.plugin.appbrand.page.w2 r17 = w2Var.G.r(w2Var);
        if (container == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPage", "onScrollStateChange, null == pageContainer");
        } else {
            float f18 = 100.0f * f17;
            int ceil = (int) java.lang.Math.ceil(f18);
            com.tencent.mm.plugin.appbrand.page.wd wdVar = com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK;
            if (ceil == 0 || -1 == this.f87133a) {
                if (w2Var.R) {
                    container.k(wdVar, w2Var, r17);
                } else {
                    container.n(wdVar, w2Var, r17);
                }
            } else if (100 > ceil) {
                container.m(wdVar, w2Var, r17, f18);
            }
            this.f87133a = ceil;
        }
        if (i17 != 0) {
            w2Var.R = true;
            w2Var.getClass();
        } else {
            w2Var.R = false;
            this.f87133a = -1;
        }
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            if (!w2Var.S[0]) {
                if (r17 != null) {
                    android.view.View contentView = r17.getContentView();
                    w2Var.getClass();
                    contentView.clearAnimation();
                    contentView.setTranslationX(0.0f);
                }
                w2Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "onSwipeBack %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
                w2Var.R = true;
                w2Var.post(new com.tencent.mm.plugin.appbrand.page.v2(w2Var));
                w2Var.S[0] = true;
            }
        } else if (r17 != null) {
            r17.H(f17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPage", "scrollPercent %f", java.lang.Float.valueOf(f17));
        com.tencent.mm.plugin.appbrand.tc h17 = h();
        if (h17 != null) {
            h17.d(i17, f17);
        }
    }

    @Override // z26.e
    public void e(int i17) {
        com.tencent.mm.plugin.appbrand.tc h17;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer() == null || w2Var.getContainer().getRuntime() == null || (h17 = h()) == null) {
            return;
        }
        h17.e(i17);
    }

    @Override // z26.e
    public boolean g() {
        com.tencent.mm.plugin.appbrand.tc h17;
        boolean f17;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer() == null || w2Var.getContainer().getRuntime() == null || (h17 = h()) == null || !(f17 = h17.f())) {
            return false;
        }
        return f17;
    }

    public final com.tencent.mm.plugin.appbrand.tc h() {
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f87134b;
        if (w2Var.getContainer().getRuntime().V1()) {
            if (w2Var.getContainer().getRuntime().f74801l1 != null) {
                return w2Var.getContainer().getRuntime().f74801l1;
            }
            return null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = w2Var.getContainer().getRuntime();
        if (runtime.V1()) {
            throw new java.lang.RuntimeException("Stub!");
        }
        if (!(runtime.f74807p1 && !runtime.f74820y1) || w2Var.getContainer().getRuntime().f74801l1 == null) {
            return null;
        }
        return w2Var.getContainer().getRuntime().f74801l1;
    }
}
