package com.google.protobuf;

/* loaded from: classes16.dex */
public final class t0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.t0 f45507i = new com.google.protobuf.t0();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45508m = new com.google.protobuf.r0();

    /* renamed from: d, reason: collision with root package name */
    public int f45509d;

    /* renamed from: e, reason: collision with root package name */
    public int f45510e;

    /* renamed from: f, reason: collision with root package name */
    public int f45511f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p1 f45512g;

    /* renamed from: h, reason: collision with root package name */
    public byte f45513h;

    public t0(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45513h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.t0)) {
            return super.equals(obj);
        }
        com.google.protobuf.t0 t0Var = (com.google.protobuf.t0) obj;
        int i17 = this.f45509d;
        boolean z17 = (i17 & 1) != 0;
        int i18 = t0Var.f45509d;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f45510e != t0Var.f45510e) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if ((!((i17 & 2) != 0) || this.f45511f == t0Var.f45511f) && g() == t0Var.g()) {
            return (!g() || f().equals(t0Var.f())) && this.unknownFields.equals(t0Var.unknownFields);
        }
        return false;
    }

    public com.google.protobuf.p1 f() {
        com.google.protobuf.p1 p1Var = this.f45512g;
        return p1Var == null ? com.google.protobuf.p1.f45372g : p1Var;
    }

    public boolean g() {
        return (this.f45509d & 4) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45507i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f45509d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f45510e) : 0;
        if ((this.f45509d & 2) != 0) {
            k17 += com.google.protobuf.k0.k(2, this.f45511f);
        }
        if ((this.f45509d & 4) != 0) {
            k17 += com.google.protobuf.k0.n(3, f());
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.s0 toBuilder() {
        if (this == f45507i) {
            return new com.google.protobuf.s0(null);
        }
        com.google.protobuf.s0 s0Var = new com.google.protobuf.s0(null);
        s0Var.e(this);
        return s0Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45386e.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        int i18 = this.f45509d;
        if ((i18 & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f45510e;
        }
        if ((i18 & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45511f;
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
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45387f;
        j6Var.c(com.google.protobuf.t0.class, com.google.protobuf.s0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45513h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g() || f().isInitialized()) {
            this.f45513h = (byte) 1;
            return true;
        }
        this.f45513h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45507i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.t0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45509d & 1) != 0) {
            k0Var.H(1, this.f45510e);
        }
        if ((this.f45509d & 2) != 0) {
            k0Var.H(2, this.f45511f);
        }
        if ((this.f45509d & 4) != 0) {
            k0Var.J(3, f());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45507i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45507i.toBuilder();
    }

    public t0() {
        this.f45513h = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.s0(r5Var, null);
    }
}
