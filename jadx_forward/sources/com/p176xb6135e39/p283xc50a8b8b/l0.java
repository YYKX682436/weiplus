package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class l0 implements com.p176xb6135e39.p283xc50a8b8b.bc {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.k0 f126806a;

    public l0(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        if (k0Var == null) {
            throw new java.lang.NullPointerException("output");
        }
        this.f126806a = k0Var;
        k0Var.f126781a = this;
    }

    public void a(int i17, boolean z17) {
        this.f126806a.x(i17, z17);
    }

    public void b(int i17, com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        this.f126806a.z(i17, yVar);
    }

    public void c(int i17, double d17) {
        this.f126806a.B(i17, d17);
    }

    public void d(int i17) {
        this.f126806a.Q(i17, 4);
    }

    public void e(int i17, int i18) {
        this.f126806a.C(i17, i18);
    }

    public void f(int i17, long j17) {
        this.f126806a.E(i17, j17);
    }

    public void g(int i17, float f17) {
        this.f126806a.G(i17, f17);
    }

    public void h(int i17, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = this.f126806a;
        k0Var.Q(i17, 3);
        q9Var.b((com.p176xb6135e39.p283xc50a8b8b.o8) obj, k0Var.f126781a);
        k0Var.Q(i17, 4);
    }

    public void i(int i17, int i18) {
        this.f126806a.H(i17, i18);
    }

    public void j(int i17, long j17) {
        this.f126806a.T(i17, j17);
    }

    public void k(int i17, java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var) {
        this.f126806a.K(i17, (com.p176xb6135e39.p283xc50a8b8b.o8) obj, q9Var);
    }

    public final void l(int i17, java.lang.Object obj) {
        boolean z17 = obj instanceof com.p176xb6135e39.p283xc50a8b8b.y;
        com.p176xb6135e39.p283xc50a8b8b.k0 k0Var = this.f126806a;
        if (z17) {
            k0Var.N(i17, (com.p176xb6135e39.p283xc50a8b8b.y) obj);
        } else {
            k0Var.M(i17, (com.p176xb6135e39.p283xc50a8b8b.o8) obj);
        }
    }

    public void m(int i17, int i18) {
        this.f126806a.C(i17, i18);
    }

    public void n(int i17, long j17) {
        this.f126806a.E(i17, j17);
    }

    public void o(int i17, int i18) {
        this.f126806a.R(i17, (i18 >> 31) ^ (i18 << 1));
    }

    public void p(int i17, long j17) {
        this.f126806a.T(i17, (j17 >> 63) ^ (j17 << 1));
    }

    public void q(int i17) {
        this.f126806a.Q(i17, 3);
    }

    public void r(int i17, int i18) {
        this.f126806a.R(i17, i18);
    }

    public void s(int i17, long j17) {
        this.f126806a.T(i17, j17);
    }
}
