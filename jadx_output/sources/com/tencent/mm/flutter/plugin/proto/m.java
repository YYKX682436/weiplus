package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class m extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: o */
    public static final com.tencent.mm.flutter.plugin.proto.m f68004o = new com.tencent.mm.flutter.plugin.proto.m();

    /* renamed from: p */
    public static final com.google.protobuf.e9 f68005p = new com.tencent.mm.flutter.plugin.proto.k();

    /* renamed from: d */
    public int f68006d;

    /* renamed from: e */
    public int f68007e;

    /* renamed from: f */
    public volatile java.lang.Object f68008f;

    /* renamed from: g */
    public volatile java.lang.Object f68009g;

    /* renamed from: h */
    public com.tencent.mm.flutter.plugin.proto.n0 f68010h;

    /* renamed from: i */
    public boolean f68011i;

    /* renamed from: m */
    public volatile java.lang.Object f68012m;

    /* renamed from: n */
    public byte f68013n;

    public m(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(q5Var);
        this.f68013n = (byte) -1;
    }

    public static /* synthetic */ boolean f() {
        return com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public static /* synthetic */ com.google.protobuf.wa g(com.tencent.mm.flutter.plugin.proto.m mVar) {
        return mVar.unknownFields;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.m)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.m mVar = (com.tencent.mm.flutter.plugin.proto.m) obj;
        if (m() != mVar.m()) {
            return false;
        }
        if ((m() && this.f68007e != mVar.f68007e) || hasFrameSetName() != mVar.hasFrameSetName()) {
            return false;
        }
        if ((hasFrameSetName() && !getFrameSetName().equals(mVar.getFrameSetName())) || k() != mVar.k()) {
            return false;
        }
        if ((k() && !h().equals(mVar.h())) || hasPosition() != mVar.hasPosition()) {
            return false;
        }
        if ((hasPosition() && !i().equals(mVar.i())) || l() != mVar.l()) {
            return false;
        }
        if (l() && this.f68011i != mVar.f68011i) {
            return false;
        }
        int i17 = this.f68006d;
        if (((i17 & 32) != 0) != ((mVar.f68006d & 32) != 0)) {
            return false;
        }
        return (!((i17 & 32) != 0) || j().equals(mVar.j())) && this.unknownFields.equals(mVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f68004o;
    }

    public java.lang.String getFrameSetName() {
        java.lang.Object obj = this.f68008f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f68008f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f68006d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f68007e) : 0;
        if ((this.f68006d & 2) != 0) {
            k17 += com.google.protobuf.l6.computeStringSize(2, this.f68008f);
        }
        if ((this.f68006d & 4) != 0) {
            k17 += com.google.protobuf.l6.computeStringSize(3, this.f68009g);
        }
        if ((this.f68006d & 8) != 0) {
            k17 += com.google.protobuf.k0.n(4, i());
        }
        if ((this.f68006d & 16) != 0) {
            k17 += com.google.protobuf.k0.b(5, this.f68011i);
        }
        if ((this.f68006d & 32) != 0) {
            k17 += com.google.protobuf.l6.computeStringSize(6, this.f68012m);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f68009g;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f68009g = r17;
        }
        return r17;
    }

    public boolean hasFrameSetName() {
        return (this.f68006d & 2) != 0;
    }

    public boolean hasPosition() {
        return (this.f68006d & 8) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.flutter.plugin.proto.o0.f68031c.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (m()) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f68007e;
        }
        if (hasFrameSetName()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getFrameSetName().hashCode();
        }
        if (k()) {
            hashCode = (((hashCode * 37) + 3) * 53) + h().hashCode();
        }
        if (hasPosition()) {
            hashCode = (((hashCode * 37) + 4) * 53) + i().hashCode();
        }
        if (l()) {
            hashCode = (((hashCode * 37) + 5) * 53) + com.google.protobuf.w6.a(this.f68011i);
        }
        if ((this.f68006d & 32) != 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + j().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public com.tencent.mm.flutter.plugin.proto.n0 i() {
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = this.f68010h;
        return n0Var == null ? com.tencent.mm.flutter.plugin.proto.n0.f68019m : n0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68032d;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.m.class, com.tencent.mm.flutter.plugin.proto.l.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f68013n;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!m()) {
            this.f68013n = (byte) 0;
            return false;
        }
        if (!hasFrameSetName()) {
            this.f68013n = (byte) 0;
            return false;
        }
        if (!k()) {
            this.f68013n = (byte) 0;
            return false;
        }
        if (!hasPosition()) {
            this.f68013n = (byte) 0;
            return false;
        }
        if (!l()) {
            this.f68013n = (byte) 0;
            return false;
        }
        if (i().isInitialized()) {
            this.f68013n = (byte) 1;
            return true;
        }
        this.f68013n = (byte) 0;
        return false;
    }

    public java.lang.String j() {
        java.lang.Object obj = this.f68012m;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f68012m = r17;
        }
        return r17;
    }

    public boolean k() {
        return (this.f68006d & 4) != 0;
    }

    public boolean l() {
        return (this.f68006d & 16) != 0;
    }

    public boolean m() {
        return (this.f68006d & 1) != 0;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: n */
    public com.tencent.mm.flutter.plugin.proto.l toBuilder() {
        if (this == f68004o) {
            return new com.tencent.mm.flutter.plugin.proto.l(null);
        }
        com.tencent.mm.flutter.plugin.proto.l lVar = new com.tencent.mm.flutter.plugin.proto.l(null);
        lVar.g(this);
        return lVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f68004o.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.m();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f68006d & 1) != 0) {
            k0Var.H(1, this.f68007e);
        }
        if ((this.f68006d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f68008f);
        }
        if ((this.f68006d & 4) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f68009g);
        }
        if ((this.f68006d & 8) != 0) {
            k0Var.J(4, i());
        }
        if ((this.f68006d & 16) != 0) {
            k0Var.x(5, this.f68011i);
        }
        if ((this.f68006d & 32) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 6, this.f68012m);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f68004o;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f68004o.toBuilder();
    }

    public m() {
        this.f68013n = (byte) -1;
        this.f68008f = "";
        this.f68009g = "";
        this.f68012m = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.l(r5Var, null);
    }

    public m(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
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
                                this.f68006d |= 1;
                                this.f68007e = d0Var.t();
                            } else if (F == 18) {
                                com.google.protobuf.y m17 = d0Var.m();
                                this.f68006d |= 2;
                                this.f68008f = m17;
                            } else if (F == 26) {
                                com.google.protobuf.y m18 = d0Var.m();
                                this.f68006d |= 4;
                                this.f68009g = m18;
                            } else if (F == 34) {
                                com.tencent.mm.flutter.plugin.proto.m0 builder = (this.f68006d & 8) != 0 ? this.f68010h.toBuilder() : null;
                                com.tencent.mm.flutter.plugin.proto.n0 n0Var = (com.tencent.mm.flutter.plugin.proto.n0) d0Var.v(com.tencent.mm.flutter.plugin.proto.n0.f68020n, t4Var);
                                this.f68010h = n0Var;
                                if (builder != null) {
                                    builder.f(n0Var);
                                    this.f68010h = builder.buildPartial();
                                }
                                this.f68006d |= 8;
                            } else if (F == 40) {
                                this.f68006d |= 16;
                                this.f68011i = d0Var.l();
                            } else if (F != 50) {
                                if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                com.google.protobuf.y m19 = d0Var.m();
                                this.f68006d |= 32;
                                this.f68012m = m19;
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
