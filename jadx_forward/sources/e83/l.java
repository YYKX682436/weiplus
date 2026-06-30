package e83;

/* loaded from: classes16.dex */
public final class l extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f331697d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331698e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f331699f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f331700g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f331701h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f331702i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f331703m;

    public l(e83.a aVar) {
        super(null);
        boolean z17;
        this.f331698e = "";
        this.f331699f = "";
        this.f331700g = java.util.Collections.emptyList();
        this.f331702i = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            e();
            f();
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
        e83.m mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    public e83.u c() {
        return (e83.u) f().d(e83.v.f331773h);
    }

    /* renamed from: clone */
    public java.lang.Object m127164x5a5dd5d() {
        return (e83.l) m45490x5a5dd5d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e83.m mo20557x85702333() {
        e83.m mVar = new e83.m(this, null);
        int i17 = this.f331697d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        mVar.f331707e = this.f331698e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        mVar.f331708f = this.f331699f;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f331701h;
        if (p9Var == null) {
            if ((this.f331697d & 4) != 0) {
                this.f331700g = java.util.Collections.unmodifiableList(this.f331700g);
                this.f331697d &= -5;
            }
            mVar.f331709g = this.f331700g;
        } else {
            mVar.f331709g = p9Var.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f331703m;
        if (p9Var2 == null) {
            if ((this.f331697d & 8) != 0) {
                this.f331702i = java.util.Collections.unmodifiableList(this.f331702i);
                this.f331697d &= -9;
            }
            mVar.f331710h = this.f331702i;
        } else {
            mVar.f331710h = p9Var2.g();
        }
        mVar.f331706d = i18;
        m20880xaf619bdf();
        return mVar;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f331701h == null) {
            this.f331701h = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f331700g, (this.f331697d & 4) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f331700g = null;
        }
        return this.f331701h;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 f() {
        if (this.f331703m == null) {
            this.f331703m = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f331702i, (this.f331697d & 8) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f331702i = null;
        }
        return this.f331703m;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.l g(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.m.f331705n     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.k r0 = (e83.k) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            e83.m r2 = (e83.m) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.h(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            e83.m r3 = (e83.m) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.h(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.l.g(com.google.protobuf.d0, com.google.protobuf.t4):e83.l");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return e83.m.f331704m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return e83.o0.f331736i;
    }

    public e83.l h(e83.m mVar) {
        boolean z17;
        boolean z18;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        if (mVar == e83.m.f331704m) {
            return this;
        }
        if ((mVar.f331706d & 1) != 0) {
            this.f331697d |= 1;
            this.f331698e = mVar.f331707e;
            m20881x7bb163d5();
        }
        if ((mVar.f331706d & 2) != 0) {
            this.f331697d |= 2;
            this.f331699f = mVar.f331708f;
            m20881x7bb163d5();
        }
        if (this.f331701h == null) {
            if (!mVar.f331709g.isEmpty()) {
                if (this.f331700g.isEmpty()) {
                    this.f331700g = mVar.f331709g;
                    this.f331697d &= -5;
                } else {
                    if ((this.f331697d & 4) == 0) {
                        this.f331700g = new java.util.ArrayList(this.f331700g);
                        this.f331697d |= 4;
                    }
                    this.f331700g.addAll(mVar.f331709g);
                }
                m20881x7bb163d5();
            }
        } else if (!mVar.f331709g.isEmpty()) {
            if (this.f331701h.p()) {
                this.f331701h.f126942a = null;
                this.f331701h = null;
                this.f331700g = mVar.f331709g;
                this.f331697d &= -5;
                z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f331701h = z17 ? e() : null;
            } else {
                this.f331701h.b(mVar.f331709g);
            }
        }
        if (this.f331703m == null) {
            if (!mVar.f331710h.isEmpty()) {
                if (this.f331702i.isEmpty()) {
                    this.f331702i = mVar.f331710h;
                    this.f331697d &= -9;
                } else {
                    if ((this.f331697d & 8) == 0) {
                        this.f331702i = new java.util.ArrayList(this.f331702i);
                        this.f331697d |= 8;
                    }
                    this.f331702i.addAll(mVar.f331710h);
                }
                m20881x7bb163d5();
            }
        } else if (!mVar.f331710h.isEmpty()) {
            if (this.f331703m.p()) {
                this.f331703m.f126942a = null;
                this.f331703m = null;
                this.f331702i = mVar.f331710h;
                this.f331697d &= -9;
                z18 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f331703m = z18 ? f() : null;
            } else {
                this.f331703m.b(mVar.f331710h);
            }
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) mVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331737j;
        j6Var.c(e83.m.class, e83.l.class);
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
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (e83.l) m45492xba8a5e4b(waVar);
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
        return e83.m.f331704m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        g(d0Var, t4Var);
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
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        e83.m mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof e83.m) {
            h((e83.m) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof e83.m) {
            h((e83.m) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public l(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f331698e = "";
        this.f331699f = "";
        this.f331700g = java.util.Collections.emptyList();
        this.f331702i = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            e();
            f();
        }
    }
}
