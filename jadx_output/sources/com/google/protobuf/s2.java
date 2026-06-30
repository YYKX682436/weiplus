package com.google.protobuf;

/* loaded from: classes16.dex */
public final class s2 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45487e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.w2 f45488f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.t9 f45489g;

    public s2(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45487e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.t2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.t2 buildPartial() {
        com.google.protobuf.t2 t2Var = new com.google.protobuf.t2(this, null);
        int i17 = this.f45486d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        t2Var.f45537e = this.f45487e;
        if ((i17 & 2) != 0) {
            com.google.protobuf.t9 t9Var = this.f45489g;
            if (t9Var == null) {
                t2Var.f45538f = this.f45488f;
            } else {
                t2Var.f45538f = (com.google.protobuf.w2) t9Var.b();
            }
            i18 |= 2;
        }
        t2Var.f45536d = i18;
        onBuilt();
        return t2Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.s2) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.s2 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.t2.f45535i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.r2 r0 = (com.google.protobuf.r2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.t2 r2 = (com.google.protobuf.t2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.t2 r3 = (com.google.protobuf.t2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s2.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.s2");
    }

    public com.google.protobuf.s2 e(com.google.protobuf.t2 t2Var) {
        com.google.protobuf.w2 w2Var;
        com.google.protobuf.w2 w2Var2;
        if (t2Var == com.google.protobuf.t2.f45534h) {
            return this;
        }
        if ((t2Var.f45536d & 1) != 0) {
            this.f45486d |= 1;
            this.f45487e = t2Var.f45537e;
            onChanged();
        }
        if (t2Var.g()) {
            com.google.protobuf.w2 f17 = t2Var.f();
            com.google.protobuf.t9 t9Var = this.f45489g;
            if (t9Var == null) {
                if ((this.f45486d & 2) == 0 || (w2Var = this.f45488f) == null || w2Var == (w2Var2 = com.google.protobuf.w2.f45642g)) {
                    this.f45488f = f17;
                } else {
                    com.google.protobuf.v2 builder = w2Var2.toBuilder();
                    builder.l(w2Var);
                    builder.l(f17);
                    this.f45488f = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f45486d |= 2;
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.t2.f45534h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45394m;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45395n;
        j6Var.c(com.google.protobuf.t2.class, com.google.protobuf.s2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.w2 w2Var;
        if ((this.f45486d & 2) != 0) {
            com.google.protobuf.t9 t9Var = this.f45489g;
            if (t9Var == null) {
                w2Var = this.f45488f;
                if (w2Var == null) {
                    w2Var = com.google.protobuf.w2.f45642g;
                }
            } else {
                w2Var = (com.google.protobuf.w2) t9Var.e();
            }
            if (!w2Var.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.t9 t9Var;
        com.google.protobuf.w2 w2Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders && (t9Var = this.f45489g) == null) {
            if (t9Var == null) {
                w2Var = this.f45488f;
                if (w2Var == null) {
                    w2Var = com.google.protobuf.w2.f45642g;
                }
            } else {
                w2Var = (com.google.protobuf.w2) t9Var.e();
            }
            this.f45489g = new com.google.protobuf.t9(w2Var, getParentForChildren(), isClean());
            this.f45488f = null;
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.s2) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.t2.f45534h;
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

    public s2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45487e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.t2 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.t2) {
            e((com.google.protobuf.t2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.t2) {
            e((com.google.protobuf.t2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
