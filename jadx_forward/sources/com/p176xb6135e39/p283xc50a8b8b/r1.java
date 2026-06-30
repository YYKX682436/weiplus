package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class r1 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126987e;

    /* renamed from: f, reason: collision with root package name */
    public int f126988f;

    /* renamed from: g, reason: collision with root package name */
    public int f126989g;

    /* renamed from: h, reason: collision with root package name */
    public int f126990h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f126991i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f126992m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f126993n;

    /* renamed from: o, reason: collision with root package name */
    public int f126994o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f126995p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.z1 f126996q;

    /* renamed from: r, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f126997r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f126998s;

    public r1(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126987e = "";
        this.f126989g = 1;
        this.f126990h = 1;
        this.f126991i = "";
        this.f126992m = "";
        this.f126993n = "";
        this.f126995p = "";
        m20889x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.u1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.u1 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = new com.p176xb6135e39.p283xc50a8b8b.u1(this, null);
        int i17 = this.f126986d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        u1Var.f127095e = this.f126987e;
        if ((i17 & 2) != 0) {
            u1Var.f127096f = this.f126988f;
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        u1Var.f127097g = this.f126989g;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        u1Var.f127098h = this.f126990h;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        u1Var.f127099i = this.f126991i;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        u1Var.f127100m = this.f126992m;
        if ((i17 & 64) != 0) {
            i18 |= 64;
        }
        u1Var.f127101n = this.f126993n;
        if ((i17 & 128) != 0) {
            u1Var.f127102o = this.f126994o;
            i18 |= 128;
        }
        if ((i17 & 256) != 0) {
            i18 |= 256;
        }
        u1Var.f127103p = this.f126995p;
        if ((i17 & 512) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126997r;
            if (t9Var == null) {
                u1Var.f127104q = this.f126996q;
            } else {
                u1Var.f127104q = (com.p176xb6135e39.p283xc50a8b8b.z1) t9Var.b();
            }
            i18 |= 512;
        }
        if ((i17 & 1024) != 0) {
            u1Var.f127105r = this.f126998s;
            i18 |= 1024;
        }
        u1Var.f127094d = i18;
        m20880xaf619bdf();
        return u1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20888x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.r1) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.r1 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.u1.f127093u     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.q1 r0 = (com.p176xb6135e39.p283xc50a8b8b.q1) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.u1 r2 = (com.p176xb6135e39.p283xc50a8b8b.u1) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.u1 r3 = (com.p176xb6135e39.p283xc50a8b8b.u1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.r1.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.r1");
    }

    public com.p176xb6135e39.p283xc50a8b8b.r1 e(com.p176xb6135e39.p283xc50a8b8b.u1 u1Var) {
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var;
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var2;
        if (u1Var == com.p176xb6135e39.p283xc50a8b8b.u1.f127092t) {
            return this;
        }
        if ((u1Var.f127094d & 1) != 0) {
            this.f126986d |= 1;
            this.f126987e = u1Var.f127095e;
            m20881x7bb163d5();
        }
        if ((u1Var.f127094d & 2) != 0) {
            int i17 = u1Var.f127096f;
            this.f126986d |= 2;
            this.f126988f = i17;
            m20881x7bb163d5();
        }
        if ((u1Var.f127094d & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.s1 a17 = com.p176xb6135e39.p283xc50a8b8b.s1.a(u1Var.f127097g);
            if (a17 == null) {
                a17 = com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL;
            }
            this.f126986d |= 4;
            this.f126989g = a17.f127018d;
            m20881x7bb163d5();
        }
        if (u1Var.p()) {
            com.p176xb6135e39.p283xc50a8b8b.t1 a18 = com.p176xb6135e39.p283xc50a8b8b.t1.a(u1Var.f127098h);
            if (a18 == null) {
                a18 = com.p176xb6135e39.p283xc50a8b8b.t1.TYPE_DOUBLE;
            }
            this.f126986d |= 8;
            this.f126990h = a18.f127066d;
            m20881x7bb163d5();
        }
        if (u1Var.q()) {
            this.f126986d |= 16;
            this.f126991i = u1Var.f127099i;
            m20881x7bb163d5();
        }
        if (u1Var.l()) {
            this.f126986d |= 32;
            this.f126992m = u1Var.f127100m;
            m20881x7bb163d5();
        }
        if (u1Var.k()) {
            this.f126986d |= 64;
            this.f126993n = u1Var.f127101n;
            m20881x7bb163d5();
        }
        if (u1Var.n()) {
            int i18 = u1Var.f127102o;
            this.f126986d |= 128;
            this.f126994o = i18;
            m20881x7bb163d5();
        }
        if (u1Var.m()) {
            this.f126986d |= 256;
            this.f126995p = u1Var.f127103p;
            m20881x7bb163d5();
        }
        if (u1Var.o()) {
            com.p176xb6135e39.p283xc50a8b8b.z1 i19 = u1Var.i();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126997r;
            if (t9Var == null) {
                if ((this.f126986d & 512) == 0 || (z1Var = this.f126996q) == null || z1Var == (z1Var2 = com.p176xb6135e39.p283xc50a8b8b.z1.f127291q)) {
                    this.f126996q = i19;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.w1 mo20599xaaa148a0 = z1Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(z1Var);
                    mo20599xaaa148a0.l(i19);
                    this.f126996q = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(i19);
            }
            this.f126986d |= 512;
        }
        if ((u1Var.f127094d & 1024) != 0) {
            boolean z17 = u1Var.f127105r;
            this.f126986d |= 1024;
            this.f126998s = z17;
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.u1.f127092t;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126925k;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126926l;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.u1.class, com.p176xb6135e39.p283xc50a8b8b.r1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var;
        if ((this.f126986d & 512) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126997r;
            if (t9Var == null) {
                z1Var = this.f126996q;
                if (z1Var == null) {
                    z1Var = com.p176xb6135e39.p283xc50a8b8b.z1.f127291q;
                }
            } else {
                z1Var = (com.p176xb6135e39.p283xc50a8b8b.z1) t9Var.e();
            }
            if (!z1Var.mo20562xf582434a()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20889x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a && (t9Var = this.f126997r) == null) {
            if (t9Var == null) {
                z1Var = this.f126996q;
                if (z1Var == null) {
                    z1Var = com.p176xb6135e39.p283xc50a8b8b.z1.f127291q;
                }
            } else {
                z1Var = (com.p176xb6135e39.p283xc50a8b8b.z1) t9Var.e();
            }
            this.f126997r = new com.p176xb6135e39.p283xc50a8b8b.t9(z1Var, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126996q = null;
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
        return (com.p176xb6135e39.p283xc50a8b8b.r1) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.u1.f127092t;
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
        com.p176xb6135e39.p283xc50a8b8b.u1 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.u1) {
            e((com.p176xb6135e39.p283xc50a8b8b.u1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.u1) {
            e((com.p176xb6135e39.p283xc50a8b8b.u1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public r1(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126987e = "";
        this.f126989g = 1;
        this.f126990h = 1;
        this.f126991i = "";
        this.f126992m = "";
        this.f126993n = "";
        this.f126995p = "";
        m20889x73fef578();
    }
}
