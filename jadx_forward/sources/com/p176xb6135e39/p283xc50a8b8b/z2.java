package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class z2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.z2 f127302i = new com.p176xb6135e39.p283xc50a8b8b.z2();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f127303m = new com.p176xb6135e39.p283xc50a8b8b.x2();

    /* renamed from: d, reason: collision with root package name */
    public int f127304d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f127305e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f127306f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.c3 f127307g;

    /* renamed from: h, reason: collision with root package name */
    public byte f127308h;

    public z2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f127308h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.z2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.z2 z2Var = (com.p176xb6135e39.p283xc50a8b8b.z2) obj;
        int i17 = this.f127304d;
        if (((i17 & 1) != 0) != ((z2Var.f127304d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || m20971xfb82e301().equals(z2Var.m20971xfb82e301())) && this.f127306f.equals(z2Var.f127306f) && g() == z2Var.g()) {
            return (!g() || f().mo20583xb2c87fbf(z2Var.f())) && this.f7874x4f0c37a3.m20941xb2c87fbf(z2Var.f7874x4f0c37a3);
        }
        return false;
    }

    public com.p176xb6135e39.p283xc50a8b8b.c3 f() {
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var = this.f127307g;
        return c3Var == null ? com.p176xb6135e39.p283xc50a8b8b.c3.f126500i : c3Var;
    }

    public boolean g() {
        return (this.f127304d & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f127302i;
    }

    /* renamed from: getName */
    public java.lang.String m20971xfb82e301() {
        java.lang.Object obj = this.f127305e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127305e = r17;
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
        int m20743x690e0f49 = (this.f127304d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f127305e) + 0 : 0;
        for (int i18 = 0; i18 < this.f127306f.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127306f.get(i18));
        }
        if ((this.f127304d & 2) != 0) {
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
    public com.p176xb6135e39.p283xc50a8b8b.y2 mo20599xaaa148a0() {
        if (this == f127302i) {
            return new com.p176xb6135e39.p283xc50a8b8b.y2(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.y2 y2Var = new com.p176xb6135e39.p283xc50a8b8b.y2(null);
        y2Var.f(this);
        return y2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126935u.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f127304d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20971xfb82e301().hashCode();
        }
        if (this.f127306f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f127306f.hashCode();
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
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126936v;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.z2.class, com.p176xb6135e39.p283xc50a8b8b.y2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f127308h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f127306f.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.m2) this.f127306f.get(i17)).mo20562xf582434a()) {
                this.f127308h = (byte) 0;
                return false;
            }
        }
        if (!g() || f().mo20562xf582434a()) {
            this.f127308h = (byte) 1;
            return true;
        }
        this.f127308h = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f127302i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.z2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f127304d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f127305e);
        }
        for (int i17 = 0; i17 < this.f127306f.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127306f.get(i17));
        }
        if ((this.f127304d & 2) != 0) {
            k0Var.J(3, f());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127302i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f127302i.mo20599xaaa148a0();
    }

    public z2() {
        this.f127308h = (byte) -1;
        this.f127305e = "";
        this.f127306f = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.y2(r5Var, null);
    }
}
