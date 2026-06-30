package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class m implements ft.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f65090d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f65091e = new java.util.LinkedList();

    @Override // ft.b
    public boolean a() {
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(this.f65090d);
        kVar.j();
        return kVar.l();
    }

    @Override // ft.b
    public void b() {
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.task.k> linkedList = this.f65090d;
        ((com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(linkedList)).m();
        for (com.tencent.mm.plugin.appbrand.task.k kVar : linkedList) {
            kVar.getClass();
            kVar.f47642c = com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g;
            kVar.a();
            kVar.j();
            kVar.f89083n = false;
        }
    }

    @Override // ft.b
    /* renamed from: d */
    public ft.d getF65040f() {
        return kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.task.z0.f89222n, getF65038d()) ? ft.d.WASERVICE : ft.d.WAGAME;
    }

    @Override // ft.b
    public void e() {
        if (!this.f65091e.isEmpty()) {
            java.lang.String i17 = ((com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(this.f65090d)).i();
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
        return ((com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(this.f65090d)).i();
    }

    @Override // ft.b
    /* renamed from: g */
    public java.util.List getF65039e() {
        return this.f65091e;
    }

    @Override // ft.b
    public boolean h() {
        java.util.LinkedList linkedList = this.f65090d;
        if ((linkedList instanceof java.util.Collection) && linkedList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.appbrand.task.k) it.next()).f89082m) {
                return true;
            }
        }
        return false;
    }
}
