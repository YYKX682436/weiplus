package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class l extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f149529d;

    /* renamed from: e, reason: collision with root package name */
    public int f149530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f149531f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f149532g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 f149533h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f149534i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f149535m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f149536n;

    public l(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(null);
        this.f149531f = "";
        this.f149532g = "";
        this.f149536n = "";
        m45565x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mo20556x59bc66e() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    /* renamed from: clone */
    public java.lang.Object m45564x5a5dd5d() {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) m136241x5a5dd5d();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mo20557x85702333() {
        int i17;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m(this, null);
        int i18 = this.f149529d;
        if ((i18 & 1) != 0) {
            mVar.f149540e = this.f149530e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        mVar.f149541f = this.f149531f;
        if ((i18 & 4) != 0) {
            i17 |= 4;
        }
        mVar.f149542g = this.f149532g;
        if ((i18 & 8) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149534i;
            if (t9Var == null) {
                mVar.f149543h = this.f149533h;
            } else {
                mVar.f149543h = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0) t9Var.b();
            }
            i17 |= 8;
        }
        if ((i18 & 16) != 0) {
            mVar.f149544i = this.f149535m;
            i17 |= 16;
        }
        if ((i18 & 32) != 0) {
            i17 |= 32;
        }
        mVar.f149545m = this.f149536n;
        mVar.f149539d = i17;
        m20880xaf619bdf();
        return mVar;
    }

    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 e() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149534i;
        if (t9Var != null) {
            return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0) t9Var.e();
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = this.f149533h;
        return n0Var == null ? com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149552m : n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l f(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149538p     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.k r0 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.m r2 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.m r3 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l.f(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.l");
    }

    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l g(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mVar) {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var2;
        if (mVar == com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149537o) {
            return this;
        }
        if (mVar.m()) {
            int i17 = mVar.f149540e;
            this.f149529d |= 1;
            this.f149530e = i17;
            m20881x7bb163d5();
        }
        if (mVar.m45568x29c7639a()) {
            this.f149529d |= 2;
            this.f149531f = mVar.f149541f;
            m20881x7bb163d5();
        }
        if (mVar.k()) {
            this.f149529d |= 4;
            this.f149532g = mVar.f149542g;
            m20881x7bb163d5();
        }
        if (mVar.m45569xd7e755e3()) {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 i18 = mVar.i();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149534i;
            if (t9Var == null) {
                if ((this.f149529d & 8) == 0 || (n0Var = this.f149533h) == null || n0Var == (n0Var2 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149552m)) {
                    this.f149533h = i18;
                } else {
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 mo20599xaaa148a0 = n0Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.f(n0Var);
                    mo20599xaaa148a0.f(i18);
                    this.f149533h = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(i18);
            }
            this.f149529d |= 8;
        }
        if (mVar.l()) {
            boolean z17 = mVar.f149544i;
            this.f149529d |= 16;
            this.f149535m = z17;
            m20881x7bb163d5();
        }
        if ((mVar.f149539d & 32) != 0) {
            this.f149529d |= 32;
            this.f149536n = mVar.f149545m;
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149537o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149564c;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149565d;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        int i17 = this.f149529d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 2) != 0)) {
            return false;
        }
        if (!((i17 & 4) != 0)) {
            return false;
        }
        if ((i17 & 8) != 0) {
            return ((i17 & 16) != 0) && e().mo20562xf582434a();
        }
        return false;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m45565x73fef578() {
        if (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f() && this.f149534i == null) {
            this.f149534i = new com.p176xb6135e39.p283xc50a8b8b.t9(e(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f149533h = null;
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m136256xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l) m136256xba8a5e4b(waVar);
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
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.f149537o;
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) {
            g((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public l(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(r5Var);
        this.f149531f = "";
        this.f149532g = "";
        this.f149536n = "";
        m45565x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) {
            g((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
