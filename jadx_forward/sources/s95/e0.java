package s95;

/* loaded from: classes16.dex */
public final class e0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: s */
    public static final s95.e0 f486574s = new s95.e0();

    /* renamed from: t */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486575t = new s95.c0();

    /* renamed from: d */
    public float f486576d;

    /* renamed from: e */
    public boolean f486577e;

    /* renamed from: f */
    public boolean f486578f;

    /* renamed from: g */
    public int f486579g;

    /* renamed from: h */
    public int f486580h;

    /* renamed from: i */
    public float f486581i;

    /* renamed from: m */
    public float f486582m;

    /* renamed from: n */
    public int f486583n;

    /* renamed from: o */
    public int f486584o;

    /* renamed from: p */
    public boolean f486585p;

    /* renamed from: q */
    public long f486586q;

    /* renamed from: r */
    public byte f486587r;

    public e0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.c0 c0Var) {
        super(q5Var);
        this.f486587r = (byte) -1;
    }

    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa f(s95.e0 e0Var) {
        return e0Var.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.e0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.e0 e0Var = (s95.e0) obj;
        return java.lang.Float.floatToIntBits(this.f486576d) == java.lang.Float.floatToIntBits(e0Var.f486576d) && this.f486577e == e0Var.f486577e && this.f486578f == e0Var.f486578f && this.f486579g == e0Var.f486579g && this.f486580h == e0Var.f486580h && java.lang.Float.floatToIntBits(this.f486581i) == java.lang.Float.floatToIntBits(e0Var.f486581i) && java.lang.Float.floatToIntBits(this.f486582m) == java.lang.Float.floatToIntBits(e0Var.f486582m) && this.f486583n == e0Var.f486583n && this.f486584o == e0Var.f486584o && this.f486585p == e0Var.f486585p && this.f486586q == e0Var.f486586q && this.f7874x4f0c37a3.m20941xb2c87fbf(e0Var.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: g */
    public s95.d0 mo20599xaaa148a0() {
        if (this == f486574s) {
            return new s95.d0(null);
        }
        s95.d0 d0Var = new s95.d0(null);
        d0Var.e(this);
        return d0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486574s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.f486576d;
        int i18 = f17 != 0.0f ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.i(1, f17) : 0;
        boolean z17 = this.f486577e;
        if (z17) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.b(2, z17);
        }
        boolean z18 = this.f486578f;
        if (z18) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.b(3, z18);
        }
        int i19 = this.f486579g;
        s95.p pVar = s95.p.PbDefault;
        if (i19 != pVar.mo20656x276ffe3f()) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.f(4, this.f486579g);
        }
        if (this.f486580h != pVar.mo20656x276ffe3f()) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.f(5, this.f486580h);
        }
        float f18 = this.f486581i;
        if (f18 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(6, f18);
        }
        float f19 = this.f486582m;
        if (f19 != 0.0f) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.i(7, f19);
        }
        int i27 = this.f486583n;
        if (i27 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.k(8, i27);
        }
        int i28 = this.f486584o;
        if (i28 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.k(9, i28);
        }
        boolean z19 = this.f486585p;
        if (z19) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.b(10, z19);
        }
        long j17 = this.f486586q;
        if (j17 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.m(11, j17);
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
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + s95.r0.f486733y.hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(this.f486576d)) * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486577e)) * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486578f)) * 37) + 4) * 53) + this.f486579g) * 37) + 5) * 53) + this.f486580h) * 37) + 6) * 53) + java.lang.Float.floatToIntBits(this.f486581i)) * 37) + 7) * 53) + java.lang.Float.floatToIntBits(this.f486582m)) * 37) + 8) * 53) + this.f486583n) * 37) + 9) * 53) + this.f486584o) * 37) + 10) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486585p)) * 37) + 11) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486586q)) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = hashCode;
        return hashCode;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486734z;
        j6Var.c(s95.e0.class, s95.d0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486587r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486587r = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486574s.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.e0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        float f17 = this.f486576d;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        boolean z17 = this.f486577e;
        if (z17) {
            k0Var.x(2, z17);
        }
        boolean z18 = this.f486578f;
        if (z18) {
            k0Var.x(3, z18);
        }
        int i17 = this.f486579g;
        s95.p pVar = s95.p.PbDefault;
        if (i17 != pVar.mo20656x276ffe3f()) {
            k0Var.H(4, this.f486579g);
        }
        if (this.f486580h != pVar.mo20656x276ffe3f()) {
            k0Var.H(5, this.f486580h);
        }
        float f18 = this.f486581i;
        if (f18 != 0.0f) {
            k0Var.G(6, f18);
        }
        float f19 = this.f486582m;
        if (f19 != 0.0f) {
            k0Var.G(7, f19);
        }
        int i18 = this.f486583n;
        if (i18 != 0) {
            k0Var.H(8, i18);
        }
        int i19 = this.f486584o;
        if (i19 != 0) {
            k0Var.H(9, i19);
        }
        boolean z19 = this.f486585p;
        if (z19) {
            k0Var.x(10, z19);
        }
        long j17 = this.f486586q;
        if (j17 != 0) {
            k0Var.T(11, j17);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486574s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486574s.mo20599xaaa148a0();
    }

    public e0() {
        this.f486587r = (byte) -1;
        this.f486579g = 0;
        this.f486580h = 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.d0(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
    public e0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.c0 c0Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 13:
                            this.f486576d = d0Var.r();
                        case 16:
                            this.f486577e = d0Var.l();
                        case 24:
                            this.f486578f = d0Var.l();
                        case 32:
                            this.f486579g = d0Var.o();
                        case 40:
                            this.f486580h = d0Var.o();
                        case 53:
                            this.f486581i = d0Var.r();
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                            this.f486582m = d0Var.r();
                        case 64:
                            this.f486583n = d0Var.t();
                        case 72:
                            this.f486584o = d0Var.t();
                        case 80:
                            this.f486585p = d0Var.l();
                        case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51695x8a2568b7 /* 88 */:
                            this.f486586q = d0Var.u();
                        default:
                            if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
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
