package com.google.protobuf;

/* loaded from: classes16.dex */
public final class l2 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45279e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f45280f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f45281g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.q2 f45282h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t9 f45283i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45284m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45285n;

    public l2(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45279e = "";
        this.f45280f = "";
        this.f45281g = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.m2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.m2 buildPartial() {
        com.google.protobuf.m2 m2Var = new com.google.protobuf.m2(this, null);
        int i17 = this.f45278d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        m2Var.f45317e = this.f45279e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        m2Var.f45318f = this.f45280f;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        m2Var.f45319g = this.f45281g;
        if ((i17 & 8) != 0) {
            com.google.protobuf.t9 t9Var = this.f45283i;
            if (t9Var == null) {
                m2Var.f45320h = this.f45282h;
            } else {
                m2Var.f45320h = (com.google.protobuf.q2) t9Var.b();
            }
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            m2Var.f45321i = this.f45284m;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            m2Var.f45322m = this.f45285n;
            i18 |= 32;
        }
        m2Var.f45316d = i18;
        onBuilt();
        return m2Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.l2) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.l2 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.m2.f45315p     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.k2 r0 = (com.google.protobuf.k2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.m2 r2 = (com.google.protobuf.m2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.m2 r3 = (com.google.protobuf.m2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l2.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.l2");
    }

    public com.google.protobuf.l2 e(com.google.protobuf.m2 m2Var) {
        com.google.protobuf.q2 q2Var;
        com.google.protobuf.q2 q2Var2;
        if (m2Var == com.google.protobuf.m2.f45314o) {
            return this;
        }
        if ((m2Var.f45316d & 1) != 0) {
            this.f45278d |= 1;
            this.f45279e = m2Var.f45317e;
            onChanged();
        }
        if ((m2Var.f45316d & 2) != 0) {
            this.f45278d |= 2;
            this.f45280f = m2Var.f45318f;
            onChanged();
        }
        if ((m2Var.f45316d & 4) != 0) {
            this.f45278d |= 4;
            this.f45281g = m2Var.f45319g;
            onChanged();
        }
        if (m2Var.i()) {
            com.google.protobuf.q2 g17 = m2Var.g();
            com.google.protobuf.t9 t9Var = this.f45283i;
            if (t9Var == null) {
                if ((this.f45278d & 8) == 0 || (q2Var = this.f45282h) == null || q2Var == (q2Var2 = com.google.protobuf.q2.f45439m)) {
                    this.f45282h = g17;
                } else {
                    com.google.protobuf.o2 builder = q2Var2.toBuilder();
                    builder.l(q2Var);
                    builder.l(g17);
                    this.f45282h = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(g17);
            }
            this.f45278d |= 8;
        }
        if ((m2Var.f45316d & 16) != 0) {
            boolean z17 = m2Var.f45321i;
            this.f45278d |= 16;
            this.f45284m = z17;
            onChanged();
        }
        if ((m2Var.f45316d & 32) != 0) {
            boolean z18 = m2Var.f45322m;
            this.f45278d |= 32;
            this.f45285n = z18;
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.m2.f45314o;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45404w;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45405x;
        j6Var.c(com.google.protobuf.m2.class, com.google.protobuf.l2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.q2 q2Var;
        if ((this.f45278d & 8) != 0) {
            com.google.protobuf.t9 t9Var = this.f45283i;
            if (t9Var == null) {
                q2Var = this.f45282h;
                if (q2Var == null) {
                    q2Var = com.google.protobuf.q2.f45439m;
                }
            } else {
                q2Var = (com.google.protobuf.q2) t9Var.e();
            }
            if (!q2Var.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.t9 t9Var;
        com.google.protobuf.q2 q2Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders && (t9Var = this.f45283i) == null) {
            if (t9Var == null) {
                q2Var = this.f45282h;
                if (q2Var == null) {
                    q2Var = com.google.protobuf.q2.f45439m;
                }
            } else {
                q2Var = (com.google.protobuf.q2) t9Var.e();
            }
            this.f45283i = new com.google.protobuf.t9(q2Var, getParentForChildren(), isClean());
            this.f45282h = null;
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
        return (com.google.protobuf.l2) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.m2.f45314o;
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
        com.google.protobuf.m2 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.m2) {
            e((com.google.protobuf.m2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public l2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45279e = "";
        this.f45280f = "";
        this.f45281g = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.m2) {
            e((com.google.protobuf.m2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
