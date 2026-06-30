package com.google.protobuf;

/* loaded from: classes16.dex */
public final class z2 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.z2 f45769i = new com.google.protobuf.z2();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45770m = new com.google.protobuf.x2();

    /* renamed from: d, reason: collision with root package name */
    public int f45771d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f45772e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45773f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.c3 f45774g;

    /* renamed from: h, reason: collision with root package name */
    public byte f45775h;

    public z2(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45775h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.z2)) {
            return super.equals(obj);
        }
        com.google.protobuf.z2 z2Var = (com.google.protobuf.z2) obj;
        int i17 = this.f45771d;
        if (((i17 & 1) != 0) != ((z2Var.f45771d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || getName().equals(z2Var.getName())) && this.f45773f.equals(z2Var.f45773f) && g() == z2Var.g()) {
            return (!g() || f().equals(z2Var.f())) && this.unknownFields.equals(z2Var.unknownFields);
        }
        return false;
    }

    public com.google.protobuf.c3 f() {
        com.google.protobuf.c3 c3Var = this.f45774g;
        return c3Var == null ? com.google.protobuf.c3.f44967i : c3Var;
    }

    public boolean g() {
        return (this.f45771d & 2) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45769i;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f45772e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45772e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f45771d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f45772e) + 0 : 0;
        for (int i18 = 0; i18 < this.f45773f.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f45773f.get(i18));
        }
        if ((this.f45771d & 2) != 0) {
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
    public com.google.protobuf.y2 toBuilder() {
        if (this == f45769i) {
            return new com.google.protobuf.y2(null);
        }
        com.google.protobuf.y2 y2Var = new com.google.protobuf.y2(null);
        y2Var.f(this);
        return y2Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45402u.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45771d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (this.f45773f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45773f.hashCode();
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
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45403v;
        j6Var.c(com.google.protobuf.z2.class, com.google.protobuf.y2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45775h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45773f.size(); i17++) {
            if (!((com.google.protobuf.m2) this.f45773f.get(i17)).isInitialized()) {
                this.f45775h = (byte) 0;
                return false;
            }
        }
        if (!g() || f().isInitialized()) {
            this.f45775h = (byte) 1;
            return true;
        }
        this.f45775h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45769i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.z2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f45771d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f45772e);
        }
        for (int i17 = 0; i17 < this.f45773f.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f45773f.get(i17));
        }
        if ((this.f45771d & 2) != 0) {
            k0Var.J(3, f());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45769i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45769i.toBuilder();
    }

    public z2() {
        this.f45775h = (byte) -1;
        this.f45772e = "";
        this.f45773f = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.y2(r5Var, null);
    }
}
