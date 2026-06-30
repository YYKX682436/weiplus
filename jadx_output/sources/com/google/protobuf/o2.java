package com.google.protobuf;

/* loaded from: classes16.dex */
public final class o2 extends com.google.protobuf.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f45347e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45348f;

    /* renamed from: g, reason: collision with root package name */
    public int f45349g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45350h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.p9 f45351i;

    public o2(com.google.protobuf.o0 o0Var) {
        this.f45349g = 0;
        this.f45350h = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.o2) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.q2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.o2) m467clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.q2.f45439m;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.M;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.q2 buildPartial() {
        int i17;
        com.google.protobuf.q2 q2Var = new com.google.protobuf.q2(this, null);
        int i18 = this.f45347e;
        if ((i18 & 1) != 0) {
            q2Var.f45442f = this.f45348f;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        q2Var.f45443g = this.f45349g;
        com.google.protobuf.p9 p9Var = this.f45351i;
        if (p9Var == null) {
            if ((i18 & 4) != 0) {
                this.f45350h = java.util.Collections.unmodifiableList(this.f45350h);
                this.f45347e &= -5;
            }
            q2Var.f45444h = this.f45350h;
        } else {
            q2Var.f45444h = p9Var.g();
        }
        q2Var.f45441e = i17;
        onBuilt();
        return q2Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.N;
        j6Var.c(com.google.protobuf.q2.class, com.google.protobuf.o2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45351i;
            if (i17 >= (p9Var == null ? this.f45350h.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.f45351i;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.f45350h.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f45351i == null) {
            this.f45351i = new com.google.protobuf.p9(this.f45350h, (this.f45347e & 4) != 0, getParentForChildren(), isClean());
            this.f45350h = null;
        }
        return this.f45351i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.o2 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.q2.f45440n     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.n2 r0 = (com.google.protobuf.n2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.q2 r2 = (com.google.protobuf.q2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.q2 r3 = (com.google.protobuf.q2) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.l(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o2.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.o2");
    }

    public com.google.protobuf.o2 l(com.google.protobuf.q2 q2Var) {
        if (q2Var == com.google.protobuf.q2.f45439m) {
            return this;
        }
        if ((q2Var.f45441e & 1) != 0) {
            boolean z17 = q2Var.f45442f;
            this.f45347e |= 1;
            this.f45348f = z17;
            onChanged();
        }
        if ((q2Var.f45441e & 2) != 0) {
            com.google.protobuf.p2 a17 = com.google.protobuf.p2.a(q2Var.f45443g);
            if (a17 == null) {
                a17 = com.google.protobuf.p2.IDEMPOTENCY_UNKNOWN;
            }
            this.f45347e |= 2;
            this.f45349g = a17.f45380d;
            onChanged();
        }
        if (this.f45351i == null) {
            if (!q2Var.f45444h.isEmpty()) {
                if (this.f45350h.isEmpty()) {
                    this.f45350h = q2Var.f45444h;
                    this.f45347e &= -5;
                } else {
                    if ((this.f45347e & 4) == 0) {
                        this.f45350h = new java.util.ArrayList(this.f45350h);
                        this.f45347e |= 4;
                    }
                    this.f45350h.addAll(q2Var.f45444h);
                }
                onChanged();
            }
        } else if (!q2Var.f45444h.isEmpty()) {
            if (this.f45351i.p()) {
                this.f45351i.f45409a = null;
                this.f45351i = null;
                this.f45350h = q2Var.f45444h;
                this.f45347e &= -5;
                this.f45351i = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f45351i.b(q2Var.f45444h);
            }
        }
        f(q2Var);
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m468mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.o2) m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.o2) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.q2.f45439m;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.q2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.q2) {
            l((com.google.protobuf.q2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public o2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45349g = 0;
        this.f45350h = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.q2) {
            l((com.google.protobuf.q2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
