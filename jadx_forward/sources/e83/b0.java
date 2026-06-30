package e83;

/* loaded from: classes16.dex */
public final class b0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: q, reason: collision with root package name */
    public static final e83.b0 f331634q = new e83.b0();

    /* renamed from: r, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f331635r = new e83.z();

    /* renamed from: d, reason: collision with root package name */
    public int f331636d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f331637e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f331638f;

    /* renamed from: g, reason: collision with root package name */
    public int f331639g;

    /* renamed from: h, reason: collision with root package name */
    public int f331640h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f331641i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f331642m;

    /* renamed from: n, reason: collision with root package name */
    public int f331643n;

    /* renamed from: o, reason: collision with root package name */
    public e83.j f331644o;

    /* renamed from: p, reason: collision with root package name */
    public byte f331645p;

    public b0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f331645p = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.b0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        e83.b0 b0Var = (e83.b0) obj;
        int i17 = this.f331636d;
        if (((i17 & 1) != 0) != ((b0Var.f331636d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !j().equals(b0Var.j())) {
            return false;
        }
        int i18 = this.f331636d;
        if (((i18 & 2) != 0) != ((b0Var.f331636d & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !k().equals(b0Var.k())) {
            return false;
        }
        int i19 = this.f331636d;
        boolean z17 = (i19 & 4) != 0;
        int i27 = b0Var.f331636d;
        if (z17 != ((i27 & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && this.f331639g != b0Var.f331639g) {
            return false;
        }
        if (((i19 & 8) != 0) != ((i27 & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && this.f331640h != b0Var.f331640h) {
            return false;
        }
        if (((i19 & 16) != 0) != ((i27 & 16) != 0)) {
            return false;
        }
        if (((i19 & 16) != 0) && !i().equals(b0Var.i())) {
            return false;
        }
        int i28 = this.f331636d;
        if (((i28 & 32) != 0) != ((b0Var.f331636d & 32) != 0)) {
            return false;
        }
        if (((i28 & 32) != 0) && !m127150xb5887639().equals(b0Var.m127150xb5887639())) {
            return false;
        }
        int i29 = this.f331636d;
        boolean z18 = (i29 & 64) != 0;
        int i37 = b0Var.f331636d;
        if (z18 != ((i37 & 64) != 0)) {
            return false;
        }
        if (((i29 & 64) != 0) && this.f331643n != b0Var.f331643n) {
            return false;
        }
        if (((i29 & 128) != 0) != ((i37 & 128) != 0)) {
            return false;
        }
        return (!((i29 & 128) != 0) || h().mo20583xb2c87fbf(b0Var.h())) && this.f7874x4f0c37a3.m20941xb2c87fbf(b0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f331634q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f331636d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f331637e) : 0;
        if ((this.f331636d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f331638f);
        }
        if ((this.f331636d & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.q(3, this.f331639g);
        }
        if ((this.f331636d & 8) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.q(4, this.f331640h);
        }
        if ((this.f331636d & 16) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(5, this.f331641i);
        }
        if ((this.f331636d & 32) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(6, this.f331642m);
        }
        if ((this.f331636d & 64) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.q(7, this.f331643n);
        }
        if ((this.f331636d & 128) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(8, h());
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

    /* renamed from: getUrl */
    public java.lang.String m127150xb5887639() {
        java.lang.Object obj = this.f331642m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331642m = r17;
        }
        return r17;
    }

    public e83.j h() {
        e83.j jVar = this.f331644o;
        return jVar == null ? e83.j.f331684f : jVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f331740m.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f331636d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + j().hashCode();
        }
        if ((this.f331636d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + k().hashCode();
        }
        int i18 = this.f331636d;
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f331639g;
        }
        if ((i18 & 8) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f331640h;
        }
        if ((i18 & 16) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + i().hashCode();
        }
        if ((this.f331636d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + m127150xb5887639().hashCode();
        }
        int i19 = this.f331636d;
        if ((i19 & 64) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f331643n;
        }
        if ((i19 & 128) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + h().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f331641i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331641i = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331741n;
        j6Var.c(e83.b0.class, e83.a0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f331645p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f331645p = (byte) 1;
        return true;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f331637e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331637e = r17;
        }
        return r17;
    }

    public java.lang.String k() {
        java.lang.Object obj = this.f331638f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331638f = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public e83.a0 mo20599xaaa148a0() {
        if (this == f331634q) {
            return new e83.a0(null);
        }
        e83.a0 a0Var = new e83.a0(null);
        a0Var.e(this);
        return a0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f331634q.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new e83.b0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f331636d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f331637e);
        }
        if ((this.f331636d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f331638f);
        }
        if ((this.f331636d & 4) != 0) {
            k0Var.R(3, this.f331639g);
        }
        if ((this.f331636d & 8) != 0) {
            k0Var.R(4, this.f331640h);
        }
        if ((this.f331636d & 16) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 5, this.f331641i);
        }
        if ((this.f331636d & 32) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 6, this.f331642m);
        }
        if ((this.f331636d & 64) != 0) {
            k0Var.R(7, this.f331643n);
        }
        if ((this.f331636d & 128) != 0) {
            k0Var.J(8, h());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f331634q;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f331634q.mo20599xaaa148a0();
    }

    public b0() {
        this.f331645p = (byte) -1;
        this.f331637e = "";
        this.f331638f = "";
        this.f331641i = "";
        this.f331642m = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new e83.a0(r5Var, null);
    }

    public b0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            this.f331636d = 1 | this.f331636d;
                            this.f331637e = m17;
                        } else if (F == 18) {
                            com.p176xb6135e39.p283xc50a8b8b.y m18 = d0Var.m();
                            this.f331636d |= 2;
                            this.f331638f = m18;
                        } else if (F == 24) {
                            this.f331636d |= 4;
                            this.f331639g = d0Var.G();
                        } else if (F == 32) {
                            this.f331636d |= 8;
                            this.f331640h = d0Var.G();
                        } else if (F == 42) {
                            com.p176xb6135e39.p283xc50a8b8b.y m19 = d0Var.m();
                            this.f331636d |= 16;
                            this.f331641i = m19;
                        } else if (F == 50) {
                            com.p176xb6135e39.p283xc50a8b8b.y m27 = d0Var.m();
                            this.f331636d |= 32;
                            this.f331642m = m27;
                        } else if (F == 56) {
                            this.f331636d |= 64;
                            this.f331643n = d0Var.G();
                        } else if (F != 66) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            e83.i mo20599xaaa148a0 = (this.f331636d & 128) != 0 ? this.f331644o.mo20599xaaa148a0() : null;
                            e83.j jVar = (e83.j) d0Var.v(e83.j.f331685g, t4Var);
                            this.f331644o = jVar;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.f(jVar);
                                this.f331644o = mo20599xaaa148a0.mo20557x85702333();
                            }
                            this.f331636d |= 128;
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
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
