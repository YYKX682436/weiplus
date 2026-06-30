package com.google.protobuf;

/* loaded from: classes16.dex */
public final class q0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f45420d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f45421e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f45422f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f45423g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f45424h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.p9 f45425i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f45426m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.p9 f45427n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f45428o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.protobuf.p9 f45429p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f45430q;

    /* renamed from: r, reason: collision with root package name */
    public com.google.protobuf.p9 f45431r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f45432s;

    /* renamed from: t, reason: collision with root package name */
    public com.google.protobuf.p9 f45433t;

    /* renamed from: u, reason: collision with root package name */
    public com.google.protobuf.j2 f45434u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.protobuf.t9 f45435v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f45436w;

    /* renamed from: x, reason: collision with root package name */
    public com.google.protobuf.p9 f45437x;

    /* renamed from: y, reason: collision with root package name */
    public com.google.protobuf.g7 f45438y;

    public q0(com.google.protobuf.o0 o0Var) {
        super(null);
        this.f45421e = "";
        this.f45422f = java.util.Collections.emptyList();
        this.f45424h = java.util.Collections.emptyList();
        this.f45426m = java.util.Collections.emptyList();
        this.f45428o = java.util.Collections.emptyList();
        this.f45430q = java.util.Collections.emptyList();
        this.f45432s = java.util.Collections.emptyList();
        this.f45436w = java.util.Collections.emptyList();
        this.f45438y = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        com.google.protobuf.x0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.x0 buildPartial() {
        com.google.protobuf.x0 x0Var = new com.google.protobuf.x0(this, null);
        int i17 = this.f45420d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        x0Var.f45656e = this.f45421e;
        com.google.protobuf.p9 p9Var = this.f45423g;
        if (p9Var == null) {
            if ((this.f45420d & 2) != 0) {
                this.f45422f = java.util.Collections.unmodifiableList(this.f45422f);
                this.f45420d &= -3;
            }
            x0Var.f45657f = this.f45422f;
        } else {
            x0Var.f45657f = p9Var.g();
        }
        com.google.protobuf.p9 p9Var2 = this.f45425i;
        if (p9Var2 == null) {
            if ((this.f45420d & 4) != 0) {
                this.f45424h = java.util.Collections.unmodifiableList(this.f45424h);
                this.f45420d &= -5;
            }
            x0Var.f45658g = this.f45424h;
        } else {
            x0Var.f45658g = p9Var2.g();
        }
        com.google.protobuf.p9 p9Var3 = this.f45427n;
        if (p9Var3 == null) {
            if ((this.f45420d & 8) != 0) {
                this.f45426m = java.util.Collections.unmodifiableList(this.f45426m);
                this.f45420d &= -9;
            }
            x0Var.f45659h = this.f45426m;
        } else {
            x0Var.f45659h = p9Var3.g();
        }
        com.google.protobuf.p9 p9Var4 = this.f45429p;
        if (p9Var4 == null) {
            if ((this.f45420d & 16) != 0) {
                this.f45428o = java.util.Collections.unmodifiableList(this.f45428o);
                this.f45420d &= -17;
            }
            x0Var.f45660i = this.f45428o;
        } else {
            x0Var.f45660i = p9Var4.g();
        }
        com.google.protobuf.p9 p9Var5 = this.f45431r;
        if (p9Var5 == null) {
            if ((this.f45420d & 32) != 0) {
                this.f45430q = java.util.Collections.unmodifiableList(this.f45430q);
                this.f45420d &= -33;
            }
            x0Var.f45661m = this.f45430q;
        } else {
            x0Var.f45661m = p9Var5.g();
        }
        com.google.protobuf.p9 p9Var6 = this.f45433t;
        if (p9Var6 == null) {
            if ((this.f45420d & 64) != 0) {
                this.f45432s = java.util.Collections.unmodifiableList(this.f45432s);
                this.f45420d &= -65;
            }
            x0Var.f45662n = this.f45432s;
        } else {
            x0Var.f45662n = p9Var6.g();
        }
        if ((i17 & 128) != 0) {
            com.google.protobuf.t9 t9Var = this.f45435v;
            if (t9Var == null) {
                x0Var.f45663o = this.f45434u;
            } else {
                x0Var.f45663o = (com.google.protobuf.j2) t9Var.b();
            }
            i18 |= 2;
        }
        com.google.protobuf.p9 p9Var7 = this.f45437x;
        if (p9Var7 == null) {
            if ((this.f45420d & 256) != 0) {
                this.f45436w = java.util.Collections.unmodifiableList(this.f45436w);
                this.f45420d &= -257;
            }
            x0Var.f45664p = this.f45436w;
        } else {
            x0Var.f45664p = p9Var7.g();
        }
        if ((this.f45420d & 512) != 0) {
            this.f45438y = this.f45438y.b();
            this.f45420d &= -513;
        }
        x0Var.f45665q = this.f45438y;
        x0Var.f45655d = i18;
        onBuilt();
        return x0Var;
    }

    public java.lang.Object clone() {
        return (com.google.protobuf.q0) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f45429p == null) {
            this.f45429p = new com.google.protobuf.p9(this.f45428o, (this.f45420d & 16) != 0, getParentForChildren(), isClean());
            this.f45428o = null;
        }
        return this.f45429p;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f45425i == null) {
            this.f45425i = new com.google.protobuf.p9(this.f45424h, (this.f45420d & 4) != 0, getParentForChildren(), isClean());
            this.f45424h = null;
        }
        return this.f45425i;
    }

    public final com.google.protobuf.p9 f() {
        if (this.f45431r == null) {
            this.f45431r = new com.google.protobuf.p9(this.f45430q, (this.f45420d & 32) != 0, getParentForChildren(), isClean());
            this.f45430q = null;
        }
        return this.f45431r;
    }

    public final com.google.protobuf.p9 g() {
        if (this.f45423g == null) {
            this.f45423g = new com.google.protobuf.p9(this.f45422f, (this.f45420d & 2) != 0, getParentForChildren(), isClean());
            this.f45422f = null;
        }
        return this.f45423g;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return com.google.protobuf.x0.f45653s;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return com.google.protobuf.p3.f45384c;
    }

    public final com.google.protobuf.p9 h() {
        if (this.f45427n == null) {
            this.f45427n = new com.google.protobuf.p9(this.f45426m, (this.f45420d & 8) != 0, getParentForChildren(), isClean());
            this.f45426m = null;
        }
        return this.f45427n;
    }

    public final com.google.protobuf.p9 i() {
        if (this.f45433t == null) {
            this.f45433t = new com.google.protobuf.p9(this.f45432s, (this.f45420d & 64) != 0, getParentForChildren(), isClean());
            this.f45432s = null;
        }
        return this.f45433t;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = com.google.protobuf.p3.f45385d;
        j6Var.c(com.google.protobuf.x0.class, com.google.protobuf.q0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        com.google.protobuf.j2 j2Var;
        int i17 = 0;
        while (true) {
            com.google.protobuf.p9 p9Var = this.f45423g;
            if (i17 < (p9Var == null ? this.f45422f.size() : p9Var.l())) {
                com.google.protobuf.p9 p9Var2 = this.f45423g;
                if (!(p9Var2 == null ? (com.google.protobuf.u1) this.f45422f.get(i17) : (com.google.protobuf.u1) p9Var2.m(i17, false)).isInitialized()) {
                    return false;
                }
                i17++;
            } else {
                int i18 = 0;
                while (true) {
                    com.google.protobuf.p9 p9Var3 = this.f45425i;
                    if (i18 < (p9Var3 == null ? this.f45424h.size() : p9Var3.l())) {
                        com.google.protobuf.p9 p9Var4 = this.f45425i;
                        if (!(p9Var4 == null ? (com.google.protobuf.u1) this.f45424h.get(i18) : (com.google.protobuf.u1) p9Var4.m(i18, false)).isInitialized()) {
                            return false;
                        }
                        i18++;
                    } else {
                        int i19 = 0;
                        while (true) {
                            com.google.protobuf.p9 p9Var5 = this.f45427n;
                            if (i19 < (p9Var5 == null ? this.f45426m.size() : p9Var5.l())) {
                                com.google.protobuf.p9 p9Var6 = this.f45427n;
                                if (!(p9Var6 == null ? (com.google.protobuf.x0) this.f45426m.get(i19) : (com.google.protobuf.x0) p9Var6.m(i19, false)).isInitialized()) {
                                    return false;
                                }
                                i19++;
                            } else {
                                int i27 = 0;
                                while (true) {
                                    com.google.protobuf.p9 p9Var7 = this.f45429p;
                                    if (i27 < (p9Var7 == null ? this.f45428o.size() : p9Var7.l())) {
                                        com.google.protobuf.p9 p9Var8 = this.f45429p;
                                        if (!(p9Var8 == null ? (com.google.protobuf.d1) this.f45428o.get(i27) : (com.google.protobuf.d1) p9Var8.m(i27, false)).isInitialized()) {
                                            return false;
                                        }
                                        i27++;
                                    } else {
                                        int i28 = 0;
                                        while (true) {
                                            com.google.protobuf.p9 p9Var9 = this.f45431r;
                                            if (i28 < (p9Var9 == null ? this.f45430q.size() : p9Var9.l())) {
                                                com.google.protobuf.p9 p9Var10 = this.f45431r;
                                                if (!(p9Var10 == null ? (com.google.protobuf.t0) this.f45430q.get(i28) : (com.google.protobuf.t0) p9Var10.m(i28, false)).isInitialized()) {
                                                    return false;
                                                }
                                                i28++;
                                            } else {
                                                int i29 = 0;
                                                while (true) {
                                                    com.google.protobuf.p9 p9Var11 = this.f45433t;
                                                    if (i29 >= (p9Var11 == null ? this.f45432s.size() : p9Var11.l())) {
                                                        if ((this.f45420d & 128) != 0) {
                                                            com.google.protobuf.t9 t9Var = this.f45435v;
                                                            if (t9Var == null) {
                                                                j2Var = this.f45434u;
                                                                if (j2Var == null) {
                                                                    j2Var = com.google.protobuf.j2.f45223o;
                                                                }
                                                            } else {
                                                                j2Var = (com.google.protobuf.j2) t9Var.e();
                                                            }
                                                            if (!j2Var.isInitialized()) {
                                                                return false;
                                                            }
                                                        }
                                                        return true;
                                                    }
                                                    com.google.protobuf.p9 p9Var12 = this.f45433t;
                                                    if (!(p9Var12 == null ? (com.google.protobuf.t2) this.f45432s.get(i29) : (com.google.protobuf.t2) p9Var12.m(i29, false)).isInitialized()) {
                                                        return false;
                                                    }
                                                    i29++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final com.google.protobuf.p9 j() {
        if (this.f45437x == null) {
            this.f45437x = new com.google.protobuf.p9(this.f45436w, (this.f45420d & 256) != 0, getParentForChildren(), isClean());
            this.f45436w = null;
        }
        return this.f45437x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.protobuf.q0 k(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = com.google.protobuf.x0.f45654t     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.p0 r0 = (com.google.protobuf.p0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            com.google.protobuf.x0 r2 = (com.google.protobuf.x0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.l(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            com.google.protobuf.x0 r3 = (com.google.protobuf.x0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q0.k(com.google.protobuf.d0, com.google.protobuf.t4):com.google.protobuf.q0");
    }

    public com.google.protobuf.q0 l(com.google.protobuf.x0 x0Var) {
        com.google.protobuf.j2 j2Var;
        com.google.protobuf.j2 j2Var2;
        if (x0Var == com.google.protobuf.x0.f45653s) {
            return this;
        }
        if ((x0Var.f45655d & 1) != 0) {
            this.f45420d |= 1;
            this.f45421e = x0Var.f45656e;
            onChanged();
        }
        if (this.f45423g == null) {
            if (!x0Var.f45657f.isEmpty()) {
                if (this.f45422f.isEmpty()) {
                    this.f45422f = x0Var.f45657f;
                    this.f45420d &= -3;
                } else {
                    if ((this.f45420d & 2) == 0) {
                        this.f45422f = new java.util.ArrayList(this.f45422f);
                        this.f45420d |= 2;
                    }
                    this.f45422f.addAll(x0Var.f45657f);
                }
                onChanged();
            }
        } else if (!x0Var.f45657f.isEmpty()) {
            if (this.f45423g.p()) {
                this.f45423g.f45409a = null;
                this.f45423g = null;
                this.f45422f = x0Var.f45657f;
                this.f45420d &= -3;
                this.f45423g = com.google.protobuf.l6.alwaysUseFieldBuilders ? g() : null;
            } else {
                this.f45423g.b(x0Var.f45657f);
            }
        }
        if (this.f45425i == null) {
            if (!x0Var.f45658g.isEmpty()) {
                if (this.f45424h.isEmpty()) {
                    this.f45424h = x0Var.f45658g;
                    this.f45420d &= -5;
                } else {
                    if ((this.f45420d & 4) == 0) {
                        this.f45424h = new java.util.ArrayList(this.f45424h);
                        this.f45420d |= 4;
                    }
                    this.f45424h.addAll(x0Var.f45658g);
                }
                onChanged();
            }
        } else if (!x0Var.f45658g.isEmpty()) {
            if (this.f45425i.p()) {
                this.f45425i.f45409a = null;
                this.f45425i = null;
                this.f45424h = x0Var.f45658g;
                this.f45420d &= -5;
                this.f45425i = com.google.protobuf.l6.alwaysUseFieldBuilders ? e() : null;
            } else {
                this.f45425i.b(x0Var.f45658g);
            }
        }
        if (this.f45427n == null) {
            if (!x0Var.f45659h.isEmpty()) {
                if (this.f45426m.isEmpty()) {
                    this.f45426m = x0Var.f45659h;
                    this.f45420d &= -9;
                } else {
                    if ((this.f45420d & 8) == 0) {
                        this.f45426m = new java.util.ArrayList(this.f45426m);
                        this.f45420d |= 8;
                    }
                    this.f45426m.addAll(x0Var.f45659h);
                }
                onChanged();
            }
        } else if (!x0Var.f45659h.isEmpty()) {
            if (this.f45427n.p()) {
                this.f45427n.f45409a = null;
                this.f45427n = null;
                this.f45426m = x0Var.f45659h;
                this.f45420d &= -9;
                this.f45427n = com.google.protobuf.l6.alwaysUseFieldBuilders ? h() : null;
            } else {
                this.f45427n.b(x0Var.f45659h);
            }
        }
        if (this.f45429p == null) {
            if (!x0Var.f45660i.isEmpty()) {
                if (this.f45428o.isEmpty()) {
                    this.f45428o = x0Var.f45660i;
                    this.f45420d &= -17;
                } else {
                    if ((this.f45420d & 16) == 0) {
                        this.f45428o = new java.util.ArrayList(this.f45428o);
                        this.f45420d |= 16;
                    }
                    this.f45428o.addAll(x0Var.f45660i);
                }
                onChanged();
            }
        } else if (!x0Var.f45660i.isEmpty()) {
            if (this.f45429p.p()) {
                this.f45429p.f45409a = null;
                this.f45429p = null;
                this.f45428o = x0Var.f45660i;
                this.f45420d &= -17;
                this.f45429p = com.google.protobuf.l6.alwaysUseFieldBuilders ? d() : null;
            } else {
                this.f45429p.b(x0Var.f45660i);
            }
        }
        if (this.f45431r == null) {
            if (!x0Var.f45661m.isEmpty()) {
                if (this.f45430q.isEmpty()) {
                    this.f45430q = x0Var.f45661m;
                    this.f45420d &= -33;
                } else {
                    if ((this.f45420d & 32) == 0) {
                        this.f45430q = new java.util.ArrayList(this.f45430q);
                        this.f45420d |= 32;
                    }
                    this.f45430q.addAll(x0Var.f45661m);
                }
                onChanged();
            }
        } else if (!x0Var.f45661m.isEmpty()) {
            if (this.f45431r.p()) {
                this.f45431r.f45409a = null;
                this.f45431r = null;
                this.f45430q = x0Var.f45661m;
                this.f45420d &= -33;
                this.f45431r = com.google.protobuf.l6.alwaysUseFieldBuilders ? f() : null;
            } else {
                this.f45431r.b(x0Var.f45661m);
            }
        }
        if (this.f45433t == null) {
            if (!x0Var.f45662n.isEmpty()) {
                if (this.f45432s.isEmpty()) {
                    this.f45432s = x0Var.f45662n;
                    this.f45420d &= -65;
                } else {
                    if ((this.f45420d & 64) == 0) {
                        this.f45432s = new java.util.ArrayList(this.f45432s);
                        this.f45420d |= 64;
                    }
                    this.f45432s.addAll(x0Var.f45662n);
                }
                onChanged();
            }
        } else if (!x0Var.f45662n.isEmpty()) {
            if (this.f45433t.p()) {
                this.f45433t.f45409a = null;
                this.f45433t = null;
                this.f45432s = x0Var.f45662n;
                this.f45420d &= -65;
                this.f45433t = com.google.protobuf.l6.alwaysUseFieldBuilders ? i() : null;
            } else {
                this.f45433t.b(x0Var.f45662n);
            }
        }
        if (x0Var.h()) {
            com.google.protobuf.j2 g17 = x0Var.g();
            com.google.protobuf.t9 t9Var = this.f45435v;
            if (t9Var == null) {
                if ((this.f45420d & 128) == 0 || (j2Var = this.f45434u) == null || j2Var == (j2Var2 = com.google.protobuf.j2.f45223o)) {
                    this.f45434u = g17;
                } else {
                    com.google.protobuf.i2 builder = j2Var2.toBuilder();
                    builder.l(j2Var);
                    builder.l(g17);
                    this.f45434u = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(g17);
            }
            this.f45420d |= 128;
        }
        if (this.f45437x == null) {
            if (!x0Var.f45664p.isEmpty()) {
                if (this.f45436w.isEmpty()) {
                    this.f45436w = x0Var.f45664p;
                    this.f45420d &= -257;
                } else {
                    if ((this.f45420d & 256) == 0) {
                        this.f45436w = new java.util.ArrayList(this.f45436w);
                        this.f45420d |= 256;
                    }
                    this.f45436w.addAll(x0Var.f45664p);
                }
                onChanged();
            }
        } else if (!x0Var.f45664p.isEmpty()) {
            if (this.f45437x.p()) {
                this.f45437x.f45409a = null;
                this.f45437x = null;
                this.f45436w = x0Var.f45664p;
                this.f45420d &= -257;
                this.f45437x = com.google.protobuf.l6.alwaysUseFieldBuilders ? j() : null;
            } else {
                this.f45437x.b(x0Var.f45664p);
            }
        }
        if (!x0Var.f45665q.isEmpty()) {
            if (this.f45438y.isEmpty()) {
                this.f45438y = x0Var.f45665q;
                this.f45420d &= -513;
            } else {
                if ((this.f45420d & 512) == 0) {
                    this.f45438y = new com.google.protobuf.f7(this.f45438y);
                    this.f45420d |= 512;
                }
                this.f45438y.addAll(x0Var.f45665q);
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    public final void maybeForceBuilderInitialization() {
        com.google.protobuf.j2 j2Var;
        if (com.google.protobuf.l6.alwaysUseFieldBuilders) {
            g();
            e();
            h();
            d();
            f();
            i();
            com.google.protobuf.t9 t9Var = this.f45435v;
            if (t9Var == null) {
                if (t9Var == null) {
                    j2Var = this.f45434u;
                    if (j2Var == null) {
                        j2Var = com.google.protobuf.j2.f45223o;
                    }
                } else {
                    j2Var = (com.google.protobuf.j2) t9Var.e();
                }
                this.f45435v = new com.google.protobuf.t9(j2Var, getParentForChildren(), isClean());
                this.f45434u = null;
            }
            j();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        k(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (com.google.protobuf.q0) m84mergeUnknownFields(waVar);
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
        return com.google.protobuf.x0.f45653s;
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
        com.google.protobuf.x0 buildPartial = buildPartial();
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
        if (k8Var instanceof com.google.protobuf.x0) {
            l((com.google.protobuf.x0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof com.google.protobuf.x0) {
            l((com.google.protobuf.x0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public q0(com.google.protobuf.r5 r5Var, com.google.protobuf.o0 o0Var) {
        super(r5Var);
        this.f45421e = "";
        this.f45422f = java.util.Collections.emptyList();
        this.f45424h = java.util.Collections.emptyList();
        this.f45426m = java.util.Collections.emptyList();
        this.f45428o = java.util.Collections.emptyList();
        this.f45430q = java.util.Collections.emptyList();
        this.f45432s = java.util.Collections.emptyList();
        this.f45436w = java.util.Collections.emptyList();
        this.f45438y = com.google.protobuf.f7.f45086f;
        maybeForceBuilderInitialization();
    }
}
