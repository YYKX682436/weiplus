package com.google.protobuf;

/* loaded from: classes16.dex */
public final class j2 extends com.google.protobuf.u5 {

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.protobuf.j2 f45223o = new com.google.protobuf.j2();

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45224p = new com.google.protobuf.h2();

    /* renamed from: e, reason: collision with root package name */
    public int f45225e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45226f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45227g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45228h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45229i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f45230m;

    /* renamed from: n, reason: collision with root package name */
    public byte f45231n;

    public j2(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45231n = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.j2)) {
            return super.equals(obj);
        }
        com.google.protobuf.j2 j2Var = (com.google.protobuf.j2) obj;
        int i17 = this.f45225e;
        boolean z17 = (i17 & 1) != 0;
        int i18 = j2Var.f45225e;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f45226f != j2Var.f45226f) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        if (((i17 & 2) != 0) && this.f45227g != j2Var.f45227g) {
            return false;
        }
        if (((i17 & 4) != 0) != ((i18 & 4) != 0)) {
            return false;
        }
        if (((i17 & 4) != 0) && this.f45228h != j2Var.f45228h) {
            return false;
        }
        if (((i17 & 8) != 0) != ((i18 & 8) != 0)) {
            return false;
        }
        return (!((i17 & 8) != 0) || this.f45229i == j2Var.f45229i) && this.f45230m.equals(j2Var.f45230m) && this.unknownFields.equals(j2Var.unknownFields) && h().equals(j2Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45223o;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f45225e & 1) != 0 ? com.google.protobuf.k0.b(1, this.f45226f) + 0 : 0;
        if ((this.f45225e & 2) != 0) {
            b17 += com.google.protobuf.k0.b(2, this.f45227g);
        }
        if ((this.f45225e & 4) != 0) {
            b17 += com.google.protobuf.k0.b(3, this.f45228h);
        }
        if ((this.f45225e & 8) != 0) {
            b17 += com.google.protobuf.k0.b(7, this.f45229i);
        }
        for (int i18 = 0; i18 < this.f45230m.size(); i18++) {
            b17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45230m.get(i18));
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
        int hashCode = com.google.protobuf.p3.A.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45225e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.a(this.f45226f);
        }
        if ((this.f45225e & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f45227g);
        }
        if ((this.f45225e & 4) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.w6.a(this.f45228h);
        }
        if ((this.f45225e & 8) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + com.google.protobuf.w6.a(this.f45229i);
        }
        if (this.f45230m.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45230m.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.B;
        j6Var.c(com.google.protobuf.j2.class, com.google.protobuf.i2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45231n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45230m.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45230m.get(i17)).isInitialized()) {
                this.f45231n = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45231n = (byte) 1;
            return true;
        }
        this.f45231n = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.i2 toBuilder() {
        if (this == f45223o) {
            return new com.google.protobuf.i2(null);
        }
        com.google.protobuf.i2 i2Var = new com.google.protobuf.i2(null);
        i2Var.l(this);
        return i2Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45223o.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.j2();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45225e & 1) != 0) {
            k0Var.x(1, this.f45226f);
        }
        if ((this.f45225e & 2) != 0) {
            k0Var.x(2, this.f45227g);
        }
        if ((this.f45225e & 4) != 0) {
            k0Var.x(3, this.f45228h);
        }
        if ((this.f45225e & 8) != 0) {
            k0Var.x(7, this.f45229i);
        }
        for (int i18 = 0; i18 < this.f45230m.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45230m.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45223o;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45223o.toBuilder();
    }

    public j2() {
        this.f45231n = (byte) -1;
        this.f45230m = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.i2(r5Var, null);
    }
}
