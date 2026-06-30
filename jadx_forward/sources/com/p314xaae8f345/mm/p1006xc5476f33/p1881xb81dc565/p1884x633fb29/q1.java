package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class q1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231614d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var) {
        this.f231614d = v0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231614d;
        if (v0Var.F == null) {
            v0Var.G = 0L;
            v0Var.f231715x0.d();
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            v0Var.G(v0Var.F);
            v0Var.F = null;
            v0Var.G = 0L;
            v0Var.f231715x0.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 7L, 1L, false);
            return false;
        }
        if (java.lang.System.currentTimeMillis() - v0Var.G < 60000) {
            return true;
        }
        v0Var.F = null;
        v0Var.G = 0L;
        v0Var.f231715x0.d();
        return false;
    }
}
