package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class a0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f149462d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f149463e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y f149464f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f149465g;

    public a0(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(null);
        this.f149463e = "";
        m45549x73fef578();
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
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 mo20557x85702333() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 b0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0(this, null);
        int i17 = this.f149462d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        b0Var.f149477e = this.f149463e;
        if ((i17 & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149465g;
            if (t9Var == null) {
                b0Var.f149478f = this.f149464f;
            } else {
                b0Var.f149478f = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y) t9Var.b();
            }
            i18 |= 2;
        }
        b0Var.f149476d = i18;
        m20880xaf619bdf();
        return b0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m45548x5a5dd5d() {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0) m135757x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149475i     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.z r0 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.z) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.b0 r2 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.b0 r3 = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0.d(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.a0");
    }

    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0 e(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 b0Var) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y yVar;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y yVar2;
        if (b0Var == com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149474h) {
            return this;
        }
        if (b0Var.j()) {
            this.f149462d |= 1;
            this.f149463e = b0Var.f149477e;
            m20881x7bb163d5();
        }
        if (b0Var.i()) {
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y g17 = b0Var.g();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149465g;
            if (t9Var == null) {
                if ((this.f149462d & 2) == 0 || (yVar = this.f149464f) == null || yVar == (yVar2 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y.f149638m)) {
                    this.f149464f = g17;
                } else {
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x mo20599xaaa148a0 = yVar2.mo20599xaaa148a0();
                    mo20599xaaa148a0.e(yVar);
                    mo20599xaaa148a0.e(g17);
                    this.f149464f = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(g17);
            }
            this.f149462d |= 2;
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) b0Var).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149474h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149580s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149581t;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y yVar;
        int i17 = this.f149462d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 2) != 0)) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f149465g;
        if (t9Var == null) {
            yVar = this.f149464f;
            if (yVar == null) {
                yVar = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y.f149638m;
            }
        } else {
            yVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y) t9Var.e();
        }
        return yVar.mo20562xf582434a();
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m45549x73fef578() {
        boolean z17;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y yVar;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17 && (t9Var = this.f149465g) == null) {
            if (t9Var == null) {
                yVar = this.f149464f;
                if (yVar == null) {
                    yVar = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y.f149638m;
                }
            } else {
                yVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y) t9Var.e();
            }
            this.f149465g = new com.p176xb6135e39.p283xc50a8b8b.t9(yVar, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f149464f = null;
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
    public com.p176xb6135e39.p283xc50a8b8b.a m135798xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.a0) m135798xba8a5e4b(waVar);
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
        return com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149474h;
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

    public a0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(r5Var);
        this.f149463e = "";
        m45549x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) {
            e((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) {
            e((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
