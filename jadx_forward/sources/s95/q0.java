package s95;

/* loaded from: classes16.dex */
public final class q0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final s95.q0 f486700h = new s95.q0();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486701i = new s95.o0();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f486702d;

    /* renamed from: e, reason: collision with root package name */
    public long f486703e;

    /* renamed from: f, reason: collision with root package name */
    public long f486704f;

    /* renamed from: g, reason: collision with root package name */
    public byte f486705g;

    public q0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.o0 o0Var) {
        super(q5Var);
        this.f486705g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.q0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.q0 q0Var = (s95.q0) obj;
        return g().equals(q0Var.g()) && this.f486703e == q0Var.f486703e && this.f486704f == q0Var.f486704f && this.f7874x4f0c37a3.m20941xb2c87fbf(q0Var.f7874x4f0c37a3);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f486702d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f486702d = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486700h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f486702d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486702d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        int m20743x690e0f49 = yVar.m20957x7aab3243() ? 0 : 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f486702d);
        long j17 = this.f486703e;
        if (j17 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.m(2, j17);
        }
        long j18 = this.f486704f;
        if (j18 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.m(3, j18);
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
    public s95.p0 mo20599xaaa148a0() {
        if (this == f486700h) {
            return new s95.p0(null);
        }
        s95.p0 p0Var = new s95.p0(null);
        p0Var.e(this);
        return p0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486713e.hashCode()) * 37) + 1) * 53) + g().hashCode()) * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486703e)) * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486704f)) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486714f;
        j6Var.c(s95.q0.class, s95.p0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486705g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486705g = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486700h.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.q0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        java.lang.Object obj = this.f486702d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486702d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f486702d);
        }
        long j17 = this.f486703e;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        long j18 = this.f486704f;
        if (j18 != 0) {
            k0Var.T(3, j18);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486700h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486700h.mo20599xaaa148a0();
    }

    public q0() {
        this.f486705g = (byte) -1;
        this.f486702d = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.p0(r5Var, null);
    }

    public q0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.o0 o0Var) {
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
                            this.f486702d = d0Var.E();
                        } else if (F == 16) {
                            this.f486703e = d0Var.u();
                        } else if (F != 24) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f486704f = d0Var.u();
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
