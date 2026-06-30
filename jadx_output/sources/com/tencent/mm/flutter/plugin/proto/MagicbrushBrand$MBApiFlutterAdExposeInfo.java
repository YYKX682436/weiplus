package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class MagicbrushBrand$MBApiFlutterAdExposeInfo extends com.google.protobuf.l6 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo f67885m = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo();

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67886n = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    public int f67887d;

    /* renamed from: e, reason: collision with root package name */
    public int f67888e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f67889f;

    /* renamed from: g, reason: collision with root package name */
    public int f67890g;

    /* renamed from: h, reason: collision with root package name */
    public long f67891h;

    /* renamed from: i, reason: collision with root package name */
    public byte f67892i;

    /* renamed from: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 extends com.google.protobuf.g {
        @Override // com.google.protobuf.e9
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo(d0Var, t4Var, null);
        }
    }

    public MagicbrushBrand$MBApiFlutterAdExposeInfo(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
        super(q5Var);
        this.f67892i = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo getDefaultInstance() {
        return f67885m;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.p0.f68062g;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder newBuilder() {
        return f67885m.toBuilder();
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67886n, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return f67886n;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) obj;
        if (hasCardType() != magicbrushBrand$MBApiFlutterAdExposeInfo.hasCardType()) {
            return false;
        }
        if ((hasCardType() && getCardType() != magicbrushBrand$MBApiFlutterAdExposeInfo.getCardType()) || hasFrameSetName() != magicbrushBrand$MBApiFlutterAdExposeInfo.hasFrameSetName()) {
            return false;
        }
        if ((hasFrameSetName() && !getFrameSetName().equals(magicbrushBrand$MBApiFlutterAdExposeInfo.getFrameSetName())) || hasExposeType() != magicbrushBrand$MBApiFlutterAdExposeInfo.hasExposeType()) {
            return false;
        }
        if ((!hasExposeType() || getExposeType() == magicbrushBrand$MBApiFlutterAdExposeInfo.getExposeType()) && hasExposeTime() == magicbrushBrand$MBApiFlutterAdExposeInfo.hasExposeTime()) {
            return (!hasExposeTime() || getExposeTime() == magicbrushBrand$MBApiFlutterAdExposeInfo.getExposeTime()) && this.unknownFields.equals(magicbrushBrand$MBApiFlutterAdExposeInfo.unknownFields);
        }
        return false;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public int getCardType() {
        return this.f67888e;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public long getExposeTime() {
        return this.f67891h;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public int getExposeType() {
        return this.f67890g;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public java.lang.String getFrameSetName() {
        java.lang.Object obj = this.f67889f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67889f = r17;
        }
        return r17;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public com.google.protobuf.y getFrameSetNameBytes() {
        java.lang.Object obj = this.f67889f;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.f67889f = h17;
        return h17;
    }

    public com.google.protobuf.e9 getParserForType() {
        return f67886n;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int k17 = (this.f67887d & 1) != 0 ? 0 + com.google.protobuf.k0.k(1, this.f67888e) : 0;
        if ((this.f67887d & 2) != 0) {
            k17 += com.google.protobuf.l6.computeStringSize(2, this.f67889f);
        }
        if ((this.f67887d & 4) != 0) {
            k17 += com.google.protobuf.k0.k(3, this.f67890g);
        }
        if ((this.f67887d & 8) != 0) {
            k17 += com.google.protobuf.k0.s(4, this.f67891h);
        }
        int serializedSize = k17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public boolean hasCardType() {
        return (this.f67887d & 1) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public boolean hasExposeTime() {
        return (this.f67887d & 8) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public boolean hasExposeType() {
        return (this.f67887d & 4) != 0;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
    public boolean hasFrameSetName() {
        return (this.f67887d & 2) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasCardType()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCardType();
        }
        if (hasFrameSetName()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getFrameSetName().hashCode();
        }
        if (hasExposeType()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getExposeType();
        }
        if (hasExposeTime()) {
            hashCode = (((hashCode * 37) + 4) * 53) + com.google.protobuf.w6.b(getExposeTime());
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68063h;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67892i;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f67892i = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67887d & 1) != 0) {
            k0Var.H(1, this.f67888e);
        }
        if ((this.f67887d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f67889f);
        }
        if ((this.f67887d & 4) != 0) {
            k0Var.H(3, this.f67890g);
        }
        if ((this.f67887d & 8) != 0) {
            k0Var.T(4, this.f67891h);
        }
        this.unknownFields.writeTo(k0Var);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.q5 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder {

        /* renamed from: d, reason: collision with root package name */
        public int f67893d;

        /* renamed from: e, reason: collision with root package name */
        public int f67894e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.Object f67895f;

        /* renamed from: g, reason: collision with root package name */
        public int f67896g;

        /* renamed from: h, reason: collision with root package name */
        public long f67897h;

        public Builder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(null);
            this.f67895f = "";
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.f67885m;
        }

        public static final com.google.protobuf.r3 getDescriptor() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68062g;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder clearCardType() {
            this.f67893d &= -2;
            this.f67894e = 0;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder clearExposeTime() {
            this.f67893d &= -9;
            this.f67897h = 0L;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder clearExposeType() {
            this.f67893d &= -5;
            this.f67896g = 0;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder clearFrameSetName() {
            this.f67893d &= -3;
            this.f67895f = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.getDefaultInstance().getFrameSetName();
            onChanged();
            return this;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public int getCardType() {
            return this.f67894e;
        }

        @Override // com.google.protobuf.j8, com.google.protobuf.r8
        public com.google.protobuf.r3 getDescriptorForType() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68062g;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public long getExposeTime() {
            return this.f67897h;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public int getExposeType() {
            return this.f67896g;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public java.lang.String getFrameSetName() {
            java.lang.Object obj = this.f67895f;
            if (obj instanceof java.lang.String) {
                return (java.lang.String) obj;
            }
            com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
            java.lang.String r17 = yVar.r();
            if (yVar.l()) {
                this.f67895f = r17;
            }
            return r17;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public com.google.protobuf.y getFrameSetNameBytes() {
            java.lang.Object obj = this.f67895f;
            if (!(obj instanceof java.lang.String)) {
                return (com.google.protobuf.y) obj;
            }
            com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
            this.f67895f = h17;
            return h17;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public boolean hasCardType() {
            return (this.f67893d & 1) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public boolean hasExposeTime() {
            return (this.f67893d & 8) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public boolean hasExposeType() {
            return (this.f67893d & 4) != 0;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfoOrBuilder
        public boolean hasFrameSetName() {
            return (this.f67893d & 2) != 0;
        }

        @Override // com.google.protobuf.q5
        public com.google.protobuf.j6 internalGetFieldAccessorTable() {
            com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68063h;
            j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder.class);
            return j6Var;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.p8
        public final boolean isInitialized() {
            return true;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setCardType(int i17) {
            this.f67893d |= 1;
            this.f67894e = i17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setExposeTime(long j17) {
            this.f67893d |= 8;
            this.f67897h = j17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setExposeType(int i17) {
            this.f67893d |= 4;
            this.f67896g = i17;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setFrameSetName(java.lang.String str) {
            str.getClass();
            this.f67893d |= 2;
            this.f67895f = str;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setFrameSetNameBytes(com.google.protobuf.y yVar) {
            yVar.getClass();
            this.f67893d |= 2;
            this.f67895f = yVar;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.addRepeatedField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo build() {
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo buildPartial() {
            int i17;
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo(this, null);
            int i18 = this.f67893d;
            if ((i18 & 1) != 0) {
                magicbrushBrand$MBApiFlutterAdExposeInfo.f67888e = this.f67894e;
                i17 = 1;
            } else {
                i17 = 0;
            }
            if ((i18 & 2) != 0) {
                i17 |= 2;
            }
            magicbrushBrand$MBApiFlutterAdExposeInfo.f67889f = this.f67895f;
            if ((i18 & 4) != 0) {
                magicbrushBrand$MBApiFlutterAdExposeInfo.f67890g = this.f67896g;
                i17 |= 4;
            }
            if ((i18 & 8) != 0) {
                magicbrushBrand$MBApiFlutterAdExposeInfo.f67891h = this.f67897h;
                i17 |= 8;
            }
            magicbrushBrand$MBApiFlutterAdExposeInfo.f67887d = i17;
            onBuilt();
            return magicbrushBrand$MBApiFlutterAdExposeInfo;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder clearField(com.google.protobuf.b4 b4Var) {
            super.clearField(b4Var);
            return this;
        }

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo getDefaultInstanceForType() {
            return com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.setField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
            super.setRepeatedField(b4Var, i17, obj);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder setUnknownFields(com.google.protobuf.wa waVar) {
            super.setUnknownFields(waVar);
            return this;
        }

        public Builder(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(r5Var);
            this.f67895f = "";
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.f67885m;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder m79clearOneof(com.google.protobuf.g4 g4Var) {
            super.m79clearOneof(g4Var);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.a
        /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder m84mergeUnknownFields(com.google.protobuf.wa waVar) {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder) super.m84mergeUnknownFields(waVar);
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder m78clear() {
            super.m78clear();
            this.f67894e = 0;
            int i17 = this.f67893d & (-2);
            this.f67895f = "";
            this.f67896g = 0;
            this.f67897h = 0L;
            this.f67893d = i17 & (-3) & (-5) & (-9);
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder m67clone() {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder) super.m83clone();
        }

        @Override // com.google.protobuf.a, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder mergeFrom(com.google.protobuf.k8 k8Var) {
            if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) {
                return mergeFrom((com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) k8Var);
            }
            super.mergeFrom(k8Var);
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder mergeFrom(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo) {
            if (magicbrushBrand$MBApiFlutterAdExposeInfo == com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.getDefaultInstance()) {
                return this;
            }
            if (magicbrushBrand$MBApiFlutterAdExposeInfo.hasCardType()) {
                setCardType(magicbrushBrand$MBApiFlutterAdExposeInfo.getCardType());
            }
            if (magicbrushBrand$MBApiFlutterAdExposeInfo.hasFrameSetName()) {
                this.f67893d |= 2;
                this.f67895f = magicbrushBrand$MBApiFlutterAdExposeInfo.f67889f;
                onChanged();
            }
            if (magicbrushBrand$MBApiFlutterAdExposeInfo.hasExposeType()) {
                setExposeType(magicbrushBrand$MBApiFlutterAdExposeInfo.getExposeType());
            }
            if (magicbrushBrand$MBApiFlutterAdExposeInfo.hasExposeTime()) {
                setExposeTime(magicbrushBrand$MBApiFlutterAdExposeInfo.getExposeTime());
            }
            m84mergeUnknownFields(((com.google.protobuf.l6) magicbrushBrand$MBApiFlutterAdExposeInfo).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
        @Override // com.google.protobuf.a, com.google.protobuf.n8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder mergeFrom(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.e9 r1 = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.f67886n     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo r3 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
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
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo r4 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder.mergeFrom(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo$Builder");
        }
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder newBuilder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo magicbrushBrand$MBApiFlutterAdExposeInfo) {
        return f67885m.toBuilder().mergeFrom(magicbrushBrand$MBApiFlutterAdExposeInfo);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(byteBuffer, t4Var);
    }

    public MagicbrushBrand$MBApiFlutterAdExposeInfo() {
        this.f67892i = (byte) -1;
        this.f67889f = "";
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseDelimitedWithIOException(f67886n, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(com.google.protobuf.y yVar) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo getDefaultInstanceForType() {
        return f67885m;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder toBuilder() {
        return this == f67885m ? new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder(null) : new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder(null).mergeFrom(this);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo.Builder(r5Var, null);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(byte[] bArr) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(bArr);
    }

    public MagicbrushBrand$MBApiFlutterAdExposeInfo(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
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
                            this.f67887d |= 1;
                            this.f67888e = d0Var.t();
                        } else if (F == 18) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f67887d |= 2;
                            this.f67889f = m17;
                        } else if (F == 24) {
                            this.f67887d |= 4;
                            this.f67890g = d0Var.t();
                        } else if (F != 32) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f67887d |= 8;
                            this.f67891h = d0Var.H();
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

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) f67886n.parseFrom(bArr, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseWithIOException(f67886n, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseWithIOException(f67886n, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(com.google.protobuf.d0 d0Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseWithIOException(f67886n, d0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiFlutterAdExposeInfo) com.google.protobuf.l6.parseWithIOException(f67886n, d0Var, t4Var);
    }
}
