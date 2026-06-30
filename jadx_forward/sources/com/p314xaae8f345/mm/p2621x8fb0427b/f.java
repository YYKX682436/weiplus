package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    public static vg3.z3 f275427b;

    /* renamed from: a, reason: collision with root package name */
    public final xg3.m0 f275428a;

    public f(xg3.m0 m0Var) {
        this.f275428a = m0Var;
    }

    public void a(xg3.k0 k0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) this.f275428a;
        synchronized (g9Var.f275514g) {
            ((java.util.LinkedList) g9Var.f275514g).add(k0Var);
        }
        g9Var.Jb(k0Var);
    }

    public boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, c01.ea eaVar) {
        return true;
    }

    public void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
    }

    public l75.k0 d() {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) this.f275428a).f275522r;
    }

    public java.lang.String e(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) this.f275428a).X8(str);
    }

    public abstract java.lang.String f(java.lang.String str);

    public void g(l75.k0 k0Var, java.lang.String str) {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) this.f275428a).Na(k0Var, str);
    }
}
