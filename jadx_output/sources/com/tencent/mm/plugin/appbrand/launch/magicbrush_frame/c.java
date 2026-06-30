package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class c extends ng1.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84261d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f84262e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84263f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f84264g;

    public c(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams launchParams) {
        kotlin.jvm.internal.o.g(launchParams, "launchParams");
        this.f84261d = launchParams;
        com.tencent.mm.plugin.appbrand.report.l2 l2Var = com.tencent.mm.plugin.appbrand.report.l2.f87911b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f84262e = l2Var.b(java.lang.System.currentTimeMillis());
        l2Var.a();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1255;
        this.f84263f = appBrandStatObject;
        this.f84264g = jz5.h.b(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.b(this));
    }
}
