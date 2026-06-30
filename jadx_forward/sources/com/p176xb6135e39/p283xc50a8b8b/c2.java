package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class c2 extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.c2 f126484u = new com.p176xb6135e39.p283xc50a8b8b.c2();

    /* renamed from: v, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.e9 f126485v = new com.p176xb6135e39.p283xc50a8b8b.a2();

    /* renamed from: d, reason: collision with root package name */
    public int f126486d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f126487e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f126488f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g7 f126489g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126490h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.t6 f126491i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f126492m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f126493n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f126494o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f126495p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.g2 f126496q;

    /* renamed from: r, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.i3 f126497r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.Object f126498s;

    /* renamed from: t, reason: collision with root package name */
    public byte f126499t;

    public c2(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, com.p176xb6135e39.p283xc50a8b8b.o0 o0Var) {
        super(q5Var);
        this.f126499t = (byte) -1;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.p176xb6135e39.p283xc50a8b8b.c2)) {
            return super.mo20583xb2c87fbf(obj);
        }
        com.p176xb6135e39.p283xc50a8b8b.c2 c2Var = (com.p176xb6135e39.p283xc50a8b8b.c2) obj;
        int i17 = this.f126486d;
        if (((i17 & 1) != 0) != ((c2Var.f126486d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !m20602xfb82e301().equals(c2Var.m20602xfb82e301())) {
            return false;
        }
        int i18 = this.f126486d;
        if (((i18 & 2) != 0) != ((c2Var.f126486d & 2) != 0)) {
            return false;
        }
        if ((((i18 & 2) != 0) && !g().equals(c2Var.g())) || !this.f126489g.equals(c2Var.f126489g)) {
            return false;
        }
        if (!((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126490h).equals(c2Var.f126490h)) {
            return false;
        }
        if (!((com.p176xb6135e39.p283xc50a8b8b.m6) this.f126491i).equals(c2Var.f126491i) || !this.f126492m.equals(c2Var.f126492m) || !this.f126493n.equals(c2Var.f126493n) || !this.f126494o.equals(c2Var.f126494o) || !this.f126495p.equals(c2Var.f126495p) || j() != c2Var.j()) {
            return false;
        }
        if (j() && !f().mo20583xb2c87fbf(c2Var.f())) {
            return false;
        }
        int i19 = this.f126486d;
        if (((i19 & 8) != 0) != ((c2Var.f126486d & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && !h().mo20583xb2c87fbf(c2Var.h())) {
            return false;
        }
        int i27 = this.f126486d;
        if (((i27 & 16) != 0) != ((c2Var.f126486d & 16) != 0)) {
            return false;
        }
        return (!((i27 & 16) != 0) || i().equals(c2Var.i())) && this.f7874x4f0c37a3.m20941xb2c87fbf(c2Var.f7874x4f0c37a3);
    }

    public com.p176xb6135e39.p283xc50a8b8b.g2 f() {
        com.p176xb6135e39.p283xc50a8b8b.g2 g2Var = this.f126496q;
        return g2Var == null ? com.p176xb6135e39.p283xc50a8b8b.g2.E : g2Var;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f126488f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126488f = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return f126484u;
    }

    /* renamed from: getName */
    public java.lang.String m20602xfb82e301() {
        java.lang.Object obj = this.f126487e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126487e = r17;
        }
        return r17;
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
        int m20743x690e0f49 = (this.f126486d & 1) != 0 ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f126487e) + 0 : 0;
        if ((this.f126486d & 2) != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f126488f);
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f126489g.size(); i27++) {
            i19 += com.p176xb6135e39.p283xc50a8b8b.l6.m20744x2973fc50(this.f126489g.J(i27));
        }
        int size = m20743x690e0f49 + i19 + (this.f126489g.size() * 1);
        for (int i28 = 0; i28 < this.f126492m.size(); i28++) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126492m.get(i28));
        }
        for (int i29 = 0; i29 < this.f126493n.size(); i29++) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(5, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126493n.get(i29));
        }
        for (int i37 = 0; i37 < this.f126494o.size(); i37++) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126494o.get(i37));
        }
        for (int i38 = 0; i38 < this.f126495p.size(); i38++) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(7, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126495p.get(i38));
        }
        if ((this.f126486d & 4) != 0) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(8, f());
        }
        if ((this.f126486d & 8) != 0) {
            size += com.p176xb6135e39.p283xc50a8b8b.k0.n(9, h());
        }
        int i39 = 0;
        int i47 = 0;
        while (true) {
            t6Var = this.f126490h;
            if (i39 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                break;
            }
            i47 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i39));
            i39++;
        }
        int i48 = size + i47 + (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f * 1);
        int i49 = 0;
        while (true) {
            t6Var2 = this.f126491i;
            if (i18 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f) {
                break;
            }
            i49 += com.p176xb6135e39.p283xc50a8b8b.k0.l(((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).h(i18));
            i18++;
        }
        int i57 = i48 + i49 + (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f * 1);
        if ((this.f126486d & 16) != 0) {
            i57 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(12, this.f126498s);
        }
        int mo20593x9d9c349b = i57 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    public com.p176xb6135e39.p283xc50a8b8b.i3 h() {
        com.p176xb6135e39.p283xc50a8b8b.i3 i3Var = this.f126497r;
        return i3Var == null ? com.p176xb6135e39.p283xc50a8b8b.i3.f126720f : i3Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.p176xb6135e39.p283xc50a8b8b.p3.f126915a.hashCode() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de;
        if ((this.f126486d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + m20602xfb82e301().hashCode();
        }
        if ((this.f126486d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        if (this.f126489g.size() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f126489g.hashCode();
        }
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f126490h;
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).hashCode();
        }
        com.p176xb6135e39.p283xc50a8b8b.t6 t6Var2 = this.f126491i;
        if (((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f > 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).hashCode();
        }
        if (this.f126492m.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f126492m.hashCode();
        }
        if (this.f126493n.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f126493n.hashCode();
        }
        if (this.f126494o.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f126494o.hashCode();
        }
        if (this.f126495p.size() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f126495p.hashCode();
        }
        if (j()) {
            hashCode = (((hashCode * 37) + 8) * 53) + f().mo20587x8cdac1b();
        }
        if ((this.f126486d & 8) != 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + h().mo20587x8cdac1b();
        }
        if ((this.f126486d & 16) != 0) {
            hashCode = (((hashCode * 37) + 12) * 53) + i().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f126498s;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f126498s = r17;
        }
        return r17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = com.p176xb6135e39.p283xc50a8b8b.p3.f126916b;
        j6Var.c(com.p176xb6135e39.p283xc50a8b8b.c2.class, com.p176xb6135e39.p283xc50a8b8b.b2.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f126499t;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f126492m.size(); i17++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.x0) this.f126492m.get(i17)).mo20562xf582434a()) {
                this.f126499t = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f126493n.size(); i18++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.d1) this.f126493n.get(i18)).mo20562xf582434a()) {
                this.f126499t = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f126494o.size(); i19++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.z2) this.f126494o.get(i19)).mo20562xf582434a()) {
                this.f126499t = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f126495p.size(); i27++) {
            if (!((com.p176xb6135e39.p283xc50a8b8b.u1) this.f126495p.get(i27)).mo20562xf582434a()) {
                this.f126499t = (byte) 0;
                return false;
            }
        }
        if (!j() || f().mo20562xf582434a()) {
            this.f126499t = (byte) 1;
            return true;
        }
        this.f126499t = (byte) 0;
        return false;
    }

    public boolean j() {
        return (this.f126486d & 4) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.b2 mo20599xaaa148a0() {
        if (this == f126484u) {
            return new com.p176xb6135e39.p283xc50a8b8b.b2(null);
        }
        com.p176xb6135e39.p283xc50a8b8b.b2 b2Var = new com.p176xb6135e39.p283xc50a8b8b.b2(null);
        b2Var.i(this);
        return b2Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20596xab31548() {
        return f126484u.mo20599xaaa148a0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.c2();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if ((this.f126486d & 1) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f126487e);
        }
        if ((this.f126486d & 2) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f126488f);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f126489g.size(); i18++) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 3, this.f126489g.J(i18));
        }
        for (int i19 = 0; i19 < this.f126492m.size(); i19++) {
            k0Var.J(4, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126492m.get(i19));
        }
        for (int i27 = 0; i27 < this.f126493n.size(); i27++) {
            k0Var.J(5, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126493n.get(i27));
        }
        for (int i28 = 0; i28 < this.f126494o.size(); i28++) {
            k0Var.J(6, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126494o.get(i28));
        }
        for (int i29 = 0; i29 < this.f126495p.size(); i29++) {
            k0Var.J(7, (com.p176xb6135e39.p283xc50a8b8b.o8) this.f126495p.get(i29));
        }
        if ((this.f126486d & 4) != 0) {
            k0Var.J(8, f());
        }
        if ((this.f126486d & 8) != 0) {
            k0Var.J(9, h());
        }
        int i37 = 0;
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var = this.f126490h;
            if (i37 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).f126862f) {
                break;
            }
            k0Var.H(10, ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var).h(i37));
            i37++;
        }
        while (true) {
            com.p176xb6135e39.p283xc50a8b8b.t6 t6Var2 = this.f126491i;
            if (i17 >= ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).f126862f) {
                break;
            }
            k0Var.H(11, ((com.p176xb6135e39.p283xc50a8b8b.m6) t6Var2).h(i17));
            i17++;
        }
        if ((this.f126486d & 16) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 12, this.f126498s);
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return f126484u;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.n8 mo20596xab31548() {
        return f126484u.mo20599xaaa148a0();
    }

    public c2() {
        this.f126499t = (byte) -1;
        this.f126487e = "";
        this.f126488f = "";
        this.f126489g = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f126490h = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126491i = com.p176xb6135e39.p283xc50a8b8b.l6.m20748x6eeb1f20();
        this.f126492m = java.util.Collections.emptyList();
        this.f126493n = java.util.Collections.emptyList();
        this.f126494o = java.util.Collections.emptyList();
        this.f126495p = java.util.Collections.emptyList();
        this.f126498s = "";
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new com.p176xb6135e39.p283xc50a8b8b.b2(r5Var, null);
    }
}
