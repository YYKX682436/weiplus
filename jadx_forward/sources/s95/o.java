package s95;

/* loaded from: classes16.dex */
public final class o extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: g */
    public static final s95.o f486687g = new s95.o();

    /* renamed from: h */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486688h = new s95.m();

    /* renamed from: d */
    public s95.y f486689d;

    /* renamed from: e */
    public s95.y f486690e;

    /* renamed from: f */
    public byte f486691f;

    public o(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.m mVar) {
        super(q5Var);
        this.f486691f = (byte) -1;
    }

    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa f(s95.o oVar) {
        return oVar.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.o)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.o oVar = (s95.o) obj;
        s95.y yVar = this.f486689d;
        if ((yVar != null) != (oVar.f486689d != null)) {
            return false;
        }
        if ((yVar != null) && !g().mo20583xb2c87fbf(oVar.g())) {
            return false;
        }
        s95.y yVar2 = this.f486690e;
        if ((yVar2 != null) != (oVar.f486690e != null)) {
            return false;
        }
        return (!(yVar2 != null) || h().mo20583xb2c87fbf(oVar.h())) && this.f7874x4f0c37a3.m20941xb2c87fbf(oVar.f7874x4f0c37a3);
    }

    public s95.y g() {
        s95.y yVar = this.f486689d;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486687g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int n17 = this.f486689d != null ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.n(1, g()) : 0;
        if (this.f486690e != null) {
            n17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, h());
        }
        int mo20593x9d9c349b = n17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public s95.y h() {
        s95.y yVar = this.f486690e;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = s95.r0.f486711c.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (this.f486689d != null) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().mo20587x8cdac1b();
        }
        if (this.f486690e != null) {
            hashCode = (((hashCode * 37) + 2) * 53) + h().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i */
    public s95.n mo20599xaaa148a0() {
        if (this == f486687g) {
            return new s95.n(null);
        }
        s95.n nVar = new s95.n(null);
        nVar.f(this);
        return nVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486712d;
        j6Var.c(s95.o.class, s95.n.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486691f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486691f = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486687g.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.o();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f486689d != null) {
            k0Var.J(1, g());
        }
        if (this.f486690e != null) {
            k0Var.J(2, h());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486687g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486687g.mo20599xaaa148a0();
    }

    public o() {
        this.f486691f = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.n(r5Var, null);
    }

    public o(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.m mVar) {
        this();
        s95.x mo20599xaaa148a0;
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                s95.y yVar = this.f486689d;
                                mo20599xaaa148a0 = yVar != null ? yVar.mo20599xaaa148a0() : null;
                                s95.y yVar2 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                                this.f486689d = yVar2;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(yVar2);
                                    this.f486689d = mo20599xaaa148a0.mo20557x85702333();
                                }
                            } else if (F != 18) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                s95.y yVar3 = this.f486690e;
                                mo20599xaaa148a0 = yVar3 != null ? yVar3.mo20599xaaa148a0() : null;
                                s95.y yVar4 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                                this.f486690e = yVar4;
                                if (mo20599xaaa148a0 != null) {
                                    mo20599xaaa148a0.e(yVar4);
                                    this.f486690e = mo20599xaaa148a0.mo20557x85702333();
                                }
                            }
                        }
                        z17 = true;
                    } catch (java.io.IOException e17) {
                        com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e17);
                        y6Var.f127272d = this;
                        throw y6Var;
                    }
                } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e18) {
                    e18.f127272d = this;
                    throw e18;
                }
            } finally {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
