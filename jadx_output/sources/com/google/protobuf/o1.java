package com.google.protobuf;

/* loaded from: classes16.dex */
public final class o1 extends com.google.protobuf.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f45344e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45345f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f45346g;

    public o1(com.google.protobuf.o0 o0Var) {
        this.f45345f = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.o1) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.p1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.o1) m467clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.p1.f45372g;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45390i;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.p1 buildPartial() {
        com.google.protobuf.p1 p1Var = new com.google.protobuf.p1(this, null);
        int i17 = this.f45344e;
        com.google.protobuf.p9 p9Var = this.f45346g;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f45345f = java.util.Collections.unmodifiableList(this.f45345f);
                this.f45344e &= -2;
            }
            p1Var.f45374e = this.f45345f;
        } else {
            p1Var.f45374e = p9Var.g();
        }
        onBuilt();
        return p1Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45391j;
        j6Var.c(com.google.protobuf.p1.class, com.google.protobuf.o1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45346g;
            if (i17 >= (p9Var == null ? this.f45345f.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.f45346g;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.f45345f.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f45346g == null) {
            this.f45346g = new com.google.protobuf.p9(this.f45345f, (this.f45344e & 1) != 0, getParentForChildren(), isClean());
            this.f45345f = null;
        }
        return this.f45346g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.o1 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.p1.f45373h     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.n1 r0 = (com.google.protobuf.n1) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.p1 r2 = (com.google.protobuf.p1) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.p1 r3 = (com.google.protobuf.p1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o1.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.o1");
    }

    public com.google.protobuf.o1 l(com.google.protobuf.p1 p1Var) {
        if (p1Var == com.google.protobuf.p1.f45372g) {
            return this;
        }
        if (this.f45346g == null) {
            if (!p1Var.f45374e.isEmpty()) {
                if (this.f45345f.isEmpty()) {
                    this.f45345f = p1Var.f45374e;
                    this.f45344e &= -2;
                } else {
                    if ((this.f45344e & 1) == 0) {
                        this.f45345f = new java.util.ArrayList(this.f45345f);
                        this.f45344e |= 1;
                    }
                    this.f45345f.addAll(p1Var.f45374e);
                }
                onChanged();
            }
        } else if (!p1Var.f45374e.isEmpty()) {
            if (this.f45346g.p()) {
                this.f45346g.f45409a = null;
                this.f45346g = null;
                this.f45345f = p1Var.f45374e;
                this.f45344e &= -2;
                this.f45346g = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f45346g.b(p1Var.f45374e);
            }
        }
        f(p1Var);
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
        return (com.google.protobuf.o1) m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.o1) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.p1.f45372g;
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
        com.google.protobuf.p1 buildPartial = buildPartial();
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

    public o1(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45345f = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.p1) {
            l((com.google.protobuf.p1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.p1) {
            l((com.google.protobuf.p1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
