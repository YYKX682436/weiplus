package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class m0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f68014d;

    /* renamed from: e, reason: collision with root package name */
    public int f68015e;

    /* renamed from: f, reason: collision with root package name */
    public int f68016f;

    /* renamed from: g, reason: collision with root package name */
    public int f68017g;

    /* renamed from: h, reason: collision with root package name */
    public int f68018h;

    public m0(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = com.tencent.mm.flutter.plugin.proto.n0.f68019m;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.n0 build() {
        com.tencent.mm.flutter.plugin.proto.n0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.m0) m83clone();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.n0 buildPartial() {
        int i17;
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = new com.tencent.mm.flutter.plugin.proto.n0(this, null);
        int i18 = this.f68014d;
        if ((i18 & 1) != 0) {
            n0Var.f68022e = this.f68015e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            n0Var.f68023f = this.f68016f;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            n0Var.f68024g = this.f68017g;
            i17 |= 4;
        }
        if ((i18 & 8) != 0) {
            n0Var.f68025h = this.f68018h;
            i17 |= 8;
        }
        n0Var.f68021d = i17;
        onBuilt();
        return n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.m0 e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.n0.f68020n     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.l0 r0 = (com.tencent.mm.flutter.plugin.proto.l0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.n0 r2 = (com.tencent.mm.flutter.plugin.proto.n0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.n0 r3 = (com.tencent.mm.flutter.plugin.proto.n0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.m0.e(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.m0");
    }

    public com.tencent.mm.flutter.plugin.proto.m0 f(com.tencent.mm.flutter.plugin.proto.n0 n0Var) {
        com.google.protobuf.wa waVar;
        if (n0Var == com.tencent.mm.flutter.plugin.proto.n0.f68019m) {
            return this;
        }
        if (n0Var.g()) {
            h(n0Var.f68022e);
        }
        if (n0Var.h()) {
            i(n0Var.f68023f);
        }
        if (n0Var.hasWidth()) {
            j(n0Var.f68024g);
        }
        if (n0Var.hasHeight()) {
            g(n0Var.f68025h);
        }
        waVar = ((com.google.protobuf.l6) n0Var).unknownFields;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.m0 g(int i17) {
        this.f68014d |= 8;
        this.f68018h = i17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.n0.f68019m;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68029a;
    }

    public com.tencent.mm.flutter.plugin.proto.m0 h(int i17) {
        this.f68014d |= 1;
        this.f68015e = i17;
        onChanged();
        return this;
    }

    public com.tencent.mm.flutter.plugin.proto.m0 i(int i17) {
        this.f68014d |= 2;
        this.f68016f = i17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68030b;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.n0.class, com.tencent.mm.flutter.plugin.proto.m0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = this.f68014d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 2) != 0)) {
            return false;
        }
        if ((i17 & 4) != 0) {
            return (i17 & 8) != 0;
        }
        return false;
    }

    public com.tencent.mm.flutter.plugin.proto.m0 j(int i17) {
        this.f68014d |= 4;
        this.f68017g = i17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.m0) m84mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.n0.f68019m;
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

    public m0(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = com.tencent.mm.flutter.plugin.proto.n0.f68019m;
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
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.n0) {
            f((com.tencent.mm.flutter.plugin.proto.n0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.n0) {
            f((com.tencent.mm.flutter.plugin.proto.n0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
