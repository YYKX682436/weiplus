package n0;

/* loaded from: classes14.dex */
public final class o4 {

    /* renamed from: v, reason: collision with root package name */
    public static final n0.m4 f415175v = new n0.m4(null);

    /* renamed from: a, reason: collision with root package name */
    public final n0.k4 f415176a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f415177b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f415178c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f415179d;

    /* renamed from: e, reason: collision with root package name */
    public int f415180e;

    /* renamed from: f, reason: collision with root package name */
    public int f415181f;

    /* renamed from: g, reason: collision with root package name */
    public int f415182g;

    /* renamed from: h, reason: collision with root package name */
    public int f415183h;

    /* renamed from: i, reason: collision with root package name */
    public int f415184i;

    /* renamed from: j, reason: collision with root package name */
    public int f415185j;

    /* renamed from: k, reason: collision with root package name */
    public int f415186k;

    /* renamed from: l, reason: collision with root package name */
    public int f415187l;

    /* renamed from: m, reason: collision with root package name */
    public int f415188m;

    /* renamed from: n, reason: collision with root package name */
    public int f415189n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.h2 f415190o;

    /* renamed from: p, reason: collision with root package name */
    public final n0.h2 f415191p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.h2 f415192q;

    /* renamed from: r, reason: collision with root package name */
    public int f415193r;

    /* renamed from: s, reason: collision with root package name */
    public int f415194s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f415195t;

    /* renamed from: u, reason: collision with root package name */
    public n0.e3 f415196u;

    public o4(n0.k4 table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        this.f415176a = table;
        int[] iArr = table.f415123d;
        this.f415177b = iArr;
        java.lang.Object[] objArr = table.f415125f;
        this.f415178c = objArr;
        this.f415179d = table.f415130n;
        int i17 = table.f415124e;
        this.f415180e = i17;
        this.f415181f = (iArr.length / 5) - i17;
        this.f415182g = i17;
        int i18 = table.f415126g;
        this.f415185j = i18;
        this.f415186k = objArr.length - i18;
        this.f415187l = i17;
        this.f415190o = new n0.h2();
        this.f415191p = new n0.h2();
        this.f415192q = new n0.h2();
        this.f415194s = -1;
    }

    public final boolean A(int i17, int i18) {
        boolean z17;
        boolean z18 = false;
        if (i18 <= 0) {
            return false;
        }
        java.util.ArrayList arrayList = this.f415179d;
        t(i17);
        if (!arrayList.isEmpty()) {
            int i19 = i18 + i17;
            int g17 = n0.l4.g(this.f415179d, i19, (this.f415177b.length / 5) - this.f415181f);
            if (g17 >= this.f415179d.size()) {
                g17--;
            }
            int i27 = g17 + 1;
            int i28 = 0;
            while (g17 >= 0) {
                java.lang.Object obj = this.f415179d.get(g17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "anchors[index]");
                n0.d dVar = (n0.d) obj;
                int c17 = c(dVar);
                if (c17 < i17) {
                    break;
                }
                if (c17 < i19) {
                    dVar.f415010a = Integer.MIN_VALUE;
                    if (i28 == 0) {
                        i28 = g17 + 1;
                    }
                    i27 = g17;
                }
                g17--;
            }
            z17 = i27 < i28;
            if (z17) {
                this.f415179d.subList(i27, i28).clear();
            }
        } else {
            z17 = false;
        }
        this.f415180e = i17;
        this.f415181f += i18;
        int i29 = this.f415187l;
        if (i29 > i17) {
            this.f415187l = java.lang.Math.max(i17, i29 - i18);
        }
        int i37 = this.f415182g;
        if (i37 >= this.f415180e) {
            this.f415182g = i37 - i18;
        }
        int i38 = this.f415194s;
        if (i38 >= 0 && n0.l4.a(this.f415177b, m(i38))) {
            z18 = true;
        }
        if (z18) {
            K(this.f415194s);
        }
        return z17;
    }

