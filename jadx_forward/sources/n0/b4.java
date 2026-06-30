package n0;

/* loaded from: classes14.dex */
public final class b4 extends n0.g1 {

    /* renamed from: q, reason: collision with root package name */
    public static final n0.m3 f414975q = new n0.m3(null);

    /* renamed from: r, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f414976r = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(s0.b.f483374g);

    /* renamed from: a, reason: collision with root package name */
    public final n0.h f414977a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c0 f414978b;

    /* renamed from: c, reason: collision with root package name */
    public final oz5.l f414979c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f414980d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f414981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f414982f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f414983g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f414984h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f414985i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f414986j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f414987k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f414988l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f414989m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f414990n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f414991o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.n3 f414992p;

    public b4(oz5.l effectCoroutineContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectCoroutineContext, "effectCoroutineContext");
        n0.h hVar = new n0.h(new n0.p3(this));
        this.f414977a = hVar;
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        p3325xe03a0797.p3326xc267989b.u2 u2Var = new p3325xe03a0797.p3326xc267989b.u2((p3325xe03a0797.p3326xc267989b.r2) effectCoroutineContext.get(p3325xe03a0797.p3326xc267989b.q2.f392104d));
        u2Var.p(new n0.r3(this));
        this.f414978b = u2Var;
        this.f414979c = effectCoroutineContext.mo7096x348d9a(hVar).mo7096x348d9a(u2Var);
        this.f414980d = new java.lang.Object();
        this.f414983g = new java.util.ArrayList();
        this.f414984h = new java.util.ArrayList();
        this.f414985i = new java.util.ArrayList();
        this.f414986j = new java.util.ArrayList();
        this.f414987k = new java.util.ArrayList();
        this.f414988l = new java.util.LinkedHashMap();
        this.f414989m = new java.util.LinkedHashMap();
        this.f414991o = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(n0.o3.Inactive);
        this.f414992p = new n0.n3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(n0.b4 b4Var) {
        int i17;
        kz5.p0 p0Var;
        synchronized (b4Var.f414980d) {
            if (!b4Var.f414988l.isEmpty()) {
                java.util.List r17 = kz5.d0.r(((java.util.LinkedHashMap) b4Var.f414988l).values());
                ((java.util.LinkedHashMap) b4Var.f414988l).clear();
                java.util.ArrayList arrayList = (java.util.ArrayList) r17;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(i18));
                    arrayList2.add(new jz5.l(null, ((java.util.LinkedHashMap) b4Var.f414989m).get(null)));
                }
                ((java.util.LinkedHashMap) b4Var.f414989m).clear();
                p0Var = arrayList2;
            } else {
                p0Var = kz5.p0.f395529d;
            }
        }
        int size2 = p0Var.size();
        for (i17 = 0; i17 < size2; i17++) {
            jz5.l lVar = (jz5.l) p0Var.get(i17);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(lVar.f384366d);
            if (((n0.t2) lVar.f384367e) != null) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:42:0x0039, B:17:0x0049, B:19:0x005b, B:22:0x0060, B:25:0x0064, B:26:0x0066, B:32:0x0067, B:33:0x0070, B:34:0x0071, B:21:0x005d), top: B:41:0x0039, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n0.p1 o(n0.b4 r7, n0.p1 r8, o0.d r9) {
        /*
            r7.getClass()
            r0 = r8
            n0.j1 r0 = (n0.j1) r0
            n0.y0 r1 = r0.f415095w
            boolean r1 = r1.D
            r2 = 0
            if (r1 != 0) goto L99
            boolean r0 = r0.f415096x
            if (r0 == 0) goto L13
            goto L99
        L13:
            n0.u3 r0 = new n0.u3
            r0.<init>(r8)
            n0.a4 r1 = new n0.a4
            r1.<init>(r8, r9)
            x0.m r3 = x0.z.i()
            boolean r4 = r3 instanceof x0.e
            if (r4 == 0) goto L28
            x0.e r3 = (x0.e) r3
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L8d
            x0.e r0 = r3.y(r0, r1)
            if (r0 == 0) goto L8d
            x0.m r1 = r0.i()     // Catch: java.lang.Throwable -> L88
            r3 = 0
            r4 = 1
            if (r9 == 0) goto L46
            int r5 = r9.f423371d     // Catch: java.lang.Throwable -> L44
            if (r5 <= 0) goto L3f
            r5 = r4
            goto L40
        L3f:
            r5 = r3
        L40:
            if (r5 != r4) goto L46
            r5 = r4
            goto L47
        L44:
            r8 = move-exception
            goto L84
        L46:
            r5 = r3
        L47:
            if (r5 == 0) goto L71
            n0.t3 r5 = new n0.t3     // Catch: java.lang.Throwable -> L44
            r5.<init>(r9, r8)     // Catch: java.lang.Throwable -> L44
            r9 = r8
            n0.j1 r9 = (n0.j1) r9     // Catch: java.lang.Throwable -> L44
            n0.y0 r9 = r9.f415095w     // Catch: java.lang.Throwable -> L44
            r9.getClass()     // Catch: java.lang.Throwable -> L44
            boolean r6 = r9.D     // Catch: java.lang.Throwable -> L44
            r6 = r6 ^ r4
            if (r6 == 0) goto L67
            r9.D = r4     // Catch: java.lang.Throwable -> L44
            r5.mo152xb9724478()     // Catch: java.lang.Throwable -> L63
            r9.D = r3     // Catch: java.lang.Throwable -> L44
            goto L71
        L63:
            r8 = move-exception
            r9.D = r3     // Catch: java.lang.Throwable -> L44
            throw r8     // Catch: java.lang.Throwable -> L44
        L67:
            java.lang.String r8 = "Preparing a composition while composing is not supported"
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L44
            n0.e1.c(r8)     // Catch: java.lang.Throwable -> L44
            throw r2     // Catch: java.lang.Throwable -> L44
        L71:
            r9 = r8
            n0.j1 r9 = (n0.j1) r9     // Catch: java.lang.Throwable -> L44
            boolean r9 = r9.p()     // Catch: java.lang.Throwable -> L44
            r0.o(r1)     // Catch: java.lang.Throwable -> L88
            r7.q(r0)
            if (r9 == 0) goto L81
            goto L82
        L81:
            r8 = r2
        L82:
            r2 = r8
            goto L99
        L84:
            r0.o(r1)     // Catch: java.lang.Throwable -> L88
            throw r8     // Catch: java.lang.Throwable -> L88
        L88:
            r8 = move-exception
            r7.q(r0)
            throw r8
        L8d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot create a mutable snapshot of an read-only snapshot"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.b4.o(n0.b4, n0.p1, o0.d):n0.p1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Set[]] */
    public static final void p(n0.b4 b4Var) {
        java.lang.Object obj;
        java.util.Set set;
        boolean z17;
        if (!((java.util.ArrayList) b4Var.f414984h).isEmpty()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b4Var.f414984h;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.util.Set values = (java.util.Set) arrayList.get(i17);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) b4Var.f414983g;
                int size2 = arrayList2.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    n0.j1 j1Var = (n0.j1) ((n0.p1) arrayList2.get(i18));
                    j1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
                    do {
                        obj = j1Var.f415081f.get();
                        if (obj == null ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, n0.k1.f415117a)) {
                            set = values;
                        } else if (obj instanceof java.util.Set) {
                            set = new java.util.Set[]{(java.util.Set) obj, values};
                        } else {
                            if (!(obj instanceof java.lang.Object[])) {
                                throw new java.lang.IllegalStateException(("corrupt pendingModifications: " + j1Var.f415081f).toString());
                            }
                            if (obj == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                            }
                            java.util.Set[] setArr = (java.util.Set[]) obj;
                            int length = setArr.length;
                            ?? copyOf = java.util.Arrays.copyOf(setArr, length + 1);
                            copyOf[length] = values;
                            set = copyOf;
                        }
                        java.util.concurrent.atomic.AtomicReference atomicReference = j1Var.f415081f;
                        while (true) {
                            if (!atomicReference.compareAndSet(obj, set)) {
                                if (atomicReference.get() != obj) {
                                    z17 = false;
                                    break;
                                }
                            } else {
                                z17 = true;
                                break;
                            }
                        }
                    } while (!z17);
                    if (obj == null) {
                        synchronized (j1Var.f415082g) {
                            j1Var.j();
                        }
                    }
                }
            }
            ((java.util.ArrayList) b4Var.f414984h).clear();
            if (b4Var.s() != null) {
                throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    @Override // n0.g1
    public void a(n0.p1 composition, yz5.p content) {
        x0.e y17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        boolean z17 = ((n0.j1) composition).f415095w.D;
        n0.u3 u3Var = new n0.u3(composition);
        n0.a4 a4Var = new n0.a4(composition, null);
        x0.m i17 = x0.z.i();
        x0.e eVar = i17 instanceof x0.e ? (x0.e) i17 : null;
        if (eVar == null || (y17 = eVar.y(u3Var, a4Var)) == null) {
            throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            x0.m i18 = y17.i();
            try {
                n0.j1 j1Var = (n0.j1) composition;
                j1Var.h(content);
                if (!z17) {
                    x0.z.i().l();
                }
                synchronized (this.f414980d) {
                    if (((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f414991o).mo144003x754a37bb()).compareTo(n0.o3.ShuttingDown) > 0 && !((java.util.ArrayList) this.f414983g).contains(composition)) {
                        ((java.util.ArrayList) this.f414983g).add(composition);
                    }
                }
                synchronized (this.f414980d) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) this.f414987k;
                    if (arrayList.size() > 0) {
                        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
                        throw null;
                    }
                }
                synchronized (j1Var.f415082g) {
                    j1Var.f(j1Var.f415088p);
                    j1Var.j();
                }
                synchronized (j1Var.f415082g) {
                    if (!((java.util.ArrayList) j1Var.f415089q).isEmpty()) {
                        j1Var.f(j1Var.f415089q);
                    }
                }
                if (z17) {
                    return;
                }
                x0.z.i().l();
            } finally {
                y17.o(i18);
            }
        } finally {
            q(y17);
        }
    }

    @Override // n0.g1
    public boolean c() {
        return false;
    }

    @Override // n0.g1
    public int e() {
        return 1000;
    }

    @Override // n0.g1
    public oz5.l f() {
        return this.f414979c;
    }

    @Override // n0.g1
    public void g(n0.p1 composition) {
        p3325xe03a0797.p3326xc267989b.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        synchronized (this.f414980d) {
            if (((java.util.ArrayList) this.f414985i).contains(composition)) {
                qVar = null;
            } else {
                this.f414985i.add(composition);
                qVar = s();
            }
        }
        if (qVar != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
    }

    @Override // n0.g1
    public n0.t2 h(n0.u2 reference) {
        n0.t2 t2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reference, "reference");
        synchronized (this.f414980d) {
            t2Var = (n0.t2) this.f414989m.remove(reference);
        }
        return t2Var;
    }

    @Override // n0.g1
    public void i(java.util.Set table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
    }

    @Override // n0.g1
    public void m(n0.p1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        synchronized (this.f414980d) {
            this.f414983g.remove(composition);
        }
    }

    public final void q(x0.e eVar) {
        try {
            if (eVar.t() instanceof x0.n) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            eVar.c();
        }
    }

    public final void r() {
        synchronized (this.f414980d) {
            if (((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f414991o).mo144003x754a37bb()).compareTo(n0.o3.Idle) >= 0) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f414991o).k(n0.o3.ShuttingDown);
            }
        }
        p3325xe03a0797.p3326xc267989b.p2.a(this.f414978b, null, 1, null);
    }

    public final p3325xe03a0797.p3326xc267989b.q s() {
        n0.o3 o3Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = this.f414991o;
        int compareTo = ((n0.o3) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).compareTo(n0.o3.ShuttingDown);
        java.util.List list = this.f414987k;
        java.util.List list2 = this.f414986j;
        java.util.List list3 = this.f414985i;
        java.util.List list4 = this.f414984h;
        if (compareTo <= 0) {
            this.f414983g.clear();
            list4.clear();
            list3.clear();
            list2.clear();
            list.clear();
            p3325xe03a0797.p3326xc267989b.q qVar = this.f414990n;
            if (qVar != null) {
                p3325xe03a0797.p3326xc267989b.p.a(qVar, null, 1, null);
            }
            this.f414990n = null;
            return null;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f414981e;
        n0.o3 o3Var2 = n0.o3.PendingWork;
        n0.h hVar = this.f414977a;
        if (r2Var == null) {
            list4.clear();
            list3.clear();
            o3Var = hVar.d() ? n0.o3.InactivePendingWork : n0.o3.Inactive;
        } else {
            o3Var = ((list3.isEmpty() ^ true) || (list4.isEmpty() ^ true) || (list2.isEmpty() ^ true) || (list.isEmpty() ^ true) || hVar.d()) ? o3Var2 : n0.o3.Idle;
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(o3Var);
        if (o3Var != o3Var2) {
            return null;
        }
        p3325xe03a0797.p3326xc267989b.q qVar2 = this.f414990n;
        this.f414990n = null;
        return qVar2;
    }

    public final boolean t() {
        boolean z17;
        synchronized (this.f414980d) {
            z17 = true;
            if (!(!this.f414984h.isEmpty()) && !(!this.f414985i.isEmpty())) {
                if (!this.f414977a.d()) {
                    z17 = false;
                }
            }
        }
        return z17;
    }
}
