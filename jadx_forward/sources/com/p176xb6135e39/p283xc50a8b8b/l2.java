package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class l2 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126811d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126812e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f126813f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f126814g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.q2 f126815h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f126816i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126817m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f126818n;

    public l2(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126812e = "";
        this.f126813f = "";
        this.f126814g = "";
        m20734x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.m2 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.m2 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.m2 m2Var = new com.p176xb6135e39.p283xc50a8b8b.m2(this, null);
        int i17 = this.f126811d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        m2Var.f126850e = this.f126812e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        m2Var.f126851f = this.f126813f;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        m2Var.f126852g = this.f126814g;
        if ((i17 & 8) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126816i;
            if (t9Var == null) {
                m2Var.f126853h = this.f126815h;
            } else {
                m2Var.f126853h = (com.p176xb6135e39.p283xc50a8b8b.q2) t9Var.b();
            }
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            m2Var.f126854i = this.f126817m;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            m2Var.f126855m = this.f126818n;
            i18 |= 32;
        }
        m2Var.f126849d = i18;
        m20880xaf619bdf();
        return m2Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20733x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.l2) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.l2 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.m2.f126848p     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.k2 r0 = (com.p176xb6135e39.p283xc50a8b8b.k2) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.m2 r2 = (com.p176xb6135e39.p283xc50a8b8b.m2) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.m2 r3 = (com.p176xb6135e39.p283xc50a8b8b.m2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.l2.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.l2");
    }

    public com.p176xb6135e39.p283xc50a8b8b.l2 e(com.p176xb6135e39.p283xc50a8b8b.m2 m2Var) {
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var;
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var2;
        if (m2Var == com.p176xb6135e39.p283xc50a8b8b.m2.f126847o) {
            return this;
        }
        if ((m2Var.f126849d & 1) != 0) {
            this.f126811d |= 1;
            this.f126812e = m2Var.f126850e;
            m20881x7bb163d5();
        }
        if ((m2Var.f126849d & 2) != 0) {
            this.f126811d |= 2;
            this.f126813f = m2Var.f126851f;
            m20881x7bb163d5();
        }
        if ((m2Var.f126849d & 4) != 0) {
            this.f126811d |= 4;
            this.f126814g = m2Var.f126852g;
            m20881x7bb163d5();
        }
        if (m2Var.i()) {
            com.p176xb6135e39.p283xc50a8b8b.q2 g17 = m2Var.g();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126816i;
            if (t9Var == null) {
                if ((this.f126811d & 8) == 0 || (q2Var = this.f126815h) == null || q2Var == (q2Var2 = com.p176xb6135e39.p283xc50a8b8b.q2.f126972m)) {
                    this.f126815h = g17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.o2 mo20599xaaa148a0 = q2Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(q2Var);
                    mo20599xaaa148a0.l(g17);
                    this.f126815h = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(g17);
            }
            this.f126811d |= 8;
        }
        if ((m2Var.f126849d & 16) != 0) {
            boolean z17 = m2Var.f126854i;
            this.f126811d |= 16;
            this.f126817m = z17;
            m20881x7bb163d5();
        }
        if ((m2Var.f126849d & 32) != 0) {
            boolean z18 = m2Var.f126855m;
            this.f126811d |= 32;
            this.f126818n = z18;
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.m2.f126847o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126937w;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126938x;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.m2.class, com.p176xb6135e39.p283xc50a8b8b.l2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var;
        if ((this.f126811d & 8) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126816i;
            if (t9Var == null) {
                q2Var = this.f126815h;
                if (q2Var == null) {
                    q2Var = com.p176xb6135e39.p283xc50a8b8b.q2.f126972m;
                }
            } else {
                q2Var = (com.p176xb6135e39.p283xc50a8b8b.q2) t9Var.e();
            }
            if (!q2Var.mo20562xf582434a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20734x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a && (t9Var = this.f126816i) == null) {
            if (t9Var == null) {
                q2Var = this.f126815h;
                if (q2Var == null) {
                    q2Var = com.p176xb6135e39.p283xc50a8b8b.q2.f126972m;
                }
            } else {
                q2Var = (com.p176xb6135e39.p283xc50a8b8b.q2) t9Var.e();
            }
            this.f126816i = new com.p176xb6135e39.p283xc50a8b8b.t9(q2Var, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126815h = null;
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
        return (com.p176xb6135e39.p283xc50a8b8b.l2) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.m2.f126847o;
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.m2 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.m2) {
            e((com.p176xb6135e39.p283xc50a8b8b.m2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public l2(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126812e = "";
        this.f126813f = "";
        this.f126814g = "";
        m20734x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.m2) {
            e((com.p176xb6135e39.p283xc50a8b8b.m2) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
