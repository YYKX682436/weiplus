package s95;

/* loaded from: classes16.dex */
public final class i extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: s, reason: collision with root package name */
    public static final s95.i f486617s = new s95.i();

    /* renamed from: t, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f486618t = new s95.g();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f486619d;

    /* renamed from: e, reason: collision with root package name */
    public long f486620e;

    /* renamed from: f, reason: collision with root package name */
    public long f486621f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f486622g;

    /* renamed from: h, reason: collision with root package name */
    public s95.f f486623h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f486624i;

    /* renamed from: m, reason: collision with root package name */
    public s95.u0 f486625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f486626n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f486627o;

    /* renamed from: p, reason: collision with root package name */
    public s95.y f486628p;

    /* renamed from: q, reason: collision with root package name */
    public s95.y f486629q;

    /* renamed from: r, reason: collision with root package name */
    public byte f486630r;

    public i(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, s95.g gVar) {
        super(q5Var);
        this.f486630r = (byte) -1;
    }

    public static s95.i n(byte[] bArr) {
        return (s95.i) f486618t.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.i)) {
            return super.mo20583xb2c87fbf(obj);
        }
        s95.i iVar = (s95.i) obj;
        if (!this.f486619d.equals(iVar.f486619d) || this.f486620e != iVar.f486620e || this.f486621f != iVar.f486621f || this.f486622g != iVar.f486622g) {
            return false;
        }
        s95.f fVar = this.f486623h;
        if ((fVar != null) != (iVar.f486623h != null)) {
            return false;
        }
        if (((fVar != null) && !k().mo20583xb2c87fbf(iVar.k())) || !this.f486624i.equals(iVar.f486624i)) {
            return false;
        }
        s95.u0 u0Var = this.f486625m;
        if ((u0Var != null) != (iVar.f486625m != null)) {
            return false;
        }
        if (((u0Var != null) && !m().mo20583xb2c87fbf(iVar.m())) || this.f486626n != iVar.f486626n || !this.f486627o.equals(iVar.f486627o)) {
            return false;
        }
        s95.y yVar = this.f486628p;
        if ((yVar != null) != (iVar.f486628p != null)) {
            return false;
        }
        if ((yVar != null) && !j().mo20583xb2c87fbf(iVar.j())) {
            return false;
        }
        s95.y yVar2 = this.f486629q;
        if ((yVar2 != null) != (iVar.f486629q != null)) {
            return false;
        }
        return (!(yVar2 != null) || l().mo20583xb2c87fbf(iVar.l())) && this.f7874x4f0c37a3.m20941xb2c87fbf(iVar.f7874x4f0c37a3);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f486617s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f486619d.size(); i19++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(1, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486619d.get(i19));
        }
        long j17 = this.f486620e;
        if (j17 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.m(2, j17);
        }
        long j18 = this.f486621f;
        if (j18 != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.m(3, j18);
        }
        boolean z17 = this.f486622g;
        if (z17) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.b(4, z17);
        }
        if (this.f486623h != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(5, k());
        }
        for (int i27 = 0; i27 < this.f486624i.size(); i27++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486624i.get(i27));
        }
        if (this.f486625m != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(7, m());
        }
        boolean z18 = this.f486626n;
        if (z18) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.b(8, z18);
        }
        for (int i28 = 0; i28 < this.f486627o.size(); i28++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(9, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486627o.get(i28));
        }
        if (this.f486628p != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(10, j());
        }
        if (this.f486629q != null) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(11, l());
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
        int hashCode = s95.r0.f486731w.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (this.f486619d.size() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f486619d.hashCode();
        }
        int b17 = (((((((((((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486620e)) * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f486621f)) * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486622g);
        if (this.f486623h != null) {
            b17 = (((b17 * 37) + 5) * 53) + k().mo20587x8cdac1b();
        }
        if (this.f486624i.size() > 0) {
            b17 = (((b17 * 37) + 6) * 53) + this.f486624i.hashCode();
        }
        if (this.f486625m != null) {
            b17 = (((b17 * 37) + 7) * 53) + m().mo20587x8cdac1b();
        }
        int a17 = (((b17 * 37) + 8) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f486626n);
        if (this.f486627o.size() > 0) {
            a17 = (((a17 * 37) + 9) * 53) + this.f486627o.hashCode();
        }
        if (this.f486628p != null) {
            a17 = (((a17 * 37) + 10) * 53) + j().mo20587x8cdac1b();
        }
        if (this.f486629q != null) {
            a17 = (((a17 * 37) + 11) * 53) + l().mo20587x8cdac1b();
        }
        int m20942x8cdac1b = (a17 * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = s95.r0.f486732x;
        j6Var.c(s95.i.class, s95.h.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f486630r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f486630r = (byte) 1;
        return true;
    }

    public s95.y j() {
        s95.y yVar = this.f486628p;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    public s95.f k() {
        s95.f fVar = this.f486623h;
        return fVar == null ? s95.f.f486588i : fVar;
    }

    public s95.y l() {
        s95.y yVar = this.f486629q;
        return yVar == null ? s95.y.f486773i : yVar;
    }

    public s95.u0 m() {
        s95.u0 u0Var = this.f486625m;
        return u0Var == null ? s95.u0.f486756i : u0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f486617s.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new s95.i();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public s95.h mo20599xaaa148a0() {
        if (this == f486617s) {
            return new s95.h(null);
        }
        s95.h hVar = new s95.h(null);
        hVar.h(this);
        return hVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (int i17 = 0; i17 < this.f486619d.size(); i17++) {
            k0Var.J(1, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486619d.get(i17));
        }
        long j17 = this.f486620e;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        long j18 = this.f486621f;
        if (j18 != 0) {
            k0Var.T(3, j18);
        }
        boolean z17 = this.f486622g;
        if (z17) {
            k0Var.x(4, z17);
        }
        if (this.f486623h != null) {
            k0Var.J(5, k());
        }
        for (int i18 = 0; i18 < this.f486624i.size(); i18++) {
            k0Var.J(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486624i.get(i18));
        }
        if (this.f486625m != null) {
            k0Var.J(7, m());
        }
        boolean z18 = this.f486626n;
        if (z18) {
            k0Var.x(8, z18);
        }
        for (int i19 = 0; i19 < this.f486627o.size(); i19++) {
            k0Var.J(9, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f486627o.get(i19));
        }
        if (this.f486628p != null) {
            k0Var.J(10, j());
        }
        if (this.f486629q != null) {
            k0Var.J(11, l());
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f486617s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f486617s.mo20599xaaa148a0();
    }

    public i() {
        this.f486630r = (byte) -1;
        this.f486619d = java.util.Collections.emptyList();
        this.f486624i = java.util.Collections.emptyList();
        this.f486627o = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new s95.h(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public i(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var, s95.g gVar) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            int i17 = (c17 == true ? 1 : 0) & 1;
                            c17 = c17;
                            if (i17 == 0) {
                                this.f486619d = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 1;
                            }
                            this.f486619d.add(d0Var.v(s95.n0.A, t4Var));
                        case 16:
                            this.f486620e = d0Var.u();
                        case 24:
                            this.f486621f = d0Var.u();
                        case 32:
                            this.f486622g = d0Var.l();
                        case 42:
                            s95.f fVar = this.f486623h;
                            s95.e mo20599xaaa148a0 = fVar != null ? fVar.mo20599xaaa148a0() : null;
                            s95.f fVar2 = (s95.f) d0Var.v(s95.f.f486589m, t4Var);
                            this.f486623h = fVar2;
                            if (mo20599xaaa148a0 != null) {
                                mo20599xaaa148a0.f(fVar2);
                                this.f486623h = mo20599xaaa148a0.mo20557x85702333();
                            }
                        case 50:
                            int i18 = (c17 == true ? 1 : 0) & 2;
                            c17 = c17;
                            if (i18 == 0) {
                                this.f486624i = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 2;
                            }
                            this.f486624i.add(d0Var.v(s95.s.f486736i, t4Var));
                        case 58:
                            s95.u0 u0Var = this.f486625m;
                            s95.t0 mo20599xaaa148a02 = u0Var != null ? u0Var.mo20599xaaa148a0() : null;
                            s95.u0 u0Var2 = (s95.u0) d0Var.v(s95.u0.f486757m, t4Var);
                            this.f486625m = u0Var2;
                            if (mo20599xaaa148a02 != null) {
                                mo20599xaaa148a02.e(u0Var2);
                                this.f486625m = mo20599xaaa148a02.mo20557x85702333();
                            }
                        case 64:
                            this.f486626n = d0Var.l();
                        case 74:
                            int i19 = (c17 == true ? 1 : 0) & 4;
                            c17 = c17;
                            if (i19 == 0) {
                                this.f486627o = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 4;
                            }
                            this.f486627o.add(d0Var.v(s95.l.f486642i, t4Var));
                        case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                            s95.y yVar = this.f486628p;
                            s95.x mo20599xaaa148a03 = yVar != null ? yVar.mo20599xaaa148a0() : null;
                            s95.y yVar2 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                            this.f486628p = yVar2;
                            if (mo20599xaaa148a03 != null) {
                                mo20599xaaa148a03.e(yVar2);
                                this.f486628p = mo20599xaaa148a03.mo20557x85702333();
                            }
                        case 90:
                            s95.y yVar3 = this.f486629q;
                            s95.x mo20599xaaa148a04 = yVar3 != null ? yVar3.mo20599xaaa148a0() : null;
                            s95.y yVar4 = (s95.y) d0Var.v(s95.y.f486774m, t4Var);
                            this.f486629q = yVar4;
                            if (mo20599xaaa148a04 != null) {
                                mo20599xaaa148a04.e(yVar4);
                                this.f486629q = mo20599xaaa148a04.mo20557x85702333();
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
                if (((c17 == true ? 1 : 0) & 1) != 0) {
                    this.f486619d = java.util.Collections.unmodifiableList(this.f486619d);
                }
                if (((c17 == true ? 1 : 0) & 2) != 0) {
                    this.f486624i = java.util.Collections.unmodifiableList(this.f486624i);
                }
                if (((c17 == true ? 1 : 0) & 4) != 0) {
                    this.f486627o = java.util.Collections.unmodifiableList(this.f486627o);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }
}
