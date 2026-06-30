package com.google.protobuf;

/* loaded from: classes16.dex */
public final class h3 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.protobuf.h3 f45149p = new com.google.protobuf.h3();

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.protobuf.e9 f45150q = new com.google.protobuf.f3();

    /* renamed from: d, reason: collision with root package name */
    public int f45151d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.protobuf.t6 f45152e;

    /* renamed from: f, reason: collision with root package name */
    public int f45153f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.t6 f45154g;

    /* renamed from: h, reason: collision with root package name */
    public int f45155h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.Object f45156i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.Object f45157m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.g7 f45158n;

    /* renamed from: o, reason: collision with root package name */
    public byte f45159o;

    public h3(com.google.protobuf.q5 q5Var, com.google.protobuf.o0 o0Var) {
        super(q5Var);
        this.f45153f = -1;
        this.f45155h = -1;
        this.f45159o = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.protobuf.h3)) {
            return super.equals(obj);
        }
        com.google.protobuf.h3 h3Var = (com.google.protobuf.h3) obj;
        if (!((com.google.protobuf.m6) this.f45152e).equals(h3Var.f45152e)) {
            return false;
        }
        if (!((com.google.protobuf.m6) this.f45154g).equals(h3Var.f45154g)) {
            return false;
        }
        int i17 = this.f45151d;
        if (((i17 & 1) != 0) != ((h3Var.f45151d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !f().equals(h3Var.f())) {
            return false;
        }
        int i18 = this.f45151d;
        if (((i18 & 2) != 0) != ((h3Var.f45151d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || g().equals(h3Var.g())) && this.f45158n.equals(h3Var.f45158n) && this.unknownFields.equals(h3Var.unknownFields);
    }

    public java.lang.String f() {
        java.lang.Object obj = this.f45156i;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45156i = r17;
        }
        return r17;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f45157m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f45157m = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f45149p;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.t6 t6Var;
        com.google.protobuf.t6 t6Var2;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        int i19 = 0;
        while (true) {
            t6Var = this.f45152e;
            if (i18 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                break;
            }
            i19 += com.google.protobuf.k0.l(((com.google.protobuf.m6) t6Var).h(i18));
            i18++;
        }
        int i27 = 0 + i19;
        if (!t6Var.isEmpty()) {
            i27 = i27 + 1 + com.google.protobuf.k0.l(i19);
        }
        this.f45153f = i19;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            t6Var2 = this.f45154g;
            if (i28 >= ((com.google.protobuf.m6) t6Var2).f45329f) {
                break;
            }
            i29 += com.google.protobuf.k0.l(((com.google.protobuf.m6) t6Var2).h(i28));
            i28++;
        }
        int i37 = i27 + i29;
        if (!t6Var2.isEmpty()) {
            i37 = i37 + 1 + com.google.protobuf.k0.l(i29);
        }
        this.f45155h = i29;
        if ((this.f45151d & 1) != 0) {
            i37 += com.google.protobuf.l6.computeStringSize(3, this.f45156i);
        }
        if ((this.f45151d & 2) != 0) {
            i37 += com.google.protobuf.l6.computeStringSize(4, this.f45157m);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f45158n.size(); i39++) {
            i38 += com.google.protobuf.l6.computeStringSizeNoTag(this.f45158n.J(i39));
        }
        int size = i37 + i38 + (this.f45158n.size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.g3 toBuilder() {
        if (this == f45149p) {
            return new com.google.protobuf.g3(null);
        }
        com.google.protobuf.g3 g3Var = new com.google.protobuf.g3(null);
        g3Var.e(this);
        return g3Var;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.google.protobuf.p3.U.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        com.google.protobuf.t6 t6Var = this.f45152e;
        if (((com.google.protobuf.m6) t6Var).f45329f > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + ((com.google.protobuf.m6) t6Var).hashCode();
        }
        com.google.protobuf.t6 t6Var2 = this.f45154g;
        if (((com.google.protobuf.m6) t6Var2).f45329f > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + ((com.google.protobuf.m6) t6Var2).hashCode();
        }
        if ((this.f45151d & 1) != 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
        }
        if ((this.f45151d & 2) != 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
        }
        if (this.f45158n.size() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + this.f45158n.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.V;
        j6Var.c(com.google.protobuf.h3.class, com.google.protobuf.g3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f45159o;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f45159o = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f45149p.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.google.protobuf.h3();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        getSerializedSize();
        if (((com.google.protobuf.m6) this.f45152e).f45329f > 0) {
            k0Var.S(10);
            k0Var.S(this.f45153f);
        }
        int i17 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var = this.f45152e;
            if (i17 >= ((com.google.protobuf.m6) t6Var).f45329f) {
                break;
            }
            k0Var.I(((com.google.protobuf.m6) t6Var).h(i17));
            i17++;
        }
        if (((com.google.protobuf.m6) this.f45154g).f45329f > 0) {
            k0Var.S(18);
            k0Var.S(this.f45155h);
        }
        int i18 = 0;
        while (true) {
            com.google.protobuf.t6 t6Var2 = this.f45154g;
            if (i18 >= ((com.google.protobuf.m6) t6Var2).f45329f) {
                break;
            }
            k0Var.I(((com.google.protobuf.m6) t6Var2).h(i18));
            i18++;
        }
        if ((this.f45151d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f45156i);
        }
        if ((this.f45151d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 4, this.f45157m);
        }
        for (int i19 = 0; i19 < this.f45158n.size(); i19++) {
            com.google.protobuf.l6.writeString(k0Var, 6, this.f45158n.J(i19));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f45149p;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f45149p.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.google.protobuf.g3(r5Var, null);
    }

    public h3() {
        this.f45153f = -1;
        this.f45155h = -1;
        this.f45159o = (byte) -1;
        this.f45152e = com.google.protobuf.l6.emptyIntList();
        this.f45154g = com.google.protobuf.l6.emptyIntList();
        this.f45156i = "";
        this.f45157m = "";
        this.f45158n = com.google.protobuf.f7.f45086f;
    }
}
