package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k {

    /* renamed from: a, reason: collision with root package name */
    public final si1.g f173896a;

    /* renamed from: b, reason: collision with root package name */
    public final u81.h f173897b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f173898c;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, si1.g gVar) {
        java.util.Objects.requireNonNull(lVar);
        this.f173898c = lVar;
        java.util.Objects.requireNonNull(gVar);
        this.f173896a = gVar;
        u81.h hVar = c11510xdd90c2f2.N;
        java.util.Objects.requireNonNull(hVar);
        this.f173897b = hVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar) {
        try {
            e(n5Var, c0Var, jVar);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandComponentInterceptor", e17, "onDispatchImpl %s", n5Var.k());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar) {
        si1.j b17 = this.f173896a.b(this.f173898c, k0Var, str, str2, i17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w(this, jVar, k0Var, str, str2, i17));
        int i18 = b17.f489803a;
        if (-2 == i18) {
            return true;
        }
        if (i18 == 0) {
            return false;
        }
        jVar.b(k0Var.r(b17.f489804b, b17.f489805c, null));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k
    public void d(int i17, java.lang.String str) {
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j jVar) {
        u81.h hVar = this.f173897b;
        if (hVar.f506965a.f506960y.get()) {
            jVar.b("fail:interrupted");
            return;
        }
        java.lang.String k17 = n5Var.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f173898c;
        boolean c17 = lVar.c(k17, c0Var);
        boolean z17 = true;
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentInterceptor", "onDispatch, event[%s], appId[%s], envStopped", n5Var.k(), lVar.mo48798x74292566());
            jVar.b("fail:interrupted");
            return;
        }
        u81.b b17 = hVar.b();
        boolean a17 = this.f173896a.a(lVar, n5Var.getClass());
        boolean z18 = u81.b.SUSPEND == b17 || a17;
        si1.r0 r0Var = si1.q0.f489818a;
        if (r0Var != null && r0Var.N4(n5Var)) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandComponentInterceptor", "dispatchToService, canSend %B, event %s, state %s, hasPermission %b", java.lang.Boolean.valueOf(z18), n5Var.k(), b17, java.lang.Boolean.valueOf(a17));
            if (z65.c.a()) {
                if (n5Var.k().equals(ud1.a.f76953x24728b)) {
                    n5Var.k();
                    n5Var.o().getClass();
                } else {
                    n5Var.k();
                    n5Var.o();
                }
            }
        }
        if (z18) {
            jVar.a();
        } else {
            jVar.b("fail:access denied");
        }
    }

    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
    }
}
