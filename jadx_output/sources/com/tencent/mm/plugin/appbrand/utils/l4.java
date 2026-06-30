package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class l4 implements com.tencent.mm.plugin.appbrand.sc {

    /* renamed from: a, reason: collision with root package name */
    public boolean f90504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.o4 f90505b;

    public l4(com.tencent.mm.plugin.appbrand.utils.o4 o4Var) {
        this.f90505b = o4Var;
        com.tencent.mm.plugin.appbrand.hc hcVar = o4Var.f90523a.f74796e;
        if (hcVar != null) {
            b(hcVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.sc
    public void a() {
    }

    @Override // com.tencent.mm.plugin.appbrand.sc
    public void b(com.tencent.mm.plugin.appbrand.hc container) {
        kotlin.jvm.internal.o.g(container, "container");
        if (this.f90504a) {
            return;
        }
        com.tencent.mm.plugin.appbrand.utils.o4 o4Var = this.f90505b;
        com.tencent.mars.xlog.Log.i(o4Var.f90524b, "onAttachedToRuntimeContainer, first blood");
        o4Var.a();
        this.f90504a = true;
    }
}
