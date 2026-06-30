package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class k0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: i */
    public static final com.tencent.mm.flutter.plugin.proto.k0 f67989i = new com.tencent.mm.flutter.plugin.proto.k0();

    /* renamed from: m */
    public static final com.google.protobuf.e9 f67990m = new com.tencent.mm.flutter.plugin.proto.i0();

    /* renamed from: d */
    public int f67991d;

    /* renamed from: e */
    public int f67992e;

    /* renamed from: f */
    public boolean f67993f;

    /* renamed from: g */
    public com.tencent.mm.flutter.plugin.proto.n0 f67994g;

    /* renamed from: h */
    public byte f67995h;

    public k0(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f67995h = (byte) -1;
    }

    public static /* synthetic */ boolean access$3200() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ com.google.protobuf.wa f(com.tencent.mm.flutter.plugin.proto.k0 k0Var) {
        return k0Var.unknownFields;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.k0)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.k0 k0Var = (com.tencent.mm.flutter.plugin.proto.k0) obj;
        if (h() != k0Var.h()) {
            return false;
        }
        if (h() && this.f67992e != k0Var.f67992e) {
            return false;
        }
        int i17 = this.f67991d;
        if (((i17 & 2) != 0) != ((k0Var.f67991d & 2) != 0)) {
            return false;
        }
        if ((!((i17 & 2) != 0) || this.f67993f == k0Var.f67993f) && hasPosition() == k0Var.hasPosition()) {
            return (!hasPosition() || g().equals(k0Var.g())) && this.unknownFields.equals(k0Var.unknownFields);
        }
        return false;
    }

    public com.tencent.mm.flutter.plugin.proto.n0 g() {
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = this.f67994g;
        return n0Var == null ? com.tencent.mm.flutter.plugin.proto.n0.f68019m : n0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f67989i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f67991d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f67992e) : 0;
        if ((this.f67991d & 2) != 0) {
            k17 += com.google.protobuf.k0.b(2, this.f67993f);
        }
        if ((this.f67991d & 4) != 0) {
            k17 += com.google.protobuf.k0.n(3, g());
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
        return (this.f67991d & 1) != 0;
    }

    public boolean hasPosition() {
        return (this.f67991d & 4) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.flutter.plugin.proto.o0.f68033e.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (h()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f67992e;
        }
        if ((this.f67991d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f67993f);
        }
        if (hasPosition()) {
            hashCode = (((hashCode * 37) + 3) * 53) + g().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i */
    public com.tencent.mm.flutter.plugin.proto.j0 toBuilder() {
        if (this == f67989i) {
            return new com.tencent.mm.flutter.plugin.proto.j0(null);
        }
        com.tencent.mm.flutter.plugin.proto.j0 j0Var = new com.tencent.mm.flutter.plugin.proto.j0(null);
        j0Var.f(this);
        return j0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68034f;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.k0.class, com.tencent.mm.flutter.plugin.proto.j0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67995h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!h()) {
            this.f67995h = (byte) 0;
            return false;
        }
        if (!hasPosition()) {
            this.f67995h = (byte) 0;
            return false;
        }
        if (g().isInitialized()) {
            this.f67995h = (byte) 1;
            return true;
        }
        this.f67995h = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f67989i.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.k0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67991d & 1) != 0) {
            k0Var.H(1, this.f67992e);
        }
        if ((this.f67991d & 2) != 0) {
            k0Var.x(2, this.f67993f);
        }
        if ((this.f67991d & 4) != 0) {
            k0Var.J(3, g());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f67989i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f67989i.toBuilder();
    }

    public k0() {
        this.f67995h = (byte) -1;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.j0(r5Var, null);
    }

    public k0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
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
                            if (F == 8) {
                                this.f67991d |= 1;
                                this.f67992e = d0Var.t();
                            } else if (F == 16) {
                                this.f67991d |= 2;
                                this.f67993f = d0Var.l();
                            } else if (F != 26) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                com.tencent.mm.flutter.plugin.proto.m0 builder = (this.f67991d & 4) != 0 ? this.f67994g.toBuilder() : null;
                                com.tencent.mm.flutter.plugin.proto.n0 n0Var = (com.tencent.mm.flutter.plugin.proto.n0) d0Var.v(com.tencent.mm.flutter.plugin.proto.n0.f68020n, t4Var);
                                this.f67994g = n0Var;
                                if (builder != null) {
                                    builder.f(n0Var);
                                    this.f67994g = builder.buildPartial();
                                }
                                this.f67991d |= 4;
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
