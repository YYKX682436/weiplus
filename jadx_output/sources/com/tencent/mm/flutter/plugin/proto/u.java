package com.tencent.mm.flutter.plugin.proto;

/* loaded from: classes16.dex */
public final class u extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f68090d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f68091e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f68092f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f68093g;

    public u(com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(null);
        boolean z17;
        this.f68091e = "";
        this.f68092f = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
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
        com.tencent.mm.flutter.plugin.proto.v buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.flutter.plugin.proto.v buildPartial() {
        com.tencent.mm.flutter.plugin.proto.v vVar = new com.tencent.mm.flutter.plugin.proto.v(this, null);
        int i17 = (this.f68090d & 1) == 0 ? 0 : 1;
        vVar.f68097e = this.f68091e;
        com.google.protobuf.p9 p9Var = this.f68093g;
        if (p9Var == null) {
            if ((this.f68090d & 2) != 0) {
                this.f68092f = java.util.Collections.unmodifiableList(this.f68092f);
                this.f68090d &= -3;
            }
            vVar.f68098f = this.f68092f;
        } else {
            vVar.f68098f = p9Var.g();
        }
        vVar.f68096d = i17;
        onBuilt();
        return vVar;
    }

    public java.lang.Object clone() {
        return (com.tencent.mm.flutter.plugin.proto.u) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f68093g == null) {
            this.f68093g = new com.google.protobuf.p9(this.f68092f, (this.f68090d & 2) != 0, getParentForChildren(), isClean());
            this.f68092f = null;
        }
        return this.f68093g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.flutter.plugin.proto.u e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.tencent.mm.flutter.plugin.proto.v.f68095i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.t r0 = (com.tencent.mm.flutter.plugin.proto.t) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.tencent.mm.flutter.plugin.proto.v r2 = (com.tencent.mm.flutter.plugin.proto.v) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.tencent.mm.flutter.plugin.proto.v r3 = (com.tencent.mm.flutter.plugin.proto.v) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.flutter.plugin.proto.u.e(com.google.protobuf.d0, com.google.protobuf.t4):com.tencent.mm.flutter.plugin.proto.u");
    }

    public com.tencent.mm.flutter.plugin.proto.u f(com.tencent.mm.flutter.plugin.proto.v vVar) {
        boolean z17;
        com.google.protobuf.wa waVar;
        if (vVar == com.tencent.mm.flutter.plugin.proto.v.f68094h) {
            return this;
        }
        if (vVar.j()) {
            this.f68090d |= 1;
            this.f68091e = vVar.f68097e;
            onChanged();
        }
        if (this.f68093g == null) {
            if (!vVar.f68098f.isEmpty()) {
                if (this.f68092f.isEmpty()) {
                    this.f68092f = vVar.f68098f;
                    this.f68090d &= -3;
                } else {
                    if ((this.f68090d & 2) == 0) {
                        this.f68092f = new java.util.ArrayList(this.f68092f);
                        this.f68090d |= 2;
                    }
                    this.f68092f.addAll(vVar.f68098f);
                }
                onChanged();
            }
        } else if (!vVar.f68098f.isEmpty()) {
            if (this.f68093g.p()) {
                this.f68093g.f45409a = null;
                this.f68093g = null;
                this.f68092f = vVar.f68098f;
                this.f68090d &= -3;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f68093g = z17 ? d() : null;
            } else {
                this.f68093g.b(vVar.f68098f);
            }
        }
        waVar = ((com.google.protobuf.l6) vVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.tencent.mm.flutter.plugin.proto.v.f68094h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.tencent.mm.flutter.plugin.proto.o0.f68049u;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.tencent.mm.flutter.plugin.proto.o0.f68050v;
        j6Var.c(com.tencent.mm.flutter.plugin.proto.v.class, com.tencent.mm.flutter.plugin.proto.u.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        if (!((this.f68090d & 1) != 0)) {
            return false;
        }
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f68093g;
            if (i17 >= (p9Var == null ? this.f68092f.size() : p9Var.l())) {
                return true;
            }
            com.google.protobuf.p9 p9Var2 = this.f68093g;
            if (!(p9Var2 == null ? (com.tencent.mm.flutter.plugin.proto.b0) this.f68092f.get(i17) : (com.tencent.mm.flutter.plugin.proto.b0) p9Var2.m(i17, false)).isInitialized()) {
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
        return (com.tencent.mm.flutter.plugin.proto.u) m84mergeUnknownFields(waVar);
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
        return com.tencent.mm.flutter.plugin.proto.v.f68094h;
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
        com.tencent.mm.flutter.plugin.proto.v buildPartial = buildPartial();
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
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.v) {
            f((com.tencent.mm.flutter.plugin.proto.v) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public u(com.google.protobuf.r5 r5Var, com.tencent.mm.flutter.plugin.proto.g gVar) {
        super(r5Var);
        boolean z17;
        this.f68091e = "";
        this.f68092f = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.tencent.mm.flutter.plugin.proto.v) {
            f((com.tencent.mm.flutter.plugin.proto.v) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
