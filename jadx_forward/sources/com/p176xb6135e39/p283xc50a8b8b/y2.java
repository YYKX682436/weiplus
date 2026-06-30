package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class y2 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f127253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f127254e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f127255f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f127256g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.c3 f127257h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f127258i;

    public y2(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f127254e = "";
        this.f127255f = java.util.Collections.emptyList();
        m20963x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.z2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.z2 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.z2 z2Var = new com.p176xb6135e39.p283xc50a8b8b.z2(this, null);
        int i17 = this.f127253d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        z2Var.f127305e = this.f127254e;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127256g;
        if (p9Var == null) {
            if ((this.f127253d & 2) != 0) {
                this.f127255f = java.util.Collections.unmodifiableList(this.f127255f);
                this.f127253d &= -3;
            }
            z2Var.f127306f = this.f127255f;
        } else {
            z2Var.f127306f = p9Var.g();
        }
        if ((i17 & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127258i;
            if (t9Var == null) {
                z2Var.f127307g = this.f127257h;
            } else {
                z2Var.f127307g = (com.p176xb6135e39.p283xc50a8b8b.c3) t9Var.b();
            }
            i18 |= 2;
        }
        z2Var.f127304d = i18;
        m20880xaf619bdf();
        return z2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20962x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.y2) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f127256g == null) {
            this.f127256g = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f127255f, (this.f127253d & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f127255f = null;
        }
        return this.f127256g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.y2 e(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.z2.f127303m     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.x2 r0 = (com.p176xb6135e39.p283xc50a8b8b.x2) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.z2 r2 = (com.p176xb6135e39.p283xc50a8b8b.z2) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.z2 r3 = (com.p176xb6135e39.p283xc50a8b8b.z2) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.f(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.y2.e(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.y2");
    }

    public com.p176xb6135e39.p283xc50a8b8b.y2 f(com.p176xb6135e39.p283xc50a8b8b.z2 z2Var) {
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var;
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var2;
        if (z2Var == com.p176xb6135e39.p283xc50a8b8b.z2.f127302i) {
            return this;
        }
        if ((z2Var.f127304d & 1) != 0) {
            this.f127253d |= 1;
            this.f127254e = z2Var.f127305e;
            m20881x7bb163d5();
        }
        if (this.f127256g == null) {
            if (!z2Var.f127306f.isEmpty()) {
                if (this.f127255f.isEmpty()) {
                    this.f127255f = z2Var.f127306f;
                    this.f127253d &= -3;
                } else {
                    if ((this.f127253d & 2) == 0) {
                        this.f127255f = new java.util.ArrayList(this.f127255f);
                        this.f127253d |= 2;
                    }
                    this.f127255f.addAll(z2Var.f127306f);
                }
                m20881x7bb163d5();
            }
        } else if (!z2Var.f127306f.isEmpty()) {
            if (this.f127256g.p()) {
                this.f127256g.f126942a = null;
                this.f127256g = null;
                this.f127255f = z2Var.f127306f;
                this.f127253d &= -3;
                this.f127256g = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? d() : null;
            } else {
                this.f127256g.b(z2Var.f127306f);
            }
        }
        if (z2Var.g()) {
            com.p176xb6135e39.p283xc50a8b8b.c3 f17 = z2Var.f();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127258i;
            if (t9Var == null) {
                if ((this.f127253d & 4) == 0 || (c3Var = this.f127257h) == null || c3Var == (c3Var2 = com.p176xb6135e39.p283xc50a8b8b.c3.f126500i)) {
                    this.f127257h = f17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.b3 mo20599xaaa148a0 = c3Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(c3Var);
                    mo20599xaaa148a0.l(f17);
                    this.f127257h = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(f17);
            }
            this.f127253d |= 4;
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.z2.f127302i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126935u;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126936v;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.z2.class, com.p176xb6135e39.p283xc50a8b8b.y2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var;
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f127256g;
            if (i17 >= (p9Var == null ? this.f127255f.size() : p9Var.l())) {
                if ((this.f127253d & 4) != 0) {
                    com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127258i;
                    if (t9Var == null) {
                        c3Var = this.f127257h;
                        if (c3Var == null) {
                            c3Var = com.p176xb6135e39.p283xc50a8b8b.c3.f126500i;
                        }
                    } else {
                        c3Var = (com.p176xb6135e39.p283xc50a8b8b.c3) t9Var.e();
                    }
                    if (!c3Var.mo20562xf582434a()) {
                        return false;
                    }
                }
                return true;
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f127256g;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.m2) this.f127255f.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.m2) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
        }
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20963x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            d();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f127258i;
            if (t9Var == null) {
                if (t9Var == null) {
                    c3Var = this.f127257h;
                    if (c3Var == null) {
                        c3Var = com.p176xb6135e39.p283xc50a8b8b.c3.f126500i;
                    }
                } else {
                    c3Var = (com.p176xb6135e39.p283xc50a8b8b.c3) t9Var.e();
                }
                this.f127258i = new com.p176xb6135e39.p283xc50a8b8b.t9(c3Var, m20872x3e6b6e28(), m20879x7a8e633f());
                this.f127257h = null;
            }
        }
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
        return (com.p176xb6135e39.p283xc50a8b8b.y2) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.z2.f127302i;
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
        com.p176xb6135e39.p283xc50a8b8b.z2 mo20557x85702333 = mo20557x85702333();
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

    public y2(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f127254e = "";
        this.f127255f = java.util.Collections.emptyList();
        m20963x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.z2) {
            f((com.p176xb6135e39.p283xc50a8b8b.z2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.z2) {
            f((com.p176xb6135e39.p283xc50a8b8b.z2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
