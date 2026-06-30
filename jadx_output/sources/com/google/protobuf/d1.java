package com.google.protobuf;

/* loaded from: classes16.dex */
public final class d1 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.d1 f44995n = new com.google.protobuf.d1();

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.protobuf.e9 f44996o = new com.google.protobuf.y0();

    /* renamed from: d, reason: collision with root package name */
    public int f44997d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f44998e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f44999f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.g1 f45000g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45001h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.g7 f45002i;

    /* renamed from: m, reason: collision with root package name */
    public byte f45003m;

    public d1(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45003m = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.d1)) {
            return super.equals(obj);
        }
        com.google.protobuf.d1 d1Var = (com.google.protobuf.d1) obj;
        int i17 = this.f44997d;
        if (((i17 & 1) != 0) != ((d1Var.f44997d & 1) != 0)) {
            return false;
        }
        if ((!((i17 & 1) != 0) || getName().equals(d1Var.getName())) && this.f44999f.equals(d1Var.f44999f) && g() == d1Var.g()) {
            return (!g() || f().equals(d1Var.f())) && this.f45001h.equals(d1Var.f45001h) && this.f45002i.equals(d1Var.f45002i) && this.unknownFields.equals(d1Var.unknownFields);
        }
        return false;
    }

    public com.google.protobuf.g1 f() {
        com.google.protobuf.g1 g1Var = this.f45000g;
        return g1Var == null ? com.google.protobuf.g1.f45095m : g1Var;
    }

    public boolean g() {
        return (this.f44997d & 2) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f44995n;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f44998e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f44998e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f44997d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f44998e) + 0 : 0;
        for (int i18 = 0; i18 < this.f44999f.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f44999f.get(i18));
        }
        if ((this.f44997d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.n(3, f());
        }
        for (int i19 = 0; i19 < this.f45001h.size(); i19++) {
            computeStringSize += com.google.protobuf.k0.n(4, (com.google.protobuf.o8) this.f45001h.get(i19));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.f45002i.size(); i28++) {
            i27 += com.google.protobuf.l6.computeStringSizeNoTag(this.f45002i.J(i28));
        }
        int size = computeStringSize + i27 + (this.f45002i.size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.z0 toBuilder() {
        if (this == f44995n) {
            return new com.google.protobuf.z0(null);
        }
        com.google.protobuf.z0 z0Var = new com.google.protobuf.z0(null);
        z0Var.g(this);
        return z0Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.f45396o.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f44997d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getName().hashCode();
        }
        if (this.f44999f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f44999f.hashCode();
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
        }
        if (this.f45001h.size() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f45001h.hashCode();
        }
        if (this.f45002i.size() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + this.f45002i.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45397p;
        j6Var.c(com.google.protobuf.d1.class, com.google.protobuf.z0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45003m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        for (int i17 = 0; i17 < this.f44999f.size(); i17++) {
            if (!((com.google.protobuf.j1) this.f44999f.get(i17)).isInitialized()) {
                this.f45003m = (byte) 0;
                return false;
            }
        }
        if (!g() || f().isInitialized()) {
            this.f45003m = (byte) 1;
            return true;
        }
        this.f45003m = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f44995n.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.d1();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f44997d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f44998e);
        }
        for (int i17 = 0; i17 < this.f44999f.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f44999f.get(i17));
        }
        if ((this.f44997d & 2) != 0) {
            k0Var.J(3, f());
        }
        for (int i18 = 0; i18 < this.f45001h.size(); i18++) {
            k0Var.J(4, (com.google.protobuf.o8) this.f45001h.get(i18));
        }
        for (int i19 = 0; i19 < this.f45002i.size(); i19++) {
            com.google.protobuf.l6.writeString(k0Var, 5, this.f45002i.J(i19));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f44995n;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f44995n.toBuilder();
    }

    public d1() {
        this.f45003m = (byte) -1;
        this.f44998e = "";
        this.f44999f = java.util.Collections.emptyList();
        this.f45001h = java.util.Collections.emptyList();
        this.f45002i = com.google.protobuf.f7.f45086f;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.z0(r5Var, null);
    }
}
