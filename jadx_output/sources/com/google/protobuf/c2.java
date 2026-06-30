package com.google.protobuf;

/* loaded from: classes16.dex */
public final class c2 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.protobuf.c2 f44951u = new com.google.protobuf.c2();

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.protobuf.e9 f44952v = new com.google.protobuf.a2();

    /* renamed from: d, reason: collision with root package name */
    public int f44953d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f44954e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f44955f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.g7 f44956g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t6 f44957h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t6 f44958i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f44959m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f44960n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f44961o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f44962p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.protobuf.g2 f44963q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.protobuf.i3 f44964r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.Object f44965s;

    /* renamed from: t, reason: collision with root package name */
    public byte f44966t;

    public c2(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f44966t = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.c2)) {
            return super.equals(obj);
        }
        com.google.protobuf.c2 c2Var = (com.google.protobuf.c2) obj;
        int i17 = this.f44953d;
        if (((i17 & 1) != 0) != ((c2Var.f44953d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !getName().equals(c2Var.getName())) {
            return false;
        }
        int i18 = this.f44953d;
        if (((i18 & 2) != 0) != ((c2Var.f44953d & 2) != 0)) {
            return false;
        }
        if ((((i18 & 2) != 0) && !g().equals(c2Var.g())) || !this.f44956g.equals(c2Var.f44956g)) {
            return false;
        }
        if (!((com.google.protobuf.m6) this.f44957h).equals(c2Var.f44957h)) {
            return false;
        }
        if (!((com.google.protobuf.m6) this.f44958i).equals(c2Var.f44958i) || !this.f44959m.equals(c2Var.f44959m) || !this.f44960n.equals(c2Var.f44960n) || !this.f44961o.equals(c2Var.f44961o) || !this.f44962p.equals(c2Var.f44962p) || j() != c2Var.j()) {
            return false;
        }
        if (j() && !f().equals(c2Var.f())) {
            return false;
        }
        int i19 = this.f44953d;
        if (((i19 & 8) != 0) != ((c2Var.f44953d & 8) != 0)) {
            return false;
        }
        if (((i19 & 8) != 0) && !h().equals(c2Var.h())) {
            return false;
        }
        int i27 = this.f44953d;
        if (((i27 & 16) != 0) != ((c2Var.f44953d & 16) != 0)) {
            return false;
        }
        return (!((i27 & 16) != 0) || i().equals(c2Var.i())) && this.unknownFields.equals(c2Var.unknownFields);
    }

    public com.google.protobuf.g2 f() {
        com.google.protobuf.g2 g2Var = this.f44963q;
        return g2Var == null ? com.google.protobuf.g2.E : g2Var;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f44955f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f44955f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f44951u;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f44954e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f44954e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.t6 t6Var;
        com.google.protobuf.t6 t6Var2;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        int computeStringSize = (this.f44953d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f44954e) + 0 : 0;
        if ((this.f44953d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f44955f);
        }
        int i19 = 0;
        for (int i27 = 0; i27 < this.f44956g.size(); i27++) {
            i19 += com.google.protobuf.l6.computeStringSizeNoTag(this.f44956g.J(i27));
        }
        int size = computeStringSize + i19 + (this.f44956g.size() * 1);
        for (int i28 = 0; i28 < this.f44959m.size(); i28++) {
            size += com.google.protobuf.k0.n(4, (com.google.protobuf.o8) this.f44959m.get(i28));
        }
        for (int i29 = 0; i29 < this.f44960n.size(); i29++) {
            size += com.google.protobuf.k0.n(5, (com.google.protobuf.o8) this.f44960n.get(i29));
        }
        for (int i37 = 0; i37 < this.f44961o.size(); i37++) {
            size += com.google.protobuf.k0.n(6, (com.google.protobuf.o8) this.f44961o.get(i37));
        }
        for (int i38 = 0; i38 < this.f44962p.size(); i38++) {
            size += com.google.protobuf.k0.n(7, (com.google.protobuf.o8) this.f44962p.get(i38));
        }
        if ((this.f44953d & 4) != 0) {
            size += com.google.protobuf.k0.n(8, f());
        }
        if ((this.f44953d & 8) != 0) {
            size += com.google.protobuf.k0.n(9, h());
        }
        int i39 = 0;
        int i47 = 0;
        while (true) {
            t6Var = this.f44957h;
            if (i39 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                break;
            }
            i47 += com.google.protobuf.k0.l(((com.google.protobuf.m6) t6Var).h(i39));
            i39++;
        }
        int i48 = size + i47 + (((com.google.protobuf.m6) t6Var).f45329f * 1);
        int i49 = 0;
        while (true) {
            t6Var2 = this.f44958i;
            if (i18 >= ((com.google.protobuf.m6) t6Var2).f45329f) {
                break;
            }
            i49 += com.google.protobuf.k0.l(((com.google.protobuf.m6) t6Var2).h(i18));
            i18++;
        }
        int i57 = i48 + i49 + (((com.google.protobuf.m6) t6Var2).f45329f * 1);
        if ((this.f44953d & 16) != 0) {
            i57 += com.google.protobuf.l6.computeStringSize(12, this.f44965s);
        }
        int serializedSize = i57 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public com.google.protobuf.i3 h() {
        com.google.protobuf.i3 i3Var = this.f44964r;
        return i3Var == null ? com.google.protobuf.i3.f45187f : i3Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45382a.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f44953d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if ((this.f44953d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + g().hashCode();
        }
        if (this.f44956g.size() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f44956g.hashCode();
        }
        com.google.protobuf.t6 t6Var = this.f44957h;
        if (((com.google.protobuf.m6) t6Var).f45329f > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + ((com.google.protobuf.m6) t6Var).hashCode();
        }
        com.google.protobuf.t6 t6Var2 = this.f44958i;
        if (((com.google.protobuf.m6) t6Var2).f45329f > 0) {
            hashCode = (((hashCode * 37) + 11) * 53) + ((com.google.protobuf.m6) t6Var2).hashCode();
        }
        if (this.f44959m.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f44959m.hashCode();
        }
        if (this.f44960n.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f44960n.hashCode();
        }
        if (this.f44961o.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f44961o.hashCode();
        }
        if (this.f44962p.size() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f44962p.hashCode();
        }
        if (j()) {
            hashCode = (((hashCode * 37) + 8) * 53) + f().hashCode();
        }
        if ((this.f44953d & 8) != 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + h().hashCode();
        }
        if ((this.f44953d & 16) != 0) {
            hashCode = (((hashCode * 37) + 12) * 53) + i().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f44965s;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f44965s = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45383b;
        j6Var.c(com.google.protobuf.c2.class, com.google.protobuf.b2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f44966t;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f44959m.size(); i17++) {
            if (!((com.google.protobuf.x0) this.f44959m.get(i17)).isInitialized()) {
                this.f44966t = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f44960n.size(); i18++) {
            if (!((com.google.protobuf.d1) this.f44960n.get(i18)).isInitialized()) {
                this.f44966t = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f44961o.size(); i19++) {
            if (!((com.google.protobuf.z2) this.f44961o.get(i19)).isInitialized()) {
                this.f44966t = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f44962p.size(); i27++) {
            if (!((com.google.protobuf.u1) this.f44962p.get(i27)).isInitialized()) {
                this.f44966t = (byte) 0;
                return false;
            }
        }
        if (!j() || f().isInitialized()) {
            this.f44966t = (byte) 1;
            return true;
        }
        this.f44966t = (byte) 0;
        return false;
    }

    public boolean j() {
        return (this.f44953d & 4) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.b2 toBuilder() {
        if (this == f44951u) {
            return new com.google.protobuf.b2(null);
        }
        com.google.protobuf.b2 b2Var = new com.google.protobuf.b2(null);
        b2Var.i(this);
        return b2Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f44951u.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.c2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f44953d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f44954e);
        }
        if ((this.f44953d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f44955f);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f44956g.size(); i18++) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f44956g.J(i18));
        }
        for (int i19 = 0; i19 < this.f44959m.size(); i19++) {
            k0Var.J(4, (com.google.protobuf.o8) this.f44959m.get(i19));
        }
        for (int i27 = 0; i27 < this.f44960n.size(); i27++) {
            k0Var.J(5, (com.google.protobuf.o8) this.f44960n.get(i27));
        }
        for (int i28 = 0; i28 < this.f44961o.size(); i28++) {
            k0Var.J(6, (com.google.protobuf.o8) this.f44961o.get(i28));
        }
        for (int i29 = 0; i29 < this.f44962p.size(); i29++) {
            k0Var.J(7, (com.google.protobuf.o8) this.f44962p.get(i29));
        }
        if ((this.f44953d & 4) != 0) {
            k0Var.J(8, f());
        }
        if ((this.f44953d & 8) != 0) {
            k0Var.J(9, h());
        }
        int i37 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var = this.f44957h;
            if (i37 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                break;
            }
            k0Var.H(10, ((com.google.protobuf.m6) t6Var).h(i37));
            i37++;
        }
        while (true) {
            com.google.protobuf.t6 t6Var2 = this.f44958i;
            if (i17 >= ((com.google.protobuf.m6) t6Var2).f45329f) {
                break;
            }
            k0Var.H(11, ((com.google.protobuf.m6) t6Var2).h(i17));
            i17++;
        }
        if ((this.f44953d & 16) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 12, this.f44965s);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f44951u;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f44951u.toBuilder();
    }

    public c2() {
        this.f44966t = (byte) -1;
        this.f44954e = "";
        this.f44955f = "";
        this.f44956g = com.google.protobuf.f7.f45086f;
        this.f44957h = com.google.protobuf.l6.emptyIntList();
        this.f44958i = com.google.protobuf.l6.emptyIntList();
        this.f44959m = java.util.Collections.emptyList();
        this.f44960n = java.util.Collections.emptyList();
        this.f44961o = java.util.Collections.emptyList();
        this.f44962p = java.util.Collections.emptyList();
        this.f44965s = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.b2(r5Var, null);
    }
}
