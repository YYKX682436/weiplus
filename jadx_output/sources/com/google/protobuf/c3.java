package com.google.protobuf;

/* loaded from: classes16.dex */
public final class c3 extends com.google.protobuf.u5 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.c3 f44967i = new com.google.protobuf.c3();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f44968m = new com.google.protobuf.a3();

    /* renamed from: e, reason: collision with root package name */
    public int f44969e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44970f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f44971g;

    /* renamed from: h, reason: collision with root package name */
    public byte f44972h;

    public c3(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f44972h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.c3)) {
            return super.equals(obj);
        }
        com.google.protobuf.c3 c3Var = (com.google.protobuf.c3) obj;
        int i17 = this.f44969e;
        if (((i17 & 1) != 0) != ((c3Var.f44969e & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || this.f44970f == c3Var.f44970f) && this.f44971g.equals(c3Var.f44971g) && this.unknownFields.equals(c3Var.unknownFields) && h().equals(c3Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f44967i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f44969e & 1) != 0 ? com.google.protobuf.k0.b(33, this.f44970f) + 0 : 0;
        for (int i18 = 0; i18 < this.f44971g.size(); i18++) {
            b17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f44971g.get(i18));
        }
        int g17 = b17 + g() + this.unknownFields.getSerializedSize();
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
        int hashCode = com.google.protobuf.p3.K.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f44969e & 1) != 0) {
            hashCode = (((hashCode * 37) + 33) * 53) + com.google.protobuf.w6.a(this.f44970f);
        }
        if (this.f44971g.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f44971g.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.L;
        j6Var.c(com.google.protobuf.c3.class, com.google.protobuf.b3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f44972h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f44971g.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f44971g.get(i17)).isInitialized()) {
                this.f44972h = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f44972h = (byte) 1;
            return true;
        }
        this.f44972h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.b3 toBuilder() {
        if (this == f44967i) {
            return new com.google.protobuf.b3(null);
        }
        com.google.protobuf.b3 b3Var = new com.google.protobuf.b3(null);
        b3Var.l(this);
        return b3Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f44967i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.c3();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f44969e & 1) != 0) {
            k0Var.x(33, this.f44970f);
        }
        for (int i18 = 0; i18 < this.f44971g.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f44971g.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f44967i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f44967i.toBuilder();
    }

    public c3() {
        this.f44972h = (byte) -1;
        this.f44971g = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.b3(r5Var, null);
    }
}
