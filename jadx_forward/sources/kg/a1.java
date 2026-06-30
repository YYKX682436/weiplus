package kg;

/* loaded from: classes16.dex */
public final class a1 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements kg.c1 {

    /* renamed from: d, reason: collision with root package name */
    public int f389045d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f389046e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f389047f;

    /* renamed from: g, reason: collision with root package name */
    public kg.p0 f389048g;

    /* renamed from: h, reason: collision with root package name */
    public kg.s1 f389049h;

    /* renamed from: i, reason: collision with root package name */
    public kg.t0 f389050i;

    /* renamed from: m, reason: collision with root package name */
    public float f389051m;

    /* renamed from: n, reason: collision with root package name */
    public int f389052n;

    public a1(kg.b bVar) {
        super(null);
        boolean z17;
        this.f389046e = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
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
        kg.b1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.b1 mo20557x85702333() {
        kg.b1 b1Var = new kg.b1(this);
        int i17 = this.f389045d;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f389047f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f389046e = java.util.Collections.unmodifiableList(this.f389046e);
                this.f389045d &= -2;
            }
            b1Var.f72459xe0df8cb9 = this.f389046e;
        } else {
            b1Var.f72459xe0df8cb9 = p9Var.g();
        }
        b1Var.f72457xfcb813b = this.f389048g;
        b1Var.f72462x6e64745b = this.f389049h;
        b1Var.f72458x9342597f = this.f389050i;
        b1Var.f72460x30ed1599 = this.f389051m;
        b1Var.f72456x81d3b27e = this.f389052n;
        m20880xaf619bdf();
        return b1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m142572x5a5dd5d() {
        return (kg.a1) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f389047f == null) {
            this.f389047f = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f389046e, (this.f389045d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f389046e = null;
        }
        return this.f389047f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.a1 e(com.p176xb6135e39.p283xc50a8b8b.d0 r3, com.p176xb6135e39.p283xc50a8b8b.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.b1.m142614x24029fb5()     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            java.lang.Object r3 = r1.mo20549xc7f9c18(r3, r4)     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            kg.b1 r3 = (kg.b1) r3     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            if (r3 == 0) goto L10
            r2.f(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f127272d     // Catch: java.lang.Throwable -> L11
            kg.b1 r4 = (kg.b1) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.f(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a1.e(com.google.protobuf.d0, com.google.protobuf.t4):kg.a1");
    }

    public kg.a1 f(kg.b1 b1Var) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        boolean z17;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        if (b1Var == kg.b1.m142615x7c90cfc0()) {
            return this;
        }
        if (this.f389047f == null) {
            list4 = b1Var.f72459xe0df8cb9;
            if (!list4.isEmpty()) {
                if (this.f389046e.isEmpty()) {
                    list6 = b1Var.f72459xe0df8cb9;
                    this.f389046e = list6;
                    this.f389045d &= -2;
                } else {
                    if ((this.f389045d & 1) == 0) {
                        this.f389046e = new java.util.ArrayList(this.f389046e);
                        this.f389045d |= 1;
                    }
                    java.util.List list7 = this.f389046e;
                    list5 = b1Var.f72459xe0df8cb9;
                    list7.addAll(list5);
                }
                m20881x7bb163d5();
            }
        } else {
            list = b1Var.f72459xe0df8cb9;
            if (!list.isEmpty()) {
                if (this.f389047f.p()) {
                    this.f389047f.f126942a = null;
                    this.f389047f = null;
                    list3 = b1Var.f72459xe0df8cb9;
                    this.f389046e = list3;
                    this.f389045d &= -2;
                    z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                    this.f389047f = z17 ? d() : null;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f389047f;
                    list2 = b1Var.f72459xe0df8cb9;
                    p9Var.b(list2);
                }
            }
        }
        if (b1Var.m142646x5524565e()) {
            kg.p0 m142633xea6b5b1a = b1Var.m142633xea6b5b1a();
            kg.p0 p0Var = this.f389048g;
            if (p0Var != null) {
                kg.o0 m143101x3136c9db = kg.p0.m143101x3136c9db(p0Var);
                m143101x3136c9db.e(m142633xea6b5b1a);
                this.f389048g = m143101x3136c9db.mo20557x85702333();
            } else {
                this.f389048g = m142633xea6b5b1a;
            }
            m20881x7bb163d5();
        }
        if (b1Var.m142648x80c1f70a()) {
            kg.s1 m142644xc0ec8dce = b1Var.m142644xc0ec8dce();
            kg.s1 s1Var = this.f389049h;
            if (s1Var != null) {
                kg.r1 m143148x3136c9db = kg.s1.m143148x3136c9db(s1Var);
                m143148x3136c9db.e(m142644xc0ec8dce);
                this.f389049h = m143148x3136c9db.mo20557x85702333();
            } else {
                this.f389049h = m142644xc0ec8dce;
            }
            m20881x7bb163d5();
        }
        if (b1Var.m142647x2596791a()) {
            kg.t0 m142635xeabebad6 = b1Var.m142635xeabebad6();
            kg.t0 t0Var = this.f389050i;
            if (t0Var != null) {
                kg.s0 m143220x3136c9db = kg.t0.m143220x3136c9db(t0Var);
                m143220x3136c9db.e(m142635xeabebad6);
                this.f389050i = m143220x3136c9db.mo20557x85702333();
            } else {
                this.f389050i = m142635xeabebad6;
            }
            m20881x7bb163d5();
        }
        if (b1Var.m142642x8bd0edfc() != 0.0f) {
            this.f389051m = b1Var.m142642x8bd0edfc();
            m20881x7bb163d5();
        }
        if (b1Var.m142632xea2ec5f7() != 0) {
            this.f389052n = b1Var.m142632xea2ec5f7();
            m20881x7bb163d5();
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) b1Var).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return kg.b1.m142615x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return kg.q2.K;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.L;
        j6Var.c(kg.b1.class, kg.a1.class);
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
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (kg.a1) m45492xba8a5e4b(waVar);
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
        return kg.b1.m142615x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
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
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        kg.b1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    public a1(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean z17;
        this.f389046e = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof kg.b1) {
            f((kg.b1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof kg.b1) {
            f((kg.b1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
