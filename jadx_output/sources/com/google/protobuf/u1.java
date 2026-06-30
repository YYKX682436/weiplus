package com.google.protobuf;

/* loaded from: classes16.dex */
public final class u1 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.protobuf.u1 f45559t = new com.google.protobuf.u1();

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45560u = new com.google.protobuf.q1();

    /* renamed from: d, reason: collision with root package name */
    public int f45561d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45562e;

    /* renamed from: f, reason: collision with root package name */
    public int f45563f;

    /* renamed from: g, reason: collision with root package name */
    public int f45564g;

    /* renamed from: h, reason: collision with root package name */
    public int f45565h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f45566i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f45567m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Object f45568n;

    /* renamed from: o, reason: collision with root package name */
    public int f45569o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.lang.Object f45570p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.protobuf.z1 f45571q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45572r;

    /* renamed from: s, reason: collision with root package name */
    public byte f45573s;

    public u1(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45573s = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.u1)) {
            return super.equals(obj);
        }
        com.google.protobuf.u1 u1Var = (com.google.protobuf.u1) obj;
        int i17 = this.f45561d;
        if (((i17 & 1) != 0) != ((u1Var.f45561d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !getName().equals(u1Var.getName())) {
            return false;
        }
        int i18 = this.f45561d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = u1Var.f45561d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f45563f != u1Var.f45563f) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        if ((((i18 & 4) != 0) && this.f45564g != u1Var.f45564g) || p() != u1Var.p()) {
            return false;
        }
        if ((p() && this.f45565h != u1Var.f45565h) || q() != u1Var.q()) {
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
        if ((n() && this.f45569o != u1Var.f45569o) || m() != u1Var.m()) {
            return false;
        }
        if ((m() && !h().equals(u1Var.h())) || o() != u1Var.o()) {
            return false;
        }
        if (o() && !i().equals(u1Var.i())) {
            return false;
        }
        int i27 = this.f45561d;
        if (((i27 & 1024) != 0) != ((u1Var.f45561d & 1024) != 0)) {
            return false;
        }
        return (!((i27 & 1024) != 0) || this.f45572r == u1Var.f45572r) && this.unknownFields.equals(u1Var.unknownFields);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f45568n;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45568n = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f45567m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45567m = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45559t;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45562e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45562e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45561d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f45562e) : 0;
        if ((this.f45561d & 32) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f45567m);
        }
        if ((this.f45561d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.k(3, this.f45563f);
        }
        if ((this.f45561d & 4) != 0) {
            computeStringSize += com.google.protobuf.k0.f(4, this.f45564g);
        }
        if ((this.f45561d & 8) != 0) {
            computeStringSize += com.google.protobuf.k0.f(5, this.f45565h);
        }
        if ((this.f45561d & 16) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(6, this.f45566i);
        }
        if ((this.f45561d & 64) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(7, this.f45568n);
        }
        if ((this.f45561d & 512) != 0) {
            computeStringSize += com.google.protobuf.k0.n(8, i());
        }
        if ((this.f45561d & 128) != 0) {
            computeStringSize += com.google.protobuf.k0.k(9, this.f45569o);
        }
        if ((this.f45561d & 256) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(10, this.f45570p);
        }
        if ((this.f45561d & 1024) != 0) {
            computeStringSize += com.google.protobuf.k0.b(17, this.f45572r);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f45570p;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45570p = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45392k.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45561d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        int i18 = this.f45561d;
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f45563f;
        }
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f45564g;
        }
        if (p()) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f45565h;
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
            hashCode = (((hashCode * 37) + 9) * 53) + this.f45569o;
        }
        if (m()) {
            hashCode = (((hashCode * 37) + 10) * 53) + h().hashCode();
        }
        if (o()) {
            hashCode = (((hashCode * 37) + 8) * 53) + i().hashCode();
        }
        if ((this.f45561d & 1024) != 0) {
            hashCode = (((hashCode * 37) + 17) * 53) + com.google.protobuf.w6.a(this.f45572r);
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public com.google.protobuf.z1 i() {
        com.google.protobuf.z1 z1Var = this.f45571q;
        return z1Var == null ? com.google.protobuf.z1.f45758q : z1Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45393l;
        j6Var.c(com.google.protobuf.u1.class, com.google.protobuf.r1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45573s;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!o() || i().isInitialized()) {
            this.f45573s = (byte) 1;
            return true;
        }
        this.f45573s = (byte) 0;
        return false;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f45566i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45566i = r17;
        }
        return r17;
    }

    public boolean k() {
        return (this.f45561d & 64) != 0;
    }

    public boolean l() {
        return (this.f45561d & 32) != 0;
    }

    public boolean m() {
        return (this.f45561d & 256) != 0;
    }

    public boolean n() {
        return (this.f45561d & 128) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45559t.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.u1();
    }

    public boolean o() {
        return (this.f45561d & 512) != 0;
    }

    public boolean p() {
        return (this.f45561d & 8) != 0;
    }

    public boolean q() {
        return (this.f45561d & 16) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.r1 toBuilder() {
        if (this == f45559t) {
            return new com.google.protobuf.r1(null);
        }
        com.google.protobuf.r1 r1Var = new com.google.protobuf.r1(null);
        r1Var.e(this);
        return r1Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45561d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45562e);
        }
        if ((this.f45561d & 32) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f45567m);
        }
        if ((this.f45561d & 2) != 0) {
            k0Var.H(3, this.f45563f);
        }
        if ((this.f45561d & 4) != 0) {
            k0Var.H(4, this.f45564g);
        }
        if ((this.f45561d & 8) != 0) {
            k0Var.H(5, this.f45565h);
        }
        if ((this.f45561d & 16) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 6, this.f45566i);
        }
        if ((this.f45561d & 64) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 7, this.f45568n);
        }
        if ((this.f45561d & 512) != 0) {
            k0Var.J(8, i());
        }
        if ((this.f45561d & 128) != 0) {
            k0Var.H(9, this.f45569o);
        }
        if ((this.f45561d & 256) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 10, this.f45570p);
        }
        if ((this.f45561d & 1024) != 0) {
            k0Var.x(17, this.f45572r);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45559t;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45559t.toBuilder();
    }

    public u1() {
        this.f45573s = (byte) -1;
        this.f45562e = "";
        this.f45564g = 1;
        this.f45565h = 1;
        this.f45566i = "";
        this.f45567m = "";
        this.f45568n = "";
        this.f45570p = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.r1(r5Var, null);
    }
}
