package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class p extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.p f68051g = new com.tencent.mm.flutter.plugin.proto.p();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f68052h = new com.tencent.mm.flutter.plugin.proto.n();

    /* renamed from: d, reason: collision with root package name */
    public int f68053d;

    /* renamed from: e, reason: collision with root package name */
    public int f68054e;

    /* renamed from: f, reason: collision with root package name */
    public byte f68055f;

    public p(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f68055f = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.p)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.p pVar = (com.tencent.mm.flutter.plugin.proto.p) obj;
        int i17 = this.f68053d;
        if (((i17 & 1) != 0) != ((pVar.f68053d & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || this.f68054e == pVar.f68054e) && this.unknownFields.equals(pVar.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.o toBuilder() {
        if (this == f68051g) {
            return new com.tencent.mm.flutter.plugin.proto.o(null);
        }
        com.tencent.mm.flutter.plugin.proto.o oVar = new com.tencent.mm.flutter.plugin.proto.o(null);
        oVar.f(this);
        return oVar;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f68051g;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = ((this.f68053d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f68054e) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = k17;
        return k17;
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
        int hashCode = com.tencent.mm.flutter.plugin.proto.o0.f68039k.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f68053d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f68054e;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68040l;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.p.class, com.tencent.mm.flutter.plugin.proto.o.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f68055f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f68055f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f68051g.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.p();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f68053d & 1) != 0) {
            k0Var.H(1, this.f68054e);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f68051g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f68051g.toBuilder();
    }

    public p() {
        this.f68055f = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.o(r5Var, null);
    }

    public p(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 8) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f68053d |= 1;
                            this.f68054e = d0Var.t();
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
