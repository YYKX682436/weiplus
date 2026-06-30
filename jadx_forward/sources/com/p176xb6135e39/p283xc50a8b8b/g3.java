package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class g3 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126654d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126655e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126656f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f126657g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f126658h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126659i;

    public g3(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126655e = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126656f = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126657g = "";
        this.f126658h = "";
        this.f126659i = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
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
        com.p176xb6135e39.p283xc50a8b8b.h3 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.h3 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.h3 h3Var = new com.p176xb6135e39.p283xc50a8b8b.h3(this, null);
        int i17 = this.f126654d;
        if ((i17 & 1) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f126655e).f126678d = false;
            this.f126654d = i17 & (-2);
        }
        h3Var.f126685e = this.f126655e;
        int i18 = this.f126654d;
        if ((i18 & 2) != 0) {
            ((com.p176xb6135e39.p283xc50a8b8b.h) this.f126656f).f126678d = false;
            this.f126654d = i18 & (-3);
        }
        h3Var.f126687g = this.f126656f;
        int i19 = (i17 & 4) != 0 ? 1 : 0;
        h3Var.f126689i = this.f126657g;
        if ((i17 & 8) != 0) {
            i19 |= 2;
        }
        h3Var.f126690m = this.f126658h;
        if ((this.f126654d & 16) != 0) {
            this.f126659i = this.f126659i.b();
            this.f126654d &= -17;
        }
        h3Var.f126691n = this.f126659i;
        h3Var.f126684d = i19;
        m20880xaf619bdf();
        return h3Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20687x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.g3) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.g3 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.h3.f126683q     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.f3 r0 = (com.p176xb6135e39.p283xc50a8b8b.f3) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.h3 r2 = (com.p176xb6135e39.p283xc50a8b8b.h3) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.h3 r3 = (com.p176xb6135e39.p283xc50a8b8b.h3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.g3.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.g3");
    }

    public com.p176xb6135e39.p283xc50a8b8b.g3 e(com.p176xb6135e39.p283xc50a8b8b.h3 h3Var) {
        if (h3Var == com.p176xb6135e39.p283xc50a8b8b.h3.f126682p) {
            return this;
        }
        if (!h3Var.f126685e.isEmpty()) {
            if (this.f126655e.isEmpty()) {
                this.f126655e = h3Var.f126685e;
                this.f126654d &= -2;
            } else {
                if ((this.f126654d & 1) == 0) {
                    this.f126655e = com.p176xb6135e39.p283xc50a8b8b.l6.m20754x946297bb(this.f126655e);
                    this.f126654d |= 1;
                }
                ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126655e).addAll(h3Var.f126685e);
            }
            m20881x7bb163d5();
        }
        if (!h3Var.f126687g.isEmpty()) {
            if (this.f126656f.isEmpty()) {
                this.f126656f = h3Var.f126687g;
                this.f126654d &= -3;
            } else {
                if ((this.f126654d & 2) == 0) {
                    this.f126656f = com.p176xb6135e39.p283xc50a8b8b.l6.m20754x946297bb(this.f126656f);
                    this.f126654d |= 2;
                }
                ((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126656f).addAll(h3Var.f126687g);
            }
            m20881x7bb163d5();
        }
        if ((h3Var.f126684d & 1) != 0) {
            this.f126654d |= 4;
            this.f126657g = h3Var.f126689i;
            m20881x7bb163d5();
        }
        if ((h3Var.f126684d & 2) != 0) {
            this.f126654d |= 8;
            this.f126658h = h3Var.f126690m;
            m20881x7bb163d5();
        }
        if (!h3Var.f126691n.isEmpty()) {
            if (this.f126659i.isEmpty()) {
                this.f126659i = h3Var.f126691n;
                this.f126654d &= -17;
            } else {
                if ((this.f126654d & 16) == 0) {
                    this.f126659i = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f126659i);
                    this.f126654d |= 16;
                }
                this.f126659i.addAll(h3Var.f126691n);
            }
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.h3.f126682p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.U;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.V;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.h3.class, com.p176xb6135e39.p283xc50a8b8b.g3.class);
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
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.g3) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.h3.f126682p;
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
        com.p176xb6135e39.p283xc50a8b8b.h3 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.h3) {
            e((com.p176xb6135e39.p283xc50a8b8b.h3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public g3(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126655e = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126656f = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126657g = "";
        this.f126658h = "";
        this.f126659i = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.h3) {
            e((com.p176xb6135e39.p283xc50a8b8b.h3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
