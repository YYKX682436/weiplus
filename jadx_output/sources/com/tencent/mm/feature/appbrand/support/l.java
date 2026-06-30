package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class l implements ft.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f65085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f65086e;

    public l(com.tencent.mm.plugin.appbrand.task.k kVar, com.tencent.mm.feature.appbrand.support.t tVar) {
        this.f65086e = kVar;
        java.util.Collection<com.tencent.luggage.sdk.processes.s> h17 = kVar.h();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(h17, 10));
        for (com.tencent.luggage.sdk.processes.s sVar : h17) {
            kotlin.jvm.internal.o.e(sVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
            tVar.getClass();
            arrayList.add(new com.tencent.mm.feature.appbrand.support.s((com.tencent.mm.plugin.appbrand.task.o) sVar));
        }
        this.f65085d = arrayList;
    }

    @Override // ft.b
    public boolean a() {
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f65086e;
        kVar.j();
        return kVar.l();
    }

    @Override // ft.b
    public void b() {
        this.f65086e.m();
    }

    @Override // ft.b
    /* renamed from: d */
    public ft.d getF65040f() {
        return this.f65086e.f47642c == com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f ? ft.d.WAGAME : ft.d.WASERVICE;
    }

    @Override // ft.b
    public void e() {
        if (!((java.util.ArrayList) this.f65085d).isEmpty()) {
            java.lang.String i17 = this.f65086e.i();
            if (i17 == null) {
                return;
            }
            com.tencent.mm.ipcinvoker.extension.l.a(i17, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.task.u1.class, null);
            return;
        }
        java.lang.String f65038d = getF65038d();
        if (f65038d == null) {
            f65038d = "";
        }
        if (r26.i0.n(f65038d, "appbrand1", false) && com.tencent.mm.plugin.magicbrush.a5.f147838c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
        } else {
            b();
        }
    }

    @Override // ft.b
    /* renamed from: f */
    public java.lang.String getF65038d() {
        return this.f65086e.i();
    }

    @Override // ft.b
    /* renamed from: g */
    public java.util.List getF65039e() {
        return this.f65085d;
    }

    @Override // ft.b
    public boolean h() {
        return this.f65086e.f89082m;
    }
}
