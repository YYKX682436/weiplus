package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class n0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.n0 f68019m = new com.tencent.mm.flutter.plugin.proto.n0();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f68020n = new com.tencent.mm.flutter.plugin.proto.l0();

    /* renamed from: d, reason: collision with root package name */
    public int f68021d;

    /* renamed from: e, reason: collision with root package name */
    public int f68022e;

    /* renamed from: f, reason: collision with root package name */
    public int f68023f;

    /* renamed from: g, reason: collision with root package name */
    public int f68024g;

    /* renamed from: h, reason: collision with root package name */
    public int f68025h;

    /* renamed from: i, reason: collision with root package name */
    public byte f68026i;

    public n0(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f68026i = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.m0 i() {
        return f68019m.toBuilder();
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.n0)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = (com.tencent.mm.flutter.plugin.proto.n0) obj;
        if (g() != n0Var.g()) {
            return false;
        }
        if ((g() && this.f68022e != n0Var.f68022e) || h() != n0Var.h()) {
            return false;
        }
        if ((h() && this.f68023f != n0Var.f68023f) || hasWidth() != n0Var.hasWidth()) {
            return false;
        }
        if ((!hasWidth() || this.f68024g == n0Var.f68024g) && hasHeight() == n0Var.hasHeight()) {
            return (!hasHeight() || this.f68025h == n0Var.f68025h) && this.unknownFields.equals(n0Var.unknownFields);
        }
        return false;
    }

    public boolean g() {
        return (this.f68021d & 1) != 0;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f68019m;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f68021d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f68022e) : 0;
        if ((this.f68021d & 2) != 0) {
            k17 += com.google.protobuf.k0.k(2, this.f68023f);
        }
        if ((this.f68021d & 4) != 0) {
            k17 += com.google.protobuf.k0.k(3, this.f68024g);
        }
        if ((this.f68021d & 8) != 0) {
            k17 += com.google.protobuf.k0.k(4, this.f68025h);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean h() {
        return (this.f68021d & 2) != 0;
    }

    public boolean hasHeight() {
        return (this.f68021d & 8) != 0;
    }

    public boolean hasWidth() {
        return (this.f68021d & 4) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + com.tencent.mm.flutter.plugin.proto.o0.f68029a.hashCode();
        if (g()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f68022e;
        }
        if (h()) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f68023f;
        }
        if (hasWidth()) {
            hashCode = (((hashCode * 37) + 3) * 53) + this.f68024g;
        }
        if (hasHeight()) {
            hashCode = (((hashCode * 37) + 4) * 53) + this.f68025h;
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68030b;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.n0.class, com.tencent.mm.flutter.plugin.proto.m0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f68026i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!g()) {
            this.f68026i = (byte) 0;
            return false;
        }
        if (!h()) {
            this.f68026i = (byte) 0;
            return false;
        }
        if (!hasWidth()) {
            this.f68026i = (byte) 0;
            return false;
        }
        if (hasHeight()) {
            this.f68026i = (byte) 1;
            return true;
        }
        this.f68026i = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.m0 toBuilder() {
        if (this == f68019m) {
            return new com.tencent.mm.flutter.plugin.proto.m0(null);
        }
        com.tencent.mm.flutter.plugin.proto.m0 m0Var = new com.tencent.mm.flutter.plugin.proto.m0(null);
        m0Var.f(this);
        return m0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return i();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.n0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f68021d & 1) != 0) {
            k0Var.H(1, this.f68022e);
        }
        if ((this.f68021d & 2) != 0) {
            k0Var.H(2, this.f68023f);
        }
        if ((this.f68021d & 4) != 0) {
            k0Var.H(3, this.f68024g);
        }
        if ((this.f68021d & 8) != 0) {
            k0Var.H(4, this.f68025h);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f68019m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return i();
    }

    public n0() {
        this.f68026i = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.m0(r5Var, null);
    }

    public n0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 8) {
                            this.f68021d |= 1;
                            this.f68022e = d0Var.t();
                        } else if (F == 16) {
                            this.f68021d |= 2;
                            this.f68023f = d0Var.t();
                        } else if (F == 24) {
                            this.f68021d |= 4;
                            this.f68024g = d0Var.t();
                        } else if (F != 32) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f68021d |= 8;
                            this.f68025h = d0Var.t();
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
