package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class k0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0 f149522i = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0();

    /* renamed from: m */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f149523m = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.i0();

    /* renamed from: d */
    public int f149524d;

    /* renamed from: e */
    public int f149525e;

    /* renamed from: f */
    public boolean f149526f;

    /* renamed from: g */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 f149527g;

    /* renamed from: h */
    public byte f149528h;

    public k0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(q5Var);
        this.f149528h = (byte) -1;
    }

    /* renamed from: access$3200 */
    public static /* synthetic */ boolean m45562xbf1947df() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa f(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0 k0Var) {
        return k0Var.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0 k0Var = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0) obj;
        if (h() != k0Var.h()) {
            return false;
        }
        if (h() && this.f149525e != k0Var.f149525e) {
            return false;
        }
        int i17 = this.f149524d;
        if (((i17 & 2) != 0) != ((k0Var.f149524d & 2) != 0)) {
            return false;
        }
        if ((!((i17 & 2) != 0) || this.f149526f == k0Var.f149526f) && m45563xd7e755e3() == k0Var.m45563xd7e755e3()) {
            return (!m45563xd7e755e3() || g().mo20583xb2c87fbf(k0Var.g())) && this.f7874x4f0c37a3.m20941xb2c87fbf(k0Var.f7874x4f0c37a3);
        }
        return false;
    }

    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 g() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = this.f149527g;
        return n0Var == null ? com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149552m : n0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f149522i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f149524d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f149525e) : 0;
        if ((this.f149524d & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(2, this.f149526f);
        }
        if ((this.f149524d & 4) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, g());
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

    public boolean h() {
        return (this.f149524d & 1) != 0;
    }

    /* renamed from: hasPosition */
    public boolean m45563xd7e755e3() {
        return (this.f149524d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149566e.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (h()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f149525e;
        }
        if ((this.f149524d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f149526f);
        }
        if (m45563xd7e755e3()) {
            hashCode = (((hashCode * 37) + 3) * 53) + g().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0 mo20599xaaa148a0() {
        if (this == f149522i) {
            return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0(null);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0 j0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0(null);
        j0Var.f(this);
        return j0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149567f;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f149528h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!h()) {
            this.f149528h = (byte) 0;
            return false;
        }
        if (!m45563xd7e755e3()) {
            this.f149528h = (byte) 0;
            return false;
        }
        if (g().mo20562xf582434a()) {
            this.f149528h = (byte) 1;
            return true;
        }
        this.f149528h = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f149522i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f149524d & 1) != 0) {
            k0Var.H(1, this.f149525e);
        }
        if ((this.f149524d & 2) != 0) {
            k0Var.x(2, this.f149526f);
        }
        if ((this.f149524d & 4) != 0) {
            k0Var.J(3, g());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f149522i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f149522i.mo20599xaaa148a0();
    }

    public k0() {
        this.f149528h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j0(r5Var, null);
    }

    public k0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
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
                                this.f149524d |= 1;
                                this.f149525e = d0Var.t();
                            } else if (F == 16) {
                                this.f149524d |= 2;
                                this.f149526f = d0Var.l();
                            } else if (F != 26) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 mo20599xaaa148a0 = (this.f149524d & 4) != 0 ? this.f149527g.mo20599xaaa148a0() : null;
                                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0) d0Var.v(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149553n, t4Var);
                                this.f149527g = n0Var;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.f(n0Var);
                                    this.f149527g = mo20599xaaa148a0.mo20557x85702333();
                                }
                                this.f149524d |= 4;
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
