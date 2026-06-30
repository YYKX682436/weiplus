package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class g2 extends com.p176xb6135e39.p283xc50a8b8b.u5 {
    public static final com.p176xb6135e39.p283xc50a8b8b.g2 E = new com.p176xb6135e39.p283xc50a8b8b.g2();
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 F = new com.p176xb6135e39.p283xc50a8b8b.d2();
    public volatile java.lang.Object A;
    public volatile java.lang.Object B;
    public java.util.List C;
    public byte D;

    /* renamed from: e, reason: collision with root package name */
    public int f126635e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f126636f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f126637g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126638h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126639i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f126640m;

    /* renamed from: n, reason: collision with root package name */
    public int f126641n;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Object f126642o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f126643p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f126644q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f126645r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f126646s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f126647t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f126648u;

    /* renamed from: v, reason: collision with root package name */
    public volatile java.lang.Object f126649v;

    /* renamed from: w, reason: collision with root package name */
    public volatile java.lang.Object f126650w;

    /* renamed from: x, reason: collision with root package name */
    public volatile java.lang.Object f126651x;

    /* renamed from: y, reason: collision with root package name */
    public volatile java.lang.Object f126652y;

    /* renamed from: z, reason: collision with root package name */
    public volatile java.lang.Object f126653z;

    public g2(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(s5Var);
        this.D = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.g2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var = (com.p176xb6135e39.p283xc50a8b8b.g2) obj;
        int i17 = this.f126635e;
        if (((i17 & 1) != 0) != ((g2Var.f126635e & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !n().equals(g2Var.n())) {
            return false;
        }
        int i18 = this.f126635e;
        if (((i18 & 2) != 0) != ((g2Var.f126635e & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !m().equals(g2Var.m())) {
            return false;
        }
        int i19 = this.f126635e;
        boolean z17 = (i19 & 4) != 0;
        int i27 = g2Var.f126635e;
        if (z17 != ((i27 & 4) != 0)) {
            return false;
        }
        if (((i19 & 4) != 0) && this.f126638h != g2Var.f126638h) {
            return false;
        }
        if (((i19 & 8) != 0) != ((i27 & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && this.f126639i != g2Var.f126639i) {
            return false;
        }
        if (((i19 & 16) != 0) != ((i27 & 16) != 0)) {
            return false;
        }
        if (((i19 & 16) != 0) && this.f126640m != g2Var.f126640m) {
            return false;
        }
        if (((i19 & 32) != 0) != ((i27 & 32) != 0)) {
            return false;
        }
        if (((i19 & 32) != 0) && this.f126641n != g2Var.f126641n) {
            return false;
        }
        if (((i19 & 64) != 0) != ((i27 & 64) != 0)) {
            return false;
        }
        if (((i19 & 64) != 0) && !l().equals(g2Var.l())) {
            return false;
        }
        int i28 = this.f126635e;
        boolean z18 = (i28 & 128) != 0;
        int i29 = g2Var.f126635e;
        if (z18 != ((i29 & 128) != 0)) {
            return false;
        }
        if (((i28 & 128) != 0) && this.f126643p != g2Var.f126643p) {
            return false;
        }
        if (((i28 & 256) != 0) != ((i29 & 256) != 0)) {
            return false;
        }
        if (((i28 & 256) != 0) && this.f126644q != g2Var.f126644q) {
            return false;
        }
        if (((i28 & 512) != 0) != ((i29 & 512) != 0)) {
            return false;
        }
        if (((i28 & 512) != 0) && this.f126645r != g2Var.f126645r) {
            return false;
        }
        if (((i28 & 1024) != 0) != ((i29 & 1024) != 0)) {
            return false;
        }
        if (((i28 & 1024) != 0) && this.f126646s != g2Var.f126646s) {
            return false;
        }
        if (((i28 & 2048) != 0) != ((i29 & 2048) != 0)) {
            return false;
        }
        if (((i28 & 2048) != 0) && this.f126647t != g2Var.f126647t) {
            return false;
        }
        if (((i28 & 4096) != 0) != ((i29 & 4096) != 0)) {
            return false;
        }
        if (((i28 & 4096) != 0) && this.f126648u != g2Var.f126648u) {
            return false;
        }
        if (((i28 & 8192) != 0) != ((i29 & 8192) != 0)) {
            return false;
        }
        if (((i28 & 8192) != 0) && !o().equals(g2Var.o())) {
            return false;
        }
        int i37 = this.f126635e;
        if (((i37 & 16384) != 0) != ((g2Var.f126635e & 16384) != 0)) {
            return false;
        }
        if ((((i37 & 16384) != 0) && !k().equals(g2Var.k())) || y() != g2Var.y()) {
            return false;
        }
        if ((y() && !t().equals(g2Var.t())) || u() != g2Var.u()) {
            return false;
        }
        if ((u() && !p().equals(g2Var.p())) || w() != g2Var.w()) {
            return false;
        }
        if ((w() && !r().equals(g2Var.r())) || v() != g2Var.v()) {
            return false;
        }
        if ((!v() || q().equals(g2Var.q())) && x() == g2Var.x()) {
            return (!x() || s().equals(g2Var.s())) && this.C.equals(g2Var.C) && this.f7874x4f0c37a3.m20941xb2c87fbf(g2Var.f7874x4f0c37a3) && h().equals(g2Var.h());
        }
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return E;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = (this.f126635e & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f126636f) + 0 : 0;
        if ((this.f126635e & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(8, this.f126637g);
        }
        if ((this.f126635e & 32) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.f(9, this.f126641n);
        }
        if ((this.f126635e & 4) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(10, this.f126638h);
        }
        if ((this.f126635e & 64) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(11, this.f126642o);
        }
        if ((this.f126635e & 128) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(16, this.f126643p);
        }
        if ((this.f126635e & 256) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(17, this.f126644q);
        }
        if ((this.f126635e & 512) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(18, this.f126645r);
        }
        if ((this.f126635e & 8) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(20, this.f126639i);
        }
        if ((this.f126635e & 2048) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(23, this.f126647t);
        }
        if ((this.f126635e & 16) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(27, this.f126640m);
        }
        if ((this.f126635e & 4096) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(31, this.f126648u);
        }
        if ((this.f126635e & 8192) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(36, this.f126649v);
        }
        if ((this.f126635e & 16384) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(37, this.f126650w);
        }
        if ((this.f126635e & 32768) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(39, this.f126651x);
        }
        if ((this.f126635e & 65536) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(40, this.f126652y);
        }
        if ((this.f126635e & 131072) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(41, this.f126653z);
        }
        if ((this.f126635e & 1024) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.b(42, this.f126646s);
        }
        if ((this.f126635e & 262144) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(44, this.A);
        }
        if ((this.f126635e & 524288) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(45, this.B);
        }
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.C.get(i18));
        }
        int g17 = m20743x690e0f49 + g() + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = g17;
        return g17;
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
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126939y.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126635e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + n().hashCode();
        }
        if ((this.f126635e & 2) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + m().hashCode();
        }
        if ((this.f126635e & 4) != 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126638h);
        }
        if ((this.f126635e & 8) != 0) {
            hashCode = (((hashCode * 37) + 20) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126639i);
        }
        if ((this.f126635e & 16) != 0) {
            hashCode = (((hashCode * 37) + 27) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126640m);
        }
        int i18 = this.f126635e;
        if ((i18 & 32) != 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + this.f126641n;
        }
        if ((i18 & 64) != 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + l().hashCode();
        }
        if ((this.f126635e & 128) != 0) {
            hashCode = (((hashCode * 37) + 16) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126643p);
        }
        if ((this.f126635e & 256) != 0) {
            hashCode = (((hashCode * 37) + 17) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126644q);
        }
        if ((this.f126635e & 512) != 0) {
            hashCode = (((hashCode * 37) + 18) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126645r);
        }
        if ((this.f126635e & 1024) != 0) {
            hashCode = (((hashCode * 37) + 42) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126646s);
        }
        if ((this.f126635e & 2048) != 0) {
            hashCode = (((hashCode * 37) + 23) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126647t);
        }
        if ((this.f126635e & 4096) != 0) {
            hashCode = (((hashCode * 37) + 31) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126648u);
        }
        if ((this.f126635e & 8192) != 0) {
            hashCode = (((hashCode * 37) + 36) * 53) + o().hashCode();
        }
        if ((this.f126635e & 16384) != 0) {
            hashCode = (((hashCode * 37) + 37) * 53) + k().hashCode();
        }
        if (y()) {
            hashCode = (((hashCode * 37) + 39) * 53) + t().hashCode();
        }
        if (u()) {
            hashCode = (((hashCode * 37) + 40) * 53) + p().hashCode();
        }
        if (w()) {
            hashCode = (((hashCode * 37) + 41) * 53) + r().hashCode();
        }
        if (v()) {
            hashCode = (((hashCode * 37) + 44) * 53) + q().hashCode();
        }
        if (x()) {
            hashCode = (((hashCode * 37) + 45) * 53) + s().hashCode();
        }
        if (this.C.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.C.hashCode();
        }
        int m20581x10dda967 = (com.p176xb6135e39.p283xc50a8b8b.c.m20581x10dda967(hashCode, h()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126940z;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.g2.class, com.p176xb6135e39.p283xc50a8b8b.e2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.D;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.C.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.o3) this.C.get(i17)).mo20562xf582434a()) {
                this.D = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.D = (byte) 1;
            return true;
        }
        this.D = (byte) 0;
        return false;
    }

    public java.lang.String k() {
        java.lang.Object obj = this.f126650w;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126650w = r17;
        }
        return r17;
    }

    public java.lang.String l() {
        java.lang.Object obj = this.f126642o;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126642o = r17;
        }
        return r17;
    }

    public java.lang.String m() {
        java.lang.Object obj = this.f126637g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126637g = r17;
        }
        return r17;
    }

    public java.lang.String n() {
        java.lang.Object obj = this.f126636f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126636f = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return E.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.g2();
    }

    public java.lang.String o() {
        java.lang.Object obj = this.f126649v;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126649v = r17;
        }
        return r17;
    }

    public java.lang.String p() {
        java.lang.Object obj = this.f126652y;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126652y = r17;
        }
        return r17;
    }

    public java.lang.String q() {
        java.lang.Object obj = this.A;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.A = r17;
        }
        return r17;
    }

    public java.lang.String r() {
        java.lang.Object obj = this.f126653z;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126653z = r17;
        }
        return r17;
    }

    public java.lang.String s() {
        java.lang.Object obj = this.B;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.B = r17;
        }
        return r17;
    }

    public java.lang.String t() {
        java.lang.Object obj = this.f126651x;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126651x = r17;
        }
        return r17;
    }

    public boolean u() {
        return (this.f126635e & 65536) != 0;
    }

    public boolean v() {
        return (this.f126635e & 262144) != 0;
    }

    public boolean w() {
        return (this.f126635e & 131072) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t5 i17 = i();
        if ((this.f126635e & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f126636f);
        }
        if ((this.f126635e & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 8, this.f126637g);
        }
        if ((this.f126635e & 32) != 0) {
            k0Var.H(9, this.f126641n);
        }
        if ((this.f126635e & 4) != 0) {
            k0Var.x(10, this.f126638h);
        }
        if ((this.f126635e & 64) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 11, this.f126642o);
        }
        if ((this.f126635e & 128) != 0) {
            k0Var.x(16, this.f126643p);
        }
        if ((this.f126635e & 256) != 0) {
            k0Var.x(17, this.f126644q);
        }
        if ((this.f126635e & 512) != 0) {
            k0Var.x(18, this.f126645r);
        }
        if ((this.f126635e & 8) != 0) {
            k0Var.x(20, this.f126639i);
        }
        if ((this.f126635e & 2048) != 0) {
            k0Var.x(23, this.f126647t);
        }
        if ((this.f126635e & 16) != 0) {
            k0Var.x(27, this.f126640m);
        }
        if ((this.f126635e & 4096) != 0) {
            k0Var.x(31, this.f126648u);
        }
        if ((this.f126635e & 8192) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 36, this.f126649v);
        }
        if ((this.f126635e & 16384) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 37, this.f126650w);
        }
        if ((this.f126635e & 32768) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 39, this.f126651x);
        }
        if ((this.f126635e & 65536) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 40, this.f126652y);
        }
        if ((this.f126635e & 131072) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 41, this.f126653z);
        }
        if ((this.f126635e & 1024) != 0) {
            k0Var.x(42, this.f126646s);
        }
        if ((this.f126635e & 262144) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 44, this.A);
        }
        if ((this.f126635e & 524288) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 45, this.B);
        }
        for (int i18 = 0; i18 < this.C.size(); i18++) {
            k0Var.J(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.C.get(i18));
        }
        i17.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, k0Var);
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    public boolean x() {
        return (this.f126635e & 524288) != 0;
    }

    public boolean y() {
        return (this.f126635e & 32768) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.e2 mo20599xaaa148a0() {
        if (this == E) {
            return new com.p176xb6135e39.p283xc50a8b8b.e2(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.e2 e2Var = new com.p176xb6135e39.p283xc50a8b8b.e2(null);
        e2Var.l(this);
        return e2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return E;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return E.mo20599xaaa148a0();
    }

    public g2() {
        this.D = (byte) -1;
        this.f126636f = "";
        this.f126637g = "";
        this.f126641n = 1;
        this.f126642o = "";
        this.f126648u = true;
        this.f126649v = "";
        this.f126650w = "";
        this.f126651x = "";
        this.f126652y = "";
        this.f126653z = "";
        this.A = "";
        this.B = "";
        this.C = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.e2(r5Var, null);
    }
}
