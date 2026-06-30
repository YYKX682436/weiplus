package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class c1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.c1 f126478h = new com.p176xb6135e39.p283xc50a8b8b.c1();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126479i = new com.p176xb6135e39.p283xc50a8b8b.a1();

    /* renamed from: d, reason: collision with root package name */
    public int f126480d;

    /* renamed from: e, reason: collision with root package name */
    public int f126481e;

    /* renamed from: f, reason: collision with root package name */
    public int f126482f;

    /* renamed from: g, reason: collision with root package name */
    public byte f126483g;

    public c1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126483g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.c1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.c1 c1Var = (com.p176xb6135e39.p283xc50a8b8b.c1) obj;
        int i17 = this.f126480d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = c1Var.f126480d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f126481e != c1Var.f126481e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f126482f == c1Var.f126482f) && this.f7874x4f0c37a3.m20941xb2c87fbf(c1Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.b1 mo20599xaaa148a0() {
        if (this == f126478h) {
            return new com.p176xb6135e39.p283xc50a8b8b.b1(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.b1 b1Var = new com.p176xb6135e39.p283xc50a8b8b.b1(null);
        b1Var.e(this);
        return b1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126478h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f126480d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f126481e) : 0;
        if ((this.f126480d & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, this.f126482f);
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126931q.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        int i18 = this.f126480d;
        if ((i18 & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f126481e;
        }
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f126482f;
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126932r;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.c1.class, com.p176xb6135e39.p283xc50a8b8b.b1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126483g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f126483g = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126478h.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.c1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f126480d & 1) != 0) {
            k0Var.H(1, this.f126481e);
        }
        if ((this.f126480d & 2) != 0) {
            k0Var.H(2, this.f126482f);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126478h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126478h.mo20599xaaa148a0();
    }

    public c1() {
        this.f126483g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.b1(r5Var, null);
    }
}
