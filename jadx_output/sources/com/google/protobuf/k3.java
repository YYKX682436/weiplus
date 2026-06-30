package com.google.protobuf;

/* loaded from: classes16.dex */
public final class k3 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45249d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f45250e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.p9 f45251f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f45252g;

    /* renamed from: h, reason: collision with root package name */
    public long f45253h;

    /* renamed from: i, reason: collision with root package name */
    public long f45254i;

    /* renamed from: m, reason: collision with root package name */
    public double f45255m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.y f45256n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f45257o;

    public k3(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45250e = java.util.Collections.emptyList();
        this.f45252g = "";
        this.f45256n = com.google.protobuf.y.f45712e;
        this.f45257o = "";
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
        com.google.protobuf.o3 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.o3 buildPartial() {
        com.google.protobuf.o3 o3Var = new com.google.protobuf.o3(this, null);
        int i17 = this.f45249d;
        com.google.protobuf.p9 p9Var = this.f45251f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f45250e = java.util.Collections.unmodifiableList(this.f45250e);
                this.f45249d &= -2;
            }
            o3Var.f45355e = this.f45250e;
        } else {
            o3Var.f45355e = p9Var.g();
        }
        int i18 = (i17 & 2) != 0 ? 1 : 0;
        o3Var.f45356f = this.f45252g;
        if ((i17 & 4) != 0) {
            o3Var.f45357g = this.f45253h;
            i18 |= 2;
        }
        if ((i17 & 8) != 0) {
            o3Var.f45358h = this.f45254i;
            i18 |= 4;
        }
        if ((i17 & 16) != 0) {
            o3Var.f45359i = this.f45255m;
            i18 |= 8;
        }
        if ((i17 & 32) != 0) {
            i18 |= 16;
        }
        o3Var.f45360m = this.f45256n;
        if ((i17 & 64) != 0) {
            i18 |= 32;
        }
        o3Var.f45361n = this.f45257o;
        o3Var.f45354d = i18;
        onBuilt();
        return o3Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.k3) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f45251f == null) {
            this.f45251f = new com.google.protobuf.p9(this.f45250e, (this.f45249d & 1) != 0, getParentForChildren(), isClean());
            this.f45250e = null;
        }
        return this.f45251f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.k3 e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.o3.f45353q     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.j3 r0 = (com.google.protobuf.j3) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.o3 r2 = (com.google.protobuf.o3) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.o3 r3 = (com.google.protobuf.o3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k3.e(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.k3");
    }

    public com.google.protobuf.k3 f(com.google.protobuf.o3 o3Var) {
        if (o3Var == com.google.protobuf.o3.f45352p) {
            return this;
        }
        if (this.f45251f == null) {
            if (!o3Var.f45355e.isEmpty()) {
                if (this.f45250e.isEmpty()) {
                    this.f45250e = o3Var.f45355e;
                    this.f45249d &= -2;
                } else {
                    if ((this.f45249d & 1) == 0) {
                        this.f45250e = new java.util.ArrayList(this.f45250e);
                        this.f45249d |= 1;
                    }
                    this.f45250e.addAll(o3Var.f45355e);
                }
                onChanged();
            }
        } else if (!o3Var.f45355e.isEmpty()) {
            if (this.f45251f.p()) {
                this.f45251f.f45409a = null;
                this.f45251f = null;
                this.f45250e = o3Var.f45355e;
                this.f45249d &= -2;
                this.f45251f = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f45251f.b(o3Var.f45355e);
            }
        }
        if ((o3Var.f45354d & 1) != 0) {
            this.f45249d |= 2;
            this.f45252g = o3Var.f45356f;
            onChanged();
        }
        if ((o3Var.f45354d & 2) != 0) {
            long j17 = o3Var.f45357g;
            this.f45249d |= 4;
            this.f45253h = j17;
            onChanged();
        }
        if ((o3Var.f45354d & 4) != 0) {
            long j18 = o3Var.f45358h;
            this.f45249d |= 8;
            this.f45254i = j18;
            onChanged();
        }
        if ((o3Var.f45354d & 8) != 0) {
            double d17 = o3Var.f45359i;
            this.f45249d |= 16;
            this.f45255m = d17;
            onChanged();
        }
        if ((o3Var.f45354d & 16) != 0) {
            com.google.protobuf.y yVar = o3Var.f45360m;
            yVar.getClass();
            this.f45249d |= 32;
            this.f45256n = yVar;
            onChanged();
        }
        if ((o3Var.f45354d & 32) != 0) {
            this.f45249d |= 64;
            this.f45257o = o3Var.f45361n;
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.o3.f45352p;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.O;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.P;
        j6Var.c(com.google.protobuf.o3.class, com.google.protobuf.k3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45251f;
            if (i17 >= (p9Var == null ? this.f45250e.size() : p9Var.l())) {
                return true;
            }
            com.google.protobuf.p9 p9Var2 = this.f45251f;
            if (!(p9Var2 == null ? (com.google.protobuf.n3) this.f45250e.get(i17) : (com.google.protobuf.n3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
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
        return (com.google.protobuf.k3) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.o3.f45352p;
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
        com.google.protobuf.o3 buildPartial = buildPartial();
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

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.o3) {
            f((com.google.protobuf.o3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public k3(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45250e = java.util.Collections.emptyList();
        this.f45252g = "";
        this.f45256n = com.google.protobuf.y.f45712e;
        this.f45257o = "";
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.o3) {
            f((com.google.protobuf.o3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
