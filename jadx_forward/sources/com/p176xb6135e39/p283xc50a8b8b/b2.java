package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class b2 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126417d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126418e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f126419f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126420g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126421h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126422i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f126423m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126424n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f126425o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126426p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f126427q;

    /* renamed from: r, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126428r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f126429s;

    /* renamed from: t, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126430t;

    /* renamed from: u, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g2 f126431u;

    /* renamed from: v, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f126432v;

    /* renamed from: w, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.i3 f126433w;

    /* renamed from: x, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f126434x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f126435y;

    public b2(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126418e = "";
        this.f126419f = "";
        this.f126420g = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f126421h = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126422i = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126423m = java.util.Collections.emptyList();
        this.f126425o = java.util.Collections.emptyList();
        this.f126427q = java.util.Collections.emptyList();
        this.f126429s = java.util.Collections.emptyList();
        this.f126435y = "";
        m20566x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.c2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.c2 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.c2 c2Var = new com.p176xb6135e39.p283xc50a8b8b.c2(this, null);
        int i17 = this.f126417d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        c2Var.f126487e = this.f126418e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        c2Var.f126488f = this.f126419f;
        if ((this.f126417d & 4) != 0) {
            this.f126420g = this.f126420g.b();
            this.f126417d &= -5;
        }
        c2Var.f126489g = this.f126420g;
        int i19 = this.f126417d;
        if ((i19 & 8) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f126421h).f126678d = false;
            this.f126417d = i19 & (-9);
        }
        c2Var.f126490h = this.f126421h;
        int i27 = this.f126417d;
        if ((i27 & 16) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f126422i).f126678d = false;
            this.f126417d = i27 & (-17);
        }
        c2Var.f126491i = this.f126422i;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126424n;
        if (p9Var == null) {
            if ((this.f126417d & 32) != 0) {
                this.f126423m = java.util.Collections.unmodifiableList(this.f126423m);
                this.f126417d &= -33;
            }
            c2Var.f126492m = this.f126423m;
        } else {
            c2Var.f126492m = p9Var.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126426p;
        if (p9Var2 == null) {
            if ((this.f126417d & 64) != 0) {
                this.f126425o = java.util.Collections.unmodifiableList(this.f126425o);
                this.f126417d &= -65;
            }
            c2Var.f126493n = this.f126425o;
        } else {
            c2Var.f126493n = p9Var2.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f126428r;
        if (p9Var3 == null) {
            if ((this.f126417d & 128) != 0) {
                this.f126427q = java.util.Collections.unmodifiableList(this.f126427q);
                this.f126417d &= -129;
            }
            c2Var.f126494o = this.f126427q;
        } else {
            c2Var.f126494o = p9Var3.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var4 = this.f126430t;
        if (p9Var4 == null) {
            if ((this.f126417d & 256) != 0) {
                this.f126429s = java.util.Collections.unmodifiableList(this.f126429s);
                this.f126417d &= -257;
            }
            c2Var.f126495p = this.f126429s;
        } else {
            c2Var.f126495p = p9Var4.g();
        }
        if ((i17 & 512) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126432v;
            if (t9Var == null) {
                c2Var.f126496q = this.f126431u;
            } else {
                c2Var.f126496q = (com.p176xb6135e39.p283xc50a8b8b.g2) t9Var.b();
            }
            i18 |= 4;
        }
        if ((i17 & 1024) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f126434x;
            if (t9Var2 == null) {
                c2Var.f126497r = this.f126433w;
            } else {
                c2Var.f126497r = (com.p176xb6135e39.p283xc50a8b8b.i3) t9Var2.b();
            }
            i18 |= 8;
        }
        if ((i17 & 2048) != 0) {
            i18 |= 16;
        }
        c2Var.f126498s = this.f126435y;
        c2Var.f126486d = i18;
        m20880xaf619bdf();
        return c2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20565x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.b2) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f126426p == null) {
            this.f126426p = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126425o, (this.f126417d & 64) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126425o = null;
        }
        return this.f126426p;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f126430t == null) {
            this.f126430t = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126429s, (this.f126417d & 256) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126429s = null;
        }
        return this.f126430t;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 f() {
        if (this.f126424n == null) {
            this.f126424n = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126423m, (this.f126417d & 32) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126423m = null;
        }
        return this.f126424n;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 g() {
        if (this.f126428r == null) {
            this.f126428r = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126427q, (this.f126417d & 128) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126427q = null;
        }
        return this.f126428r;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.c2.f126484u;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126915a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.b2 h(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.c2.f126485v     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.a2 r0 = (com.p176xb6135e39.p283xc50a8b8b.a2) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.c2 r2 = (com.p176xb6135e39.p283xc50a8b8b.c2) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.i(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.c2 r3 = (com.p176xb6135e39.p283xc50a8b8b.c2) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.i(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.b2.h(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.b2");
    }

    public com.p176xb6135e39.p283xc50a8b8b.b2 i(com.p176xb6135e39.p283xc50a8b8b.c2 c2Var) {
        com.p176xb6135e39.p283xc50a8b8b.i3 i3Var;
        com.p176xb6135e39.p283xc50a8b8b.i3 i3Var2;
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var;
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var2;
        if (c2Var == com.p176xb6135e39.p283xc50a8b8b.c2.f126484u) {
            return this;
        }
        if ((c2Var.f126486d & 1) != 0) {
            this.f126417d |= 1;
            this.f126418e = c2Var.f126487e;
            m20881x7bb163d5();
        }
        if ((c2Var.f126486d & 2) != 0) {
            this.f126417d |= 2;
            this.f126419f = c2Var.f126488f;
            m20881x7bb163d5();
        }
        if (!c2Var.f126489g.isEmpty()) {
            if (this.f126420g.isEmpty()) {
                this.f126420g = c2Var.f126489g;
                this.f126417d &= -5;
            } else {
                if ((this.f126417d & 4) == 0) {
                    this.f126420g = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f126420g);
                    this.f126417d |= 4;
                }
                this.f126420g.addAll(c2Var.f126489g);
            }
            m20881x7bb163d5();
        }
        if (!c2Var.f126490h.isEmpty()) {
            if (this.f126421h.isEmpty()) {
                this.f126421h = c2Var.f126490h;
                this.f126417d &= -9;
            } else {
                if ((this.f126417d & 8) == 0) {
                    this.f126421h = com.p176xb6135e39.p283xc50a8b8b.l6.m20754x946297bb(this.f126421h);
                    this.f126417d |= 8;
                }
                ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126421h).addAll(c2Var.f126490h);
            }
            m20881x7bb163d5();
        }
        if (!c2Var.f126491i.isEmpty()) {
            if (this.f126422i.isEmpty()) {
                this.f126422i = c2Var.f126491i;
                this.f126417d &= -17;
            } else {
                if ((this.f126417d & 16) == 0) {
                    this.f126422i = com.p176xb6135e39.p283xc50a8b8b.l6.m20754x946297bb(this.f126422i);
                    this.f126417d |= 16;
                }
                ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126422i).addAll(c2Var.f126491i);
            }
            m20881x7bb163d5();
        }
        if (this.f126424n == null) {
            if (!c2Var.f126492m.isEmpty()) {
                if (this.f126423m.isEmpty()) {
                    this.f126423m = c2Var.f126492m;
                    this.f126417d &= -33;
                } else {
                    if ((this.f126417d & 32) == 0) {
                        this.f126423m = new java.util.ArrayList(this.f126423m);
                        this.f126417d |= 32;
                    }
                    this.f126423m.addAll(c2Var.f126492m);
                }
                m20881x7bb163d5();
            }
        } else if (!c2Var.f126492m.isEmpty()) {
            if (this.f126424n.p()) {
                this.f126424n.f126942a = null;
                this.f126424n = null;
                this.f126423m = c2Var.f126492m;
                this.f126417d &= -33;
                this.f126424n = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? f() : null;
            } else {
                this.f126424n.b(c2Var.f126492m);
            }
        }
        if (this.f126426p == null) {
            if (!c2Var.f126493n.isEmpty()) {
                if (this.f126425o.isEmpty()) {
                    this.f126425o = c2Var.f126493n;
                    this.f126417d &= -65;
                } else {
                    if ((this.f126417d & 64) == 0) {
                        this.f126425o = new java.util.ArrayList(this.f126425o);
                        this.f126417d |= 64;
                    }
                    this.f126425o.addAll(c2Var.f126493n);
                }
                m20881x7bb163d5();
            }
        } else if (!c2Var.f126493n.isEmpty()) {
            if (this.f126426p.p()) {
                this.f126426p.f126942a = null;
                this.f126426p = null;
                this.f126425o = c2Var.f126493n;
                this.f126417d &= -65;
                this.f126426p = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? d() : null;
            } else {
                this.f126426p.b(c2Var.f126493n);
            }
        }
        if (this.f126428r == null) {
            if (!c2Var.f126494o.isEmpty()) {
                if (this.f126427q.isEmpty()) {
                    this.f126427q = c2Var.f126494o;
                    this.f126417d &= -129;
                } else {
                    if ((this.f126417d & 128) == 0) {
                        this.f126427q = new java.util.ArrayList(this.f126427q);
                        this.f126417d |= 128;
                    }
                    this.f126427q.addAll(c2Var.f126494o);
                }
                m20881x7bb163d5();
            }
        } else if (!c2Var.f126494o.isEmpty()) {
            if (this.f126428r.p()) {
                this.f126428r.f126942a = null;
                this.f126428r = null;
                this.f126427q = c2Var.f126494o;
                this.f126417d &= -129;
                this.f126428r = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? g() : null;
            } else {
                this.f126428r.b(c2Var.f126494o);
            }
        }
        if (this.f126430t == null) {
            if (!c2Var.f126495p.isEmpty()) {
                if (this.f126429s.isEmpty()) {
                    this.f126429s = c2Var.f126495p;
                    this.f126417d &= -257;
                } else {
                    if ((this.f126417d & 256) == 0) {
                        this.f126429s = new java.util.ArrayList(this.f126429s);
                        this.f126417d |= 256;
                    }
                    this.f126429s.addAll(c2Var.f126495p);
                }
                m20881x7bb163d5();
            }
        } else if (!c2Var.f126495p.isEmpty()) {
            if (this.f126430t.p()) {
                this.f126430t.f126942a = null;
                this.f126430t = null;
                this.f126429s = c2Var.f126495p;
                this.f126417d &= -257;
                this.f126430t = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? e() : null;
            } else {
                this.f126430t.b(c2Var.f126495p);
            }
        }
        if (c2Var.j()) {
            com.p176xb6135e39.p283xc50a8b8b.g2 f17 = c2Var.f();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126432v;
            if (t9Var == null) {
                if ((this.f126417d & 512) == 0 || (g2Var = this.f126431u) == null || g2Var == (g2Var2 = com.p176xb6135e39.p283xc50a8b8b.g2.E)) {
                    this.f126431u = f17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.e2 mo20599xaaa148a0 = g2Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(g2Var);
                    mo20599xaaa148a0.l(f17);
                    this.f126431u = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(f17);
            }
            this.f126417d |= 512;
        }
        if ((c2Var.f126486d & 8) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.i3 h17 = c2Var.h();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f126434x;
            if (t9Var2 == null) {
                if ((this.f126417d & 1024) == 0 || (i3Var = this.f126433w) == null || i3Var == (i3Var2 = com.p176xb6135e39.p283xc50a8b8b.i3.f126720f)) {
                    this.f126433w = h17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.e3 mo20599xaaa148a02 = i3Var2.mo20599xaaa148a0();
                    mo20599xaaa148a02.f(i3Var);
                    mo20599xaaa148a02.f(h17);
                    this.f126433w = mo20599xaaa148a02.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var2.g(h17);
            }
            this.f126417d |= 1024;
        }
        if ((c2Var.f126486d & 16) != 0) {
            this.f126417d |= 2048;
            this.f126435y = c2Var.f126498s;
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126916b;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.c2.class, com.p176xb6135e39.p283xc50a8b8b.b2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var;
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126424n;
            if (i17 < (p9Var == null ? this.f126423m.size() : p9Var.l())) {
                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126424n;
                if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.x0) this.f126423m.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.x0) p9Var2.m(i17, false)).mo20562xf582434a()) {
                    return false;
                }
                i17++;
            } else {
                int i18 = 0;
                while (true) {
                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f126426p;
                    if (i18 < (p9Var3 == null ? this.f126425o.size() : p9Var3.l())) {
                        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var4 = this.f126426p;
                        if (!(p9Var4 == null ? (com.p176xb6135e39.p283xc50a8b8b.d1) this.f126425o.get(i18) : (com.p176xb6135e39.p283xc50a8b8b.d1) p9Var4.m(i18, false)).mo20562xf582434a()) {
                            return false;
                        }
                        i18++;
                    } else {
                        int i19 = 0;
                        while (true) {
                            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var5 = this.f126428r;
                            if (i19 < (p9Var5 == null ? this.f126427q.size() : p9Var5.l())) {
                                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var6 = this.f126428r;
                                if (!(p9Var6 == null ? (com.p176xb6135e39.p283xc50a8b8b.z2) this.f126427q.get(i19) : (com.p176xb6135e39.p283xc50a8b8b.z2) p9Var6.m(i19, false)).mo20562xf582434a()) {
                                    return false;
                                }
                                i19++;
                            } else {
                                int i27 = 0;
                                while (true) {
                                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var7 = this.f126430t;
                                    if (i27 >= (p9Var7 == null ? this.f126429s.size() : p9Var7.l())) {
                                        if ((this.f126417d & 512) != 0) {
                                            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126432v;
                                            if (t9Var == null) {
                                                g2Var = this.f126431u;
                                                if (g2Var == null) {
                                                    g2Var = com.p176xb6135e39.p283xc50a8b8b.g2.E;
                                                }
                                            } else {
                                                g2Var = (com.p176xb6135e39.p283xc50a8b8b.g2) t9Var.e();
                                            }
                                            if (!g2Var.mo20562xf582434a()) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var8 = this.f126430t;
                                    if (!(p9Var8 == null ? (com.p176xb6135e39.p283xc50a8b8b.u1) this.f126429s.get(i27) : (com.p176xb6135e39.p283xc50a8b8b.u1) p9Var8.m(i27, false)).mo20562xf582434a()) {
                                        return false;
                                    }
                                    i27++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20566x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.i3 i3Var;
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            f();
            d();
            g();
            e();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126432v;
            if (t9Var == null) {
                if (t9Var == null) {
                    g2Var = this.f126431u;
                    if (g2Var == null) {
                        g2Var = com.p176xb6135e39.p283xc50a8b8b.g2.E;
                    }
                } else {
                    g2Var = (com.p176xb6135e39.p283xc50a8b8b.g2) t9Var.e();
                }
                this.f126432v = new com.p176xb6135e39.p283xc50a8b8b.t9(g2Var, m20872x3e6b6e28(), m20879x7a8e633f());
                this.f126431u = null;
            }
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var2 = this.f126434x;
            if (t9Var2 == null) {
                if (t9Var2 == null) {
                    i3Var = this.f126433w;
                    if (i3Var == null) {
                        i3Var = com.p176xb6135e39.p283xc50a8b8b.i3.f126720f;
                    }
                } else {
                    i3Var = (com.p176xb6135e39.p283xc50a8b8b.i3) t9Var2.e();
                }
                this.f126434x = new com.p176xb6135e39.p283xc50a8b8b.t9(i3Var, m20872x3e6b6e28(), m20879x7a8e633f());
                this.f126433w = null;
            }
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.b2) m45492xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.c2.f126484u;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.j8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.c2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.c2) {
            i((com.p176xb6135e39.p283xc50a8b8b.c2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.c2) {
            i((com.p176xb6135e39.p283xc50a8b8b.c2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public b2(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126418e = "";
        this.f126419f = "";
        this.f126420g = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f126421h = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126422i = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126423m = java.util.Collections.emptyList();
        this.f126425o = java.util.Collections.emptyList();
        this.f126427q = java.util.Collections.emptyList();
        this.f126429s = java.util.Collections.emptyList();
        this.f126435y = "";
        m20566x73fef578();
    }
}
