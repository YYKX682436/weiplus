package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public interface hc {
    com.tencent.mm.plugin.appbrand.AppBrandRuntime getActiveRuntime();

    android.content.Context getContext();

    int getStackSize();

    xi1.g getWindowAndroid();

    android.content.Context h();

    com.tencent.mm.plugin.appbrand.AppBrandRuntime i(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    void j(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig);

    void k(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    default void l(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
    }

    void m(com.tencent.mm.plugin.appbrand.widget.q qVar);

    boolean n(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    default void o(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
    }

    void p(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    void r(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    void s(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime);

    void t(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Object obj, java.lang.Runnable runnable);
}
