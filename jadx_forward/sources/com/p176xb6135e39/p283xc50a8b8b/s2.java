package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class s2 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f127019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f127020e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.w2 f127021f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f127022g;

    public s2(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f127020e = "";
        m20898x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.t2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.t2 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.t2 t2Var = new com.p176xb6135e39.p283xc50a8b8b.t2(this, null);
        int i17 = this.f127019d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        t2Var.f127070e = this.f127020e;
        if ((i17 & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127022g;
            if (t9Var == null) {
                t2Var.f127071f = this.f127021f;
            } else {
                t2Var.f127071f = (com.p176xb6135e39.p283xc50a8b8b.w2) t9Var.b();
            }
            i18 |= 2;
        }
        t2Var.f127069d = i18;
        m20880xaf619bdf();
        return t2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20897x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.s2) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.s2 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.t2.f127068i     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.r2 r0 = (com.p176xb6135e39.p283xc50a8b8b.r2) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.t2 r2 = (com.p176xb6135e39.p283xc50a8b8b.t2) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.t2 r3 = (com.p176xb6135e39.p283xc50a8b8b.t2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.s2.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.s2");
    }

    public com.p176xb6135e39.p283xc50a8b8b.s2 e(com.p176xb6135e39.p283xc50a8b8b.t2 t2Var) {
        com.p176xb6135e39.p283xc50a8b8b.w2 w2Var;
        com.p176xb6135e39.p283xc50a8b8b.w2 w2Var2;
        if (t2Var == com.p176xb6135e39.p283xc50a8b8b.t2.f127067h) {
            return this;
        }
        if ((t2Var.f127069d & 1) != 0) {
            this.f127019d |= 1;
            this.f127020e = t2Var.f127070e;
            m20881x7bb163d5();
        }
        if (t2Var.g()) {
            com.p176xb6135e39.p283xc50a8b8b.w2 f17 = t2Var.f();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127022g;
            if (t9Var == null) {
                if ((this.f127019d & 2) == 0 || (w2Var = this.f127021f) == null || w2Var == (w2Var2 = com.p176xb6135e39.p283xc50a8b8b.w2.f127175g)) {
                    this.f127021f = f17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.v2 mo20599xaaa148a0 = w2Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(w2Var);
                    mo20599xaaa148a0.l(f17);
                    this.f127021f = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(f17);
            }
            this.f127019d |= 2;
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.t2.f127067h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126927m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126928n;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.t2.class, com.p176xb6135e39.p283xc50a8b8b.s2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.w2 w2Var;
        if ((this.f127019d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127022g;
            if (t9Var == null) {
                w2Var = this.f127021f;
                if (w2Var == null) {
                    w2Var = com.p176xb6135e39.p283xc50a8b8b.w2.f127175g;
                }
            } else {
                w2Var = (com.p176xb6135e39.p283xc50a8b8b.w2) t9Var.e();
            }
            if (!w2Var.mo20562xf582434a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20898x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        com.p176xb6135e39.p283xc50a8b8b.w2 w2Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a && (t9Var = this.f127022g) == null) {
            if (t9Var == null) {
                w2Var = this.f127021f;
                if (w2Var == null) {
                    w2Var = com.p176xb6135e39.p283xc50a8b8b.w2.f127175g;
                }
            } else {
                w2Var = (com.p176xb6135e39.p283xc50a8b8b.w2) t9Var.e();
            }
            this.f127022g = new com.p176xb6135e39.p283xc50a8b8b.t9(w2Var, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127021f = null;
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
        return (com.p176xb6135e39.p283xc50a8b8b.s2) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.t2.f127067h;
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.j8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    public s2(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f127020e = "";
        m20898x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.t2 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.t2) {
            e((com.p176xb6135e39.p283xc50a8b8b.t2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.t2) {
            e((com.p176xb6135e39.p283xc50a8b8b.t2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
