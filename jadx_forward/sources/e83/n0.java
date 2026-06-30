package e83;

/* loaded from: classes16.dex */
public final class n0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final e83.n0 f331717m = new e83.n0();

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f331718n = new e83.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f331719d;

    /* renamed from: e, reason: collision with root package name */
    public long f331720e;

    /* renamed from: f, reason: collision with root package name */
    public double f331721f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f331722g;

    /* renamed from: h, reason: collision with root package name */
    public long f331723h;

    /* renamed from: i, reason: collision with root package name */
    public byte f331724i;

    public n0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f331724i = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.n0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        e83.n0 n0Var = (e83.n0) obj;
        int i17 = this.f331719d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = n0Var.f331719d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f331720e != n0Var.f331720e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if (((i17 & 2) != 0) && java.lang.Double.doubleToLongBits(this.f331721f) != java.lang.Double.doubleToLongBits(n0Var.f331721f)) {
            return false;
        }
        int i19 = this.f331719d;
        if (((i19 & 4) != 0) != ((n0Var.f331719d & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && !m127169x7f48eaaa().equals(n0Var.m127169x7f48eaaa())) {
            return false;
        }
        int i27 = this.f331719d;
        if (((i27 & 8) != 0) != ((n0Var.f331719d & 8) != 0)) {
            return false;
        }
        return (!((i27 & 8) != 0) || this.f331723h == n0Var.f331723h) && this.f7874x4f0c37a3.m20941xb2c87fbf(n0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e83.m0 mo20599xaaa148a0() {
        if (this == f331717m) {
            return new e83.m0(null);
        }
        e83.m0 m0Var = new e83.m0(null);
        m0Var.f(this);
        return m0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f331717m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m17 = (this.f331719d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.m(1, this.f331720e) : 0;
        if ((this.f331719d & 2) != 0) {
            m17 += com.p176xb6135e39.p283xc50a8b8b.k0.e(2, this.f331721f);
        }
        if ((this.f331719d & 4) != 0) {
            m17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f331722g);
        }
        if ((this.f331719d & 8) != 0) {
            m17 += com.p176xb6135e39.p283xc50a8b8b.k0.s(5, this.f331723h);
        }
        int mo20593x9d9c349b = m17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getStringValue */
    public java.lang.String m127169x7f48eaaa() {
        java.lang.Object obj = this.f331722g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f331722g = r17;
        }
        return r17;
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
        int hashCode = e83.o0.f331732e.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f331719d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f331720e);
        }
        if ((this.f331719d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f331721f));
        }
        if ((this.f331719d & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + m127169x7f48eaaa().hashCode();
        }
        if ((this.f331719d & 8) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f331723h);
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = e83.o0.f331733f;
        j6Var.c(e83.n0.class, e83.m0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f331724i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f331724i = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f331717m.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new e83.n0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f331719d & 1) != 0) {
            k0Var.T(1, this.f331720e);
        }
        if ((this.f331719d & 2) != 0) {
            k0Var.B(2, this.f331721f);
        }
        if ((this.f331719d & 4) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f331722g);
        }
        if ((this.f331719d & 8) != 0) {
            k0Var.T(5, this.f331723h);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f331717m;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f331717m.mo20599xaaa148a0();
    }

    public n0() {
        this.f331724i = (byte) -1;
        this.f331722g = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new e83.m0(r5Var, null);
    }

    public n0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f331719d |= 1;
                            this.f331720e = d0Var.u();
                        } else if (F == 17) {
                            this.f331719d |= 2;
                            this.f331721f = d0Var.n();
                        } else if (F == 26) {
                            com.p176xb6135e39.p283xc50a8b8b.y m17 = d0Var.m();
                            this.f331719d |= 4;
                            this.f331722g = m17;
                        } else if (F != 40) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f331719d |= 8;
                            this.f331723h = d0Var.H();
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
