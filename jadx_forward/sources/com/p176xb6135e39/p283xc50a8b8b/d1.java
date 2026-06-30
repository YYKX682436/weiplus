package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class d1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.d1 f126528n = new com.p176xb6135e39.p283xc50a8b8b.d1();

    /* renamed from: o, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126529o = new com.p176xb6135e39.p283xc50a8b8b.y0();

    /* renamed from: d, reason: collision with root package name */
    public int f126530d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f126531e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f126532f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g1 f126533g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f126534h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126535i;

    /* renamed from: m, reason: collision with root package name */
    public byte f126536m;

    public d1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126536m = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.d1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.d1 d1Var = (com.p176xb6135e39.p283xc50a8b8b.d1) obj;
        int i17 = this.f126530d;
        if (((i17 & 1) != 0) != ((d1Var.f126530d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || m20614xfb82e301().equals(d1Var.m20614xfb82e301())) && this.f126532f.equals(d1Var.f126532f) && g() == d1Var.g()) {
            return (!g() || f().mo20583xb2c87fbf(d1Var.f())) && this.f126534h.equals(d1Var.f126534h) && this.f126535i.equals(d1Var.f126535i) && this.f7874x4f0c37a3.m20941xb2c87fbf(d1Var.f7874x4f0c37a3);
        }
        return false;
    }

    public com.p176xb6135e39.p283xc50a8b8b.g1 f() {
        com.p176xb6135e39.p283xc50a8b8b.g1 g1Var = this.f126533g;
        return g1Var == null ? com.p176xb6135e39.p283xc50a8b8b.g1.f126628m : g1Var;
    }

    public boolean g() {
        return (this.f126530d & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126528n;
    }

    /* renamed from: getName */
    public java.lang.String m20614xfb82e301() {
        java.lang.Object obj = this.f126531e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126531e = r17;
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
        int m20743x690e0f49 = (this.f126530d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f126531e) + 0 : 0;
        for (int i18 = 0; i18 < this.f126532f.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126532f.get(i18));
        }
        if ((this.f126530d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, f());
        }
        for (int i19 = 0; i19 < this.f126534h.size(); i19++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126534h.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f126535i.size(); i28++) {
            i27 += com.p176xb6135e39.p283xc50a8b8b.l6.m20744x2973fc50(this.f126535i.J(i28));
        }
        int size = m20743x690e0f49 + i27 + (this.f126535i.size() * 1) + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = size;
        return size;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.z0 mo20599xaaa148a0() {
        if (this == f126528n) {
            return new com.p176xb6135e39.p283xc50a8b8b.z0(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.z0 z0Var = new com.p176xb6135e39.p283xc50a8b8b.z0(null);
        z0Var.g(this);
        return z0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126929o.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126530d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20614xfb82e301().hashCode();
        }
        if (this.f126532f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f126532f.hashCode();
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().mo20587x8cdac1b();
        }
        if (this.f126534h.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f126534h.hashCode();
        }
        if (this.f126535i.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f126535i.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126930p;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.d1.class, com.p176xb6135e39.p283xc50a8b8b.z0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126536m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126532f.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.j1) this.f126532f.get(i17)).mo20562xf582434a()) {
                this.f126536m = (byte) 0;
                return false;
            }
        }
        if (!g() || f().mo20562xf582434a()) {
            this.f126536m = (byte) 1;
            return true;
        }
        this.f126536m = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126528n.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.d1();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f126530d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f126531e);
        }
        for (int i17 = 0; i17 < this.f126532f.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126532f.get(i17));
        }
        if ((this.f126530d & 2) != 0) {
            k0Var.J(3, f());
        }
        for (int i18 = 0; i18 < this.f126534h.size(); i18++) {
            k0Var.J(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126534h.get(i18));
        }
        for (int i19 = 0; i19 < this.f126535i.size(); i19++) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 5, this.f126535i.J(i19));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126528n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126528n.mo20599xaaa148a0();
    }

    public d1() {
        this.f126536m = (byte) -1;
        this.f126531e = "";
        this.f126532f = java.util.Collections.emptyList();
        this.f126534h = java.util.Collections.emptyList();
        this.f126535i = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.z0(r5Var, null);
    }
}
