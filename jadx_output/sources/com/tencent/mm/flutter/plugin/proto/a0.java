package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class a0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f67929d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f67930e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.flutter.plugin.proto.y f67931f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.t9 f67932g;

    public a0(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        this.f67930e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.tencent.mm.flutter.plugin.proto.b0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.b0 buildPartial() {
        com.tencent.mm.flutter.plugin.proto.b0 b0Var = new com.tencent.mm.flutter.plugin.proto.b0(this, null);
        int i17 = this.f67929d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        b0Var.f67944e = this.f67930e;
        if ((i17 & 2) != 0) {
            com.google.protobuf.t9 t9Var = this.f67932g;
            if (t9Var == null) {
                b0Var.f67945f = this.f67931f;
            } else {
                b0Var.f67945f = (com.tencent.mm.flutter.plugin.proto.y) t9Var.b();
            }
            i18 |= 2;
        }
        b0Var.f67943d = i18;
        onBuilt();
        return b0Var;
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.a0) m467clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.a0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.b0.f67942i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.z r0 = (com.tencent.mm.flutter.plugin.proto.z) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.b0 r2 = (com.tencent.mm.flutter.plugin.proto.b0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.b0 r3 = (com.tencent.mm.flutter.plugin.proto.b0) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.e(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.a0.d(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.a0");
    }

    public com.tencent.mm.flutter.plugin.proto.a0 e(com.tencent.mm.flutter.plugin.proto.b0 b0Var) {
        com.google.protobuf.wa waVar;
        com.tencent.mm.flutter.plugin.proto.y yVar;
        com.tencent.mm.flutter.plugin.proto.y yVar2;
        if (b0Var == com.tencent.mm.flutter.plugin.proto.b0.f67941h) {
            return this;
        }
        if (b0Var.j()) {
            this.f67929d |= 1;
            this.f67930e = b0Var.f67944e;
            onChanged();
        }
        if (b0Var.i()) {
            com.tencent.mm.flutter.plugin.proto.y g17 = b0Var.g();
            com.google.protobuf.t9 t9Var = this.f67932g;
            if (t9Var == null) {
                if ((this.f67929d & 2) == 0 || (yVar = this.f67931f) == null || yVar == (yVar2 = com.tencent.mm.flutter.plugin.proto.y.f68105m)) {
                    this.f67931f = g17;
                } else {
                    com.tencent.mm.flutter.plugin.proto.x builder = yVar2.toBuilder();
                    builder.e(yVar);
                    builder.e(g17);
                    this.f67931f = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(g17);
            }
            this.f67929d |= 2;
        }
        waVar = ((com.google.protobuf.l6) b0Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.b0.f67941h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68047s;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68048t;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.b0.class, com.tencent.mm.flutter.plugin.proto.a0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.tencent.mm.flutter.plugin.proto.y yVar;
        int i17 = this.f67929d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 2) != 0)) {
            return false;
        }
        com.google.protobuf.t9 t9Var = this.f67932g;
        if (t9Var == null) {
            yVar = this.f67931f;
            if (yVar == null) {
                yVar = com.tencent.mm.flutter.plugin.proto.y.f68105m;
            }
        } else {
            yVar = (com.tencent.mm.flutter.plugin.proto.y) t9Var.e();
        }
        return yVar.isInitialized();
    }

    public final void maybeForceBuilderInitialization() {
        boolean z17;
        com.google.protobuf.t9 t9Var;
        com.tencent.mm.flutter.plugin.proto.y yVar;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17 && (t9Var = this.f67932g) == null) {
            if (t9Var == null) {
                yVar = this.f67931f;
                if (yVar == null) {
                    yVar = com.tencent.mm.flutter.plugin.proto.y.f68105m;
                }
            } else {
                yVar = (com.tencent.mm.flutter.plugin.proto.y) t9Var.e();
            }
            this.f67932g = new com.google.protobuf.t9(yVar, getParentForChildren(), isClean());
            this.f67931f = null;
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m468mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.a0) m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.b0.f67941h;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    public a0(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        this.f67930e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.tencent.mm.flutter.plugin.proto.b0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.b0) {
            e((com.tencent.mm.flutter.plugin.proto.b0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.b0) {
            e((com.tencent.mm.flutter.plugin.proto.b0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
