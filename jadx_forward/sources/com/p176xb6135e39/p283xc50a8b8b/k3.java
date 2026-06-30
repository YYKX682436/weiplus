package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class k3 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126782d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f126783e;

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126784f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f126785g;

    /* renamed from: h, reason: collision with root package name */
    public long f126786h;

    /* renamed from: i, reason: collision with root package name */
    public long f126787i;

    /* renamed from: m, reason: collision with root package name */
    public double f126788m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.y f126789n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f126790o;

    public k3(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126783e = java.util.Collections.emptyList();
        this.f126785g = "";
        this.f126789n = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        this.f126790o = "";
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
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
        com.p176xb6135e39.p283xc50a8b8b.o3 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.o3 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.o3 o3Var = new com.p176xb6135e39.p283xc50a8b8b.o3(this, null);
        int i17 = this.f126782d;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126784f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f126783e = java.util.Collections.unmodifiableList(this.f126783e);
                this.f126782d &= -2;
            }
            o3Var.f126888e = this.f126783e;
        } else {
            o3Var.f126888e = p9Var.g();
        }
        int i18 = (i17 & 2) != 0 ? 1 : 0;
        o3Var.f126889f = this.f126785g;
        if ((i17 & 4) != 0) {
            o3Var.f126890g = this.f126786h;
            i18 |= 2;
        }
        if ((i17 & 8) != 0) {
            o3Var.f126891h = this.f126787i;
            i18 |= 4;
        }
        if ((i17 & 16) != 0) {
            o3Var.f126892i = this.f126788m;
            i18 |= 8;
        }
        if ((i17 & 32) != 0) {
            i18 |= 16;
        }
        o3Var.f126893m = this.f126789n;
        if ((i17 & 64) != 0) {
            i18 |= 32;
        }
        o3Var.f126894n = this.f126790o;
        o3Var.f126887d = i18;
        m20880xaf619bdf();
        return o3Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20725x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.k3) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f126784f == null) {
            this.f126784f = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126783e, (this.f126782d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126783e = null;
        }
        return this.f126784f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.k3 e(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.o3.f126886q     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.j3 r0 = (com.p176xb6135e39.p283xc50a8b8b.j3) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.o3 r2 = (com.p176xb6135e39.p283xc50a8b8b.o3) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.o3 r3 = (com.p176xb6135e39.p283xc50a8b8b.o3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.k3.e(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.k3");
    }

    public com.p176xb6135e39.p283xc50a8b8b.k3 f(com.p176xb6135e39.p283xc50a8b8b.o3 o3Var) {
        if (o3Var == com.p176xb6135e39.p283xc50a8b8b.o3.f126885p) {
            return this;
        }
        if (this.f126784f == null) {
            if (!o3Var.f126888e.isEmpty()) {
                if (this.f126783e.isEmpty()) {
                    this.f126783e = o3Var.f126888e;
                    this.f126782d &= -2;
                } else {
                    if ((this.f126782d & 1) == 0) {
                        this.f126783e = new java.util.ArrayList(this.f126783e);
                        this.f126782d |= 1;
                    }
                    this.f126783e.addAll(o3Var.f126888e);
                }
                m20881x7bb163d5();
            }
        } else if (!o3Var.f126888e.isEmpty()) {
            if (this.f126784f.p()) {
                this.f126784f.f126942a = null;
                this.f126784f = null;
                this.f126783e = o3Var.f126888e;
                this.f126782d &= -2;
                this.f126784f = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? d() : null;
            } else {
                this.f126784f.b(o3Var.f126888e);
            }
        }
        if ((o3Var.f126887d & 1) != 0) {
            this.f126782d |= 2;
            this.f126785g = o3Var.f126889f;
            m20881x7bb163d5();
        }
        if ((o3Var.f126887d & 2) != 0) {
            long j17 = o3Var.f126890g;
            this.f126782d |= 4;
            this.f126786h = j17;
            m20881x7bb163d5();
        }
        if ((o3Var.f126887d & 4) != 0) {
            long j18 = o3Var.f126891h;
            this.f126782d |= 8;
            this.f126787i = j18;
            m20881x7bb163d5();
        }
        if ((o3Var.f126887d & 8) != 0) {
            double d17 = o3Var.f126892i;
            this.f126782d |= 16;
            this.f126788m = d17;
            m20881x7bb163d5();
        }
        if ((o3Var.f126887d & 16) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.y yVar = o3Var.f126893m;
            yVar.getClass();
            this.f126782d |= 32;
            this.f126789n = yVar;
            m20881x7bb163d5();
        }
        if ((o3Var.f126887d & 32) != 0) {
            this.f126782d |= 64;
            this.f126790o = o3Var.f126894n;
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.o3.f126885p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.O;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.P;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.o3.class, com.p176xb6135e39.p283xc50a8b8b.k3.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126784f;
            if (i17 >= (p9Var == null ? this.f126783e.size() : p9Var.l())) {
                return true;
            }
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126784f;
            if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.n3) this.f126783e.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.n3) p9Var2.m(i17, false)).mo20562xf582434a()) {
                return false;
            }
            i17++;
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
        return (com.p176xb6135e39.p283xc50a8b8b.k3) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.o3.f126885p;
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
        com.p176xb6135e39.p283xc50a8b8b.o3 mo20557x85702333 = mo20557x85702333();
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.o3) {
            f((com.p176xb6135e39.p283xc50a8b8b.o3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public k3(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126783e = java.util.Collections.emptyList();
        this.f126785g = "";
        this.f126789n = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        this.f126790o = "";
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.o3) {
            f((com.p176xb6135e39.p283xc50a8b8b.o3) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
