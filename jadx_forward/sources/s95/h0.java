package s95;

/* loaded from: classes16.dex */
public final class h0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.h0 f486612g = new s95.h0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486613h = new s95.f0();

    /* renamed from: d, reason: collision with root package name */
    public long f486614d;

    /* renamed from: e, reason: collision with root package name */
    public s95.n0 f486615e;

    /* renamed from: f, reason: collision with root package name */
    public byte f486616f;

    public h0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.f0 f0Var) {
        super(q5Var);
        this.f486616f = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.h0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.h0 h0Var = (s95.h0) obj;
        if (this.f486614d == h0Var.f486614d && h() == h0Var.h()) {
            return (!h() || g().mo20583xb2c87fbf(h0Var.g())) && this.f7874x4f0c37a3.m20941xb2c87fbf(h0Var.f7874x4f0c37a3);
        }
        return false;
    }

    public s95.n0 g() {
        s95.n0 n0Var = this.f486615e;
        return n0Var == null ? s95.n0.f486667z : n0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486612g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f486614d;
        int s17 = j17 != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.s(1, j17) : 0;
        if (this.f486615e != null) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, g());
        }
        int mo20593x9d9c349b = s17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public boolean h() {
        return this.f486615e != null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.A.hashCode()) * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486614d);
        if (h()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s95.g0 mo20599xaaa148a0() {
        if (this == f486612g) {
            return new s95.g0(null);
        }
        s95.g0 g0Var = new s95.g0(null);
        g0Var.e(this);
        return g0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.B;
        j6Var.c(s95.h0.class, s95.g0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486616f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486616f = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486612g.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.h0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        long j17 = this.f486614d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        if (this.f486615e != null) {
            k0Var.J(2, g());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486612g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486612g.mo20599xaaa148a0();
    }

    public h0() {
        this.f486616f = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.g0(r5Var, null);
    }

    public h0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.f0 f0Var) {
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
                                this.f486614d = d0Var.H();
                            } else if (F != 18) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.n0 n0Var = this.f486615e;
                                s95.m0 mo20599xaaa148a0 = n0Var != null ? n0Var.mo20599xaaa148a0() : null;
                                s95.n0 n0Var2 = (s95.n0) d0Var.v(s95.n0.A, t4Var);
                                this.f486615e = n0Var2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(n0Var2);
                                    this.f486615e = mo20599xaaa148a0.mo20557x85702333();
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
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
