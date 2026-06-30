package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class j1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.j1 f126749i = new com.p176xb6135e39.p283xc50a8b8b.j1();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126750m = new com.p176xb6135e39.p283xc50a8b8b.h1();

    /* renamed from: d, reason: collision with root package name */
    public int f126751d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f126752e;

    /* renamed from: f, reason: collision with root package name */
    public int f126753f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.m1 f126754g;

    /* renamed from: h, reason: collision with root package name */
    public byte f126755h;

    public j1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126755h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.j1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.j1 j1Var = (com.p176xb6135e39.p283xc50a8b8b.j1) obj;
        int i17 = this.f126751d;
        if (((i17 & 1) != 0) != ((j1Var.f126751d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !m20719xfb82e301().equals(j1Var.m20719xfb82e301())) {
            return false;
        }
        int i18 = this.f126751d;
        if (((i18 & 2) != 0) != ((j1Var.f126751d & 2) != 0)) {
            return false;
        }
        if ((!((i18 & 2) != 0) || this.f126753f == j1Var.f126753f) && g() == j1Var.g()) {
            return (!g() || f().mo20583xb2c87fbf(j1Var.f())) && this.f7874x4f0c37a3.m20941xb2c87fbf(j1Var.f7874x4f0c37a3);
        }
        return false;
    }

    public com.p176xb6135e39.p283xc50a8b8b.m1 f() {
        com.p176xb6135e39.p283xc50a8b8b.m1 m1Var = this.f126754g;
        return m1Var == null ? com.p176xb6135e39.p283xc50a8b8b.m1.f126841i : m1Var;
    }

    public boolean g() {
        return (this.f126751d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126749i;
    }

    /* renamed from: getName */
    public java.lang.String m20719xfb82e301() {
        java.lang.Object obj = this.f126752e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126752e = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f126751d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f126752e) : 0;
        if ((this.f126751d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f126753f);
        }
        if ((this.f126751d & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, f());
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.i1 mo20599xaaa148a0() {
        if (this == f126749i) {
            return new com.p176xb6135e39.p283xc50a8b8b.i1(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.i1 i1Var = new com.p176xb6135e39.p283xc50a8b8b.i1(null);
        i1Var.e(this);
        return i1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126933s.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126751d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20719xfb82e301().hashCode();
        }
        if ((this.f126751d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f126753f;
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
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126934t;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.j1.class, com.p176xb6135e39.p283xc50a8b8b.i1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126755h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g() || f().mo20562xf582434a()) {
            this.f126755h = (byte) 1;
            return true;
        }
        this.f126755h = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126749i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.j1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f126751d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f126752e);
        }
        if ((this.f126751d & 2) != 0) {
            k0Var.H(2, this.f126753f);
        }
        if ((this.f126751d & 4) != 0) {
            k0Var.J(3, f());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126749i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126749i.mo20599xaaa148a0();
    }

    public j1() {
        this.f126755h = (byte) -1;
        this.f126752e = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.i1(r5Var, null);
    }
}
