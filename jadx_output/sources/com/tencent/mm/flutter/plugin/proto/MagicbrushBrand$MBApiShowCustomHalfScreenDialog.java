package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class MagicbrushBrand$MBApiShowCustomHalfScreenDialog extends com.google.protobuf.l6 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog f67918g = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog();

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.e9 f67919h = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.AnonymousClass1();

    /* renamed from: d, reason: collision with root package name */
    public int f67920d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f67921e;

    /* renamed from: f, reason: collision with root package name */
    public byte f67922f;

    /* renamed from: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 extends com.google.protobuf.g {
        @Override // com.google.protobuf.e9
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog(d0Var, t4Var, null);
        }
    }

    public MagicbrushBrand$MBApiShowCustomHalfScreenDialog(com.google.protobuf.q5 q5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
        super(q5Var);
        this.f67922f = (byte) -1;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog getDefaultInstance() {
        return f67918g;
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.p0.f68058c;
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder newBuilder() {
        return f67918g.toBuilder();
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseDelimitedWithIOException(f67919h, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return f67919h;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog)) {
            return super.equals(obj);
        }
        com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) obj;
        if (hasExtra() != magicbrushBrand$MBApiShowCustomHalfScreenDialog.hasExtra()) {
            return false;
        }
        return (!hasExtra() || getExtra().equals(magicbrushBrand$MBApiShowCustomHalfScreenDialog.getExtra())) && this.unknownFields.equals(magicbrushBrand$MBApiShowCustomHalfScreenDialog.unknownFields);
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
    public java.lang.String getExtra() {
        java.lang.Object obj = this.f67921e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f67921e = r17;
        }
        return r17;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
    public com.google.protobuf.y getExtraBytes() {
        java.lang.Object obj = this.f67921e;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.f67921e = h17;
        return h17;
    }

    public com.google.protobuf.e9 getParserForType() {
        return f67919h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = ((this.f67920d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f67921e) : 0) + this.unknownFields.getSerializedSize();
        this.memoizedSize = computeStringSize;
        return computeStringSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
    public boolean hasExtra() {
        return (this.f67920d & 1) != 0;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + getDescriptor().hashCode();
        if (hasExtra()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getExtra().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68059d;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f67922f;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f67922f = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f67920d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f67921e);
        }
        this.unknownFields.writeTo(k0Var);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.q5 implements com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder {

        /* renamed from: d, reason: collision with root package name */
        public int f67923d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.Object f67924e;

        public Builder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(null);
            this.f67924e = "";
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.f67918g;
        }

        public static final com.google.protobuf.r3 getDescriptor() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68058c;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder clearExtra() {
            this.f67923d &= -2;
            this.f67924e = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.getDefaultInstance().getExtra();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.j8, com.google.protobuf.r8
        public com.google.protobuf.r3 getDescriptorForType() {
            return com.tencent.mm.flutter.plugin.proto.p0.f68058c;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
        public java.lang.String getExtra() {
            java.lang.Object obj = this.f67924e;
            if (obj instanceof java.lang.String) {
                return (java.lang.String) obj;
            }
            com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
            java.lang.String r17 = yVar.r();
            if (yVar.l()) {
                this.f67924e = r17;
            }
            return r17;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
        public com.google.protobuf.y getExtraBytes() {
            java.lang.Object obj = this.f67924e;
            if (!(obj instanceof java.lang.String)) {
                return (com.google.protobuf.y) obj;
            }
            com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
            this.f67924e = h17;
            return h17;
        }

        @Override // com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialogOrBuilder
        public boolean hasExtra() {
            return (this.f67923d & 1) != 0;
        }

        @Override // com.google.protobuf.q5
        public com.google.protobuf.j6 internalGetFieldAccessorTable() {
            com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.p0.f68059d;
            j6Var.c(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.class, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder.class);
            return j6Var;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.p8
        public final boolean isInitialized() {
            return true;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder setExtra(java.lang.String str) {
            str.getClass();
            this.f67923d |= 1;
            this.f67924e = str;
            onChanged();
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder setExtraBytes(com.google.protobuf.y yVar) {
            yVar.getClass();
            this.f67923d |= 1;
            this.f67924e = yVar;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.addRepeatedField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog build() {
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
        }

        @Override // com.google.protobuf.n8, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog buildPartial() {
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog = new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog(this, null);
            int i17 = (this.f67923d & 1) == 0 ? 0 : 1;
            magicbrushBrand$MBApiShowCustomHalfScreenDialog.f67921e = this.f67924e;
            magicbrushBrand$MBApiShowCustomHalfScreenDialog.f67920d = i17;
            onBuilt();
            return magicbrushBrand$MBApiShowCustomHalfScreenDialog;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder clearField(com.google.protobuf.b4 b4Var) {
            super.clearField(b4Var);
            return this;
        }

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog getDefaultInstanceForType() {
            return com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.getDefaultInstance();
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
            super.setField(b4Var, obj);
            return this;
        }

        @Override // com.google.protobuf.q5
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
            super.setRepeatedField(b4Var, i17, obj);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.j8
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder setUnknownFields(com.google.protobuf.wa waVar) {
            super.setUnknownFields(waVar);
            return this;
        }

        public Builder(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
            super(r5Var);
            this.f67924e = "";
            com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.f67918g;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder m87clearOneof(com.google.protobuf.g4 g4Var) {
            super.m87clearOneof(g4Var);
            return this;
        }

        @Override // com.google.protobuf.q5, com.google.protobuf.a
        /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
        public final com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder m92mergeUnknownFields(com.google.protobuf.wa waVar) {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder) super.m92mergeUnknownFields(waVar);
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder m86clear() {
            super.m86clear();
            this.f67924e = "";
            this.f67923d &= -2;
            return this;
        }

        @Override // com.google.protobuf.q5
        /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder m91clone() {
            return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder) super.m91clone();
        }

        @Override // com.google.protobuf.a, com.google.protobuf.j8
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder mergeFrom(com.google.protobuf.k8 k8Var) {
            if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) {
                return mergeFrom((com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) k8Var);
            }
            super.mergeFrom(k8Var);
            return this;
        }

        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder mergeFrom(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog) {
            if (magicbrushBrand$MBApiShowCustomHalfScreenDialog == com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.getDefaultInstance()) {
                return this;
            }
            if (magicbrushBrand$MBApiShowCustomHalfScreenDialog.hasExtra()) {
                this.f67923d |= 1;
                this.f67924e = magicbrushBrand$MBApiShowCustomHalfScreenDialog.f67921e;
                onChanged();
            }
            m92mergeUnknownFields(((com.google.protobuf.l6) magicbrushBrand$MBApiShowCustomHalfScreenDialog).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
        @Override // com.google.protobuf.a, com.google.protobuf.n8
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder mergeFrom(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
            /*
                r2 = this;
                r0 = 0
                com.google.protobuf.e9 r1 = com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.f67919h     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog r3 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
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
                com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog r4 = (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder.mergeFrom(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog$Builder");
        }
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder newBuilder(com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog magicbrushBrand$MBApiShowCustomHalfScreenDialog) {
        return f67918g.toBuilder().mergeFrom(magicbrushBrand$MBApiShowCustomHalfScreenDialog);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(byteBuffer, t4Var);
    }

    public MagicbrushBrand$MBApiShowCustomHalfScreenDialog() {
        this.f67922f = (byte) -1;
        this.f67921e = "";
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseDelimitedWithIOException(f67919h, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(com.google.protobuf.y yVar) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(yVar);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog getDefaultInstanceForType() {
        return f67918g;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder newBuilderForType() {
        return newBuilder();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder toBuilder() {
        return this == f67918g ? new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder(null) : new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder(null).mergeFrom(this);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(yVar, t4Var);
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog.Builder(r5Var, null);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(byte[] bArr) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(bArr);
    }

    public MagicbrushBrand$MBApiShowCustomHalfScreenDialog(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$1 magicbrushBrand$1) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f67920d = 1 | this.f67920d;
                            this.f67921e = m17;
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

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) f67919h.parseFrom(bArr, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(java.io.InputStream inputStream) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseWithIOException(f67919h, inputStream);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseWithIOException(f67919h, inputStream, t4Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(com.google.protobuf.d0 d0Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseWithIOException(f67919h, d0Var);
    }

    public static com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (com.tencent.mm.flutter.plugin.proto.MagicbrushBrand$MBApiShowCustomHalfScreenDialog) com.google.protobuf.l6.parseWithIOException(f67919h, d0Var, t4Var);
    }
}
