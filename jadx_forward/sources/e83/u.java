package e83;

/* loaded from: classes16.dex */
public final class u extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f331769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331770e;

    /* renamed from: f, reason: collision with root package name */
    public e83.n0 f331771f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f331772g;

    public u(e83.a aVar) {
        super(null);
        boolean z17;
        this.f331770e = "";
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            e();
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
        e83.v mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.v mo20557x85702333() {
        e83.v vVar = new e83.v(this, null);
        int i17 = this.f331769d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        vVar.f331776e = this.f331770e;
        if ((i17 & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331772g;
            if (t9Var == null) {
                vVar.f331777f = this.f331771f;
            } else {
                vVar.f331777f = (e83.n0) t9Var.b();
            }
            i18 |= 2;
        }
        vVar.f331775d = i18;
        m20880xaf619bdf();
        return vVar;
    }

    /* renamed from: clone */
    public java.lang.Object m127176x5a5dd5d() {
        return (e83.u) m45490x5a5dd5d();
    }

    public e83.m0 d() {
        this.f331769d |= 2;
        m20881x7bb163d5();
        return (e83.m0) e().d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.t9 e() {
        e83.n0 n0Var;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331772g;
        if (t9Var == null) {
            if (t9Var == null) {
                n0Var = this.f331771f;
                if (n0Var == null) {
                    n0Var = e83.n0.f331717m;
                }
            } else {
                n0Var = (e83.n0) t9Var.e();
            }
            this.f331772g = new com.p176xb6135e39.p283xc50a8b8b.t9(n0Var, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f331771f = null;
        }
        return this.f331772g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.u f(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.v.f331774i     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.t r0 = (e83.t) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.v r2 = (e83.v) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            e83.v r3 = (e83.v) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.g(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.u.f(com.google.protobuf.d0, com.google.protobuf.t4):e83.u");
    }

    public e83.u g(e83.v vVar) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        e83.n0 n0Var;
        e83.n0 n0Var2;
        if (vVar == e83.v.f331773h) {
            return this;
        }
        if ((vVar.f331775d & 1) != 0) {
            this.f331769d |= 1;
            this.f331770e = vVar.f331776e;
            m20881x7bb163d5();
        }
        if ((vVar.f331775d & 2) != 0) {
            e83.n0 h17 = vVar.h();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331772g;
            if (t9Var == null) {
                if ((this.f331769d & 2) == 0 || (n0Var = this.f331771f) == null || n0Var == (n0Var2 = e83.n0.f331717m)) {
                    this.f331771f = h17;
                } else {
                    e83.m0 mo20599xaaa148a0 = n0Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.f(n0Var);
                    mo20599xaaa148a0.f(h17);
                    this.f331771f = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(h17);
            }
            this.f331769d |= 2;
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) vVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return e83.v.f331773h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return e83.o0.f331734g;
    }

    public e83.u h(java.lang.String str) {
        str.getClass();
        this.f331769d |= 1;
        this.f331770e = str;
        m20881x7bb163d5();
        return this;
    }

    public e83.u i(e83.m0 m0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f331772g;
        if (t9Var == null) {
            this.f331771f = m0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(m0Var.mo20556x59bc66e());
        }
        this.f331769d |= 2;
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331735h;
        j6Var.c(e83.v.class, e83.u.class);
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
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (e83.u) m45492xba8a5e4b(waVar);
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
        return e83.v.f331773h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
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
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        e83.v mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    public u(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f331770e = "";
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            e();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof e83.v) {
            g((e83.v) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof e83.v) {
            g((e83.v) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
