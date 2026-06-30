package kg;

/* loaded from: classes16.dex */
public final class n1 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements kg.p1 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f389111d;

    /* renamed from: e, reason: collision with root package name */
    public kg.s1 f389112e;

    /* renamed from: f, reason: collision with root package name */
    public kg.t0 f389113f;

    /* renamed from: g, reason: collision with root package name */
    public kg.p0 f389114g;

    /* renamed from: h, reason: collision with root package name */
    public float f389115h;

    /* renamed from: i, reason: collision with root package name */
    public int f389116i;

    public n1(kg.b bVar) {
        super(null);
        boolean unused;
        this.f389111d = "";
        unused = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
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
        kg.o1 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.o1 mo20557x85702333() {
        kg.o1 o1Var = new kg.o1(this);
        o1Var.f72564x69260d2 = this.f389111d;
        o1Var.f72563x6e64745b = this.f389112e;
        o1Var.f72560x9342597f = this.f389113f;
        o1Var.f72559xfcb813b = this.f389114g;
        o1Var.f72561x30ed1599 = this.f389115h;
        o1Var.f72558x81d3b27e = this.f389116i;
        m20880xaf619bdf();
        return o1Var;
    }

    /* renamed from: clone */
    public java.lang.Object m142969x5a5dd5d() {
        return (kg.n1) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.n1 d(com.p176xb6135e39.p283xc50a8b8b.d0 r3, com.p176xb6135e39.p283xc50a8b8b.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.o1.m142985x2402110f()     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            java.lang.Object r3 = r1.mo20549xc7f9c18(r3, r4)     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            kg.o1 r3 = (kg.o1) r3     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            if (r3 == 0) goto L10
            r2.e(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f127272d     // Catch: java.lang.Throwable -> L11
            kg.o1 r4 = (kg.o1) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.e(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.n1.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.n1");
    }

    public kg.n1 e(kg.o1 o1Var) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        java.lang.Object obj;
        if (o1Var == kg.o1.m142987x7c90cfc0()) {
            return this;
        }
        if (!o1Var.m143011xfb85ada3().isEmpty()) {
            obj = o1Var.f72564x69260d2;
            this.f389111d = obj;
            m20881x7bb163d5();
        }
        if (o1Var.m143017x80c1f70a()) {
            kg.s1 m143013xc0ec8dce = o1Var.m143013xc0ec8dce();
            kg.s1 s1Var = this.f389112e;
            if (s1Var != null) {
                kg.r1 m143148x3136c9db = kg.s1.m143148x3136c9db(s1Var);
                m143148x3136c9db.e(m143013xc0ec8dce);
                this.f389112e = m143148x3136c9db.mo20557x85702333();
            } else {
                this.f389112e = m143013xc0ec8dce;
            }
            m20881x7bb163d5();
        }
        if (o1Var.m143016x2596791a()) {
            kg.t0 m143007xeabebad6 = o1Var.m143007xeabebad6();
            kg.t0 t0Var = this.f389113f;
            if (t0Var != null) {
                kg.s0 m143220x3136c9db = kg.t0.m143220x3136c9db(t0Var);
                m143220x3136c9db.e(m143007xeabebad6);
                this.f389113f = m143220x3136c9db.mo20557x85702333();
            } else {
                this.f389113f = m143007xeabebad6;
            }
            m20881x7bb163d5();
        }
        if (o1Var.m143015x5524565e()) {
            kg.p0 m143005xea6b5b1a = o1Var.m143005xea6b5b1a();
            kg.p0 p0Var = this.f389114g;
            if (p0Var != null) {
                kg.o0 m143101x3136c9db = kg.p0.m143101x3136c9db(p0Var);
                m143101x3136c9db.e(m143005xea6b5b1a);
                this.f389114g = m143101x3136c9db.mo20557x85702333();
            } else {
                this.f389114g = m143005xea6b5b1a;
            }
            m20881x7bb163d5();
        }
        if (o1Var.m143009x8bd0edfc() != 0.0f) {
            this.f389115h = o1Var.m143009x8bd0edfc();
            m20881x7bb163d5();
        }
        if (o1Var.m143004xea2ec5f7() != 0) {
            this.f389116i = o1Var.m143004xea2ec5f7();
            m20881x7bb163d5();
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) o1Var).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return kg.o1.m142987x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return kg.q2.I;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = kg.q2.f389131J;
        j6Var.c(kg.o1.class, kg.n1.class);
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
        return (kg.n1) m45492xba8a5e4b(waVar);
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
        return kg.o1.m142987x7c90cfc0();
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

    public n1(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        this.f389111d = "";
        unused = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        kg.o1 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof kg.o1) {
            e((kg.o1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof kg.o1) {
            e((kg.o1) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
