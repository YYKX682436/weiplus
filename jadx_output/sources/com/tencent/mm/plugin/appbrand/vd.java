package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.wd f90859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.appbrand.wd wdVar) {
        super(0);
        this.f90859d = wdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.appbrand.wd wdVar = this.f90859d;
        return new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.appbrand.RuntimeEmbeddingPageHostImpl$onEmbeddingPageLifecycleStateChanged$2$1
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y yVar, androidx.lifecycle.m event) {
                kotlin.jvm.internal.o.g(yVar, "<anonymous parameter 0>");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "receive lifecycle event(" + event + ") for host:" + com.tencent.mm.plugin.appbrand.wd.this.f90957a + " from embeddingPage:" + com.tencent.mm.plugin.appbrand.wd.this.f90960d);
                int i17 = com.tencent.mm.plugin.appbrand.ud.f89279a[event.ordinal()];
                if (i17 == 1) {
                    com.tencent.mm.plugin.appbrand.wd wdVar2 = com.tencent.mm.plugin.appbrand.wd.this;
                    if (wdVar2.f90957a.V) {
                        return;
                    }
                    ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$o) wdVar2.f90958b).f74836a.j0();
                    return;
                }
                if (i17 != 2) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.wd wdVar3 = com.tencent.mm.plugin.appbrand.wd.this;
                if (wdVar3.f90957a.V) {
                    com.tencent.mm.plugin.appbrand.td tdVar = wdVar3.f90960d;
                    kotlin.jvm.internal.o.d(tdVar);
                    com.tencent.mm.plugin.appbrand.w0 Cf = tdVar.Cf();
                    if (Cf != null) {
                        com.tencent.mm.plugin.appbrand.x0.g(com.tencent.mm.plugin.appbrand.wd.this.f90957a.f74803n, Cf);
                    }
                    ((com.tencent.mm.plugin.appbrand.AppBrandRuntime$$p) com.tencent.mm.plugin.appbrand.wd.this.f90959c).f74837a.g0(false);
                }
            }
        };
    }
}
