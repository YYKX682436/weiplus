package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class j extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.j f67978h = new com.tencent.mm.flutter.plugin.proto.j();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67979i = new com.tencent.mm.flutter.plugin.proto.h();

    /* renamed from: d, reason: collision with root package name */
    public int f67980d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f67981e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f67982f;

    /* renamed from: g, reason: collision with root package name */
    public byte f67983g;

    public j(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f67983g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.j)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.j jVar = (com.tencent.mm.flutter.plugin.proto.j) obj;
        if (i() != jVar.i()) {
            return false;
        }
        if ((!i() || g().equals(jVar.g())) && j() == jVar.j()) {
            return (!j() || h().equals(jVar.h())) && this.unknownFields.equals(jVar.unknownFields);
        }
        return false;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f67981e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67981e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f67978h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f67980d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f67981e) : 0;
        if ((this.f67980d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f67982f);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f67982f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67982f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.tencent.mm.flutter.plugin.proto.o0.f68043o.hashCode();
        if (i()) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        if (j()) {
            hashCode = (((hashCode * 37) + 2) * 53) + h().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public boolean i() {
        return (this.f67980d & 1) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68044p;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.j.class, com.tencent.mm.flutter.plugin.proto.i.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67983g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!i()) {
            this.f67983g = (byte) 0;
            return false;
        }
        if (j()) {
            this.f67983g = (byte) 1;
            return true;
        }
        this.f67983g = (byte) 0;
        return false;
    }

    public boolean j() {
        return (this.f67980d & 2) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.i toBuilder() {
        if (this == f67978h) {
            return new com.tencent.mm.flutter.plugin.proto.i(null);
        }
        com.tencent.mm.flutter.plugin.proto.i iVar = new com.tencent.mm.flutter.plugin.proto.i(null);
        iVar.e(this);
        return iVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f67978h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.j();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67980d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f67981e);
        }
        if ((this.f67980d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f67982f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f67978h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f67978h.toBuilder();
    }

    public j() {
        this.f67983g = (byte) -1;
        this.f67981e = "";
        this.f67982f = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.i(r5Var, null);
    }

    public j(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f67980d = 1 | this.f67980d;
                            this.f67981e = m17;
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            com.google.protobuf.y m18 = d0Var.m();
                            this.f67980d |= 2;
                            this.f67982f = m18;
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
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
