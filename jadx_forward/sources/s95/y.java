package s95;

/* loaded from: classes16.dex */
public final class y extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.y f486773i = new s95.y();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486774m = new s95.w();

    /* renamed from: d, reason: collision with root package name */
    public int f486775d;

    /* renamed from: e, reason: collision with root package name */
    public int f486776e;

    /* renamed from: f, reason: collision with root package name */
    public int f486777f;

    /* renamed from: g, reason: collision with root package name */
    public int f486778g;

    /* renamed from: h, reason: collision with root package name */
    public byte f486779h;

    public y(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.w wVar) {
        super(q5Var);
        this.f486779h = (byte) -1;
    }

    public static s95.x g(s95.y yVar) {
        s95.x mo20599xaaa148a0 = f486773i.mo20599xaaa148a0();
        mo20599xaaa148a0.e(yVar);
        return mo20599xaaa148a0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.y)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.y yVar = (s95.y) obj;
        return this.f486775d == yVar.f486775d && this.f486776e == yVar.f486776e && this.f486777f == yVar.f486777f && this.f486778g == yVar.f486778g && this.f7874x4f0c37a3.m20941xb2c87fbf(yVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486773i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f486775d;
        int k17 = i18 != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, i18) : 0;
        int i19 = this.f486776e;
        if (i19 != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, i19);
        }
        int i27 = this.f486777f;
        if (i27 != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(3, i27);
        }
        int i28 = this.f486778g;
        if (i28 != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(4, i28);
        }
        int mo20593x9d9c349b = k17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s95.x mo20599xaaa148a0() {
        if (this == f486773i) {
            return new s95.x(null);
        }
        s95.x xVar = new s95.x(null);
        xVar.e(this);
        return xVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486709a.hashCode()) * 37) + 1) * 53) + this.f486775d) * 37) + 2) * 53) + this.f486776e) * 37) + 3) * 53) + this.f486777f) * 37) + 4) * 53) + this.f486778g) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486710b;
        j6Var.c(s95.y.class, s95.x.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486779h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486779h = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486773i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.y();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        int i17 = this.f486775d;
        if (i17 != 0) {
            k0Var.H(1, i17);
        }
        int i18 = this.f486776e;
        if (i18 != 0) {
            k0Var.H(2, i18);
        }
        int i19 = this.f486777f;
        if (i19 != 0) {
            k0Var.H(3, i19);
        }
        int i27 = this.f486778g;
        if (i27 != 0) {
            k0Var.H(4, i27);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486773i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486773i.mo20599xaaa148a0();
    }

    public y() {
        this.f486779h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.x(r5Var, null);
    }

    public y(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.w wVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f486775d = d0Var.t();
                        } else if (F == 16) {
                            this.f486776e = d0Var.t();
                        } else if (F == 24) {
                            this.f486777f = d0Var.t();
                        } else if (F != 32) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f486778g = d0Var.t();
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = this;
                    throw e17;
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
