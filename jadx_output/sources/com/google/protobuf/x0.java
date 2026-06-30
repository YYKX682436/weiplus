package com.google.protobuf;

/* loaded from: classes16.dex */
public final class x0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.protobuf.x0 f45653s = new com.google.protobuf.x0();

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45654t = new com.google.protobuf.p0();

    /* renamed from: d, reason: collision with root package name */
    public int f45655d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45656e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45657f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f45658g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45659h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f45660i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f45661m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f45662n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.protobuf.j2 f45663o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f45664p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.protobuf.g7 f45665q;

    /* renamed from: r, reason: collision with root package name */
    public byte f45666r;

    public x0(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45666r = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.x0)) {
            return super.equals(obj);
        }
        com.google.protobuf.x0 x0Var = (com.google.protobuf.x0) obj;
        int i17 = this.f45655d;
        if (((i17 & 1) != 0) != ((x0Var.f45655d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || getName().equals(x0Var.getName())) && this.f45657f.equals(x0Var.f45657f) && this.f45658g.equals(x0Var.f45658g) && this.f45659h.equals(x0Var.f45659h) && this.f45660i.equals(x0Var.f45660i) && this.f45661m.equals(x0Var.f45661m) && this.f45662n.equals(x0Var.f45662n) && h() == x0Var.h()) {
            return (!h() || g().equals(x0Var.g())) && this.f45664p.equals(x0Var.f45664p) && this.f45665q.equals(x0Var.f45665q) && this.unknownFields.equals(x0Var.unknownFields);
        }
        return false;
    }

    public int f() {
        return this.f45662n.size();
    }

    public com.google.protobuf.j2 g() {
        com.google.protobuf.j2 j2Var = this.f45663o;
        return j2Var == null ? com.google.protobuf.j2.f45223o : j2Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45653s;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45656e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45656e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45655d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f45656e) + 0 : 0;
        for (int i18 = 0; i18 < this.f45657f.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f45657f.get(i18));
        }
        for (int i19 = 0; i19 < this.f45659h.size(); i19++) {
            computeStringSize += com.google.protobuf.k0.n(3, (com.google.protobuf.o8) this.f45659h.get(i19));
        }
        for (int i27 = 0; i27 < this.f45660i.size(); i27++) {
            computeStringSize += com.google.protobuf.k0.n(4, (com.google.protobuf.o8) this.f45660i.get(i27));
        }
        for (int i28 = 0; i28 < this.f45661m.size(); i28++) {
            computeStringSize += com.google.protobuf.k0.n(5, (com.google.protobuf.o8) this.f45661m.get(i28));
        }
        for (int i29 = 0; i29 < this.f45658g.size(); i29++) {
            computeStringSize += com.google.protobuf.k0.n(6, (com.google.protobuf.o8) this.f45658g.get(i29));
        }
        if ((this.f45655d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.n(7, g());
        }
        for (int i37 = 0; i37 < this.f45662n.size(); i37++) {
            computeStringSize += com.google.protobuf.k0.n(8, (com.google.protobuf.o8) this.f45662n.get(i37));
        }
        for (int i38 = 0; i38 < this.f45664p.size(); i38++) {
            computeStringSize += com.google.protobuf.k0.n(9, (com.google.protobuf.o8) this.f45664p.get(i38));
        }
        int i39 = 0;
        for (int i47 = 0; i47 < this.f45665q.size(); i47++) {
            i39 += com.google.protobuf.l6.computeStringSizeNoTag(this.f45665q.J(i47));
        }
        int size = computeStringSize + i39 + (this.f45665q.size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return (this.f45655d & 2) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45384c.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45655d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (this.f45657f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45657f.hashCode();
        }
        if (this.f45658g.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f45658g.hashCode();
        }
        if (this.f45659h.size() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f45659h.hashCode();
        }
        if (this.f45660i.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f45660i.hashCode();
        }
        if (this.f45661m.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f45661m.hashCode();
        }
        if (f() > 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + this.f45662n.hashCode();
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 7) * 53) + g().hashCode();
        }
        if (this.f45664p.size() > 0) {
            hashCode = (((hashCode * 37) + 9) * 53) + this.f45664p.hashCode();
        }
        if (this.f45665q.size() > 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + this.f45665q.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.q0 toBuilder() {
        if (this == f45653s) {
            return new com.google.protobuf.q0(null);
        }
        com.google.protobuf.q0 q0Var = new com.google.protobuf.q0(null);
        q0Var.l(this);
        return q0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45385d;
        j6Var.c(com.google.protobuf.x0.class, com.google.protobuf.q0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45666r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45657f.size(); i17++) {
            if (!((com.google.protobuf.u1) this.f45657f.get(i17)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < this.f45658g.size(); i18++) {
            if (!((com.google.protobuf.u1) this.f45658g.get(i18)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < this.f45659h.size(); i19++) {
            if (!((com.google.protobuf.x0) this.f45659h.get(i19)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < this.f45660i.size(); i27++) {
            if (!((com.google.protobuf.d1) this.f45660i.get(i27)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        for (int i28 = 0; i28 < this.f45661m.size(); i28++) {
            if (!((com.google.protobuf.t0) this.f45661m.get(i28)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        for (int i29 = 0; i29 < f(); i29++) {
            if (!((com.google.protobuf.t2) this.f45662n.get(i29)).isInitialized()) {
                this.f45666r = (byte) 0;
                return false;
            }
        }
        if (!h() || g().isInitialized()) {
            this.f45666r = (byte) 1;
            return true;
        }
        this.f45666r = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45653s.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.x0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45655d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45656e);
        }
        for (int i17 = 0; i17 < this.f45657f.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f45657f.get(i17));
        }
        for (int i18 = 0; i18 < this.f45659h.size(); i18++) {
            k0Var.J(3, (com.google.protobuf.o8) this.f45659h.get(i18));
        }
        for (int i19 = 0; i19 < this.f45660i.size(); i19++) {
            k0Var.J(4, (com.google.protobuf.o8) this.f45660i.get(i19));
        }
        for (int i27 = 0; i27 < this.f45661m.size(); i27++) {
            k0Var.J(5, (com.google.protobuf.o8) this.f45661m.get(i27));
        }
        for (int i28 = 0; i28 < this.f45658g.size(); i28++) {
            k0Var.J(6, (com.google.protobuf.o8) this.f45658g.get(i28));
        }
        if ((this.f45655d & 2) != 0) {
            k0Var.J(7, g());
        }
        for (int i29 = 0; i29 < this.f45662n.size(); i29++) {
            k0Var.J(8, (com.google.protobuf.o8) this.f45662n.get(i29));
        }
        for (int i37 = 0; i37 < this.f45664p.size(); i37++) {
            k0Var.J(9, (com.google.protobuf.o8) this.f45664p.get(i37));
        }
        for (int i38 = 0; i38 < this.f45665q.size(); i38++) {
            com.google.protobuf.l6.writeString(k0Var, 10, this.f45665q.J(i38));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45653s;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45653s.toBuilder();
    }

    public x0() {
        this.f45666r = (byte) -1;
        this.f45656e = "";
        this.f45657f = java.util.Collections.emptyList();
        this.f45658g = java.util.Collections.emptyList();
        this.f45659h = java.util.Collections.emptyList();
        this.f45660i = java.util.Collections.emptyList();
        this.f45661m = java.util.Collections.emptyList();
        this.f45662n = java.util.Collections.emptyList();
        this.f45664p = java.util.Collections.emptyList();
        this.f45665q = com.google.protobuf.f7.f45086f;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.q0(r5Var, null);
    }
}
