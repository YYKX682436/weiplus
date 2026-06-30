package com.google.protobuf;

/* loaded from: classes16.dex */
public final class m2 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.protobuf.m2 f45314o = new com.google.protobuf.m2();

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45315p = new com.google.protobuf.k2();

    /* renamed from: d, reason: collision with root package name */
    public int f45316d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45317e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f45318f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f45319g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.q2 f45320h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45321i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45322m;

    /* renamed from: n, reason: collision with root package name */
    public byte f45323n;

    public m2(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45323n = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.m2)) {
            return super.equals(obj);
        }
        com.google.protobuf.m2 m2Var = (com.google.protobuf.m2) obj;
        int i17 = this.f45316d;
        if (((i17 & 1) != 0) != ((m2Var.f45316d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !getName().equals(m2Var.getName())) {
            return false;
        }
        int i18 = this.f45316d;
        if (((i18 & 2) != 0) != ((m2Var.f45316d & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && !f().equals(m2Var.f())) {
            return false;
        }
        int i19 = this.f45316d;
        if (((i19 & 4) != 0) != ((m2Var.f45316d & 4) != 0)) {
            return false;
        }
        if ((((i19 & 4) != 0) && !h().equals(m2Var.h())) || i() != m2Var.i()) {
            return false;
        }
        if (i() && !g().equals(m2Var.g())) {
            return false;
        }
        int i27 = this.f45316d;
        boolean z17 = (i27 & 16) != 0;
        int i28 = m2Var.f45316d;
        if (z17 != ((i28 & 16) != 0)) {
            return false;
        }
        if (((i27 & 16) != 0) && this.f45321i != m2Var.f45321i) {
            return false;
        }
        if (((i27 & 32) != 0) != ((i28 & 32) != 0)) {
            return false;
        }
        return (!((i27 & 32) != 0) || this.f45322m == m2Var.f45322m) && this.unknownFields.equals(m2Var.unknownFields);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f45318f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45318f = r17;
        }
        return r17;
    }

    public com.google.protobuf.q2 g() {
        com.google.protobuf.q2 q2Var = this.f45320h;
        return q2Var == null ? com.google.protobuf.q2.f45439m : q2Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45314o;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45317e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45317e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45316d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f45317e) : 0;
        if ((this.f45316d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f45318f);
        }
        if ((this.f45316d & 4) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(3, this.f45319g);
        }
        if ((this.f45316d & 8) != 0) {
            computeStringSize += com.google.protobuf.k0.n(4, g());
        }
        if ((this.f45316d & 16) != 0) {
            computeStringSize += com.google.protobuf.k0.b(5, this.f45321i);
        }
        if ((this.f45316d & 32) != 0) {
            computeStringSize += com.google.protobuf.k0.b(6, this.f45322m);
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
        java.lang.Object obj = this.f45319g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45319g = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45404w.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45316d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if ((this.f45316d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        if ((this.f45316d & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (i()) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
        }
        if ((this.f45316d & 16) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.w6.a(this.f45321i);
        }
        if ((this.f45316d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + com.google.protobuf.w6.a(this.f45322m);
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public boolean i() {
        return (this.f45316d & 8) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45405x;
        j6Var.c(com.google.protobuf.m2.class, com.google.protobuf.l2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45323n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!i() || g().isInitialized()) {
            this.f45323n = (byte) 1;
            return true;
        }
        this.f45323n = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.l2 toBuilder() {
        if (this == f45314o) {
            return new com.google.protobuf.l2(null);
        }
        com.google.protobuf.l2 l2Var = new com.google.protobuf.l2(null);
        l2Var.e(this);
        return l2Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45314o.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.m2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45316d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45317e);
        }
        if ((this.f45316d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f45318f);
        }
        if ((this.f45316d & 4) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f45319g);
        }
        if ((this.f45316d & 8) != 0) {
            k0Var.J(4, g());
        }
        if ((this.f45316d & 16) != 0) {
            k0Var.x(5, this.f45321i);
        }
        if ((this.f45316d & 32) != 0) {
            k0Var.x(6, this.f45322m);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45314o;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45314o.toBuilder();
    }

    public m2() {
        this.f45323n = (byte) -1;
        this.f45317e = "";
        this.f45318f = "";
        this.f45319g = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.l2(r5Var, null);
    }
}
