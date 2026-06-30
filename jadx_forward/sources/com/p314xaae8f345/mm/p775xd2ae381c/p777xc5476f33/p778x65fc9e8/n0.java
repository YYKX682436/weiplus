package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class n0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 f149552m = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0();

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f149553n = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f149554d;

    /* renamed from: e, reason: collision with root package name */
    public int f149555e;

    /* renamed from: f, reason: collision with root package name */
    public int f149556f;

    /* renamed from: g, reason: collision with root package name */
    public int f149557g;

    /* renamed from: h, reason: collision with root package name */
    public int f149558h;

    /* renamed from: i, reason: collision with root package name */
    public byte f149559i;

    public n0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(q5Var);
        this.f149559i = (byte) -1;
    }

    public static com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 i() {
        return f149552m.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0) obj;
        if (g() != n0Var.g()) {
            return false;
        }
        if ((g() && this.f149555e != n0Var.f149555e) || h() != n0Var.h()) {
            return false;
        }
        if ((h() && this.f149556f != n0Var.f149556f) || m45573x7ef3b4c() != n0Var.m45573x7ef3b4c()) {
            return false;
        }
        if ((!m45573x7ef3b4c() || this.f149557g == n0Var.f149557g) && m45572xdc293461() == n0Var.m45572xdc293461()) {
            return (!m45572xdc293461() || this.f149558h == n0Var.f149558h) && this.f7874x4f0c37a3.m20941xb2c87fbf(n0Var.f7874x4f0c37a3);
        }
        return false;
    }

    public boolean g() {
        return (this.f149554d & 1) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f149552m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f149554d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f149555e) : 0;
        if ((this.f149554d & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f149556f);
        }
        if ((this.f149554d & 4) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(3, this.f149557g);
        }
        if ((this.f149554d & 8) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(4, this.f149558h);
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
        return (this.f149554d & 2) != 0;
    }

    /* renamed from: hasHeight */
    public boolean m45572xdc293461() {
        return (this.f149554d & 8) != 0;
    }

    /* renamed from: hasWidth */
    public boolean m45573x7ef3b4c() {
        return (this.f149554d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149562a.hashCode();
        if (g()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f149555e;
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f149556f;
        }
        if (m45573x7ef3b4c()) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f149557g;
        }
        if (m45572xdc293461()) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f149558h;
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149563b;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f149559i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g()) {
            this.f149559i = (byte) 0;
            return false;
        }
        if (!h()) {
            this.f149559i = (byte) 0;
            return false;
        }
        if (!m45573x7ef3b4c()) {
            this.f149559i = (byte) 0;
            return false;
        }
        if (m45572xdc293461()) {
            this.f149559i = (byte) 1;
            return true;
        }
        this.f149559i = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 mo20599xaaa148a0() {
        if (this == f149552m) {
            return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0(null);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 m0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0(null);
        m0Var.f(this);
        return m0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f149554d & 1) != 0) {
            k0Var.H(1, this.f149555e);
        }
        if ((this.f149554d & 2) != 0) {
            k0Var.H(2, this.f149556f);
        }
        if ((this.f149554d & 4) != 0) {
            k0Var.H(3, this.f149557g);
        }
        if ((this.f149554d & 8) != 0) {
            k0Var.H(4, this.f149558h);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f149552m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return i();
    }

    public n0() {
        this.f149559i = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0(r5Var, null);
    }

    public n0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
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
                            this.f149554d |= 1;
                            this.f149555e = d0Var.t();
                        } else if (F == 16) {
                            this.f149554d |= 2;
                            this.f149556f = d0Var.t();
                        } else if (F == 24) {
                            this.f149554d |= 4;
                            this.f149557g = d0Var.t();
                        } else if (F != 32) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f149554d |= 8;
                            this.f149558h = d0Var.t();
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
