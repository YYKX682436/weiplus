package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class m extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: o */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m f149537o = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m();

    /* renamed from: p */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f149538p = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.k();

    /* renamed from: d */
    public int f149539d;

    /* renamed from: e */
    public int f149540e;

    /* renamed from: f */
    public volatile java.lang.Object f149541f;

    /* renamed from: g */
    public volatile java.lang.Object f149542g;

    /* renamed from: h */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 f149543h;

    /* renamed from: i */
    public boolean f149544i;

    /* renamed from: m */
    public volatile java.lang.Object f149545m;

    /* renamed from: n */
    public byte f149546n;

    public m(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(q5Var);
        this.f149546n = (byte) -1;
    }

    public static /* synthetic */ boolean f() {
        return com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
    }

    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa g(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mVar) {
        return mVar.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m mVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m) obj;
        if (m() != mVar.m()) {
            return false;
        }
        if ((m() && this.f149540e != mVar.f149540e) || m45568x29c7639a() != mVar.m45568x29c7639a()) {
            return false;
        }
        if ((m45568x29c7639a() && !m45567x45e62656().equals(mVar.m45567x45e62656())) || k() != mVar.k()) {
            return false;
        }
        if ((k() && !h().equals(mVar.h())) || m45569xd7e755e3() != mVar.m45569xd7e755e3()) {
            return false;
        }
        if ((m45569xd7e755e3() && !i().mo20583xb2c87fbf(mVar.i())) || l() != mVar.l()) {
            return false;
        }
        if (l() && this.f149544i != mVar.f149544i) {
            return false;
        }
        int i17 = this.f149539d;
        if (((i17 & 32) != 0) != ((mVar.f149539d & 32) != 0)) {
            return false;
        }
        return (!((i17 & 32) != 0) || j().equals(mVar.j())) && this.f7874x4f0c37a3.m20941xb2c87fbf(mVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f149537o;
    }

    /* renamed from: getFrameSetName */
    public java.lang.String m45567x45e62656() {
        java.lang.Object obj = this.f149541f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f149541f = r17;
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
        int k17 = (this.f149539d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.k(1, this.f149540e) : 0;
        if ((this.f149539d & 2) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f149541f);
        }
        if ((this.f149539d & 4) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f149542g);
        }
        if ((this.f149539d & 8) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, i());
        }
        if ((this.f149539d & 16) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(5, this.f149544i);
        }
        if ((this.f149539d & 32) != 0) {
            k17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(6, this.f149545m);
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

    public java.lang.String h() {
        java.lang.Object obj = this.f149542g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f149542g = r17;
        }
        return r17;
    }

    /* renamed from: hasFrameSetName */
    public boolean m45568x29c7639a() {
        return (this.f149539d & 2) != 0;
    }

    /* renamed from: hasPosition */
    public boolean m45569xd7e755e3() {
        return (this.f149539d & 8) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149564c.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (m()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f149540e;
        }
        if (m45568x29c7639a()) {
            hashCode = (((hashCode * 37) + 2) * 53) + m45567x45e62656().hashCode();
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (m45569xd7e755e3()) {
            hashCode = (((hashCode * 37) + 4) * 53) + i().mo20587x8cdac1b();
        }
        if (l()) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f149544i);
        }
        if ((this.f149539d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + j().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 i() {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = this.f149543h;
        return n0Var == null ? com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149552m : n0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149565d;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f149546n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!m()) {
            this.f149546n = (byte) 0;
            return false;
        }
        if (!m45568x29c7639a()) {
            this.f149546n = (byte) 0;
            return false;
        }
        if (!k()) {
            this.f149546n = (byte) 0;
            return false;
        }
        if (!m45569xd7e755e3()) {
            this.f149546n = (byte) 0;
            return false;
        }
        if (!l()) {
            this.f149546n = (byte) 0;
            return false;
        }
        if (i().mo20562xf582434a()) {
            this.f149546n = (byte) 1;
            return true;
        }
        this.f149546n = (byte) 0;
        return false;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f149545m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f149545m = r17;
        }
        return r17;
    }

    public boolean k() {
        return (this.f149539d & 4) != 0;
    }

    public boolean l() {
        return (this.f149539d & 16) != 0;
    }

    public boolean m() {
        return (this.f149539d & 1) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: n */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l mo20599xaaa148a0() {
        if (this == f149537o) {
            return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l(null);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l lVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l(null);
        lVar.g(this);
        return lVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f149537o.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f149539d & 1) != 0) {
            k0Var.H(1, this.f149540e);
        }
        if ((this.f149539d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f149541f);
        }
        if ((this.f149539d & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f149542g);
        }
        if ((this.f149539d & 8) != 0) {
            k0Var.J(4, i());
        }
        if ((this.f149539d & 16) != 0) {
            k0Var.x(5, this.f149544i);
        }
        if ((this.f149539d & 32) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 6, this.f149545m);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f149537o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f149537o.mo20599xaaa148a0();
    }

    public m() {
        this.f149546n = (byte) -1;
        this.f149541f = "";
        this.f149542g = "";
        this.f149545m = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.l(r5Var, null);
    }

    public m(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
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
                            if (F == 8) {
                                this.f149539d |= 1;
                                this.f149540e = d0Var.t();
                            } else if (F == 18) {
                                com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                                this.f149539d |= 2;
                                this.f149541f = m17;
                            } else if (F == 26) {
                                com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                                this.f149539d |= 4;
                                this.f149542g = m18;
                            } else if (F == 34) {
                                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.m0 mo20599xaaa148a0 = (this.f149539d & 8) != 0 ? this.f149543h.mo20599xaaa148a0() : null;
                                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0 n0Var = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0) d0Var.v(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.n0.f149553n, t4Var);
                                this.f149543h = n0Var;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.f(n0Var);
                                    this.f149543h = mo20599xaaa148a0.mo20557x85702333();
                                }
                                this.f149539d |= 8;
                            } else if (F == 40) {
                                this.f149539d |= 16;
                                this.f149544i = d0Var.l();
                            } else if (F != 50) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                com.p176xb6135e39.p283xc50a8b8b.y m19 = d0Var.m();
                                this.f149539d |= 32;
                                this.f149545m = m19;
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
