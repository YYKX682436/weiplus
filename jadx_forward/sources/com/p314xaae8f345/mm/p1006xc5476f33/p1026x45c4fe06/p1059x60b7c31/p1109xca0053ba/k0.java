package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba;

/* loaded from: classes13.dex */
public class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f164555d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f164556a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2 f164557b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f164558c;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.h0 h0Var) {
        int ua6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0.f164536e.ua();
        f164555d = ua6;
        this.f164558c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.h0(this);
        this.f164557b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k2(ua6, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.i0(this));
    }

    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        boolean isEmpty;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0 f0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.f0.f164536e;
        if (f0Var.W4()) {
            if (n5Var == null || lVar == null || !f0Var.sa(lVar, n5Var)) {
                return false;
            }
            n5Var.k();
            n5Var.m();
            return true;
        }
        if (n5Var == null || lVar == null || !f0Var.sa(lVar, n5Var)) {
            return false;
        }
        synchronized (this.f164556a) {
            isEmpty = this.f164556a.isEmpty();
            if (this.f164556a.isEmpty()) {
                ((java.util.LinkedList) this.f164556a).add(n5Var);
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5) ((java.util.LinkedList) this.f164556a).get(0)).equals(n5Var)) {
                ((java.util.LinkedList) this.f164556a).add(0, n5Var);
                ((java.util.LinkedList) this.f164556a).remove(1);
            } else {
                ((java.util.LinkedList) this.f164556a).remove(n5Var);
                ((java.util.LinkedList) this.f164556a).add(n5Var);
            }
        }
        if (!isEmpty || this.f164557b.a(new java.lang.Object[0])) {
            return true;
        }
        n5Var.k();
        ik1.h0.a().b(this.f164558c, f164555d);
        return true;
    }
}
