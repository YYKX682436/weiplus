package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class i extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f67975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f67976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f67977f;

    public i(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        this.f67976e = "";
        this.f67977f = "";
        com.tencent.mm.flutter.plugin.proto.j jVar = com.tencent.mm.flutter.plugin.proto.j.f67978h;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.tencent.mm.flutter.plugin.proto.j buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.j buildPartial() {
        com.tencent.mm.flutter.plugin.proto.j jVar = new com.tencent.mm.flutter.plugin.proto.j(this, null);
        int i17 = this.f67975d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        jVar.f67981e = this.f67976e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        jVar.f67982f = this.f67977f;
        jVar.f67980d = i18;
        onBuilt();
        return jVar;
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.i) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.i d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.j.f67979i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.h r0 = (com.tencent.mm.flutter.plugin.proto.h) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.j r2 = (com.tencent.mm.flutter.plugin.proto.j) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.j r3 = (com.tencent.mm.flutter.plugin.proto.j) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.i.d(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.i");
    }

    public com.tencent.mm.flutter.plugin.proto.i e(com.tencent.mm.flutter.plugin.proto.j jVar) {
        com.google.protobuf.wa waVar;
        if (jVar == com.tencent.mm.flutter.plugin.proto.j.f67978h) {
            return this;
        }
        if (jVar.i()) {
            this.f67975d |= 1;
            this.f67976e = jVar.f67981e;
            onChanged();
        }
        if (jVar.j()) {
            this.f67975d |= 2;
            this.f67977f = jVar.f67982f;
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) jVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.j.f67978h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68043o;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68044p;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.j.class, com.tencent.mm.flutter.plugin.proto.i.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = this.f67975d;
        if ((i17 & 1) != 0) {
            return (i17 & 2) != 0;
        }
        return false;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.i) m84mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.j.f67978h;
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

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.tencent.mm.flutter.plugin.proto.j buildPartial = buildPartial();
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

    public i(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        this.f67976e = "";
        this.f67977f = "";
        com.tencent.mm.flutter.plugin.proto.j jVar = com.tencent.mm.flutter.plugin.proto.j.f67978h;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.j) {
            e((com.tencent.mm.flutter.plugin.proto.j) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.j) {
            e((com.tencent.mm.flutter.plugin.proto.j) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
