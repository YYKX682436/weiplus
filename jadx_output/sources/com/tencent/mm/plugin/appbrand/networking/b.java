package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.networking.b f86072a = new com.tencent.mm.plugin.appbrand.networking.b();

    public final void a(r45.xw xwVar) {
        kotlin.jvm.internal.o.g(xwVar, "<this>");
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.network.s sVar = r1Var != null ? r1Var.f70764d : null;
        if (sVar == null) {
            throw new iz5.b("dispatch is null");
        }
        long L = sVar.L();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - L;
        xwVar.f390537d += currentTimeMillis;
        xwVar.f390538e += currentTimeMillis;
        xwVar.f390539f += currentTimeMillis;
        xwVar.f390540g += currentTimeMillis;
        xwVar.f390541h += currentTimeMillis;
        xwVar.f390543m += currentTimeMillis;
        xwVar.f390544n += currentTimeMillis;
        xwVar.f390547q += currentTimeMillis;
    }
}
