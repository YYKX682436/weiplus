package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class e0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.e0 f67960g = new com.tencent.mm.flutter.plugin.proto.e0();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67961h = new com.tencent.mm.flutter.plugin.proto.c0();

    /* renamed from: d, reason: collision with root package name */
    public int f67962d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f67963e;

    /* renamed from: f, reason: collision with root package name */
    public byte f67964f;

    public e0(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f67964f = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.d0 h() {
        return f67960g.toBuilder();
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.e0)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.e0 e0Var = (com.tencent.mm.flutter.plugin.proto.e0) obj;
        if (hasData() != e0Var.hasData()) {
            return false;
        }
        return (!hasData() || g().equals(e0Var.g())) && this.unknownFields.equals(e0Var.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f67963e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67963e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f67960g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = ((this.f67962d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f67963e) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasData() {
        return (this.f67962d & 1) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.tencent.mm.flutter.plugin.proto.o0.f68035g.hashCode();
        if (hasData()) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.d0 toBuilder() {
        if (this == f67960g) {
            return new com.tencent.mm.flutter.plugin.proto.d0(null);
        }
        com.tencent.mm.flutter.plugin.proto.d0 d0Var = new com.tencent.mm.flutter.plugin.proto.d0(null);
        d0Var.f(this);
        return d0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68036h;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.e0.class, com.tencent.mm.flutter.plugin.proto.d0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67964f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (hasData()) {
            this.f67964f = (byte) 1;
            return true;
        }
        this.f67964f = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return h();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.e0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67962d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f67963e);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f67960g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return h();
    }

    public e0() {
        this.f67964f = (byte) -1;
        this.f67963e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.d0(r5Var, null);
    }

    public e0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f67962d = 1 | this.f67962d;
                            this.f67963e = m17;
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
