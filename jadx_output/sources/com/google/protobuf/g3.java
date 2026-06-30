package com.google.protobuf;

/* loaded from: classes16.dex */
public final class g3 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45121d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.protobuf.t6 f45122e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.t6 f45123f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f45124g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f45125h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.g7 f45126i;

    public g3(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45122e = com.google.protobuf.l6.emptyIntList();
        this.f45123f = com.google.protobuf.l6.emptyIntList();
        this.f45124g = "";
        this.f45125h = "";
        this.f45126i = com.google.protobuf.f7.f45086f;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.h3 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.h3 buildPartial() {
        com.google.protobuf.h3 h3Var = new com.google.protobuf.h3(this, null);
        int i17 = this.f45121d;
        if ((i17 & 1) != 0) {
            ((com.google.protobuf.h) this.f45122e).f45145d = false;
            this.f45121d = i17 & (-2);
        }
        h3Var.f45152e = this.f45122e;
        int i18 = this.f45121d;
        if ((i18 & 2) != 0) {
            ((com.google.protobuf.h) this.f45123f).f45145d = false;
            this.f45121d = i18 & (-3);
        }
        h3Var.f45154g = this.f45123f;
        int i19 = (i17 & 4) != 0 ? 1 : 0;
        h3Var.f45156i = this.f45124g;
        if ((i17 & 8) != 0) {
            i19 |= 2;
        }
        h3Var.f45157m = this.f45125h;
        if ((this.f45121d & 16) != 0) {
            this.f45126i = this.f45126i.b();
            this.f45121d &= -17;
        }
        h3Var.f45158n = this.f45126i;
        h3Var.f45151d = i19;
        onBuilt();
        return h3Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.g3) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.g3 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.h3.f45150q     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.f3 r0 = (com.google.protobuf.f3) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.h3 r2 = (com.google.protobuf.h3) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.h3 r3 = (com.google.protobuf.h3) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g3.d(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.g3");
    }

    public com.google.protobuf.g3 e(com.google.protobuf.h3 h3Var) {
        if (h3Var == com.google.protobuf.h3.f45149p) {
            return this;
        }
        if (!h3Var.f45152e.isEmpty()) {
            if (this.f45122e.isEmpty()) {
                this.f45122e = h3Var.f45152e;
                this.f45121d &= -2;
            } else {
                if ((this.f45121d & 1) == 0) {
                    this.f45122e = com.google.protobuf.l6.mutableCopy(this.f45122e);
                    this.f45121d |= 1;
                }
                ((com.google.protobuf.m6) this.f45122e).addAll(h3Var.f45152e);
            }
            onChanged();
        }
        if (!h3Var.f45154g.isEmpty()) {
            if (this.f45123f.isEmpty()) {
                this.f45123f = h3Var.f45154g;
                this.f45121d &= -3;
            } else {
                if ((this.f45121d & 2) == 0) {
                    this.f45123f = com.google.protobuf.l6.mutableCopy(this.f45123f);
                    this.f45121d |= 2;
                }
                ((com.google.protobuf.m6) this.f45123f).addAll(h3Var.f45154g);
            }
            onChanged();
        }
        if ((h3Var.f45151d & 1) != 0) {
            this.f45121d |= 4;
            this.f45124g = h3Var.f45156i;
            onChanged();
        }
        if ((h3Var.f45151d & 2) != 0) {
            this.f45121d |= 8;
            this.f45125h = h3Var.f45157m;
            onChanged();
        }
        if (!h3Var.f45158n.isEmpty()) {
            if (this.f45126i.isEmpty()) {
                this.f45126i = h3Var.f45158n;
                this.f45121d &= -17;
            } else {
                if ((this.f45121d & 16) == 0) {
                    this.f45126i = new com.google.protobuf.f7(this.f45126i);
                    this.f45121d |= 16;
                }
                this.f45126i.addAll(h3Var.f45158n);
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.h3.f45149p;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.U;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.V;
        j6Var.c(com.google.protobuf.h3.class, com.google.protobuf.g3.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.g3) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.h3.f45149p;
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
        com.google.protobuf.h3 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.h3) {
            e((com.google.protobuf.h3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public g3(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45122e = com.google.protobuf.l6.emptyIntList();
        this.f45123f = com.google.protobuf.l6.emptyIntList();
        this.f45124g = "";
        this.f45125h = "";
        this.f45126i = com.google.protobuf.f7.f45086f;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.h3) {
            e((com.google.protobuf.h3) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
