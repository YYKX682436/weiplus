package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class h0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.h0 f67969h = new com.tencent.mm.flutter.plugin.proto.h0();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67970i = new com.tencent.mm.flutter.plugin.proto.f0();

    /* renamed from: d, reason: collision with root package name */
    public int f67971d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f67972e;

    /* renamed from: f, reason: collision with root package name */
    public long f67973f;

    /* renamed from: g, reason: collision with root package name */
    public byte f67974g;

    public h0(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f67974g = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.g0 j() {
        return f67969h.toBuilder();
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.h0)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.h0 h0Var = (com.tencent.mm.flutter.plugin.proto.h0) obj;
        if (h() != h0Var.h()) {
            return false;
        }
        if ((!h() || g().equals(h0Var.g())) && i() == h0Var.i()) {
            return (!i() || this.f67973f == h0Var.f67973f) && this.unknownFields.equals(h0Var.unknownFields);
        }
        return false;
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f67972e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67972e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f67969h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f67971d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f67972e) : 0;
        if ((this.f67971d & 2) != 0) {
            computeStringSize += com.google.protobuf.k0.s(2, this.f67973f);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return (this.f67971d & 1) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.tencent.mm.flutter.plugin.proto.o0.f68041m.hashCode();
        if (h()) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        if (i()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.b(this.f67973f);
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public boolean i() {
        return (this.f67971d & 2) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68042n;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.h0.class, com.tencent.mm.flutter.plugin.proto.g0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67974g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!h()) {
            this.f67974g = (byte) 0;
            return false;
        }
        if (i()) {
            this.f67974g = (byte) 1;
            return true;
        }
        this.f67974g = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.g0 toBuilder() {
        if (this == f67969h) {
            return new com.tencent.mm.flutter.plugin.proto.g0(null);
        }
        com.tencent.mm.flutter.plugin.proto.g0 g0Var = new com.tencent.mm.flutter.plugin.proto.g0(null);
        g0Var.f(this);
        return g0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return j();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.h0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67971d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f67972e);
        }
        if ((this.f67971d & 2) != 0) {
            k0Var.T(2, this.f67973f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f67969h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return j();
    }

    public h0() {
        this.f67974g = (byte) -1;
        this.f67972e = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.g0(r5Var, null);
    }

    public h0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
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
                            this.f67971d = 1 | this.f67971d;
                            this.f67972e = m17;
                        } else if (F != 16) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f67971d |= 2;
                            this.f67973f = d0Var.H();
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
