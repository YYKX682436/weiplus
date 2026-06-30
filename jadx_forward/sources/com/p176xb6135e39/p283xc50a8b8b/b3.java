package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class b3 extends com.p176xb6135e39.p283xc50a8b8b.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f126436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126437f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f126438g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126439h;

    public b3(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        this.f126438g = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.b3) c(b4Var, obj);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.c3 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    /* renamed from: clone */
    public java.lang.Object m20567x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.b3) m135757x5a5dd5d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.c3.f126500i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.K;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.c3 mo20557x85702333() {
        int i17;
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var = new com.p176xb6135e39.p283xc50a8b8b.c3(this, null);
        int i18 = this.f126436e;
        if ((i18 & 1) != 0) {
            c3Var.f126503f = this.f126437f;
            i17 = 1;
        } else {
            i17 = 0;
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126439h;
        if (p9Var == null) {
            if ((i18 & 2) != 0) {
                this.f126438g = java.util.Collections.unmodifiableList(this.f126438g);
                this.f126436e &= -3;
            }
            c3Var.f126504g = this.f126438g;
        } else {
            c3Var.f126504g = p9Var.g();
        }
        c3Var.f126502e = i17;
        m20880xaf619bdf();
        return c3Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.L;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.c3.class, com.p176xb6135e39.p283xc50a8b8b.b3.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126439h;
            if (i17 >= (p9Var == null ? this.f126438g.size() : p9Var.l())) {
                return e();
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126439h;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.o3) this.f126438g.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.o3) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
        }
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 j() {
        if (this.f126439h == null) {
            this.f126439h = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126438g, (this.f126436e & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126438g = null;
        }
        return this.f126439h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.b3 k(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.c3.f126501m     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.a3 r0 = (com.p176xb6135e39.p283xc50a8b8b.a3) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.c3 r2 = (com.p176xb6135e39.p283xc50a8b8b.c3) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.c3 r3 = (com.p176xb6135e39.p283xc50a8b8b.c3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.b3.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.b3");
    }

    public com.p176xb6135e39.p283xc50a8b8b.b3 l(com.p176xb6135e39.p283xc50a8b8b.c3 c3Var) {
        if (c3Var == com.p176xb6135e39.p283xc50a8b8b.c3.f126500i) {
            return this;
        }
        if ((c3Var.f126502e & 1) != 0) {
            boolean z17 = c3Var.f126503f;
            this.f126436e = 1 | this.f126436e;
            this.f126437f = z17;
            m20881x7bb163d5();
        }
        if (this.f126439h == null) {
            if (!c3Var.f126504g.isEmpty()) {
                if (this.f126438g.isEmpty()) {
                    this.f126438g = c3Var.f126504g;
                    this.f126436e &= -3;
                } else {
                    if ((this.f126436e & 2) == 0) {
                        this.f126438g = new java.util.ArrayList(this.f126438g);
                        this.f126436e |= 2;
                    }
                    this.f126438g.addAll(c3Var.f126504g);
                }
                m20881x7bb163d5();
            }
        } else if (!c3Var.f126504g.isEmpty()) {
            if (this.f126439h.p()) {
                this.f126439h.f126942a = null;
                this.f126439h = null;
                this.f126438g = c3Var.f126504g;
                this.f126436e &= -3;
                this.f126439h = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? j() : null;
            } else {
                this.f126439h.b(c3Var.f126504g);
            }
        }
        f(c3Var);
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
        return (com.p176xb6135e39.p283xc50a8b8b.b3) m135798xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        return (com.p176xb6135e39.p283xc50a8b8b.b3) g(b4Var, obj);
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
        return com.p176xb6135e39.p283xc50a8b8b.c3.f126500i;
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
        com.p176xb6135e39.p283xc50a8b8b.c3 mo20557x85702333 = mo20557x85702333();
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

    public b3(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126438g = java.util.Collections.emptyList();
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.c3) {
            l((com.p176xb6135e39.p283xc50a8b8b.c3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.c3) {
            l((com.p176xb6135e39.p283xc50a8b8b.c3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
