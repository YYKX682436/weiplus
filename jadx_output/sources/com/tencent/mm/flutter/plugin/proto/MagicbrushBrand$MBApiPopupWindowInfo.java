package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class MagicbrushBrand$MBApiPopupWindowInfo extends com.google.protobuf.l6 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo f67909h = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67910i = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    public int f67911d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67912e;

    /* renamed from: f, reason: collision with root package name */
    public int f67913f;

    /* renamed from: g, reason: collision with root package name */
    public byte f67914g;

    /* renamed from: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 extends com.google.protobuf.g {
        @Override // com.google.protobuf.e9
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo(d0Var, t4Var, null);
        }
    }

    public MagicbrushBrand$MBApiPopupWindowInfo(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
        super(q5Var);
        this.f67914g = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo getDefaultInstance() {
        return f67909h;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.p0.f68056a;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder newBuilder() {
        return f67909h.toBuilder();
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67910i, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return f67910i;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) obj;
        if (hasMask() != magicbrushBrand$MBApiPopupWindowInfo.hasMask()) {
            return false;
        }
        if ((!hasMask() || getMask() == magicbrushBrand$MBApiPopupWindowInfo.getMask()) && hasMaskColor() == magicbrushBrand$MBApiPopupWindowInfo.hasMaskColor()) {
            return (!hasMaskColor() || getMaskColor() == magicbrushBrand$MBApiPopupWindowInfo.getMaskColor()) && this.unknownFields.equals(magicbrushBrand$MBApiPopupWindowInfo.unknownFields);
        }
        return false;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
    public boolean getMask() {
        return this.f67912e;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
    public int getMaskColor() {
        return this.f67913f;
    }

    public com.google.protobuf.e9 getParserForType() {
        return f67910i;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f67911d & 1) != 0 ? 0 + com.google.protobuf.k0.b(1, this.f67912e) : 0;
        if ((this.f67911d & 2) != 0) {
            b17 += com.google.protobuf.k0.k(2, this.f67913f);
        }
        int serializedSize = b17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
    public boolean hasMask() {
        return (this.f67911d & 1) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
    public boolean hasMaskColor() {
        return (this.f67911d & 2) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasMask()) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.a(getMask());
        }
        if (hasMaskColor()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getMaskColor();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68057b;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67914g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f67914g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67911d & 1) != 0) {
            k0Var.x(1, this.f67912e);
        }
        if ((this.f67911d & 2) != 0) {
            k0Var.H(2, this.f67913f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.q5 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder {

        /* renamed from: d, reason: collision with root package name */
        public int f67915d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f67916e;

        /* renamed from: f, reason: collision with root package name */
        public int f67917f;

        public Builder(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(r5Var);
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.f67909h;
        }

        public static final com.google.protobuf.r3 getDescriptor() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68056a;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder clearMask() {
            this.f67915d &= -2;
            this.f67916e = false;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder clearMaskColor() {
            this.f67915d &= -3;
            this.f67917f = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.j8, com.google.protobuf.r8
        public com.google.protobuf.r3 getDescriptorForType() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68056a;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
        public boolean getMask() {
            return this.f67916e;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
        public int getMaskColor() {
            return this.f67917f;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
        public boolean hasMask() {
            return (this.f67915d & 1) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfoOrBuilder
        public boolean hasMaskColor() {
            return (this.f67915d & 2) != 0;
        }

        @Override // com.google.protobuf.q5
        public com.google.protobuf.j6 internalGetFieldAccessorTable() {
            com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68057b;
            j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder.class);
            return j6Var;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.p8
        public final boolean isInitialized() {
            return true;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder setMask(boolean z17) {
            this.f67915d |= 1;
            this.f67916e = z17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder setMaskColor(int i17) {
            this.f67915d |= 2;
            this.f67917f = i17;
            onChanged();
            return this;
        }

        public Builder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(null);
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.f67909h;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.addRepeatedField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo build() {
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo buildPartial() {
            int i17;
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo(this, null);
            int i18 = this.f67915d;
            if ((i18 & 1) != 0) {
                magicbrushBrand$MBApiPopupWindowInfo.f67912e = this.f67916e;
                i17 = 1;
            } else {
                i17 = 0;
            }
            if ((i18 & 2) != 0) {
                magicbrushBrand$MBApiPopupWindowInfo.f67913f = this.f67917f;
                i17 |= 2;
            }
            magicbrushBrand$MBApiPopupWindowInfo.f67911d = i17;
            onBuilt();
            return magicbrushBrand$MBApiPopupWindowInfo;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder clearField(com.google.protobuf.b4 b4Var) {
            super.clearField(b4Var);
            return this;
        }

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo getDefaultInstanceForType() {
            return com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.setField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
            super.setRepeatedField(b4Var, i17, obj);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder setUnknownFields(com.google.protobuf.wa waVar) {
            super.setUnknownFields(waVar);
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder m79clearOneof(com.google.protobuf.g4 g4Var) {
            super.m79clearOneof(g4Var);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.a
        /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder m84mergeUnknownFields(com.google.protobuf.wa waVar) {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder) super.m84mergeUnknownFields(waVar);
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder m78clear() {
            super.m78clear();
            this.f67916e = false;
            int i17 = this.f67915d & (-2);
            this.f67917f = 0;
            this.f67915d = i17 & (-3);
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder m83clone() {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder) super.m83clone();
        }

        @Override // com.google.protobuf.a, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder mergeFrom(com.google.protobuf.k8 k8Var) {
            if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) {
                return mergeFrom((com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) k8Var);
            }
            super.mergeFrom(k8Var);
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder mergeFrom(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo) {
            if (magicbrushBrand$MBApiPopupWindowInfo == com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.getDefaultInstance()) {
                return this;
            }
            if (magicbrushBrand$MBApiPopupWindowInfo.hasMask()) {
                setMask(magicbrushBrand$MBApiPopupWindowInfo.getMask());
            }
            if (magicbrushBrand$MBApiPopupWindowInfo.hasMaskColor()) {
                setMaskColor(magicbrushBrand$MBApiPopupWindowInfo.getMaskColor());
            }
            m84mergeUnknownFields(((com.google.protobuf.l6) magicbrushBrand$MBApiPopupWindowInfo).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
        @Override // com.google.protobuf.a, com.google.protobuf.n8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder mergeFrom(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.e9 r1 = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.f67910i     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo r3 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                if (r3 == 0) goto Le
                r2.mergeFrom(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1d
            L11:
                r3 = move-exception
                com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> Lf
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo r4 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) r4     // Catch: java.lang.Throwable -> Lf
                java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1b
                throw r3     // Catch: java.lang.Throwable -> L1b
            L1b:
                r3 = move-exception
                r0 = r4
            L1d:
                if (r0 == 0) goto L22
                r2.mergeFrom(r0)
            L22:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder.mergeFrom(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo$Builder");
        }
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder newBuilder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo magicbrushBrand$MBApiPopupWindowInfo) {
        return f67909h.toBuilder().mergeFrom(magicbrushBrand$MBApiPopupWindowInfo);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(byteBuffer, t4Var);
    }

    public MagicbrushBrand$MBApiPopupWindowInfo() {
        this.f67914g = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67910i, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(com.google.protobuf.y yVar) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo getDefaultInstanceForType() {
        return f67909h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder toBuilder() {
        return this == f67909h ? new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder(null) : new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder(null).mergeFrom(this);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo.Builder(r5Var, null);
    }

    public MagicbrushBrand$MBApiPopupWindowInfo(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
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
                            this.f67911d |= 1;
                            this.f67912e = d0Var.l();
                        } else if (F != 16) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f67911d |= 2;
                            this.f67913f = d0Var.t();
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

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(byte[] bArr) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(bArr);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) f67910i.parseFrom(bArr, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseWithIOException(f67910i, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseWithIOException(f67910i, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(com.google.protobuf.d0 d0Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseWithIOException(f67910i, d0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiPopupWindowInfo) com.google.protobuf.l6.parseWithIOException(f67910i, d0Var, t4Var);
    }
}
