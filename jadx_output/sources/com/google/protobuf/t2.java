package com.google.protobuf;

/* loaded from: classes16.dex */
public final class t2 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.t2 f45534h = new com.google.protobuf.t2();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45535i = new com.google.protobuf.r2();

    /* renamed from: d, reason: collision with root package name */
    public int f45536d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45537e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.w2 f45538f;

    /* renamed from: g, reason: collision with root package name */
    public byte f45539g;

    public t2(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45539g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.t2)) {
            return super.equals(obj);
        }
        com.google.protobuf.t2 t2Var = (com.google.protobuf.t2) obj;
        int i17 = this.f45536d;
        if (((i17 & 1) != 0) != ((t2Var.f45536d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || getName().equals(t2Var.getName())) && g() == t2Var.g()) {
            return (!g() || f().equals(t2Var.f())) && this.unknownFields.equals(t2Var.unknownFields);
        }
        return false;
    }

    public com.google.protobuf.w2 f() {
        com.google.protobuf.w2 w2Var = this.f45538f;
        return w2Var == null ? com.google.protobuf.w2.f45642g : w2Var;
    }

    public boolean g() {
        return (this.f45536d & 2) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45534h;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45537e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45537e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45536d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f45537e) : 0;
        if ((this.f45536d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.n(2, f());
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
    public com.google.protobuf.s2 toBuilder() {
        if (this == f45534h) {
            return new com.google.protobuf.s2(null);
        }
        com.google.protobuf.s2 s2Var = new com.google.protobuf.s2(null);
        s2Var.e(this);
        return s2Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45394m.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45536d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45395n;
        j6Var.c(com.google.protobuf.t2.class, com.google.protobuf.s2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45539g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g() || f().isInitialized()) {
            this.f45539g = (byte) 1;
            return true;
        }
        this.f45539g = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45534h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.t2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45536d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45537e);
        }
        if ((this.f45536d & 2) != 0) {
            k0Var.J(2, f());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45534h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45534h.toBuilder();
    }

    public t2() {
        this.f45539g = (byte) -1;
        this.f45537e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.s2(r5Var, null);
    }
}
