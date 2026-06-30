package com.google.protobuf;

/* loaded from: classes16.dex */
public final class w0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.w0 f45627h = new com.google.protobuf.w0();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45628i = new com.google.protobuf.u0();

    /* renamed from: d, reason: collision with root package name */
    public int f45629d;

    /* renamed from: e, reason: collision with root package name */
    public int f45630e;

    /* renamed from: f, reason: collision with root package name */
    public int f45631f;

    /* renamed from: g, reason: collision with root package name */
    public byte f45632g;

    public w0(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45632g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.w0)) {
            return super.equals(obj);
        }
        com.google.protobuf.w0 w0Var = (com.google.protobuf.w0) obj;
        int i17 = this.f45629d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = w0Var.f45629d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f45630e != w0Var.f45630e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f45631f == w0Var.f45631f) && this.unknownFields.equals(w0Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.v0 toBuilder() {
        if (this == f45627h) {
            return new com.google.protobuf.v0(null);
        }
        com.google.protobuf.v0 v0Var = new com.google.protobuf.v0(null);
        v0Var.e(this);
        return v0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45627h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f45629d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f45630e) : 0;
        if ((this.f45629d & 2) != 0) {
            k17 += com.google.protobuf.k0.k(2, this.f45631f);
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
        int hashCode = com.google.protobuf.p3.f45388g.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        int i18 = this.f45629d;
        if ((i18 & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f45630e;
        }
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45631f;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45389h;
        j6Var.c(com.google.protobuf.w0.class, com.google.protobuf.v0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45632g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f45632g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45627h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.w0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45629d & 1) != 0) {
            k0Var.H(1, this.f45630e);
        }
        if ((this.f45629d & 2) != 0) {
            k0Var.H(2, this.f45631f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45627h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45627h.toBuilder();
    }

    public w0() {
        this.f45632g = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.v0(r5Var, null);
    }
}
