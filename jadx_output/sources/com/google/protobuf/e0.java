package com.google.protobuf;

/* loaded from: classes16.dex */
public final class e0 implements com.google.protobuf.l9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.d0 f45032a;

    /* renamed from: b, reason: collision with root package name */
    public int f45033b;

    /* renamed from: c, reason: collision with root package name */
    public int f45034c;

    /* renamed from: d, reason: collision with root package name */
    public int f45035d = 0;

    public e0(com.google.protobuf.d0 d0Var) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        if (d0Var == null) {
            throw new java.lang.NullPointerException("input");
        }
        this.f45032a = d0Var;
        d0Var.f44994d = this;
    }

    @Override // com.google.protobuf.l9
    public void A(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.l7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void B(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.l7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void C(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public java.lang.Object D(java.lang.Class cls, com.google.protobuf.t4 t4Var) {
        U(3);
        return Q(com.google.protobuf.h9.f45166c.a(cls), t4Var);
    }

    @Override // com.google.protobuf.l9
    public void E(java.util.List list) {
        S(list, true);
    }

    @Override // com.google.protobuf.l9
    public int F() {
        U(0);
        return this.f45032a.t();
    }

    @Override // com.google.protobuf.l9
    public void G(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.l7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) list;
        int i18 = this.f45033b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void H(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public java.lang.Object I(java.lang.Class cls, com.google.protobuf.t4 t4Var) {
        U(2);
        return R(com.google.protobuf.h9.f45166c.a(cls), t4Var);
    }

    @Override // com.google.protobuf.l9
    public int J() {
        U(5);
        return this.f45032a.p();
    }

    @Override // com.google.protobuf.l9
    public long K() {
        U(0);
        return this.f45032a.C();
    }

    @Override // com.google.protobuf.l9
    public java.lang.String L() {
        U(2);
        return this.f45032a.D();
    }

    @Override // com.google.protobuf.l9
    public java.lang.Object M(com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        U(2);
        return R(q9Var, t4Var);
    }

    @Override // com.google.protobuf.l9
    public int N() {
        U(5);
        return this.f45032a.z();
    }

    @Override // com.google.protobuf.l9
    public java.lang.String O() {
        U(2);
        return this.f45032a.E();
    }

    public final java.lang.Object P(com.google.protobuf.ub ubVar, java.lang.Class cls, com.google.protobuf.t4 t4Var) {
        switch (ubVar.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(readDouble());
            case 1:
                return java.lang.Float.valueOf(readFloat());
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

    public final java.lang.Object Q(com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        int i17 = this.f45034c;
        this.f45034c = ((this.f45033b >>> 3) << 3) | 4;
        try {
            java.lang.Object g17 = q9Var.g();
            q9Var.h(g17, this, t4Var);
            q9Var.e(g17);
            if (this.f45033b == this.f45034c) {
                return g17;
            }
            throw com.google.protobuf.y6.g();
        } finally {
            this.f45034c = i17;
        }
    }

    public final java.lang.Object R(com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        com.google.protobuf.d0 d0Var = this.f45032a;
        int G = d0Var.G();
        if (d0Var.f44991a >= d0Var.f44992b) {
            throw com.google.protobuf.y6.h();
        }
        int k17 = d0Var.k(G);
        java.lang.Object g17 = q9Var.g();
        d0Var.f44991a++;
        q9Var.h(g17, this, t4Var);
        q9Var.e(g17);
        d0Var.a(0);
        d0Var.f44991a--;
        d0Var.j(k17);
        return g17;
    }

    public void S(java.util.List list, boolean z17) {
        int F;
        int F2;
        if ((this.f45033b & 7) != 2) {
            throw com.google.protobuf.y6.d();
        }
        boolean z18 = list instanceof com.google.protobuf.g7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z18 || z17) {
            do {
                list.add(z17 ? O() : L());
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.g7 g7Var = (com.google.protobuf.g7) list;
        do {
            g7Var.q(h());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    public final void T(int i17) {
        if (this.f45032a.e() != i17) {
            throw com.google.protobuf.y6.i();
        }
    }

    public final void U(int i17) {
        if ((this.f45033b & 7) != i17) {
            throw com.google.protobuf.y6.d();
        }
    }

    public final void V(int i17) {
        if ((i17 & 3) != 0) {
            throw com.google.protobuf.y6.g();
        }
    }

    public final void W(int i17) {
        if ((i17 & 7) != 0) {
            throw com.google.protobuf.y6.g();
        }
    }

    @Override // com.google.protobuf.l9
    public void a(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.l7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public long b() {
        U(1);
        return this.f45032a.A();
    }

    @Override // com.google.protobuf.l9
    public int c() {
        U(0);
        return this.f45032a.G();
    }

    @Override // com.google.protobuf.l9
    public int d() {
        U(0);
        return this.f45032a.o();
    }

    @Override // com.google.protobuf.l9
    public int e() {
        U(0);
        return this.f45032a.B();
    }

    @Override // com.google.protobuf.l9
    public void f(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.o;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.o oVar = (com.google.protobuf.o) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        return;
     */
    @Override // com.google.protobuf.l9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.util.Map r10, com.google.protobuf.u7 r11, com.google.protobuf.t4 r12) {
        /*
            r9 = this;
            r0 = 2
            r9.U(r0)
            com.google.protobuf.d0 r1 = r9.f45032a
            int r2 = r1.G()
            int r2 = r1.k(r2)
            java.lang.Object r3 = r11.f45580b
            java.lang.Object r4 = r11.f45582d
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
            boolean r6 = r9.r()     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            if (r6 == 0) goto L31
            goto L13
        L31:
            com.google.protobuf.y6 r6 = new com.google.protobuf.y6     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            r6.<init>(r8)     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            throw r6     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
        L37:
            com.google.protobuf.ub r6 = r11.f45581c     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            java.lang.Class r7 = r4.getClass()     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            java.lang.Object r5 = r9.P(r6, r7, r12)     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            goto L13
        L42:
            com.google.protobuf.ub r6 = r11.f45579a     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
            r7 = 0
            java.lang.Object r3 = r9.P(r6, r7, r7)     // Catch: com.google.protobuf.x6 -> L4a java.lang.Throwable -> L5e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e0.g(java.util.Map, com.google.protobuf.u7, com.google.protobuf.t4):void");
    }

    @Override // com.google.protobuf.l9
    public int getTag() {
        return this.f45033b;
    }

    @Override // com.google.protobuf.l9
    public com.google.protobuf.y h() {
        U(2);
        return this.f45032a.m();
    }

    @Override // com.google.protobuf.l9
    public void i(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public long j() {
        U(0);
        return this.f45032a.H();
    }

    @Override // com.google.protobuf.l9
    public java.lang.Object k(com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        U(3);
        return Q(q9Var, t4Var);
    }

    @Override // com.google.protobuf.l9
    public void l(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.l7;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.l7 l7Var = (com.google.protobuf.l7) list;
        int i18 = this.f45033b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void m(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 0) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
        if (i18 != 0) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void n(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
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
                throw com.google.protobuf.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.p()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
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
            throw com.google.protobuf.y6.d();
        }
        do {
            m6Var.e(d0Var.p());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public int o() {
        int i17 = this.f45035d;
        if (i17 != 0) {
            this.f45033b = i17;
            this.f45035d = 0;
        } else {
            this.f45033b = this.f45032a.F();
        }
        int i18 = this.f45033b;
        if (i18 == 0 || i18 == this.f45034c) {
            return Integer.MAX_VALUE;
        }
        return i18 >>> 3;
    }

    @Override // com.google.protobuf.l9
    public void p(java.util.List list) {
        S(list, false);
    }

    @Override // com.google.protobuf.l9
    public void q(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.e5;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
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
                throw com.google.protobuf.y6.d();
            }
            do {
                list.add(java.lang.Float.valueOf(d0Var.r()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.e5 e5Var = (com.google.protobuf.e5) list;
        int i18 = this.f45033b & 7;
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
            throw com.google.protobuf.y6.d();
        }
        do {
            e5Var.e(d0Var.r());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public boolean r() {
        int i17;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (d0Var.f() || (i17 = this.f45033b) == this.f45034c) {
            return false;
        }
        return d0Var.I(i17);
    }

    @Override // com.google.protobuf.l9
    public double readDouble() {
        U(1);
        return this.f45032a.n();
    }

    @Override // com.google.protobuf.l9
    public float readFloat() {
        U(5);
        return this.f45032a.r();
    }

    @Override // com.google.protobuf.l9
    public void s(java.util.List list) {
        int F;
        if ((this.f45033b & 7) != 2) {
            throw com.google.protobuf.y6.d();
        }
        do {
            list.add(h());
            com.google.protobuf.d0 d0Var = this.f45032a;
            if (d0Var.f()) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == this.f45033b);
        this.f45035d = F;
    }

    @Override // com.google.protobuf.l9
    public void t(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.j4;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
            if (i17 != 1) {
                if (i17 != 2) {
                    throw com.google.protobuf.y6.d();
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
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.j4 j4Var = (com.google.protobuf.j4) list;
        int i18 = this.f45033b & 7;
        if (i18 != 1) {
            if (i18 != 2) {
                throw com.google.protobuf.y6.d();
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
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public long u() {
        U(0);
        return this.f45032a.u();
    }

    @Override // com.google.protobuf.l9
    public long v() {
        U(1);
        return this.f45032a.q();
    }

    @Override // com.google.protobuf.l9
    public void w(java.util.List list) {
        int F;
        int F2;
        boolean z17 = list instanceof com.google.protobuf.m6;
        com.google.protobuf.d0 d0Var = this.f45032a;
        if (!z17) {
            int i17 = this.f45033b & 7;
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
                throw com.google.protobuf.y6.d();
            }
            do {
                list.add(java.lang.Integer.valueOf(d0Var.z()));
                if (d0Var.f()) {
                    return;
                } else {
                    F = d0Var.F();
                }
            } while (F == this.f45033b);
            this.f45035d = F;
            return;
        }
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) list;
        int i18 = this.f45033b & 7;
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
            throw com.google.protobuf.y6.d();
        }
        do {
            m6Var.e(d0Var.z());
            if (d0Var.f()) {
                return;
            } else {
                F2 = d0Var.F();
            }
        } while (F2 == this.f45033b);
        this.f45035d = F2;
    }

    @Override // com.google.protobuf.l9
    public void x(java.util.List list, com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        int F;
        int i17 = this.f45033b;
        if ((i17 & 7) != 3) {
            throw com.google.protobuf.y6.d();
        }
        do {
            list.add(Q(q9Var, t4Var));
            com.google.protobuf.d0 d0Var = this.f45032a;
            if (d0Var.f() || this.f45035d != 0) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == i17);
        this.f45035d = F;
    }

    @Override // com.google.protobuf.l9
    public boolean y() {
        U(0);
        return this.f45032a.l();
    }

    @Override // com.google.protobuf.l9
    public void z(java.util.List list, com.google.protobuf.q9 q9Var, com.google.protobuf.t4 t4Var) {
        int F;
        int i17 = this.f45033b;
        if ((i17 & 7) != 2) {
            throw com.google.protobuf.y6.d();
        }
        do {
            list.add(R(q9Var, t4Var));
            com.google.protobuf.d0 d0Var = this.f45032a;
            if (d0Var.f() || this.f45035d != 0) {
                return;
            } else {
                F = d0Var.F();
            }
        } while (F == i17);
        this.f45035d = F;
    }
}
