package n0;

/* loaded from: classes14.dex */
public final class y0 implements n0.o {
    public int A;
    public x0.m B;
    public final n0.d5 C;
    public boolean D;
    public n0.j4 E;
    public n0.k4 F;
    public n0.o4 G;
    public boolean H;
    public p0.f I;

    /* renamed from: J, reason: collision with root package name */
    public n0.d f415293J;
    public final java.util.List K;
    public boolean L;
    public int M;
    public int N;
    public final n0.d5 O;
    public int P;
    public boolean Q;
    public boolean R;
    public final n0.h2 S;
    public final n0.d5 T;
    public int U;
    public int V;
    public int W;
    public int X;

    /* renamed from: b, reason: collision with root package name */
    public final n0.e f415294b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.g1 f415295c;

    /* renamed from: d, reason: collision with root package name */
    public final n0.k4 f415296d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f415297e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f415298f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f415299g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.p1 f415300h;

    /* renamed from: i, reason: collision with root package name */
    public final n0.d5 f415301i;

    /* renamed from: j, reason: collision with root package name */
    public n0.d3 f415302j;

    /* renamed from: k, reason: collision with root package name */
    public int f415303k;

    /* renamed from: l, reason: collision with root package name */
    public final n0.h2 f415304l;

    /* renamed from: m, reason: collision with root package name */
    public int f415305m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.h2 f415306n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f415307o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.HashMap f415308p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f415309q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f415310r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f415311s;

    /* renamed from: t, reason: collision with root package name */
    public final n0.h2 f415312t;

    /* renamed from: u, reason: collision with root package name */
    public p0.f f415313u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f415314v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f415315w;

    /* renamed from: x, reason: collision with root package name */
    public final n0.h2 f415316x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f415317y;

    /* renamed from: z, reason: collision with root package name */
    public int f415318z;

