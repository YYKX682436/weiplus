package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class mc implements ni1.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86885a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.p8 f86886b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86887c;

    public mc(com.tencent.mm.plugin.appbrand.page.v5 mPageView, com.tencent.mm.plugin.appbrand.page.p8 mPullDownWrapper) {
        kotlin.jvm.internal.o.g(mPageView, "mPageView");
        kotlin.jvm.internal.o.g(mPullDownWrapper, "mPullDownWrapper");
        this.f86885a = mPageView;
        this.f86886b = mPullDownWrapper;
        this.f86887c = "Luggage.MPPageViewPullDownExtensionImpl";
    }

    @Override // ni1.h
    public void a(java.lang.String style) {
        kotlin.jvm.internal.o.g(style, "style");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.ic(this, this, style));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void c(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.fc(this, this, z17));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandPullDown invoke entered startPullDownRefresh appId:");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        sb6.append(v5Var.getAppId());
        sb6.append(" url:");
        sb6.append(v5Var.X1());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f86887c;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.kc(this, this));
            return;
        }
        com.tencent.mars.xlog.Log.e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void e() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.lc(this, this));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void f(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.ec(this, this, z17));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void g(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.jc(this, this, text));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void h(ni1.g style, int i17) {
        kotlin.jvm.internal.o.g(style, "style");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.hc(this, this, style, i17));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // ni1.h
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86885a;
        if (v5Var.isRunning()) {
            v5Var.m(new com.tencent.mm.plugin.appbrand.page.gc(this, this, z17));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f86887c, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }
}
