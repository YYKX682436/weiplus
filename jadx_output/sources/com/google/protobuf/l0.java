package com.google.protobuf;

/* loaded from: classes16.dex */
public final class l0 implements com.google.protobuf.bc {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.k0 f45273a;

    public l0(com.google.protobuf.k0 k0Var) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        if (k0Var == null) {
            throw new java.lang.NullPointerException("output");
        }
        this.f45273a = k0Var;
        k0Var.f45248a = this;
    }

    public void a(int i17, boolean z17) {
        this.f45273a.x(i17, z17);
    }

    public void b(int i17, com.google.protobuf.y yVar) {
        this.f45273a.z(i17, yVar);
    }

    public void c(int i17, double d17) {
        this.f45273a.B(i17, d17);
    }

    public void d(int i17) {
        this.f45273a.Q(i17, 4);
    }

    public void e(int i17, int i18) {
        this.f45273a.C(i17, i18);
    }

    public void f(int i17, long j17) {
        this.f45273a.E(i17, j17);
    }

    public void g(int i17, float f17) {
        this.f45273a.G(i17, f17);
    }

    public void h(int i17, java.lang.Object obj, com.google.protobuf.q9 q9Var) {
        com.google.protobuf.k0 k0Var = this.f45273a;
        k0Var.Q(i17, 3);
        q9Var.b((com.google.protobuf.o8) obj, k0Var.f45248a);
        k0Var.Q(i17, 4);
    }

    public void i(int i17, int i18) {
        this.f45273a.H(i17, i18);
    }

    public void j(int i17, long j17) {
        this.f45273a.T(i17, j17);
    }

    public void k(int i17, java.lang.Object obj, com.google.protobuf.q9 q9Var) {
        this.f45273a.K(i17, (com.google.protobuf.o8) obj, q9Var);
    }

    public final void l(int i17, java.lang.Object obj) {
        boolean z17 = obj instanceof com.google.protobuf.y;
        com.google.protobuf.k0 k0Var = this.f45273a;
        if (z17) {
            k0Var.N(i17, (com.google.protobuf.y) obj);
        } else {
            k0Var.M(i17, (com.google.protobuf.o8) obj);
        }
    }

    public void m(int i17, int i18) {
        this.f45273a.C(i17, i18);
    }

    public void n(int i17, long j17) {
        this.f45273a.E(i17, j17);
    }

    public void o(int i17, int i18) {
        this.f45273a.R(i17, (i18 >> 31) ^ (i18 << 1));
    }

    public void p(int i17, long j17) {
        this.f45273a.T(i17, (j17 >> 63) ^ (j17 << 1));
    }

    public void q(int i17) {
        this.f45273a.Q(i17, 3);
    }

    public void r(int i17, int i18) {
        this.f45273a.R(i17, i18);
    }

    public void s(int i17, long j17) {
        this.f45273a.T(i17, j17);
    }
}
