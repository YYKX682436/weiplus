package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class z0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f127282d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f127283e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f127284f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f127285g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g1 f127286h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f127287i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f127288m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f127289n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f127290o;

    public z0(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f127283e = "";
        this.f127284f = java.util.Collections.emptyList();
        this.f127288m = java.util.Collections.emptyList();
        this.f127290o = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m20968x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.d1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.d1 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.d1 d1Var = new com.p176xb6135e39.p283xc50a8b8b.d1(this, null);
        int i17 = this.f127282d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        d1Var.f126531e = this.f127283e;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127285g;
        if (p9Var == null) {
            if ((this.f127282d & 2) != 0) {
                this.f127284f = java.util.Collections.unmodifiableList(this.f127284f);
                this.f127282d &= -3;
            }
            d1Var.f126532f = this.f127284f;
        } else {
            d1Var.f126532f = p9Var.g();
        }
        if ((i17 & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127287i;
            if (t9Var == null) {
                d1Var.f126533g = this.f127286h;
            } else {
                d1Var.f126533g = (com.p176xb6135e39.p283xc50a8b8b.g1) t9Var.b();
            }
            i18 |= 2;
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f127289n;
        if (p9Var2 == null) {
            if ((this.f127282d & 8) != 0) {
                this.f127288m = java.util.Collections.unmodifiableList(this.f127288m);
                this.f127282d &= -9;
            }
            d1Var.f126534h = this.f127288m;
        } else {
            d1Var.f126534h = p9Var2.g();
        }
        if ((this.f127282d & 16) != 0) {
            this.f127290o = this.f127290o.b();
            this.f127282d &= -17;
        }
        d1Var.f126535i = this.f127290o;
        d1Var.f126530d = i18;
        m20880xaf619bdf();
        return d1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20967x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.z0) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f127289n == null) {
            this.f127289n = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f127288m, (this.f127282d & 8) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127288m = null;
        }
        return this.f127289n;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f127285g == null) {
            this.f127285g = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f127284f, (this.f127282d & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127284f = null;
        }
        return this.f127285g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.z0 f(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.d1.f126529o     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.y0 r0 = (com.p176xb6135e39.p283xc50a8b8b.y0) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.d1 r2 = (com.p176xb6135e39.p283xc50a8b8b.d1) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.d1 r3 = (com.p176xb6135e39.p283xc50a8b8b.d1) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.g(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.z0.f(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.z0");
    }

    public com.p176xb6135e39.p283xc50a8b8b.z0 g(com.p176xb6135e39.p283xc50a8b8b.d1 d1Var) {
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var;
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var2;
        if (d1Var == com.p176xb6135e39.p283xc50a8b8b.d1.f126528n) {
            return this;
        }
        if ((d1Var.f126530d & 1) != 0) {
            this.f127282d |= 1;
            this.f127283e = d1Var.f126531e;
            m20881x7bb163d5();
        }
        if (this.f127285g == null) {
            if (!d1Var.f126532f.isEmpty()) {
                if (this.f127284f.isEmpty()) {
                    this.f127284f = d1Var.f126532f;
                    this.f127282d &= -3;
                } else {
                    if ((this.f127282d & 2) == 0) {
                        this.f127284f = new java.util.ArrayList(this.f127284f);
                        this.f127282d |= 2;
                    }
                    this.f127284f.addAll(d1Var.f126532f);
                }
                m20881x7bb163d5();
            }
        } else if (!d1Var.f126532f.isEmpty()) {
            if (this.f127285g.p()) {
                this.f127285g.f126942a = null;
                this.f127285g = null;
                this.f127284f = d1Var.f126532f;
                this.f127282d &= -3;
                this.f127285g = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? e() : null;
            } else {
                this.f127285g.b(d1Var.f126532f);
            }
        }
        if (d1Var.g()) {
            com.p176xb6135e39.p283xc50a8b8b.g1 f17 = d1Var.f();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127287i;
            if (t9Var == null) {
                if ((this.f127282d & 4) == 0 || (g1Var = this.f127286h) == null || g1Var == (g1Var2 = com.p176xb6135e39.p283xc50a8b8b.g1.f126628m)) {
                    this.f127286h = f17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.f1 mo20599xaaa148a0 = g1Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(g1Var);
                    mo20599xaaa148a0.l(f17);
                    this.f127286h = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(f17);
            }
            this.f127282d |= 4;
        }
        if (this.f127289n == null) {
            if (!d1Var.f126534h.isEmpty()) {
                if (this.f127288m.isEmpty()) {
                    this.f127288m = d1Var.f126534h;
                    this.f127282d &= -9;
                } else {
                    if ((this.f127282d & 8) == 0) {
                        this.f127288m = new java.util.ArrayList(this.f127288m);
                        this.f127282d |= 8;
                    }
                    this.f127288m.addAll(d1Var.f126534h);
                }
                m20881x7bb163d5();
            }
        } else if (!d1Var.f126534h.isEmpty()) {
            if (this.f127289n.p()) {
                this.f127289n.f126942a = null;
                this.f127289n = null;
                this.f127288m = d1Var.f126534h;
                this.f127282d &= -9;
                this.f127289n = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? d() : null;
            } else {
                this.f127289n.b(d1Var.f126534h);
            }
        }
        if (!d1Var.f126535i.isEmpty()) {
            if (this.f127290o.isEmpty()) {
                this.f127290o = d1Var.f126535i;
                this.f127282d &= -17;
            } else {
                if ((this.f127282d & 16) == 0) {
                    this.f127290o = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f127290o);
                    this.f127282d |= 16;
                }
                this.f127290o.addAll(d1Var.f126535i);
            }
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.d1.f126528n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126929o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126930p;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.d1.class, com.p176xb6135e39.p283xc50a8b8b.z0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var;
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127285g;
            if (i17 >= (p9Var == null ? this.f127284f.size() : p9Var.l())) {
                if ((this.f127282d & 4) != 0) {
                    com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127287i;
                    if (t9Var == null) {
                        g1Var = this.f127286h;
                        if (g1Var == null) {
                            g1Var = com.p176xb6135e39.p283xc50a8b8b.g1.f126628m;
                        }
                    } else {
                        g1Var = (com.p176xb6135e39.p283xc50a8b8b.g1) t9Var.e();
                    }
                    if (!g1Var.mo20562xf582434a()) {
                        return false;
                    }
                }
                return true;
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f127285g;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.j1) this.f127284f.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.j1) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
        }
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20968x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            e();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127287i;
            if (t9Var == null) {
                if (t9Var == null) {
                    g1Var = this.f127286h;
                    if (g1Var == null) {
                        g1Var = com.p176xb6135e39.p283xc50a8b8b.g1.f126628m;
                    }
                } else {
                    g1Var = (com.p176xb6135e39.p283xc50a8b8b.g1) t9Var.e();
                }
                this.f127287i = new com.p176xb6135e39.p283xc50a8b8b.t9(g1Var, m20872x3e6b6e28(), m20879x7a8e633f());
                this.f127286h = null;
            }
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.z0) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.d1.f126528n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
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
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.d1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.d1) {
            g((com.p176xb6135e39.p283xc50a8b8b.d1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public z0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f127283e = "";
        this.f127284f = java.util.Collections.emptyList();
        this.f127288m = java.util.Collections.emptyList();
        this.f127290o = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m20968x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.d1) {
            g((com.p176xb6135e39.p283xc50a8b8b.d1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
