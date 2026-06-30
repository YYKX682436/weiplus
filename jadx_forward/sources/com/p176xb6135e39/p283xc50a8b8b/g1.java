package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class g1 extends com.p176xb6135e39.p283xc50a8b8b.u5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.g1 f126628m = new com.p176xb6135e39.p283xc50a8b8b.g1();

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126629n = new com.p176xb6135e39.p283xc50a8b8b.e1();

    /* renamed from: e, reason: collision with root package name */
    public int f126630e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126631f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126632g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f126633h;

    /* renamed from: i, reason: collision with root package name */
    public byte f126634i;

    public g1(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(s5Var);
        this.f126634i = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.g1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var = (com.p176xb6135e39.p283xc50a8b8b.g1) obj;
        int i17 = this.f126630e;
        boolean z17 = (i17 & 1) != 0;
        int i18 = g1Var.f126630e;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f126631f != g1Var.f126631f) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f126632g == g1Var.f126632g) && this.f126633h.equals(g1Var.f126633h) && this.f7874x4f0c37a3.m20941xb2c87fbf(g1Var.f7874x4f0c37a3) && h().equals(g1Var.h());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126628m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f126630e & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.k0.b(2, this.f126631f) + 0 : 0;
        if ((2 & this.f126630e) != 0) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(3, this.f126632g);
        }
        for (int i18 = 0; i18 < this.f126633h.size(); i18++) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126633h.get(i18));
        }
        int g17 = b17 + g() + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = g17;
        return g17;
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
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.G.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126630e & 1) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126631f);
        }
        if ((this.f126630e & 2) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126632g);
        }
        if (this.f126633h.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f126633h.hashCode();
        }
        int m20581x10dda967 = (com.p176xb6135e39.p283xc50a8b8b.c.m20581x10dda967(hashCode, h()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.H;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.g1.class, com.p176xb6135e39.p283xc50a8b8b.f1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126634i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126633h.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.o3) this.f126633h.get(i17)).mo20562xf582434a()) {
                this.f126634i = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f126634i = (byte) 1;
            return true;
        }
        this.f126634i = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.f1 mo20599xaaa148a0() {
        if (this == f126628m) {
            return new com.p176xb6135e39.p283xc50a8b8b.f1(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.f1 f1Var = new com.p176xb6135e39.p283xc50a8b8b.f1(null);
        f1Var.l(this);
        return f1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126628m.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.g1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t5 i17 = i();
        if ((this.f126630e & 1) != 0) {
            k0Var.x(2, this.f126631f);
        }
        if ((this.f126630e & 2) != 0) {
            k0Var.x(3, this.f126632g);
        }
        for (int i18 = 0; i18 < this.f126633h.size(); i18++) {
            k0Var.J(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126633h.get(i18));
        }
        i17.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, k0Var);
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126628m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126628m.mo20599xaaa148a0();
    }

    public g1() {
        this.f126634i = (byte) -1;
        this.f126633h = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.f1(r5Var, null);
    }
}
