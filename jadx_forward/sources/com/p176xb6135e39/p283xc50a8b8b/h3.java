package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class h3 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.h3 f126682p = new com.p176xb6135e39.p283xc50a8b8b.h3();

    /* renamed from: q, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126683q = new com.p176xb6135e39.p283xc50a8b8b.f3();

    /* renamed from: d, reason: collision with root package name */
    public int f126684d;

    /* renamed from: e, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126685e;

    /* renamed from: f, reason: collision with root package name */
    public int f126686f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126687g;

    /* renamed from: h, reason: collision with root package name */
    public int f126688h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f126689i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f126690m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126691n;

    /* renamed from: o, reason: collision with root package name */
    public byte f126692o;

    public h3(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126686f = -1;
        this.f126688h = -1;
        this.f126692o = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.h3)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.h3 h3Var = (com.p176xb6135e39.p283xc50a8b8b.h3) obj;
        if (!((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126685e).equals(h3Var.f126685e)) {
            return false;
        }
        if (!((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126687g).equals(h3Var.f126687g)) {
            return false;
        }
        int i17 = this.f126684d;
        if (((i17 & 1) != 0) != ((h3Var.f126684d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !f().equals(h3Var.f())) {
            return false;
        }
        int i18 = this.f126684d;
        if (((i18 & 2) != 0) != ((h3Var.f126684d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || g().equals(h3Var.g())) && this.f126691n.equals(h3Var.f126691n) && this.f7874x4f0c37a3.m20941xb2c87fbf(h3Var.f7874x4f0c37a3);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f126689i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126689i = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f126690m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126690m = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126682p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var;
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var2;
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            t6Var = this.f126685e;
            if (i18 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                break;
            }
            i19 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i18));
            i18++;
        }
        int i27 = 0 + i19;
        if (!t6Var.isEmpty()) {
            i27 = i27 + 1 + com.p176xb6135e39.p283xc50a8b8b.k0.l(i19);
        }
        this.f126686f = i19;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            t6Var2 = this.f126687g;
            if (i28 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f) {
                break;
            }
            i29 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).h(i28));
            i28++;
        }
        int i37 = i27 + i29;
        if (!t6Var2.isEmpty()) {
            i37 = i37 + 1 + com.p176xb6135e39.p283xc50a8b8b.k0.l(i29);
        }
        this.f126688h = i29;
        if ((this.f126684d & 1) != 0) {
            i37 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f126689i);
        }
        if ((this.f126684d & 2) != 0) {
            i37 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(4, this.f126690m);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f126691n.size(); i39++) {
            i38 += com.p176xb6135e39.p283xc50a8b8b.l6.m20744x2973fc50(this.f126691n.J(i39));
        }
        int size = i37 + i38 + (this.f126691n.size() * 1) + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = size;
        return size;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.g3 mo20599xaaa148a0() {
        if (this == f126682p) {
            return new com.p176xb6135e39.p283xc50a8b8b.g3(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.g3 g3Var = new com.p176xb6135e39.p283xc50a8b8b.g3(null);
        g3Var.e(this);
        return g3Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.U.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f126685e;
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).hashCode();
        }
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var2 = this.f126687g;
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).hashCode();
        }
        if ((this.f126684d & 1) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
        }
        if ((this.f126684d & 2) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
        }
        if (this.f126691n.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f126691n.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.V;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.h3.class, com.p176xb6135e39.p283xc50a8b8b.g3.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126692o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f126692o = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126682p.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.h3();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        mo20593x9d9c349b();
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126685e).f126862f > 0) {
            k0Var.S(10);
            k0Var.S(this.f126686f);
        }
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f126685e;
            if (i17 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                break;
            }
            k0Var.I(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i17));
            i17++;
        }
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126687g).f126862f > 0) {
            k0Var.S(18);
            k0Var.S(this.f126688h);
        }
        int i18 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var2 = this.f126687g;
            if (i18 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f) {
                break;
            }
            k0Var.I(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).h(i18));
            i18++;
        }
        if ((this.f126684d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f126689i);
        }
        if ((this.f126684d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 4, this.f126690m);
        }
        for (int i19 = 0; i19 < this.f126691n.size(); i19++) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 6, this.f126691n.J(i19));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126682p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126682p.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.g3(r5Var, null);
    }

    public h3() {
        this.f126686f = -1;
        this.f126688h = -1;
        this.f126692o = (byte) -1;
        this.f126685e = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126687g = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126689i = "";
        this.f126690m = "";
        this.f126691n = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
    }
}
