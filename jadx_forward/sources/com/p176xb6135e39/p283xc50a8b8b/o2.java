package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class o2 extends com.p176xb6135e39.p283xc50a8b8b.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f126880e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126881f;

    /* renamed from: g, reason: collision with root package name */
    public int f126882g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f126883h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126884i;

    public o2(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        this.f126882g = 0;
        this.f126883h = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.o2) c(b4Var, obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.q2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    /* renamed from: clone */
    public java.lang.Object m20849x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.o2) m135757x5a5dd5d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.q2.f126972m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.M;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.q2 mo20557x85702333() {
        int i17;
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var = new com.p176xb6135e39.p283xc50a8b8b.q2(this, null);
        int i18 = this.f126880e;
        if ((i18 & 1) != 0) {
            q2Var.f126975f = this.f126881f;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        q2Var.f126976g = this.f126882g;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126884i;
        if (p9Var == null) {
            if ((i18 & 4) != 0) {
                this.f126883h = java.util.Collections.unmodifiableList(this.f126883h);
                this.f126880e &= -5;
            }
            q2Var.f126977h = this.f126883h;
        } else {
            q2Var.f126977h = p9Var.g();
        }
        q2Var.f126974e = i17;
        m20880xaf619bdf();
        return q2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.N;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.q2.class, com.p176xb6135e39.p283xc50a8b8b.o2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126884i;
            if (i17 >= (p9Var == null ? this.f126883h.size() : p9Var.l())) {
                return e();
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126884i;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.o3) this.f126883h.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.o3) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
        }
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 j() {
        if (this.f126884i == null) {
            this.f126884i = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126883h, (this.f126880e & 4) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126883h = null;
        }
        return this.f126884i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.o2 k(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.q2.f126973n     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.n2 r0 = (com.p176xb6135e39.p283xc50a8b8b.n2) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.q2 r2 = (com.p176xb6135e39.p283xc50a8b8b.q2) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.q2 r3 = (com.p176xb6135e39.p283xc50a8b8b.q2) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.l(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.o2.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.o2");
    }

    public com.p176xb6135e39.p283xc50a8b8b.o2 l(com.p176xb6135e39.p283xc50a8b8b.q2 q2Var) {
        if (q2Var == com.p176xb6135e39.p283xc50a8b8b.q2.f126972m) {
            return this;
        }
        if ((q2Var.f126974e & 1) != 0) {
            boolean z17 = q2Var.f126975f;
            this.f126880e |= 1;
            this.f126881f = z17;
            m20881x7bb163d5();
        }
        if ((q2Var.f126974e & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.p2 a17 = com.p176xb6135e39.p283xc50a8b8b.p2.a(q2Var.f126976g);
            if (a17 == null) {
                a17 = com.p176xb6135e39.p283xc50a8b8b.p2.IDEMPOTENCY_UNKNOWN;
            }
            this.f126880e |= 2;
            this.f126882g = a17.f126913d;
            m20881x7bb163d5();
        }
        if (this.f126884i == null) {
            if (!q2Var.f126977h.isEmpty()) {
                if (this.f126883h.isEmpty()) {
                    this.f126883h = q2Var.f126977h;
                    this.f126880e &= -5;
                } else {
                    if ((this.f126880e & 4) == 0) {
                        this.f126883h = new java.util.ArrayList(this.f126883h);
                        this.f126880e |= 4;
                    }
                    this.f126883h.addAll(q2Var.f126977h);
                }
                m20881x7bb163d5();
            }
        } else if (!q2Var.f126977h.isEmpty()) {
            if (this.f126884i.p()) {
                this.f126884i.f126942a = null;
                this.f126884i = null;
                this.f126883h = q2Var.f126977h;
                this.f126880e &= -5;
                this.f126884i = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? j() : null;
            } else {
                this.f126884i.b(q2Var.f126977h);
            }
        }
        f(q2Var);
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m135798xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.o2) m135798xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.o2) g(b4Var, obj);
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
        return com.p176xb6135e39.p283xc50a8b8b.q2.f126972m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
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
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.q2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.q2) {
            l((com.p176xb6135e39.p283xc50a8b8b.q2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public o2(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126882g = 0;
        this.f126883h = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.q2) {
            l((com.p176xb6135e39.p283xc50a8b8b.q2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
