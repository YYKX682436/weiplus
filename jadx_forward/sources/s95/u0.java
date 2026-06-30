package s95;

/* loaded from: classes16.dex */
public final class u0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final s95.u0 f486756i = new s95.u0();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486757m = new s95.s0();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f486758d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f486759e;

    /* renamed from: f, reason: collision with root package name */
    public long f486760f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f486761g;

    /* renamed from: h, reason: collision with root package name */
    public byte f486762h;

    public u0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.s0 s0Var) {
        super(q5Var);
        this.f486762h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.u0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.u0 u0Var = (s95.u0) obj;
        return h().equals(u0Var.h()) && g().equals(u0Var.g()) && this.f486760f == u0Var.f486760f && this.f486761g == u0Var.f486761g && this.f7874x4f0c37a3.m20941xb2c87fbf(u0Var.f7874x4f0c37a3);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f486759e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f486759e = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486756i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        com.p176xb6135e39.p283xc50a8b8b.y yVar2;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f486758d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486758d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        int m20743x690e0f49 = yVar.m20957x7aab3243() ? 0 : 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f486758d);
        java.lang.Object obj2 = this.f486759e;
        if (obj2 instanceof java.lang.String) {
            yVar2 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj2);
            this.f486759e = yVar2;
        } else {
            yVar2 = (com.p176xb6135e39.p283xc50a8b8b.y) obj2;
        }
        if (!yVar2.m20957x7aab3243()) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f486759e);
        }
        long j17 = this.f486760f;
        if (j17 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.m(3, j17);
        }
        boolean z17 = this.f486761g;
        if (z17) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(4, z17);
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
        java.lang.Object obj = this.f486758d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f486758d = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486727s.hashCode()) * 37) + 1) * 53) + h().hashCode()) * 37) + 2) * 53) + g().hashCode()) * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486760f)) * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486761g)) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s95.t0 mo20599xaaa148a0() {
        if (this == f486756i) {
            return new s95.t0(null);
        }
        s95.t0 t0Var = new s95.t0(null);
        t0Var.e(this);
        return t0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486728t;
        j6Var.c(s95.u0.class, s95.t0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486762h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486762h = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486756i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.u0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        com.p176xb6135e39.p283xc50a8b8b.y yVar2;
        java.lang.Object obj = this.f486758d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486758d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f486758d);
        }
        java.lang.Object obj2 = this.f486759e;
        if (obj2 instanceof java.lang.String) {
            yVar2 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj2);
            this.f486759e = yVar2;
        } else {
            yVar2 = (com.p176xb6135e39.p283xc50a8b8b.y) obj2;
        }
        if (!yVar2.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f486759e);
        }
        long j17 = this.f486760f;
        if (j17 != 0) {
            k0Var.T(3, j17);
        }
        boolean z17 = this.f486761g;
        if (z17) {
            k0Var.x(4, z17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486756i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486756i.mo20599xaaa148a0();
    }

    public u0() {
        this.f486762h = (byte) -1;
        this.f486758d = "";
        this.f486759e = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.t0(r5Var, null);
    }

    public u0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.s0 s0Var) {
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
                            this.f486758d = d0Var.E();
                        } else if (F == 18) {
                            this.f486759e = d0Var.E();
                        } else if (F == 24) {
                            this.f486760f = d0Var.u();
                        } else if (F != 32) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f486761g = d0Var.l();
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
