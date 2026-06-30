package com.google.protobuf;

/* loaded from: classes16.dex */
public final class q2 extends com.google.protobuf.u5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.q2 f45439m = new com.google.protobuf.q2();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45440n = new com.google.protobuf.n2();

    /* renamed from: e, reason: collision with root package name */
    public int f45441e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45442f;

    /* renamed from: g, reason: collision with root package name */
    public int f45443g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45444h;

    /* renamed from: i, reason: collision with root package name */
    public byte f45445i;

    public q2(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45445i = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.q2)) {
            return super.equals(obj);
        }
        com.google.protobuf.q2 q2Var = (com.google.protobuf.q2) obj;
        int i17 = this.f45441e;
        boolean z17 = (i17 & 1) != 0;
        int i18 = q2Var.f45441e;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f45442f != q2Var.f45442f) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f45443g == q2Var.f45443g) && this.f45444h.equals(q2Var.f45444h) && this.unknownFields.equals(q2Var.unknownFields) && h().equals(q2Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45439m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f45441e & 1) != 0 ? com.google.protobuf.k0.b(33, this.f45442f) + 0 : 0;
        if ((this.f45441e & 2) != 0) {
            b17 += com.google.protobuf.k0.f(34, this.f45443g);
        }
        for (int i18 = 0; i18 < this.f45444h.size(); i18++) {
            b17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45444h.get(i18));
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
        int hashCode = com.google.protobuf.p3.M.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45441e & 1) != 0) {
            hashCode = (((hashCode * 37) + 33) * 53) + com.google.protobuf.w6.a(this.f45442f);
        }
        if ((this.f45441e & 2) != 0) {
            hashCode = (((hashCode * 37) + 34) * 53) + this.f45443g;
        }
        if (this.f45444h.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45444h.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.N;
        j6Var.c(com.google.protobuf.q2.class, com.google.protobuf.o2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45445i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45444h.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45444h.get(i17)).isInitialized()) {
                this.f45445i = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45445i = (byte) 1;
            return true;
        }
        this.f45445i = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o2 toBuilder() {
        if (this == f45439m) {
            return new com.google.protobuf.o2(null);
        }
        com.google.protobuf.o2 o2Var = new com.google.protobuf.o2(null);
        o2Var.l(this);
        return o2Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45439m.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.q2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45441e & 1) != 0) {
            k0Var.x(33, this.f45442f);
        }
        if ((this.f45441e & 2) != 0) {
            k0Var.H(34, this.f45443g);
        }
        for (int i18 = 0; i18 < this.f45444h.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45444h.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45439m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45439m.toBuilder();
    }

    public q2() {
        this.f45445i = (byte) -1;
        this.f45443g = 0;
        this.f45444h = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.o2(r5Var, null);
    }
}
