package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f91137a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f91138b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.ViewTreeObserver f91139c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f91140d;

    public h(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f91137a = runtime;
        this.f91140d = new com.tencent.mm.plugin.appbrand.widget.d(this);
    }

    public final void a() {
        com.tencent.mm.plugin.appbrand.page.z zVar = this.f91137a.D1;
        if (zVar == null) {
            return;
        }
        android.view.View o17 = zVar.o(1);
        android.view.View o18 = this.f91137a.D1.o(2);
        if (!k01.j.f303039a.b(null, this.f91137a.f74803n)) {
            if (o17 == null || o18 == null || o18.getTop() == o17.getMeasuredHeight()) {
                return;
            }
            o18.setY(o17.getMeasuredHeight());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandExternalCoverWidgetManager", "set widgetContainer setY[" + o18.getTop() + ']');
            return;
        }
        if (o18 != null) {
            mi1.v vVar = this.f91137a.f74821z;
            vVar.getClass();
            android.graphics.Rect rect = new android.graphics.Rect();
            mi1.i iVar = vVar.f326704c;
            if (iVar == null) {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
            iVar.getHitRect(rect);
            o18.setTop(rect.top);
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        android.app.Activity r07 = this.f91137a.r0();
        if (r07 == null) {
            return;
        }
        try {
            if (android.text.TextUtils.isEmpty(appBrandInitConfigWC.C2)) {
                this.f91137a.D1.C();
                c();
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.d0 d0Var = (com.tencent.mm.plugin.appbrand.widget.d0) java.lang.Class.forName(appBrandInitConfigWC.C2).newInstance();
            java.lang.String coverWidgetBuildData = appBrandInitConfigWC.D2;
            kotlin.jvm.internal.o.f(coverWidgetBuildData, "coverWidgetBuildData");
            android.view.View d17 = d0Var.d(r07, coverWidgetBuildData);
            if (k01.j.f303039a.b(null, this.f91137a.f74803n)) {
                ((oa1.d) d0Var).e(this.f91137a);
            }
            d17.setLayoutParams(d0Var.c());
            this.f91137a.D1.C();
            this.f91137a.D1.z(d17, d0Var.a());
            a();
            e();
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e17, "", "");
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e18, "", "");
        } catch (java.lang.InstantiationException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandExternalCoverWidgetManager", e19, "", "");
        }
    }

    public final void c() {
        if (this.f91138b) {
            android.view.View o17 = this.f91137a.D1.o(1);
            d();
            o17.getViewTreeObserver().removeOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.widget.f(this.f91140d));
            this.f91138b = false;
        }
    }

    public final void d() {
        android.view.ViewTreeObserver viewTreeObserver = this.f91139c;
        boolean z17 = false;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            z17 = true;
        }
        if (z17) {
            android.view.ViewTreeObserver viewTreeObserver2 = this.f91139c;
            kotlin.jvm.internal.o.d(viewTreeObserver2);
            viewTreeObserver2.removeOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.widget.f(this.f91140d));
        }
        this.f91139c = null;
    }

    public final void e() {
        if (this.f91138b) {
            return;
        }
        android.view.View o17 = this.f91137a.D1.o(1);
        d();
        android.view.ViewTreeObserver viewTreeObserver = o17.getViewTreeObserver();
        this.f91139c = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.appbrand.widget.f(this.f91140d));
        o17.addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.widget.g(o17, this));
        this.f91138b = true;
    }
}
