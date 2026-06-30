package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class p8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.a3 f166429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 f166430b;

    public p8(k91.a3 a3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r8 r8Var) {
        this.f166429a = a3Var;
        this.f166430b = r8Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, int i17, java.lang.String str) {
        k91.a3 a3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.lang.String moduleName = request.f166385e;
        if ((moduleName == null || moduleName.length() == 0) || (a3Var = this.f166429a) == null) {
            return;
        }
        java.lang.String appId = this.f166430b.f166639d;
        k91.u0 u0Var = (k91.u0) a3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        k91.r0 Bi = u0Var.Bi(appId);
        java.util.Map map = Bi.f387290a;
        java.lang.Object obj = map.get(moduleName);
        if (obj == null) {
            obj = new k91.m0(false, 0.0f, null, 7, null);
            map.put(moduleName, obj);
        }
        k91.x0[] x0VarArr = k91.x0.f387348d;
        java.util.Map map2 = ((k91.m0) obj).f387207c;
        java.lang.Object obj2 = map2.get(2);
        if (obj2 == null) {
            obj2 = new k91.q0(false, 0L, 3, null);
            map2.put(2, obj2);
        }
        k91.q0 q0Var = (k91.q0) obj2;
        q0Var.f387262a = true;
        q0Var.f387263b = java.lang.System.currentTimeMillis();
        u0Var.Ri(appId, Bi);
    }
}
