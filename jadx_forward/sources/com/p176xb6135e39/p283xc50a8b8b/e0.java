package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class e0 implements com.p176xb6135e39.p283xc50a8b8b.l9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d0 f126565a;

    /* renamed from: b, reason: collision with root package name */
    public int f126566b;

    /* renamed from: c, reason: collision with root package name */
    public int f126567c;

    /* renamed from: d, reason: collision with root package name */
    public int f126568d = 0;

    public e0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        if (d0Var == null) {
            throw new java.lang.NullPointerException("input");
        }
        this.f126565a = d0Var;
        d0Var.f126527d = this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void A(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.l7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Long.valueOf(d0Var.H()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(d0Var.H()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                l7Var.e(d0Var.H());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            l7Var.e(d0Var.H());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void B(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.l7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Long.valueOf(d0Var.u()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(d0Var.u()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                l7Var.e(d0Var.u());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            l7Var.e(d0Var.u());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void C(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.o()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.o()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                m6Var.e(d0Var.o());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            m6Var.e(d0Var.o());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object D(java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        U(3);
        return Q(com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(cls), t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void E(java.util.List list) {
        S(list, true);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int F() {
        U(0);
        return this.f126565a.t();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void G(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.l7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int G = d0Var.G();
                W(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Long.valueOf(d0Var.q()));
                } while (d0Var.e() < e17);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(d0Var.q()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i18 = this.f126566b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int G2 = d0Var.G();
            W(G2);
            int e18 = d0Var.e() + G2;
            do {
                l7Var.e(d0Var.q());
            } while (d0Var.e() < e18);
            return;
        }
        do {
            l7Var.e(d0Var.q());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void H(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.G()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.G()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                m6Var.e(d0Var.G());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            m6Var.e(d0Var.G());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object I(java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        U(2);
        return R(com.p176xb6135e39.p283xc50a8b8b.h9.f126699c.a(cls), t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int J() {
        U(5);
        return this.f126565a.p();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long K() {
        U(0);
        return this.f126565a.C();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.String L() {
        U(2);
        return this.f126565a.D();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object M(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        U(2);
        return R(q9Var, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int N() {
        U(5);
        return this.f126565a.z();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.String O() {
        U(2);
        return this.f126565a.E();
    }

    public final java.lang.Object P(com.p176xb6135e39.p283xc50a8b8b.ub ubVar, java.lang.Class cls, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        switch (ubVar.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(mo20626xc851b907());
            case 1:
                return java.lang.Float.valueOf(mo20627xbc3e6666());
            case 2:
                return java.lang.Long.valueOf(u());
            case 3:
                return java.lang.Long.valueOf(j());
            case 4:
                return java.lang.Integer.valueOf(F());
            case 5:
                return java.lang.Long.valueOf(v());
            case 6:
                return java.lang.Integer.valueOf(J());
            case 7:
                return java.lang.Boolean.valueOf(y());
            case 8:
                return O();
            case 9:
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
            case 10:
                return I(cls, t4Var);
            case 11:
                return h();
            case 12:
                return java.lang.Integer.valueOf(c());
            case 13:
                return java.lang.Integer.valueOf(d());
            case 14:
                return java.lang.Integer.valueOf(N());
            case 15:
                return java.lang.Long.valueOf(b());
            case 16:
                return java.lang.Integer.valueOf(e());
            case 17:
                return java.lang.Long.valueOf(K());
        }
    }

    public final java.lang.Object Q(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int i17 = this.f126567c;
        this.f126567c = ((this.f126566b >>> 3) << 3) | 4;
        try {
            java.lang.Object g17 = q9Var.g();
            q9Var.h(g17, this, t4Var);
            q9Var.e(g17);
            if (this.f126566b == this.f126567c) {
                return g17;
            }
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        } finally {
            this.f126567c = i17;
        }
    }

    public final java.lang.Object R(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        int G = d0Var.G();
        if (d0Var.f126524a >= d0Var.f126525b) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.h();
        }
        int k17 = d0Var.k(G);
        java.lang.Object g17 = q9Var.g();
        d0Var.f126524a++;
        q9Var.h(g17, this, t4Var);
        q9Var.e(g17);
        d0Var.a(0);
        d0Var.f126524a--;
        d0Var.j(k17);
        return g17;
    }

    public void S(java.util.List list, boolean z17) {
        int F;
        int F2;
        if ((this.f126566b & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        boolean z18 = list instanceof com.p176xb6135e39.p283xc50a8b8b.g7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z18 || z17) {
            do {
                list.add(z17 ? O() : L());
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = (com.p176xb6135e39.p283xc50a8b8b.g7) list;
        do {
            g7Var.q(h());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    public final void T(int i17) {
        if (this.f126565a.e() != i17) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
        }
    }

    public final void U(int i17) {
        if ((this.f126566b & 7) != i17) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
    }

    public final void V(int i17) {
        if ((i17 & 3) != 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        }
    }

    public final void W(int i17) {
        if ((i17 & 7) != 0) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.g();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void a(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.l7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Long.valueOf(d0Var.C()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(d0Var.C()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                l7Var.e(d0Var.C());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            l7Var.e(d0Var.C());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long b() {
        U(1);
        return this.f126565a.A();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int c() {
        U(0);
        return this.f126565a.G();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int d() {
        U(0);
        return this.f126565a.o();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int e() {
        U(0);
        return this.f126565a.B();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void f(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.o;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Boolean.valueOf(d0Var.l()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Boolean.valueOf(d0Var.l()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.o oVar = (com.p176xb6135e39.p283xc50a8b8b.o) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                oVar.e(d0Var.l());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            oVar.e(d0Var.l());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        return;
     */
    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.util.Map r10, com.p176xb6135e39.p283xc50a8b8b.u7 r11, com.p176xb6135e39.p283xc50a8b8b.t4 r12) {
        /*
            r9 = this;
            r0 = 2
            r9.U(r0)
            com.google.protobuf.d0 r1 = r9.f126565a
            int r2 = r1.G()
            int r2 = r1.k(r2)
            java.lang.Object r3 = r11.f127113b
            java.lang.Object r4 = r11.f127115d
            r5 = r4
        L13:
            int r6 = r9.o()     // Catch: java.lang.Throwable -> L5e
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L57
            boolean r7 = r1.f()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L23
            goto L57
        L23:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L42
            if (r6 == r0) goto L37
            boolean r6 = r9.r()     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.protobuf.y6 r6 = new com.google.protobuf.y6     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            r6.<init>(r8)     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            throw r6     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
        L37:
            com.google.protobuf.ub r6 = r11.f127114c     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            java.lang.Class r7 = r4.getClass()     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            java.lang.Object r5 = r9.P(r6, r7, r12)     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            goto L13
        L42:
            com.google.protobuf.ub r6 = r11.f127112a     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            r7 = 0
            java.lang.Object r3 = r9.P(r6, r7, r7)     // Catch: com.p176xb6135e39.p283xc50a8b8b.x6 -> L4a java.lang.Throwable -> L5e
            goto L13
        L4a:
            boolean r6 = r9.r()     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L51
            goto L13
        L51:
            com.google.protobuf.y6 r10 = new com.google.protobuf.y6     // Catch: java.lang.Throwable -> L5e
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L57:
            r10.put(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r1.j(r2)
            return
        L5e:
            r10 = move-exception
            r1.j(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.e0.g(java.util.Map, com.google.protobuf.u7, com.google.protobuf.t4):void");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: getTag */
    public int mo20625xb5887064() {
        return this.f126566b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public com.p176xb6135e39.p283xc50a8b8b.y h() {
        U(2);
        return this.f126565a.m();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void i(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.B()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.B()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                m6Var.e(d0Var.B());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            m6Var.e(d0Var.B());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long j() {
        U(0);
        return this.f126565a.H();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public java.lang.Object k(com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        U(3);
        return Q(q9Var, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void l(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.l7;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int G = d0Var.G();
                W(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Long.valueOf(d0Var.A()));
                } while (d0Var.e() < e17);
                return;
            }
            do {
                list.add(java.lang.Long.valueOf(d0Var.A()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.l7 l7Var = (com.p176xb6135e39.p283xc50a8b8b.l7) list;
        int i18 = this.f126566b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int G2 = d0Var.G();
            W(G2);
            int e18 = d0Var.e() + G2;
            do {
                l7Var.e(d0Var.A());
            } while (d0Var.e() < e18);
            return;
        }
        do {
            l7Var.e(d0Var.A());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void m(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int e17 = d0Var.e() + d0Var.G();
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.t()));
                } while (d0Var.e() < e17);
                T(e17);
                return;
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.t()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int e18 = d0Var.e() + d0Var.G();
            do {
                m6Var.e(d0Var.t());
            } while (d0Var.e() < e18);
            T(e18);
            return;
        }
        do {
            m6Var.e(d0Var.t());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void n(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 == 2) {
                int G = d0Var.G();
                V(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.p()));
                } while (d0Var.e() < e17);
                return;
            }
            if (i17 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.p()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 == 2) {
            int G2 = d0Var.G();
            V(G2);
            int e18 = d0Var.e() + G2;
            do {
                m6Var.e(d0Var.p());
            } while (d0Var.e() < e18);
            return;
        }
        if (i18 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            m6Var.e(d0Var.p());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public int o() {
        int i17 = this.f126568d;
        if (i17 != 0) {
            this.f126566b = i17;
            this.f126568d = 0;
        } else {
            this.f126566b = this.f126565a.F();
        }
        int i18 = this.f126566b;
        if (i18 == 0 || i18 == this.f126567c) {
            return Integer.MAX_VALUE;
        }
        return i18 >>> 3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void p(java.util.List list) {
        S(list, false);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void q(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.e5;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 == 2) {
                int G = d0Var.G();
                V(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Float.valueOf(d0Var.r()));
                } while (d0Var.e() < e17);
                return;
            }
            if (i17 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Float.valueOf(d0Var.r()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.e5 e5Var = (com.p176xb6135e39.p283xc50a8b8b.e5) list;
        int i18 = this.f126566b & 7;
        if (i18 == 2) {
            int G2 = d0Var.G();
            V(G2);
            int e18 = d0Var.e() + G2;
            do {
                e5Var.e(d0Var.r());
            } while (d0Var.e() < e18);
            return;
        }
        if (i18 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            e5Var.e(d0Var.r());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public boolean r() {
        int i17;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (d0Var.f() || (i17 = this.f126566b) == this.f126567c) {
            return false;
        }
        return d0Var.I(i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: readDouble */
    public double mo20626xc851b907() {
        U(1);
        return this.f126565a.n();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    /* renamed from: readFloat */
    public float mo20627xbc3e6666() {
        U(5);
        return this.f126565a.r();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void s(java.util.List list) {
        int F;
        if ((this.f126566b & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(h());
            com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
            if (d0Var.f()) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == this.f126566b);
        this.f126568d = F;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void t(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.j4;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
                }
                int G = d0Var.G();
                W(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Double.valueOf(d0Var.n()));
                } while (d0Var.e() < e17);
                return;
            }
            do {
                list.add(java.lang.Double.valueOf(d0Var.n()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.j4 j4Var = (com.p176xb6135e39.p283xc50a8b8b.j4) list;
        int i18 = this.f126566b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            int G2 = d0Var.G();
            W(G2);
            int e18 = d0Var.e() + G2;
            do {
                j4Var.e(d0Var.n());
            } while (d0Var.e() < e18);
            return;
        }
        do {
            j4Var.e(d0Var.n());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long u() {
        U(0);
        return this.f126565a.u();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public long v() {
        U(1);
        return this.f126565a.q();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void w(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.p176xb6135e39.p283xc50a8b8b.m6;
        com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
        if (!z17) {
            int i17 = this.f126566b & 7;
            if (i17 == 2) {
                int G = d0Var.G();
                V(G);
                int e17 = d0Var.e() + G;
                do {
                    list.add(java.lang.Integer.valueOf(d0Var.z()));
                } while (d0Var.e() < e17);
                return;
            }
            if (i17 != 5) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.z()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f126566b);
            this.f126568d = F;
            return;
        }
        com.p176xb6135e39.p283xc50a8b8b.m6 m6Var = (com.p176xb6135e39.p283xc50a8b8b.m6) list;
        int i18 = this.f126566b & 7;
        if (i18 == 2) {
            int G2 = d0Var.G();
            V(G2);
            int e18 = d0Var.e() + G2;
            do {
                m6Var.e(d0Var.z());
            } while (d0Var.e() < e18);
            return;
        }
        if (i18 != 5) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            m6Var.e(d0Var.z());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f126566b);
        this.f126568d = F2;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void x(java.util.List list, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int F;
        int i17 = this.f126566b;
        if ((i17 & 7) != 3) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(Q(q9Var, t4Var));
            com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
            if (d0Var.f() || this.f126568d != 0) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == i17);
        this.f126568d = F;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public boolean y() {
        U(0);
        return this.f126565a.l();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l9
    public void z(java.util.List list, com.p176xb6135e39.p283xc50a8b8b.q9 q9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        int F;
        int i17 = this.f126566b;
        if ((i17 & 7) != 2) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.d();
        }
        do {
            list.add(R(q9Var, t4Var));
            com.p176xb6135e39.p283xc50a8b8b.d0 d0Var = this.f126565a;
            if (d0Var.f() || this.f126568d != 0) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == i17);
        this.f126568d = F;
    }
}
