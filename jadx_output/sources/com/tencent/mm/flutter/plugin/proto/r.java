package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class r extends com.google.protobuf.q5 implements com.google.protobuf.r8 {
    private int bitField0_;
    private int offsetHeight_;
    private int offsetTopFromListStart_;
    private int offsetTop_;

    private r() {
        super(null);
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68037i;
    }

    private void maybeForceBuilderInitialization() {
        boolean unused;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    public com.tencent.mm.flutter.plugin.proto.r clearOffsetHeight() {
        this.bitField0_ &= -2;
        this.offsetHeight_ = 0;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.r clearOffsetTop() {
        this.bitField0_ &= -3;
        this.offsetTop_ = 0;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.r clearOffsetTopFromListStart() {
        this.bitField0_ &= -5;
        this.offsetTopFromListStart_ = 0;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68037i;
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

    public boolean hasOffsetHeight() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOffsetTop() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOffsetTopFromListStart() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68038j;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.s.class, com.tencent.mm.flutter.plugin.proto.r.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return hasOffsetHeight() && hasOffsetTop();
    }

    public com.tencent.mm.flutter.plugin.proto.r setOffsetHeight(int i17) {
        this.bitField0_ |= 1;
        this.offsetHeight_ = i17;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.r setOffsetTop(int i17) {
        this.bitField0_ |= 2;
        this.offsetTop_ = i17;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.r setOffsetTopFromListStart(int i17) {
        this.bitField0_ |= 4;
        this.offsetTopFromListStart_ = i17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.tencent.mm.flutter.plugin.proto.r addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.tencent.mm.flutter.plugin.proto.s build() {
        com.tencent.mm.flutter.plugin.proto.s buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.tencent.mm.flutter.plugin.proto.s buildPartial() {
        int i17;
        com.tencent.mm.flutter.plugin.proto.s sVar = new com.tencent.mm.flutter.plugin.proto.s(this);
        int i18 = this.bitField0_;
        if ((i18 & 1) != 0) {
            sVar.offsetHeight_ = this.offsetHeight_;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            sVar.offsetTop_ = this.offsetTop_;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            sVar.offsetTopFromListStart_ = this.offsetTopFromListStart_;
            i17 |= 4;
        }
        sVar.bitField0_ = i17;
        onBuilt();
        return sVar;
    }

    @Override // com.google.protobuf.q5
    public com.tencent.mm.flutter.plugin.proto.r clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.tencent.mm.flutter.plugin.proto.s getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.s.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.tencent.mm.flutter.plugin.proto.r setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.tencent.mm.flutter.plugin.proto.r setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final com.tencent.mm.flutter.plugin.proto.r setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.r m463clearOneof(com.google.protobuf.g4 g4Var) {
        super.m463clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.flutter.plugin.proto.r m468mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.r) super.m468mergeUnknownFields(waVar);
    }

    private r(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.r m462clear() {
        super.m462clear();
        this.offsetHeight_ = 0;
        int i17 = this.bitField0_ & (-2);
        this.offsetTop_ = 0;
        this.offsetTopFromListStart_ = 0;
        this.bitField0_ = i17 & (-3) & (-5);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.r m99clone() {
        return (com.tencent.mm.flutter.plugin.proto.r) super.m467clone();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.tencent.mm.flutter.plugin.proto.r mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.s) {
            return mergeFrom((com.tencent.mm.flutter.plugin.proto.s) k8Var);
        }
        super.mergeFrom(k8Var);
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.r mergeFrom(com.tencent.mm.flutter.plugin.proto.s sVar) {
        com.google.protobuf.wa waVar;
        if (sVar == com.tencent.mm.flutter.plugin.proto.s.getDefaultInstance()) {
            return this;
        }
        if (sVar.hasOffsetHeight()) {
            setOffsetHeight(sVar.getOffsetHeight());
        }
        if (sVar.hasOffsetTop()) {
            setOffsetTop(sVar.getOffsetTop());
        }
        if (sVar.hasOffsetTopFromListStart()) {
            setOffsetTopFromListStart(sVar.getOffsetTopFromListStart());
        }
        waVar = ((com.google.protobuf.l6) sVar).unknownFields;
        m468mergeUnknownFields(waVar);
        onChanged();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001f  */
    @Override // com.google.protobuf.a, com.google.protobuf.n8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.r mergeFrom(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = com.tencent.mm.flutter.plugin.proto.s.PARSER     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
            com.tencent.mm.flutter.plugin.proto.s r3 = (com.tencent.mm.flutter.plugin.proto.s) r3     // Catch: java.lang.Throwable -> Lf com.google.protobuf.y6 -> L11
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
            com.tencent.mm.flutter.plugin.proto.s r4 = (com.tencent.mm.flutter.plugin.proto.s) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.r.mergeFrom(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.r");
    }
}
