package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class y8 implements com.p176xb6135e39.p283xc50a8b8b.q9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.o8 f127275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.qa f127276b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f127277c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.u4 f127278d;

    public y8(com.p176xb6135e39.p283xc50a8b8b.qa qaVar, com.p176xb6135e39.p283xc50a8b8b.u4 u4Var, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        this.f127276b = qaVar;
        this.f127277c = u4Var.e(o8Var);
        this.f127278d = u4Var;
        this.f127275a = o8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public void a(java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.s9.y(this.f127276b, obj, obj2);
        if (this.f127277c) {
            com.p176xb6135e39.p283xc50a8b8b.u4 u4Var = this.f127278d;
            com.p176xb6135e39.p283xc50a8b8b.b5 c17 = u4Var.c(obj2);
            if (c17.f126454a.isEmpty()) {
                return;
            }
            u4Var.d(obj).t(c17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public void b(java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.bc bcVar) {
        java.util.Iterator r17 = this.f127278d.c(obj).r();
        while (r17.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) r17.next();
            com.p176xb6135e39.p283xc50a8b8b.a5 a5Var = (com.p176xb6135e39.p283xc50a8b8b.a5) entry.getKey();
            if (a5Var.u0() != com.p176xb6135e39.p283xc50a8b8b.vb.MESSAGE || a5Var.d1() || a5Var.C1()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.p176xb6135e39.p283xc50a8b8b.b7) {
                a5Var.mo20553x276ffe3f();
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((com.p176xb6135e39.p283xc50a8b8b.b7) entry).f126459d.getValue());
                throw null;
            }
            ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).l(a5Var.mo20553x276ffe3f(), entry.getValue());
        }
        ((com.p176xb6135e39.p283xc50a8b8b.ya) this.f127276b).getClass();
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = ((com.p176xb6135e39.p283xc50a8b8b.n5) obj).f7877x4f0c37a3;
        xaVar.getClass();
        bcVar.getClass();
        for (int i17 = 0; i17 < xaVar.f127240a; i17++) {
            ((com.p176xb6135e39.p283xc50a8b8b.l0) bcVar).l(xaVar.f127241b[i17] >>> 3, xaVar.f127242c[i17]);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public final boolean c(java.lang.Object obj) {
        return this.f127278d.c(obj).o();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public void d(java.lang.Object obj, byte[] bArr, int i17, int i18, com.p176xb6135e39.p283xc50a8b8b.j jVar) {
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = (com.p176xb6135e39.p283xc50a8b8b.n5) obj;
        if (n5Var.f7877x4f0c37a3 == com.p176xb6135e39.p283xc50a8b8b.xa.f127239f) {
            n5Var.f7877x4f0c37a3 = new com.p176xb6135e39.p283xc50a8b8b.xa();
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public void e(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.ya) this.f127276b).getClass();
        ((com.p176xb6135e39.p283xc50a8b8b.n5) obj).f7877x4f0c37a3.f127244e = false;
        this.f127278d.f(obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    /* renamed from: equals */
    public boolean mo20886xb2c87fbf(java.lang.Object obj, java.lang.Object obj2) {
        com.p176xb6135e39.p283xc50a8b8b.qa qaVar = this.f127276b;
        ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = ((com.p176xb6135e39.p283xc50a8b8b.n5) obj).f7877x4f0c37a3;
        ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
        if (!xaVar.m20953xb2c87fbf(((com.p176xb6135e39.p283xc50a8b8b.n5) obj2).f7877x4f0c37a3)) {
            return false;
        }
        if (!this.f127277c) {
            return true;
        }
        com.p176xb6135e39.p283xc50a8b8b.u4 u4Var = this.f127278d;
        return u4Var.c(obj).m20573xb2c87fbf(u4Var.c(obj2));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public int f(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.ya) this.f127276b).getClass();
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = ((com.p176xb6135e39.p283xc50a8b8b.n5) obj).f7877x4f0c37a3;
        int i17 = xaVar.f127243d;
        if (i17 == -1) {
            i17 = 0;
            for (int i18 = 0; i18 < xaVar.f127240a; i18++) {
                i17 += (com.p176xb6135e39.p283xc50a8b8b.k0.p(1) * 2) + com.p176xb6135e39.p283xc50a8b8b.k0.q(2, xaVar.f127241b[i18] >>> 3) + com.p176xb6135e39.p283xc50a8b8b.k0.c(3, (com.p176xb6135e39.p283xc50a8b8b.y) xaVar.f127242c[i18]);
            }
            xaVar.f127243d = i17;
        }
        int i19 = i17 + 0;
        return this.f127277c ? i19 + this.f127278d.c(obj).k() : i19;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public java.lang.Object g() {
        return this.f127275a.mo20596xab31548().mo20557x85702333();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    public void h(java.lang.Object obj, com.p176xb6135e39.p283xc50a8b8b.l9 l9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.qa qaVar = this.f127276b;
        ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
        com.p176xb6135e39.p283xc50a8b8b.n5 n5Var = (com.p176xb6135e39.p283xc50a8b8b.n5) obj;
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar = n5Var.f7877x4f0c37a3;
        if (xaVar == com.p176xb6135e39.p283xc50a8b8b.xa.f127239f) {
            xaVar = new com.p176xb6135e39.p283xc50a8b8b.xa();
            n5Var.f7877x4f0c37a3 = xaVar;
        }
        com.p176xb6135e39.p283xc50a8b8b.xa xaVar2 = xaVar;
        com.p176xb6135e39.p283xc50a8b8b.u4 u4Var = this.f127278d;
        com.p176xb6135e39.p283xc50a8b8b.b5 d17 = u4Var.d(obj);
        do {
            try {
                if (l9Var.o() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                qaVar.c(obj, xaVar2);
            }
        } while (i(l9Var, t4Var, u4Var, d17, qaVar, xaVar2));
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q9
    /* renamed from: hashCode */
    public int mo20887x8cdac1b(java.lang.Object obj) {
        ((com.p176xb6135e39.p283xc50a8b8b.ya) this.f127276b).getClass();
        int m20954x8cdac1b = ((com.p176xb6135e39.p283xc50a8b8b.n5) obj).f7877x4f0c37a3.m20954x8cdac1b();
        return this.f127277c ? (m20954x8cdac1b * 53) + this.f127278d.c(obj).m20574x8cdac1b() : m20954x8cdac1b;
    }

    public final boolean i(com.p176xb6135e39.p283xc50a8b8b.l9 l9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p176xb6135e39.p283xc50a8b8b.u4 u4Var, com.p176xb6135e39.p283xc50a8b8b.b5 b5Var, com.p176xb6135e39.p283xc50a8b8b.qa qaVar, java.lang.Object obj) {
        int mo20625xb5887064 = l9Var.mo20625xb5887064();
        com.p176xb6135e39.p283xc50a8b8b.o8 o8Var = this.f127275a;
        if (mo20625xb5887064 != 11) {
            if ((mo20625xb5887064 & 7) != 2) {
                return l9Var.r();
            }
            java.lang.Object b17 = u4Var.b(t4Var, o8Var, mo20625xb5887064 >>> 3);
            if (b17 == null) {
                return qaVar.a(obj, l9Var);
            }
            u4Var.h(l9Var, b17, t4Var, b5Var);
            return true;
        }
        java.lang.Object obj2 = null;
        int i17 = 0;
        com.p176xb6135e39.p283xc50a8b8b.y yVar = null;
        while (l9Var.o() != Integer.MAX_VALUE) {
            int mo20625xb58870642 = l9Var.mo20625xb5887064();
            if (mo20625xb58870642 == 16) {
                i17 = l9Var.c();
                obj2 = u4Var.b(t4Var, o8Var, i17);
            } else if (mo20625xb58870642 == 26) {
                if (obj2 != null) {
                    u4Var.h(l9Var, obj2, t4Var, b5Var);
                } else {
                    yVar = l9Var.h();
                }
            } else if (!l9Var.r()) {
                break;
            }
        }
        if (l9Var.mo20625xb5887064() != 12) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.a();
        }
        if (yVar != null) {
            if (obj2 != null) {
                u4Var.i(yVar, obj2, t4Var, b5Var);
            } else {
                ((com.p176xb6135e39.p283xc50a8b8b.ya) qaVar).getClass();
                ((com.p176xb6135e39.p283xc50a8b8b.xa) obj).d((i17 << 3) | 2, yVar);
            }
        }
        return true;
    }
}
