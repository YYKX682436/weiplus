package s95;

/* loaded from: classes16.dex */
public final class k0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final s95.k0 f486636g = new s95.k0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486637h = new s95.i0();

    /* renamed from: d, reason: collision with root package name */
    public int f486638d;

    /* renamed from: e, reason: collision with root package name */
    public float f486639e;

    /* renamed from: f, reason: collision with root package name */
    public byte f486640f;

    public k0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.i0 i0Var) {
        super(q5Var);
        this.f486640f = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.k0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.k0 k0Var = (s95.k0) obj;
        return this.f486638d == k0Var.f486638d && java.lang.Float.floatToIntBits(this.f486639e) == java.lang.Float.floatToIntBits(k0Var.f486639e) && this.f7874x4f0c37a3.m20941xb2c87fbf(k0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s95.j0 mo20599xaaa148a0() {
        if (this == f486636g) {
            return new s95.j0(null);
        }
        s95.j0 j0Var = new s95.j0(null);
        j0Var.e(this);
        return j0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486636g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int f17 = this.f486638d != s95.t.NoneAnimation.mo20656x276ffe3f() ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.f(1, this.f486638d) : 0;
        float f18 = this.f486639e;
        if (f18 != 0.0f) {
            f17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(2, f18);
        }
        int mo20593x9d9c349b = f17 + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int hashCode = ((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486715g.hashCode()) * 37) + 1) * 53) + this.f486638d) * 37) + 2) * 53) + java.lang.Float.floatToIntBits(this.f486639e)) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486716h;
        j6Var.c(s95.k0.class, s95.j0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486640f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486640f = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486636g.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.k0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (this.f486638d != s95.t.NoneAnimation.mo20656x276ffe3f()) {
            k0Var.H(1, this.f486638d);
        }
        float f17 = this.f486639e;
        if (f17 != 0.0f) {
            k0Var.G(2, f17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486636g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486636g.mo20599xaaa148a0();
    }

    public k0() {
        this.f486640f = (byte) -1;
        this.f486638d = 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.j0(r5Var, null);
    }

    public k0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.i0 i0Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 8) {
                                this.f486638d = d0Var.o();
                            } else if (F != 21) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f486639e = d0Var.r();
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
