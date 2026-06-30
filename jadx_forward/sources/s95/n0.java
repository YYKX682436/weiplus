package s95;

/* loaded from: classes16.dex */
public final class n0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d */
    public long f486668d;

    /* renamed from: e */
    public volatile java.lang.Object f486669e;

    /* renamed from: f */
    public int f486670f;

    /* renamed from: g */
    public long f486671g;

    /* renamed from: h */
    public long f486672h;

    /* renamed from: i */
    public long f486673i;

    /* renamed from: m */
    public long f486674m;

    /* renamed from: n */
    public long f486675n;

    /* renamed from: o */
    public int f486676o;

    /* renamed from: p */
    public int f486677p;

    /* renamed from: q */
    public float f486678q;

    /* renamed from: r */
    public float f486679r;

    /* renamed from: s */
    public int f486680s;

    /* renamed from: t */
    public float f486681t;

    /* renamed from: u */
    public s95.o f486682u;

    /* renamed from: v */
    public s95.q0 f486683v;

    /* renamed from: w */
    public int f486684w;

    /* renamed from: x */
    public s95.k0 f486685x;

    /* renamed from: y */
    public byte f486686y;

    /* renamed from: z */
    public static final s95.n0 f486667z = new s95.n0();
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 A = new s95.l0();

    public n0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.l0 l0Var) {
        super(q5Var);
        this.f486686y = (byte) -1;
    }

    public static /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.wa f(s95.n0 n0Var) {
        return n0Var.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.n0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.n0 n0Var = (s95.n0) obj;
        if (this.f486668d != n0Var.f486668d || !i().equals(n0Var.i()) || this.f486670f != n0Var.f486670f || this.f486671g != n0Var.f486671g || this.f486672h != n0Var.f486672h || this.f486673i != n0Var.f486673i || this.f486674m != n0Var.f486674m || this.f486675n != n0Var.f486675n || this.f486676o != n0Var.f486676o || this.f486677p != n0Var.f486677p || java.lang.Float.floatToIntBits(this.f486678q) != java.lang.Float.floatToIntBits(n0Var.f486678q) || java.lang.Float.floatToIntBits(this.f486679r) != java.lang.Float.floatToIntBits(n0Var.f486679r) || this.f486680s != n0Var.f486680s || java.lang.Float.floatToIntBits(this.f486681t) != java.lang.Float.floatToIntBits(n0Var.f486681t)) {
            return false;
        }
        s95.o oVar = this.f486682u;
        if ((oVar != null) != (n0Var.f486682u != null)) {
            return false;
        }
        if ((oVar != null) && !h().mo20583xb2c87fbf(n0Var.h())) {
            return false;
        }
        s95.q0 q0Var = this.f486683v;
        if ((q0Var != null) != (n0Var.f486683v != null)) {
            return false;
        }
        if (((q0Var != null) && !j().mo20583xb2c87fbf(n0Var.j())) || this.f486684w != n0Var.f486684w) {
            return false;
        }
        s95.k0 k0Var = this.f486685x;
        if ((k0Var != null) != (n0Var.f486685x != null)) {
            return false;
        }
        return (!(k0Var != null) || g().mo20583xb2c87fbf(n0Var.g())) && this.f7874x4f0c37a3.m20941xb2c87fbf(n0Var.f7874x4f0c37a3);
    }

    public s95.k0 g() {
        s95.k0 k0Var = this.f486685x;
        return k0Var == null ? s95.k0.f486636g : k0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486667z;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f486668d;
        int s17 = j17 != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.k0.s(1, j17) : 0;
        java.lang.Object obj = this.f486669e;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486669e = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f486669e);
        }
        if (this.f486670f != s95.u.UnknownType.mo20656x276ffe3f()) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(3, this.f486670f);
        }
        long j18 = this.f486671g;
        if (j18 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(4, j18);
        }
        long j19 = this.f486672h;
        if (j19 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(5, j19);
        }
        long j27 = this.f486673i;
        if (j27 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(6, j27);
        }
        long j28 = this.f486674m;
        if (j28 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(7, j28);
        }
        long j29 = this.f486675n;
        if (j29 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.m(8, j29);
        }
        int i18 = this.f486676o;
        if (i18 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(9, i18);
        }
        int i19 = this.f486677p;
        if (i19 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(10, i19);
        }
        float f17 = this.f486678q;
        if (f17 != 0.0f) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(11, f17);
        }
        float f18 = this.f486679r;
        if (f18 != 0.0f) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(12, f18);
        }
        int i27 = this.f486680s;
        if (i27 != 0) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.k(13, i27);
        }
        float f19 = this.f486681t;
        if (f19 != 0.0f) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.i(14, f19);
        }
        if (this.f486682u != null) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(15, h());
        }
        if (this.f486683v != null) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(16, j());
        }
        if (this.f486684w != s95.v.Custom.mo20656x276ffe3f()) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.f(17, this.f486684w);
        }
        if (this.f486685x != null) {
            s17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(18, g());
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

    public s95.o h() {
        s95.o oVar = this.f486682u;
        return oVar == null ? s95.o.f486687g : oVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((s95.r0.f486717i.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de) * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486668d)) * 37) + 2) * 53) + i().hashCode()) * 37) + 3) * 53) + this.f486670f) * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486671g)) * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486672h)) * 37) + 6) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486673i)) * 37) + 7) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486674m)) * 37) + 8) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486675n)) * 37) + 9) * 53) + this.f486676o) * 37) + 10) * 53) + this.f486677p) * 37) + 11) * 53) + java.lang.Float.floatToIntBits(this.f486678q)) * 37) + 12) * 53) + java.lang.Float.floatToIntBits(this.f486679r)) * 37) + 13) * 53) + this.f486680s) * 37) + 14) * 53) + java.lang.Float.floatToIntBits(this.f486681t);
        if (this.f486682u != null) {
            hashCode = (((hashCode * 37) + 15) * 53) + h().mo20587x8cdac1b();
        }
        if (this.f486683v != null) {
            hashCode = (((hashCode * 37) + 16) * 53) + j().mo20587x8cdac1b();
        }
        int i18 = (((hashCode * 37) + 17) * 53) + this.f486684w;
        if (this.f486685x != null) {
            i18 = (((i18 * 37) + 18) * 53) + g().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (i18 * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f486669e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f486669e = r17;
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486718j;
        j6Var.c(s95.n0.class, s95.m0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486686y;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486686y = (byte) 1;
        return true;
    }

    public s95.q0 j() {
        s95.q0 q0Var = this.f486683v;
        return q0Var == null ? s95.q0.f486700h : q0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k */
    public s95.m0 mo20599xaaa148a0() {
        if (this == f486667z) {
            return new s95.m0(null);
        }
        s95.m0 m0Var = new s95.m0(null);
        m0Var.e(this);
        return m0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486667z.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.n0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.y yVar;
        long j17 = this.f486668d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        java.lang.Object obj = this.f486669e;
        if (obj instanceof java.lang.String) {
            yVar = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
            this.f486669e = yVar;
        } else {
            yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        if (!yVar.m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f486669e);
        }
        if (this.f486670f != s95.u.UnknownType.mo20656x276ffe3f()) {
            k0Var.H(3, this.f486670f);
        }
        long j18 = this.f486671g;
        if (j18 != 0) {
            k0Var.T(4, j18);
        }
        long j19 = this.f486672h;
        if (j19 != 0) {
            k0Var.T(5, j19);
        }
        long j27 = this.f486673i;
        if (j27 != 0) {
            k0Var.T(6, j27);
        }
        long j28 = this.f486674m;
        if (j28 != 0) {
            k0Var.T(7, j28);
        }
        long j29 = this.f486675n;
        if (j29 != 0) {
            k0Var.T(8, j29);
        }
        int i17 = this.f486676o;
        if (i17 != 0) {
            k0Var.H(9, i17);
        }
        int i18 = this.f486677p;
        if (i18 != 0) {
            k0Var.H(10, i18);
        }
        float f17 = this.f486678q;
        if (f17 != 0.0f) {
            k0Var.G(11, f17);
        }
        float f18 = this.f486679r;
        if (f18 != 0.0f) {
            k0Var.G(12, f18);
        }
        int i19 = this.f486680s;
        if (i19 != 0) {
            k0Var.H(13, i19);
        }
        float f19 = this.f486681t;
        if (f19 != 0.0f) {
            k0Var.G(14, f19);
        }
        if (this.f486682u != null) {
            k0Var.J(15, h());
        }
        if (this.f486683v != null) {
            k0Var.J(16, j());
        }
        if (this.f486684w != s95.v.Custom.mo20656x276ffe3f()) {
            k0Var.H(17, this.f486684w);
        }
        if (this.f486685x != null) {
            k0Var.J(18, g());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486667z;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486667z.mo20599xaaa148a0();
    }

    public n0() {
        this.f486686y = (byte) -1;
        this.f486669e = "";
        this.f486670f = 0;
        this.f486684w = 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.m0(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    public n0(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.l0 l0Var) {
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
                        case 8:
                            this.f486668d = d0Var.H();
                        case 18:
                            this.f486669e = d0Var.E();
                        case 24:
                            this.f486670f = d0Var.o();
                        case 32:
                            this.f486671g = d0Var.u();
                        case 40:
                            this.f486672h = d0Var.u();
                        case 48:
                            this.f486673i = d0Var.u();
                        case 56:
                            this.f486674m = d0Var.u();
                        case 64:
                            this.f486675n = d0Var.u();
                        case 72:
                            this.f486676o = d0Var.t();
                        case 80:
                            this.f486677p = d0Var.t();
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45660xcb53804c /* 93 */:
                            this.f486678q = d0Var.r();
                        case 101:
                            this.f486679r = d0Var.r();
                        case 104:
                            this.f486680s = d0Var.t();
                        case 117:
                            this.f486681t = d0Var.r();
                        case 122:
                            s95.o oVar = this.f486682u;
                            s95.n mo20599xaaa148a0 = oVar != null ? oVar.mo20599xaaa148a0() : null;
                            s95.o oVar2 = (s95.o) d0Var.v(s95.o.f486688h, t4Var);
                            this.f486682u = oVar2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.f(oVar2);
                                this.f486682u = mo20599xaaa148a0.mo20557x85702333();
                            }
                        case 130:
                            s95.q0 q0Var = this.f486683v;
                            s95.p0 mo20599xaaa148a02 = q0Var != null ? q0Var.mo20599xaaa148a0() : null;
                            s95.q0 q0Var2 = (s95.q0) d0Var.v(s95.q0.f486701i, t4Var);
                            this.f486683v = q0Var2;
                            if (mo20599xaaa148a02 != null) {
                                mo20599xaaa148a02.e(q0Var2);
                                this.f486683v = mo20599xaaa148a02.mo20557x85702333();
                            }
                        case 136:
                            this.f486684w = d0Var.o();
                        case 146:
                            s95.k0 k0Var = this.f486685x;
                            s95.j0 mo20599xaaa148a03 = k0Var != null ? k0Var.mo20599xaaa148a0() : null;
                            s95.k0 k0Var2 = (s95.k0) d0Var.v(s95.k0.f486637h, t4Var);
                            this.f486685x = k0Var2;
                            if (mo20599xaaa148a03 != null) {
                                mo20599xaaa148a03.e(k0Var2);
                                this.f486685x = mo20599xaaa148a03.mo20557x85702333();
                            }
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
