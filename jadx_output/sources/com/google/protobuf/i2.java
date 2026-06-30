package com.google.protobuf;

/* loaded from: classes16.dex */
public final class i2 extends com.google.protobuf.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f45180e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45181f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45182g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45183h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45184i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f45185m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.p9 f45186n;

    public i2(com.google.protobuf.o0 o0Var) {
        this.f45185m = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.i2) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.j2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.i2) m83clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.j2.f45223o;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.A;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.j2 buildPartial() {
        int i17;
        com.google.protobuf.j2 j2Var = new com.google.protobuf.j2(this, null);
        int i18 = this.f45180e;
        if ((i18 & 1) != 0) {
            j2Var.f45226f = this.f45181f;
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            j2Var.f45227g = this.f45182g;
            i17 |= 2;
        }
        if ((i18 & 4) != 0) {
            j2Var.f45228h = this.f45183h;
            i17 |= 4;
        }
        if ((i18 & 8) != 0) {
            j2Var.f45229i = this.f45184i;
            i17 |= 8;
        }
        com.google.protobuf.p9 p9Var = this.f45186n;
        if (p9Var == null) {
            if ((i18 & 16) != 0) {
                this.f45185m = java.util.Collections.unmodifiableList(this.f45185m);
                this.f45180e &= -17;
            }
            j2Var.f45230m = this.f45185m;
        } else {
            j2Var.f45230m = p9Var.g();
        }
        j2Var.f45225e = i17;
        onBuilt();
        return j2Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.B;
        j6Var.c(com.google.protobuf.j2.class, com.google.protobuf.i2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45186n;
            if (i17 >= (p9Var == null ? this.f45185m.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.f45186n;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.f45185m.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f45186n == null) {
            this.f45186n = new com.google.protobuf.p9(this.f45185m, (this.f45180e & 16) != 0, getParentForChildren(), isClean());
            this.f45185m = null;
        }
        return this.f45186n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.i2 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.j2.f45224p     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.h2 r0 = (com.google.protobuf.h2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.j2 r2 = (com.google.protobuf.j2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.j2 r3 = (com.google.protobuf.j2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.i2.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.i2");
    }

    public com.google.protobuf.i2 l(com.google.protobuf.j2 j2Var) {
        if (j2Var == com.google.protobuf.j2.f45223o) {
            return this;
        }
        if ((j2Var.f45225e & 1) != 0) {
            boolean z17 = j2Var.f45226f;
            this.f45180e |= 1;
            this.f45181f = z17;
            onChanged();
        }
        if ((j2Var.f45225e & 2) != 0) {
            boolean z18 = j2Var.f45227g;
            this.f45180e |= 2;
            this.f45182g = z18;
            onChanged();
        }
        if ((j2Var.f45225e & 4) != 0) {
            boolean z19 = j2Var.f45228h;
            this.f45180e |= 4;
            this.f45183h = z19;
            onChanged();
        }
        if ((j2Var.f45225e & 8) != 0) {
            boolean z27 = j2Var.f45229i;
            this.f45180e |= 8;
            this.f45184i = z27;
            onChanged();
        }
        if (this.f45186n == null) {
            if (!j2Var.f45230m.isEmpty()) {
                if (this.f45185m.isEmpty()) {
                    this.f45185m = j2Var.f45230m;
                    this.f45180e &= -17;
                } else {
                    if ((this.f45180e & 16) == 0) {
                        this.f45185m = new java.util.ArrayList(this.f45185m);
                        this.f45180e |= 16;
                    }
                    this.f45185m.addAll(j2Var.f45230m);
                }
                onChanged();
            }
        } else if (!j2Var.f45230m.isEmpty()) {
            if (this.f45186n.p()) {
                this.f45186n.f45409a = null;
                this.f45186n = null;
                this.f45185m = j2Var.f45230m;
                this.f45180e &= -17;
                this.f45186n = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f45186n.b(j2Var.f45230m);
            }
        }
        f(j2Var);
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
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.i2) m84mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.i2) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.j2.f45223o;
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
        com.google.protobuf.j2 buildPartial = buildPartial();
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

    public i2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45185m = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.j2) {
            l((com.google.protobuf.j2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.j2) {
            l((com.google.protobuf.j2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
