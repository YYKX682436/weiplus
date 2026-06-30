package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class z1 extends com.p176xb6135e39.p283xc50a8b8b.u5 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.z1 f127291q = new com.p176xb6135e39.p283xc50a8b8b.z1();

    /* renamed from: r, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f127292r = new com.p176xb6135e39.p283xc50a8b8b.v1();

    /* renamed from: e, reason: collision with root package name */
    public int f127293e;

    /* renamed from: f, reason: collision with root package name */
    public int f127294f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f127295g;

    /* renamed from: h, reason: collision with root package name */
    public int f127296h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f127297i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f127298m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f127299n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f127300o;

    /* renamed from: p, reason: collision with root package name */
    public byte f127301p;

    public z1(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(s5Var);
        this.f127301p = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.z1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var = (com.p176xb6135e39.p283xc50a8b8b.z1) obj;
        int i17 = this.f127293e;
        if (((i17 & 1) != 0) != ((z1Var.f127293e & 1) != 0)) {
            return false;
        }
        if ((((i17 & 1) != 0) && this.f127294f != z1Var.f127294f) || k() != z1Var.k()) {
            return false;
        }
        if (k() && this.f127295g != z1Var.f127295g) {
            return false;
        }
        int i18 = this.f127293e;
        boolean z17 = (i18 & 4) != 0;
        int i19 = z1Var.f127293e;
        if (z17 != ((i19 & 4) != 0)) {
            return false;
        }
        if (((i18 & 4) != 0) && this.f127296h != z1Var.f127296h) {
            return false;
        }
        if (((i18 & 8) != 0) != ((i19 & 8) != 0)) {
            return false;
        }
        if (((i18 & 8) != 0) && this.f127297i != z1Var.f127297i) {
            return false;
        }
        if (((i18 & 16) != 0) != ((i19 & 16) != 0)) {
            return false;
        }
        if (((i18 & 16) != 0) && this.f127298m != z1Var.f127298m) {
            return false;
        }
        if (((i18 & 32) != 0) != ((i19 & 32) != 0)) {
            return false;
        }
        return (!((i18 & 32) != 0) || this.f127299n == z1Var.f127299n) && this.f127300o.equals(z1Var.f127300o) && this.f7874x4f0c37a3.m20941xb2c87fbf(z1Var.f7874x4f0c37a3) && h().equals(z1Var.h());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f127291q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int f17 = (this.f127293e & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.k0.f(1, this.f127294f) + 0 : 0;
        if ((this.f127293e & 2) != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(2, this.f127295g);
        }
        if ((this.f127293e & 16) != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(3, this.f127298m);
        }
        if ((this.f127293e & 8) != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(5, this.f127297i);
        }
        if ((this.f127293e & 4) != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(6, this.f127296h);
        }
        if ((this.f127293e & 32) != 0) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(10, this.f127299n);
        }
        for (int i18 = 0; i18 < this.f127300o.size(); i18++) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127300o.get(i18));
        }
        int g17 = f17 + g() + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.C.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f127293e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f127294f;
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f127295g);
        }
        int i18 = this.f127293e;
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f127296h;
        }
        if ((i18 & 8) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f127297i);
        }
        if ((this.f127293e & 16) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f127298m);
        }
        if ((this.f127293e & 32) != 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f127299n);
        }
        if (this.f127300o.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f127300o.hashCode();
        }
        int m20581x10dda967 = (com.p176xb6135e39.p283xc50a8b8b.c.m20581x10dda967(hashCode, h()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.D;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.z1.class, com.p176xb6135e39.p283xc50a8b8b.w1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f127301p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f127300o.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.o3) this.f127300o.get(i17)).mo20562xf582434a()) {
                this.f127301p = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f127301p = (byte) 1;
            return true;
        }
        this.f127301p = (byte) 0;
        return false;
    }

    public boolean k() {
        return (this.f127293e & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.w1 mo20599xaaa148a0() {
        if (this == f127291q) {
            return new com.p176xb6135e39.p283xc50a8b8b.w1(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.w1 w1Var = new com.p176xb6135e39.p283xc50a8b8b.w1(null);
        w1Var.l(this);
        return w1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f127291q.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.z1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t5 i17 = i();
        if ((this.f127293e & 1) != 0) {
            k0Var.H(1, this.f127294f);
        }
        if ((this.f127293e & 2) != 0) {
            k0Var.x(2, this.f127295g);
        }
        if ((this.f127293e & 16) != 0) {
            k0Var.x(3, this.f127298m);
        }
        if ((this.f127293e & 8) != 0) {
            k0Var.x(5, this.f127297i);
        }
        if ((this.f127293e & 4) != 0) {
            k0Var.H(6, this.f127296h);
        }
        if ((this.f127293e & 32) != 0) {
            k0Var.x(10, this.f127299n);
        }
        for (int i18 = 0; i18 < this.f127300o.size(); i18++) {
            k0Var.J(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127300o.get(i18));
        }
        i17.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, k0Var);
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127291q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f127291q.mo20599xaaa148a0();
    }

    public z1() {
        this.f127301p = (byte) -1;
        this.f127294f = 0;
        this.f127296h = 0;
        this.f127300o = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.w1(r5Var, null);
    }
}
