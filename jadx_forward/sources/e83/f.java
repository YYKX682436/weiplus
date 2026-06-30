package e83;

/* loaded from: classes16.dex */
public final class f extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final e83.f f331661i = new e83.f();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f331662m = new e83.d();

    /* renamed from: d, reason: collision with root package name */
    public int f331663d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f331664e;

    /* renamed from: f, reason: collision with root package name */
    public int f331665f;

    /* renamed from: g, reason: collision with root package name */
    public e83.e0 f331666g;

    /* renamed from: h, reason: collision with root package name */
    public byte f331667h;

    public f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f331667h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.f)) {
            return super.mo20583xb2c87fbf(obj);
        }
        e83.f fVar = (e83.f) obj;
        int i17 = this.f331663d;
        if (((i17 & 1) != 0) != ((fVar.f331663d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !h().equals(fVar.h())) {
            return false;
        }
        int i18 = this.f331663d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = fVar.f331663d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f331665f != fVar.f331665f) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        return (!((i18 & 4) != 0) || i().mo20583xb2c87fbf(fVar.i())) && this.f7874x4f0c37a3.m20941xb2c87fbf(fVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f331661i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f331663d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f331664e) : 0;
        if ((this.f331663d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f331665f);
        }
        if ((this.f331663d & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, i());
        }
        int mo20593x9d9c349b = m20743x690e0f49 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f331664e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331664e = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f331746s.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f331663d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + h().hashCode();
        }
        int i18 = this.f331663d;
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f331665f;
        }
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + i().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public e83.e0 i() {
        e83.e0 e0Var = this.f331666g;
        return e0Var == null ? e83.e0.f331657f : e0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331747t;
        j6Var.c(e83.f.class, e83.e.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f331667h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f331667h = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e83.e mo20599xaaa148a0() {
        if (this == f331661i) {
            return new e83.e(null);
        }
        e83.e eVar = new e83.e(null);
        eVar.e(this);
        return eVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f331661i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new e83.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f331663d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f331664e);
        }
        if ((this.f331663d & 2) != 0) {
            k0Var.H(2, this.f331665f);
        }
        if ((this.f331663d & 4) != 0) {
            k0Var.J(3, i());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f331661i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f331661i.mo20599xaaa148a0();
    }

    public f() {
        this.f331667h = (byte) -1;
        this.f331664e = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new e83.e(r5Var, null);
    }

    public f(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                this.f331663d = 1 | this.f331663d;
                                this.f331664e = m17;
                            } else if (F == 16) {
                                this.f331663d |= 2;
                                this.f331665f = d0Var.t();
                            } else if (F != 26) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                e83.d0 mo20599xaaa148a0 = (this.f331663d & 4) != 0 ? this.f331666g.mo20599xaaa148a0() : null;
                                e83.e0 e0Var = (e83.e0) d0Var.v(e83.e0.f331658g, t4Var);
                                this.f331666g = e0Var;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.f(e0Var);
                                    this.f331666g = mo20599xaaa148a0.mo20557x85702333();
                                }
                                this.f331663d |= 4;
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
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