    public final void B(int i17, int i18, int i19) {
        if (i18 > 0) {
            int i27 = this.f415186k;
            int i28 = i17 + i18;
            u(i28, i19);
            this.f415185j = i17;
            this.f415186k = i27 + i18;
            kz5.v.t(this.f415178c, null, i17, i28);
            int i29 = this.f415184i;
            if (i29 >= i17) {
                this.f415184i = i29 - i18;
            }
        }
    }

    public final java.lang.Object C(int i17, java.lang.Object obj) {
        int G = G(this.f415177b, m(this.f415193r));
        int i18 = G + i17;
        if (i18 >= G && i18 < f(this.f415177b, m(this.f415193r + 1))) {
            int g17 = g(i18);
            java.lang.Object[] objArr = this.f415178c;
            java.lang.Object obj2 = objArr[g17];
            objArr[g17] = obj;
            return obj2;
        }
        n0.e1.c(("Write to an invalid slot index " + i17 + " for group " + this.f415193r).toString());
        throw null;
    }

    public final int D() {
        int m17 = m(this.f415193r);
        int c17 = this.f415193r + n0.l4.c(this.f415177b, m17);
        this.f415193r = c17;
        this.f415183h = f(this.f415177b, m(c17));
        if (n0.l4.f(this.f415177b, m17)) {
            return 1;
        }
        return n0.l4.h(this.f415177b, m17);
    }

    public final void E() {
        int i17 = this.f415182g;
        this.f415193r = i17;
        this.f415183h = f(this.f415177b, m(i17));
    }

    public final java.lang.Object F(int i17, int i18) {
        int G = G(this.f415177b, m(i17));
        int i19 = i18 + G;
        if (G <= i19 && i19 < f(this.f415177b, m(i17 + 1))) {
            return this.f415178c[g(i19)];
        }
        int i27 = n0.o.f415162a;
        return n0.n.f415153a;
    }

    public final int G(int[] iArr, int i17) {
        if (i17 >= this.f415177b.length / 5) {
            return this.f415178c.length - this.f415186k;
        }
        int j17 = n0.l4.j(iArr, i17);
        return j17 < 0 ? (this.f415178c.length - this.f415186k) + j17 + 1 : j17;
    }

