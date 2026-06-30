package com.google.protobuf;

/* loaded from: classes16.dex */
public final class g1 extends com.google.protobuf.u5 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.g1 f45095m = new com.google.protobuf.g1();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45096n = new com.google.protobuf.e1();

    /* renamed from: e, reason: collision with root package name */
    public int f45097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45098f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45099g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45100h;

    /* renamed from: i, reason: collision with root package name */
    public byte f45101i;

    public g1(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45101i = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.g1)) {
            return super.equals(obj);
        }
        com.google.protobuf.g1 g1Var = (com.google.protobuf.g1) obj;
        int i17 = this.f45097e;
        boolean z17 = (i17 & 1) != 0;
        int i18 = g1Var.f45097e;
        if (z17 != ((i18 & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && this.f45098f != g1Var.f45098f) {
            return false;
        }
        if (((i17 & 2) != 0) != ((i18 & 2) != 0)) {
            return false;
        }
        return (!((i17 & 2) != 0) || this.f45099g == g1Var.f45099g) && this.f45100h.equals(g1Var.f45100h) && this.unknownFields.equals(g1Var.unknownFields) && h().equals(g1Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45095m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f45097e & 1) != 0 ? com.google.protobuf.k0.b(2, this.f45098f) + 0 : 0;
        if ((2 & this.f45097e) != 0) {
            b17 += com.google.protobuf.k0.b(3, this.f45099g);
        }
        for (int i18 = 0; i18 < this.f45100h.size(); i18++) {
            b17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45100h.get(i18));
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
        int hashCode = com.google.protobuf.p3.G.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45097e & 1) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f45098f);
        }
        if ((this.f45097e & 2) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.w6.a(this.f45099g);
        }
        if (this.f45100h.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45100h.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.H;
        j6Var.c(com.google.protobuf.g1.class, com.google.protobuf.f1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45101i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45100h.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45100h.get(i17)).isInitialized()) {
                this.f45101i = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45101i = (byte) 1;
            return true;
        }
        this.f45101i = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.f1 toBuilder() {
        if (this == f45095m) {
            return new com.google.protobuf.f1(null);
        }
        com.google.protobuf.f1 f1Var = new com.google.protobuf.f1(null);
        f1Var.l(this);
        return f1Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45095m.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.g1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45097e & 1) != 0) {
            k0Var.x(2, this.f45098f);
        }
        if ((this.f45097e & 2) != 0) {
            k0Var.x(3, this.f45099g);
        }
        for (int i18 = 0; i18 < this.f45100h.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45100h.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45095m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45095m.toBuilder();
    }

    public g1() {
        this.f45101i = (byte) -1;
        this.f45100h = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.f1(r5Var, null);
    }
}
