package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class s extends com.google.protobuf.l6 implements com.google.protobuf.r8 {
    public static final int OFFSETHEIGHT_FIELD_NUMBER = 1;
    public static final int OFFSETTOPFROMLISTSTART_FIELD_NUMBER = 3;
    public static final int OFFSETTOP_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int offsetHeight_;
    private int offsetTopFromListStart_;
    private int offsetTop_;
    private static final com.tencent.mm.flutter.plugin.proto.s DEFAULT_INSTANCE = new com.tencent.mm.flutter.plugin.proto.s();

    @java.lang.Deprecated
    public static final com.google.protobuf.e9 PARSER = new com.tencent.mm.flutter.plugin.proto.q();

    public static com.tencent.mm.flutter.plugin.proto.s getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68037i;
    }

    public static com.tencent.mm.flutter.plugin.proto.r newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.s)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.s sVar = (com.tencent.mm.flutter.plugin.proto.s) obj;
        if (hasOffsetHeight() != sVar.hasOffsetHeight()) {
            return false;
        }
        if ((hasOffsetHeight() && getOffsetHeight() != sVar.getOffsetHeight()) || hasOffsetTop() != sVar.hasOffsetTop()) {
            return false;
        }
        if ((!hasOffsetTop() || getOffsetTop() == sVar.getOffsetTop()) && hasOffsetTopFromListStart() == sVar.hasOffsetTopFromListStart()) {
            return (!hasOffsetTopFromListStart() || getOffsetTopFromListStart() == sVar.getOffsetTopFromListStart()) && this.unknownFields.equals(sVar.unknownFields);
        }
        return false;
    }

    public int getOffsetHeight() {
        return this.offsetHeight_;
    }

    public int getOffsetTop() {
        return this.offsetTop_;
    }

    public int getOffsetTopFromListStart() {
        return this.offsetTopFromListStart_;
    }

    public com.google.protobuf.e9 getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.bitField0_ & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.offsetHeight_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            k17 += com.google.protobuf.k0.k(2, this.offsetTop_);
        }
        if ((this.bitField0_ & 4) != 0) {
            k17 += com.google.protobuf.k0.k(3, this.offsetTopFromListStart_);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public boolean hasOffsetHeight() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOffsetTop() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOffsetTopFromListStart() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasOffsetHeight()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getOffsetHeight();
        }
        if (hasOffsetTop()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getOffsetTop();
        }
        if (hasOffsetTopFromListStart()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getOffsetTopFromListStart();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68038j;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.s.class, com.tencent.mm.flutter.plugin.proto.r.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.memoizedIsInitialized;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        if (!hasOffsetHeight()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (hasOffsetTop()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.s();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.bitField0_ & 1) != 0) {
            k0Var.H(1, this.offsetHeight_);
        }
        if ((this.bitField0_ & 2) != 0) {
            k0Var.H(2, this.offsetTop_);
        }
        if ((this.bitField0_ & 4) != 0) {
            k0Var.H(3, this.offsetTopFromListStart_);
        }
        this.unknownFields.writeTo(k0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.r newBuilder(com.tencent.mm.flutter.plugin.proto.s sVar) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sVar);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(byteBuffer, t4Var);
    }

    private s(com.google.protobuf.q5 q5Var) {
        super(q5Var);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseDelimitedWithIOException(PARSER, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(com.google.protobuf.y yVar) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.s getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.r toBuilder() {
        com.tencent.mm.flutter.plugin.proto.g gVar = null;
        return this == DEFAULT_INSTANCE ? new com.tencent.mm.flutter.plugin.proto.r() : new com.tencent.mm.flutter.plugin.proto.r().mergeFrom(this);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.r newBuilderForType() {
        return newBuilder();
    }

    private s() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(byte[] bArr) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.l6
    public com.tencent.mm.flutter.plugin.proto.r newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.r(r5Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) PARSER.parseFrom(bArr, t4Var);
    }

    private s(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
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
                            this.bitField0_ |= 1;
                            this.offsetHeight_ = d0Var.t();
                        } else if (F == 16) {
                            this.bitField0_ |= 2;
                            this.offsetTop_ = d0Var.t();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.bitField0_ |= 4;
                            this.offsetTopFromListStart_ = d0Var.t();
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

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseWithIOException(PARSER, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(com.google.protobuf.d0 d0Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.s parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.s) com.google.protobuf.l6.parseWithIOException(PARSER, d0Var, t4Var);
    }
}
