package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class l extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f67996d;

    /* renamed from: e, reason: collision with root package name */
    public int f67997e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f67998f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f67999g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.flutter.plugin.proto.n0 f68000h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t9 f68001i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f68002m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f68003n;

    public l(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        this.f67998f = "";
        this.f67999g = "";
        this.f68003n = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.m build() {
        com.tencent.mm.flutter.plugin.proto.m buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.l) m499clone();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.m buildPartial() {
        int i17;
        com.tencent.mm.flutter.plugin.proto.m mVar = new com.tencent.mm.flutter.plugin.proto.m(this, null);
        int i18 = this.f67996d;
        if ((i18 & 1) != 0) {
            mVar.f68007e = this.f67997e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        mVar.f68008f = this.f67998f;
        if ((i18 & 4) != 0) {
            i17 |= 4;
        }
        mVar.f68009g = this.f67999g;
        if ((i18 & 8) != 0) {
            com.google.protobuf.t9 t9Var = this.f68001i;
            if (t9Var == null) {
                mVar.f68010h = this.f68000h;
            } else {
                mVar.f68010h = (com.tencent.mm.flutter.plugin.proto.n0) t9Var.b();
            }
            i17 |= 8;
        }
        if ((i18 & 16) != 0) {
            mVar.f68011i = this.f68002m;
            i17 |= 16;
        }
        if ((i18 & 32) != 0) {
            i17 |= 32;
        }
        mVar.f68012m = this.f68003n;
        mVar.f68006d = i17;
        onBuilt();
        return mVar;
    }

    public com.tencent.mm.flutter.plugin.proto.n0 e() {
        com.google.protobuf.t9 t9Var = this.f68001i;
        if (t9Var != null) {
            return (com.tencent.mm.flutter.plugin.proto.n0) t9Var.e();
        }
        com.tencent.mm.flutter.plugin.proto.n0 n0Var = this.f68000h;
        return n0Var == null ? com.tencent.mm.flutter.plugin.proto.n0.f68019m : n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.l f(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.m.f68005p     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.k r0 = (com.tencent.mm.flutter.plugin.proto.k) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.m r2 = (com.tencent.mm.flutter.plugin.proto.m) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.m r3 = (com.tencent.mm.flutter.plugin.proto.m) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.g(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.l.f(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.l");
    }

    public com.tencent.mm.flutter.plugin.proto.l g(com.tencent.mm.flutter.plugin.proto.m mVar) {
        com.tencent.mm.flutter.plugin.proto.n0 n0Var;
        com.tencent.mm.flutter.plugin.proto.n0 n0Var2;
        if (mVar == com.tencent.mm.flutter.plugin.proto.m.f68004o) {
            return this;
        }
        if (mVar.m()) {
            int i17 = mVar.f68007e;
            this.f67996d |= 1;
            this.f67997e = i17;
            onChanged();
        }
        if (mVar.hasFrameSetName()) {
            this.f67996d |= 2;
            this.f67998f = mVar.f68008f;
            onChanged();
        }
        if (mVar.k()) {
            this.f67996d |= 4;
            this.f67999g = mVar.f68009g;
            onChanged();
        }
        if (mVar.hasPosition()) {
            com.tencent.mm.flutter.plugin.proto.n0 i18 = mVar.i();
            com.google.protobuf.t9 t9Var = this.f68001i;
            if (t9Var == null) {
                if ((this.f67996d & 8) == 0 || (n0Var = this.f68000h) == null || n0Var == (n0Var2 = com.tencent.mm.flutter.plugin.proto.n0.f68019m)) {
                    this.f68000h = i18;
                } else {
                    com.tencent.mm.flutter.plugin.proto.m0 builder = n0Var2.toBuilder();
                    builder.f(n0Var);
                    builder.f(i18);
                    this.f68000h = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(i18);
            }
            this.f67996d |= 8;
        }
        if (mVar.l()) {
            boolean z17 = mVar.f68011i;
            this.f67996d |= 16;
            this.f68002m = z17;
            onChanged();
        }
        if ((mVar.f68006d & 32) != 0) {
            this.f67996d |= 32;
            this.f68003n = mVar.f68012m;
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.m.f68004o;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68031c;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68032d;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.m.class, com.tencent.mm.flutter.plugin.proto.l.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = this.f67996d;
        if (!((i17 & 1) != 0)) {
            return false;
        }
        if (!((i17 & 2) != 0)) {
            return false;
        }
        if (!((i17 & 4) != 0)) {
            return false;
        }
        if ((i17 & 8) != 0) {
            return ((i17 & 16) != 0) && e().isInitialized();
        }
        return false;
    }

    public final void maybeForceBuilderInitialization() {
        if (com.tencent.mm.flutter.plugin.proto.m.f() && this.f68001i == null) {
            this.f68001i = new com.google.protobuf.t9(e(), getParentForChildren(), isClean());
            this.f68000h = null;
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m500mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.tencent.mm.flutter.plugin.proto.l) m500mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.m.f68004o;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.m) {
            g((com.tencent.mm.flutter.plugin.proto.m) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public l(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        this.f67998f = "";
        this.f67999g = "";
        this.f68003n = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.m) {
            g((com.tencent.mm.flutter.plugin.proto.m) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
