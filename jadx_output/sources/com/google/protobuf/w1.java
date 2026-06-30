package com.google.protobuf;

/* loaded from: classes16.dex */
public final class w1 extends com.google.protobuf.s5 {

    /* renamed from: e, reason: collision with root package name */
    public int f45633e;

    /* renamed from: f, reason: collision with root package name */
    public int f45634f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f45635g;

    /* renamed from: h, reason: collision with root package name */
    public int f45636h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45637i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45638m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f45639n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f45640o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.protobuf.p9 f45641p;

    public w1(com.google.protobuf.o0 o0Var) {
        this.f45634f = 0;
        this.f45636h = 0;
        this.f45640o = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.w1) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.z1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.w1) m467clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.z1.f45758q;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.C;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.z1 buildPartial() {
        com.google.protobuf.z1 z1Var = new com.google.protobuf.z1(this, null);
        int i17 = this.f45633e;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        z1Var.f45761f = this.f45634f;
        if ((i17 & 2) != 0) {
            z1Var.f45762g = this.f45635g;
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        z1Var.f45763h = this.f45636h;
        if ((i17 & 8) != 0) {
            z1Var.f45764i = this.f45637i;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            z1Var.f45765m = this.f45638m;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            z1Var.f45766n = this.f45639n;
            i18 |= 32;
        }
        com.google.protobuf.p9 p9Var = this.f45641p;
        if (p9Var == null) {
            if ((i17 & 64) != 0) {
                this.f45640o = java.util.Collections.unmodifiableList(this.f45640o);
                this.f45633e &= -65;
            }
            z1Var.f45767o = this.f45640o;
        } else {
            z1Var.f45767o = p9Var.g();
        }
        z1Var.f45760e = i18;
        onBuilt();
        return z1Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.D;
        j6Var.c(com.google.protobuf.z1.class, com.google.protobuf.w1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45641p;
            if (i17 >= (p9Var == null ? this.f45640o.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.f45641p;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.f45640o.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f45641p == null) {
            this.f45641p = new com.google.protobuf.p9(this.f45640o, (this.f45633e & 64) != 0, getParentForChildren(), isClean());
            this.f45640o = null;
        }
        return this.f45641p;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.w1 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.z1.f45759r     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.v1 r0 = (com.google.protobuf.v1) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.z1 r2 = (com.google.protobuf.z1) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.z1 r3 = (com.google.protobuf.z1) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w1.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.w1");
    }

    public com.google.protobuf.w1 l(com.google.protobuf.z1 z1Var) {
        if (z1Var == com.google.protobuf.z1.f45758q) {
            return this;
        }
        if ((z1Var.f45760e & 1) != 0) {
            com.google.protobuf.x1 a17 = com.google.protobuf.x1.a(z1Var.f45761f);
            if (a17 == null) {
                a17 = com.google.protobuf.x1.STRING;
            }
            this.f45633e |= 1;
            this.f45634f = a17.f45671d;
            onChanged();
        }
        if (z1Var.k()) {
            boolean z17 = z1Var.f45762g;
            this.f45633e |= 2;
            this.f45635g = z17;
            onChanged();
        }
        if ((z1Var.f45760e & 4) != 0) {
            com.google.protobuf.y1 a18 = com.google.protobuf.y1.a(z1Var.f45763h);
            if (a18 == null) {
                a18 = com.google.protobuf.y1.JS_NORMAL;
            }
            this.f45633e |= 4;
            this.f45636h = a18.f45719d;
            onChanged();
        }
        if ((z1Var.f45760e & 8) != 0) {
            boolean z18 = z1Var.f45764i;
            this.f45633e |= 8;
            this.f45637i = z18;
            onChanged();
        }
        if ((z1Var.f45760e & 16) != 0) {
            boolean z19 = z1Var.f45765m;
            this.f45633e |= 16;
            this.f45638m = z19;
            onChanged();
        }
        if ((z1Var.f45760e & 32) != 0) {
            boolean z27 = z1Var.f45766n;
            this.f45633e |= 32;
            this.f45639n = z27;
            onChanged();
        }
        if (this.f45641p == null) {
            if (!z1Var.f45767o.isEmpty()) {
                if (this.f45640o.isEmpty()) {
                    this.f45640o = z1Var.f45767o;
                    this.f45633e &= -65;
                } else {
                    if ((this.f45633e & 64) == 0) {
                        this.f45640o = new java.util.ArrayList(this.f45640o);
                        this.f45633e |= 64;
                    }
                    this.f45640o.addAll(z1Var.f45767o);
                }
                onChanged();
            }
        } else if (!z1Var.f45767o.isEmpty()) {
            if (this.f45641p.p()) {
                this.f45641p.f45409a = null;
                this.f45641p = null;
                this.f45640o = z1Var.f45767o;
                this.f45633e &= -65;
                this.f45641p = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f45641p.b(z1Var.f45767o);
            }
        }
        f(z1Var);
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
        return (com.google.protobuf.w1) m468mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.w1) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.z1.f45758q;
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
        com.google.protobuf.z1 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.z1) {
            l((com.google.protobuf.z1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public w1(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45634f = 0;
        this.f45636h = 0;
        this.f45640o = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.z1) {
            l((com.google.protobuf.z1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
