package com.google.protobuf;

/* loaded from: classes16.dex */
public final class s0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45476d;

    /* renamed from: e, reason: collision with root package name */
    public int f45477e;

    /* renamed from: f, reason: collision with root package name */
    public int f45478f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p1 f45479g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t9 f45480h;

    public s0(com.google.protobuf.o0 o0Var) {
        super(null);
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.t0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.t0 buildPartial() {
        int i17;
        com.google.protobuf.t0 t0Var = new com.google.protobuf.t0(this, null);
        int i18 = this.f45476d;
        if ((i18 & 1) != 0) {
            t0Var.f45510e = this.f45477e;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            t0Var.f45511f = this.f45478f;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45480h;
            if (t9Var == null) {
                t0Var.f45512g = this.f45479g;
            } else {
                t0Var.f45512g = (com.google.protobuf.p1) t9Var.b();
            }
            i17 |= 4;
        }
        t0Var.f45509d = i17;
        onBuilt();
        return t0Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.s0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.s0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.t0.f45508m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.r0 r0 = (com.google.protobuf.r0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.t0 r2 = (com.google.protobuf.t0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.t0 r3 = (com.google.protobuf.t0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s0.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.s0");
    }

    public com.google.protobuf.s0 e(com.google.protobuf.t0 t0Var) {
        com.google.protobuf.p1 p1Var;
        com.google.protobuf.p1 p1Var2;
        if (t0Var == com.google.protobuf.t0.f45507i) {
            return this;
        }
        if ((t0Var.f45509d & 1) != 0) {
            int i17 = t0Var.f45510e;
            this.f45476d |= 1;
            this.f45477e = i17;
            onChanged();
        }
        if ((t0Var.f45509d & 2) != 0) {
            int i18 = t0Var.f45511f;
            this.f45476d |= 2;
            this.f45478f = i18;
            onChanged();
        }
        if (t0Var.g()) {
            com.google.protobuf.p1 f17 = t0Var.f();
            com.google.protobuf.t9 t9Var = this.f45480h;
            if (t9Var == null) {
                if ((this.f45476d & 4) == 0 || (p1Var = this.f45479g) == null || p1Var == (p1Var2 = com.google.protobuf.p1.f45372g)) {
                    this.f45479g = f17;
                } else {
                    com.google.protobuf.o1 builder = p1Var2.toBuilder();
                    builder.l(p1Var);
                    builder.l(f17);
                    this.f45479g = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f45476d |= 4;
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.t0.f45507i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45386e;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45387f;
        j6Var.c(com.google.protobuf.t0.class, com.google.protobuf.s0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.p1 p1Var;
        if ((this.f45476d & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45480h;
            if (t9Var == null) {
                p1Var = this.f45479g;
                if (p1Var == null) {
                    p1Var = com.google.protobuf.p1.f45372g;
                }
            } else {
                p1Var = (com.google.protobuf.p1) t9Var.e();
            }
            if (!p1Var.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.t9 t9Var;
        com.google.protobuf.p1 p1Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders && (t9Var = this.f45480h) == null) {
            if (t9Var == null) {
                p1Var = this.f45479g;
                if (p1Var == null) {
                    p1Var = com.google.protobuf.p1.f45372g;
                }
            } else {
                p1Var = (com.google.protobuf.p1) t9Var.e();
            }
            this.f45480h = new com.google.protobuf.t9(p1Var, getParentForChildren(), isClean());
            this.f45479g = null;
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
        return (com.google.protobuf.s0) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.t0.f45507i;
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

    public s0(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.t0 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.t0) {
            e((com.google.protobuf.t0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.t0) {
            e((com.google.protobuf.t0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
