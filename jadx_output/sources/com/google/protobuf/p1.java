package com.google.protobuf;

/* loaded from: classes16.dex */
public final class p1 extends com.google.protobuf.u5 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.p1 f45372g = new com.google.protobuf.p1();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45373h = new com.google.protobuf.n1();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f45374e;

    /* renamed from: f, reason: collision with root package name */
    public byte f45375f;

    public p1(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45375f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.p1)) {
            return super.equals(obj);
        }
        com.google.protobuf.p1 p1Var = (com.google.protobuf.p1) obj;
        return this.f45374e.equals(p1Var.f45374e) && this.unknownFields.equals(p1Var.unknownFields) && h().equals(p1Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45372g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45374e.size(); i19++) {
            i18 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45374e.get(i19));
        }
        int g17 = i18 + g() + this.unknownFields.getSerializedSize();
        this.memoizedSize = g17;
        return g17;
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
        int hashCode = com.google.protobuf.p3.f45390i.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f45374e.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45374e.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45391j;
        j6Var.c(com.google.protobuf.p1.class, com.google.protobuf.o1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45375f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45374e.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45374e.get(i17)).isInitialized()) {
                this.f45375f = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45375f = (byte) 1;
            return true;
        }
        this.f45375f = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o1 toBuilder() {
        if (this == f45372g) {
            return new com.google.protobuf.o1(null);
        }
        com.google.protobuf.o1 o1Var = new com.google.protobuf.o1(null);
        o1Var.l(this);
        return o1Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45372g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.p1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        for (int i18 = 0; i18 < this.f45374e.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45374e.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45372g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45372g.toBuilder();
    }

    public p1() {
        this.f45375f = (byte) -1;
        this.f45374e = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.o1(r5Var, null);
    }
}
