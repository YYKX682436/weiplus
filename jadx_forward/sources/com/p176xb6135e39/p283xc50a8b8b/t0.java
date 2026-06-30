package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class t0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.t0 f127040i = new com.p176xb6135e39.p283xc50a8b8b.t0();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f127041m = new com.p176xb6135e39.p283xc50a8b8b.r0();

    /* renamed from: d, reason: collision with root package name */
    public int f127042d;

    /* renamed from: e, reason: collision with root package name */
    public int f127043e;

    /* renamed from: f, reason: collision with root package name */
    public int f127044f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p1 f127045g;

    /* renamed from: h, reason: collision with root package name */
    public byte f127046h;

    public t0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f127046h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.t0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.t0 t0Var = (com.p176xb6135e39.p283xc50a8b8b.t0) obj;
        int i17 = this.f127042d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = t0Var.f127042d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f127043e != t0Var.f127043e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if ((!((i17 & 2) != 0) || this.f127044f == t0Var.f127044f) && g() == t0Var.g()) {
            return (!g() || f().mo20583xb2c87fbf(t0Var.f())) && this.f7874x4f0c37a3.m20941xb2c87fbf(t0Var.f7874x4f0c37a3);
        }
        return false;
    }

    public com.p176xb6135e39.p283xc50a8b8b.p1 f() {
        com.p176xb6135e39.p283xc50a8b8b.p1 p1Var = this.f127045g;
        return p1Var == null ? com.p176xb6135e39.p283xc50a8b8b.p1.f126905g : p1Var;
    }

    public boolean g() {
        return (this.f127042d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f127040i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f127042d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f127043e) : 0;
        if ((this.f127042d & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f127044f);
        }
        if ((this.f127042d & 4) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, f());
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
    public com.p176xb6135e39.p283xc50a8b8b.s0 mo20599xaaa148a0() {
        if (this == f127040i) {
            return new com.p176xb6135e39.p283xc50a8b8b.s0(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.s0 s0Var = new com.p176xb6135e39.p283xc50a8b8b.s0(null);
        s0Var.e(this);
        return s0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126919e.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        int i18 = this.f127042d;
        if ((i18 & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f127043e;
        }
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f127044f;
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126920f;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.t0.class, com.p176xb6135e39.p283xc50a8b8b.s0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f127046h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g() || f().mo20562xf582434a()) {
            this.f127046h = (byte) 1;
            return true;
        }
        this.f127046h = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f127040i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.t0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f127042d & 1) != 0) {
            k0Var.H(1, this.f127043e);
        }
        if ((this.f127042d & 2) != 0) {
            k0Var.H(2, this.f127044f);
        }
        if ((this.f127042d & 4) != 0) {
            k0Var.J(3, f());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127040i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f127040i.mo20599xaaa148a0();
    }

    public t0() {
        this.f127046h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.s0(r5Var, null);
    }
}
