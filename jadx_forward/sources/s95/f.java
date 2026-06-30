package s95;

/* loaded from: classes16.dex */
public final class f extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.f f486588i = new s95.f();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486589m = new s95.d();

    /* renamed from: d, reason: collision with root package name */
    public s95.y f486590d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f486591e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f486592f;

    /* renamed from: g, reason: collision with root package name */
    public s95.y f486593g;

    /* renamed from: h, reason: collision with root package name */
    public byte f486594h;

    public f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.d dVar) {
        super(q5Var);
        this.f486594h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.f)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.f fVar = (s95.f) obj;
        s95.y yVar = this.f486590d;
        if ((yVar != null) != (fVar.f486590d != null)) {
            return false;
        }
        if (((yVar != null) && !i().mo20583xb2c87fbf(fVar.i())) || !this.f486591e.equals(fVar.f486591e) || this.f486592f != fVar.f486592f) {
            return false;
        }
        s95.y yVar2 = this.f486593g;
        if ((yVar2 != null) != (fVar.f486593g != null)) {
            return false;
        }
        return (!(yVar2 != null) || j().mo20583xb2c87fbf(fVar.j())) && this.f7874x4f0c37a3.m20941xb2c87fbf(fVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486588i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f486590d != null ? com.p176xb6135e39.p283xc50a8b8b.k0.n(1, i()) + 0 : 0;
        for (int i18 = 0; i18 < this.f486591e.size(); i18++) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486591e.get(i18));
        }
        boolean z17 = this.f486592f;
        if (z17) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(3, z17);
        }
        if (this.f486593g != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, j());
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = s95.r0.f486723o.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (this.f486590d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().mo20587x8cdac1b();
        }
        if (this.f486591e.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f486591e.hashCode();
        }
        int a17 = (((hashCode * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486592f);
        if (this.f486593g != null) {
            a17 = (((a17 * 37) + 4) * 53) + j().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (a17 * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public s95.y i() {
        s95.y yVar = this.f486590d;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486724p;
        j6Var.c(s95.f.class, s95.e.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486594h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486594h = (byte) 1;
        return true;
    }

    public s95.y j() {
        s95.y yVar = this.f486593g;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s95.e mo20599xaaa148a0() {
        if (this == f486588i) {
            return new s95.e(null);
        }
        s95.e eVar = new s95.e(null);
        eVar.f(this);
        return eVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486588i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f486590d != null) {
            k0Var.J(1, i());
        }
        for (int i17 = 0; i17 < this.f486591e.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486591e.get(i17));
        }
        boolean z17 = this.f486592f;
        if (z17) {
            k0Var.x(3, z17);
        }
        if (this.f486593g != null) {
            k0Var.J(4, j());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486588i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486588i.mo20599xaaa148a0();
    }

    public f() {
        this.f486594h = (byte) -1;
        this.f486591e = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.e(r5Var, null);
    }

    public f(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.d dVar) {
        this();
        s95.x mo20599xaaa148a0;
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                s95.y yVar = this.f486590d;
                                mo20599xaaa148a0 = yVar != null ? yVar.mo20599xaaa148a0() : null;
                                s95.y yVar2 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                                this.f486590d = yVar2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(yVar2);
                                    this.f486590d = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F == 18) {
                                if (!(z18 & true)) {
                                    this.f486591e = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                this.f486591e.add(d0Var.v(s95.c.f486553h, t4Var));
                            } else if (F == 24) {
                                this.f486592f = d0Var.l();
                            } else if (F != 34) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.y yVar3 = this.f486593g;
                                mo20599xaaa148a0 = yVar3 != null ? yVar3.mo20599xaaa148a0() : null;
                                s95.y yVar4 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                                this.f486593g = yVar4;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(yVar4);
                                    this.f486593g = mo20599xaaa148a0.mo20557x85702333();
                                }
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = this;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    this.f486591e = java.util.Collections.unmodifiableList(this.f486591e);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
