package com.google.protobuf;

/* loaded from: classes16.dex */
public final class y2 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45720d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45721e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45722f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f45723g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.c3 f45724h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t9 f45725i;

    public y2(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45721e = "";
        this.f45722f = java.util.Collections.emptyList();
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.z2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.z2 buildPartial() {
        com.google.protobuf.z2 z2Var = new com.google.protobuf.z2(this, null);
        int i17 = this.f45720d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        z2Var.f45772e = this.f45721e;
        com.google.protobuf.p9 p9Var = this.f45723g;
        if (p9Var == null) {
            if ((this.f45720d & 2) != 0) {
                this.f45722f = java.util.Collections.unmodifiableList(this.f45722f);
                this.f45720d &= -3;
            }
            z2Var.f45773f = this.f45722f;
        } else {
            z2Var.f45773f = p9Var.g();
        }
        if ((i17 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45725i;
            if (t9Var == null) {
                z2Var.f45774g = this.f45724h;
            } else {
                z2Var.f45774g = (com.google.protobuf.c3) t9Var.b();
            }
            i18 |= 2;
        }
        z2Var.f45771d = i18;
        onBuilt();
        return z2Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.y2) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f45723g == null) {
            this.f45723g = new com.google.protobuf.p9(this.f45722f, (this.f45720d & 2) != 0, getParentForChildren(), isClean());
            this.f45722f = null;
        }
        return this.f45723g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.y2 e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.z2.f45770m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.x2 r0 = (com.google.protobuf.x2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.z2 r2 = (com.google.protobuf.z2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.z2 r3 = (com.google.protobuf.z2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y2.e(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.y2");
    }

    public com.google.protobuf.y2 f(com.google.protobuf.z2 z2Var) {
        com.google.protobuf.c3 c3Var;
        com.google.protobuf.c3 c3Var2;
        if (z2Var == com.google.protobuf.z2.f45769i) {
            return this;
        }
        if ((z2Var.f45771d & 1) != 0) {
            this.f45720d |= 1;
            this.f45721e = z2Var.f45772e;
            onChanged();
        }
        if (this.f45723g == null) {
            if (!z2Var.f45773f.isEmpty()) {
                if (this.f45722f.isEmpty()) {
                    this.f45722f = z2Var.f45773f;
                    this.f45720d &= -3;
                } else {
                    if ((this.f45720d & 2) == 0) {
                        this.f45722f = new java.util.ArrayList(this.f45722f);
                        this.f45720d |= 2;
                    }
                    this.f45722f.addAll(z2Var.f45773f);
                }
                onChanged();
            }
        } else if (!z2Var.f45773f.isEmpty()) {
            if (this.f45723g.p()) {
                this.f45723g.f45409a = null;
                this.f45723g = null;
                this.f45722f = z2Var.f45773f;
                this.f45720d &= -3;
                this.f45723g = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f45723g.b(z2Var.f45773f);
            }
        }
        if (z2Var.g()) {
            com.google.protobuf.c3 f17 = z2Var.f();
            com.google.protobuf.t9 t9Var = this.f45725i;
            if (t9Var == null) {
                if ((this.f45720d & 4) == 0 || (c3Var = this.f45724h) == null || c3Var == (c3Var2 = com.google.protobuf.c3.f44967i)) {
                    this.f45724h = f17;
                } else {
                    com.google.protobuf.b3 builder = c3Var2.toBuilder();
                    builder.l(c3Var);
                    builder.l(f17);
                    this.f45724h = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f45720d |= 4;
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.z2.f45769i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45402u;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45403v;
        j6Var.c(com.google.protobuf.z2.class, com.google.protobuf.y2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.c3 c3Var;
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45723g;
            if (i17 >= (p9Var == null ? this.f45722f.size() : p9Var.l())) {
                if ((this.f45720d & 4) != 0) {
                    com.google.protobuf.t9 t9Var = this.f45725i;
                    if (t9Var == null) {
                        c3Var = this.f45724h;
                        if (c3Var == null) {
                            c3Var = com.google.protobuf.c3.f44967i;
                        }
                    } else {
                        c3Var = (com.google.protobuf.c3) t9Var.e();
                    }
                    if (!c3Var.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }
            com.google.protobuf.p9 p9Var2 = this.f45723g;
            if (!(p9Var2 == null ? (com.google.protobuf.m2) this.f45722f.get(i17) : (com.google.protobuf.m2) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.c3 c3Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            d();
            com.google.protobuf.t9 t9Var = this.f45725i;
            if (t9Var == null) {
                if (t9Var == null) {
                    c3Var = this.f45724h;
                    if (c3Var == null) {
                        c3Var = com.google.protobuf.c3.f44967i;
                    }
                } else {
                    c3Var = (com.google.protobuf.c3) t9Var.e();
                }
                this.f45725i = new com.google.protobuf.t9(c3Var, getParentForChildren(), isClean());
                this.f45724h = null;
            }
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
        return (com.google.protobuf.y2) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.z2.f45769i;
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

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.z2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    public y2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45721e = "";
        this.f45722f = java.util.Collections.emptyList();
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.z2) {
            f((com.google.protobuf.z2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.z2) {
            f((com.google.protobuf.z2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
