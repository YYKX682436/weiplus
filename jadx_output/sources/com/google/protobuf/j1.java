package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j1 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.j1 f45216i = new com.google.protobuf.j1();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45217m = new com.google.protobuf.h1();

    /* renamed from: d, reason: collision with root package name */
    public int f45218d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45219e;

    /* renamed from: f, reason: collision with root package name */
    public int f45220f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.m1 f45221g;

    /* renamed from: h, reason: collision with root package name */
    public byte f45222h;

    public j1(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45222h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.j1)) {
            return super.equals(obj);
        }
        com.google.protobuf.j1 j1Var = (com.google.protobuf.j1) obj;
        int i17 = this.f45218d;
        if (((i17 & 1) != 0) != ((j1Var.f45218d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !getName().equals(j1Var.getName())) {
            return false;
        }
        int i18 = this.f45218d;
        if (((i18 & 2) != 0) != ((j1Var.f45218d & 2) != 0)) {
            return false;
        }
        if ((!((i18 & 2) != 0) || this.f45220f == j1Var.f45220f) && g() == j1Var.g()) {
            return (!g() || f().equals(j1Var.f())) && this.unknownFields.equals(j1Var.unknownFields);
        }
        return false;
    }

    public com.google.protobuf.m1 f() {
        com.google.protobuf.m1 m1Var = this.f45221g;
        return m1Var == null ? com.google.protobuf.m1.f45308i : m1Var;
    }

    public boolean g() {
        return (this.f45218d & 4) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45216i;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45219e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45219e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45218d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f45219e) : 0;
        if ((this.f45218d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.k(2, this.f45220f);
        }
        if ((this.f45218d & 4) != 0) {
            computeStringSize += com.google.protobuf.k0.n(3, f());
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.i1 toBuilder() {
        if (this == f45216i) {
            return new com.google.protobuf.i1(null);
        }
        com.google.protobuf.i1 i1Var = new com.google.protobuf.i1(null);
        i1Var.e(this);
        return i1Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45400s.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45218d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if ((this.f45218d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45220f;
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45401t;
        j6Var.c(com.google.protobuf.j1.class, com.google.protobuf.i1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45222h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g() || f().isInitialized()) {
            this.f45222h = (byte) 1;
            return true;
        }
        this.f45222h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45216i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.j1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45218d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45219e);
        }
        if ((this.f45218d & 2) != 0) {
            k0Var.H(2, this.f45220f);
        }
        if ((this.f45218d & 4) != 0) {
            k0Var.J(3, f());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45216i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45216i.toBuilder();
    }

    public j1() {
        this.f45222h = (byte) -1;
        this.f45219e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.i1(r5Var, null);
    }
}
