package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class y extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y f149638m = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y();

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f149639n = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.w();

    /* renamed from: d, reason: collision with root package name */
    public int f149640d;

    /* renamed from: e, reason: collision with root package name */
    public double f149641e;

    /* renamed from: f, reason: collision with root package name */
    public double f149642f;

    /* renamed from: g, reason: collision with root package name */
    public double f149643g;

    /* renamed from: h, reason: collision with root package name */
    public double f149644h;

    /* renamed from: i, reason: collision with root package name */
    public byte f149645i;

    public y(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(q5Var);
        this.f149645i = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y yVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y) obj;
        if (i() != yVar.i()) {
            return false;
        }
        if ((i() && java.lang.Double.doubleToLongBits(this.f149641e) != java.lang.Double.doubleToLongBits(yVar.f149641e)) || j() != yVar.j()) {
            return false;
        }
        if ((j() && java.lang.Double.doubleToLongBits(this.f149642f) != java.lang.Double.doubleToLongBits(yVar.f149642f)) || h() != yVar.h()) {
            return false;
        }
        if ((!h() || java.lang.Double.doubleToLongBits(this.f149643g) == java.lang.Double.doubleToLongBits(yVar.f149643g)) && g() == yVar.g()) {
            return (!g() || java.lang.Double.doubleToLongBits(this.f149644h) == java.lang.Double.doubleToLongBits(yVar.f149644h)) && this.f7874x4f0c37a3.m20941xb2c87fbf(yVar.f7874x4f0c37a3);
        }
        return false;
    }

    public boolean g() {
        return (this.f149640d & 8) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f149638m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int e17 = (this.f149640d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.e(1, this.f149641e) : 0;
        if ((this.f149640d & 2) != 0) {
            e17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(2, this.f149642f);
        }
        if ((this.f149640d & 4) != 0) {
            e17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(3, this.f149643g);
        }
        if ((this.f149640d & 8) != 0) {
            e17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(4, this.f149644h);
        }
        int mo20593x9d9c349b = e17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public boolean h() {
        return (this.f149640d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149578q.hashCode();
        if (i()) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f149641e));
        }
        if (j()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f149642f));
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f149643g));
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f149644h));
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public boolean i() {
        return (this.f149640d & 1) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149579r;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f149645i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!i()) {
            this.f149645i = (byte) 0;
            return false;
        }
        if (!j()) {
            this.f149645i = (byte) 0;
            return false;
        }
        if (!h()) {
            this.f149645i = (byte) 0;
            return false;
        }
        if (g()) {
            this.f149645i = (byte) 1;
            return true;
        }
        this.f149645i = (byte) 0;
        return false;
    }

    public boolean j() {
        return (this.f149640d & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x mo20599xaaa148a0() {
        if (this == f149638m) {
            return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x(null);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x xVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x(null);
        xVar.e(this);
        return xVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f149638m.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.y();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f149640d & 1) != 0) {
            k0Var.B(1, this.f149641e);
        }
        if ((this.f149640d & 2) != 0) {
            k0Var.B(2, this.f149642f);
        }
        if ((this.f149640d & 4) != 0) {
            k0Var.B(3, this.f149643g);
        }
        if ((this.f149640d & 8) != 0) {
            k0Var.B(4, this.f149644h);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f149638m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f149638m.mo20599xaaa148a0();
    }

    public y() {
        this.f149645i = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.x(r5Var, null);
    }

    public y(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
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
                            if (F == 9) {
                                this.f149640d |= 1;
                                this.f149641e = d0Var.n();
                            } else if (F == 17) {
                                this.f149640d |= 2;
                                this.f149642f = d0Var.n();
                            } else if (F == 25) {
                                this.f149640d |= 4;
                                this.f149643g = d0Var.n();
                            } else if (F != 33) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f149640d |= 8;
                                this.f149644h = d0Var.n();
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
