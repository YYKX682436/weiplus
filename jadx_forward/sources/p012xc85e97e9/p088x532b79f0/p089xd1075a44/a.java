package p012xc85e97e9.p088x532b79f0.p089xd1075a44;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f93086a;

    /* renamed from: d, reason: collision with root package name */
    public x3.q f93089d;

    /* renamed from: f, reason: collision with root package name */
    public x3.q f93091f;

    /* renamed from: h, reason: collision with root package name */
    public x3.q f93093h;

    /* renamed from: j, reason: collision with root package name */
    public int[] f93095j;

    /* renamed from: l, reason: collision with root package name */
    public int[] f93097l;

    /* renamed from: n, reason: collision with root package name */
    public x3.k[] f93099n;

    /* renamed from: p, reason: collision with root package name */
    public int[] f93101p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f93103r;

    /* renamed from: t, reason: collision with root package name */
    public int[] f93105t;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 f93109x;

    /* renamed from: b, reason: collision with root package name */
    public int f93087b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f93088c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93090e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93092g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93094i = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93096k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93098m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93100o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93102q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f93104s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93106u = true;

    /* renamed from: v, reason: collision with root package name */
    public final x3.p f93107v = new x3.p(0);

    /* renamed from: w, reason: collision with root package name */
    public final x3.p f93108w = new x3.p(-100000);

    public a(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230, boolean z17) {
        this.f93109x = c1110x93624230;
        this.f93086a = z17;
    }

    public final java.lang.String a(java.util.List list) {
        java.lang.StringBuilder sb6;
        java.lang.String str = this.f93086a ? "x" : "y";
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            x3.k kVar = (x3.k) it.next();
            if (z17) {
                z17 = false;
            } else {
                sb7.append(", ");
            }
            x3.o oVar = kVar.f533105a;
            int i17 = oVar.f533118a;
            int i18 = oVar.f533119b;
            int i19 = kVar.f533106b.f533120a;
            if (i17 < i18) {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(i18);
                sb6.append("-");
                sb6.append(str);
                sb6.append(i17);
                sb6.append(">=");
            } else {
                sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(i17);
                sb6.append("-");
                sb6.append(str);
                sb6.append(i18);
                sb6.append("<=");
                i19 = -i19;
            }
            sb6.append(i19);
            sb7.append(sb6.toString());
        }
        return sb7.toString();
    }

    public final void b(x3.q qVar, boolean z17) {
        for (x3.p pVar : (x3.p[]) qVar.f533123c) {
            pVar.f533120a = Integer.MIN_VALUE;
        }
        x3.n[] nVarArr = (x3.n[]) g().f533123c;
        for (int i17 = 0; i17 < nVarArr.length; i17++) {
            int d17 = nVarArr[i17].d(z17);
            x3.p pVar2 = (x3.p) qVar.f533123c[qVar.f533121a[i17]];
            int i18 = pVar2.f533120a;
            if (!z17) {
                d17 = -d17;
            }
            pVar2.f533120a = java.lang.Math.max(i18, d17);
        }
    }

    public final void c(boolean z17) {
        int[] iArr = z17 ? this.f93095j : this.f93097l;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this.f93109x;
        int childCount = c1110x93624230.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1110x93624230.getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c1110x93624230.getClass();
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                boolean z18 = this.f93086a;
                x3.o oVar = (z18 ? layoutParams.f93085b : layoutParams.f93084a).f533126b;
                int i18 = z17 ? oVar.f533118a : oVar.f533119b;
                iArr[i18] = java.lang.Math.max(iArr[i18], c1110x93624230.f(childAt, z18, z17));
            }
        }
    }

    public final x3.q d(boolean z17) {
        x3.o oVar;
        x3.l lVar = new x3.l(x3.o.class, x3.p.class);
        x3.r[] rVarArr = (x3.r[]) g().f533122b;
        int length = rVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (z17) {
                oVar = rVarArr[i17].f533126b;
            } else {
                x3.o oVar2 = rVarArr[i17].f533126b;
                oVar = new x3.o(oVar2.f533119b, oVar2.f533118a);
            }
            lVar.add(android.util.Pair.create(oVar, new x3.p()));
        }
        return lVar.d();
    }

    public x3.k[] e() {
        if (this.f93099n == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (this.f93091f == null) {
                this.f93091f = d(true);
            }
            if (!this.f93092g) {
                b(this.f93091f, true);
                this.f93092g = true;
            }
            x3.q qVar = this.f93091f;
            int i17 = 0;
            while (true) {
                x3.o[] oVarArr = (x3.o[]) qVar.f533122b;
                if (i17 >= oVarArr.length) {
                    break;
                }
                k(arrayList, oVarArr[i17], ((x3.p[]) qVar.f533123c)[i17], false);
                i17++;
            }
            if (this.f93093h == null) {
                this.f93093h = d(false);
            }
            if (!this.f93094i) {
                b(this.f93093h, false);
                this.f93094i = true;
            }
            x3.q qVar2 = this.f93093h;
            int i18 = 0;
            while (true) {
                x3.o[] oVarArr2 = (x3.o[]) qVar2.f533122b;
                if (i18 >= oVarArr2.length) {
                    break;
                }
                k(arrayList2, oVarArr2[i18], ((x3.p[]) qVar2.f533123c)[i18], false);
                i18++;
            }
            if (this.f93106u) {
                int i19 = 0;
                while (i19 < f()) {
                    int i27 = i19 + 1;
                    k(arrayList, new x3.o(i19, i27), new x3.p(0), true);
                    i19 = i27;
                }
            }
            int f17 = f();
            k(arrayList, new x3.o(0, f17), this.f93107v, false);
            k(arrayList2, new x3.o(f17, 0), this.f93108w, false);
            x3.k[] q17 = q(arrayList);
            x3.k[] q18 = q(arrayList2);
            android.util.Printer printer = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93063o;
            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(q17.getClass().getComponentType(), q17.length + q18.length);
            java.lang.System.arraycopy(q17, 0, objArr, 0, q17.length);
            java.lang.System.arraycopy(q18, 0, objArr, q17.length, q18.length);
            this.f93099n = (x3.k[]) objArr;
        }
        if (!this.f93100o) {
            if (this.f93091f == null) {
                this.f93091f = d(true);
            }
            if (!this.f93092g) {
                b(this.f93091f, true);
                this.f93092g = true;
            }
            if (this.f93093h == null) {
                this.f93093h = d(false);
            }
            if (!this.f93094i) {
                b(this.f93093h, false);
                this.f93094i = true;
            }
            this.f93100o = true;
        }
        return this.f93099n;
    }

    public int f() {
        return java.lang.Math.max(this.f93087b, i());
    }

    public x3.q g() {
        int i17;
        x3.q qVar = this.f93089d;
        boolean z17 = this.f93086a;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this.f93109x;
        if (qVar == null) {
            x3.l lVar = new x3.l(x3.r.class, x3.n.class);
            int childCount = c1110x93624230.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) c1110x93624230.getChildAt(i18).getLayoutParams();
                x3.r rVar = z17 ? layoutParams.f93085b : layoutParams.f93084a;
                lVar.add(android.util.Pair.create(rVar, rVar.a(z17).b()));
            }
            this.f93089d = lVar.d();
        }
        if (!this.f93090e) {
            for (x3.n nVar : (x3.n[]) this.f93089d.f533123c) {
                nVar.c();
            }
            int childCount2 = c1110x93624230.getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                android.view.View childAt = c1110x93624230.getChildAt(i19);
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams2 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                x3.r rVar2 = z17 ? layoutParams2.f93085b : layoutParams2.f93084a;
                int measuredWidth = childAt.getVisibility() == 8 ? 0 : (z17 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight()) + c1110x93624230.e(childAt, z17, true) + c1110x93624230.e(childAt, z17, false);
                if (rVar2.f533128d == 0.0f) {
                    i17 = 0;
                } else {
                    if (this.f93105t == null) {
                        this.f93105t = new int[c1110x93624230.getChildCount()];
                    }
                    i17 = this.f93105t[i19];
                }
                int i27 = measuredWidth + i17;
                x3.q qVar2 = this.f93089d;
                x3.n nVar2 = (x3.n) qVar2.f533123c[qVar2.f533121a[i19]];
                nVar2.f533117c = ((rVar2.f533127c == p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.f93071w && rVar2.f533128d == 0.0f) ? 0 : 2) & nVar2.f533117c;
                int a17 = rVar2.a(z17).a(childAt, i27, n3.p1.a(c1110x93624230));
                nVar2.b(a17, i27 - a17);
            }
            this.f93090e = true;
        }
        return this.f93089d;
    }

    public int[] h() {
        boolean z17;
        if (this.f93101p == null) {
            this.f93101p = new int[f() + 1];
        }
        if (!this.f93102q) {
            int[] iArr = this.f93101p;
            boolean z18 = this.f93104s;
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this.f93109x;
            float f17 = 0.0f;
            boolean z19 = this.f93086a;
            if (!z18) {
                int childCount = c1110x93624230.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount) {
                        z17 = false;
                        break;
                    }
                    android.view.View childAt = c1110x93624230.getChildAt(i17);
                    if (childAt.getVisibility() != 8) {
                        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                        if ((z19 ? layoutParams.f93085b : layoutParams.f93084a).f533128d != 0.0f) {
                            z17 = true;
                            break;
                        }
                    }
                    i17++;
                }
                this.f93103r = z17;
                this.f93104s = true;
            }
            if (this.f93103r) {
                if (this.f93105t == null) {
                    this.f93105t = new int[c1110x93624230.getChildCount()];
                }
                java.util.Arrays.fill(this.f93105t, 0);
                p(e(), iArr, true);
                int childCount2 = (this.f93107v.f533120a * c1110x93624230.getChildCount()) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = c1110x93624230.getChildCount();
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        android.view.View childAt2 = c1110x93624230.getChildAt(i18);
                        if (childAt2.getVisibility() != 8) {
                            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams2 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt2.getLayoutParams();
                            f17 += (z19 ? layoutParams2.f93085b : layoutParams2.f93084a).f533128d;
                        }
                    }
                    int i19 = -1;
                    boolean z27 = true;
                    int i27 = 0;
                    while (i27 < childCount2) {
                        int i28 = (int) ((i27 + childCount2) / 2);
                        m();
                        o(i28, f17);
                        boolean p17 = p(e(), iArr, false);
                        if (p17) {
                            i27 = i28 + 1;
                            i19 = i28;
                        } else {
                            childCount2 = i28;
                        }
                        z27 = p17;
                    }
                    if (i19 > 0 && !z27) {
                        m();
                        o(i19, f17);
                        p(e(), iArr, true);
                    }
                }
            } else {
                p(e(), iArr, true);
            }
            if (!this.f93106u) {
                int i29 = iArr[0];
                int length = iArr.length;
                for (int i37 = 0; i37 < length; i37++) {
                    iArr[i37] = iArr[i37] - i29;
                }
            }
            this.f93102q = true;
        }
        return this.f93101p;
    }

    public final int i() {
        if (this.f93088c == Integer.MIN_VALUE) {
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this.f93109x;
            int childCount = c1110x93624230.getChildCount();
            int i17 = -1;
            for (int i18 = 0; i18 < childCount; i18++) {
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) c1110x93624230.getChildAt(i18).getLayoutParams();
                x3.o oVar = (this.f93086a ? layoutParams.f93085b : layoutParams.f93084a).f533126b;
                int max = java.lang.Math.max(i17, oVar.f533118a);
                int i19 = oVar.f533119b;
                i17 = java.lang.Math.max(java.lang.Math.max(max, i19), i19 - oVar.f533118a);
            }
            this.f93088c = java.lang.Math.max(0, i17 != -1 ? i17 : Integer.MIN_VALUE);
        }
        return this.f93088c;
    }

    public int j(int i17) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        x3.p pVar = this.f93108w;
        x3.p pVar2 = this.f93107v;
        if (mode == Integer.MIN_VALUE) {
            pVar2.f533120a = 0;
            pVar.f533120a = -size;
            this.f93102q = false;
            return h()[f()];
        }
        if (mode == 0) {
            pVar2.f533120a = 0;
            pVar.f533120a = -100000;
            this.f93102q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        pVar2.f533120a = size;
        pVar.f533120a = -size;
        this.f93102q = false;
        return h()[f()];
    }

    public final void k(java.util.List list, x3.o oVar, x3.p pVar, boolean z17) {
        if (oVar.f533119b - oVar.f533118a == 0) {
            return;
        }
        if (z17) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((x3.k) it.next()).f533105a.m174932xb2c87fbf(oVar)) {
                    return;
                }
            }
        }
        list.add(new x3.k(oVar, pVar));
    }

    public void l() {
        this.f93088c = Integer.MIN_VALUE;
        this.f93089d = null;
        this.f93091f = null;
        this.f93093h = null;
        this.f93095j = null;
        this.f93097l = null;
        this.f93099n = null;
        this.f93101p = null;
        this.f93105t = null;
        this.f93104s = false;
        m();
    }

    public void m() {
        this.f93090e = false;
        this.f93092g = false;
        this.f93094i = false;
        this.f93096k = false;
        this.f93098m = false;
        this.f93100o = false;
        this.f93102q = false;
    }

    public void n(int i17) {
        if (i17 == Integer.MIN_VALUE || i17 >= i()) {
            this.f93087b = i17;
        } else {
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.g((this.f93086a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(int i17, float f17) {
        java.util.Arrays.fill(this.f93105t, 0);
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this.f93109x;
        int childCount = c1110x93624230.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = c1110x93624230.getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c1110x93624230.getClass();
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                float f18 = (this.f93086a ? layoutParams.f93085b : layoutParams.f93084a).f533128d;
                if (f18 != 0.0f) {
                    int round = java.lang.Math.round((i17 * f18) / f17);
                    this.f93105t[i18] = round;
                    i17 -= round;
                    f17 -= f18;
                }
            }
        }
    }

    public final boolean p(x3.k[] kVarArr, int[] iArr, boolean z17) {
        boolean z18;
        boolean z19;
        java.lang.String str = this.f93086a ? "horizontal" : "vertical";
        boolean z27 = true;
        int f17 = f() + 1;
        boolean[] zArr = null;
        int i17 = 0;
        while (i17 < kVarArr.length) {
            java.util.Arrays.fill(iArr, 0);
            for (int i18 = 0; i18 < f17; i18++) {
                boolean z28 = false;
                for (x3.k kVar : kVarArr) {
                    if (kVar.f533107c) {
                        x3.o oVar = kVar.f533105a;
                        int i19 = iArr[oVar.f533118a] + kVar.f533106b.f533120a;
                        int i27 = oVar.f533119b;
                        if (i19 > iArr[i27]) {
                            iArr[i27] = i19;
                            z19 = z27;
                            z28 |= z19;
                        }
                    }
                    z19 = false;
                    z28 |= z19;
                }
                if (!z28) {
                    if (zArr != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (int i28 = 0; i28 < kVarArr.length; i28++) {
                            x3.k kVar2 = kVarArr[i28];
                            if (zArr[i28]) {
                                arrayList.add(kVar2);
                            }
                            if (!kVar2.f533107c) {
                                arrayList2.add(kVar2);
                            }
                        }
                        this.f93109x.f93082n.println(str + " constraints: " + a(arrayList) + " are inconsistent; permanently removing: " + a(arrayList2) + ". ");
                    }
                    return z27;
                }
            }
            if (!z17) {
                return false;
            }
            boolean[] zArr2 = new boolean[kVarArr.length];
            for (int i29 = 0; i29 < f17; i29++) {
                int length = kVarArr.length;
                for (int i37 = 0; i37 < length; i37++) {
                    boolean z29 = zArr2[i37];
                    x3.k kVar3 = kVarArr[i37];
                    if (kVar3.f533107c) {
                        x3.o oVar2 = kVar3.f533105a;
                        int i38 = iArr[oVar2.f533118a] + kVar3.f533106b.f533120a;
                        int i39 = oVar2.f533119b;
                        if (i38 > iArr[i39]) {
                            iArr[i39] = i38;
                            z18 = true;
                            zArr2[i37] = z18 | z29;
                        }
                    }
                    z18 = false;
                    zArr2[i37] = z18 | z29;
                }
            }
            if (i17 == 0) {
                zArr = zArr2;
            }
            int i47 = 0;
            while (true) {
                if (i47 >= kVarArr.length) {
                    break;
                }
                if (zArr2[i47]) {
                    x3.k kVar4 = kVarArr[i47];
                    x3.o oVar3 = kVar4.f533105a;
                    if (oVar3.f533118a >= oVar3.f533119b) {
                        kVar4.f533107c = false;
                        break;
                    }
                }
                i47++;
            }
            i17++;
            z27 = true;
        }
        return z27;
    }

    public final x3.k[] q(java.util.List list) {
        x3.m mVar = new x3.m(this, (x3.k[]) list.toArray(new x3.k[list.size()]));
        int length = mVar.f533112c.length;
        for (int i17 = 0; i17 < length; i17++) {
            mVar.a(i17);
        }
        return mVar.f533110a;
    }
}
