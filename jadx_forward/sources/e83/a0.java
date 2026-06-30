package e83;

/* loaded from: classes16.dex */
public final class a0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f331624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f331626f;

    /* renamed from: g, reason: collision with root package name */
    public int f331627g;

    /* renamed from: h, reason: collision with root package name */
    public int f331628h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f331629i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f331630m;

    /* renamed from: n, reason: collision with root package name */
    public int f331631n;

    /* renamed from: o, reason: collision with root package name */
    public e83.j f331632o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f331633p;

    public a0(e83.a aVar) {
        super(null);
        this.f331625e = "";
        this.f331626f = "";
        this.f331629i = "";
        this.f331630m = "";
        m127148x73fef578();
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
        e83.b0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.b0 mo20557x85702333() {
        e83.b0 b0Var = new e83.b0(this, null);
        int i17 = this.f331624d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        b0Var.f331637e = this.f331625e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        b0Var.f331638f = this.f331626f;
        if ((i17 & 4) != 0) {
            b0Var.f331639g = this.f331627g;
            i18 |= 4;
        }
        if ((i17 & 8) != 0) {
            b0Var.f331640h = this.f331628h;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        b0Var.f331641i = this.f331629i;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        b0Var.f331642m = this.f331630m;
        if ((i17 & 64) != 0) {
            b0Var.f331643n = this.f331631n;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331633p;
            if (t9Var == null) {
                b0Var.f331644o = this.f331632o;
            } else {
                b0Var.f331644o = (e83.j) t9Var.b();
            }
            i18 |= 128;
        }
        b0Var.f331636d = i18;
        m20880xaf619bdf();
        return b0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m127147x5a5dd5d() {
        return (e83.a0) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.a0 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.b0.f331635r     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.z r0 = (e83.z) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.b0 r2 = (e83.b0) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            e83.b0 r3 = (e83.b0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: e83.a0.d(com.google.protobuf.d0, com.google.protobuf.t4):e83.a0");
    }

    public e83.a0 e(e83.b0 b0Var) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        e83.j jVar;
        e83.j jVar2;
        if (b0Var == e83.b0.f331634q) {
            return this;
        }
        if ((b0Var.f331636d & 1) != 0) {
            this.f331624d |= 1;
            this.f331625e = b0Var.f331637e;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 2) != 0) {
            this.f331624d |= 2;
            this.f331626f = b0Var.f331638f;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 4) != 0) {
            int i17 = b0Var.f331639g;
            this.f331624d |= 4;
            this.f331627g = i17;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 8) != 0) {
            int i18 = b0Var.f331640h;
            this.f331624d |= 8;
            this.f331628h = i18;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 16) != 0) {
            this.f331624d |= 16;
            this.f331629i = b0Var.f331641i;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 32) != 0) {
            this.f331624d |= 32;
            this.f331630m = b0Var.f331642m;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 64) != 0) {
            int i19 = b0Var.f331643n;
            this.f331624d |= 64;
            this.f331631n = i19;
            m20881x7bb163d5();
        }
        if ((b0Var.f331636d & 128) != 0) {
            e83.j h17 = b0Var.h();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331633p;
            if (t9Var == null) {
                if ((this.f331624d & 128) == 0 || (jVar = this.f331632o) == null || jVar == (jVar2 = e83.j.f331684f)) {
                    this.f331632o = h17;
                } else {
                    e83.i mo20599xaaa148a0 = jVar2.mo20599xaaa148a0();
                    mo20599xaaa148a0.f(jVar);
                    mo20599xaaa148a0.f(h17);
                    this.f331632o = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(h17);
            }
            this.f331624d |= 128;
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) b0Var).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return e83.b0.f331634q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return e83.o0.f331740m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331741n;
        j6Var.c(e83.b0.class, e83.a0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        return true;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m127148x73fef578() {
        boolean z17;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        e83.j jVar;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17 && (t9Var = this.f331633p) == null) {
            if (t9Var == null) {
                jVar = this.f331632o;
                if (jVar == null) {
                    jVar = e83.j.f331684f;
                }
            } else {
                jVar = (e83.j) t9Var.e();
            }
            this.f331633p = new com.p176xb6135e39.p283xc50a8b8b.t9(jVar, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f331632o = null;
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
        return (e83.a0) m45492xba8a5e4b(waVar);
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
        return e83.b0.f331634q;
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
        e83.b0 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof e83.b0) {
            e((e83.b0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public a0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, e83.a aVar) {
        super(r5Var);
        this.f331625e = "";
        this.f331626f = "";
        this.f331629i = "";
        this.f331630m = "";
        m127148x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof e83.b0) {
            e((e83.b0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
