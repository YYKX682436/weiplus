package com.google.protobuf;

/* loaded from: classes16.dex */
public final class e3 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45055d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f45056e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.p9 f45057f;

    public e3(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45056e = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            d();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.i3 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.i3 buildPartial() {
        com.google.protobuf.i3 i3Var = new com.google.protobuf.i3(this, null);
        int i17 = this.f45055d;
        com.google.protobuf.p9 p9Var = this.f45057f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f45056e = java.util.Collections.unmodifiableList(this.f45056e);
                this.f45055d &= -2;
            }
            i3Var.f45189d = this.f45056e;
        } else {
            i3Var.f45189d = p9Var.g();
        }
        onBuilt();
        return i3Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.e3) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f45057f == null) {
            this.f45057f = new com.google.protobuf.p9(this.f45056e, (this.f45055d & 1) != 0, getParentForChildren(), isClean());
            this.f45056e = null;
        }
        return this.f45057f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.e3 e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.i3.f45188g     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.d3 r0 = (com.google.protobuf.d3) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.i3 r2 = (com.google.protobuf.i3) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.i3 r3 = (com.google.protobuf.i3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e3.e(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.e3");
    }

    public com.google.protobuf.e3 f(com.google.protobuf.i3 i3Var) {
        if (i3Var == com.google.protobuf.i3.f45187f) {
            return this;
        }
        if (this.f45057f == null) {
            if (!i3Var.f45189d.isEmpty()) {
                if (this.f45056e.isEmpty()) {
                    this.f45056e = i3Var.f45189d;
                    this.f45055d &= -2;
                } else {
                    if ((this.f45055d & 1) == 0) {
                        this.f45056e = new java.util.ArrayList(this.f45056e);
                        this.f45055d |= 1;
                    }
                    this.f45056e.addAll(i3Var.f45189d);
                }
                onChanged();
            }
        } else if (!i3Var.f45189d.isEmpty()) {
            if (this.f45057f.p()) {
                this.f45057f.f45409a = null;
                this.f45057f = null;
                this.f45056e = i3Var.f45189d;
                this.f45055d &= -2;
                this.f45057f = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f45057f.b(i3Var.f45189d);
            }
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.i3.f45187f;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.S;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.T;
        j6Var.c(com.google.protobuf.i3.class, com.google.protobuf.e3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.e3) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.i3.f45187f;
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
        com.google.protobuf.i3 buildPartial = buildPartial();
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

    public e3(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45056e = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.i3) {
            f((com.google.protobuf.i3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.i3) {
            f((com.google.protobuf.i3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
