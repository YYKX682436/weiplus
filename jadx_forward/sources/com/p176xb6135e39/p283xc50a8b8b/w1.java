package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class w1 extends com.p176xb6135e39.p283xc50a8b8b.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f127166e;

    /* renamed from: f, reason: collision with root package name */
    public int f127167f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f127168g;

    /* renamed from: h, reason: collision with root package name */
    public int f127169h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f127170i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f127171m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f127172n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f127173o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f127174p;

    public w1(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        this.f127167f = 0;
        this.f127169h = 0;
        this.f127173o = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.w1) c(b4Var, obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.z1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    /* renamed from: clone */
    public java.lang.Object m20937x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.w1) m135757x5a5dd5d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.z1.f127291q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.C;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.z1 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var = new com.p176xb6135e39.p283xc50a8b8b.z1(this, null);
        int i17 = this.f127166e;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        z1Var.f127294f = this.f127167f;
        if ((i17 & 2) != 0) {
            z1Var.f127295g = this.f127168g;
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        z1Var.f127296h = this.f127169h;
        if ((i17 & 8) != 0) {
            z1Var.f127297i = this.f127170i;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            z1Var.f127298m = this.f127171m;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            z1Var.f127299n = this.f127172n;
            i18 |= 32;
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127174p;
        if (p9Var == null) {
            if ((i17 & 64) != 0) {
                this.f127173o = java.util.Collections.unmodifiableList(this.f127173o);
                this.f127166e &= -65;
            }
            z1Var.f127300o = this.f127173o;
        } else {
            z1Var.f127300o = p9Var.g();
        }
        z1Var.f127293e = i18;
        m20880xaf619bdf();
        return z1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.D;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.z1.class, com.p176xb6135e39.p283xc50a8b8b.w1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127174p;
            if (i17 >= (p9Var == null ? this.f127173o.size() : p9Var.l())) {
                return e();
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f127174p;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.o3) this.f127173o.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.o3) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
        }
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 j() {
        if (this.f127174p == null) {
            this.f127174p = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f127173o, (this.f127166e & 64) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127173o = null;
        }
        return this.f127174p;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.w1 k(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.z1.f127292r     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.v1 r0 = (com.p176xb6135e39.p283xc50a8b8b.v1) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.z1 r2 = (com.p176xb6135e39.p283xc50a8b8b.z1) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.z1 r3 = (com.p176xb6135e39.p283xc50a8b8b.z1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.w1.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.w1");
    }

    public com.p176xb6135e39.p283xc50a8b8b.w1 l(com.p176xb6135e39.p283xc50a8b8b.z1 z1Var) {
        if (z1Var == com.p176xb6135e39.p283xc50a8b8b.z1.f127291q) {
            return this;
        }
        if ((z1Var.f127293e & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.x1 a17 = com.p176xb6135e39.p283xc50a8b8b.x1.a(z1Var.f127294f);
            if (a17 == null) {
                a17 = com.p176xb6135e39.p283xc50a8b8b.x1.STRING;
            }
            this.f127166e |= 1;
            this.f127167f = a17.f127204d;
            m20881x7bb163d5();
        }
        if (z1Var.k()) {
            boolean z17 = z1Var.f127295g;
            this.f127166e |= 2;
            this.f127168g = z17;
            m20881x7bb163d5();
        }
        if ((z1Var.f127293e & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.y1 a18 = com.p176xb6135e39.p283xc50a8b8b.y1.a(z1Var.f127296h);
            if (a18 == null) {
                a18 = com.p176xb6135e39.p283xc50a8b8b.y1.JS_NORMAL;
            }
            this.f127166e |= 4;
            this.f127169h = a18.f127252d;
            m20881x7bb163d5();
        }
        if ((z1Var.f127293e & 8) != 0) {
            boolean z18 = z1Var.f127297i;
            this.f127166e |= 8;
            this.f127170i = z18;
            m20881x7bb163d5();
        }
        if ((z1Var.f127293e & 16) != 0) {
            boolean z19 = z1Var.f127298m;
            this.f127166e |= 16;
            this.f127171m = z19;
            m20881x7bb163d5();
        }
        if ((z1Var.f127293e & 32) != 0) {
            boolean z27 = z1Var.f127299n;
            this.f127166e |= 32;
            this.f127172n = z27;
            m20881x7bb163d5();
        }
        if (this.f127174p == null) {
            if (!z1Var.f127300o.isEmpty()) {
                if (this.f127173o.isEmpty()) {
                    this.f127173o = z1Var.f127300o;
                    this.f127166e &= -65;
                } else {
                    if ((this.f127166e & 64) == 0) {
                        this.f127173o = new java.util.ArrayList(this.f127173o);
                        this.f127166e |= 64;
                    }
                    this.f127173o.addAll(z1Var.f127300o);
                }
                m20881x7bb163d5();
            }
        } else if (!z1Var.f127300o.isEmpty()) {
            if (this.f127174p.p()) {
                this.f127174p.f126942a = null;
                this.f127174p = null;
                this.f127173o = z1Var.f127300o;
                this.f127166e &= -65;
                this.f127174p = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? j() : null;
            } else {
                this.f127174p.b(z1Var.f127300o);
            }
        }
        f(z1Var);
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
        return (com.p176xb6135e39.p283xc50a8b8b.w1) m135798xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.w1) g(b4Var, obj);
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
        return com.p176xb6135e39.p283xc50a8b8b.z1.f127291q;
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
        com.p176xb6135e39.p283xc50a8b8b.z1 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.z1) {
            l((com.p176xb6135e39.p283xc50a8b8b.z1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public w1(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f127167f = 0;
        this.f127169h = 0;
        this.f127173o = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.z1) {
            l((com.p176xb6135e39.p283xc50a8b8b.z1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
