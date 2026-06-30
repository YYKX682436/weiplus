package vg;

/* loaded from: classes16.dex */
public final class g extends com.p176xb6135e39.p283xc50a8b8b.q5 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f517969d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f517970e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f517971f;

    /* renamed from: g, reason: collision with root package name */
    public int f517972g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f517973h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.p9 f517974i;

    public g(vg.a aVar) {
        super(null);
        boolean z17;
        this.f517970e = "";
        this.f517971f = "";
        this.f517973h = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20556x59bc66e() {
        vg.h mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public vg.h mo20557x85702333() {
        vg.h hVar = new vg.h(this);
        hVar.f77335x4bb6eb1f = this.f517970e;
        hVar.f77336x39edf8ef = this.f517971f;
        hVar.f77333x9cfbf39d = this.f517972g;
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f517974i;
        if (p9Var == null) {
            if ((this.f517969d & 1) != 0) {
                this.f517973h = java.util.Collections.unmodifiableList(this.f517973h);
                this.f517969d &= -2;
            }
            hVar.f77334x1034184c = this.f517973h;
        } else {
            hVar.f77334x1034184c = p9Var.g();
        }
        m20880xaf619bdf();
        return hVar;
    }

    /* renamed from: clone */
    public java.lang.Object m171906x5a5dd5d() {
        return (vg.g) m45490x5a5dd5d();
    }

    public final com.p176xb6135e39.p283xc50a8b8b.p9 d() {
        if (this.f517974i == null) {
            this.f517974i = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f517973h, (this.f517969d & 1) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f517973h = null;
        }
        return this.f517974i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vg.g e(com.p176xb6135e39.p283xc50a8b8b.d0 r3, com.p176xb6135e39.p283xc50a8b8b.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = vg.h.m171918xbf194f61()     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            java.lang.Object r3 = r1.mo20549xc7f9c18(r3, r4)     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            vg.h r3 = (vg.h) r3     // Catch: java.lang.Throwable -> L11 com.p176xb6135e39.p283xc50a8b8b.y6 -> L13
            if (r3 == 0) goto L10
            r2.f(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f127272d     // Catch: java.lang.Throwable -> L11
            vg.h r4 = (vg.h) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.f(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.g.e(com.google.protobuf.d0, com.google.protobuf.t4):vg.g");
    }

    public vg.g f(vg.h hVar) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        boolean z17;
        com.p176xb6135e39.p283xc50a8b8b.wa waVar;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (hVar == vg.h.m171921x7c90cfc0()) {
            return this;
        }
        if (!hVar.m171945xfe2df90a().isEmpty()) {
            obj2 = hVar.f77335x4bb6eb1f;
            this.f517970e = obj2;
            m20881x7bb163d5();
        }
        if (!hVar.m171947x2a9626ba().isEmpty()) {
            obj = hVar.f77336x39edf8ef;
            this.f517971f = obj;
            m20881x7bb163d5();
        }
        if (hVar.m171939x987a64f8() != 0) {
            this.f517972g = hVar.m171939x987a64f8();
            m20881x7bb163d5();
        }
        if (this.f517974i == null) {
            list4 = hVar.f77334x1034184c;
            if (!list4.isEmpty()) {
                if (this.f517973h.isEmpty()) {
                    list6 = hVar.f77334x1034184c;
                    this.f517973h = list6;
                    this.f517969d &= -2;
                } else {
                    if ((this.f517969d & 1) == 0) {
                        this.f517973h = new java.util.ArrayList(this.f517973h);
                        this.f517969d |= 1;
                    }
                    java.util.List list7 = this.f517973h;
                    list5 = hVar.f77334x1034184c;
                    list7.addAll(list5);
                }
                m20881x7bb163d5();
            }
        } else {
            list = hVar.f77334x1034184c;
            if (!list.isEmpty()) {
                if (this.f517974i.p()) {
                    this.f517974i.f126942a = null;
                    this.f517974i = null;
                    list3 = hVar.f77334x1034184c;
                    this.f517973h = list3;
                    this.f517969d &= -2;
                    z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
                    this.f517974i = z17 ? d() : null;
                } else {
                    com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f517974i;
                    list2 = hVar.f77334x1034184c;
                    p9Var.b(list2);
                }
            }
        }
        waVar = ((com.p176xb6135e39.p283xc50a8b8b.l6) hVar).f7874x4f0c37a3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.k8 mo20559x786693c3() {
        return vg.h.m171921x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return vg.i.f517977c;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = vg.i.f517978d;
        j6Var.c(vg.h.class, vg.g.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.a mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.a m45492xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (vg.g) m45492xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20559x786693c3() {
        return vg.h.m171921x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.e, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.e mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.j8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public com.p176xb6135e39.p283xc50a8b8b.o8 mo20556x59bc66e() {
        vg.h mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.n8
    /* renamed from: mergeFrom */
    public /* bridge */ /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.n8 mo20526x60f45402(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.a mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof vg.h) {
            f((vg.h) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }

    public g(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var, vg.a aVar) {
        super(r5Var);
        boolean z17;
        this.f517970e = "";
        this.f517971f = "";
        this.f517973h = java.util.Collections.emptyList();
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            d();
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: mergeFrom */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20527x60f45402(com.p176xb6135e39.p283xc50a8b8b.k8 k8Var) {
        if (k8Var instanceof vg.h) {
            f((vg.h) k8Var);
        } else {
            super.mo20527x60f45402(k8Var);
        }
        return this;
    }
}
