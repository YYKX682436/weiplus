package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class q0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f126953d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f126954e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f126955f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126956g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f126957h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126958i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f126959m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126960n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f126961o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126962p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f126963q;

    /* renamed from: r, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126964r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f126965s;

    /* renamed from: t, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126966t;

    /* renamed from: u, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.j2 f126967u;

    /* renamed from: v, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t9 f126968v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f126969w;

    /* renamed from: x, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f126970x;

    /* renamed from: y, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126971y;

    public q0(com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(null);
        this.f126954e = "";
        this.f126955f = java.util.Collections.emptyList();
        this.f126957h = java.util.Collections.emptyList();
        this.f126959m = java.util.Collections.emptyList();
        this.f126961o = java.util.Collections.emptyList();
        this.f126963q = java.util.Collections.emptyList();
        this.f126965s = java.util.Collections.emptyList();
        this.f126969w = java.util.Collections.emptyList();
        this.f126971y = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m20862x73fef578();
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
        com.p176xb6135e39.p283xc50a8b8b.x0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.x0 mo20557x85702333() {
        com.p176xb6135e39.p283xc50a8b8b.x0 x0Var = new com.p176xb6135e39.p283xc50a8b8b.x0(this, null);
        int i17 = this.f126953d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        x0Var.f127189e = this.f126954e;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126956g;
        if (p9Var == null) {
            if ((this.f126953d & 2) != 0) {
                this.f126955f = java.util.Collections.unmodifiableList(this.f126955f);
                this.f126953d &= -3;
            }
            x0Var.f127190f = this.f126955f;
        } else {
            x0Var.f127190f = p9Var.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126958i;
        if (p9Var2 == null) {
            if ((this.f126953d & 4) != 0) {
                this.f126957h = java.util.Collections.unmodifiableList(this.f126957h);
                this.f126953d &= -5;
            }
            x0Var.f127191g = this.f126957h;
        } else {
            x0Var.f127191g = p9Var2.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f126960n;
        if (p9Var3 == null) {
            if ((this.f126953d & 8) != 0) {
                this.f126959m = java.util.Collections.unmodifiableList(this.f126959m);
                this.f126953d &= -9;
            }
            x0Var.f127192h = this.f126959m;
        } else {
            x0Var.f127192h = p9Var3.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var4 = this.f126962p;
        if (p9Var4 == null) {
            if ((this.f126953d & 16) != 0) {
                this.f126961o = java.util.Collections.unmodifiableList(this.f126961o);
                this.f126953d &= -17;
            }
            x0Var.f127193i = this.f126961o;
        } else {
            x0Var.f127193i = p9Var4.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var5 = this.f126964r;
        if (p9Var5 == null) {
            if ((this.f126953d & 32) != 0) {
                this.f126963q = java.util.Collections.unmodifiableList(this.f126963q);
                this.f126953d &= -33;
            }
            x0Var.f127194m = this.f126963q;
        } else {
            x0Var.f127194m = p9Var5.g();
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var6 = this.f126966t;
        if (p9Var6 == null) {
            if ((this.f126953d & 64) != 0) {
                this.f126965s = java.util.Collections.unmodifiableList(this.f126965s);
                this.f126953d &= -65;
            }
            x0Var.f127195n = this.f126965s;
        } else {
            x0Var.f127195n = p9Var6.g();
        }
        if ((i17 & 128) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126968v;
            if (t9Var == null) {
                x0Var.f127196o = this.f126967u;
            } else {
                x0Var.f127196o = (com.p176xb6135e39.p283xc50a8b8b.j2) t9Var.b();
            }
            i18 |= 2;
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var7 = this.f126970x;
        if (p9Var7 == null) {
            if ((this.f126953d & 256) != 0) {
                this.f126969w = java.util.Collections.unmodifiableList(this.f126969w);
                this.f126953d &= -257;
            }
            x0Var.f127197p = this.f126969w;
        } else {
            x0Var.f127197p = p9Var7.g();
        }
        if ((this.f126953d & 512) != 0) {
            this.f126971y = this.f126971y.b();
            this.f126953d &= -513;
        }
        x0Var.f127198q = this.f126971y;
        x0Var.f127188d = i18;
        m20880xaf619bdf();
        return x0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m20861x5a5dd5d() {
        return (com.p176xb6135e39.p283xc50a8b8b.q0) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f126962p == null) {
            this.f126962p = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126961o, (this.f126953d & 16) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126961o = null;
        }
        return this.f126962p;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f126958i == null) {
            this.f126958i = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126957h, (this.f126953d & 4) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126957h = null;
        }
        return this.f126958i;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 f() {
        if (this.f126964r == null) {
            this.f126964r = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126963q, (this.f126953d & 32) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126963q = null;
        }
        return this.f126964r;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 g() {
        if (this.f126956g == null) {
            this.f126956g = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126955f, (this.f126953d & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126955f = null;
        }
        return this.f126956g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return com.p176xb6135e39.p283xc50a8b8b.x0.f127186s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return com.p176xb6135e39.p283xc50a8b8b.p3.f126917c;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 h() {
        if (this.f126960n == null) {
            this.f126960n = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126959m, (this.f126953d & 8) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126959m = null;
        }
        return this.f126960n;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 i() {
        if (this.f126966t == null) {
            this.f126966t = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126965s, (this.f126953d & 64) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126965s = null;
        }
        return this.f126966t;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126918d;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.x0.class, com.p176xb6135e39.p283xc50a8b8b.q0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var;
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f126956g;
            if (i17 < (p9Var == null ? this.f126955f.size() : p9Var.l())) {
                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f126956g;
                if (!(p9Var2 == null ? (com.p176xb6135e39.p283xc50a8b8b.u1) this.f126955f.get(i17) : (com.p176xb6135e39.p283xc50a8b8b.u1) p9Var2.m(i17, false)).mo20562xf582434a()) {
                    return false;
                }
                i17++;
            } else {
                int i18 = 0;
                while (true) {
                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f126958i;
                    if (i18 < (p9Var3 == null ? this.f126957h.size() : p9Var3.l())) {
                        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var4 = this.f126958i;
                        if (!(p9Var4 == null ? (com.p176xb6135e39.p283xc50a8b8b.u1) this.f126957h.get(i18) : (com.p176xb6135e39.p283xc50a8b8b.u1) p9Var4.m(i18, false)).mo20562xf582434a()) {
                            return false;
                        }
                        i18++;
                    } else {
                        int i19 = 0;
                        while (true) {
                            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var5 = this.f126960n;
                            if (i19 < (p9Var5 == null ? this.f126959m.size() : p9Var5.l())) {
                                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var6 = this.f126960n;
                                if (!(p9Var6 == null ? (com.p176xb6135e39.p283xc50a8b8b.x0) this.f126959m.get(i19) : (com.p176xb6135e39.p283xc50a8b8b.x0) p9Var6.m(i19, false)).mo20562xf582434a()) {
                                    return false;
                                }
                                i19++;
                            } else {
                                int i27 = 0;
                                while (true) {
                                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var7 = this.f126962p;
                                    if (i27 < (p9Var7 == null ? this.f126961o.size() : p9Var7.l())) {
                                        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var8 = this.f126962p;
                                        if (!(p9Var8 == null ? (com.p176xb6135e39.p283xc50a8b8b.d1) this.f126961o.get(i27) : (com.p176xb6135e39.p283xc50a8b8b.d1) p9Var8.m(i27, false)).mo20562xf582434a()) {
                                            return false;
                                        }
                                        i27++;
                                    } else {
                                        int i28 = 0;
                                        while (true) {
                                            com.p176xb6135e39.p283xc50a8b8b.p9 p9Var9 = this.f126964r;
                                            if (i28 < (p9Var9 == null ? this.f126963q.size() : p9Var9.l())) {
                                                com.p176xb6135e39.p283xc50a8b8b.p9 p9Var10 = this.f126964r;
                                                if (!(p9Var10 == null ? (com.p176xb6135e39.p283xc50a8b8b.t0) this.f126963q.get(i28) : (com.p176xb6135e39.p283xc50a8b8b.t0) p9Var10.m(i28, false)).mo20562xf582434a()) {
                                                    return false;
                                                }
                                                i28++;
                                            } else {
                                                int i29 = 0;
                                                while (true) {
                                                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var11 = this.f126966t;
                                                    if (i29 >= (p9Var11 == null ? this.f126965s.size() : p9Var11.l())) {
                                                        if ((this.f126953d & 128) != 0) {
                                                            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126968v;
                                                            if (t9Var == null) {
                                                                j2Var = this.f126967u;
                                                                if (j2Var == null) {
                                                                    j2Var = com.p176xb6135e39.p283xc50a8b8b.j2.f126756o;
                                                                }
                                                            } else {
                                                                j2Var = (com.p176xb6135e39.p283xc50a8b8b.j2) t9Var.e();
                                                            }
                                                            if (!j2Var.mo20562xf582434a()) {
                                                                return false;
                                                            }
                                                        }
                                                        return true;
                                                    }
                                                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var12 = this.f126966t;
                                                    if (!(p9Var12 == null ? (com.p176xb6135e39.p283xc50a8b8b.t2) this.f126965s.get(i29) : (com.p176xb6135e39.p283xc50a8b8b.t2) p9Var12.m(i29, false)).mo20562xf582434a()) {
                                                        return false;
                                                    }
                                                    i29++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 j() {
        if (this.f126970x == null) {
            this.f126970x = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f126969w, (this.f126953d & 256) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f126969w = null;
        }
        return this.f126970x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p283xc50a8b8b.q0 k(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.p176xb6135e39.p283xc50a8b8b.x0.f127187t     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.p0 r0 = (com.p176xb6135e39.p283xc50a8b8b.p0) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            com.google.protobuf.x0 r2 = (com.p176xb6135e39.p283xc50a8b8b.x0) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.x0 r3 = (com.p176xb6135e39.p283xc50a8b8b.x0) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.l(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.q0.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.q0");
    }

    public com.p176xb6135e39.p283xc50a8b8b.q0 l(com.p176xb6135e39.p283xc50a8b8b.x0 x0Var) {
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var;
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var2;
        if (x0Var == com.p176xb6135e39.p283xc50a8b8b.x0.f127186s) {
            return this;
        }
        if ((x0Var.f127188d & 1) != 0) {
            this.f126953d |= 1;
            this.f126954e = x0Var.f127189e;
            m20881x7bb163d5();
        }
        if (this.f126956g == null) {
            if (!x0Var.f127190f.isEmpty()) {
                if (this.f126955f.isEmpty()) {
                    this.f126955f = x0Var.f127190f;
                    this.f126953d &= -3;
                } else {
                    if ((this.f126953d & 2) == 0) {
                        this.f126955f = new java.util.ArrayList(this.f126955f);
                        this.f126953d |= 2;
                    }
                    this.f126955f.addAll(x0Var.f127190f);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127190f.isEmpty()) {
            if (this.f126956g.p()) {
                this.f126956g.f126942a = null;
                this.f126956g = null;
                this.f126955f = x0Var.f127190f;
                this.f126953d &= -3;
                this.f126956g = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? g() : null;
            } else {
                this.f126956g.b(x0Var.f127190f);
            }
        }
        if (this.f126958i == null) {
            if (!x0Var.f127191g.isEmpty()) {
                if (this.f126957h.isEmpty()) {
                    this.f126957h = x0Var.f127191g;
                    this.f126953d &= -5;
                } else {
                    if ((this.f126953d & 4) == 0) {
                        this.f126957h = new java.util.ArrayList(this.f126957h);
                        this.f126953d |= 4;
                    }
                    this.f126957h.addAll(x0Var.f127191g);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127191g.isEmpty()) {
            if (this.f126958i.p()) {
                this.f126958i.f126942a = null;
                this.f126958i = null;
                this.f126957h = x0Var.f127191g;
                this.f126953d &= -5;
                this.f126958i = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? e() : null;
            } else {
                this.f126958i.b(x0Var.f127191g);
            }
        }
        if (this.f126960n == null) {
            if (!x0Var.f127192h.isEmpty()) {
                if (this.f126959m.isEmpty()) {
                    this.f126959m = x0Var.f127192h;
                    this.f126953d &= -9;
                } else {
                    if ((this.f126953d & 8) == 0) {
                        this.f126959m = new java.util.ArrayList(this.f126959m);
                        this.f126953d |= 8;
                    }
                    this.f126959m.addAll(x0Var.f127192h);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127192h.isEmpty()) {
            if (this.f126960n.p()) {
                this.f126960n.f126942a = null;
                this.f126960n = null;
                this.f126959m = x0Var.f127192h;
                this.f126953d &= -9;
                this.f126960n = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? h() : null;
            } else {
                this.f126960n.b(x0Var.f127192h);
            }
        }
        if (this.f126962p == null) {
            if (!x0Var.f127193i.isEmpty()) {
                if (this.f126961o.isEmpty()) {
                    this.f126961o = x0Var.f127193i;
                    this.f126953d &= -17;
                } else {
                    if ((this.f126953d & 16) == 0) {
                        this.f126961o = new java.util.ArrayList(this.f126961o);
                        this.f126953d |= 16;
                    }
                    this.f126961o.addAll(x0Var.f127193i);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127193i.isEmpty()) {
            if (this.f126962p.p()) {
                this.f126962p.f126942a = null;
                this.f126962p = null;
                this.f126961o = x0Var.f127193i;
                this.f126953d &= -17;
                this.f126962p = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? d() : null;
            } else {
                this.f126962p.b(x0Var.f127193i);
            }
        }
        if (this.f126964r == null) {
            if (!x0Var.f127194m.isEmpty()) {
                if (this.f126963q.isEmpty()) {
                    this.f126963q = x0Var.f127194m;
                    this.f126953d &= -33;
                } else {
                    if ((this.f126953d & 32) == 0) {
                        this.f126963q = new java.util.ArrayList(this.f126963q);
                        this.f126953d |= 32;
                    }
                    this.f126963q.addAll(x0Var.f127194m);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127194m.isEmpty()) {
            if (this.f126964r.p()) {
                this.f126964r.f126942a = null;
                this.f126964r = null;
                this.f126963q = x0Var.f127194m;
                this.f126953d &= -33;
                this.f126964r = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? f() : null;
            } else {
                this.f126964r.b(x0Var.f127194m);
            }
        }
        if (this.f126966t == null) {
            if (!x0Var.f127195n.isEmpty()) {
                if (this.f126965s.isEmpty()) {
                    this.f126965s = x0Var.f127195n;
                    this.f126953d &= -65;
                } else {
                    if ((this.f126953d & 64) == 0) {
                        this.f126965s = new java.util.ArrayList(this.f126965s);
                        this.f126953d |= 64;
                    }
                    this.f126965s.addAll(x0Var.f127195n);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127195n.isEmpty()) {
            if (this.f126966t.p()) {
                this.f126966t.f126942a = null;
                this.f126966t = null;
                this.f126965s = x0Var.f127195n;
                this.f126953d &= -65;
                this.f126966t = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? i() : null;
            } else {
                this.f126966t.b(x0Var.f127195n);
            }
        }
        if (x0Var.h()) {
            com.p176xb6135e39.p283xc50a8b8b.j2 g17 = x0Var.g();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126968v;
            if (t9Var == null) {
                if ((this.f126953d & 128) == 0 || (j2Var = this.f126967u) == null || j2Var == (j2Var2 = com.p176xb6135e39.p283xc50a8b8b.j2.f126756o)) {
                    this.f126967u = g17;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.i2 mo20599xaaa148a0 = j2Var2.mo20599xaaa148a0();
                    mo20599xaaa148a0.l(j2Var);
                    mo20599xaaa148a0.l(g17);
                    this.f126967u = mo20599xaaa148a0.mo20557x85702333();
                }
                m20881x7bb163d5();
            } else {
                t9Var.g(g17);
            }
            this.f126953d |= 128;
        }
        if (this.f126970x == null) {
            if (!x0Var.f127197p.isEmpty()) {
                if (this.f126969w.isEmpty()) {
                    this.f126969w = x0Var.f127197p;
                    this.f126953d &= -257;
                } else {
                    if ((this.f126953d & 256) == 0) {
                        this.f126969w = new java.util.ArrayList(this.f126969w);
                        this.f126953d |= 256;
                    }
                    this.f126969w.addAll(x0Var.f127197p);
                }
                m20881x7bb163d5();
            }
        } else if (!x0Var.f127197p.isEmpty()) {
            if (this.f126970x.p()) {
                this.f126970x.f126942a = null;
                this.f126970x = null;
                this.f126969w = x0Var.f127197p;
                this.f126953d &= -257;
                this.f126970x = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a ? j() : null;
            } else {
                this.f126970x.b(x0Var.f127197p);
            }
        }
        if (!x0Var.f127198q.isEmpty()) {
            if (this.f126971y.isEmpty()) {
                this.f126971y = x0Var.f127198q;
                this.f126953d &= -513;
            } else {
                if ((this.f126953d & 512) == 0) {
                    this.f126971y = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f126971y);
                    this.f126953d |= 512;
                }
                this.f126971y.addAll(x0Var.f127198q);
            }
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: maybeForceBuilderInitialization */
    public final void m20862x73fef578() {
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var;
        if (com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a) {
            g();
            e();
            h();
            d();
            f();
            i();
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f126968v;
            if (t9Var == null) {
                if (t9Var == null) {
                    j2Var = this.f126967u;
                    if (j2Var == null) {
                        j2Var = com.p176xb6135e39.p283xc50a8b8b.j2.f126756o;
                    }
                } else {
                    j2Var = (com.p176xb6135e39.p283xc50a8b8b.j2) t9Var.e();
                }
                this.f126968v = new com.p176xb6135e39.p283xc50a8b8b.t9(j2Var, m20872x3e6b6e28(), m20879x7a8e633f());
                this.f126967u = null;
            }
            j();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (com.p176xb6135e39.p283xc50a8b8b.q0) m45492xba8a5e4b(waVar);
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
        return com.p176xb6135e39.p283xc50a8b8b.x0.f127186s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
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
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        com.p176xb6135e39.p283xc50a8b8b.x0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.x0) {
            l((com.p176xb6135e39.p283xc50a8b8b.x0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof com.p176xb6135e39.p283xc50a8b8b.x0) {
            l((com.p176xb6135e39.p283xc50a8b8b.x0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public q0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(r5Var);
        this.f126954e = "";
        this.f126955f = java.util.Collections.emptyList();
        this.f126957h = java.util.Collections.emptyList();
        this.f126959m = java.util.Collections.emptyList();
        this.f126961o = java.util.Collections.emptyList();
        this.f126963q = java.util.Collections.emptyList();
        this.f126965s = java.util.Collections.emptyList();
        this.f126969w = java.util.Collections.emptyList();
        this.f126971y = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        m20862x73fef578();
    }
}
