package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class c3 extends com.p176xb6135e39.p283xc50a8b8b.u5 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.c3 f126500i = new com.p176xb6135e39.p283xc50a8b8b.c3();

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126501m = new com.p176xb6135e39.p283xc50a8b8b.a3();

    /* renamed from: e, reason: collision with root package name */
    public int f126502e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f126503f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f126504g;

    /* renamed from: h, reason: collision with root package name */
    public byte f126505h;

    public c3(com.p176xb6135e39.p283xc50a8b8b.s5 s5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(s5Var);
        this.f126505h = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.c3)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.c3 c3Var = (com.p176xb6135e39.p283xc50a8b8b.c3) obj;
        int i17 = this.f126502e;
        if (((i17 & 1) != 0) != ((c3Var.f126502e & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || this.f126503f == c3Var.f126503f) && this.f126504g.equals(c3Var.f126504g) && this.f7874x4f0c37a3.m20941xb2c87fbf(c3Var.f7874x4f0c37a3) && h().equals(c3Var.h());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126500i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f126502e & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.k0.b(33, this.f126503f) + 0 : 0;
        for (int i18 = 0; i18 < this.f126504g.size(); i18++) {
            b17 += com.p176xb6135e39.p283xc50a8b8b.k0.n(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126504g.get(i18));
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
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.K.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126502e & 1) != 0) {
            hashCode = (((hashCode * 37) + 33) * 53) + com.p176xb6135e39.p283xc50a8b8b.w6.a(this.f126503f);
        }
        if (this.f126504g.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f126504g.hashCode();
        }
        int m20581x10dda967 = (com.p176xb6135e39.p283xc50a8b8b.c.m20581x10dda967(hashCode, h()) * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20581x10dda967;
        return m20581x10dda967;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.L;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.c3.class, com.p176xb6135e39.p283xc50a8b8b.b3.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126505h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126504g.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.o3) this.f126504g.get(i17)).mo20562xf582434a()) {
                this.f126505h = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f126505h = (byte) 1;
            return true;
        }
        this.f126505h = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.b3 mo20599xaaa148a0() {
        if (this == f126500i) {
            return new com.p176xb6135e39.p283xc50a8b8b.b3(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.b3 b3Var = new com.p176xb6135e39.p283xc50a8b8b.b3(null);
        b3Var.l(this);
        return b3Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126500i.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.c3();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t5 i17 = i();
        if ((this.f126502e & 1) != 0) {
            k0Var.x(33, this.f126503f);
        }
        for (int i18 = 0; i18 < this.f126504g.size(); i18++) {
            k0Var.J(999, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126504g.get(i18));
        }
        i17.a(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965, k0Var);
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126500i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126500i.mo20599xaaa148a0();
    }

    public c3() {
        this.f126505h = (byte) -1;
        this.f126504g = java.util.Collections.emptyList();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.b3(r5Var, null);
    }
}
