package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.hc f92444a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.i3 f92445b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f92446c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92447d;

    public z5(com.tencent.mm.plugin.appbrand.hc containerHandler, com.tencent.mm.plugin.appbrand.page.i3 i3Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, java.lang.String str) {
        kotlin.jvm.internal.o.g(containerHandler, "containerHandler");
        this.f92444a = containerHandler;
        this.f92445b = i3Var;
        this.f92446c = appBrandInitConfig;
        this.f92447d = str;
    }

    public final android.app.Activity a() {
        java.lang.Object obj = this.f92444a;
        if (obj instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0) {
            return ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) obj).w();
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.l5) {
            return q75.a.a(((com.tencent.mm.plugin.appbrand.l5) obj).getContext());
        }
        return null;
    }

    public java.lang.String toString() {
        return "[AppBrandRuntimePageStack] " + this.f92444a + " - " + this.f92445b;
    }

    public z5(com.tencent.mm.plugin.appbrand.hc containerHandler) {
        kotlin.jvm.internal.o.g(containerHandler, "containerHandler");
        this.f92444a = containerHandler;
    }
}
