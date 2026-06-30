package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f88586a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f88587b = "";

    public final void a(android.content.Context context, com.tencent.mm.plugin.appbrand.o6 appBrandRuntimeWC) {
        kotlin.jvm.internal.o.g(appBrandRuntimeWC, "appBrandRuntimeWC");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "registerScreenShotShareContentProvider: appId=" + appBrandRuntimeWC.f74803n);
        ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(new com.tencent.mm.plugin.appbrand.screenshot.v(appBrandRuntimeWC, appBrandRuntimeWC.u0().f47284z == 7, context, this));
    }
}
