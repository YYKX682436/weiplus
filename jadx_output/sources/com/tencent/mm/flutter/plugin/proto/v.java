package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class v extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.v f68094h = new com.tencent.mm.flutter.plugin.proto.v();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f68095i = new com.tencent.mm.flutter.plugin.proto.t();

    /* renamed from: d, reason: collision with root package name */
    public int f68096d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f68097e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f68098f;

    /* renamed from: g, reason: collision with root package name */
    public byte f68099g;

    public v(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f68099g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.v)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.v vVar = (com.tencent.mm.flutter.plugin.proto.v) obj;
        if (j() != vVar.j()) {
            return false;
        }
        return (!j() || i().equals(vVar.i())) && this.f68098f.equals(vVar.f68098f) && this.unknownFields.equals(vVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f68094h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f68096d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f68097e) + 0 : 0;
        for (int i18 = 0; i18 < this.f68098f.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f68098f.get(i18));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
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
        int hashCode = com.tencent.mm.flutter.plugin.proto.o0.f68049u.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (j()) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if (this.f68098f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f68098f.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f68097e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f68097e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68050v;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.v.class, com.tencent.mm.flutter.plugin.proto.u.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f68099g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!j()) {
            this.f68099g = (byte) 0;
            return false;
        }
        for (int i17 = 0; i17 < this.f68098f.size(); i17++) {
            if (!((com.tencent.mm.flutter.plugin.proto.b0) this.f68098f.get(i17)).isInitialized()) {
                this.f68099g = (byte) 0;
                return false;
            }
        }
        this.f68099g = (byte) 1;
        return true;
    }

    public boolean j() {
        return (this.f68096d & 1) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.u toBuilder() {
        if (this == f68094h) {
            return new com.tencent.mm.flutter.plugin.proto.u(null);
        }
        com.tencent.mm.flutter.plugin.proto.u uVar = new com.tencent.mm.flutter.plugin.proto.u(null);
        uVar.f(this);
        return uVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f68094h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.v();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f68096d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f68097e);
        }
        for (int i17 = 0; i17 < this.f68098f.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f68098f.get(i17));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f68094h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f68094h.toBuilder();
    }

    public v() {
        this.f68099g = (byte) -1;
        this.f68097e = "";
        this.f68098f = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.u(r5Var, null);
    }

    public v(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f68096d = 1 | this.f68096d;
                            this.f68097e = m17;
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if ((i17 & 2) == 0) {
                                this.f68098f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f68098f.add((com.tencent.mm.flutter.plugin.proto.b0) d0Var.v(com.tencent.mm.flutter.plugin.proto.b0.f67942i, t4Var));
                        }
                    }
                    z17 = true;
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                if ((i17 & 2) != 0) {
                    this.f68098f = java.util.Collections.unmodifiableList(this.f68098f);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
