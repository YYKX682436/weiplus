package s95;

/* loaded from: classes16.dex */
public final class l extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final s95.l f486641h = new s95.l();

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486642i = new s95.j();

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.Object f486643d;

    /* renamed from: e, reason: collision with root package name */
    public int f486644e;

    /* renamed from: f, reason: collision with root package name */
    public long f486645f;

    /* renamed from: g, reason: collision with root package name */
    public byte f486646g;

    public l(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.j jVar) {
        super(q5Var);
        this.f486646g = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.l)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.l lVar = (s95.l) obj;
        return g().equals(lVar.g()) && this.f486644e == lVar.f486644e && this.f486645f == lVar.f486645f && this.f7874x4f0c37a3.m20941xb2c87fbf(lVar.f7874x4f0c37a3);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f486643d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f486643d = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486641h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        java.lang.Object obj = this.f486643d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486643d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        int m20743x690e0f49 = yVar.m20957x7aab3243() ? 0 : 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f486643d);
        int i18 = this.f486644e;
        if (i18 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(2, i18);
        }
        long j17 = this.f486645f;
        if (j17 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.m(3, j17);
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
    public s95.k mo20599xaaa148a0() {
        if (this == f486641h) {
            return new s95.k(null);
        }
        s95.k kVar = new s95.k(null);
        kVar.e(this);
        return kVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486729u.hashCode()) * 37) + 1) * 53) + g().hashCode()) * 37) + 2) * 53) + this.f486644e) * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486645f)) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486730v;
        j6Var.c(s95.l.class, s95.k.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486646g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486646g = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486641h.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.l();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        java.lang.Object obj = this.f486643d;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486643d = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f486643d);
        }
        int i17 = this.f486644e;
        if (i17 != 0) {
            k0Var.H(2, i17);
        }
        long j17 = this.f486645f;
        if (j17 != 0) {
            k0Var.T(3, j17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486641h;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486641h.mo20599xaaa148a0();
    }

    public l() {
        this.f486646g = (byte) -1;
        this.f486643d = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.k(r5Var, null);
    }

    public l(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.j jVar) {
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
                            this.f486643d = d0Var.E();
                        } else if (F == 16) {
                            this.f486644e = d0Var.t();
                        } else if (F != 24) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f486645f = d0Var.u();
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
