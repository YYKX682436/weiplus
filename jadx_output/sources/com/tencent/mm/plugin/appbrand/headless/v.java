package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f78312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.y f78313f;

    public v(com.tencent.mm.plugin.appbrand.o6 o6Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.appbrand.headless.y yVar) {
        this.f78311d = o6Var;
        this.f78312e = c0Var;
        this.f78313f = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78311d;
        com.tencent.mm.plugin.appbrand.headless.t tVar = new com.tencent.mm.plugin.appbrand.headless.t(o6Var);
        if (o6Var != null) {
            com.tencent.mm.plugin.appbrand.w8 w8Var = new com.tencent.mm.plugin.appbrand.w8(tVar);
            if (o6Var.T) {
                w8Var.a();
            } else {
                o6Var.G.add(w8Var);
            }
        }
        com.tencent.mm.plugin.appbrand.headless.y.a(o6Var, this.f78313f, new com.tencent.mm.plugin.appbrand.headless.u(this.f78312e));
    }
}
