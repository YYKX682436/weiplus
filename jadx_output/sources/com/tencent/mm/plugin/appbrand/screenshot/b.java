package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.e f88467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.appbrand.screenshot.e eVar) {
        super(0);
        this.f88467d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(this.f88467d), "<init>");
        u81.b bVar = u81.b.FOREGROUND;
        u81.h hVar = this.f88467d.f88474a.N;
        if (bVar == (hVar != null ? hVar.b() : null)) {
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(this.f88467d), "<init>, isForegroundNow, startWatching");
            com.tencent.mm.plugin.appbrand.screenshot.t1 t1Var = this.f88467d.f88477d;
            com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var = t1Var.f88564a;
            if (s1Var != null) {
                s1Var.startWatching();
            }
            com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var2 = t1Var.f88565b;
            if (s1Var2 != null) {
                s1Var2.startWatching();
            }
        }
        com.tencent.mm.plugin.appbrand.x0.a(this.f88467d.f88474a.f74803n, new com.tencent.mm.plugin.appbrand.screenshot.a(this.f88467d));
        return jz5.f0.f302826a;
    }
}