    public y0(n0.e applier, n0.g1 parentContext, n0.k4 slotTable, java.util.Set abandonSet, java.util.List changes, java.util.List lateChanges, n0.p1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applier, "applier");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentContext, "parentContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotTable, "slotTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abandonSet, "abandonSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changes, "changes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lateChanges, "lateChanges");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f415294b = applier;
        this.f415295c = parentContext;
        this.f415296d = slotTable;
        this.f415297e = abandonSet;
        this.f415298f = changes;
        this.f415299g = lateChanges;
        this.f415300h = composition;
        this.f415301i = new n0.d5();
        this.f415304l = new n0.h2();
        this.f415306n = new n0.h2();
        this.f415311s = new java.util.ArrayList();
        this.f415312t = new n0.h2();
        this.f415313u = r0.d.f449495f;
        this.f415314v = new java.util.HashMap();
        this.f415316x = new n0.h2();
        this.f415318z = -1;
        this.B = x0.z.i();
        this.C = new n0.d5();
        n0.j4 h17 = slotTable.h();
        h17.b();
        this.E = h17;
        n0.k4 k4Var = new n0.k4();
        this.F = k4Var;
        n0.o4 j17 = k4Var.j();
        j17.e();
        this.G = j17;
        n0.j4 h18 = this.F.h();
        try {
            n0.d a17 = h18.a(0);
            h18.b();
            this.f415293J = a17;
            this.K = new java.util.ArrayList();
            this.O = new n0.d5();
            this.R = true;
            this.S = new n0.h2();
            this.T = new n0.d5();
            this.U = -1;
            this.V = -1;
            this.W = -1;
        } catch (java.lang.Throwable th6) {
            h18.b();
            throw th6;
        }
    }

    public static final int M(n0.y0 y0Var, int i17, boolean z17, int i18) {
        n0.j4 j4Var = y0Var.E;
        int[] iArr = j4Var.f415103b;
        if (!((iArr[(i17 * 5) + 1] & 134217728) != 0)) {
            if (!n0.l4.a(iArr, i17)) {
                return n0.l4.h(y0Var.E.f415103b, i17);
            }
            int g17 = y0Var.E.g(i17) + i17;
            int i19 = i17 + 1;
            int i27 = 0;
            while (i19 < g17) {
                boolean h17 = y0Var.E.h(i19);
                if (h17) {
                    y0Var.A();
                    y0Var.O.b(y0Var.E.i(i19));
                }
                i27 += M(y0Var, i19, h17 || z17, h17 ? 0 : i18 + i27);
                if (h17) {
                    y0Var.A();
                    y0Var.K();
                }
                i19 += y0Var.E.g(i19);
            }
            return i27;
        }
        java.lang.Object j17 = j4Var.j(iArr, i17);
        if (j17 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(j17);
        y0Var.E.f(i17, 0);
        y0Var.E.a(i17);
        int g18 = y0Var.E.g(i17) + i17;
        java.util.List list = y0Var.f415311s;
        java.lang.Object obj = n0.e1.f415025a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int d17 = n0.e1.d(list, i17);
        if (d17 < 0) {
            d17 = -(d17 + 1);
        }
        while (true) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (d17 >= arrayList2.size()) {
                break;
            }
            n0.i2 i2Var = (n0.i2) arrayList2.get(d17);
            if (i2Var.f415071b >= g18) {
                break;
            }
            arrayList.add(i2Var);
            d17++;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i28 = 0; i28 < size; i28++) {
            n0.i2 i2Var2 = (n0.i2) arrayList.get(i28);
            arrayList3.add(new jz5.l(i2Var2.f415070a, i2Var2.f415072c));
        }
        y0Var.k(java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(null, "content");
        throw null;
    }

    public static final void x(n0.o4 o4Var, n0.e eVar, int i17) {
        while (true) {
            int i18 = o4Var.f415194s;
            if ((i17 > i18 && i17 < o4Var.f415182g) || (i18 == 0 && i17 == 0)) {
                return;
            }
            o4Var.E();
            if (o4Var.r(o4Var.f415194s)) {
                eVar.i();
            }
            o4Var.h();
        }
    }

    public final void A() {
        int i17 = this.X;
        this.X = 0;
        if (i17 > 0) {
            int i18 = this.U;
            if (i18 >= 0) {
                this.U = -1;
                n0.l0 l0Var = new n0.l0(i18, i17);
                C();
                z();
                G(l0Var);
                return;
            }
            int i19 = this.V;
            this.V = -1;
            int i27 = this.W;
            this.W = -1;
            n0.m0 m0Var = new n0.m0(i19, i27, i17);
            C();
            z();
            G(m0Var);
        }
    }

    public final void B(boolean z17) {
        int i17 = z17 ? this.E.f415109h : this.E.f415107f;
        int i18 = i17 - this.P;
        if (!(i18 >= 0)) {
            n0.e1.c("Tried to seek backward".toString());
            throw null;
        }
        if (i18 > 0) {
            G(new n0.n0(i18));
            this.P = i17;
        }
    }

    public final void C() {
        int i17 = this.N;
        if (i17 > 0) {
            this.N = 0;
            G(new n0.o0(i17));
        }
    }

    public final boolean D(o0.b invalidationsRequested) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invalidationsRequested, "invalidationsRequested");
        if (!this.f415298f.isEmpty()) {
            n0.e1.c("Expected applyChanges() to have been called".toString());
            throw null;
        }
        if (!(invalidationsRequested.f423368c > 0) && !(!this.f415311s.isEmpty())) {
            return false;
        }
        l(invalidationsRequested, null);
        return !this.f415298f.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        if (r11 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(n0.p1 r10, n0.p1 r11, java.lang.Integer r12, java.util.List r13, yz5.a r14) {
        /*
            r9 = this;
            boolean r0 = r9.R
            boolean r1 = r9.D
            int r2 = r9.f415303k
            r3 = 0
            r9.R = r3     // Catch: java.lang.Throwable -> L7f
            r4 = 1
            r9.D = r4     // Catch: java.lang.Throwable -> L7f
            r9.f415303k = r3     // Catch: java.lang.Throwable -> L7f
            int r4 = r13.size()     // Catch: java.lang.Throwable -> L7f
            r5 = r3
        L13:
            r6 = 0
            if (r5 >= r4) goto L3e
            java.lang.Object r7 = r13.get(r5)     // Catch: java.lang.Throwable -> L7f
            jz5.l r7 = (jz5.l) r7     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r8 = r7.f384366d     // Catch: java.lang.Throwable -> L7f
            n0.l3 r8 = (n0.l3) r8     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r7 = r7.f384367e     // Catch: java.lang.Throwable -> L7f
            o0.d r7 = (o0.d) r7     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L38
            java.util.Iterator r6 = r7.iterator()     // Catch: java.lang.Throwable -> L7f
        L2a:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r7 == 0) goto L3b
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L7f
            r9.Z(r8, r7)     // Catch: java.lang.Throwable -> L7f
            goto L2a
        L38:
            r9.Z(r8, r6)     // Catch: java.lang.Throwable -> L7f
        L3b:
            int r5 = r5 + 1
            goto L13
        L3e:
            if (r10 == 0) goto L74
            if (r12 == 0) goto L47
            int r12 = r12.intValue()     // Catch: java.lang.Throwable -> L7f
            goto L48
        L47:
            r12 = -1
        L48:
            n0.j1 r10 = (n0.j1) r10     // Catch: java.lang.Throwable -> L7f
            java.lang.String r13 = "block"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r13)     // Catch: java.lang.Throwable -> L7f
            if (r11 == 0) goto L6e
            boolean r13 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r10)     // Catch: java.lang.Throwable -> L7f
            if (r13 != 0) goto L6e
            if (r12 < 0) goto L6e
            n0.j1 r11 = (n0.j1) r11     // Catch: java.lang.Throwable -> L7f
            r10.f415093u = r11     // Catch: java.lang.Throwable -> L7f
            r10.f415094v = r12     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r11 = r14.mo152xb9724478()     // Catch: java.lang.Throwable -> L68
            r10.f415093u = r6     // Catch: java.lang.Throwable -> L7f
            r10.f415094v = r3     // Catch: java.lang.Throwable -> L7f
            goto L72
        L68:
            r11 = move-exception
            r10.f415093u = r6     // Catch: java.lang.Throwable -> L7f
            r10.f415094v = r3     // Catch: java.lang.Throwable -> L7f
            throw r11     // Catch: java.lang.Throwable -> L7f
        L6e:
            java.lang.Object r11 = r14.mo152xb9724478()     // Catch: java.lang.Throwable -> L7f
        L72:
            if (r11 != 0) goto L78
        L74:
            java.lang.Object r11 = r14.mo152xb9724478()     // Catch: java.lang.Throwable -> L7f
        L78:
            r9.R = r0
            r9.D = r1
            r9.f415303k = r2
            return r11
        L7f:
            r10 = move-exception
            r9.R = r0
            r9.D = r1
            r9.f415303k = r2
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.E(n0.p1, n0.p1, java.lang.Integer, java.util.List, yz5.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (r9.f415071b < r3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00ad A[LOOP:5: B:104:0x0071->B:119:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.F():void");
    }

    public final void G(yz5.q qVar) {
        this.f415298f.add(qVar);
    }

    public final void H() {
        M(this, this.E.f415107f, false, 0);
        A();
        java.lang.Object obj = n0.e1.f415025a;
        n0.a1 a1Var = n0.a1.f414960d;
        B(false);
        n0.j4 j4Var = this.E;
        if (j4Var.f415104c > 0) {
            int i17 = j4Var.f415109h;
            n0.h2 h2Var = this.S;
            int i18 = h2Var.f415060b;
            if ((i18 > 0 ? h2Var.f415059a[i18 - 1] : -1) != i17) {
                if (!this.Q && this.R) {
                    J(false, n0.d1.f415014d);
                    this.Q = true;
                }
                n0.d a17 = j4Var.a(i17);
                h2Var.b(i17);
                J(false, new n0.s0(a17));
            }
        }
        G(a1Var);
        int i19 = this.P;
        n0.j4 j4Var2 = this.E;
        this.P = i19 + n0.l4.c(j4Var2.f415103b, j4Var2.f415107f);
    }

    public final void I(int i17, int i18) {
        if (i18 > 0) {
            if (!(i17 >= 0)) {
                n0.e1.c(("Invalid remove index " + i17).toString());
                throw null;
            }
            if (this.U == i17) {
                this.X += i18;
                return;
            }
            A();
            this.U = i17;
            this.X = i18;
        }
    }

    public final void J(boolean z17, yz5.q qVar) {
        B(z17);
        G(qVar);
    }

    public final void K() {
        n0.d5 d5Var = this.O;
        if (!d5Var.f415022a.isEmpty()) {
            d5Var.a();
        } else {
            this.N++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r7, int r8, int r9) {
        /*
            r6 = this;
            n0.j4 r0 = r6.E
            java.lang.Object r1 = n0.e1.f415025a
            if (r7 != r8) goto L7
            goto L1c
        L7:
            if (r7 == r9) goto L6c
            if (r8 != r9) goto Ld
            goto L6c
        Ld:
            int r1 = r0.k(r7)
            if (r1 != r8) goto L16
            r9 = r8
            goto L6c
        L16:
            int r1 = r0.k(r8)
            if (r1 != r7) goto L1e
        L1c:
            r9 = r7
            goto L6c
        L1e:
            int r1 = r0.k(r7)
            int r2 = r0.k(r8)
            if (r1 != r2) goto L2d
            int r9 = r0.k(r7)
            goto L6c
        L2d:
            r1 = 0
            r2 = r7
            r3 = r1
        L30:
            if (r2 <= 0) goto L3b
            if (r2 == r9) goto L3b
            int r2 = r0.k(r2)
            int r3 = r3 + 1
            goto L30
        L3b:
            r2 = r8
            r4 = r1
        L3d:
            if (r2 <= 0) goto L48
            if (r2 == r9) goto L48
            int r2 = r0.k(r2)
            int r4 = r4 + 1
            goto L3d
        L48:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4c:
            if (r2 >= r9) goto L55
            int r5 = r0.k(r5)
            int r2 = r2 + 1
            goto L4c
        L55:
            int r4 = r4 - r3
            r9 = r8
        L57:
            if (r1 >= r4) goto L60
            int r9 = r0.k(r9)
            int r1 = r1 + 1
            goto L57
        L60:
            if (r5 == r9) goto L6b
            int r5 = r0.k(r5)
            int r9 = r0.k(r9)
            goto L60
        L6b:
            r9 = r5
        L6c:
            if (r7 <= 0) goto L7e
            if (r7 == r9) goto L7e
            boolean r1 = r0.h(r7)
            if (r1 == 0) goto L79
            r6.K()
        L79:
            int r7 = r0.k(r7)
            goto L6c
        L7e:
            r6.m(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.L(int, int, int):void");
    }

    public final void N() {
        n0.j4 j4Var = this.E;
        int i17 = j4Var.f415109h;
        this.f415305m = i17 >= 0 ? n0.l4.h(j4Var.f415103b, i17) : 0;
        this.E.n();
    }

    public void O() {
        if (!(this.f415305m == 0)) {
            n0.e1.c("No nodes can be emitted before calling skipAndEndGroup".toString());
            throw null;
        }
        n0.l3 t17 = t();
        if (t17 != null) {
            t17.f415139b |= 16;
        }
        if (((java.util.ArrayList) this.f415311s).isEmpty()) {
            N();
        } else {
            F();
        }
    }

    public final void P(int i17, java.lang.Object obj, boolean z17, java.lang.Object obj2) {
        java.lang.Object obj3;
        java.lang.Object obj4 = obj;
        n0.d3 d3Var = null;
        if (!(!this.f415310r)) {
            n0.e1.c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        a0(i17, obj4, obj2);
        boolean z18 = this.L;
        java.lang.Object obj5 = n0.n.f415153a;
        if (z18) {
            this.E.f415110i++;
            n0.o4 o4Var = this.G;
            int i18 = o4Var.f415193r;
            if (z17) {
                o4Var.I(125, obj5, true, obj5);
            } else if (obj2 != null) {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                o4Var.I(i17, obj4, false, obj2);
            } else {
                if (obj4 == null) {
                    obj4 = obj5;
                }
                o4Var.I(i17, obj4, false, obj5);
            }
            n0.d3 d3Var2 = this.f415302j;
            if (d3Var2 != null) {
                int i19 = (-2) - i18;
                n0.l2 l2Var = new n0.l2(i17, -1, i19, -1, 0);
                d3Var2.f415020e.put(java.lang.Integer.valueOf(i19), new n0.e2(-1, this.f415303k - d3Var2.f415017b, 0));
                ((java.util.ArrayList) d3Var2.f415019d).add(l2Var);
            }
            s(z17, null);
            return;
        }
        if (this.f415302j == null) {
            if (this.E.e() == i17) {
                n0.j4 j4Var = this.E;
                int i27 = j4Var.f415107f;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, i27 < j4Var.f415108g ? j4Var.j(j4Var.f415103b, i27) : null)) {
                    T(z17, obj2);
                }
            }
            n0.j4 j4Var2 = this.E;
            j4Var2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (j4Var2.f415110i <= 0) {
                int i28 = j4Var2.f415107f;
                int i29 = 0;
                while (i28 < j4Var2.f415108g) {
                    int i37 = i28 * 5;
                    int[] iArr = j4Var2.f415103b;
                    arrayList.add(new n0.l2(iArr[i37], j4Var2.j(iArr, i28), i28, n0.l4.f(iArr, i28) ? 1 : n0.l4.h(iArr, i28), i29));
                    i28 += iArr[i37 + 3];
                    i29++;
                }
            }
            this.f415302j = new n0.d3(arrayList, this.f415303k);
        }
        n0.d3 d3Var3 = this.f415302j;
        if (d3Var3 != null) {
            java.lang.Object k2Var = obj4 != null ? new n0.k2(java.lang.Integer.valueOf(i17), obj4) : java.lang.Integer.valueOf(i17);
            java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) d3Var3.f415021f).mo141623x754a37bb();
            java.lang.Object obj6 = n0.e1.f415025a;
            java.util.LinkedHashSet linkedHashSet = (java.util.LinkedHashSet) hashMap.get(k2Var);
            if (linkedHashSet == null || (obj3 = kz5.n0.Y(linkedHashSet)) == null) {
                obj3 = null;
            } else {
                java.util.LinkedHashSet linkedHashSet2 = (java.util.LinkedHashSet) hashMap.get(k2Var);
                if (linkedHashSet2 != null) {
                    linkedHashSet2.remove(obj3);
                    if (linkedHashSet2.isEmpty()) {
                        hashMap.remove(k2Var);
                    }
                }
            }
            n0.l2 l2Var2 = (n0.l2) obj3;
            java.util.HashMap hashMap2 = d3Var3.f415020e;
            java.util.List list = d3Var3.f415019d;
            int i38 = d3Var3.f415017b;
            if (l2Var2 != null) {
                ((java.util.ArrayList) list).add(l2Var2);
                this.f415303k = d3Var3.a(l2Var2) + i38;
                int i39 = l2Var2.f415136c;
                n0.e2 e2Var = (n0.e2) hashMap2.get(java.lang.Integer.valueOf(i39));
                int i47 = e2Var != null ? e2Var.f415031a : -1;
                int i48 = d3Var3.f415018c;
                int i49 = i47 - i48;
                if (i47 > i48) {
                    java.util.Collection<n0.e2> values = hashMap2.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "groupInfos.values");
                    for (n0.e2 e2Var2 : values) {
                        int i57 = e2Var2.f415031a;
                        if (i57 == i47) {
                            e2Var2.f415031a = i48;
                        } else if (i48 <= i57 && i57 < i47) {
                            e2Var2.f415031a = i57 + 1;
                        }
                    }
                } else if (i48 > i47) {
                    java.util.Collection<n0.e2> values2 = hashMap2.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "groupInfos.values");
                    for (n0.e2 e2Var3 : values2) {
                        int i58 = e2Var3.f415031a;
                        if (i58 == i47) {
                            e2Var3.f415031a = i48;
                        } else if (i47 + 1 <= i58 && i58 < i48) {
                            e2Var3.f415031a = i58 - 1;
                        }
                    }
                }
                n0.j4 j4Var3 = this.E;
                this.P = i39 - (j4Var3.f415107f - this.P);
                j4Var3.l(i39);
                if (i49 > 0) {
                    n0.t0 t0Var = new n0.t0(i49);
                    B(false);
                    n0.j4 j4Var4 = this.E;
                    if (j4Var4.f415104c > 0) {
                        int i59 = j4Var4.f415109h;
                        n0.h2 h2Var = this.S;
                        int i66 = h2Var.f415060b;
                        if ((i66 > 0 ? h2Var.f415059a[i66 - 1] : -1) != i59) {
                            if (!this.Q && this.R) {
                                java.lang.Object obj7 = n0.e1.f415025a;
                                J(false, n0.d1.f415014d);
                                this.Q = true;
                            }
                            n0.d a17 = j4Var4.a(i59);
                            h2Var.b(i59);
                            J(false, new n0.s0(a17));
                        }
                    }
                    G(t0Var);
                }
                T(z17, obj2);
            } else {
                this.E.f415110i++;
                this.L = true;
                this.I = null;
                if (this.G.f415195t) {
                    n0.o4 j17 = this.F.j();
                    this.G = j17;
                    j17.E();
                    this.H = false;
                    this.I = null;
                }
                n0.o4 o4Var2 = this.G;
                int i67 = o4Var2.f415188m;
                o4Var2.f415188m = i67 + 1;
                if (i67 == 0) {
                    o4Var2.f415191p.b(((o4Var2.f415177b.length / 5) - o4Var2.f415181f) - o4Var2.f415182g);
                }
                n0.o4 o4Var3 = this.G;
                int i68 = o4Var3.f415193r;
                if (z17) {
                    o4Var3.I(125, obj5, true, obj5);
                } else if (obj2 != null) {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    o4Var3.I(i17, obj4, false, obj2);
                } else {
                    if (obj4 == null) {
                        obj4 = obj5;
                    }
                    o4Var3.I(i17, obj4, false, obj5);
                }
                this.f415293J = this.G.b(i68);
                int i69 = (-2) - i68;
                n0.l2 l2Var3 = new n0.l2(i17, -1, i69, -1, 0);
                hashMap2.put(java.lang.Integer.valueOf(i69), new n0.e2(-1, this.f415303k - i38, 0));
                ((java.util.ArrayList) list).add(l2Var3);
                d3Var = new n0.d3(new java.util.ArrayList(), z17 ? 0 : this.f415303k);
            }
        }
        s(z17, d3Var);
    }

    public void Q() {
        P(org.p3343x72743996.net.InterfaceC29524x4f65168b.f74043x46bcf642, null, false, null);
    }

    public final void R(int i17, java.lang.Object obj) {
        P(i17, obj, false, null);
    }

    public void S() {
        int i17 = 125;
        if (!this.L && (!this.f415317y ? this.E.e() == 126 : this.E.e() == 125)) {
            i17 = 126;
        }
        P(i17, null, true, null);
        this.f415310r = true;
    }

    public final void T(boolean z17, java.lang.Object obj) {
        if (!z17) {
            if (obj != null && this.E.d() != obj) {
                J(false, new n0.v0(obj));
            }
            this.E.o();
            return;
        }
        n0.j4 j4Var = this.E;
        if (j4Var.f415110i <= 0) {
            if (!n0.l4.f(j4Var.f415103b, j4Var.f415107f)) {
                throw new java.lang.IllegalArgumentException("Expected a node group".toString());
            }
            j4Var.o();
        }
    }

    public void U(int i17) {
        P(i17, null, false, null);
    }

    public n0.o V(int i17) {
        java.lang.Object obj;
        n0.l3 l3Var;
        int i18;
        P(i17, null, false, null);
        boolean z17 = this.L;
        n0.d5 d5Var = this.C;
        n0.p1 p1Var = this.f415300h;
        if (z17) {
            n0.l3 l3Var2 = new n0.l3((n0.j1) p1Var);
            d5Var.b(l3Var2);
            g0(l3Var2);
            l3Var2.f415142e = this.B.d();
            l3Var2.f415139b &= -17;
        } else {
            java.util.List list = this.f415311s;
            int d17 = n0.e1.d(list, this.E.f415109h);
            n0.i2 i2Var = d17 >= 0 ? (n0.i2) ((java.util.ArrayList) list).remove(d17) : null;
            n0.j4 j4Var = this.E;
            int i19 = j4Var.f415110i;
            java.lang.Object obj2 = n0.n.f415153a;
            if (i19 > 0 || (i18 = j4Var.f415111j) >= j4Var.f415112k) {
                obj = obj2;
            } else {
                j4Var.f415111j = i18 + 1;
                obj = j4Var.f415105d[i18];
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, obj2)) {
                l3Var = new n0.l3((n0.j1) p1Var);
                g0(l3Var);
            } else {
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                }
                l3Var = (n0.l3) obj;
            }
            if (i2Var != null) {
                l3Var.f415139b |= 8;
            } else {
                l3Var.f415139b &= -9;
            }
            d5Var.b(l3Var);
            l3Var.f415142e = this.B.d();
            l3Var.f415139b &= -17;
        }
        return this;
    }

    public void W(int i17, java.lang.Object obj) {
        if (this.E.e() == i17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.E.d(), obj) && this.f415318z < 0) {
            this.f415318z = this.E.f415107f;
            this.f415317y = true;
        }
        P(i17, null, false, obj);
    }

    public void X() {
        P(125, null, true, null);
        this.f415310r = true;
    }

    public final void Y() {
        java.lang.Object mo128745x754a37bb;
        n0.k4 k4Var = this.f415296d;
        this.E = k4Var.h();
        P(100, null, false, null);
        n0.g1 g1Var = this.f415295c;
        g1Var.k();
        this.f415313u = g1Var.d();
        boolean z17 = this.f415315w;
        java.lang.Object obj = n0.e1.f415025a;
        this.f415316x.b(z17 ? 1 : 0);
        this.f415315w = e(this.f415313u);
        this.I = null;
        if (!this.f415309q) {
            this.f415309q = g1Var.c();
        }
        n0.h3 key = y0.d.f540022a;
        p0.f fVar = this.f415313u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (fVar.containsKey(key)) {
            n0.e5 e5Var = (n0.e5) fVar.get(key);
            mo128745x754a37bb = e5Var != null ? e5Var.mo128745x754a37bb() : null;
        } else {
            mo128745x754a37bb = key.f415133a.mo128745x754a37bb();
        }
        java.util.Set set = (java.util.Set) mo128745x754a37bb;
        if (set != null) {
            set.add(k4Var);
            g1Var.i(set);
        }
        P(g1Var.e(), null, false, null);
    }

    public final boolean Z(n0.l3 scope, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        n0.d dVar = scope.f415140c;
        if (dVar == null) {
            return false;
        }
        n0.k4 slots = this.f415296d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        int e17 = slots.e(dVar);
        if (!this.D || e17 < this.E.f415107f) {
            return false;
        }
        java.util.List list = this.f415311s;
        int d17 = n0.e1.d(list, e17);
        o0.d dVar2 = null;
        if (d17 < 0) {
            int i17 = -(d17 + 1);
            if (obj != null) {
                dVar2 = new o0.d();
                dVar2.add(obj);
            }
            ((java.util.ArrayList) list).add(i17, new n0.i2(scope, e17, dVar2));
        } else if (obj == null) {
            ((n0.i2) ((java.util.ArrayList) list).get(d17)).f415072c = null;
        } else {
            o0.d dVar3 = ((n0.i2) ((java.util.ArrayList) list).get(d17)).f415072c;
            if (dVar3 != null) {
                dVar3.add(obj);
            }
        }
        return true;
    }

    public final void a() {
        g();
        this.f415301i.f415022a.clear();
        this.f415304l.f415060b = 0;
        this.f415306n.f415060b = 0;
        this.f415312t.f415060b = 0;
        this.f415316x.f415060b = 0;
        this.f415314v.clear();
        this.E.b();
        this.M = 0;
        this.A = 0;
        this.f415310r = false;
        this.D = false;
    }

    public final void a0(int i17, java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            if (obj instanceof java.lang.Enum) {
                this.M = ((java.lang.Enum) obj).ordinal() ^ java.lang.Integer.rotateLeft(this.M, 3);
                return;
            } else {
                this.M = obj.hashCode() ^ java.lang.Integer.rotateLeft(this.M, 3);
                return;
            }
        }
        if (obj2 == null || i17 != 207 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, n0.n.f415153a)) {
            this.M = i17 ^ java.lang.Integer.rotateLeft(this.M, 3);
        } else {
            this.M = obj2.hashCode() ^ java.lang.Integer.rotateLeft(this.M, 3);
        }
    }

    public boolean b(float f17) {
        java.lang.Object y17 = y();
        if (y17 instanceof java.lang.Float) {
            if (f17 == ((java.lang.Number) y17).floatValue()) {
                return false;
            }
        }
        g0(java.lang.Float.valueOf(f17));
        return true;
    }

    public final void b0(int i17, java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            if (obj instanceof java.lang.Enum) {
                c0(((java.lang.Enum) obj).ordinal());
                return;
            } else {
                c0(obj.hashCode());
                return;
            }
        }
        if (obj2 == null || i17 != 207 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, n0.n.f415153a)) {
            c0(i17);
        } else {
            c0(obj2.hashCode());
        }
    }

    public boolean c(int i17) {
        java.lang.Object y17 = y();
        if ((y17 instanceof java.lang.Integer) && i17 == ((java.lang.Number) y17).intValue()) {
            return false;
        }
        g0(java.lang.Integer.valueOf(i17));
        return true;
    }

    public final void c0(int i17) {
        this.M = java.lang.Integer.rotateRight(java.lang.Integer.hashCode(i17) ^ this.M, 3);
    }

    public boolean d(long j17) {
        java.lang.Object y17 = y();
        if ((y17 instanceof java.lang.Long) && j17 == ((java.lang.Number) y17).longValue()) {
            return false;
        }
        g0(java.lang.Long.valueOf(j17));
        return true;
    }

    public final void d0(int i17, int i18) {
        if (h0(i17) != i18) {
            if (i17 < 0) {
                java.util.HashMap hashMap = this.f415308p;
                if (hashMap == null) {
                    hashMap = new java.util.HashMap();
                    this.f415308p = hashMap;
                }
                hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            int[] iArr = this.f415307o;
            if (iArr == null) {
                int i19 = this.E.f415104c;
                int[] iArr2 = new int[i19];
                java.util.Arrays.fill(iArr2, 0, i19, -1);
                this.f415307o = iArr2;
                iArr = iArr2;
            }
            iArr[i17] = i18;
        }
    }

    public boolean e(java.lang.Object obj) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final void e0(int i17, int i18) {
        int h07 = h0(i17);
        if (h07 != i18) {
            int i19 = i18 - h07;
            n0.d5 d5Var = this.f415301i;
            int size = d5Var.f415022a.size() - 1;
            while (i17 != -1) {
                int h08 = h0(i17) + i19;
                d0(i17, h08);
                int i27 = size;
                while (true) {
                    if (-1 < i27) {
                        n0.d3 d3Var = (n0.d3) d5Var.f415022a.get(i27);
                        if (d3Var != null && d3Var.b(i17, h08)) {
                            size = i27 - 1;
                            break;
                        }
                        i27--;
                    } else {
                        break;
                    }
                }
                if (i17 < 0) {
                    i17 = this.E.f415109h;
                } else if (this.E.h(i17)) {
                    return;
                } else {
                    i17 = this.E.k(i17);
                }
            }
        }
    }

    public boolean f(boolean z17) {
        java.lang.Object y17 = y();
        if ((y17 instanceof java.lang.Boolean) && z17 == ((java.lang.Boolean) y17).booleanValue()) {
            return false;
        }
        g0(java.lang.Boolean.valueOf(z17));
        return true;
    }

    public final p0.f f0(p0.f fVar, p0.f fVar2) {
        r0.d dVar = (r0.d) fVar;
        dVar.getClass();
        r0.f fVar3 = new r0.f(dVar);
        fVar3.putAll(fVar2);
        r0.d b17 = fVar3.b();
        R(204, n0.e1.f415029e);
        e(b17);
        e(fVar2);
        o(false);
        return b17;
    }

    public final void g() {
        this.f415302j = null;
        this.f415303k = 0;
        this.f415305m = 0;
        this.P = 0;
        this.M = 0;
        this.f415310r = false;
        this.Q = false;
        this.S.f415060b = 0;
        this.C.f415022a.clear();
        this.f415307o = null;
        this.f415308p = null;
    }

    public final void g0(java.lang.Object obj) {
        boolean z17 = this.L;
        java.util.Set set = this.f415297e;
        if (!z17) {
            n0.j4 j4Var = this.E;
            int j17 = (j4Var.f415111j - n0.l4.j(j4Var.f415103b, j4Var.f415109h)) - 1;
            if (obj instanceof n0.e4) {
                set.add(obj);
            }
            J(true, new n0.x0(obj, j17));
            return;
        }
        n0.o4 o4Var = this.G;
        if (o4Var.f415188m > 0) {
            o4Var.q(1, o4Var.f415194s);
        }
        java.lang.Object[] objArr = o4Var.f415178c;
        int i17 = o4Var.f415183h;
        o4Var.f415183h = i17 + 1;
        java.lang.Object obj2 = objArr[o4Var.g(i17)];
        int i18 = o4Var.f415183h;
        if (!(i18 <= o4Var.f415184i)) {
            n0.e1.c("Writing to an invalid slot".toString());
            throw null;
        }
        o4Var.f415178c[o4Var.g(i18 - 1)] = obj;
        if (obj instanceof n0.e4) {
            G(new n0.w0(obj));
            set.add(obj);
        }
    }

    public final int h(int i17, int i18, int i19) {
        int i27;
        java.lang.Object obj;
        if (i17 == i18) {
            return i19;
        }
        n0.j4 j4Var = this.E;
        boolean e17 = n0.l4.e(j4Var.f415103b, i17);
        int[] iArr = j4Var.f415103b;
        if (e17) {
            java.lang.Object j17 = j4Var.j(iArr, i17);
            i27 = j17 != null ? j17 instanceof java.lang.Enum ? ((java.lang.Enum) j17).ordinal() : j17.hashCode() : 0;
        } else {
            int i28 = i17 * 5;
            int i29 = iArr[i28];
            if (i29 == 207) {
                boolean d17 = n0.l4.d(iArr, i17);
                java.lang.Object obj2 = n0.n.f415153a;
                if (d17) {
                    obj = j4Var.f415105d[i28 >= iArr.length ? iArr.length : n0.l4.m(iArr[i28 + 1] >> 29) + iArr[i28 + 4]];
                } else {
                    obj = obj2;
                }
                if (obj != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, obj2)) {
                    i27 = obj.hashCode();
                }
            }
            i27 = i29;
        }
        return i27 == 126665345 ? i27 : java.lang.Integer.rotateLeft(h(this.E.k(i17), i18, i19), 3) ^ i27;
    }

    public final int h0(int i17) {
        int i18;
        java.lang.Integer num;
        if (i17 >= 0) {
            int[] iArr = this.f415307o;
            return (iArr == null || (i18 = iArr[i17]) < 0) ? n0.l4.h(this.E.f415103b, i17) : i18;
        }
        java.util.HashMap hashMap = this.f415308p;
        if (hashMap == null || (num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17))) == null) {
            return 0;
        }
        return num.intValue();
    }

    public java.lang.Object i(n0.l1 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p0.f k17 = k(null);
        java.lang.Object obj = n0.e1.f415025a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "<this>");
        if (!k17.containsKey(key)) {
            return key.f415133a.mo128745x754a37bb();
        }
        n0.e5 e5Var = (n0.e5) k17.get(key);
        if (e5Var != null) {
            return e5Var.mo128745x754a37bb();
        }
        return null;
    }

    public void i0() {
        if (!this.f415310r) {
            n0.e1.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f415310r = false;
        if (!(!this.L)) {
            n0.e1.c("useNode() called while inserting".toString());
            throw null;
        }
        n0.j4 j4Var = this.E;
        this.O.b(j4Var.i(j4Var.f415109h));
    }

    public void j(yz5.a factory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        if (!this.f415310r) {
            n0.e1.c("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw null;
        }
        this.f415310r = false;
        if (!this.L) {
            n0.e1.c("createNode() can only be called when inserting".toString());
            throw null;
        }
        int i17 = this.f415304l.f415059a[r0.f415060b - 1];
        n0.o4 o4Var = this.G;
        n0.d b17 = o4Var.b(o4Var.f415194s);
        this.f415305m++;
        ((java.util.ArrayList) this.K).add(new n0.s(factory, b17, i17));
        this.T.b(new n0.t(b17, i17));
    }

    public final p0.f k(java.lang.Integer num) {
        p0.f fVar;
        if (num == null && (fVar = this.I) != null) {
            return fVar;
        }
        boolean z17 = this.L;
        java.lang.Object obj = n0.n.f415153a;
        if (z17 && this.H) {
            int i17 = this.G.f415194s;
            while (i17 > 0) {
                n0.o4 o4Var = this.G;
                if (o4Var.f415177b[o4Var.m(i17) * 5] == 202) {
                    n0.o4 o4Var2 = this.G;
                    int m17 = o4Var2.m(i17);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n0.l4.e(o4Var2.f415177b, m17) ? o4Var2.f415178c[n0.l4.i(o4Var2.f415177b, m17)] : null, n0.e1.f415027c)) {
                        n0.o4 o4Var3 = this.G;
                        int m18 = o4Var3.m(i17);
                        if (n0.l4.d(o4Var3.f415177b, m18)) {
                            obj = o4Var3.f415178c[o4Var3.d(o4Var3.f415177b, m18)];
                        }
                        if (obj == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        p0.f fVar2 = (p0.f) obj;
                        this.I = fVar2;
                        return fVar2;
                    }
                }
                i17 = this.G.w(i17);
            }
        }
        n0.j4 j4Var = this.E;
        if (j4Var.f415104c > 0) {
            int intValue = num != null ? num.intValue() : j4Var.f415109h;
            while (intValue > 0) {
                n0.j4 j4Var2 = this.E;
                int i18 = intValue * 5;
                int[] iArr = j4Var2.f415103b;
                if (iArr[i18] == 202 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j4Var2.j(iArr, intValue), n0.e1.f415027c)) {
                    p0.f fVar3 = (p0.f) this.f415314v.get(java.lang.Integer.valueOf(intValue));
                    if (fVar3 == null) {
                        n0.j4 j4Var3 = this.E;
                        int[] iArr2 = j4Var3.f415103b;
                        if (n0.l4.d(iArr2, intValue)) {
                            obj = j4Var3.f415105d[i18 >= iArr2.length ? iArr2.length : iArr2[i18 + 4] + n0.l4.m(iArr2[i18 + 1] >> 29)];
                        }
                        if (obj == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        fVar3 = (p0.f) obj;
                    }
                    this.I = fVar3;
                    return fVar3;
                }
                intValue = this.E.k(intValue);
            }
        }
        p0.f fVar4 = this.f415313u;
        this.I = fVar4;
        return fVar4;
    }

    public final void l(o0.b bVar, yz5.p pVar) {
        if (!(!this.D)) {
            n0.e1.c("Reentrant composition is not supported".toString());
            throw null;
        }
        this.B = x0.z.i();
        this.f415314v.clear();
        int i17 = bVar.f423368c;
        int i18 = 0;
        while (true) {
            java.util.List list = this.f415311s;
            if (i18 >= i17) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 1) {
                    kz5.g0.t(arrayList, new n0.a0());
                }
                this.f415303k = 0;
                this.D = true;
                try {
                    Y();
                    java.lang.Object y17 = y();
                    if (y17 != pVar && pVar != null) {
                        g0(pVar);
                    }
                    n0.s4.d(new n0.x(this), new n0.y(this), new n0.z(pVar, this, y17));
                    r();
                    this.D = false;
                    ((java.util.ArrayList) list).clear();
                    return;
                } catch (java.lang.Throwable th6) {
                    this.D = false;
                    ((java.util.ArrayList) list).clear();
                    a();
                    throw th6;
                }
            }
            java.lang.Object obj = bVar.f423366a[i18];
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            }
            o0.d dVar = (o0.d) bVar.f423367b[i18];
            n0.l3 l3Var = (n0.l3) obj;
            n0.d dVar2 = l3Var.f415140c;
            if (dVar2 == null) {
                return;
            }
            ((java.util.ArrayList) list).add(new n0.i2(l3Var, dVar2.f415010a, dVar));
            i18++;
        }
    }

    public final void m(int i17, int i18) {
        if (i17 <= 0 || i17 == i18) {
            return;
        }
        m(this.E.k(i17), i18);
        if (this.E.h(i17)) {
            this.O.b(this.E.i(i17));
        }
    }

    public void n() {
        this.f415317y = this.f415318z >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v54 */
    public final void o(boolean z17) {
        boolean z18;
        boolean z19;
        ?? r47;
        boolean z27;
        java.util.HashSet hashSet;
        n0.d3 d3Var;
        java.util.ArrayList arrayList;
        java.util.LinkedHashSet linkedHashSet;
        int i17;
        int i18;
        boolean z28 = this.L;
        java.lang.Object obj = n0.n.f415153a;
        if (z28) {
            n0.o4 o4Var = this.G;
            int i19 = o4Var.f415194s;
            int i27 = o4Var.f415177b[o4Var.m(i19) * 5];
            n0.o4 o4Var2 = this.G;
            int m17 = o4Var2.m(i19);
            java.lang.Object obj2 = n0.l4.e(o4Var2.f415177b, m17) ? o4Var2.f415178c[n0.l4.i(o4Var2.f415177b, m17)] : null;
            n0.o4 o4Var3 = this.G;
            int m18 = o4Var3.m(i19);
            if (n0.l4.d(o4Var3.f415177b, m18)) {
                obj = o4Var3.f415178c[o4Var3.d(o4Var3.f415177b, m18)];
            }
            b0(i27, obj2, obj);
        } else {
            n0.j4 j4Var = this.E;
            int i28 = j4Var.f415109h;
            int i29 = i28 * 5;
            int[] iArr = j4Var.f415103b;
            int i37 = iArr[i29];
            java.lang.Object j17 = j4Var.j(iArr, i28);
            n0.j4 j4Var2 = this.E;
            int[] iArr2 = j4Var2.f415103b;
            if (n0.l4.d(iArr2, i28)) {
                obj = j4Var2.f415105d[i29 >= iArr2.length ? iArr2.length : iArr2[i29 + 4] + n0.l4.m(iArr2[i29 + 1] >> 29)];
            }
            b0(i37, j17, obj);
        }
        int i38 = this.f415305m;
        n0.d3 d3Var2 = this.f415302j;
        java.util.List list = this.f415311s;
        if (d3Var2 != null) {
            java.util.List list2 = d3Var2.f415016a;
            if (list2.size() > 0) {
                java.util.List list3 = d3Var2.f415019d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list3, "<this>");
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list3;
                java.util.HashSet hashSet2 = new java.util.HashSet(arrayList2.size());
                int size = arrayList2.size();
                for (int i39 = 0; i39 < size; i39++) {
                    hashSet2.add(arrayList2.get(i39));
                }
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                int size2 = arrayList2.size();
                int size3 = list2.size();
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                while (i47 < size3) {
                    n0.l2 l2Var = (n0.l2) list2.get(i47);
                    boolean contains = hashSet2.contains(l2Var);
                    int i57 = d3Var2.f415017b;
                    if (contains) {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(l2Var)) {
                            if (i48 < size2) {
                                n0.l2 keyInfo = (n0.l2) arrayList2.get(i48);
                                java.util.HashMap hashMap = d3Var2.f415020e;
                                if (keyInfo != l2Var) {
                                    int a17 = d3Var2.a(keyInfo);
                                    linkedHashSet2.add(keyInfo);
                                    if (a17 != i49) {
                                        d3Var = d3Var2;
                                        n0.e2 e2Var = (n0.e2) hashMap.get(java.lang.Integer.valueOf(keyInfo.f415136c));
                                        int i58 = e2Var != null ? e2Var.f415033c : keyInfo.f415137d;
                                        arrayList = arrayList2;
                                        int i59 = a17 + i57;
                                        int i66 = i57 + i49;
                                        if (i58 > 0) {
                                            linkedHashSet = linkedHashSet2;
                                            int i67 = this.X;
                                            if (i67 > 0) {
                                                i17 = size2;
                                                i18 = size3;
                                                if (this.V == i59 - i67 && this.W == i66 - i67) {
                                                    this.X = i67 + i58;
                                                }
                                            } else {
                                                i17 = size2;
                                                i18 = size3;
                                            }
                                            A();
                                            this.V = i59;
                                            this.W = i66;
                                            this.X = i58;
                                        } else {
                                            linkedHashSet = linkedHashSet2;
                                            i17 = size2;
                                            i18 = size3;
                                        }
                                        if (a17 > i49) {
                                            java.util.Collection<n0.e2> values = hashMap.values();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "groupInfos.values");
                                            for (n0.e2 e2Var2 : values) {
                                                int i68 = e2Var2.f415032b;
                                                if (a17 <= i68 && i68 < a17 + i58) {
                                                    e2Var2.f415032b = (i68 - a17) + i49;
                                                } else if (i49 <= i68 && i68 < a17) {
                                                    e2Var2.f415032b = i68 + i58;
                                                }
                                            }
                                        } else if (i49 > a17) {
                                            java.util.Collection<n0.e2> values2 = hashMap.values();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "groupInfos.values");
                                            for (n0.e2 e2Var3 : values2) {
                                                int i69 = e2Var3.f415032b;
                                                if (a17 <= i69 && i69 < a17 + i58) {
                                                    e2Var3.f415032b = (i69 - a17) + i49;
                                                } else if (a17 + 1 <= i69 && i69 < i49) {
                                                    e2Var3.f415032b = i69 - i58;
                                                }
                                            }
                                        }
                                    } else {
                                        d3Var = d3Var2;
                                        arrayList = arrayList2;
                                        linkedHashSet = linkedHashSet2;
                                        i17 = size2;
                                        i18 = size3;
                                    }
                                } else {
                                    d3Var = d3Var2;
                                    arrayList = arrayList2;
                                    linkedHashSet = linkedHashSet2;
                                    i17 = size2;
                                    i18 = size3;
                                    i47++;
                                }
                                i48++;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyInfo, "keyInfo");
                                n0.e2 e2Var4 = (n0.e2) hashMap.get(java.lang.Integer.valueOf(keyInfo.f415136c));
                                i49 += e2Var4 != null ? e2Var4.f415033c : keyInfo.f415137d;
                                hashSet2 = hashSet;
                                d3Var2 = d3Var;
                                arrayList2 = arrayList;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i17;
                                size3 = i18;
                            }
                            hashSet2 = hashSet;
                        }
                    } else {
                        I(d3Var2.a(l2Var) + i57, l2Var.f415137d);
                        int i76 = l2Var.f415136c;
                        d3Var2.b(i76, 0);
                        n0.j4 j4Var3 = this.E;
                        hashSet = hashSet2;
                        this.P = i76 - (j4Var3.f415107f - this.P);
                        j4Var3.l(i76);
                        H();
                        this.E.m();
                        n0.e1.a(list, i76, this.E.g(i76) + i76);
                    }
                    i47++;
                    hashSet2 = hashSet;
                }
                A();
                if (list2.size() > 0) {
                    n0.j4 j4Var4 = this.E;
                    this.P = j4Var4.f415108g - (j4Var4.f415107f - this.P);
                    j4Var4.n();
                }
            }
        }
        int i77 = this.f415303k;
        while (true) {
            n0.j4 j4Var5 = this.E;
            if ((j4Var5.f415110i > 0) || j4Var5.f415107f == j4Var5.f415108g) {
                break;
            }
            int i78 = j4Var5.f415107f;
            H();
            I(i77, this.E.m());
            n0.e1.a(list, i78, this.E.f415107f);
        }
        boolean z29 = this.L;
        n0.h2 h2Var = this.S;
        if (z29) {
            java.util.List list4 = this.K;
            if (z17) {
                ((java.util.ArrayList) list4).add(this.T.a());
                i38 = 1;
            }
            n0.j4 j4Var6 = this.E;
            int i79 = j4Var6.f415110i;
            if (!(i79 > 0)) {
                throw new java.lang.IllegalArgumentException("Unbalanced begin/end empty".toString());
            }
            j4Var6.f415110i = i79 - 1;
            n0.o4 o4Var4 = this.G;
            int i86 = o4Var4.f415194s;
            o4Var4.h();
            if (!(this.E.f415110i > 0)) {
                int i87 = (-2) - i86;
                this.G.i();
                this.G.e();
                n0.d dVar = this.f415293J;
                boolean isEmpty = ((java.util.ArrayList) list4).isEmpty();
                n0.d1 d1Var = n0.d1.f415014d;
                if (isEmpty) {
                    n0.p0 p0Var = new n0.p0(this.F, dVar);
                    B(false);
                    n0.j4 j4Var7 = this.E;
                    if (j4Var7.f415104c > 0) {
                        int i88 = j4Var7.f415109h;
                        int i89 = h2Var.f415060b;
                        if ((i89 > 0 ? h2Var.f415059a[i89 - 1] : -1) != i88) {
                            if (this.Q || !this.R) {
                                z27 = false;
                            } else {
                                java.lang.Object obj3 = n0.e1.f415025a;
                                z27 = false;
                                J(false, d1Var);
                                this.Q = true;
                            }
                            n0.d a18 = j4Var7.a(i88);
                            h2Var.b(i88);
                            J(z27, new n0.s0(a18));
                        }
                    }
                    G(p0Var);
                    r47 = 0;
                } else {
                    java.util.List V0 = kz5.n0.V0(list4);
                    ((java.util.ArrayList) list4).clear();
                    C();
                    z();
                    n0.q0 q0Var = new n0.q0(this.F, dVar, V0);
                    B(false);
                    n0.j4 j4Var8 = this.E;
                    if (j4Var8.f415104c > 0) {
                        int i96 = j4Var8.f415109h;
                        int i97 = h2Var.f415060b;
                        if ((i97 > 0 ? h2Var.f415059a[i97 - 1] : -1) != i96) {
                            if (this.Q || !this.R) {
                                z19 = false;
                            } else {
                                java.lang.Object obj4 = n0.e1.f415025a;
                                z19 = false;
                                J(false, d1Var);
                                this.Q = true;
                            }
                            n0.d a19 = j4Var8.a(i96);
                            h2Var.b(i96);
                            J(z19, new n0.s0(a19));
                            z18 = z19;
                            G(q0Var);
                            r47 = z18;
                        }
                    }
                    z18 = false;
                    G(q0Var);
                    r47 = z18;
                }
                this.L = r47;
                if (!(this.f415296d.f415124e == 0 ? true : r47)) {
                    d0(i87, r47);
                    e0(i87, i38);
                }
            }
        } else {
            if (z17) {
                K();
            }
            int i98 = this.E.f415109h;
            int i99 = h2Var.f415060b;
            if (!((i99 > 0 ? h2Var.f415059a[i99 + (-1)] : -1) <= i98)) {
                n0.e1.c("Missed recording an endGroup".toString());
                throw null;
            }
            if ((i99 > 0 ? h2Var.f415059a[i99 - 1] : -1) == i98) {
                h2Var.a();
                java.lang.Object obj5 = n0.e1.f415025a;
                J(false, n0.z0.f415333d);
            }
            int i100 = this.E.f415109h;
            if (i38 != h0(i100)) {
                e0(i100, i38);
            }
            if (z17) {
                i38 = 1;
            }
            this.E.c();
            A();
        }
        n0.d3 d3Var3 = (n0.d3) this.f415301i.a();
        if (d3Var3 != null && !z29) {
            d3Var3.f415018c++;
        }
        this.f415302j = d3Var3;
        this.f415303k = this.f415304l.a() + i38;
        this.f415305m = this.f415306n.a() + i38;
    }

    public void p() {
        o(false);
        n0.l3 t17 = t();
        if (t17 != null) {
            int i17 = t17.f415139b;
            if ((i17 & 1) != 0) {
                t17.f415139b = i17 | 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r6 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r6 = new n0.k3(r0, r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n0.f4 q() {
        /*
            r9 = this;
            n0.d5 r0 = r9.C
            java.util.ArrayList r1 = r0.f415022a
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            if (r1 == 0) goto L14
            java.lang.Object r0 = r0.a()
            n0.l3 r0 = (n0.l3) r0
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 != 0) goto L18
            goto L1e
        L18:
            int r1 = r0.f415139b
            r1 = r1 & (-9)
            r0.f415139b = r1
        L1e:
            r1 = 0
            if (r0 == 0) goto L6d
            x0.m r4 = r9.B
            int r4 = r4.d()
            o0.a r5 = r0.f415143f
            if (r5 == 0) goto L62
            int r6 = r0.f415139b
            r6 = r6 & 16
            if (r6 == 0) goto L33
            r6 = r2
            goto L34
        L33:
            r6 = r1
        L34:
            if (r6 != 0) goto L62
            int r6 = r5.f423363a
            r7 = r1
        L39:
            if (r7 >= r6) goto L59
            java.lang.Object[] r8 = r5.f423364b
            r8 = r8[r7]
            if (r8 == 0) goto L51
            int[] r8 = r5.f423365c
            r8 = r8[r7]
            if (r8 == r4) goto L49
            r8 = r2
            goto L4a
        L49:
            r8 = r1
        L4a:
            if (r8 == 0) goto L4e
            r6 = r2
            goto L5a
        L4e:
            int r7 = r7 + 1
            goto L39
        L51:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Any"
            r0.<init>(r1)
            throw r0
        L59:
            r6 = r1
        L5a:
            if (r6 == 0) goto L62
            n0.k3 r6 = new n0.k3
            r6.<init>(r0, r4, r5)
            goto L63
        L62:
            r6 = r3
        L63:
            if (r6 == 0) goto L6d
            n0.b0 r4 = new n0.b0
            r4.<init>(r6, r9)
            r9.G(r4)
        L6d:
            if (r0 == 0) goto La7
            int r4 = r0.f415139b
            r5 = r4 & 16
            if (r5 == 0) goto L77
            r5 = r2
            goto L78
        L77:
            r5 = r1
        L78:
            if (r5 != 0) goto La7
            r4 = r4 & r2
            if (r4 == 0) goto L7e
            goto L7f
        L7e:
            r2 = r1
        L7f:
            if (r2 != 0) goto L85
            boolean r2 = r9.f415309q
            if (r2 == 0) goto La7
        L85:
            n0.d r2 = r0.f415140c
            if (r2 != 0) goto La0
            boolean r2 = r9.L
            if (r2 == 0) goto L96
            n0.o4 r2 = r9.G
            int r3 = r2.f415194s
            n0.d r2 = r2.b(r3)
            goto L9e
        L96:
            n0.j4 r2 = r9.E
            int r3 = r2.f415109h
            n0.d r2 = r2.a(r3)
        L9e:
            r0.f415140c = r2
        La0:
            int r2 = r0.f415139b
            r2 = r2 & (-5)
            r0.f415139b = r2
            r3 = r0
        La7:
            r9.o(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.q():n0.f4");
    }

    public final void r() {
        o(false);
        this.f415295c.b();
        o(false);
        if (this.Q) {
            java.lang.Object obj = n0.e1.f415025a;
            J(false, n0.z0.f415333d);
            this.Q = false;
        }
        C();
        if (!this.f415301i.f415022a.isEmpty()) {
            n0.e1.c("Start/end imbalance".toString());
            throw null;
        }
        if (!(this.S.f415060b == 0)) {
            n0.e1.c("Missed recording an endGroup()".toString());
            throw null;
        }
        g();
        this.E.b();
    }

    public final void s(boolean z17, n0.d3 d3Var) {
        this.f415301i.b(this.f415302j);
        this.f415302j = d3Var;
        this.f415304l.b(this.f415303k);
        if (z17) {
            this.f415303k = 0;
        }
        this.f415306n.b(this.f415305m);
        this.f415305m = 0;
    }

    public final n0.l3 t() {
        if (this.A == 0) {
            n0.d5 d5Var = this.C;
            if (!d5Var.f415022a.isEmpty()) {
                return (n0.l3) d5Var.f415022a.get(r0.size() - 1);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u() {
        /*
            r3 = this;
            boolean r0 = r3.f415315w
            r1 = 1
            if (r0 != 0) goto L1e
            n0.l3 r0 = r3.t()
            r2 = 0
            if (r0 == 0) goto L19
            int r0 = r0.f415139b
            r0 = r0 & 4
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 != r1) goto L19
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = r2
        L1e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.u():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v() {
        /*
            r3 = this;
            boolean r0 = r3.L
            r1 = 0
            if (r0 != 0) goto L25
            boolean r0 = r3.f415317y
            if (r0 != 0) goto L25
            boolean r0 = r3.f415315w
            if (r0 != 0) goto L25
            n0.l3 r0 = r3.t()
            r2 = 1
            if (r0 == 0) goto L21
            int r0 = r0.f415139b
            r0 = r0 & 8
            if (r0 == 0) goto L1c
            r0 = r2
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 != 0) goto L21
            r0 = r2
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.y0.v():boolean");
    }

    public void w(java.util.List references) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(references, "references");
        java.util.List list = this.f415299g;
        java.util.List list2 = this.f415298f;
        try {
            this.f415298f = list;
            java.lang.Object obj = n0.e1.f415025a;
            G(n0.b1.f414972d);
            if (references.size() <= 0) {
                G(n0.j0.f415078d);
                this.P = 0;
                this.f415298f = list2;
                g();
                return;
            }
            jz5.l lVar = (jz5.l) references.get(0);
            n0.u2 u2Var = (n0.u2) lVar.f384366d;
            u2Var.getClass();
            u2Var.getClass();
            throw null;
        } catch (java.lang.Throwable th6) {
            this.f415298f = list2;
            throw th6;
        }
    }

    public final java.lang.Object y() {
        java.lang.Object obj;
        int i17;
        boolean z17 = this.L;
        java.lang.Object obj2 = n0.n.f415153a;
        if (z17) {
            if (!this.f415310r) {
                return obj2;
            }
            n0.e1.c("A call to createNode(), emitNode() or useNode() expected".toString());
            throw null;
        }
        n0.j4 j4Var = this.E;
        if (j4Var.f415110i > 0 || (i17 = j4Var.f415111j) >= j4Var.f415112k) {
            obj = obj2;
        } else {
            j4Var.f415111j = i17 + 1;
            obj = j4Var.f415105d[i17];
        }
        return this.f415317y ? obj2 : obj;
    }

    public final void z() {
        n0.d5 d5Var = this.O;
        if (!d5Var.f415022a.isEmpty()) {
            java.util.ArrayList arrayList = d5Var.f415022a;
            int size = arrayList.size();
            java.lang.Object[] objArr = new java.lang.Object[size];
            for (int i17 = 0; i17 < size; i17++) {
                objArr[i17] = arrayList.get(i17);
            }
            G(new n0.k0(objArr));
            arrayList.clear();
        }
    }
}
