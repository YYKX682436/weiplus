package com.google.protobuf;

/* loaded from: classes16.dex */
public final class n3 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.n3 f45332h = new com.google.protobuf.n3();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45333i = new com.google.protobuf.l3();

    /* renamed from: d, reason: collision with root package name */
    public int f45334d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45335e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45336f;

    /* renamed from: g, reason: collision with root package name */
    public byte f45337g;

    public n3(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45337g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.n3)) {
            return super.equals(obj);
        }
        com.google.protobuf.n3 n3Var = (com.google.protobuf.n3) obj;
        if (h() != n3Var.h()) {
            return false;
        }
        if ((!h() || f().equals(n3Var.f())) && g() == n3Var.g()) {
            return (!g() || this.f45336f == n3Var.f45336f) && this.unknownFields.equals(n3Var.unknownFields);
        }
        return false;
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f45335e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45335e = r17;
        }
        return r17;
    }

    public boolean g() {
        return (this.f45334d & 2) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45332h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45334d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f45335e) : 0;
        if ((this.f45334d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.b(2, this.f45336f);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return (this.f45334d & 1) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.google.protobuf.p3.Q.hashCode();
        if (h()) {
            hashCode = (((hashCode * 37) + 1) * 53) + f().hashCode();
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f45336f);
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.m3 toBuilder() {
        if (this == f45332h) {
            return new com.google.protobuf.m3(null);
        }
        com.google.protobuf.m3 m3Var = new com.google.protobuf.m3(null);
        m3Var.e(this);
        return m3Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.R;
        j6Var.c(com.google.protobuf.n3.class, com.google.protobuf.m3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45337g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!h()) {
            this.f45337g = (byte) 0;
            return false;
        }
        if (g()) {
            this.f45337g = (byte) 1;
            return true;
        }
        this.f45337g = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45332h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.n3();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45334d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45335e);
        }
        if ((this.f45334d & 2) != 0) {
            k0Var.x(2, this.f45336f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45332h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45332h.toBuilder();
    }

    public n3() {
        this.f45337g = (byte) -1;
        this.f45335e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.m3(r5Var, null);
    }
}
