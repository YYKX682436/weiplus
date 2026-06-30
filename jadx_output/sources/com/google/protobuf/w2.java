package com.google.protobuf;

/* loaded from: classes16.dex */
public final class w2 extends com.google.protobuf.u5 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.w2 f45642g = new com.google.protobuf.w2();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45643h = new com.google.protobuf.u2();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f45644e;

    /* renamed from: f, reason: collision with root package name */
    public byte f45645f;

    public w2(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45645f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.w2)) {
            return super.equals(obj);
        }
        com.google.protobuf.w2 w2Var = (com.google.protobuf.w2) obj;
        return this.f45644e.equals(w2Var.f45644e) && this.unknownFields.equals(w2Var.unknownFields) && h().equals(w2Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45642g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45644e.size(); i19++) {
            i18 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45644e.get(i19));
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
        int hashCode = com.google.protobuf.p3.E.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f45644e.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45644e.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.F;
        j6Var.c(com.google.protobuf.w2.class, com.google.protobuf.v2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45645f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45644e.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45644e.get(i17)).isInitialized()) {
                this.f45645f = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45645f = (byte) 1;
            return true;
        }
        this.f45645f = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.v2 toBuilder() {
        if (this == f45642g) {
            return new com.google.protobuf.v2(null);
        }
        com.google.protobuf.v2 v2Var = new com.google.protobuf.v2(null);
        v2Var.l(this);
        return v2Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45642g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.w2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        for (int i18 = 0; i18 < this.f45644e.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45644e.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45642g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45642g.toBuilder();
    }

    public w2() {
        this.f45645f = (byte) -1;
        this.f45644e = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.v2(r5Var, null);
    }
}
