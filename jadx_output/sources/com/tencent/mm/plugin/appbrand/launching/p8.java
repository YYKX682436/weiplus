package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class p8 implements com.tencent.mm.plugin.appbrand.launching.k3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.a3 f84896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r8 f84897b;

    public p8(k91.a3 a3Var, com.tencent.mm.plugin.appbrand.launching.r8 r8Var) {
        this.f84896a = a3Var;
        this.f84897b = r8Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.k6
    public void a(com.tencent.mm.plugin.appbrand.launching.o6 request, int i17, java.lang.String str) {
        k91.a3 a3Var;
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.String moduleName = request.f84852e;
        if ((moduleName == null || moduleName.length() == 0) || (a3Var = this.f84896a) == null) {
            return;
        }
        java.lang.String appId = this.f84897b.f85106d;
        k91.u0 u0Var = (k91.u0) a3Var;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        k91.r0 Bi = u0Var.Bi(appId);
        java.util.Map map = Bi.f305757a;
        java.lang.Object obj = map.get(moduleName);
        if (obj == null) {
            obj = new k91.m0(false, 0.0f, null, 7, null);
            map.put(moduleName, obj);
        }
        k91.x0[] x0VarArr = k91.x0.f305815d;
        java.util.Map map2 = ((k91.m0) obj).f305674c;
        java.lang.Object obj2 = map2.get(2);
        if (obj2 == null) {
            obj2 = new k91.q0(false, 0L, 3, null);
            map2.put(2, obj2);
        }
        k91.q0 q0Var = (k91.q0) obj2;
        q0Var.f305729a = true;
        q0Var.f305730b = java.lang.System.currentTimeMillis();
        u0Var.Ri(appId, Bi);
    }
}
