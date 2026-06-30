package com.google.protobuf;

/* loaded from: classes16.dex */
public final class c1 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.c1 f44945h = new com.google.protobuf.c1();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f44946i = new com.google.protobuf.a1();

    /* renamed from: d, reason: collision with root package name */
    public int f44947d;

    /* renamed from: e, reason: collision with root package name */
    public int f44948e;

    /* renamed from: f, reason: collision with root package name */
    public int f44949f;

    /* renamed from: g, reason: collision with root package name */
    public byte f44950g;

    public c1(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f44950g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.c1)) {
            return super.equals(obj);
        }
        com.google.protobuf.c1 c1Var = (com.google.protobuf.c1) obj;
        int i17 = this.f44947d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = c1Var.f44947d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f44948e != c1Var.f44948e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f44949f == c1Var.f44949f) && this.unknownFields.equals(c1Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.b1 toBuilder() {
        if (this == f44945h) {
            return new com.google.protobuf.b1(null);
        }
        com.google.protobuf.b1 b1Var = new com.google.protobuf.b1(null);
        b1Var.e(this);
        return b1Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f44945h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f44947d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f44948e) : 0;
        if ((this.f44947d & 2) != 0) {
            k17 += com.google.protobuf.k0.k(2, this.f44949f);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45398q.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        int i18 = this.f44947d;
        if ((i18 & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f44948e;
        }
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f44949f;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45399r;
        j6Var.c(com.google.protobuf.c1.class, com.google.protobuf.b1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f44950g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f44950g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f44945h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.c1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f44947d & 1) != 0) {
            k0Var.H(1, this.f44948e);
        }
        if ((this.f44947d & 2) != 0) {
            k0Var.H(2, this.f44949f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f44945h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f44945h.toBuilder();
    }

    public c1() {
        this.f44950g = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.b1(r5Var, null);
    }
}
