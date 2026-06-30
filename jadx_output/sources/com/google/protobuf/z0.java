package com.google.protobuf;

/* loaded from: classes16.dex */
public final class z0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45750e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45751f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f45752g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.g1 f45753h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t9 f45754i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f45755m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.p9 f45756n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.protobuf.g7 f45757o;

    public z0(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45750e = "";
        this.f45751f = java.util.Collections.emptyList();
        this.f45755m = java.util.Collections.emptyList();
        this.f45757o = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.d1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.d1 buildPartial() {
        com.google.protobuf.d1 d1Var = new com.google.protobuf.d1(this, null);
        int i17 = this.f45749d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        d1Var.f44998e = this.f45750e;
        com.google.protobuf.p9 p9Var = this.f45752g;
        if (p9Var == null) {
            if ((this.f45749d & 2) != 0) {
                this.f45751f = java.util.Collections.unmodifiableList(this.f45751f);
                this.f45749d &= -3;
            }
            d1Var.f44999f = this.f45751f;
        } else {
            d1Var.f44999f = p9Var.g();
        }
        if ((i17 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f45754i;
            if (t9Var == null) {
                d1Var.f45000g = this.f45753h;
            } else {
                d1Var.f45000g = (com.google.protobuf.g1) t9Var.b();
            }
            i18 |= 2;
        }
        com.google.protobuf.p9 p9Var2 = this.f45756n;
        if (p9Var2 == null) {
            if ((this.f45749d & 8) != 0) {
                this.f45755m = java.util.Collections.unmodifiableList(this.f45755m);
                this.f45749d &= -9;
            }
            d1Var.f45001h = this.f45755m;
        } else {
            d1Var.f45001h = p9Var2.g();
        }
        if ((this.f45749d & 16) != 0) {
            this.f45757o = this.f45757o.b();
            this.f45749d &= -17;
        }
        d1Var.f45002i = this.f45757o;
        d1Var.f44997d = i18;
        onBuilt();
        return d1Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.z0) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f45756n == null) {
            this.f45756n = new com.google.protobuf.p9(this.f45755m, (this.f45749d & 8) != 0, getParentForChildren(), isClean());
            this.f45755m = null;
        }
        return this.f45756n;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f45752g == null) {
            this.f45752g = new com.google.protobuf.p9(this.f45751f, (this.f45749d & 2) != 0, getParentForChildren(), isClean());
            this.f45751f = null;
        }
        return this.f45752g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.z0 f(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.d1.f44996o     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.y0 r0 = (com.google.protobuf.y0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.d1 r2 = (com.google.protobuf.d1) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.d1 r3 = (com.google.protobuf.d1) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.g(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.f(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.z0");
    }

    public com.google.protobuf.z0 g(com.google.protobuf.d1 d1Var) {
        com.google.protobuf.g1 g1Var;
        com.google.protobuf.g1 g1Var2;
        if (d1Var == com.google.protobuf.d1.f44995n) {
            return this;
        }
        if ((d1Var.f44997d & 1) != 0) {
            this.f45749d |= 1;
            this.f45750e = d1Var.f44998e;
            onChanged();
        }
        if (this.f45752g == null) {
            if (!d1Var.f44999f.isEmpty()) {
                if (this.f45751f.isEmpty()) {
                    this.f45751f = d1Var.f44999f;
                    this.f45749d &= -3;
                } else {
                    if ((this.f45749d & 2) == 0) {
                        this.f45751f = new java.util.ArrayList(this.f45751f);
                        this.f45749d |= 2;
                    }
                    this.f45751f.addAll(d1Var.f44999f);
                }
                onChanged();
            }
        } else if (!d1Var.f44999f.isEmpty()) {
            if (this.f45752g.p()) {
                this.f45752g.f45409a = null;
                this.f45752g = null;
                this.f45751f = d1Var.f44999f;
                this.f45749d &= -3;
                this.f45752g = com.google.protobuf.l6.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f45752g.b(d1Var.f44999f);
            }
        }
        if (d1Var.g()) {
            com.google.protobuf.g1 f17 = d1Var.f();
            com.google.protobuf.t9 t9Var = this.f45754i;
            if (t9Var == null) {
                if ((this.f45749d & 4) == 0 || (g1Var = this.f45753h) == null || g1Var == (g1Var2 = com.google.protobuf.g1.f45095m)) {
                    this.f45753h = f17;
                } else {
                    com.google.protobuf.f1 builder = g1Var2.toBuilder();
                    builder.l(g1Var);
                    builder.l(f17);
                    this.f45753h = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f45749d |= 4;
        }
        if (this.f45756n == null) {
            if (!d1Var.f45001h.isEmpty()) {
                if (this.f45755m.isEmpty()) {
                    this.f45755m = d1Var.f45001h;
                    this.f45749d &= -9;
                } else {
                    if ((this.f45749d & 8) == 0) {
                        this.f45755m = new java.util.ArrayList(this.f45755m);
                        this.f45749d |= 8;
                    }
                    this.f45755m.addAll(d1Var.f45001h);
                }
                onChanged();
            }
        } else if (!d1Var.f45001h.isEmpty()) {
            if (this.f45756n.p()) {
                this.f45756n.f45409a = null;
                this.f45756n = null;
                this.f45755m = d1Var.f45001h;
                this.f45749d &= -9;
                this.f45756n = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f45756n.b(d1Var.f45001h);
            }
        }
        if (!d1Var.f45002i.isEmpty()) {
            if (this.f45757o.isEmpty()) {
                this.f45757o = d1Var.f45002i;
                this.f45749d &= -17;
            } else {
                if ((this.f45749d & 16) == 0) {
                    this.f45757o = new com.google.protobuf.f7(this.f45757o);
                    this.f45749d |= 16;
                }
                this.f45757o.addAll(d1Var.f45002i);
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.d1.f44995n;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45396o;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45397p;
        j6Var.c(com.google.protobuf.d1.class, com.google.protobuf.z0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.g1 g1Var;
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45752g;
            if (i17 >= (p9Var == null ? this.f45751f.size() : p9Var.l())) {
                if ((this.f45749d & 4) != 0) {
                    com.google.protobuf.t9 t9Var = this.f45754i;
                    if (t9Var == null) {
                        g1Var = this.f45753h;
                        if (g1Var == null) {
                            g1Var = com.google.protobuf.g1.f45095m;
                        }
                    } else {
                        g1Var = (com.google.protobuf.g1) t9Var.e();
                    }
                    if (!g1Var.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }
            com.google.protobuf.p9 p9Var2 = this.f45752g;
            if (!(p9Var2 == null ? (com.google.protobuf.j1) this.f45751f.get(i17) : (com.google.protobuf.j1) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.g1 g1Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            e();
            com.google.protobuf.t9 t9Var = this.f45754i;
            if (t9Var == null) {
                if (t9Var == null) {
                    g1Var = this.f45753h;
                    if (g1Var == null) {
                        g1Var = com.google.protobuf.g1.f45095m;
                    }
                } else {
                    g1Var = (com.google.protobuf.g1) t9Var.e();
                }
                this.f45754i = new com.google.protobuf.t9(g1Var, getParentForChildren(), isClean());
                this.f45753h = null;
            }
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.z0) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.d1.f44995n;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.d1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.d1) {
            g((com.google.protobuf.d1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public z0(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45750e = "";
        this.f45751f = java.util.Collections.emptyList();
        this.f45755m = java.util.Collections.emptyList();
        this.f45757o = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.d1) {
            g((com.google.protobuf.d1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
