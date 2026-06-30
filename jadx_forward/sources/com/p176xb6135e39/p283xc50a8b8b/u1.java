package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class u1 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.u1 f127092t = new com.p176xb6135e39.p283xc50a8b8b.u1();

    /* renamed from: u, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f127093u = new com.p176xb6135e39.p283xc50a8b8b.q1();

    /* renamed from: d, reason: collision with root package name */
    public int f127094d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f127095e;

    /* renamed from: f, reason: collision with root package name */
    public int f127096f;

    /* renamed from: g, reason: collision with root package name */
    public int f127097g;

    /* renamed from: h, reason: collision with root package name */
    public int f127098h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f127099i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f127100m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Object f127101n;

    /* renamed from: o, reason: collision with root package name */
    public int f127102o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.lang.Object f127103p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.z1 f127104q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f127105r;

    /* renamed from: s, reason: collision with root package name */
    public byte f127106s;

    public u1(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f127106s = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.u1)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = (com.p176xb6135e39.p283xc50a8b8b.u1) obj;
        int i17 = this.f127094d;
        if (((i17 & 1) != 0) != ((u1Var.f127094d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !m20916xfb82e301().equals(u1Var.m20916xfb82e301())) {
            return false;
        }
        int i18 = this.f127094d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = u1Var.f127094d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f127096f != u1Var.f127096f) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        if ((((i18 & 4) != 0) && this.f127097g != u1Var.f127097g) || p() != u1Var.p()) {
            return false;
        }
        if ((p() && this.f127098h != u1Var.f127098h) || q() != u1Var.q()) {
            return false;
        }
        if ((q() && !j().equals(u1Var.j())) || l() != u1Var.l()) {
            return false;
        }
        if ((l() && !g().equals(u1Var.g())) || k() != u1Var.k()) {
            return false;
        }
        if ((k() && !f().equals(u1Var.f())) || n() != u1Var.n()) {
            return false;
        }
        if ((n() && this.f127102o != u1Var.f127102o) || m() != u1Var.m()) {
            return false;
        }
        if ((m() && !h().equals(u1Var.h())) || o() != u1Var.o()) {
            return false;
        }
        if (o() && !i().mo20583xb2c87fbf(u1Var.i())) {
            return false;
        }
        int i27 = this.f127094d;
        if (((i27 & 1024) != 0) != ((u1Var.f127094d & 1024) != 0)) {
            return false;
        }
        return (!((i27 & 1024) != 0) || this.f127105r == u1Var.f127105r) && this.f7874x4f0c37a3.m20941xb2c87fbf(u1Var.f7874x4f0c37a3);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f127101n;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127101n = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f127100m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127100m = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f127092t;
    }

    /* renamed from: getName */
    public java.lang.String m20916xfb82e301() {
        java.lang.Object obj = this.f127095e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127095e = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f127094d & 1) != 0 ? 0 + com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f127095e) : 0;
        if ((this.f127094d & 32) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f127100m);
        }
        if ((this.f127094d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(3, this.f127096f);
        }
        if ((this.f127094d & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.f(4, this.f127097g);
        }
        if ((this.f127094d & 8) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.f(5, this.f127098h);
        }
        if ((this.f127094d & 16) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(6, this.f127099i);
        }
        if ((this.f127094d & 64) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(7, this.f127101n);
        }
        if ((this.f127094d & 512) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(8, i());
        }
        if ((this.f127094d & 128) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.k(9, this.f127102o);
        }
        if ((this.f127094d & 256) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(10, this.f127103p);
        }
        if ((this.f127094d & 1024) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(17, this.f127105r);
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
        java.lang.Object obj = this.f127103p;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127103p = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126925k.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f127094d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20916xfb82e301().hashCode();
        }
        int i18 = this.f127094d;
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f127096f;
        }
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f127097g;
        }
        if (p()) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f127098h;
        }
        if (q()) {
            hashCode = (((hashCode * 37) + 6) * 53) + j().hashCode();
        }
        if (l()) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 7) * 53) + f().hashCode();
        }
        if (n()) {
            hashCode = (((hashCode * 37) + 9) * 53) + this.f127102o;
        }
        if (m()) {
            hashCode = (((hashCode * 37) + 10) * 53) + h().hashCode();
        }
        if (o()) {
            hashCode = (((hashCode * 37) + 8) * 53) + i().mo20587x8cdac1b();
        }
        if ((this.f127094d & 1024) != 0) {
            hashCode = (((hashCode * 37) + 17) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f127105r);
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public com.p176xb6135e39.p283xc50a8b8b.z1 i() {
        com.p176xb6135e39.p283xc50a8b8b.z1 z1Var = this.f127104q;
        return z1Var == null ? com.p176xb6135e39.p283xc50a8b8b.z1.f127291q : z1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126926l;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.u1.class, com.p176xb6135e39.p283xc50a8b8b.r1.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f127106s;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!o() || i().mo20562xf582434a()) {
            this.f127106s = (byte) 1;
            return true;
        }
        this.f127106s = (byte) 0;
        return false;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f127099i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127099i = r17;
        }
        return r17;
    }

    public boolean k() {
        return (this.f127094d & 64) != 0;
    }

    public boolean l() {
        return (this.f127094d & 32) != 0;
    }

    public boolean m() {
        return (this.f127094d & 256) != 0;
    }

    public boolean n() {
        return (this.f127094d & 128) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f127092t.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.u1();
    }

    public boolean o() {
        return (this.f127094d & 512) != 0;
    }

    public boolean p() {
        return (this.f127094d & 8) != 0;
    }

    public boolean q() {
        return (this.f127094d & 16) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.r1 mo20599xaaa148a0() {
        if (this == f127092t) {
            return new com.p176xb6135e39.p283xc50a8b8b.r1(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.r1 r1Var = new com.p176xb6135e39.p283xc50a8b8b.r1(null);
        r1Var.e(this);
        return r1Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f127094d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f127095e);
        }
        if ((this.f127094d & 32) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f127100m);
        }
        if ((this.f127094d & 2) != 0) {
            k0Var.H(3, this.f127096f);
        }
        if ((this.f127094d & 4) != 0) {
            k0Var.H(4, this.f127097g);
        }
        if ((this.f127094d & 8) != 0) {
            k0Var.H(5, this.f127098h);
        }
        if ((this.f127094d & 16) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 6, this.f127099i);
        }
        if ((this.f127094d & 64) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 7, this.f127101n);
        }
        if ((this.f127094d & 512) != 0) {
            k0Var.J(8, i());
        }
        if ((this.f127094d & 128) != 0) {
            k0Var.H(9, this.f127102o);
        }
        if ((this.f127094d & 256) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 10, this.f127103p);
        }
        if ((this.f127094d & 1024) != 0) {
            k0Var.x(17, this.f127105r);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127092t;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f127092t.mo20599xaaa148a0();
    }

    public u1() {
        this.f127106s = (byte) -1;
        this.f127095e = "";
        this.f127097g = 1;
        this.f127098h = 1;
        this.f127099i = "";
        this.f127100m = "";
        this.f127101n = "";
        this.f127103p = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.r1(r5Var, null);
    }
}
