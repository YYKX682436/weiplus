package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class x0 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: s, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.x0 f127186s = new com.p176xb6135e39.p283xc50a8b8b.x0();

    /* renamed from: t, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f127187t = new com.p176xb6135e39.p283xc50a8b8b.p0();

    /* renamed from: d, reason: collision with root package name */
    public int f127188d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f127189e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f127190f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f127191g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f127192h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f127193i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f127194m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f127195n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.j2 f127196o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f127197p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f127198q;

    /* renamed from: r, reason: collision with root package name */
    public byte f127199r;

    public x0(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f127199r = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.x0)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.x0 x0Var = (com.p176xb6135e39.p283xc50a8b8b.x0) obj;
        int i17 = this.f127188d;
        if (((i17 & 1) != 0) != ((x0Var.f127188d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || m20945xfb82e301().equals(x0Var.m20945xfb82e301())) && this.f127190f.equals(x0Var.f127190f) && this.f127191g.equals(x0Var.f127191g) && this.f127192h.equals(x0Var.f127192h) && this.f127193i.equals(x0Var.f127193i) && this.f127194m.equals(x0Var.f127194m) && this.f127195n.equals(x0Var.f127195n) && h() == x0Var.h()) {
            return (!h() || g().mo20583xb2c87fbf(x0Var.g())) && this.f127197p.equals(x0Var.f127197p) && this.f127198q.equals(x0Var.f127198q) && this.f7874x4f0c37a3.m20941xb2c87fbf(x0Var.f7874x4f0c37a3);
        }
        return false;
    }

    public int f() {
        return this.f127195n.size();
    }

    public com.p176xb6135e39.p283xc50a8b8b.j2 g() {
        com.p176xb6135e39.p283xc50a8b8b.j2 j2Var = this.f127196o;
        return j2Var == null ? com.p176xb6135e39.p283xc50a8b8b.j2.f126756o : j2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f127186s;
    }

    /* renamed from: getName */
    public java.lang.String m20945xfb82e301() {
        java.lang.Object obj = this.f127189e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f127189e = r17;
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
        int m20743x690e0f49 = (this.f127188d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f127189e) + 0 : 0;
        for (int i18 = 0; i18 < this.f127190f.size(); i18++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127190f.get(i18));
        }
        for (int i19 = 0; i19 < this.f127192h.size(); i19++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(3, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127192h.get(i19));
        }
        for (int i27 = 0; i27 < this.f127193i.size(); i27++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127193i.get(i27));
        }
        for (int i28 = 0; i28 < this.f127194m.size(); i28++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(5, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127194m.get(i28));
        }
        for (int i29 = 0; i29 < this.f127191g.size(); i29++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127191g.get(i29));
        }
        if ((this.f127188d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(7, g());
        }
        for (int i37 = 0; i37 < this.f127195n.size(); i37++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(8, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127195n.get(i37));
        }
        for (int i38 = 0; i38 < this.f127197p.size(); i38++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(9, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127197p.get(i38));
        }
        int i39 = 0;
        for (int i47 = 0; i47 < this.f127198q.size(); i47++) {
            i39 += com.p176xb6135e39.p283xc50a8b8b.l6.m20744x2973fc50(this.f127198q.J(i47));
        }
        int size = m20743x690e0f49 + i39 + (this.f127198q.size() * 1) + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = size;
        return size;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public boolean h() {
        return (this.f127188d & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126917c.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f127188d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20945xfb82e301().hashCode();
        }
        if (this.f127190f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f127190f.hashCode();
        }
        if (this.f127191g.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f127191g.hashCode();
        }
        if (this.f127192h.size() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f127192h.hashCode();
        }
        if (this.f127193i.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f127193i.hashCode();
        }
        if (this.f127194m.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f127194m.hashCode();
        }
        if (f() > 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + this.f127195n.hashCode();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 7) * 53) + g().mo20587x8cdac1b();
        }
        if (this.f127197p.size() > 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + this.f127197p.hashCode();
        }
        if (this.f127198q.size() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + this.f127198q.hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.q0 mo20599xaaa148a0() {
        if (this == f127186s) {
            return new com.p176xb6135e39.p283xc50a8b8b.q0(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.q0 q0Var = new com.p176xb6135e39.p283xc50a8b8b.q0(null);
        q0Var.l(this);
        return q0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126918d;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.x0.class, com.p176xb6135e39.p283xc50a8b8b.q0.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f127199r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f127190f.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.u1) this.f127190f.get(i17)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f127191g.size(); i18++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.u1) this.f127191g.get(i18)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f127192h.size(); i19++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.x0) this.f127192h.get(i19)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f127193i.size(); i27++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.d1) this.f127193i.get(i27)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        for (int i28 = 0; i28 < this.f127194m.size(); i28++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.t0) this.f127194m.get(i28)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        for (int i29 = 0; i29 < f(); i29++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.t2) this.f127195n.get(i29)).mo20562xf582434a()) {
                this.f127199r = (byte) 0;
                return false;
            }
        }
        if (!h() || g().mo20562xf582434a()) {
            this.f127199r = (byte) 1;
            return true;
        }
        this.f127199r = (byte) 0;
        return false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f127186s.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.x0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f127188d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f127189e);
        }
        for (int i17 = 0; i17 < this.f127190f.size(); i17++) {
            k0Var.J(2, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127190f.get(i17));
        }
        for (int i18 = 0; i18 < this.f127192h.size(); i18++) {
            k0Var.J(3, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127192h.get(i18));
        }
        for (int i19 = 0; i19 < this.f127193i.size(); i19++) {
            k0Var.J(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127193i.get(i19));
        }
        for (int i27 = 0; i27 < this.f127194m.size(); i27++) {
            k0Var.J(5, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127194m.get(i27));
        }
        for (int i28 = 0; i28 < this.f127191g.size(); i28++) {
            k0Var.J(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127191g.get(i28));
        }
        if ((this.f127188d & 2) != 0) {
            k0Var.J(7, g());
        }
        for (int i29 = 0; i29 < this.f127195n.size(); i29++) {
            k0Var.J(8, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127195n.get(i29));
        }
        for (int i37 = 0; i37 < this.f127197p.size(); i37++) {
            k0Var.J(9, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f127197p.get(i37));
        }
        for (int i38 = 0; i38 < this.f127198q.size(); i38++) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 10, this.f127198q.J(i38));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f127186s;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f127186s.mo20599xaaa148a0();
    }

    public x0() {
        this.f127199r = (byte) -1;
        this.f127189e = "";
        this.f127190f = java.util.Collections.emptyList();
        this.f127191g = java.util.Collections.emptyList();
        this.f127192h = java.util.Collections.emptyList();
        this.f127193i = java.util.Collections.emptyList();
        this.f127194m = java.util.Collections.emptyList();
        this.f127195n = java.util.Collections.emptyList();
        this.f127197p = java.util.Collections.emptyList();
        this.f127198q = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.q0(r5Var, null);
    }
}
