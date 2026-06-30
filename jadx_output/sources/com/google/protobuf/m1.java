package com.google.protobuf;

/* loaded from: classes16.dex */
public final class m1 extends com.google.protobuf.u5 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.m1 f45308i = new com.google.protobuf.m1();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45309m = new com.google.protobuf.k1();

    /* renamed from: e, reason: collision with root package name */
    public int f45310e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45311f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f45312g;

    /* renamed from: h, reason: collision with root package name */
    public byte f45313h;

    public m1(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45313h = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.m1)) {
            return super.equals(obj);
        }
        com.google.protobuf.m1 m1Var = (com.google.protobuf.m1) obj;
        int i17 = this.f45310e;
        if (((i17 & 1) != 0) != ((m1Var.f45310e & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || this.f45311f == m1Var.f45311f) && this.f45312g.equals(m1Var.f45312g) && this.unknownFields.equals(m1Var.unknownFields) && h().equals(m1Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45308i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f45310e & 1) != 0 ? com.google.protobuf.k0.b(1, this.f45311f) + 0 : 0;
        for (int i18 = 0; i18 < this.f45312g.size(); i18++) {
            b17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45312g.get(i18));
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
        int hashCode = com.google.protobuf.p3.I.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45310e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.a(this.f45311f);
        }
        if (this.f45312g.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45312g.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45381J;
        j6Var.c(com.google.protobuf.m1.class, com.google.protobuf.l1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45313h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45312g.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45312g.get(i17)).isInitialized()) {
                this.f45313h = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45313h = (byte) 1;
            return true;
        }
        this.f45313h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.l1 toBuilder() {
        if (this == f45308i) {
            return new com.google.protobuf.l1(null);
        }
        com.google.protobuf.l1 l1Var = new com.google.protobuf.l1(null);
        l1Var.l(this);
        return l1Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45308i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.m1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45310e & 1) != 0) {
            k0Var.x(1, this.f45311f);
        }
        for (int i18 = 0; i18 < this.f45312g.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45312g.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45308i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45308i.toBuilder();
    }

    public m1() {
        this.f45313h = (byte) -1;
        this.f45312g = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.l1(r5Var, null);
    }
}