    public final void H() {
        if (!(this.f415188m == 0)) {
            throw new java.lang.IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        int i17 = n0.o.f415162a;
        java.lang.Object obj = n0.n.f415153a;
        I(0, obj, false, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(int i17, java.lang.Object obj, boolean z17, java.lang.Object obj2) {
        int c17;
        java.lang.Object[] objArr = this.f415188m > 0;
        this.f415192q.b(this.f415189n);
        java.lang.Object obj3 = n0.n.f415153a;
        if (objArr == true) {
            p(1);
            int i18 = this.f415193r;
            int m17 = m(i18);
            int i19 = obj != obj3 ? 1 : 0;
            int i27 = (z17 || obj2 == obj3) ? 0 : 1;
            int[] iArr = this.f415177b;
            int i28 = this.f415194s;
            int i29 = this.f415183h;
            int i37 = z17 ? 1073741824 : 0;
            int i38 = i19 != 0 ? com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965 : 0;
            int i39 = i27 != 0 ? 268435456 : 0;
            int i47 = m17 * 5;
            iArr[i47 + 0] = i17;
            iArr[i47 + 1] = i37 | i38 | i39;
            iArr[i47 + 2] = i28;
            iArr[i47 + 3] = 0;
            iArr[i47 + 4] = i29;
            this.f415184i = i29;
            int i48 = (z17 ? 1 : 0) + i19 + i27;
            if (i48 > 0) {
                q(i48, i18);
                java.lang.Object[] objArr2 = this.f415178c;
                int i49 = this.f415183h;
                if (z17) {
                    objArr2[i49] = obj2;
                    i49++;
                }
                if (i19 != 0) {
                    objArr2[i49] = obj;
                    i49++;
                }
                if (i27 != 0) {
                    objArr2[i49] = obj2;
                    i49++;
                }
                this.f415183h = i49;
            }
            this.f415189n = 0;
            c17 = i18 + 1;
            this.f415194s = i18;
            this.f415193r = c17;
        } else {
            this.f415190o.b(this.f415194s);
            this.f415191p.b(((this.f415177b.length / 5) - this.f415181f) - this.f415182g);
            int i57 = this.f415193r;
            int m18 = m(i57);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, obj3)) {
                if (z17) {
                    L(this.f415193r, obj2);
                } else {
                    J(obj2);
                }
            }
            this.f415183h = G(this.f415177b, m18);
            this.f415184i = f(this.f415177b, m(this.f415193r + 1));
            this.f415189n = n0.l4.h(this.f415177b, m18);
            this.f415194s = i57;
            this.f415193r = i57 + 1;
            c17 = i57 + n0.l4.c(this.f415177b, m18);
        }
        this.f415182g = c17;
    }

    public final void J(java.lang.Object obj) {
        int m17 = m(this.f415193r);
        if (n0.l4.d(this.f415177b, m17)) {
            this.f415178c[g(d(this.f415177b, m17))] = obj;
        } else {
            n0.e1.c("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void K(int i17) {
        if (i17 >= 0) {
            n0.e3 e3Var = this.f415196u;
            if (e3Var == null) {
                e3Var = new n0.e3(null, 1, null);
                this.f415196u = e3Var;
            }
            e3Var.a(i17);
        }
    }

    public final void L(int i17, java.lang.Object obj) {
        int m17 = m(i17);
        int[] iArr = this.f415177b;
        if (m17 < iArr.length && n0.l4.f(iArr, m17)) {
            this.f415178c[g(f(this.f415177b, m17))] = obj;
            return;
        }
        n0.e1.c(("Updating the node of a group at " + i17 + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i17) {
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.f415188m <= 0)) {
            throw new java.lang.IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i17 == 0) {
            return;
        }
        int i18 = this.f415193r + i17;
        if (i18 >= this.f415194s && i18 <= this.f415182g) {
            this.f415193r = i18;
            int f17 = f(this.f415177b, m(i18));
            this.f415183h = f17;
            this.f415184i = f17;
            return;
        }
        n0.e1.c(("Cannot seek outside the current group (" + this.f415194s + '-' + this.f415182g + ')').toString());
        throw null;
    }

    public final n0.d b(int i17) {
        java.util.ArrayList arrayList = this.f415179d;
        int n17 = n0.l4.n(arrayList, i17, l());
        if (n17 >= 0) {
            java.lang.Object obj = arrayList.get(n17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(location)");
            return (n0.d) obj;
        }
        if (i17 > this.f415180e) {
            i17 = -(l() - i17);
        }
        n0.d dVar = new n0.d(i17);
        arrayList.add(-(n17 + 1), dVar);
        return dVar;
    }

    public final int c(n0.d anchor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
        int i17 = anchor.f415010a;
        return i17 < 0 ? i17 + l() : i17;
    }

    public final int d(int[] iArr, int i17) {
        return f(iArr, i17) + n0.l4.m(iArr[(i17 * 5) + 1] >> 29);
    }

    public final void e() {
        this.f415195t = true;
        if (this.f415190o.f415060b == 0) {
            t(l());
            u(this.f415178c.length - this.f415186k, this.f415180e);
            y();
        }
        int[] groups = this.f415177b;
        int i17 = this.f415180e;
        java.lang.Object[] slots = this.f415178c;
        int i18 = this.f415185j;
        java.util.ArrayList anchors = this.f415179d;
        n0.k4 k4Var = this.f415176a;
        k4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groups, "groups");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchors, "anchors");
        if (!k4Var.f415128i) {
            throw new java.lang.IllegalArgumentException("Unexpected writer close()".toString());
        }
        k4Var.f415128i = false;
        k4Var.f415123d = groups;
        k4Var.f415124e = i17;
        k4Var.f415125f = slots;
        k4Var.f415126g = i18;
        k4Var.f415130n = anchors;
    }

    public final int f(int[] iArr, int i17) {
        if (i17 >= this.f415177b.length / 5) {
            return this.f415178c.length - this.f415186k;
        }
        int i18 = iArr[(i17 * 5) + 4];
        return i18 < 0 ? (this.f415178c.length - this.f415186k) + i18 + 1 : i18;
    }

    public final int g(int i17) {
        return i17 < this.f415185j ? i17 : i17 + this.f415186k;
    }

    public final int h() {
        boolean z17 = this.f415188m > 0;
        int i17 = this.f415193r;
        int i18 = this.f415182g;
        int i19 = this.f415194s;
        int m17 = m(i19);
        int i27 = this.f415189n;
        int i28 = i17 - i19;
        boolean f17 = n0.l4.f(this.f415177b, m17);
        n0.h2 h2Var = this.f415192q;
        if (z17) {
            n0.l4.k(this.f415177b, m17, i28);
            n0.l4.l(this.f415177b, m17, i27);
            this.f415189n = h2Var.a() + (f17 ? 1 : i27);
            this.f415194s = x(this.f415177b, i19);
        } else {
            if ((i17 != i18 ? 0 : 1) == 0) {
                throw new java.lang.IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            int c17 = n0.l4.c(this.f415177b, m17);
            int h17 = n0.l4.h(this.f415177b, m17);
            n0.l4.k(this.f415177b, m17, i28);
            n0.l4.l(this.f415177b, m17, i27);
            int a17 = this.f415190o.a();
            this.f415182g = ((this.f415177b.length / 5) - this.f415181f) - this.f415191p.a();
            this.f415194s = a17;
            int x17 = x(this.f415177b, i19);
            int a18 = h2Var.a();
            this.f415189n = a18;
            if (x17 == a17) {
                this.f415189n = a18 + (f17 ? 0 : i27 - h17);
            } else {
                int i29 = i28 - c17;
                int i37 = f17 ? 0 : i27 - h17;
                if (i29 != 0 || i37 != 0) {
                    while (x17 != 0 && x17 != a17 && (i37 != 0 || i29 != 0)) {
                        int m18 = m(x17);
                        if (i29 != 0) {
                            n0.l4.k(this.f415177b, m18, n0.l4.c(this.f415177b, m18) + i29);
                        }
                        if (i37 != 0) {
                            int[] iArr = this.f415177b;
                            n0.l4.l(iArr, m18, n0.l4.h(iArr, m18) + i37);
                        }
                        if (n0.l4.f(this.f415177b, m18)) {
                            i37 = 0;
                        }
                        x17 = x(this.f415177b, x17);
                    }
                }
                this.f415189n += i37;
            }
        }
        return i27;
    }

    public final void i() {
        int i17 = this.f415188m;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i18 = i17 - 1;
        this.f415188m = i18;
        if (i18 == 0) {
            if (this.f415192q.f415060b == this.f415190o.f415060b) {
                this.f415182g = ((this.f415177b.length / 5) - this.f415181f) - this.f415191p.a();
            } else {
                n0.e1.c("startGroup/endGroup mismatch while inserting".toString());
                throw null;
            }
        }
    }

    public final void j(int i17) {
        if (!(this.f415188m <= 0)) {
            throw new java.lang.IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i18 = this.f415194s;
        if (i18 != i17) {
            if (!(i17 >= i18 && i17 < this.f415182g)) {
                throw new java.lang.IllegalArgumentException(("Started group at " + i17 + " must be a subgroup of the group at " + i18).toString());
            }
            int i19 = this.f415193r;
            int i27 = this.f415183h;
            int i28 = this.f415184i;
            this.f415193r = i17;
            H();
            this.f415193r = i19;
            this.f415183h = i27;
            this.f415184i = i28;
        }
    }

    public final void k(int i17, int i18, int i19) {
        if (i17 >= this.f415180e) {
            i17 = -((l() - i17) + 2);
        }
        while (i19 < i18) {
            this.f415177b[(m(i19) * 5) + 2] = i17;
            int c17 = n0.l4.c(this.f415177b, m(i19)) + i19;
            k(i19, c17, i19 + 1);
            i19 = c17;
        }
    }

    public final int l() {
        return (this.f415177b.length / 5) - this.f415181f;
    }

    public final int m(int i17) {
        return i17 < this.f415180e ? i17 : i17 + this.f415181f;
    }

    public final int n(int i17) {
        return n0.l4.c(this.f415177b, m(i17));
    }

    public final boolean o(int i17, int i18) {
        int length;
        int n17;
        if (i18 == this.f415194s) {
            length = this.f415182g;
        } else {
            n0.h2 h2Var = this.f415190o;
            int i19 = h2Var.f415060b;
            if (i18 > (i19 > 0 ? h2Var.f415059a[i19 - 1] : 0)) {
                n17 = n(i18);
            } else {
                int i27 = 0;
                while (true) {
                    if (i27 >= i19) {
                        i27 = -1;
                        break;
                    }
                    if (h2Var.f415059a[i27] == i18) {
                        break;
                    }
                    i27++;
                }
                if (i27 < 0) {
                    n17 = n(i18);
                } else {
                    length = ((this.f415177b.length / 5) - this.f415181f) - this.f415191p.f415059a[i27];
                }
            }
            length = n17 + i18;
        }
        return i17 > i18 && i17 < length;
    }

    public final void p(int i17) {
        if (i17 > 0) {
            int i18 = this.f415193r;
            t(i18);
            int i19 = this.f415180e;
            int i27 = this.f415181f;
            int[] iArr = this.f415177b;
            int length = iArr.length / 5;
            int i28 = length - i27;
            if (i27 < i17) {
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i28 + i17), 32);
                int[] iArr2 = new int[max * 5];
                int i29 = max - i28;
                kz5.v.j(iArr, iArr2, 0, 0, i19 * 5);
                kz5.v.j(iArr, iArr2, (i19 + i29) * 5, (i27 + i19) * 5, length * 5);
                this.f415177b = iArr2;
                i27 = i29;
            }
            int i37 = this.f415182g;
            if (i37 >= i19) {
                this.f415182g = i37 + i17;
            }
            int i38 = i19 + i17;
            this.f415180e = i38;
            this.f415181f = i27 - i17;
            int f17 = i28 > 0 ? f(this.f415177b, m(i18 + i17)) : 0;
            int i39 = this.f415187l >= i19 ? this.f415185j : 0;
            int i47 = this.f415186k;
            int length2 = this.f415178c.length;
            if (f17 > i39) {
                f17 = -(((length2 - i47) - f17) + 1);
            }
            for (int i48 = i19; i48 < i38; i48++) {
                this.f415177b[(i48 * 5) + 4] = f17;
            }
            int i49 = this.f415187l;
            if (i49 >= i19) {
                this.f415187l = i49 + i17;
            }
        }
    }

    public final void q(int i17, int i18) {
        if (i17 > 0) {
            u(this.f415183h, i18);
            int i19 = this.f415185j;
            int i27 = this.f415186k;
            if (i27 < i17) {
                java.lang.Object[] objArr = this.f415178c;
                int length = objArr.length;
                int i28 = length - i27;
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i28 + i17), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[max];
                for (int i29 = 0; i29 < max; i29++) {
                    objArr2[i29] = null;
                }
                int i37 = max - i28;
                kz5.v.k(objArr, objArr2, 0, 0, i19);
                kz5.v.k(objArr, objArr2, i19 + i37, i27 + i19, length);
                this.f415178c = objArr2;
                i27 = i37;
            }
            int i38 = this.f415184i;
            if (i38 >= i19) {
                this.f415184i = i38 + i17;
            }
            this.f415185j = i19 + i17;
            this.f415186k = i27 - i17;
        }
    }

    public final boolean r(int i17) {
        return n0.l4.f(this.f415177b, m(i17));
    }

    public final java.util.List s(n0.k4 table, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        if (!(this.f415188m > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (i17 != 0 || this.f415193r != 0 || this.f415176a.f415124e != 0) {
            n0.o4 j17 = table.j();
            try {
                return n0.m4.a(f415175v, j17, i17, this, true, true);
            } finally {
                j17.e();
            }
        }
        int[] groups = this.f415177b;
        java.lang.Object[] slots = this.f415178c;
        java.util.ArrayList anchors = this.f415179d;
        int[] iArr = table.f415123d;
        int i18 = table.f415124e;
        java.lang.Object[] objArr = table.f415125f;
        int i19 = table.f415126g;
        this.f415177b = iArr;
        this.f415178c = objArr;
        this.f415179d = table.f415130n;
        this.f415180e = i18;
        this.f415181f = (iArr.length / 5) - i18;
        this.f415185j = i19;
        this.f415186k = objArr.length - i19;
        this.f415187l = i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groups, "groups");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slots, "slots");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchors, "anchors");
        table.f415123d = groups;
        table.f415124e = 0;
        table.f415125f = slots;
        table.f415126g = 0;
        table.f415130n = anchors;
        return this.f415179d;
    }

