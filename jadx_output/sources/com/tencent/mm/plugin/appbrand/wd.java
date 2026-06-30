package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class wd implements com.tencent.mm.plugin.appbrand.sd {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f90957a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.wc f90958b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.vc f90959c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.td f90960d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f90961e;

    public wd(com.tencent.mm.plugin.appbrand.AppBrandRuntime hostRuntime, com.tencent.mm.plugin.appbrand.wc originResumeFn, com.tencent.mm.plugin.appbrand.vc originPauseFn) {
        kotlin.jvm.internal.o.g(hostRuntime, "hostRuntime");
        kotlin.jvm.internal.o.g(originResumeFn, "originResumeFn");
        kotlin.jvm.internal.o.g(originPauseFn, "originPauseFn");
        this.f90957a = hostRuntime;
        this.f90958b = originResumeFn;
        this.f90959c = originPauseFn;
        this.f90961e = jz5.h.b(new com.tencent.mm.plugin.appbrand.vd(this));
    }

    public final void a(com.tencent.mm.plugin.appbrand.td tdVar) {
        if (tdVar != null) {
            com.tencent.mm.plugin.appbrand.td tdVar2 = this.f90960d;
            if (tdVar2 != null && tdVar2.compareTo(tdVar) == 0) {
                com.tencent.mars.xlog.Log.i("Luggage.Wxa.RuntimeEmbeddingPageHostImpl", "detachEmbeddingPage for host:" + this.f90957a + ", embeddingPage:" + tdVar);
                this.f90960d = null;
                tdVar.mo133getLifecycle().c((androidx.lifecycle.v) ((jz5.n) this.f90961e).getValue());
                tdVar.Q5(this);
            }
        }
    }
}
