package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class y extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.y f68105m = new com.tencent.mm.flutter.plugin.proto.y();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f68106n = new com.tencent.mm.flutter.plugin.proto.w();

    /* renamed from: d, reason: collision with root package name */
    public int f68107d;

    /* renamed from: e, reason: collision with root package name */
    public double f68108e;

    /* renamed from: f, reason: collision with root package name */
    public double f68109f;

    /* renamed from: g, reason: collision with root package name */
    public double f68110g;

    /* renamed from: h, reason: collision with root package name */
    public double f68111h;

    /* renamed from: i, reason: collision with root package name */
    public byte f68112i;

    public y(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f68112i = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.y)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.y yVar = (com.tencent.mm.flutter.plugin.proto.y) obj;
        if (i() != yVar.i()) {
            return false;
        }
        if ((i() && java.lang.Double.doubleToLongBits(this.f68108e) != java.lang.Double.doubleToLongBits(yVar.f68108e)) || j() != yVar.j()) {
            return false;
        }
        if ((j() && java.lang.Double.doubleToLongBits(this.f68109f) != java.lang.Double.doubleToLongBits(yVar.f68109f)) || h() != yVar.h()) {
            return false;
        }
        if ((!h() || java.lang.Double.doubleToLongBits(this.f68110g) == java.lang.Double.doubleToLongBits(yVar.f68110g)) && g() == yVar.g()) {
            return (!g() || java.lang.Double.doubleToLongBits(this.f68111h) == java.lang.Double.doubleToLongBits(yVar.f68111h)) && this.unknownFields.equals(yVar.unknownFields);
        }
        return false;
    }

    public boolean g() {
        return (this.f68107d & 8) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f68105m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int e17 = (this.f68107d & 1) != 0 ? 0 + com.google.protobuf.k0.e(1, this.f68108e) : 0;
        if ((this.f68107d & 2) != 0) {
            e17 += com.google.protobuf.k0.e(2, this.f68109f);
        }
        if ((this.f68107d & 4) != 0) {
            e17 += com.google.protobuf.k0.e(3, this.f68110g);
        }
        if ((this.f68107d & 8) != 0) {
            e17 += com.google.protobuf.k0.e(4, this.f68111h);
        }
        int serializedSize = e17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return (this.f68107d & 4) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.tencent.mm.flutter.plugin.proto.o0.f68045q.hashCode();
        if (i()) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f68108e));
        }
        if (j()) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f68109f));
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 3) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f68110g));
        }
        if (g()) {
            hashCode = (((hashCode * 37) + 4) * 53) + com.google.protobuf.w6.b(java.lang.Double.doubleToLongBits(this.f68111h));
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public boolean i() {
        return (this.f68107d & 1) != 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68046r;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.y.class, com.tencent.mm.flutter.plugin.proto.x.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f68112i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!i()) {
            this.f68112i = (byte) 0;
            return false;
        }
        if (!j()) {
            this.f68112i = (byte) 0;
            return false;
        }
        if (!h()) {
            this.f68112i = (byte) 0;
            return false;
        }
        if (g()) {
            this.f68112i = (byte) 1;
            return true;
        }
        this.f68112i = (byte) 0;
        return false;
    }

    public boolean j() {
        return (this.f68107d & 2) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.x toBuilder() {
        if (this == f68105m) {
            return new com.tencent.mm.flutter.plugin.proto.x(null);
        }
        com.tencent.mm.flutter.plugin.proto.x xVar = new com.tencent.mm.flutter.plugin.proto.x(null);
        xVar.e(this);
        return xVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f68105m.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.y();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f68107d & 1) != 0) {
            k0Var.B(1, this.f68108e);
        }
        if ((this.f68107d & 2) != 0) {
            k0Var.B(2, this.f68109f);
        }
        if ((this.f68107d & 4) != 0) {
            k0Var.B(3, this.f68110g);
        }
        if ((this.f68107d & 8) != 0) {
            k0Var.B(4, this.f68111h);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f68105m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f68105m.toBuilder();
    }

    public y() {
        this.f68112i = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.x(r5Var, null);
    }

    public y(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 9) {
                                this.f68107d |= 1;
                                this.f68108e = d0Var.n();
                            } else if (F == 17) {
                                this.f68107d |= 2;
                                this.f68109f = d0Var.n();
                            } else if (F == 25) {
                                this.f68107d |= 4;
                                this.f68110g = d0Var.n();
                            } else if (F != 33) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                this.f68107d |= 8;
                                this.f68111h = d0Var.n();
                            }
                        }
                        z17 = true;
                    } catch (com.google.protobuf.y6 e17) {
                        e17.f45739d = this;
                        throw e17;
                    }
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
