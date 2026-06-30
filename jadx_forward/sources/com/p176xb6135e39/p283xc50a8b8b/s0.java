package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class s0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f127009d;

    /* renamed from: e, reason: collision with root package name */
    public int f127010e;

    /* renamed from: f, reason: collision with root package name */
    public int f127011f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p1 f127012g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f127013h;

    public s0(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        m20893x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.t0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.t0 mo20557x85702333() {
        int i17;
        com.p176xb6135e39.p283xc50a8b8b.t0 t0Var = new com.p176xb6135e39.p283xc50a8b8b.t0(this, null);
        int i18 = this.f127009d;
        if ((i18 & 1) != 0) {
            t0Var.f127043e = this.f127010e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            t0Var.f127044f = this.f127011f;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127013h;
            if (t9Var == null) {
                t0Var.f127045g = this.f127012g;
            } else {
                t0Var.f127045g = (com.p176xb6135e39.p283xc50a8b8b.p1) t9Var.b();
            }
            i17 |= 4;
        }
        t0Var.f127042d = i17;
        m20880xaf619bdf();
        return t0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20892x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.s0) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.s0 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.t0.f127041m     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.r0 r0 = (com.p176xb6135e39.p283xc50a8b8b.r0) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.t0 r2 = (com.p176xb6135e39.p283xc50a8b8b.t0) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.t0 r3 = (com.p176xb6135e39.p283xc50a8b8b.t0) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.e(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.s0.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.s0");
    }

    public com.p176xb6135e39.p283xc50a8b8b.s0 e(com.p176xb6135e39.p283xc50a8b8b.t0 t0Var) {
        com.p176xb6135e39.p283xc50a8b8b.p1 p1Var;
        com.p176xb6135e39.p283xc50a8b8b.p1 p1Var2;
        if (t0Var == com.p176xb6135e39.p283xc50a8b8b.t0.f127040i) {
            return this;
        }
        if ((t0Var.f127042d & 1) != 0) {
            int i17 = t0Var.f127043e;
            this.f127009d |= 1;
            this.f127010e = i17;
            m20881x7bb163d5();
        }
        if ((t0Var.f127042d & 2) != 0) {
            int i18 = t0Var.f127044f;
            this.f127009d |= 2;
            this.f127011f = i18;
            m20881x7bb163d5();
        }
        if (t0Var.g()) {
            com.p176xb6135e39.p283xc50a8b8b.p1 f17 = t0Var.f();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127013h;
            if (t9Var == null) {
                if ((this.f127009d & 4) == 0 || (p1Var = this.f127012g) == null || p1Var == (p1Var2 = com.p176xb6135e39.p283xc50a8b8b.p1.f126905g)) {
                    this.f127012g = f17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.o1 mo20599xaaa148a0 = p1Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(p1Var);
                    mo20599xaaa148a0.l(f17);
                    this.f127012g = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(f17);
            }
            this.f127009d |= 4;
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.t0.f127040i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126919e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126920f;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.t0.class, com.p176xb6135e39.p283xc50a8b8b.s0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.p1 p1Var;
        if ((this.f127009d & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127013h;
            if (t9Var == null) {
                p1Var = this.f127012g;
                if (p1Var == null) {
                    p1Var = com.p176xb6135e39.p283xc50a8b8b.p1.f126905g;
                }
            } else {
                p1Var = (com.p176xb6135e39.p283xc50a8b8b.p1) t9Var.e();
            }
            if (!p1Var.mo20562xf582434a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20893x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        com.p176xb6135e39.p283xc50a8b8b.p1 p1Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a && (t9Var = this.f127013h) == null) {
            if (t9Var == null) {
                p1Var = this.f127012g;
                if (p1Var == null) {
                    p1Var = com.p176xb6135e39.p283xc50a8b8b.p1.f126905g;
                }
            } else {
                p1Var = (com.p176xb6135e39.p283xc50a8b8b.p1) t9Var.e();
            }
            this.f127013h = new com.p176xb6135e39.p283xc50a8b8b.t9(p1Var, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127012g = null;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.s0) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.t0.f127040i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    public s0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        m20893x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.j8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.t0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.t0) {
            e((com.p176xb6135e39.p283xc50a8b8b.t0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.t0) {
            e((com.p176xb6135e39.p283xc50a8b8b.t0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
