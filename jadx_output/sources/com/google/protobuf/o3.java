package com.google.protobuf;

/* loaded from: classes16.dex */
public final class o3 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.protobuf.o3 f45352p = new com.google.protobuf.o3();

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45353q = new com.google.protobuf.j3();

    /* renamed from: d, reason: collision with root package name */
    public int f45354d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f45355e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f45356f;

    /* renamed from: g, reason: collision with root package name */
    public long f45357g;

    /* renamed from: h, reason: collision with root package name */
    public long f45358h;

    /* renamed from: i, reason: collision with root package name */
    public double f45359i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.protobuf.y f45360m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Object f45361n;

    /* renamed from: o, reason: collision with root package name */
    public byte f45362o;

    public o3(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45362o = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.o3)) {
            return super.equals(obj);
        }
        com.google.protobuf.o3 o3Var = (com.google.protobuf.o3) obj;
        if (!this.f45355e.equals(o3Var.f45355e)) {
            return false;
        }
        int i17 = this.f45354d;
        if (((i17 & 1) != 0) != ((o3Var.f45354d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !g().equals(o3Var.g())) {
            return false;
        }
        int i18 = this.f45354d;
        boolean z17 = (i18 & 2) != 0;
        int i19 = o3Var.f45354d;
        if (z17 != ((i19 & 2) != 0)) {
            return false;
        }
        if (((i18 & 2) != 0) && this.f45357g != o3Var.f45357g) {
            return false;
        }
        if (((i18 & 4) != 0) != ((i19 & 4) != 0)) {
            return false;
        }
        if (((i18 & 4) != 0) && this.f45358h != o3Var.f45358h) {
            return false;
        }
        if (((i18 & 8) != 0) != ((i19 & 8) != 0)) {
            return false;
        }
        if (((i18 & 8) != 0) && java.lang.Double.doubleToLongBits(this.f45359i) != java.lang.Double.doubleToLongBits(o3Var.f45359i)) {
            return false;
        }
        int i27 = this.f45354d;
        if (((i27 & 16) != 0) != ((o3Var.f45354d & 16) != 0)) {
            return false;
        }
        if (((i27 & 16) != 0) && !this.f45360m.equals(o3Var.f45360m)) {
            return false;
        }
        int i28 = this.f45354d;
        if (((i28 & 32) != 0) != ((o3Var.f45354d & 32) != 0)) {
            return false;
        }
        return (!((i28 & 32) != 0) || f().equals(o3Var.f())) && this.unknownFields.equals(o3Var.unknownFields);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f45361n;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45361n = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f45356f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45356f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45352p;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f45355e.size(); i19++) {
            i18 += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f45355e.get(i19));
        }
        if ((this.f45354d & 1) != 0) {
            i18 += com.google.protobuf.l6.computeStringSize(3, this.f45356f);
        }
        if ((this.f45354d & 2) != 0) {
            i18 += com.google.protobuf.k0.s(4, this.f45357g);
        }
        if ((this.f45354d & 4) != 0) {
            i18 += com.google.protobuf.k0.m(5, this.f45358h);
        }
        if ((this.f45354d & 8) != 0) {
            i18 += com.google.protobuf.k0.e(6, this.f45359i);
        }
        if ((this.f45354d & 16) != 0) {
            i18 += com.google.protobuf.k0.c(7, this.f45360m);
        }
        if ((this.f45354d & 32) != 0) {
            i18 += com.google.protobuf.l6.computeStringSize(8, this.f45361n);
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.k3 toBuilder() {
        if (this == f45352p) {
            return new com.google.protobuf.k3(null);
        }
        com.google.protobuf.k3 k3Var = new com.google.protobuf.k3(null);
        k3Var.f(this);
        return k3Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.O.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f45355e.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f45355e.hashCode();
        }
        if ((this.f45354d & 1) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + g().hashCode();
        }
        if ((this.f45354d & 2) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + com.google.protobuf.w6.b(this.f45357g);
        }
        if ((this.f45354d & 4) != 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.w6.b(this.f45358h);
        }
        if ((this.f45354d & 8) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f45359i));
        }
        if ((this.f45354d & 16) != 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + this.f45360m.hashCode();
        }
        if ((this.f45354d & 32) != 0) {
            hashCode = (((hashCode * 37) + 8) * 53) + f().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.P;
        j6Var.c(com.google.protobuf.o3.class, com.google.protobuf.k3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45362o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f45355e.size(); i17++) {
            if (!((com.google.protobuf.n3) this.f45355e.get(i17)).isInitialized()) {
                this.f45362o = (byte) 0;
                return false;
            }
        }
        this.f45362o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45352p.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.o3();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        for (int i17 = 0; i17 < this.f45355e.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f45355e.get(i17));
        }
        if ((this.f45354d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f45356f);
        }
        if ((this.f45354d & 2) != 0) {
            k0Var.T(4, this.f45357g);
        }
        if ((this.f45354d & 4) != 0) {
            k0Var.T(5, this.f45358h);
        }
        if ((this.f45354d & 8) != 0) {
            k0Var.B(6, this.f45359i);
        }
        if ((this.f45354d & 16) != 0) {
            k0Var.z(7, this.f45360m);
        }
        if ((this.f45354d & 32) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 8, this.f45361n);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45352p;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45352p.toBuilder();
    }

    public o3() {
        this.f45362o = (byte) -1;
        this.f45355e = java.util.Collections.emptyList();
        this.f45356f = "";
        this.f45360m = com.google.protobuf.y.f45712e;
        this.f45361n = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.k3(r5Var, null);
    }
}
