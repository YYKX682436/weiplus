package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class MagicbrushBrand$MBApiFlutterCardInfo extends com.google.protobuf.l6 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo f67898i = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo();

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67899m = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    public int f67900d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f67901e;

    /* renamed from: f, reason: collision with root package name */
    public int f67902f;

    /* renamed from: g, reason: collision with root package name */
    public int f67903g;

    /* renamed from: h, reason: collision with root package name */
    public byte f67904h;

    /* renamed from: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 extends com.google.protobuf.g {
        @Override // com.google.protobuf.e9
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo(d0Var, t4Var, null);
        }
    }

    public MagicbrushBrand$MBApiFlutterCardInfo(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
        super(q5Var);
        this.f67904h = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo getDefaultInstance() {
        return f67898i;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.p0.f68060e;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder newBuilder() {
        return f67898i.toBuilder();
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67899m, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return f67899m;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) obj;
        if (hasIsRecCard() != magicbrushBrand$MBApiFlutterCardInfo.hasIsRecCard()) {
            return false;
        }
        if ((hasIsRecCard() && getIsRecCard() != magicbrushBrand$MBApiFlutterCardInfo.getIsRecCard()) || hasPos() != magicbrushBrand$MBApiFlutterCardInfo.hasPos()) {
            return false;
        }
        if ((!hasPos() || getPos() == magicbrushBrand$MBApiFlutterCardInfo.getPos()) && hasSubPos() == magicbrushBrand$MBApiFlutterCardInfo.hasSubPos()) {
            return (!hasSubPos() || getSubPos() == magicbrushBrand$MBApiFlutterCardInfo.getSubPos()) && this.unknownFields.equals(magicbrushBrand$MBApiFlutterCardInfo.unknownFields);
        }
        return false;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public boolean getIsRecCard() {
        return this.f67901e;
    }

    public com.google.protobuf.e9 getParserForType() {
        return f67899m;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public int getPos() {
        return this.f67902f;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int b17 = (this.f67900d & 1) != 0 ? 0 + com.google.protobuf.k0.b(1, this.f67901e) : 0;
        if ((this.f67900d & 2) != 0) {
            b17 += com.google.protobuf.k0.k(2, this.f67902f);
        }
        if ((this.f67900d & 4) != 0) {
            b17 += com.google.protobuf.k0.k(3, this.f67903g);
        }
        int serializedSize = b17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public int getSubPos() {
        return this.f67903g;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public boolean hasIsRecCard() {
        return (this.f67900d & 1) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public boolean hasPos() {
        return (this.f67900d & 2) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
    public boolean hasSubPos() {
        return (this.f67900d & 4) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasIsRecCard()) {
            hashCode = (((hashCode * 37) + 1) * 53) + com.google.protobuf.w6.a(getIsRecCard());
        }
        if (hasPos()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getPos();
        }
        if (hasSubPos()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getSubPos();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68061f;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67904h;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f67904h = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67900d & 1) != 0) {
            k0Var.x(1, this.f67901e);
        }
        if ((this.f67900d & 2) != 0) {
            k0Var.H(2, this.f67902f);
        }
        if ((this.f67900d & 4) != 0) {
            k0Var.H(3, this.f67903g);
        }
        this.unknownFields.writeTo(k0Var);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.q5 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder {

        /* renamed from: d, reason: collision with root package name */
        public int f67905d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f67906e;

        /* renamed from: f, reason: collision with root package name */
        public int f67907f;

        /* renamed from: g, reason: collision with root package name */
        public int f67908g;

        public Builder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(null);
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.f67898i;
        }

        public static final com.google.protobuf.r3 getDescriptor() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68060e;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder clearIsRecCard() {
            this.f67905d &= -2;
            this.f67906e = false;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder clearPos() {
            this.f67905d &= -3;
            this.f67907f = 0;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder clearSubPos() {
            this.f67905d &= -5;
            this.f67908g = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.j8, com.google.protobuf.r8
        public com.google.protobuf.r3 getDescriptorForType() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68060e;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public boolean getIsRecCard() {
            return this.f67906e;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public int getPos() {
            return this.f67907f;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public int getSubPos() {
            return this.f67908g;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public boolean hasIsRecCard() {
            return (this.f67905d & 1) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public boolean hasPos() {
            return (this.f67905d & 2) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfoOrBuilder
        public boolean hasSubPos() {
            return (this.f67905d & 4) != 0;
        }

        @Override // com.google.protobuf.q5
        public com.google.protobuf.j6 internalGetFieldAccessorTable() {
            com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68061f;
            j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder.class);
            return j6Var;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.p8
        public final boolean isInitialized() {
            return true;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setIsRecCard(boolean z17) {
            this.f67905d |= 1;
            this.f67906e = z17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setPos(int i17) {
            this.f67905d |= 2;
            this.f67907f = i17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setSubPos(int i17) {
            this.f67905d |= 4;
            this.f67908g = i17;
            onChanged();
            return this;
        }

        public Builder(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(r5Var);
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.f67898i;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.addRepeatedField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo build() {
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo buildPartial() {
            int i17;
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo(this, null);
            int i18 = this.f67905d;
            if ((i18 & 1) != 0) {
                magicbrushBrand$MBApiFlutterCardInfo.f67901e = this.f67906e;
                i17 = 1;
            } else {
                i17 = 0;
            }
            if ((i18 & 2) != 0) {
                magicbrushBrand$MBApiFlutterCardInfo.f67902f = this.f67907f;
                i17 |= 2;
            }
            if ((i18 & 4) != 0) {
                magicbrushBrand$MBApiFlutterCardInfo.f67903g = this.f67908g;
                i17 |= 4;
            }
            magicbrushBrand$MBApiFlutterCardInfo.f67900d = i17;
            onBuilt();
            return magicbrushBrand$MBApiFlutterCardInfo;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder clearField(com.google.protobuf.b4 b4Var) {
            super.clearField(b4Var);
            return this;
        }

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo getDefaultInstanceForType() {
            return com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.setField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
            super.setRepeatedField(b4Var, i17, obj);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder setUnknownFields(com.google.protobuf.wa waVar) {
            super.setUnknownFields(waVar);
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder m71clearOneof(com.google.protobuf.g4 g4Var) {
            super.m71clearOneof(g4Var);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.a
        /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder m76mergeUnknownFields(com.google.protobuf.wa waVar) {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder) super.m76mergeUnknownFields(waVar);
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder m70clear() {
            super.m70clear();
            this.f67906e = false;
            int i17 = this.f67905d & (-2);
            this.f67907f = 0;
            this.f67908g = 0;
            this.f67905d = i17 & (-3) & (-5);
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder m75clone() {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder) super.m75clone();
        }

        @Override // com.google.protobuf.a, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder mergeFrom(com.google.protobuf.k8 k8Var) {
            if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) {
                return mergeFrom((com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) k8Var);
            }
            super.mergeFrom(k8Var);
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder mergeFrom(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo) {
            if (magicbrushBrand$MBApiFlutterCardInfo == com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.getDefaultInstance()) {
                return this;
            }
            if (magicbrushBrand$MBApiFlutterCardInfo.hasIsRecCard()) {
                setIsRecCard(magicbrushBrand$MBApiFlutterCardInfo.getIsRecCard());
            }
            if (magicbrushBrand$MBApiFlutterCardInfo.hasPos()) {
                setPos(magicbrushBrand$MBApiFlutterCardInfo.getPos());
            }
            if (magicbrushBrand$MBApiFlutterCardInfo.hasSubPos()) {
                setSubPos(magicbrushBrand$MBApiFlutterCardInfo.getSubPos());
            }
            m76mergeUnknownFields(((com.google.protobuf.l6) magicbrushBrand$MBApiFlutterCardInfo).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
        @Override // com.google.protobuf.a, com.google.protobuf.n8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder mergeFrom(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.e9 r1 = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.f67899m     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo r3 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
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
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo r4 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder.mergeFrom(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo$Builder");
        }
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder newBuilder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo magicbrushBrand$MBApiFlutterCardInfo) {
        return f67898i.toBuilder().mergeFrom(magicbrushBrand$MBApiFlutterCardInfo);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(byteBuffer, t4Var);
    }

    public MagicbrushBrand$MBApiFlutterCardInfo() {
        this.f67904h = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67899m, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(com.google.protobuf.y yVar) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo getDefaultInstanceForType() {
        return f67898i;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder toBuilder() {
        return this == f67898i ? new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder(null) : new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder(null).mergeFrom(this);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo.Builder(r5Var, null);
    }

    public MagicbrushBrand$MBApiFlutterCardInfo(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
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
                            this.f67900d |= 1;
                            this.f67901e = d0Var.l();
                        } else if (F == 16) {
                            this.f67900d |= 2;
                            this.f67902f = d0Var.t();
                        } else if (F != 24) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f67900d |= 4;
                            this.f67903g = d0Var.t();
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

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(byte[] bArr) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(bArr);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) f67899m.parseFrom(bArr, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseWithIOException(f67899m, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseWithIOException(f67899m, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(com.google.protobuf.d0 d0Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseWithIOException(f67899m, d0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterCardInfo) com.google.protobuf.l6.parseWithIOException(f67899m, d0Var, t4Var);
    }
}
