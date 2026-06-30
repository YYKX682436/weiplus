package s95;

/* loaded from: classes16.dex */
public final class h extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f486597d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f486598e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f486599f;

    /* renamed from: g, reason: collision with root package name */
    public long f486600g;

    /* renamed from: h, reason: collision with root package name */
    public long f486601h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f486602i;

    /* renamed from: m, reason: collision with root package name */
    public s95.f f486603m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f486604n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f486605o;

    /* renamed from: p, reason: collision with root package name */
    public s95.u0 f486606p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f486607q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f486608r;

    /* renamed from: s, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f486609s;

    /* renamed from: t, reason: collision with root package name */
    public s95.y f486610t;

    /* renamed from: u, reason: collision with root package name */
    public s95.y f486611u;

    public h(s95.g gVar) {
        super(null);
        boolean z17;
        this.f486598e = java.util.Collections.emptyList();
        this.f486604n = java.util.Collections.emptyList();
        this.f486608r = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            f();
            d();
            e();
        }
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
        s95.i mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.i mo20557x85702333() {
        s95.i iVar = new s95.i(this, null);
        int i17 = this.f486597d;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f486599f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f486598e = java.util.Collections.unmodifiableList(this.f486598e);
                this.f486597d &= -2;
            }
            iVar.f486619d = this.f486598e;
        } else {
            iVar.f486619d = p9Var.g();
        }
        iVar.f486620e = this.f486600g;
        iVar.f486621f = this.f486601h;
        iVar.f486622g = this.f486602i;
        iVar.f486623h = this.f486603m;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f486605o;
        if (p9Var2 == null) {
            if ((this.f486597d & 2) != 0) {
                this.f486604n = java.util.Collections.unmodifiableList(this.f486604n);
                this.f486597d &= -3;
            }
            iVar.f486624i = this.f486604n;
        } else {
            iVar.f486624i = p9Var2.g();
        }
        iVar.f486625m = this.f486606p;
        iVar.f486626n = this.f486607q;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f486609s;
        if (p9Var3 == null) {
            if ((this.f486597d & 4) != 0) {
                this.f486608r = java.util.Collections.unmodifiableList(this.f486608r);
                this.f486597d &= -5;
            }
            iVar.f486627o = this.f486608r;
        } else {
            iVar.f486627o = p9Var3.g();
        }
        iVar.f486628p = this.f486610t;
        iVar.f486629q = this.f486611u;
        m20880xaf619bdf();
        return iVar;
    }

    /* renamed from: clone */
    public java.lang.Object m164139x5a5dd5d() {
        return (s95.h) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f486605o == null) {
            this.f486605o = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f486604n, (this.f486597d & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f486604n = null;
        }
        return this.f486605o;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f486609s == null) {
            this.f486609s = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f486608r, (this.f486597d & 4) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f486608r = null;
        }
        return this.f486609s;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 f() {
        if (this.f486599f == null) {
            this.f486599f = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f486598e, (this.f486597d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f486598e = null;
        }
        return this.f486599f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.h g(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.i.f486618t     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.g r0 = (s95.g) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.i r2 = (s95.i) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.h(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            s95.i r3 = (s95.i) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.h(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s95.h.g(com.google.protobuf.d0, com.google.protobuf.t4):s95.h");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return s95.i.f486617s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return s95.r0.f486731w;
    }

    public s95.h h(s95.i iVar) {
        boolean z17;
        boolean z18;
        boolean z19;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        if (iVar == s95.i.f486617s) {
            return this;
        }
        if (this.f486599f == null) {
            if (!iVar.f486619d.isEmpty()) {
                if (this.f486598e.isEmpty()) {
                    this.f486598e = iVar.f486619d;
                    this.f486597d &= -2;
                } else {
                    if ((this.f486597d & 1) == 0) {
                        this.f486598e = new java.util.ArrayList(this.f486598e);
                        this.f486597d |= 1;
                    }
                    this.f486598e.addAll(iVar.f486619d);
                }
                m20881x7bb163d5();
            }
        } else if (!iVar.f486619d.isEmpty()) {
            if (this.f486599f.p()) {
                this.f486599f.f126942a = null;
                this.f486599f = null;
                this.f486598e = iVar.f486619d;
                this.f486597d &= -2;
                z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f486599f = z17 ? f() : null;
            } else {
                this.f486599f.b(iVar.f486619d);
            }
        }
        long j17 = iVar.f486620e;
        if (j17 != 0) {
            this.f486600g = j17;
            m20881x7bb163d5();
        }
        long j18 = iVar.f486621f;
        if (j18 != 0) {
            this.f486601h = j18;
            m20881x7bb163d5();
        }
        boolean z27 = iVar.f486622g;
        if (z27) {
            this.f486602i = z27;
            m20881x7bb163d5();
        }
        if (iVar.f486623h != null) {
            s95.f k17 = iVar.k();
            s95.f fVar = this.f486603m;
            if (fVar != null) {
                s95.e mo20599xaaa148a0 = s95.f.f486588i.mo20599xaaa148a0();
                mo20599xaaa148a0.f(fVar);
                mo20599xaaa148a0.f(k17);
                this.f486603m = mo20599xaaa148a0.mo20557x85702333();
            } else {
                this.f486603m = k17;
            }
            m20881x7bb163d5();
        }
        if (this.f486605o == null) {
            if (!iVar.f486624i.isEmpty()) {
                if (this.f486604n.isEmpty()) {
                    this.f486604n = iVar.f486624i;
                    this.f486597d &= -3;
                } else {
                    if ((this.f486597d & 2) == 0) {
                        this.f486604n = new java.util.ArrayList(this.f486604n);
                        this.f486597d |= 2;
                    }
                    this.f486604n.addAll(iVar.f486624i);
                }
                m20881x7bb163d5();
            }
        } else if (!iVar.f486624i.isEmpty()) {
            if (this.f486605o.p()) {
                this.f486605o.f126942a = null;
                this.f486605o = null;
                this.f486604n = iVar.f486624i;
                this.f486597d &= -3;
                z18 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f486605o = z18 ? d() : null;
            } else {
                this.f486605o.b(iVar.f486624i);
            }
        }
        if (iVar.f486625m != null) {
            s95.u0 m17 = iVar.m();
            s95.u0 u0Var = this.f486606p;
            if (u0Var != null) {
                s95.t0 mo20599xaaa148a02 = s95.u0.f486756i.mo20599xaaa148a0();
                mo20599xaaa148a02.e(u0Var);
                mo20599xaaa148a02.e(m17);
                this.f486606p = mo20599xaaa148a02.mo20557x85702333();
            } else {
                this.f486606p = m17;
            }
            m20881x7bb163d5();
        }
        boolean z28 = iVar.f486626n;
        if (z28) {
            this.f486607q = z28;
            m20881x7bb163d5();
        }
        if (this.f486609s == null) {
            if (!iVar.f486627o.isEmpty()) {
                if (this.f486608r.isEmpty()) {
                    this.f486608r = iVar.f486627o;
                    this.f486597d &= -5;
                } else {
                    if ((this.f486597d & 4) == 0) {
                        this.f486608r = new java.util.ArrayList(this.f486608r);
                        this.f486597d |= 4;
                    }
                    this.f486608r.addAll(iVar.f486627o);
                }
                m20881x7bb163d5();
            }
        } else if (!iVar.f486627o.isEmpty()) {
            if (this.f486609s.p()) {
                this.f486609s.f126942a = null;
                this.f486609s = null;
                this.f486608r = iVar.f486627o;
                this.f486597d &= -5;
                z19 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f486609s = z19 ? e() : null;
            } else {
                this.f486609s.b(iVar.f486627o);
            }
        }
        if (iVar.f486628p != null) {
            s95.y j19 = iVar.j();
            s95.y yVar = this.f486610t;
            if (yVar != null) {
                s95.x g17 = s95.y.g(yVar);
                g17.e(j19);
                this.f486610t = g17.mo20557x85702333();
            } else {
                this.f486610t = j19;
            }
            m20881x7bb163d5();
        }
        if (iVar.f486629q != null) {
            s95.y l17 = iVar.l();
            s95.y yVar2 = this.f486611u;
            if (yVar2 != null) {
                s95.x g18 = s95.y.g(yVar2);
                g18.e(l17);
                this.f486611u = g18.mo20557x85702333();
            } else {
                this.f486611u = l17;
            }
            m20881x7bb163d5();
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) iVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486732x;
        j6Var.c(s95.i.class, s95.h.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (s95.h) m45492xba8a5e4b(waVar);
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
        return s95.i.f486617s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        g(d0Var, t4Var);
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
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        s95.i mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof s95.i) {
            h((s95.i) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof s95.i) {
            h((s95.i) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public h(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, s95.g gVar) {
        super(r5Var);
        boolean z17;
        this.f486598e = java.util.Collections.emptyList();
        this.f486604n = java.util.Collections.emptyList();
        this.f486608r = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            f();
            d();
            e();
        }
    }
}
