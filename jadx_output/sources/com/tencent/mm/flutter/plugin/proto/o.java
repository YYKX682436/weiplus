package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class o extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f68027d;

    /* renamed from: e, reason: collision with root package name */
    public int f68028e;

    public o(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        com.tencent.mm.flutter.plugin.proto.p pVar = com.tencent.mm.flutter.plugin.proto.p.f68051g;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.p build() {
        com.tencent.mm.flutter.plugin.proto.p buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.o) m83clone();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.p buildPartial() {
        com.tencent.mm.flutter.plugin.proto.p pVar = new com.tencent.mm.flutter.plugin.proto.p(this, null);
        int i17 = 1;
        if ((this.f68027d & 1) != 0) {
            pVar.f68054e = this.f68028e;
        } else {
            i17 = 0;
        }
        pVar.f68053d = i17;
        onBuilt();
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.o e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.p.f68052h     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.n r0 = (com.tencent.mm.flutter.plugin.proto.n) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.p r2 = (com.tencent.mm.flutter.plugin.proto.p) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.p r3 = (com.tencent.mm.flutter.plugin.proto.p) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.f(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.o.e(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.o");
    }

    public com.tencent.mm.flutter.plugin.proto.o f(com.tencent.mm.flutter.plugin.proto.p pVar) {
        com.google.protobuf.wa waVar;
        if (pVar == com.tencent.mm.flutter.plugin.proto.p.f68051g) {
            return this;
        }
        if ((pVar.f68053d & 1) != 0) {
            int i17 = pVar.f68054e;
            this.f68027d = 1 | this.f68027d;
            this.f68028e = i17;
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) pVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.p.f68051g;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68039k;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68040l;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.p.class, com.tencent.mm.flutter.plugin.proto.o.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.o) m84mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.p.f68051g;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    public o(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        com.tencent.mm.flutter.plugin.proto.p pVar = com.tencent.mm.flutter.plugin.proto.p.f68051g;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.p) {
            f((com.tencent.mm.flutter.plugin.proto.p) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.p) {
            f((com.tencent.mm.flutter.plugin.proto.p) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
