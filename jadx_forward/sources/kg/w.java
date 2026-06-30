package kg;

/* loaded from: classes16.dex */
public final class w extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f389176d;

    /* renamed from: e, reason: collision with root package name */
    public kg.h0 f389177e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f389178f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f389179g;

    /* renamed from: h, reason: collision with root package name */
    public kg.j f389180h;

    /* renamed from: i, reason: collision with root package name */
    public kg.b1 f389181i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f389182m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f389183n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f389184o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f389185p;

    public w(kg.b bVar) {
        super(null);
        this.f389178f = java.util.Collections.emptyList();
        this.f389182m = java.util.Collections.emptyList();
        this.f389184o = java.util.Collections.emptyList();
        if (kg.x.m143280x24037d30()) {
            d();
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
        kg.x mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.x mo20557x85702333() {
        kg.x xVar = new kg.x(this);
        kg.x.m143281x240384b4(xVar, this.f389177e);
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f389179g;
        if (p9Var == null) {
            if ((this.f389176d & 1) != 0) {
                this.f389178f = java.util.Collections.unmodifiableList(this.f389178f);
                this.f389176d &= -2;
            }
            kg.x.m143283x24038875(xVar, this.f389178f);
        } else {
            kg.x.m143283x24038875(xVar, p9Var.g());
        }
        kg.x.m143284x24038c36(xVar, this.f389180h);
        kg.x.m143285x24038ff7(xVar, this.f389181i);
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var2 = this.f389183n;
        if (p9Var2 == null) {
            if ((this.f389176d & 2) != 0) {
                this.f389182m = java.util.Collections.unmodifiableList(this.f389182m);
                this.f389176d &= -3;
            }
            kg.x.m143287x2403e28d(xVar, this.f389182m);
        } else {
            kg.x.m143287x2403e28d(xVar, p9Var2.g());
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var3 = this.f389185p;
        if (p9Var3 == null) {
            if ((this.f389176d & 4) != 0) {
                this.f389184o = java.util.Collections.unmodifiableList(this.f389184o);
                this.f389176d &= -5;
            }
            kg.x.m143289x2403e64e(xVar, this.f389184o);
        } else {
            kg.x.m143289x2403e64e(xVar, p9Var3.g());
        }
        m20880xaf619bdf();
        return xVar;
    }

    /* renamed from: clone */
    public java.lang.Object m143247x5a5dd5d() {
        return (kg.w) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f389179g == null) {
            this.f389179g = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f389178f, (this.f389176d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f389178f = null;
        }
        return this.f389179g;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 e() {
        if (this.f389183n == null) {
            this.f389183n = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f389182m, (this.f389176d & 2) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f389182m = null;
        }
        return this.f389183n;
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 f() {
        if (this.f389185p == null) {
            this.f389185p = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f389184o, (this.f389176d & 4) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f389184o = null;
        }
        return this.f389185p;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.w g(com.p176xb6135e39.p283xc50a8b8b.d0 r3, com.p176xb6135e39.p283xc50a8b8b.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.x.m143294x2403f911()     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            java.lang.Object r3 = r1.mo20549xc7f9c18(r3, r4)     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            kg.x r3 = (kg.x) r3     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            if (r3 == 0) goto L10
            r2.h(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f127272d     // Catch: java.lang.Throwable -> L11
            kg.x r4 = (kg.x) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.h(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.w.g(com.google.protobuf.d0, com.google.protobuf.t4):kg.w");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return kg.x.m143295x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return kg.q2.O;
    }

    public kg.w h(kg.x xVar) {
        if (xVar == kg.x.m143295x7c90cfc0()) {
            return this;
        }
        if (xVar.m143335x2846c720()) {
            kg.h0 m143314xbd8dcbdc = xVar.m143314xbd8dcbdc();
            kg.h0 h0Var = this.f389177e;
            if (h0Var != null) {
                kg.g0 m142795x3136c9db = kg.h0.m142795x3136c9db(h0Var);
                m142795x3136c9db.e(m143314xbd8dcbdc);
                this.f389177e = m142795x3136c9db.mo20557x85702333();
            } else {
                this.f389177e = m143314xbd8dcbdc;
            }
            m20881x7bb163d5();
        }
        if (this.f389179g == null) {
            if (!kg.x.m143282x24038873(xVar).isEmpty()) {
                if (this.f389178f.isEmpty()) {
                    this.f389178f = kg.x.m143282x24038873(xVar);
                    this.f389176d &= -2;
                } else {
                    if ((this.f389176d & 1) == 0) {
                        this.f389178f = new java.util.ArrayList(this.f389178f);
                        this.f389176d |= 1;
                    }
                    this.f389178f.addAll(kg.x.m143282x24038873(xVar));
                }
                m20881x7bb163d5();
            }
        } else if (!kg.x.m143282x24038873(xVar).isEmpty()) {
            if (this.f389179g.p()) {
                this.f389179g.f126942a = null;
                this.f389179g = null;
                this.f389178f = kg.x.m143282x24038873(xVar);
                this.f389176d &= -2;
                this.f389179g = kg.x.m143290x2403ea0d() ? d() : null;
            } else {
                this.f389179g.b(kg.x.m143282x24038873(xVar));
            }
        }
        if (xVar.m143334x6f29b43e()) {
            kg.j m143312x33d32c02 = xVar.m143312x33d32c02();
            kg.j jVar = this.f389180h;
            if (jVar != null) {
                kg.i m142830x3136c9db = kg.j.m142830x3136c9db(jVar);
                m142830x3136c9db.e(m143312x33d32c02);
                this.f389180h = m142830x3136c9db.mo20557x85702333();
            } else {
                this.f389180h = m143312x33d32c02;
            }
            m20881x7bb163d5();
        }
        if (xVar.m143336x622853dc()) {
            kg.b1 m143316xf76f5898 = xVar.m143316xf76f5898();
            kg.b1 b1Var = this.f389181i;
            if (b1Var != null) {
                kg.a1 m142618x3136c9db = kg.b1.m142618x3136c9db(b1Var);
                m142618x3136c9db.f(m143316xf76f5898);
                this.f389181i = m142618x3136c9db.mo20557x85702333();
            } else {
                this.f389181i = m143316xf76f5898;
            }
            m20881x7bb163d5();
        }
        if (this.f389183n == null) {
            if (!kg.x.m143286x2403e28b(xVar).isEmpty()) {
                if (this.f389182m.isEmpty()) {
                    this.f389182m = kg.x.m143286x2403e28b(xVar);
                    this.f389176d &= -3;
                } else {
                    if ((this.f389176d & 2) == 0) {
                        this.f389182m = new java.util.ArrayList(this.f389182m);
                        this.f389176d |= 2;
                    }
                    this.f389182m.addAll(kg.x.m143286x2403e28b(xVar));
                }
                m20881x7bb163d5();
            }
        } else if (!kg.x.m143286x2403e28b(xVar).isEmpty()) {
            if (this.f389183n.p()) {
                this.f389183n.f126942a = null;
                this.f389183n = null;
                this.f389182m = kg.x.m143286x2403e28b(xVar);
                this.f389176d &= -3;
                this.f389183n = kg.x.m143291x2403edce() ? e() : null;
            } else {
                this.f389183n.b(kg.x.m143286x2403e28b(xVar));
            }
        }
        if (this.f389185p == null) {
            if (!kg.x.m143288x2403e64c(xVar).isEmpty()) {
                if (this.f389184o.isEmpty()) {
                    this.f389184o = kg.x.m143288x2403e64c(xVar);
                    this.f389176d &= -5;
                } else {
                    if ((this.f389176d & 4) == 0) {
                        this.f389184o = new java.util.ArrayList(this.f389184o);
                        this.f389176d |= 4;
                    }
                    this.f389184o.addAll(kg.x.m143288x2403e64c(xVar));
                }
                m20881x7bb163d5();
            }
        } else if (!kg.x.m143288x2403e64c(xVar).isEmpty()) {
            if (this.f389185p.p()) {
                this.f389185p.f126942a = null;
                this.f389185p = null;
                this.f389184o = kg.x.m143288x2403e64c(xVar);
                this.f389176d &= -5;
                this.f389185p = kg.x.m143292x2403f18f() ? f() : null;
            } else {
                this.f389185p.b(kg.x.m143288x2403e64c(xVar));
            }
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.P;
        j6Var.c(kg.x.class, kg.w.class);
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
        return (kg.w) m45492xba8a5e4b(waVar);
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
        return kg.x.m143295x7c90cfc0();
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
        kg.x mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof kg.x) {
            h((kg.x) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof kg.x) {
            h((kg.x) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public w(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, kg.b bVar) {
        super(r5Var);
        this.f389178f = java.util.Collections.emptyList();
        this.f389182m = java.util.Collections.emptyList();
        this.f389184o = java.util.Collections.emptyList();
        if (kg.x.m143280x24037d30()) {
            d();
            e();
            f();
        }
    }
}
