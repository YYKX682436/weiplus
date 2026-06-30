package cz5;

/* loaded from: classes16.dex */
public final class f extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: n, reason: collision with root package name */
    public static final cz5.f f306581n = new cz5.f();

    /* renamed from: o, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f306582o = new cz5.c();

    /* renamed from: d, reason: collision with root package name */
    public long f306583d;

    /* renamed from: e, reason: collision with root package name */
    public long f306584e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f306585f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.d8 f306586g;

    /* renamed from: h, reason: collision with root package name */
    public int f306587h;

    /* renamed from: i, reason: collision with root package name */
    public int f306588i;

    /* renamed from: m, reason: collision with root package name */
    public byte f306589m;

    public f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, cz5.b bVar) {
        super(q5Var);
        this.f306589m = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cz5.f)) {
            return super.mo20583xb2c87fbf(obj);
        }
        cz5.f fVar = (cz5.f) obj;
        return this.f306583d == fVar.f306583d && this.f306584e == fVar.f306584e && m123179xfb82e301().equals(fVar.m123179xfb82e301()) && g().m20618xb2c87fbf(fVar.g()) && this.f306587h == fVar.f306587h && this.f306588i == fVar.f306588i && this.f7874x4f0c37a3.m20941xb2c87fbf(fVar.f7874x4f0c37a3);
    }

    public final com.p176xb6135e39.p283xc50a8b8b.d8 g() {
        com.p176xb6135e39.p283xc50a8b8b.d8 d8Var = this.f306586g;
        return d8Var == null ? new com.p176xb6135e39.p283xc50a8b8b.d8(cz5.e.f306580a, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, java.util.Collections.emptyMap()) : d8Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f306581n;
    }

    /* renamed from: getName */
    public java.lang.String m123179xfb82e301() {
        java.lang.Object obj = this.f306585f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f306585f = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f306583d;
        int s17 = j17 != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.s(1, j17) : 0;
        long j18 = this.f306584e;
        if (j18 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.s(2, j18);
        }
        java.lang.Object obj = this.f306585f;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f306585f = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f306585f);
        }
        for (java.util.Map.Entry entry : g().e().entrySet()) {
            com.p176xb6135e39.p283xc50a8b8b.q7 mo20596xab31548 = cz5.e.f306580a.mo20596xab31548();
            mo20596xab31548.f126982e = entry.getKey();
            mo20596xab31548.f126984g = true;
            mo20596xab31548.f126983f = entry.getValue();
            mo20596xab31548.f126985h = true;
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, mo20596xab31548.mo20556x59bc66e());
        }
        int i18 = this.f306587h;
        if (i18 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(5, i18);
        }
        int i19 = this.f306588i;
        if (i19 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(6, i19);
        }
        int mo20593x9d9c349b = s17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
    public cz5.d mo20599xaaa148a0() {
        if (this == f306581n) {
            return new cz5.d(null);
        }
        cz5.d dVar = new cz5.d(null);
        dVar.f(this);
        return dVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + cz5.g.f306590a.hashCode()) * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f306583d)) * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f306584e)) * 37) + 3) * 53) + m123179xfb82e301().hashCode();
        if (!g().e().isEmpty()) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().m20619x8cdac1b();
        }
        int m20942x8cdac1b = (((((((((hashCode * 37) + 5) * 53) + this.f306587h) * 37) + 6) * 53) + this.f306588i) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = cz5.g.f306591b;
        j6Var.c(cz5.f.class, cz5.d.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20780xf53a7b77(int i17) {
        if (i17 == 4) {
            return g();
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f306589m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f306589m = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f306581n.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new cz5.f();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        long j17 = this.f306583d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        long j18 = this.f306584e;
        if (j18 != 0) {
            k0Var.T(2, j18);
        }
        java.lang.Object obj = this.f306585f;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f306585f = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f306585f);
        }
        com.p176xb6135e39.p283xc50a8b8b.l6.m20770x91411066(k0Var, g(), cz5.e.f306580a, 4);
        int i17 = this.f306587h;
        if (i17 != 0) {
            k0Var.H(5, i17);
        }
        int i18 = this.f306588i;
        if (i18 != 0) {
            k0Var.H(6, i18);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f306581n;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f306581n.mo20599xaaa148a0();
    }

    public f() {
        this.f306589m = (byte) -1;
        this.f306585f = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new cz5.d(r5Var, null);
    }

    public f(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, cz5.b bVar) {
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
                        if (F == 8) {
                            this.f306583d = d0Var.H();
                        } else if (F == 16) {
                            this.f306584e = d0Var.H();
                        } else if (F == 26) {
                            this.f306585f = d0Var.E();
                        } else if (F == 34) {
                            if (!(z18 & true)) {
                                this.f306586g = new com.p176xb6135e39.p283xc50a8b8b.d8(cz5.e.f306580a, com.p176xb6135e39.p283xc50a8b8b.c8.MAP, new java.util.LinkedHashMap());
                                z18 |= true;
                            }
                            com.p176xb6135e39.p283xc50a8b8b.t7 t7Var = (com.p176xb6135e39.p283xc50a8b8b.t7) d0Var.v(cz5.e.f306580a.f127084f.f127029f, t4Var);
                            ((com.p176xb6135e39.p283xc50a8b8b.b8) this.f306586g.g()).put(t7Var.f127082d, t7Var.f127083e);
                        } else if (F == 40) {
                            this.f306587h = d0Var.t();
                        } else if (F != 48) {
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f306588i = d0Var.t();
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
            } catch (java.lang.Throwable th6) {
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
                throw th6;
            }
        }
        this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
        mo20781x1ff81300();
    }
}
