package s95;

/* loaded from: classes16.dex */
public final class m0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public long f486647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f486648e;

    /* renamed from: f, reason: collision with root package name */
    public int f486649f;

    /* renamed from: g, reason: collision with root package name */
    public long f486650g;

    /* renamed from: h, reason: collision with root package name */
    public long f486651h;

    /* renamed from: i, reason: collision with root package name */
    public long f486652i;

    /* renamed from: m, reason: collision with root package name */
    public long f486653m;

    /* renamed from: n, reason: collision with root package name */
    public long f486654n;

    /* renamed from: o, reason: collision with root package name */
    public int f486655o;

    /* renamed from: p, reason: collision with root package name */
    public int f486656p;

    /* renamed from: q, reason: collision with root package name */
    public float f486657q;

    /* renamed from: r, reason: collision with root package name */
    public float f486658r;

    /* renamed from: s, reason: collision with root package name */
    public int f486659s;

    /* renamed from: t, reason: collision with root package name */
    public float f486660t;

    /* renamed from: u, reason: collision with root package name */
    public s95.o f486661u;

    /* renamed from: v, reason: collision with root package name */
    public s95.q0 f486662v;

    /* renamed from: w, reason: collision with root package name */
    public int f486663w;

    /* renamed from: x, reason: collision with root package name */
    public s95.k0 f486664x;

    public m0(s95.l0 l0Var) {
        super(null);
        this.f486648e = "";
        this.f486649f = 0;
        this.f486663w = 0;
        s95.n0 n0Var = s95.n0.f486667z;
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
        s95.n0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.n0 mo20557x85702333() {
        s95.n0 n0Var = new s95.n0(this, null);
        n0Var.f486668d = this.f486647d;
        n0Var.f486669e = this.f486648e;
        n0Var.f486670f = this.f486649f;
        n0Var.f486671g = this.f486650g;
        n0Var.f486672h = this.f486651h;
        n0Var.f486673i = this.f486652i;
        n0Var.f486674m = this.f486653m;
        n0Var.f486675n = this.f486654n;
        n0Var.f486676o = this.f486655o;
        n0Var.f486677p = this.f486656p;
        n0Var.f486678q = this.f486657q;
        n0Var.f486679r = this.f486658r;
        n0Var.f486680s = this.f486659s;
        n0Var.f486681t = this.f486660t;
        n0Var.f486682u = this.f486661u;
        n0Var.f486683v = this.f486662v;
        n0Var.f486684w = this.f486663w;
        n0Var.f486685x = this.f486664x;
        m20880xaf619bdf();
        return n0Var;
    }

    /* renamed from: clone */
    public java.lang.Object m164147x5a5dd5d() {
        return (s95.m0) m45490x5a5dd5d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.m0 d(com.p176xb6135e39.p283xc50a8b8b.d0 r2, com.p176xb6135e39.p283xc50a8b8b.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.n0.A     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.l0 r0 = (s95.l0) r0     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            java.lang.Object r2 = r0.mo20549xc7f9c18(r2, r3)     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            s95.n0 r2 = (s95.n0) r2     // Catch: java.lang.Throwable -> Le com.p176xb6135e39.p283xc50a8b8b.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f127272d     // Catch: java.lang.Throwable -> Le
            s95.n0 r3 = (s95.n0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: s95.m0.d(com.google.protobuf.d0, com.google.protobuf.t4):s95.m0");
    }

    public s95.m0 e(s95.n0 n0Var) {
        if (n0Var == s95.n0.f486667z) {
            return this;
        }
        long j17 = n0Var.f486668d;
        if (j17 != 0) {
            this.f486647d = j17;
            m20881x7bb163d5();
        }
        if (!n0Var.i().isEmpty()) {
            this.f486648e = n0Var.f486669e;
            m20881x7bb163d5();
        }
        int i17 = n0Var.f486670f;
        if (i17 != 0) {
            this.f486649f = i17;
            m20881x7bb163d5();
        }
        long j18 = n0Var.f486671g;
        if (j18 != 0) {
            this.f486650g = j18;
            m20881x7bb163d5();
        }
        long j19 = n0Var.f486672h;
        if (j19 != 0) {
            this.f486651h = j19;
            m20881x7bb163d5();
        }
        long j27 = n0Var.f486673i;
        if (j27 != 0) {
            this.f486652i = j27;
            m20881x7bb163d5();
        }
        long j28 = n0Var.f486674m;
        if (j28 != 0) {
            this.f486653m = j28;
            m20881x7bb163d5();
        }
        long j29 = n0Var.f486675n;
        if (j29 != 0) {
            this.f486654n = j29;
            m20881x7bb163d5();
        }
        int i18 = n0Var.f486676o;
        if (i18 != 0) {
            this.f486655o = i18;
            m20881x7bb163d5();
        }
        int i19 = n0Var.f486677p;
        if (i19 != 0) {
            this.f486656p = i19;
            m20881x7bb163d5();
        }
        float f17 = n0Var.f486678q;
        if (f17 != 0.0f) {
            this.f486657q = f17;
            m20881x7bb163d5();
        }
        float f18 = n0Var.f486679r;
        if (f18 != 0.0f) {
            this.f486658r = f18;
            m20881x7bb163d5();
        }
        int i27 = n0Var.f486680s;
        if (i27 != 0) {
            this.f486659s = i27;
            m20881x7bb163d5();
        }
        float f19 = n0Var.f486681t;
        if (f19 != 0.0f) {
            this.f486660t = f19;
            m20881x7bb163d5();
        }
        if (n0Var.f486682u != null) {
            s95.o h17 = n0Var.h();
            s95.o oVar = this.f486661u;
            if (oVar != null) {
                s95.n mo20599xaaa148a0 = s95.o.f486687g.mo20599xaaa148a0();
                mo20599xaaa148a0.f(oVar);
                mo20599xaaa148a0.f(h17);
                this.f486661u = mo20599xaaa148a0.mo20557x85702333();
            } else {
                this.f486661u = h17;
            }
            m20881x7bb163d5();
        }
        if (n0Var.f486683v != null) {
            s95.q0 j37 = n0Var.j();
            s95.q0 q0Var = this.f486662v;
            if (q0Var != null) {
                s95.p0 mo20599xaaa148a02 = s95.q0.f486700h.mo20599xaaa148a0();
                mo20599xaaa148a02.e(q0Var);
                mo20599xaaa148a02.e(j37);
                this.f486662v = mo20599xaaa148a02.mo20557x85702333();
            } else {
                this.f486662v = j37;
            }
            m20881x7bb163d5();
        }
        int i28 = n0Var.f486684w;
        if (i28 != 0) {
            this.f486663w = i28;
            m20881x7bb163d5();
        }
        if (n0Var.f486685x != null) {
            s95.k0 g17 = n0Var.g();
            s95.k0 k0Var = this.f486664x;
            if (k0Var != null) {
                s95.j0 mo20599xaaa148a03 = s95.k0.f486636g.mo20599xaaa148a0();
                mo20599xaaa148a03.e(k0Var);
                mo20599xaaa148a03.e(g17);
                this.f486664x = mo20599xaaa148a03.mo20557x85702333();
            } else {
                this.f486664x = g17;
            }
            m20881x7bb163d5();
        }
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return s95.n0.f486667z;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return s95.r0.f486717i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486718j;
        j6Var.c(s95.n0.class, s95.m0.class);
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
        return (s95.m0) m45492xba8a5e4b(waVar);
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
        return s95.n0.f486667z;
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
        s95.n0 mo20557x85702333 = mo20557x85702333();
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
        if (k8Var instanceof s95.n0) {
            e((s95.n0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public m0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, s95.l0 l0Var) {
        super(r5Var);
        this.f486648e = "";
        this.f486649f = 0;
        this.f486663w = 0;
        s95.n0 n0Var = s95.n0.f486667z;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof s95.n0) {
            e((s95.n0) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
