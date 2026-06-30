package s95;

/* loaded from: classes16.dex */
public final class b0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.b0 f486547g = new s95.b0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486548h = new s95.z();

    /* renamed from: d, reason: collision with root package name */
    public int f486549d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.y f486550e;

    /* renamed from: f, reason: collision with root package name */
    public byte f486551f;

    public b0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.z zVar) {
        super(q5Var);
        this.f486551f = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.b0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.b0 b0Var = (s95.b0) obj;
        return this.f486549d == b0Var.f486549d && this.f486550e.mo20935xb2c87fbf(b0Var.f486550e) && this.f7874x4f0c37a3.m20941xb2c87fbf(b0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s95.a0 mo20599xaaa148a0() {
        if (this == f486547g) {
            return new s95.a0(null);
        }
        s95.a0 a0Var = new s95.a0(null);
        a0Var.e(this);
        return a0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486547g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = this.f486549d;
        int q17 = i18 != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.q(1, i18) : 0;
        if (!this.f486550e.m20957x7aab3243()) {
            q17 += com.p176xb6135e39.p283xc50a8b8b.k0.c(2, this.f486550e);
        }
        int mo20593x9d9c349b = q17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int hashCode = ((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486719k.hashCode()) * 37) + 1) * 53) + this.f486549d) * 37) + 2) * 53) + this.f486550e.m20956x8cdac1b()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486720l;
        j6Var.c(s95.b0.class, s95.a0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486551f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486551f = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486547g.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.b0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        int i17 = this.f486549d;
        if (i17 != 0) {
            k0Var.R(1, i17);
        }
        if (!this.f486550e.m20957x7aab3243()) {
            k0Var.z(2, this.f486550e);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486547g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486547g.mo20599xaaa148a0();
    }

    public b0() {
        this.f486551f = (byte) -1;
        this.f486550e = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.a0(r5Var, null);
    }

    public b0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.z zVar) {
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
                            if (F == 8) {
                                this.f486549d = d0Var.G();
                            } else if (F != 18) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f486550e = d0Var.m();
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17);
                        y6Var.f127272d = this;
                        throw y6Var;
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                    e18.f127272d = this;
                    throw e18;
                }
            } finally {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
