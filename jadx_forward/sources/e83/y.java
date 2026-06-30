package e83;

/* loaded from: classes16.dex */
public final class y extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final e83.y f331783h = new e83.y();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f331784i = new e83.w();

    /* renamed from: d, reason: collision with root package name */
    public int f331785d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f331786e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f331787f;

    /* renamed from: g, reason: collision with root package name */
    public byte f331788g;

    public y(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f331788g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.y)) {
            return super.mo20583xb2c87fbf(obj);
        }
        e83.y yVar = (e83.y) obj;
        int i17 = this.f331785d;
        if (((i17 & 1) != 0) != ((yVar.f331785d & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || i().equals(yVar.i())) && this.f331787f.equals(yVar.f331787f) && this.f7874x4f0c37a3.m20941xb2c87fbf(yVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f331783h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f331785d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f331786e) + 0 : 0;
        for (int i18 = 0; i18 < this.f331787f.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f331787f.get(i18));
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
        int hashCode = e83.o0.f331752y.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f331785d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if (this.f331787f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f331787f.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f331786e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331786e = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331753z;
        j6Var.c(e83.y.class, e83.x.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f331788g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f331788g = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e83.x mo20599xaaa148a0() {
        if (this == f331783h) {
            return new e83.x(null);
        }
        e83.x xVar = new e83.x(null);
        xVar.f(this);
        return xVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f331783h.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new e83.y();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f331785d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f331786e);
        }
        for (int i17 = 0; i17 < this.f331787f.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f331787f.get(i17));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f331783h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f331783h.mo20599xaaa148a0();
    }

    public y() {
        this.f331788g = (byte) -1;
        this.f331786e = "";
        this.f331787f = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new e83.x(r5Var, null);
    }

    public y(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, e83.a aVar) {
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
                            this.f331785d = 1 | this.f331785d;
                            this.f331786e = m17;
                        } else if (F != 18) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if ((i17 & 2) == 0) {
                                this.f331787f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f331787f.add((e83.h0) d0Var.v(e83.h0.f331676i, t4Var));
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
                    this.f331787f = java.util.Collections.unmodifiableList(this.f331787f);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
