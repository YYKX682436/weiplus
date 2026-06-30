package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f89264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f89265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f89266f;

    public u4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        this.f89266f = appBrandRuntimeContainer;
        this.f89264d = appBrandRuntime;
        this.f89265e = appBrandInitConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer = this.f89266f;
        android.app.Activity w17 = appBrandRuntimeContainer.w();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.appbrand.widget.input.h1.f91462u;
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = (com.tencent.mm.plugin.appbrand.widget.input.h1) w17.findViewById(com.tencent.mm.R.id.a0o);
        if (h1Var != null) {
            h1Var.c();
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = this.f89265e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f89264d;
        if (appBrandRuntime == null) {
            appBrandRuntimeContainer.J(appBrandInitConfig.f77278d);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime L = appBrandRuntimeContainer.L(appBrandInitConfig.f77278d);
        if (L == null) {
            appBrandRuntimeContainer.O(appBrandRuntime, appBrandRuntimeContainer.I(appBrandInitConfig), appBrandInitConfig);
        } else {
            appBrandRuntimeContainer.N(appBrandRuntime, L, appBrandInitConfig);
        }
    }
}
