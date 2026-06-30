package com.google.protobuf;

/* loaded from: classes16.dex */
public final class b2 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f44884d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f44885e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f44886f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.g7 f44887g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t6 f44888h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.t6 f44889i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f44890m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.p9 f44891n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f44892o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.protobuf.p9 f44893p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f44894q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.protobuf.p9 f44895r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f44896s;

    /* renamed from: t, reason: collision with root package name */
    public com.google.protobuf.p9 f44897t;

    /* renamed from: u, reason: collision with root package name */
    public com.google.protobuf.g2 f44898u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.protobuf.t9 f44899v;

    /* renamed from: w, reason: collision with root package name */
    public com.google.protobuf.i3 f44900w;

    /* renamed from: x, reason: collision with root package name */
    public com.google.protobuf.t9 f44901x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Object f44902y;

    public b2(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f44885e = "";
        this.f44886f = "";
        this.f44887g = com.google.protobuf.f7.f45086f;
        this.f44888h = com.google.protobuf.l6.emptyIntList();
        this.f44889i = com.google.protobuf.l6.emptyIntList();
        this.f44890m = java.util.Collections.emptyList();
        this.f44892o = java.util.Collections.emptyList();
        this.f44894q = java.util.Collections.emptyList();
        this.f44896s = java.util.Collections.emptyList();
        this.f44902y = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.c2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.c2 buildPartial() {
        com.google.protobuf.c2 c2Var = new com.google.protobuf.c2(this, null);
        int i17 = this.f44884d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        c2Var.f44954e = this.f44885e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        c2Var.f44955f = this.f44886f;
        if ((this.f44884d & 4) != 0) {
            this.f44887g = this.f44887g.b();
            this.f44884d &= -5;
        }
        c2Var.f44956g = this.f44887g;
        int i19 = this.f44884d;
        if ((i19 & 8) != 0) {
            ((com.google.protobuf.h) this.f44888h).f45145d = false;
            this.f44884d = i19 & (-9);
        }
        c2Var.f44957h = this.f44888h;
        int i27 = this.f44884d;
        if ((i27 & 16) != 0) {
            ((com.google.protobuf.h) this.f44889i).f45145d = false;
            this.f44884d = i27 & (-17);
        }
        c2Var.f44958i = this.f44889i;
        com.google.protobuf.p9 p9Var = this.f44891n;
        if (p9Var == null) {
            if ((this.f44884d & 32) != 0) {
                this.f44890m = java.util.Collections.unmodifiableList(this.f44890m);
                this.f44884d &= -33;
            }
            c2Var.f44959m = this.f44890m;
        } else {
            c2Var.f44959m = p9Var.g();
        }
        com.google.protobuf.p9 p9Var2 = this.f44893p;
        if (p9Var2 == null) {
            if ((this.f44884d & 64) != 0) {
                this.f44892o = java.util.Collections.unmodifiableList(this.f44892o);
                this.f44884d &= -65;
            }
            c2Var.f44960n = this.f44892o;
        } else {
            c2Var.f44960n = p9Var2.g();
        }
        com.google.protobuf.p9 p9Var3 = this.f44895r;
        if (p9Var3 == null) {
            if ((this.f44884d & 128) != 0) {
                this.f44894q = java.util.Collections.unmodifiableList(this.f44894q);
                this.f44884d &= -129;
            }
            c2Var.f44961o = this.f44894q;
        } else {
            c2Var.f44961o = p9Var3.g();
        }
        com.google.protobuf.p9 p9Var4 = this.f44897t;
        if (p9Var4 == null) {
            if ((this.f44884d & 256) != 0) {
                this.f44896s = java.util.Collections.unmodifiableList(this.f44896s);
                this.f44884d &= -257;
            }
            c2Var.f44962p = this.f44896s;
        } else {
            c2Var.f44962p = p9Var4.g();
        }
        if ((i17 & 512) != 0) {
            com.google.protobuf.t9 t9Var = this.f44899v;
            if (t9Var == null) {
                c2Var.f44963q = this.f44898u;
            } else {
                c2Var.f44963q = (com.google.protobuf.g2) t9Var.b();
            }
            i18 |= 4;
        }
        if ((i17 & 1024) != 0) {
            com.google.protobuf.t9 t9Var2 = this.f44901x;
            if (t9Var2 == null) {
                c2Var.f44964r = this.f44900w;
            } else {
                c2Var.f44964r = (com.google.protobuf.i3) t9Var2.b();
            }
            i18 |= 8;
        }
        if ((i17 & 2048) != 0) {
            i18 |= 16;
        }
        c2Var.f44965s = this.f44902y;
        c2Var.f44953d = i18;
        onBuilt();
        return c2Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.b2) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f44893p == null) {
            this.f44893p = new com.google.protobuf.p9(this.f44892o, (this.f44884d & 64) != 0, getParentForChildren(), isClean());
            this.f44892o = null;
        }
        return this.f44893p;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f44897t == null) {
            this.f44897t = new com.google.protobuf.p9(this.f44896s, (this.f44884d & 256) != 0, getParentForChildren(), isClean());
            this.f44896s = null;
        }
        return this.f44897t;
    }

    public final com.google.protobuf.p9 f() {
        if (this.f44891n == null) {
            this.f44891n = new com.google.protobuf.p9(this.f44890m, (this.f44884d & 32) != 0, getParentForChildren(), isClean());
            this.f44890m = null;
        }
        return this.f44891n;
    }

    public final com.google.protobuf.p9 g() {
        if (this.f44895r == null) {
            this.f44895r = new com.google.protobuf.p9(this.f44894q, (this.f44884d & 128) != 0, getParentForChildren(), isClean());
            this.f44894q = null;
        }
        return this.f44895r;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.c2.f44951u;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45382a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.b2 h(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.c2.f44952v     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.a2 r0 = (com.google.protobuf.a2) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.c2 r2 = (com.google.protobuf.c2) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.i(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.c2 r3 = (com.google.protobuf.c2) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.i(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.b2.h(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.b2");
    }

    public com.google.protobuf.b2 i(com.google.protobuf.c2 c2Var) {
        com.google.protobuf.i3 i3Var;
        com.google.protobuf.i3 i3Var2;
        com.google.protobuf.g2 g2Var;
        com.google.protobuf.g2 g2Var2;
        if (c2Var == com.google.protobuf.c2.f44951u) {
            return this;
        }
        if ((c2Var.f44953d & 1) != 0) {
            this.f44884d |= 1;
            this.f44885e = c2Var.f44954e;
            onChanged();
        }
        if ((c2Var.f44953d & 2) != 0) {
            this.f44884d |= 2;
            this.f44886f = c2Var.f44955f;
            onChanged();
        }
        if (!c2Var.f44956g.isEmpty()) {
            if (this.f44887g.isEmpty()) {
                this.f44887g = c2Var.f44956g;
                this.f44884d &= -5;
            } else {
                if ((this.f44884d & 4) == 0) {
                    this.f44887g = new com.google.protobuf.f7(this.f44887g);
                    this.f44884d |= 4;
                }
                this.f44887g.addAll(c2Var.f44956g);
            }
            onChanged();
        }
        if (!c2Var.f44957h.isEmpty()) {
            if (this.f44888h.isEmpty()) {
                this.f44888h = c2Var.f44957h;
                this.f44884d &= -9;
            } else {
                if ((this.f44884d & 8) == 0) {
                    this.f44888h = com.google.protobuf.l6.mutableCopy(this.f44888h);
                    this.f44884d |= 8;
                }
                ((com.google.protobuf.m6) this.f44888h).addAll(c2Var.f44957h);
            }
            onChanged();
        }
        if (!c2Var.f44958i.isEmpty()) {
            if (this.f44889i.isEmpty()) {
                this.f44889i = c2Var.f44958i;
                this.f44884d &= -17;
            } else {
                if ((this.f44884d & 16) == 0) {
                    this.f44889i = com.google.protobuf.l6.mutableCopy(this.f44889i);
                    this.f44884d |= 16;
                }
                ((com.google.protobuf.m6) this.f44889i).addAll(c2Var.f44958i);
            }
            onChanged();
        }
        if (this.f44891n == null) {
            if (!c2Var.f44959m.isEmpty()) {
                if (this.f44890m.isEmpty()) {
                    this.f44890m = c2Var.f44959m;
                    this.f44884d &= -33;
                } else {
                    if ((this.f44884d & 32) == 0) {
                        this.f44890m = new java.util.ArrayList(this.f44890m);
                        this.f44884d |= 32;
                    }
                    this.f44890m.addAll(c2Var.f44959m);
                }
                onChanged();
            }
        } else if (!c2Var.f44959m.isEmpty()) {
            if (this.f44891n.p()) {
                this.f44891n.f45409a = null;
                this.f44891n = null;
                this.f44890m = c2Var.f44959m;
                this.f44884d &= -33;
                this.f44891n = com.google.protobuf.l6.alwaysUseFieldBuilders ? f() : null;
            } else {
                this.f44891n.b(c2Var.f44959m);
            }
        }
        if (this.f44893p == null) {
            if (!c2Var.f44960n.isEmpty()) {
                if (this.f44892o.isEmpty()) {
                    this.f44892o = c2Var.f44960n;
                    this.f44884d &= -65;
                } else {
                    if ((this.f44884d & 64) == 0) {
                        this.f44892o = new java.util.ArrayList(this.f44892o);
                        this.f44884d |= 64;
                    }
                    this.f44892o.addAll(c2Var.f44960n);
                }
                onChanged();
            }
        } else if (!c2Var.f44960n.isEmpty()) {
            if (this.f44893p.p()) {
                this.f44893p.f45409a = null;
                this.f44893p = null;
                this.f44892o = c2Var.f44960n;
                this.f44884d &= -65;
                this.f44893p = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f44893p.b(c2Var.f44960n);
            }
        }
        if (this.f44895r == null) {
            if (!c2Var.f44961o.isEmpty()) {
                if (this.f44894q.isEmpty()) {
                    this.f44894q = c2Var.f44961o;
                    this.f44884d &= -129;
                } else {
                    if ((this.f44884d & 128) == 0) {
                        this.f44894q = new java.util.ArrayList(this.f44894q);
                        this.f44884d |= 128;
                    }
                    this.f44894q.addAll(c2Var.f44961o);
                }
                onChanged();
            }
        } else if (!c2Var.f44961o.isEmpty()) {
            if (this.f44895r.p()) {
                this.f44895r.f45409a = null;
                this.f44895r = null;
                this.f44894q = c2Var.f44961o;
                this.f44884d &= -129;
                this.f44895r = com.google.protobuf.l6.alwaysUseFieldBuilders ? g() : null;
            } else {
                this.f44895r.b(c2Var.f44961o);
            }
        }
        if (this.f44897t == null) {
            if (!c2Var.f44962p.isEmpty()) {
                if (this.f44896s.isEmpty()) {
                    this.f44896s = c2Var.f44962p;
                    this.f44884d &= -257;
                } else {
                    if ((this.f44884d & 256) == 0) {
                        this.f44896s = new java.util.ArrayList(this.f44896s);
                        this.f44884d |= 256;
                    }
                    this.f44896s.addAll(c2Var.f44962p);
                }
                onChanged();
            }
        } else if (!c2Var.f44962p.isEmpty()) {
            if (this.f44897t.p()) {
                this.f44897t.f45409a = null;
                this.f44897t = null;
                this.f44896s = c2Var.f44962p;
                this.f44884d &= -257;
                this.f44897t = com.google.protobuf.l6.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f44897t.b(c2Var.f44962p);
            }
        }
        if (c2Var.j()) {
            com.google.protobuf.g2 f17 = c2Var.f();
            com.google.protobuf.t9 t9Var = this.f44899v;
            if (t9Var == null) {
                if ((this.f44884d & 512) == 0 || (g2Var = this.f44898u) == null || g2Var == (g2Var2 = com.google.protobuf.g2.E)) {
                    this.f44898u = f17;
                } else {
                    com.google.protobuf.e2 builder = g2Var2.toBuilder();
                    builder.l(g2Var);
                    builder.l(f17);
                    this.f44898u = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(f17);
            }
            this.f44884d |= 512;
        }
        if ((c2Var.f44953d & 8) != 0) {
            com.google.protobuf.i3 h17 = c2Var.h();
            com.google.protobuf.t9 t9Var2 = this.f44901x;
            if (t9Var2 == null) {
                if ((this.f44884d & 1024) == 0 || (i3Var = this.f44900w) == null || i3Var == (i3Var2 = com.google.protobuf.i3.f45187f)) {
                    this.f44900w = h17;
                } else {
                    com.google.protobuf.e3 builder2 = i3Var2.toBuilder();
                    builder2.f(i3Var);
                    builder2.f(h17);
                    this.f44900w = builder2.buildPartial();
                }
                onChanged();
            } else {
                t9Var2.g(h17);
            }
            this.f44884d |= 1024;
        }
        if ((c2Var.f44953d & 16) != 0) {
            this.f44884d |= 2048;
            this.f44902y = c2Var.f44965s;
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45383b;
        j6Var.c(com.google.protobuf.c2.class, com.google.protobuf.b2.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.g2 g2Var;
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f44891n;
            if (i17 < (p9Var == null ? this.f44890m.size() : p9Var.l())) {
                com.google.protobuf.p9 p9Var2 = this.f44891n;
                if (!(p9Var2 == null ? (com.google.protobuf.x0) this.f44890m.get(i17) : (com.google.protobuf.x0) p9Var2.m(i17, false)).isInitialized()) {
                    return false;
                }
                i17++;
            } else {
                int i18 = 0;
                while (true) {
                    com.google.protobuf.p9 p9Var3 = this.f44893p;
                    if (i18 < (p9Var3 == null ? this.f44892o.size() : p9Var3.l())) {
                        com.google.protobuf.p9 p9Var4 = this.f44893p;
                        if (!(p9Var4 == null ? (com.google.protobuf.d1) this.f44892o.get(i18) : (com.google.protobuf.d1) p9Var4.m(i18, false)).isInitialized()) {
                            return false;
                        }
                        i18++;
                    } else {
                        int i19 = 0;
                        while (true) {
                            com.google.protobuf.p9 p9Var5 = this.f44895r;
                            if (i19 < (p9Var5 == null ? this.f44894q.size() : p9Var5.l())) {
                                com.google.protobuf.p9 p9Var6 = this.f44895r;
                                if (!(p9Var6 == null ? (com.google.protobuf.z2) this.f44894q.get(i19) : (com.google.protobuf.z2) p9Var6.m(i19, false)).isInitialized()) {
                                    return false;
                                }
                                i19++;
                            } else {
                                int i27 = 0;
                                while (true) {
                                    com.google.protobuf.p9 p9Var7 = this.f44897t;
                                    if (i27 >= (p9Var7 == null ? this.f44896s.size() : p9Var7.l())) {
                                        if ((this.f44884d & 512) != 0) {
                                            com.google.protobuf.t9 t9Var = this.f44899v;
                                            if (t9Var == null) {
                                                g2Var = this.f44898u;
                                                if (g2Var == null) {
                                                    g2Var = com.google.protobuf.g2.E;
                                                }
                                            } else {
                                                g2Var = (com.google.protobuf.g2) t9Var.e();
                                            }
                                            if (!g2Var.isInitialized()) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                    com.google.protobuf.p9 p9Var8 = this.f44897t;
                                    if (!(p9Var8 == null ? (com.google.protobuf.u1) this.f44896s.get(i27) : (com.google.protobuf.u1) p9Var8.m(i27, false)).isInitialized()) {
                                        return false;
                                    }
                                    i27++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.i3 i3Var;
        com.google.protobuf.g2 g2Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            f();
            d();
            g();
            e();
            com.google.protobuf.t9 t9Var = this.f44899v;
            if (t9Var == null) {
                if (t9Var == null) {
                    g2Var = this.f44898u;
                    if (g2Var == null) {
                        g2Var = com.google.protobuf.g2.E;
                    }
                } else {
                    g2Var = (com.google.protobuf.g2) t9Var.e();
                }
                this.f44899v = new com.google.protobuf.t9(g2Var, getParentForChildren(), isClean());
                this.f44898u = null;
            }
            com.google.protobuf.t9 t9Var2 = this.f44901x;
            if (t9Var2 == null) {
                if (t9Var2 == null) {
                    i3Var = this.f44900w;
                    if (i3Var == null) {
                        i3Var = com.google.protobuf.i3.f45187f;
                    }
                } else {
                    i3Var = (com.google.protobuf.i3) t9Var2.e();
                }
                this.f44901x = new com.google.protobuf.t9(i3Var, getParentForChildren(), isClean());
                this.f44900w = null;
            }
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.b2) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.c2.f44951u;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        com.google.protobuf.c2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        h(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.c2) {
            i((com.google.protobuf.c2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.c2) {
            i((com.google.protobuf.c2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public b2(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f44885e = "";
        this.f44886f = "";
        this.f44887g = com.google.protobuf.f7.f45086f;
        this.f44888h = com.google.protobuf.l6.emptyIntList();
        this.f44889i = com.google.protobuf.l6.emptyIntList();
        this.f44890m = java.util.Collections.emptyList();
        this.f44892o = java.util.Collections.emptyList();
        this.f44894q = java.util.Collections.emptyList();
        this.f44896s = java.util.Collections.emptyList();
        this.f44902y = "";
        maybeForceBuilderInitialization();
    }
}
