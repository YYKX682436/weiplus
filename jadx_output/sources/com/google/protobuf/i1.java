package com.google.protobuf;

/* loaded from: classes16.dex */
public final class i1 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45175d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45176e;

    /* renamed from: f, reason: collision with root package name */
    public int f45177f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.m1 f45178g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t9 f45179h;

    public i1(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45176e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.j1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.j1 buildPartial() {
        com.google.protobuf.j1 j1Var = new com.google.protobuf.j1(this, null);
        int i17 = this.f45175d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        j1Var.f45219e = this.f45176e;
        if ((i17 & 2) != 0) {
            j1Var.f45220f = this.f45177f;
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45179h;
            if (t9Var == null) {
                j1Var.f45221g = this.f45178g;
            } else {
                j1Var.f45221g = (com.google.protobuf.m1) t9Var.b();
            }
            i18 |= 4;
        }
        j1Var.f45218d = i18;
        onBuilt();
        return j1Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.i1) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.i1 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.j1.f45217m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.h1 r0 = (com.google.protobuf.h1) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.j1 r2 = (com.google.protobuf.j1) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.j1 r3 = (com.google.protobuf.j1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i1.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.i1");
    }

    public com.google.protobuf.i1 e(com.google.protobuf.j1 j1Var) {
        com.google.protobuf.m1 m1Var;
        com.google.protobuf.m1 m1Var2;
        if (j1Var == com.google.protobuf.j1.f45216i) {
            return this;
        }
        if ((j1Var.f45218d & 1) != 0) {
            this.f45175d |= 1;
            this.f45176e = j1Var.f45219e;
            onChanged();
        }
        if ((j1Var.f45218d & 2) != 0) {
            int i17 = j1Var.f45220f;
            this.f45175d |= 2;
            this.f45177f = i17;
            onChanged();
        }
        if (j1Var.g()) {
            com.google.protobuf.m1 f17 = j1Var.f();
            com.google.protobuf.t9 t9Var = this.f45179h;
            if (t9Var == null) {
                if ((this.f45175d & 4) == 0 || (m1Var = this.f45178g) == null || m1Var == (m1Var2 = com.google.protobuf.m1.f45308i)) {
                    this.f45178g = f17;
                } else {
                    com.google.protobuf.l1 builder = m1Var2.toBuilder();
                    builder.l(m1Var);
                    builder.l(f17);
                    this.f45178g = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f45175d |= 4;
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.j1.f45216i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45400s;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45401t;
        j6Var.c(com.google.protobuf.j1.class, com.google.protobuf.i1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.m1 m1Var;
        if ((this.f45175d & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45179h;
            if (t9Var == null) {
                m1Var = this.f45178g;
                if (m1Var == null) {
                    m1Var = com.google.protobuf.m1.f45308i;
                }
            } else {
                m1Var = (com.google.protobuf.m1) t9Var.e();
            }
            if (!m1Var.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.t9 t9Var;
        com.google.protobuf.m1 m1Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders && (t9Var = this.f45179h) == null) {
            if (t9Var == null) {
                m1Var = this.f45178g;
                if (m1Var == null) {
                    m1Var = com.google.protobuf.m1.f45308i;
                }
            } else {
                m1Var = (com.google.protobuf.m1) t9Var.e();
            }
            this.f45179h = new com.google.protobuf.t9(m1Var, getParentForChildren(), isClean());
            this.f45178g = null;
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
        return (com.google.protobuf.i1) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.j1.f45216i;
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

    public i1(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45176e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.j1 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.j1) {
            e((com.google.protobuf.j1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.j1) {
            e((com.google.protobuf.j1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