    public final void t(int i17) {
        int i18;
        int i19 = this.f415181f;
        int i27 = this.f415180e;
        if (i27 != i17) {
            if (!this.f415179d.isEmpty()) {
                int length = (this.f415177b.length / 5) - this.f415181f;
                if (i27 >= i17) {
                    for (int g17 = n0.l4.g(this.f415179d, i17, length); g17 < this.f415179d.size(); g17++) {
                        java.lang.Object obj = this.f415179d.get(g17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "anchors[index]");
                        n0.d dVar = (n0.d) obj;
                        int i28 = dVar.f415010a;
                        if (i28 < 0) {
                            break;
                        }
                        dVar.f415010a = -(length - i28);
                    }
                } else {
                    for (int g18 = n0.l4.g(this.f415179d, i27, length); g18 < this.f415179d.size(); g18++) {
                        java.lang.Object obj2 = this.f415179d.get(g18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "anchors[index]");
                        n0.d dVar2 = (n0.d) obj2;
                        int i29 = dVar2.f415010a;
                        if (i29 >= 0 || (i18 = i29 + length) >= i17) {
                            break;
                        }
                        dVar2.f415010a = i18;
                    }
                }
            }
            if (i19 > 0) {
                int[] iArr = this.f415177b;
                int i37 = i17 * 5;
                int i38 = i19 * 5;
                int i39 = i27 * 5;
                if (i17 < i27) {
                    kz5.v.j(iArr, iArr, i38 + i37, i37, i39);
                } else {
                    kz5.v.j(iArr, iArr, i39, i39 + i38, i37 + i38);
                }
            }
            if (i17 < i27) {
                i27 = i17 + i19;
            }
            int length2 = this.f415177b.length / 5;
            n0.e1.f(i27 < length2);
            while (i27 < length2) {
                int i47 = (i27 * 5) + 2;
                int i48 = this.f415177b[i47];
                int l17 = i48 > -2 ? i48 : l() + i48 + 2;
                if (l17 >= i17) {
                    l17 = -((l() - l17) + 2);
                }
                if (l17 != i48) {
                    this.f415177b[i47] = l17;
                }
                i27++;
                if (i27 == i17) {
                    i27 += i19;
                }
            }
        }
        this.f415180e = i17;
    }

