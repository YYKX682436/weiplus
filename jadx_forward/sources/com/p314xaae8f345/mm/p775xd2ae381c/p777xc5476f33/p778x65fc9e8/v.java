package com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8;

/* loaded from: classes16.dex */
public final class v extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v f149627h = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f149628i = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.t();

    /* renamed from: d, reason: collision with root package name */
    public int f149629d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f149630e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f149631f;

    /* renamed from: g, reason: collision with root package name */
    public byte f149632g;

    public v(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        super(q5Var);
        this.f149632g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v vVar = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v) obj;
        if (j() != vVar.j()) {
            return false;
        }
        return (!j() || i().equals(vVar.i())) && this.f149631f.equals(vVar.f149631f) && this.f7874x4f0c37a3.m20941xb2c87fbf(vVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f149627h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f149629d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f149630e) + 0 : 0;
        for (int i18 = 0; i18 < this.f149631f.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f149631f.get(i18));
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149582u.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (j()) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if (this.f149631f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f149631f.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f149630e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f149630e = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.o0.f149583v;
        j6Var.c(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v.class, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f149632g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!j()) {
            this.f149632g = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f149631f.size(); i17++) {
            if (!((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) this.f149631f.get(i17)).mo20562xf582434a()) {
                this.f149632g = (byte) 0;
                return false;
            }
        }
        this.f149632g = (byte) 1;
        return true;
    }

    public boolean j() {
        return (this.f149629d & 1) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u mo20599xaaa148a0() {
        if (this == f149627h) {
            return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u(null);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u uVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u(null);
        uVar.f(this);
        return uVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f149627h.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.v();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f149629d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f149630e);
        }
        for (int i17 = 0; i17 < this.f149631f.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f149631f.get(i17));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f149627h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f149627h.mo20599xaaa148a0();
    }

    public v() {
        this.f149632g = (byte) -1;
        this.f149630e = "";
        this.f149631f = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.u(r5Var, null);
    }

    public v(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g gVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            this.f149629d = 1 | this.f149629d;
                            this.f149630e = m17;
                        } else if (F != 18) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if ((i17 & 2) == 0) {
                                this.f149631f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f149631f.add((com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0) d0Var.v(com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.b0.f149475i, t4Var));
                        }
                    }
                    z17 = true;
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                    e17.f127272d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = this;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    this.f149631f = java.util.Collections.unmodifiableList(this.f149631f);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
