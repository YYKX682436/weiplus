package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class o3 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.o3 f126885p = new com.p176xb6135e39.p283xc50a8b8b.o3();

    /* renamed from: q, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126886q = new com.p176xb6135e39.p283xc50a8b8b.j3();

    /* renamed from: d, reason: collision with root package name */
    public int f126887d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f126888e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f126889f;

    /* renamed from: g, reason: collision with root package name */
    public long f126890g;

    /* renamed from: h, reason: collision with root package name */
    public long f126891h;

    /* renamed from: i, reason: collision with root package name */
    public double f126892i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.y f126893m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Object f126894n;

    /* renamed from: o, reason: collision with root package name */
    public byte f126895o;

    public o3(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126895o = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.o3)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.o3 o3Var = (com.p176xb6135e39.p283xc50a8b8b.o3) obj;
        if (!this.f126888e.equals(o3Var.f126888e)) {
            return false;
        }
        int i17 = this.f126887d;
        if (((i17 & 1) != 0) != ((o3Var.f126887d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !g().equals(o3Var.g())) {
            return false;
        }
        int i18 = this.f126887d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = o3Var.f126887d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f126890g != o3Var.f126890g) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        if (((i18 & 4) != 0) && this.f126891h != o3Var.f126891h) {
            return false;
        }
        if (((i18 & 8) != 0) != ((i19 & 8) != 0)) {
            return false;
        }
        if (((i18 & 8) != 0) && java.lang.Double.doubleToLongBits(this.f126892i) != java.lang.Double.doubleToLongBits(o3Var.f126892i)) {
            return false;
        }
        int i27 = this.f126887d;
        if (((i27 & 16) != 0) != ((o3Var.f126887d & 16) != 0)) {
            return false;
        }
        if (((i27 & 16) != 0) && !this.f126893m.mo20935xb2c87fbf(o3Var.f126893m)) {
            return false;
        }
        int i28 = this.f126887d;
        if (((i28 & 32) != 0) != ((o3Var.f126887d & 32) != 0)) {
            return false;
        }
        return (!((i28 & 32) != 0) || f().equals(o3Var.f())) && this.f7874x4f0c37a3.m20941xb2c87fbf(o3Var.f7874x4f0c37a3);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f126894n;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126894n = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f126889f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126889f = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126885p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f126888e.size(); i19++) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126888e.get(i19));
        }
        if ((this.f126887d & 1) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(3, this.f126889f);
        }
        if ((this.f126887d & 2) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.s(4, this.f126890g);
        }
        if ((this.f126887d & 4) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.m(5, this.f126891h);
        }
        if ((this.f126887d & 8) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.e(6, this.f126892i);
        }
        if ((this.f126887d & 16) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.k0.c(7, this.f126893m);
        }
        if ((this.f126887d & 32) != 0) {
            i18 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(8, this.f126894n);
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

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.k3 mo20599xaaa148a0() {
        if (this == f126885p) {
            return new com.p176xb6135e39.p283xc50a8b8b.k3(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.k3 k3Var = new com.p176xb6135e39.p283xc50a8b8b.k3(null);
        k3Var.f(this);
        return k3Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.O.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if (this.f126888e.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f126888e.hashCode();
        }
        if ((this.f126887d & 1) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + g().hashCode();
        }
        if ((this.f126887d & 2) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f126890g);
        }
        if ((this.f126887d & 4) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(this.f126891h);
        }
        if ((this.f126887d & 8) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.b(java.lang.Double.doubleToLongBits(this.f126892i));
        }
        if ((this.f126887d & 16) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f126893m.m20956x8cdac1b();
        }
        if ((this.f126887d & 32) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + f().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.P;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.o3.class, com.p176xb6135e39.p283xc50a8b8b.k3.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126895o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126888e.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.n3) this.f126888e.get(i17)).mo20562xf582434a()) {
                this.f126895o = (byte) 0;
                return false;
            }
        }
        this.f126895o = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126885p.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.o3();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        for (int i17 = 0; i17 < this.f126888e.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126888e.get(i17));
        }
        if ((this.f126887d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f126889f);
        }
        if ((this.f126887d & 2) != 0) {
            k0Var.T(4, this.f126890g);
        }
        if ((this.f126887d & 4) != 0) {
            k0Var.T(5, this.f126891h);
        }
        if ((this.f126887d & 8) != 0) {
            k0Var.B(6, this.f126892i);
        }
        if ((this.f126887d & 16) != 0) {
            k0Var.z(7, this.f126893m);
        }
        if ((this.f126887d & 32) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 8, this.f126894n);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126885p;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126885p.mo20599xaaa148a0();
    }

    public o3() {
        this.f126895o = (byte) -1;
        this.f126888e = java.util.Collections.emptyList();
        this.f126889f = "";
        this.f126893m = com.p176xb6135e39.p283xc50a8b8b.y.f127245e;
        this.f126894n = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.k3(r5Var, null);
    }
}
