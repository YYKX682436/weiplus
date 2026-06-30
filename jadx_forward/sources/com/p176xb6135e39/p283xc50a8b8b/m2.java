package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class m2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.m2 f126847o = new com.p176xb6135e39.p283xc50a8b8b.m2();

    /* renamed from: p, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126848p = new com.p176xb6135e39.p283xc50a8b8b.k2();

    /* renamed from: d, reason: collision with root package name */
    public int f126849d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f126850e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f126851f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f126852g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.q2 f126853h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126854i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126855m;

    /* renamed from: n, reason: collision with root package name */
    public byte f126856n;

    public m2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126856n = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.m2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.m2 m2Var = (com.p176xb6135e39.p283xc50a8b8b.m2) obj;
        int i17 = this.f126849d;
        if (((i17 & 1) != 0) != ((m2Var.f126849d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !m20789xfb82e301().equals(m2Var.m20789xfb82e301())) {
            return false;
        }
        int i18 = this.f126849d;
        if (((i18 & 2) != 0) != ((m2Var.f126849d & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !f().equals(m2Var.f())) {
            return false;
        }
        int i19 = this.f126849d;
        if (((i19 & 4) != 0) != ((m2Var.f126849d & 4) != 0)) {
            return false;
        }
        if ((((i19 & 4) != 0) && !h().equals(m2Var.h())) || i() != m2Var.i()) {
            return false;
        }
        if (i() && !g().mo20583xb2c87fbf(m2Var.g())) {
            return false;
        }
        int i27 = this.f126849d;
        boolean z17 = (i27 & 16) != 0;
        int i28 = m2Var.f126849d;
        if (z17 != ((i28 & 16) != 0)) {
            return false;
        }
        if (((i27 & 16) != 0) && this.f126854i != m2Var.f126854i) {
            return false;
        }
        if (((i27 & 32) != 0) != ((i28 & 32) != 0)) {
            return false;
        }
        return (!((i27 & 32) != 0) || this.f126855m == m2Var.f126855m) && this.f7874x4f0c37a3.m20941xb2c87fbf(m2Var.f7874x4f0c37a3);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f126851f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126851f = r17;
        }
        return r17;
    }

    public com.p176xb6135e39.p283xc50a8b8b.q2 g() {
        com.p176xb6135e39.p283xc50a8b8b.q2 q2Var = this.f126853h;
        return q2Var == null ? com.p176xb6135e39.p283xc50a8b8b.q2.f126972m : q2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126847o;
    }

    /* renamed from: getName */
    public java.lang.String m20789xfb82e301() {
        java.lang.Object obj = this.f126850e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126850e = r17;
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
        int m20743x690e0f49 = (this.f126849d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f126850e) : 0;
        if ((this.f126849d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f126851f);
        }
        if ((this.f126849d & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f126852g);
        }
        if ((this.f126849d & 8) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, g());
        }
        if ((this.f126849d & 16) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(5, this.f126854i);
        }
        if ((this.f126849d & 32) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(6, this.f126855m);
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

    public java.lang.String h() {
        java.lang.Object obj = this.f126852g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126852g = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126937w.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126849d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20789xfb82e301().hashCode();
        }
        if ((this.f126849d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        if ((this.f126849d & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (i()) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().mo20587x8cdac1b();
        }
        if ((this.f126849d & 16) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126854i);
        }
        if ((this.f126849d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126855m);
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public boolean i() {
        return (this.f126849d & 8) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126938x;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.m2.class, com.p176xb6135e39.p283xc50a8b8b.l2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126856n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!i() || g().mo20562xf582434a()) {
            this.f126856n = (byte) 1;
            return true;
        }
        this.f126856n = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.l2 mo20599xaaa148a0() {
        if (this == f126847o) {
            return new com.p176xb6135e39.p283xc50a8b8b.l2(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.l2 l2Var = new com.p176xb6135e39.p283xc50a8b8b.l2(null);
        l2Var.e(this);
        return l2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126847o.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.m2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f126849d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f126850e);
        }
        if ((this.f126849d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f126851f);
        }
        if ((this.f126849d & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f126852g);
        }
        if ((this.f126849d & 8) != 0) {
            k0Var.J(4, g());
        }
        if ((this.f126849d & 16) != 0) {
            k0Var.x(5, this.f126854i);
        }
        if ((this.f126849d & 32) != 0) {
            k0Var.x(6, this.f126855m);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126847o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126847o.mo20599xaaa148a0();
    }

    public m2() {
        this.f126856n = (byte) -1;
        this.f126850e = "";
        this.f126851f = "";
        this.f126852g = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.l2(r5Var, null);
    }
}