    /* renamed from: toString */
    public java.lang.String m148746x9616526c() {
        return "SlotWriter(current = " + this.f415193r + " end=" + this.f415182g + " size = " + l() + " gap=" + this.f415180e + '-' + (this.f415180e + this.f415181f) + ')';
    }

    public final void u(int i17, int i18) {
        int i19 = this.f415186k;
        int i27 = this.f415185j;
        int i28 = this.f415187l;
        if (i27 != i17) {
            java.lang.Object[] objArr = this.f415178c;
            if (i17 < i27) {
                kz5.v.k(objArr, objArr, i17 + i19, i17, i27);
            } else {
                kz5.v.k(objArr, objArr, i27, i27 + i19, i17 + i19);
            }
            kz5.v.t(objArr, null, i17, i17 + i19);
        }
        int min = java.lang.Math.min(i18 + 1, l());
        if (i28 != min) {
            int length = this.f415178c.length - i19;
            if (min < i28) {
                int m17 = m(min);
                int m18 = m(i28);
                int i29 = this.f415180e;
                while (m17 < m18) {
                    int b17 = n0.l4.b(this.f415177b, m17);
                    if (!(b17 >= 0)) {
                        n0.e1.c("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    this.f415177b[(m17 * 5) + 4] = -((length - b17) + 1);
                    m17++;
                    if (m17 == i29) {
                        m17 += this.f415181f;
                    }
                }
            } else {
                int m19 = m(i28);
                int m27 = m(min);
                while (m19 < m27) {
                    int b18 = n0.l4.b(this.f415177b, m19);
                    if (!(b18 < 0)) {
                        n0.e1.c("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    this.f415177b[(m19 * 5) + 4] = b18 + length + 1;
                    m19++;
                    if (m19 == this.f415180e) {
                        m19 += this.f415181f;
                    }
                }
            }
            this.f415187l = min;
        }
        this.f415185j = i17;
    }

    public final java.lang.Object v(int i17) {
        int m17 = m(i17);
        if (n0.l4.f(this.f415177b, m17)) {
            return this.f415178c[g(f(this.f415177b, m17))];
        }
        return null;
    }

    public final int w(int i17) {
        return x(this.f415177b, i17);
    }

    public final int x(int[] iArr, int i17) {
        int i18 = iArr[(m(i17) * 5) + 2];
        return i18 > -2 ? i18 : l() + i18 + 2;
    }

    public final void y() {
        boolean z17;
        n0.e3 e3Var = this.f415196u;
        if (e3Var != null) {
            while (!e3Var.f415034a.isEmpty()) {
                int b17 = e3Var.b();
                int m17 = m(b17);
                int i17 = b17 + 1;
                int n17 = n(b17) + b17;
                while (true) {
                    if (i17 >= n17) {
                        z17 = false;
                        break;
                    }
                    if ((this.f415177b[(m(i17) * 5) + 1] & 201326592) != 0) {
                        z17 = true;
                        break;
                    }
                    i17 += n(i17);
                }
                if (n0.l4.a(this.f415177b, m17) != z17) {
                    int[] iArr = this.f415177b;
                    int i18 = (m17 * 5) + 1;
                    if (z17) {
                        iArr[i18] = iArr[i18] | 67108864;
                    } else {
                        iArr[i18] = iArr[i18] & (-67108865);
                    }
                    int w17 = w(b17);
                    if (w17 >= 0) {
                        e3Var.a(w17);
                    }
                }
            }
        }
    }

    public final boolean z() {
        if (!(this.f415188m == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot remove group while inserting".toString());
        }
        int i17 = this.f415193r;
        int i18 = this.f415183h;
        int D = D();
        n0.e3 e3Var = this.f415196u;
        if (e3Var != null) {
            while (true) {
                java.util.List list = e3Var.f415034a;
                if (!(!list.isEmpty()) || ((java.lang.Number) kz5.n0.X(list)).intValue() < i17) {
                    break;
                }
                e3Var.b();
            }
        }
        boolean A = A(i17, this.f415193r - i17);
        B(i18, this.f415183h - i18, i17 - 1);
        this.f415193r = i17;
        this.f415183h = i18;
        this.f415189n -= D;
        return A;
    }
}
