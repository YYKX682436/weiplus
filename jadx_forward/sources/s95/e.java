package s95;

/* loaded from: classes16.dex */
public final class e extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f486568d;

    /* renamed from: e, reason: collision with root package name */
    public s95.y f486569e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f486570f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f486571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f486572h;

    /* renamed from: i, reason: collision with root package name */
    public s95.y f486573i;

    public e(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, s95.d dVar) {
        super(r5Var);
        boolean z17;
        this.f486570f = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
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
        s95.f mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.f mo20557x85702333() {
        s95.f fVar = new s95.f(this, null);
        int i17 = this.f486568d;
        fVar.f486590d = this.f486569e;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f486571g;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f486570f = java.util.Collections.unmodifiableList(this.f486570f);
                this.f486568d &= -2;
            }
            fVar.f486591e = this.f486570f;
        } else {
            fVar.f486591e = p9Var.g();
        }
        fVar.f486592f = this.f486572h;
        fVar.f486593g = this.f486573i;
        m20880xaf619bdf();
        return fVar;
    }

    /* renamed from: clone */
    public java.lang.Object m164135x5a5dd5d() {
        return (s95.e) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f486571g == null) {
            this.f486571g = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f486570f, (this.f486568d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f486570f = null;
        }
        return this.f486571g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.e e(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.f.f486589m     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.d r0 = (s95.d) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.f r2 = (s95.f) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            s95.f r3 = (s95.f) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: s95.e.e(com.google.protobuf.d0, com.google.protobuf.t4):s95.e");
    }

    public s95.e f(s95.f fVar) {
        boolean z17;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        if (fVar == s95.f.f486588i) {
            return this;
        }
        if (fVar.f486590d != null) {
            s95.y i17 = fVar.i();
            s95.y yVar = this.f486569e;
            if (yVar != null) {
                s95.x g17 = s95.y.g(yVar);
                g17.e(i17);
                this.f486569e = g17.mo20557x85702333();
            } else {
                this.f486569e = i17;
            }
            m20881x7bb163d5();
        }
        if (this.f486571g == null) {
            if (!fVar.f486591e.isEmpty()) {
                if (this.f486570f.isEmpty()) {
                    this.f486570f = fVar.f486591e;
                    this.f486568d &= -2;
                } else {
                    if ((this.f486568d & 1) == 0) {
                        this.f486570f = new java.util.ArrayList(this.f486570f);
                        this.f486568d |= 1;
                    }
                    this.f486570f.addAll(fVar.f486591e);
                }
                m20881x7bb163d5();
            }
        } else if (!fVar.f486591e.isEmpty()) {
            if (this.f486571g.p()) {
                this.f486571g.f126942a = null;
                this.f486571g = null;
                this.f486570f = fVar.f486591e;
                this.f486568d &= -2;
                z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                this.f486571g = z17 ? d() : null;
            } else {
                this.f486571g.b(fVar.f486591e);
            }
        }
        boolean z18 = fVar.f486592f;
        if (z18) {
            this.f486572h = z18;
            m20881x7bb163d5();
        }
        if (fVar.f486593g != null) {
            s95.y j17 = fVar.j();
            s95.y yVar2 = this.f486573i;
            if (yVar2 != null) {
                s95.x g18 = s95.y.g(yVar2);
                g18.e(j17);
                this.f486573i = g18.mo20557x85702333();
            } else {
                this.f486573i = j17;
            }
            m20881x7bb163d5();
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) fVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return s95.f.f486588i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return s95.r0.f486723o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486724p;
        j6Var.c(s95.f.class, s95.e.class);
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
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (s95.e) m45492xba8a5e4b(waVar);
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
        return s95.f.f486588i;
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
        s95.f mo20557x85702333 = mo20557x85702333();
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

    public e(s95.d dVar) {
        super(null);
        boolean z17;
        this.f486570f = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof s95.f) {
            f((s95.f) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof s95.f) {
            f((s95.f) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
