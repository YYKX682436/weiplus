package com.google.protobuf;

/* loaded from: classes16.dex */
public final class z1 extends com.google.protobuf.u5 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.protobuf.z1 f45758q = new com.google.protobuf.z1();

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45759r = new com.google.protobuf.v1();

    /* renamed from: e, reason: collision with root package name */
    public int f45760e;

    /* renamed from: f, reason: collision with root package name */
    public int f45761f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45762g;

    /* renamed from: h, reason: collision with root package name */
    public int f45763h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45764i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45765m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45766n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f45767o;

    /* renamed from: p, reason: collision with root package name */
    public byte f45768p;

    public z1(com.google.protobuf.s5 s5Var, com.google.protobuf.o0 o0Var) {
        super(s5Var);
        this.f45768p = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.z1)) {
            return super.equals(obj);
        }
        com.google.protobuf.z1 z1Var = (com.google.protobuf.z1) obj;
        int i17 = this.f45760e;
        if (((i17 & 1) != 0) != ((z1Var.f45760e & 1) != 0)) {
            return false;
        }
        if ((((i17 & 1) != 0) && this.f45761f != z1Var.f45761f) || k() != z1Var.k()) {
            return false;
        }
        if (k() && this.f45762g != z1Var.f45762g) {
            return false;
        }
        int i18 = this.f45760e;
        boolean z17 = (i18 & 4) != 0;
        int i19 = z1Var.f45760e;
        if (z17 != ((i19 & 4) != 0)) {
            return false;
        }
        if (((i18 & 4) != 0) && this.f45763h != z1Var.f45763h) {
            return false;
        }
        if (((i18 & 8) != 0) != ((i19 & 8) != 0)) {
            return false;
        }
        if (((i18 & 8) != 0) && this.f45764i != z1Var.f45764i) {
            return false;
        }
        if (((i18 & 16) != 0) != ((i19 & 16) != 0)) {
            return false;
        }
        if (((i18 & 16) != 0) && this.f45765m != z1Var.f45765m) {
            return false;
        }
        if (((i18 & 32) != 0) != ((i19 & 32) != 0)) {
            return false;
        }
        return (!((i18 & 32) != 0) || this.f45766n == z1Var.f45766n) && this.f45767o.equals(z1Var.f45767o) && this.unknownFields.equals(z1Var.unknownFields) && h().equals(z1Var.h());
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45758q;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int f17 = (this.f45760e & 1) != 0 ? com.google.protobuf.k0.f(1, this.f45761f) + 0 : 0;
        if ((this.f45760e & 2) != 0) {
            f17 += com.google.protobuf.k0.b(2, this.f45762g);
        }
        if ((this.f45760e & 16) != 0) {
            f17 += com.google.protobuf.k0.b(3, this.f45765m);
        }
        if ((this.f45760e & 8) != 0) {
            f17 += com.google.protobuf.k0.b(5, this.f45764i);
        }
        if ((this.f45760e & 4) != 0) {
            f17 += com.google.protobuf.k0.f(6, this.f45763h);
        }
        if ((this.f45760e & 32) != 0) {
            f17 += com.google.protobuf.k0.b(10, this.f45766n);
        }
        for (int i18 = 0; i18 < this.f45767o.size(); i18++) {
            f17 += com.google.protobuf.k0.n(999, (com.google.protobuf.o8) this.f45767o.get(i18));
        }
        int g17 = f17 + g() + this.unknownFields.getSerializedSize();
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
        int hashCode = com.google.protobuf.p3.C.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f45760e & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f45761f;
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f45762g);
        }
        int i18 = this.f45760e;
        if ((i18 & 4) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f45763h;
        }
        if ((i18 & 8) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.w6.a(this.f45764i);
        }
        if ((this.f45760e & 16) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.w6.a(this.f45765m);
        }
        if ((this.f45760e & 32) != 0) {
            hashCode = (((hashCode * 37) + 10) * 53) + com.google.protobuf.w6.a(this.f45766n);
        }
        if (this.f45767o.size() > 0) {
            hashCode = (((hashCode * 37) + 999) * 53) + this.f45767o.hashCode();
        }
        int hashFields = (com.google.protobuf.c.hashFields(hashCode, h()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.D;
        j6Var.c(com.google.protobuf.z1.class, com.google.protobuf.w1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45768p;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45767o.size(); i17++) {
            if (!((com.google.protobuf.o3) this.f45767o.get(i17)).isInitialized()) {
                this.f45768p = (byte) 0;
                return false;
            }
        }
        if (f()) {
            this.f45768p = (byte) 1;
            return true;
        }
        this.f45768p = (byte) 0;
        return false;
    }

    public boolean k() {
        return (this.f45760e & 2) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.w1 toBuilder() {
        if (this == f45758q) {
            return new com.google.protobuf.w1(null);
        }
        com.google.protobuf.w1 w1Var = new com.google.protobuf.w1(null);
        w1Var.l(this);
        return w1Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45758q.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.z1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.t5 i17 = i();
        if ((this.f45760e & 1) != 0) {
            k0Var.H(1, this.f45761f);
        }
        if ((this.f45760e & 2) != 0) {
            k0Var.x(2, this.f45762g);
        }
        if ((this.f45760e & 16) != 0) {
            k0Var.x(3, this.f45765m);
        }
        if ((this.f45760e & 8) != 0) {
            k0Var.x(5, this.f45764i);
        }
        if ((this.f45760e & 4) != 0) {
            k0Var.H(6, this.f45763h);
        }
        if ((this.f45760e & 32) != 0) {
            k0Var.x(10, this.f45766n);
        }
        for (int i18 = 0; i18 < this.f45767o.size(); i18++) {
            k0Var.J(999, (com.google.protobuf.o8) this.f45767o.get(i18));
        }
        i17.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, k0Var);
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45758q;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45758q.toBuilder();
    }

    public z1() {
        this.f45768p = (byte) -1;
        this.f45761f = 0;
        this.f45763h = 0;
        this.f45767o = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.w1(r5Var, null);
    }
}
