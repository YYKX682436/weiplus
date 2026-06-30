package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class j2 extends com.p176xb6135e39.p283xc50a8b8b.u5 {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.j2 f126756o = new com.p176xb6135e39.p283xc50a8b8b.j2();

    /* renamed from: p, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126757p = new com.p176xb6135e39.p283xc50a8b8b.h2();

    /* renamed from: e, reason: collision with root package name */
    public int f126758e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126759f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f126760g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126761h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f126762i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f126763m;

    /* renamed from: n, reason: collision with root package name */
    public byte f126764n;

    public j2(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(s5Var);
        this.f126764n = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.j2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var = (com.p176xb6135e39.p283xc50a8b8b.j2) obj;
        int i17 = this.f126758e;
        boolean z17 = (i17 & 1) != 0;
        int i18 = j2Var.f126758e;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f126759f != j2Var.f126759f) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if (((i17 & 2) != 0) && this.f126760g != j2Var.f126760g) {
            return false;
        }
        if (((i17 & 4) != 0) != ((i18 & 4) != 0)) {
            return false;
        }
        if (((i17 & 4) != 0) && this.f126761h != j2Var.f126761h) {
            return false;
        }
        if (((i17 & 8) != 0) != ((i18 & 8) != 0)) {
            return false;
        }
        return (!((i17 & 8) != 0) || this.f126762i == j2Var.f126762i) && this.f126763m.equals(j2Var.f126763m) && this.f7874x4f0c37a3.m20941xb2c87fbf(j2Var.f7874x4f0c37a3) && h().equals(j2Var.h());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126756o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f126758e & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.k0.b(1, this.f126759f) + 0 : 0;
        if ((this.f126758e & 2) != 0) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(2, this.f126760g);
        }
        if ((this.f126758e & 4) != 0) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(3, this.f126761h);
        }
        if ((this.f126758e & 8) != 0) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.b(7, this.f126762i);
        }
        for (int i18 = 0; i18 < this.f126763m.size(); i18++) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126763m.get(i18));
        }
        int g17 = b17 + g() + this.f7874x4f0c37a3.mo20593x9d9c349b();
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
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.A.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126758e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126759f);
        }
        if ((this.f126758e & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126760g);
        }
        if ((this.f126758e & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126761h);
        }
        if ((this.f126758e & 8) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126762i);
        }
        if (this.f126763m.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f126763m.hashCode();
        }
        int m20581x10dda967 = (com.p176xb6135e39.p283xc50a8b8b.c.m20581x10dda967(hashCode, h()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.B;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.j2.class, com.p176xb6135e39.p283xc50a8b8b.i2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126764n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126763m.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.o3) this.f126763m.get(i17)).mo20562xf582434a()) {
                this.f126764n = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f126764n = (byte) 1;
            return true;
        }
        this.f126764n = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.i2 mo20599xaaa148a0() {
        if (this == f126756o) {
            return new com.p176xb6135e39.p283xc50a8b8b.i2(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.i2 i2Var = new com.p176xb6135e39.p283xc50a8b8b.i2(null);
        i2Var.l(this);
        return i2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126756o.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.j2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t5 i17 = i();
        if ((this.f126758e & 1) != 0) {
            k0Var.x(1, this.f126759f);
        }
        if ((this.f126758e & 2) != 0) {
            k0Var.x(2, this.f126760g);
        }
        if ((this.f126758e & 4) != 0) {
            k0Var.x(3, this.f126761h);
        }
        if ((this.f126758e & 8) != 0) {
            k0Var.x(7, this.f126762i);
        }
        for (int i18 = 0; i18 < this.f126763m.size(); i18++) {
            k0Var.J(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126763m.get(i18));
        }
        i17.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, k0Var);
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126756o;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126756o.mo20599xaaa148a0();
    }

    public j2() {
        this.f126764n = (byte) -1;
        this.f126763m = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.i2(r5Var, null);
    }
}
