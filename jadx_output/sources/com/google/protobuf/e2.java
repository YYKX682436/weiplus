package com.google.protobuf;

/* loaded from: classes16.dex */
public final class e2 extends com.google.protobuf.s5 {
    public java.lang.Object A;
    public java.lang.Object B;
    public java.util.List C;
    public com.google.protobuf.p9 D;

    /* renamed from: e, reason: collision with root package name */
    public int f45036e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f45037f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f45038g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45039h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45040i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f45041m;

    /* renamed from: n, reason: collision with root package name */
    public int f45042n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f45043o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f45044p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45045q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f45046r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f45047s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f45048t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f45049u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Object f45050v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Object f45051w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Object f45052x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f45053y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Object f45054z;

    public e2(com.google.protobuf.o0 o0Var) {
        this.f45037f = "";
        this.f45038g = "";
        this.f45042n = 1;
        this.f45043o = "";
        this.f45049u = true;
        this.f45050v = "";
        this.f45051w = "";
        this.f45052x = "";
        this.f45053y = "";
        this.f45054z = "";
        this.A = "";
        this.B = "";
        this.C = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.e2) c(b4Var, obj);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.g2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.e2) m83clone();
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.g2.E;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45406y;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.g2 buildPartial() {
        com.google.protobuf.g2 g2Var = new com.google.protobuf.g2(this, null);
        int i17 = this.f45036e;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        g2Var.f45103f = this.f45037f;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        g2Var.f45104g = this.f45038g;
        if ((i17 & 4) != 0) {
            g2Var.f45105h = this.f45039h;
            i18 |= 4;
        }
        if ((i17 & 8) != 0) {
            g2Var.f45106i = this.f45040i;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            g2Var.f45107m = this.f45041m;
            i18 |= 16;
        }
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        g2Var.f45108n = this.f45042n;
        if ((i17 & 64) != 0) {
            i18 |= 64;
        }
        g2Var.f45109o = this.f45043o;
        if ((i17 & 128) != 0) {
            g2Var.f45110p = this.f45044p;
            i18 |= 128;
        }
        if ((i17 & 256) != 0) {
            g2Var.f45111q = this.f45045q;
            i18 |= 256;
        }
        if ((i17 & 512) != 0) {
            g2Var.f45112r = this.f45046r;
            i18 |= 512;
        }
        if ((i17 & 1024) != 0) {
            g2Var.f45113s = this.f45047s;
            i18 |= 1024;
        }
        if ((i17 & 2048) != 0) {
            g2Var.f45114t = this.f45048t;
            i18 |= 2048;
        }
        if ((i17 & 4096) != 0) {
            i18 |= 4096;
        }
        g2Var.f45115u = this.f45049u;
        if ((i17 & 8192) != 0) {
            i18 |= 8192;
        }
        g2Var.f45116v = this.f45050v;
        if ((i17 & 16384) != 0) {
            i18 |= 16384;
        }
        g2Var.f45117w = this.f45051w;
        if ((i17 & 32768) != 0) {
            i18 |= 32768;
        }
        g2Var.f45118x = this.f45052x;
        if ((i17 & 65536) != 0) {
            i18 |= 65536;
        }
        g2Var.f45119y = this.f45053y;
        if ((i17 & 131072) != 0) {
            i18 |= 131072;
        }
        g2Var.f45120z = this.f45054z;
        if ((i17 & 262144) != 0) {
            i18 |= 262144;
        }
        g2Var.A = this.A;
        if ((i17 & 524288) != 0) {
            i18 |= 524288;
        }
        g2Var.B = this.B;
        com.google.protobuf.p9 p9Var = this.D;
        if (p9Var == null) {
            if ((this.f45036e & 1048576) != 0) {
                this.C = java.util.Collections.unmodifiableList(this.C);
                this.f45036e &= -1048577;
            }
            g2Var.C = this.C;
        } else {
            g2Var.C = p9Var.g();
        }
        g2Var.f45102e = i18;
        onBuilt();
        return g2Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45407z;
        j6Var.c(com.google.protobuf.g2.class, com.google.protobuf.e2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.D;
            if (i17 >= (p9Var == null ? this.C.size() : p9Var.l())) {
                return e();
            }
            com.google.protobuf.p9 p9Var2 = this.D;
            if (!(p9Var2 == null ? (com.google.protobuf.o3) this.C.get(i17) : (com.google.protobuf.o3) p9Var2.m(i17, false)).isInitialized()) {
                return false;
            }
            i17++;
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.D == null) {
            this.D = new com.google.protobuf.p9(this.C, (this.f45036e & 1048576) != 0, getParentForChildren(), isClean());
            this.C = null;
        }
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.e2 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.g2.F     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.d2 r0 = (com.google.protobuf.d2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.g2 r2 = (com.google.protobuf.g2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.g2 r3 = (com.google.protobuf.g2) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e2.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.e2");
    }

    public com.google.protobuf.e2 l(com.google.protobuf.g2 g2Var) {
        if (g2Var == com.google.protobuf.g2.E) {
            return this;
        }
        if ((g2Var.f45102e & 1) != 0) {
            this.f45036e |= 1;
            this.f45037f = g2Var.f45103f;
            onChanged();
        }
        if ((g2Var.f45102e & 2) != 0) {
            this.f45036e |= 2;
            this.f45038g = g2Var.f45104g;
            onChanged();
        }
        if ((g2Var.f45102e & 4) != 0) {
            boolean z17 = g2Var.f45105h;
            this.f45036e |= 4;
            this.f45039h = z17;
            onChanged();
        }
        if ((g2Var.f45102e & 8) != 0) {
            boolean z18 = g2Var.f45106i;
            this.f45036e |= 8;
            this.f45040i = z18;
            onChanged();
        }
        if ((g2Var.f45102e & 16) != 0) {
            boolean z19 = g2Var.f45107m;
            this.f45036e |= 16;
            this.f45041m = z19;
            onChanged();
        }
        if ((g2Var.f45102e & 32) != 0) {
            com.google.protobuf.f2 a17 = com.google.protobuf.f2.a(g2Var.f45108n);
            if (a17 == null) {
                a17 = com.google.protobuf.f2.SPEED;
            }
            this.f45036e |= 32;
            this.f45042n = a17.f45073d;
            onChanged();
        }
        if ((g2Var.f45102e & 64) != 0) {
            this.f45036e |= 64;
            this.f45043o = g2Var.f45109o;
            onChanged();
        }
        if ((g2Var.f45102e & 128) != 0) {
            boolean z27 = g2Var.f45110p;
            this.f45036e |= 128;
            this.f45044p = z27;
            onChanged();
        }
        if ((g2Var.f45102e & 256) != 0) {
            boolean z28 = g2Var.f45111q;
            this.f45036e |= 256;
            this.f45045q = z28;
            onChanged();
        }
        if ((g2Var.f45102e & 512) != 0) {
            boolean z29 = g2Var.f45112r;
            this.f45036e |= 512;
            this.f45046r = z29;
            onChanged();
        }
        if ((g2Var.f45102e & 1024) != 0) {
            boolean z37 = g2Var.f45113s;
            this.f45036e |= 1024;
            this.f45047s = z37;
            onChanged();
        }
        if ((g2Var.f45102e & 2048) != 0) {
            boolean z38 = g2Var.f45114t;
            this.f45036e |= 2048;
            this.f45048t = z38;
            onChanged();
        }
        if ((g2Var.f45102e & 4096) != 0) {
            boolean z39 = g2Var.f45115u;
            this.f45036e |= 4096;
            this.f45049u = z39;
            onChanged();
        }
        if ((g2Var.f45102e & 8192) != 0) {
            this.f45036e |= 8192;
            this.f45050v = g2Var.f45116v;
            onChanged();
        }
        if ((g2Var.f45102e & 16384) != 0) {
            this.f45036e |= 16384;
            this.f45051w = g2Var.f45117w;
            onChanged();
        }
        if (g2Var.y()) {
            this.f45036e |= 32768;
            this.f45052x = g2Var.f45118x;
            onChanged();
        }
        if (g2Var.u()) {
            this.f45036e |= 65536;
            this.f45053y = g2Var.f45119y;
            onChanged();
        }
        if (g2Var.w()) {
            this.f45036e |= 131072;
            this.f45054z = g2Var.f45120z;
            onChanged();
        }
        if (g2Var.v()) {
            this.f45036e |= 262144;
            this.A = g2Var.A;
            onChanged();
        }
        if (g2Var.x()) {
            this.f45036e |= 524288;
            this.B = g2Var.B;
            onChanged();
        }
        if (this.D == null) {
            if (!g2Var.C.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = g2Var.C;
                    this.f45036e &= -1048577;
                } else {
                    if ((this.f45036e & 1048576) == 0) {
                        this.C = new java.util.ArrayList(this.C);
                        this.f45036e |= 1048576;
                    }
                    this.C.addAll(g2Var.C);
                }
                onChanged();
            }
        } else if (!g2Var.C.isEmpty()) {
            if (this.D.p()) {
                this.D.f45409a = null;
                this.D = null;
                this.C = g2Var.C;
                this.f45036e &= -1048577;
                this.D = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.D.b(g2Var.C);
            }
        }
        f(g2Var);
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
        return (com.google.protobuf.e2) m84mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        return (com.google.protobuf.e2) g(b4Var, obj);
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return com.google.protobuf.g2.E;
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
        com.google.protobuf.g2 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.g2) {
            l((com.google.protobuf.g2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.g2) {
            l((com.google.protobuf.g2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public e2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45037f = "";
        this.f45038g = "";
        this.f45042n = 1;
        this.f45043o = "";
        this.f45049u = true;
        this.f45050v = "";
        this.f45051w = "";
        this.f45052x = "";
        this.f45053y = "";
        this.f45054z = "";
        this.A = "";
        this.B = "";
        this.C = java.util.Collections.emptyList();
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            j();
        }
    }
}
