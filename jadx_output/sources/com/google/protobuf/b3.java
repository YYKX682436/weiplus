package com.google.protobuf;

/* loaded from: classes16.dex */
public final class b3 extends com.google.protobuf.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f44903e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44904f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f44905g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.p9 f44906h;

    public b3(com.google.protobuf.o0 o0Var) {
        this.f44905g = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.b3) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.c3 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.b3) m467clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.c3.f44967i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.K;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.c3 buildPartial() {
        int i17;
        com.google.protobuf.c3 c3Var = new com.google.protobuf.c3(this, null);
        int i18 = this.f44903e;
        if ((i18 & 1) != 0) {
            c3Var.f44970f = this.f44904f;
            i17 = 1;
        } else {
            i17 = 0;
        }
        com.google.protobuf.p9 p9Var = this.f44906h;
        if (p9Var == null) {
            if ((i18 & 2) != 0) {
                this.f44905g = java.util.Collections.unmodifiableList(this.f44905g);
                this.f44903e &= -3;
            }
            c3Var.f44971g = this.f44905g;
        } else {
            c3Var.f44971g = p9Var.g();
        }
        c3Var.f44969e = i17;
        onBuilt();
        return c3Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.L;
        j6Var.c(com.google.protobuf.c3.class, com.google.protobuf.b3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f44906h;
            if (i17 >= (p9Var == null ? this.f44905g.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.f44906h;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.f44905g.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f44906h == null) {
            this.f44906h = new com.google.protobuf.p9(this.f44905g, (this.f44903e & 2) != 0, getParentForChildren(), isClean());
            this.f44905g = null;
        }
        return this.f44906h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.b3 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.c3.f44968m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.a3 r0 = (com.google.protobuf.a3) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.c3 r2 = (com.google.protobuf.c3) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.c3 r3 = (com.google.protobuf.c3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.b3.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.b3");
    }

    public com.google.protobuf.b3 l(com.google.protobuf.c3 c3Var) {
        if (c3Var == com.google.protobuf.c3.f44967i) {
            return this;
        }
        if ((c3Var.f44969e & 1) != 0) {
            boolean z17 = c3Var.f44970f;
            this.f44903e = 1 | this.f44903e;
            this.f44904f = z17;
            onChanged();
        }
        if (this.f44906h == null) {
            if (!c3Var.f44971g.isEmpty()) {
                if (this.f44905g.isEmpty()) {
                    this.f44905g = c3Var.f44971g;
                    this.f44903e &= -3;
                } else {
                    if ((this.f44903e & 2) == 0) {
                        this.f44905g = new java.util.ArrayList(this.f44905g);
                        this.f44903e |= 2;
                    }
                    this.f44905g.addAll(c3Var.f44971g);
                }
                onChanged();
            }
        } else if (!c3Var.f44971g.isEmpty()) {
            if (this.f44906h.p()) {
                this.f44906h.f45409a = null;
                this.f44906h = null;
                this.f44905g = c3Var.f44971g;
                this.f44903e &= -3;
                this.f44906h = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f44906h.b(c3Var.f44971g);
            }
        }
        f(c3Var);
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
        return (com.google.protobuf.b3) m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.b3) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.c3.f44967i;
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
        com.google.protobuf.c3 buildPartial = buildPartial();
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

    public b3(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f44905g = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.c3) {
            l((com.google.protobuf.c3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.c3) {
            l((com.google.protobuf.c3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
