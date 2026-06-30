package e83;

/* loaded from: classes16.dex */
public final class e0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: f, reason: collision with root package name */
    public static final e83.e0 f331657f = new e83.e0();

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f331658g = new e83.c0();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f331659d;

    /* renamed from: e, reason: collision with root package name */
    public byte f331660e;

    public e0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f331660e = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.e0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        e83.e0 e0Var = (e83.e0) obj;
        return this.f331659d.equals(e0Var.f331659d) && this.f7874x4f0c37a3.m20941xb2c87fbf(e0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f331657f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f331659d.size(); i19++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(1, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f331659d.get(i19));
        }
        int mo20593x9d9c349b = i18 + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int hashCode = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + e83.o0.f331742o.hashCode();
        if (this.f331659d.size() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f331659d.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e83.d0 mo20599xaaa148a0() {
        if (this == f331657f) {
            return new e83.d0(null);
        }
        e83.d0 d0Var = new e83.d0(null);
        d0Var.f(this);
        return d0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331743p;
        j6Var.c(e83.e0.class, e83.d0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f331660e;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f331660e = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f331657f.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new e83.e0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (int i17 = 0; i17 < this.f331659d.size(); i17++) {
            k0Var.J(1, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f331659d.get(i17));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f331657f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f331657f.mo20599xaaa148a0();
    }

    public e0() {
        this.f331660e = (byte) -1;
        this.f331659d = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new e83.d0(r5Var, null);
    }

    public e0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if (!(z18 & true)) {
                                this.f331659d = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f331659d.add((e83.b0) d0Var.v(e83.b0.f331635r, t4Var));
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
                if (z18 & true) {
                    this.f331659d = java.util.Collections.unmodifiableList(this.f331659d);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
