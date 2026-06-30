package com.google.protobuf;

/* loaded from: classes16.dex */
public final class i3 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.i3 f45187f = new com.google.protobuf.i3();

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45188g = new com.google.protobuf.d3();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f45189d;

    /* renamed from: e, reason: collision with root package name */
    public byte f45190e;

    public i3(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45190e = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.i3)) {
            return super.equals(obj);
        }
        com.google.protobuf.i3 i3Var = (com.google.protobuf.i3) obj;
        return this.f45189d.equals(i3Var.f45189d) && this.unknownFields.equals(i3Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.e3 toBuilder() {
        if (this == f45187f) {
            return new com.google.protobuf.e3(null);
        }
        com.google.protobuf.e3 e3Var = new com.google.protobuf.e3(null);
        e3Var.f(this);
        return e3Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45187f;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45189d.size(); i19++) {
            i18 += com.google.protobuf.k0.n(1, (com.google.protobuf.o8) this.f45189d.get(i19));
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
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
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.google.protobuf.p3.S.hashCode();
        if (this.f45189d.size() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f45189d.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.T;
        j6Var.c(com.google.protobuf.i3.class, com.google.protobuf.e3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45190e;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f45190e = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45187f.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.i3();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        for (int i17 = 0; i17 < this.f45189d.size(); i17++) {
            k0Var.J(1, (com.google.protobuf.o8) this.f45189d.get(i17));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45187f;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45187f.toBuilder();
    }

    public i3() {
        this.f45190e = (byte) -1;
        this.f45189d = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.e3(r5Var, null);
    }
}
