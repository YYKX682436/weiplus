package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class y5 extends jj.f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.y5 f92411a = new com.tencent.mm.plugin.appbrand.y5();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f92412b = new com.tencent.mm.sdk.platformtools.n3("AppBrandRuntimeInitUiThreadLagDetector");

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f92413c = jz5.h.b(com.tencent.mm.plugin.appbrand.w5.f90947d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f92414d = jz5.h.b(com.tencent.mm.plugin.appbrand.v5.f90645d);

    /* renamed from: e, reason: collision with root package name */
    public static final x.d f92415e = new x.d(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f92416f = com.tencent.mm.plugin.appbrand.x5.f92376d;

    public final void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        if (((java.lang.Boolean) ((jz5.n) f92414d).getValue()).booleanValue()) {
            x.d dVar = f92415e;
            dVar.remove(rt6);
            if (dVar.f450816f == 0) {
                gj.o oVar = gj.o.f272367n;
                if (oVar.f272374m) {
                    synchronized (oVar.f272369e) {
                        oVar.f272369e.remove(this);
                        if (oVar.f272369e.isEmpty()) {
                            oVar.f();
                        }
                    }
                }
            }
        }
    }
}
