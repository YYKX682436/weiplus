package cz5;

/* loaded from: classes16.dex */
public final class d extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public long f306574d;

    /* renamed from: e, reason: collision with root package name */
    public long f306575e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f306576f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.d8 f306577g;

    /* renamed from: h, reason: collision with root package name */
    public int f306578h;

    /* renamed from: i, reason: collision with root package name */
    public int f306579i;

    public d(cz5.b bVar) {
        super(null);
        this.f306576f = "";
        cz5.f fVar = cz5.f.f306581n;
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
        cz5.f mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz5.f mo20557x85702333() {
        cz5.f fVar = new cz5.f(this, null);
        fVar.f306583d = this.f306574d;
        fVar.f306584e = this.f306575e;
        fVar.f306585f = this.f306576f;
        com.p176xb6135e39.p283xc50a8b8b.d8 d8Var = this.f306577g;
        if (d8Var == null) {
            d8Var = new com.p176xb6135e39.p283xc50a8b8b.d8(cz5.e.f306580a, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, java.util.Collections.emptyMap());
        }
        fVar.f306586g = d8Var;
        d8Var.f126558a = false;
        fVar.f306587h = this.f306578h;
        fVar.f306588i = this.f306579i;
        m20880xaf619bdf();
        return fVar;
    }

    /* renamed from: clone */
    public java.lang.Object m123176x5a5dd5d() {
        return (cz5.d) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.d8 d() {
        m20881x7bb163d5();
        com.p176xb6135e39.p283xc50a8b8b.d8 d8Var = this.f306577g;
        com.p176xb6135e39.p283xc50a8b8b.c8 c8Var = com.p176xb6135e39.p283xc50a8b8b.c8.MAP;
        if (d8Var == null) {
            this.f306577g = new com.p176xb6135e39.p283xc50a8b8b.d8(cz5.e.f306580a, c8Var, new java.util.LinkedHashMap());
        }
        if (!this.f306577g.f126558a) {
            com.p176xb6135e39.p283xc50a8b8b.d8 d8Var2 = this.f306577g;
            this.f306577g = new com.p176xb6135e39.p283xc50a8b8b.d8(d8Var2.f126562e, c8Var, com.p176xb6135e39.p283xc50a8b8b.e8.c(d8Var2.e()));
        }
        return this.f306577g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cz5.d e(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = cz5.f.f306582o     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            cz5.c r0 = (cz5.c) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            cz5.f r2 = (cz5.f) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            cz5.f r3 = (cz5.f) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: cz5.d.e(com.google.protobuf.d0, com.google.protobuf.t4):cz5.d");
    }

    public cz5.d f(cz5.f fVar) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        if (fVar == cz5.f.f306581n) {
            return this;
        }
        long j17 = fVar.f306583d;
        if (j17 != 0) {
            this.f306574d = j17;
            m20881x7bb163d5();
        }
        long j18 = fVar.f306584e;
        if (j18 != 0) {
            this.f306575e = j18;
            m20881x7bb163d5();
        }
        if (!fVar.m123179xfb82e301().isEmpty()) {
            this.f306576f = fVar.f306585f;
            m20881x7bb163d5();
        }
        com.p176xb6135e39.p283xc50a8b8b.d8 d17 = d();
        com.p176xb6135e39.p283xc50a8b8b.d8 g17 = fVar.g();
        ((com.p176xb6135e39.p283xc50a8b8b.b8) d17.g()).putAll(com.p176xb6135e39.p283xc50a8b8b.e8.c(g17.e()));
        int i17 = fVar.f306587h;
        if (i17 != 0) {
            this.f306578h = i17;
            m20881x7bb163d5();
        }
        int i18 = fVar.f306588i;
        if (i18 != 0) {
            this.f306579i = i18;
            m20881x7bb163d5();
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) fVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return cz5.f.f306581n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return cz5.g.f306590a;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = cz5.g.f306591b;
        j6Var.c(cz5.f.class, cz5.d.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20877xf53a7b77(int i17) {
        if (i17 == 4) {
            com.p176xb6135e39.p283xc50a8b8b.d8 d8Var = this.f306577g;
            return d8Var == null ? new com.p176xb6135e39.p283xc50a8b8b.d8(cz5.e.f306580a, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, java.util.Collections.emptyMap()) : d8Var;
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetMutableMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20878x45eb59ab(int i17) {
        if (i17 == 4) {
            return d();
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
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
        return (cz5.d) m45492xba8a5e4b(waVar);
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
        return cz5.f.f306581n;
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

    public d(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, cz5.b bVar) {
        super(r5Var);
        this.f306576f = "";
        cz5.f fVar = cz5.f.f306581n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        cz5.f mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof cz5.f) {
            f((cz5.f) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof cz5.f) {
            f((cz5.f) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
