package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class j0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f67984d;

    /* renamed from: e, reason: collision with root package name */
    public int f67985e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f67986f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.flutter.plugin.proto.n0 f67987g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t9 f67988h;

    public j0(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.k0 build() {
        com.tencent.mm.flutter.plugin.proto.k0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.j0) m83clone();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.k0 buildPartial() {
        int i17;
        com.tencent.mm.flutter.plugin.proto.k0 k0Var = new com.tencent.mm.flutter.plugin.proto.k0(this, null);
        int i18 = this.f67984d;
        if ((i18 & 1) != 0) {
            k0Var.f67992e = this.f67985e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            k0Var.f67993f = this.f67986f;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f67988h;
            if (t9Var == null) {
                k0Var.f67994g = this.f67987g;
            } else {
                k0Var.f67994g = (com.tencent.mm.flutter.plugin.proto.n0) t9Var.b();
            }
            i17 |= 4;
        }
        k0Var.f67991d = i17;
        onBuilt();
        return k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.j0 e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.k0.f67990m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.i0 r0 = (com.tencent.mm.flutter.plugin.proto.i0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.k0 r2 = (com.tencent.mm.flutter.plugin.proto.k0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.k0 r3 = (com.tencent.mm.flutter.plugin.proto.k0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.j0.e(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.j0");
    }

    public com.tencent.mm.flutter.plugin.proto.j0 f(com.tencent.mm.flutter.plugin.proto.k0 k0Var) {
        com.tencent.mm.flutter.plugin.proto.n0 n0Var;
        com.tencent.mm.flutter.plugin.proto.n0 n0Var2;
        if (k0Var == com.tencent.mm.flutter.plugin.proto.k0.f67989i) {
            return this;
        }
        if (k0Var.h()) {
            int i17 = k0Var.f67992e;
            this.f67984d |= 1;
            this.f67985e = i17;
            onChanged();
        }
        if ((k0Var.f67991d & 2) != 0) {
            boolean z17 = k0Var.f67993f;
            this.f67984d |= 2;
            this.f67986f = z17;
            onChanged();
        }
        if (k0Var.hasPosition()) {
            com.tencent.mm.flutter.plugin.proto.n0 g17 = k0Var.g();
            com.google.protobuf.t9 t9Var = this.f67988h;
            if (t9Var == null) {
                if ((this.f67984d & 4) == 0 || (n0Var = this.f67987g) == null || n0Var == (n0Var2 = com.tencent.mm.flutter.plugin.proto.n0.f68019m)) {
                    this.f67987g = g17;
                } else {
                    com.tencent.mm.flutter.plugin.proto.m0 builder = n0Var2.toBuilder();
                    builder.f(n0Var);
                    builder.f(g17);
                    this.f67987g = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(g17);
            }
            this.f67984d |= 4;
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.k0.f67989i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68033e;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68034f;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.k0.class, com.tencent.mm.flutter.plugin.proto.j0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.tencent.mm.flutter.plugin.proto.n0 n0Var;
        int i17 = this.f67984d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 4) != 0)) {
            return false;
        }
        com.google.protobuf.t9 t9Var = this.f67988h;
        if (t9Var == null) {
            n0Var = this.f67987g;
            if (n0Var == null) {
                n0Var = com.tencent.mm.flutter.plugin.proto.n0.f68019m;
            }
        } else {
            n0Var = (com.tencent.mm.flutter.plugin.proto.n0) t9Var.e();
        }
        return n0Var.isInitialized();
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.t9 t9Var;
        com.tencent.mm.flutter.plugin.proto.n0 n0Var;
        if (com.tencent.mm.flutter.plugin.proto.k0.access$3200() && (t9Var = this.f67988h) == null) {
            if (t9Var == null) {
                n0Var = this.f67987g;
                if (n0Var == null) {
                    n0Var = com.tencent.mm.flutter.plugin.proto.n0.f68019m;
                }
            } else {
                n0Var = (com.tencent.mm.flutter.plugin.proto.n0) t9Var.e();
            }
            this.f67988h = new com.google.protobuf.t9(n0Var, getParentForChildren(), isClean());
            this.f67987g = null;
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.j0) m84mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.k0.f67989i;
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

    public j0(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        maybeForceBuilderInitialization();
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
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.k0) {
            f((com.tencent.mm.flutter.plugin.proto.k0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.k0) {
            f((com.tencent.mm.flutter.plugin.proto.k0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
