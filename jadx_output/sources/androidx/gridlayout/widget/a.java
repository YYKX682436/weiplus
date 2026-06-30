package androidx.gridlayout.widget;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11553a;

    /* renamed from: d, reason: collision with root package name */
    public x3.q f11556d;

    /* renamed from: f, reason: collision with root package name */
    public x3.q f11558f;

    /* renamed from: h, reason: collision with root package name */
    public x3.q f11560h;

    /* renamed from: j, reason: collision with root package name */
    public int[] f11562j;

    /* renamed from: l, reason: collision with root package name */
    public int[] f11564l;

    /* renamed from: n, reason: collision with root package name */
    public x3.k[] f11566n;

    /* renamed from: p, reason: collision with root package name */
    public int[] f11568p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11570r;

    /* renamed from: t, reason: collision with root package name */
    public int[] f11572t;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.gridlayout.widget.GridLayout f11576x;

    /* renamed from: b, reason: collision with root package name */
    public int f11554b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f11555c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11557e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11559g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11561i = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11563k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11565m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11567o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11569q = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11571s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11573u = true;

    /* renamed from: v, reason: collision with root package name */
    public final x3.p f11574v = new x3.p(0);

    /* renamed from: w, reason: collision with root package name */
    public final x3.p f11575w = new x3.p(-100000);

    public a(androidx.gridlayout.widget.GridLayout gridLayout, boolean z17) {
        this.f11576x = gridLayout;
        this.f11553a = z17;
    }

    public final java.lang.String a(java.util.List list) {
        java.lang.StringBuilder sb6;
        java.lang.String str = this.f11553a ? "x" : "y";
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
            x3.o oVar = kVar.f451572a;
            int i17 = oVar.f451585a;
            int i18 = oVar.f451586b;
            int i19 = kVar.f451573b.f451587a;
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
        for (x3.p pVar : (x3.p[]) qVar.f451590c) {
            pVar.f451587a = Integer.MIN_VALUE;
        }
        x3.n[] nVarArr = (x3.n[]) g().f451590c;
        for (int i17 = 0; i17 < nVarArr.length; i17++) {
            int d17 = nVarArr[i17].d(z17);
            x3.p pVar2 = (x3.p) qVar.f451590c[qVar.f451588a[i17]];
            int i18 = pVar2.f451587a;
            if (!z17) {
                d17 = -d17;
            }
            pVar2.f451587a = java.lang.Math.max(i18, d17);
        }
    }

    public final void c(boolean z17) {
        int[] iArr = z17 ? this.f11562j : this.f11564l;
        androidx.gridlayout.widget.GridLayout gridLayout = this.f11576x;
        int childCount = gridLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = gridLayout.getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                gridLayout.getClass();
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                boolean z18 = this.f11553a;
                x3.o oVar = (z18 ? layoutParams.f11552b : layoutParams.f11551a).f451593b;
                int i18 = z17 ? oVar.f451585a : oVar.f451586b;
                iArr[i18] = java.lang.Math.max(iArr[i18], gridLayout.f(childAt, z18, z17));
            }
        }
    }

    public final x3.q d(boolean z17) {
        x3.o oVar;
        x3.l lVar = new x3.l(x3.o.class, x3.p.class);
        x3.r[] rVarArr = (x3.r[]) g().f451589b;
        int length = rVarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (z17) {
                oVar = rVarArr[i17].f451593b;
            } else {
                x3.o oVar2 = rVarArr[i17].f451593b;
                oVar = new x3.o(oVar2.f451586b, oVar2.f451585a);
            }
            lVar.add(android.util.Pair.create(oVar, new x3.p()));
        }
        return lVar.d();
    }

    public x3.k[] e() {
        if (this.f11566n == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (this.f11558f == null) {
                this.f11558f = d(true);
            }
            if (!this.f11559g) {
                b(this.f11558f, true);
                this.f11559g = true;
            }
            x3.q qVar = this.f11558f;
            int i17 = 0;
            while (true) {
                x3.o[] oVarArr = (x3.o[]) qVar.f451589b;
                if (i17 >= oVarArr.length) {
                    break;
                }
                k(arrayList, oVarArr[i17], ((x3.p[]) qVar.f451590c)[i17], false);
                i17++;
            }
            if (this.f11560h == null) {
                this.f11560h = d(false);
            }
            if (!this.f11561i) {
                b(this.f11560h, false);
                this.f11561i = true;
            }
            x3.q qVar2 = this.f11560h;
            int i18 = 0;
            while (true) {
                x3.o[] oVarArr2 = (x3.o[]) qVar2.f451589b;
                if (i18 >= oVarArr2.length) {
                    break;
                }
                k(arrayList2, oVarArr2[i18], ((x3.p[]) qVar2.f451590c)[i18], false);
                i18++;
            }
            if (this.f11573u) {
                int i19 = 0;
                while (i19 < f()) {
                    int i27 = i19 + 1;
                    k(arrayList, new x3.o(i19, i27), new x3.p(0), true);
                    i19 = i27;
                }
            }
            int f17 = f();
            k(arrayList, new x3.o(0, f17), this.f11574v, false);
            k(arrayList2, new x3.o(f17, 0), this.f11575w, false);
            x3.k[] q17 = q(arrayList);
            x3.k[] q18 = q(arrayList2);
            android.util.Printer printer = androidx.gridlayout.widget.GridLayout.f11530o;
            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(q17.getClass().getComponentType(), q17.length + q18.length);
            java.lang.System.arraycopy(q17, 0, objArr, 0, q17.length);
            java.lang.System.arraycopy(q18, 0, objArr, q17.length, q18.length);
            this.f11566n = (x3.k[]) objArr;
        }
        if (!this.f11567o) {
            if (this.f11558f == null) {
                this.f11558f = d(true);
            }
            if (!this.f11559g) {
                b(this.f11558f, true);
                this.f11559g = true;
            }
            if (this.f11560h == null) {
                this.f11560h = d(false);
            }
            if (!this.f11561i) {
                b(this.f11560h, false);
                this.f11561i = true;
            }
            this.f11567o = true;
        }
        return this.f11566n;
    }

    public int f() {
        return java.lang.Math.max(this.f11554b, i());
    }

    public x3.q g() {
        int i17;
        x3.q qVar = this.f11556d;
        boolean z17 = this.f11553a;
        androidx.gridlayout.widget.GridLayout gridLayout = this.f11576x;
        if (qVar == null) {
            x3.l lVar = new x3.l(x3.r.class, x3.n.class);
            int childCount = gridLayout.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) gridLayout.getChildAt(i18).getLayoutParams();
                x3.r rVar = z17 ? layoutParams.f11552b : layoutParams.f11551a;
                lVar.add(android.util.Pair.create(rVar, rVar.a(z17).b()));
            }
            this.f11556d = lVar.d();
        }
        if (!this.f11557e) {
            for (x3.n nVar : (x3.n[]) this.f11556d.f451590c) {
                nVar.c();
            }
            int childCount2 = gridLayout.getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                android.view.View childAt = gridLayout.getChildAt(i19);
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams2 = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                x3.r rVar2 = z17 ? layoutParams2.f11552b : layoutParams2.f11551a;
                int measuredWidth = childAt.getVisibility() == 8 ? 0 : (z17 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight()) + gridLayout.e(childAt, z17, true) + gridLayout.e(childAt, z17, false);
                if (rVar2.f451595d == 0.0f) {
                    i17 = 0;
                } else {
                    if (this.f11572t == null) {
                        this.f11572t = new int[gridLayout.getChildCount()];
                    }
                    i17 = this.f11572t[i19];
                }
                int i27 = measuredWidth + i17;
                x3.q qVar2 = this.f11556d;
                x3.n nVar2 = (x3.n) qVar2.f451590c[qVar2.f451588a[i19]];
                nVar2.f451584c = ((rVar2.f451594c == androidx.gridlayout.widget.GridLayout.f11538w && rVar2.f451595d == 0.0f) ? 0 : 2) & nVar2.f451584c;
                int a17 = rVar2.a(z17).a(childAt, i27, n3.p1.a(gridLayout));
                nVar2.b(a17, i27 - a17);
            }
            this.f11557e = true;
        }
        return this.f11556d;
    }

    public int[] h() {
        boolean z17;
        if (this.f11568p == null) {
            this.f11568p = new int[f() + 1];
        }
        if (!this.f11569q) {
            int[] iArr = this.f11568p;
            boolean z18 = this.f11571s;
            androidx.gridlayout.widget.GridLayout gridLayout = this.f11576x;
            float f17 = 0.0f;
            boolean z19 = this.f11553a;
            if (!z18) {
                int childCount = gridLayout.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 >= childCount) {
                        z17 = false;
                        break;
                    }
                    android.view.View childAt = gridLayout.getChildAt(i17);
                    if (childAt.getVisibility() != 8) {
                        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                        if ((z19 ? layoutParams.f11552b : layoutParams.f11551a).f451595d != 0.0f) {
                            z17 = true;
                            break;
                        }
                    }
                    i17++;
                }
                this.f11570r = z17;
                this.f11571s = true;
            }
            if (this.f11570r) {
                if (this.f11572t == null) {
                    this.f11572t = new int[gridLayout.getChildCount()];
                }
                java.util.Arrays.fill(this.f11572t, 0);
                p(e(), iArr, true);
                int childCount2 = (this.f11574v.f451587a * gridLayout.getChildCount()) + 1;
                if (childCount2 >= 2) {
                    int childCount3 = gridLayout.getChildCount();
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        android.view.View childAt2 = gridLayout.getChildAt(i18);
                        if (childAt2.getVisibility() != 8) {
                            androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams2 = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt2.getLayoutParams();
                            f17 += (z19 ? layoutParams2.f11552b : layoutParams2.f11551a).f451595d;
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
            if (!this.f11573u) {
                int i29 = iArr[0];
                int length = iArr.length;
                for (int i37 = 0; i37 < length; i37++) {
                    iArr[i37] = iArr[i37] - i29;
                }
            }
            this.f11569q = true;
        }
        return this.f11568p;
    }

    public final int i() {
        if (this.f11555c == Integer.MIN_VALUE) {
            androidx.gridlayout.widget.GridLayout gridLayout = this.f11576x;
            int childCount = gridLayout.getChildCount();
            int i17 = -1;
            for (int i18 = 0; i18 < childCount; i18++) {
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) gridLayout.getChildAt(i18).getLayoutParams();
                x3.o oVar = (this.f11553a ? layoutParams.f11552b : layoutParams.f11551a).f451593b;
                int max = java.lang.Math.max(i17, oVar.f451585a);
                int i19 = oVar.f451586b;
                i17 = java.lang.Math.max(java.lang.Math.max(max, i19), i19 - oVar.f451585a);
            }
            this.f11555c = java.lang.Math.max(0, i17 != -1 ? i17 : Integer.MIN_VALUE);
        }
        return this.f11555c;
    }

    public int j(int i17) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        x3.p pVar = this.f11575w;
        x3.p pVar2 = this.f11574v;
        if (mode == Integer.MIN_VALUE) {
            pVar2.f451587a = 0;
            pVar.f451587a = -size;
            this.f11569q = false;
            return h()[f()];
        }
        if (mode == 0) {
            pVar2.f451587a = 0;
            pVar.f451587a = -100000;
            this.f11569q = false;
            return h()[f()];
        }
        if (mode != 1073741824) {
            return 0;
        }
        pVar2.f451587a = size;
        pVar.f451587a = -size;
        this.f11569q = false;
        return h()[f()];
    }

    public final void k(java.util.List list, x3.o oVar, x3.p pVar, boolean z17) {
        if (oVar.f451586b - oVar.f451585a == 0) {
            return;
        }
        if (z17) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((x3.k) it.next()).f451572a.equals(oVar)) {
                    return;
                }
            }
        }
        list.add(new x3.k(oVar, pVar));
    }

    public void l() {
        this.f11555c = Integer.MIN_VALUE;
        this.f11556d = null;
        this.f11558f = null;
        this.f11560h = null;
        this.f11562j = null;
        this.f11564l = null;
        this.f11566n = null;
        this.f11568p = null;
        this.f11572t = null;
        this.f11571s = false;
        m();
    }

    public void m() {
        this.f11557e = false;
        this.f11559g = false;
        this.f11561i = false;
        this.f11563k = false;
        this.f11565m = false;
        this.f11567o = false;
        this.f11569q = false;
    }

    public void n(int i17) {
        if (i17 == Integer.MIN_VALUE || i17 >= i()) {
            this.f11554b = i17;
        } else {
            androidx.gridlayout.widget.GridLayout.g((this.f11553a ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            throw null;
        }
    }

    public final void o(int i17, float f17) {
        java.util.Arrays.fill(this.f11572t, 0);
        androidx.gridlayout.widget.GridLayout gridLayout = this.f11576x;
        int childCount = gridLayout.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = gridLayout.getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                gridLayout.getClass();
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                float f18 = (this.f11553a ? layoutParams.f11552b : layoutParams.f11551a).f451595d;
                if (f18 != 0.0f) {
                    int round = java.lang.Math.round((i17 * f18) / f17);
                    this.f11572t[i18] = round;
                    i17 -= round;
                    f17 -= f18;
                }
            }
        }
    }

    public final boolean p(x3.k[] kVarArr, int[] iArr, boolean z17) {
        boolean z18;
        boolean z19;
        java.lang.String str = this.f11553a ? "horizontal" : "vertical";
        boolean z27 = true;
        int f17 = f() + 1;
        boolean[] zArr = null;
        int i17 = 0;
        while (i17 < kVarArr.length) {
            java.util.Arrays.fill(iArr, 0);
            for (int i18 = 0; i18 < f17; i18++) {
                boolean z28 = false;
                for (x3.k kVar : kVarArr) {
                    if (kVar.f451574c) {
                        x3.o oVar = kVar.f451572a;
                        int i19 = iArr[oVar.f451585a] + kVar.f451573b.f451587a;
                        int i27 = oVar.f451586b;
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
                            if (!kVar2.f451574c) {
                                arrayList2.add(kVar2);
                            }
                        }
                        this.f11576x.f11549n.println(str + " constraints: " + a(arrayList) + " are inconsistent; permanently removing: " + a(arrayList2) + ". ");
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
                    if (kVar3.f451574c) {
                        x3.o oVar2 = kVar3.f451572a;
                        int i38 = iArr[oVar2.f451585a] + kVar3.f451573b.f451587a;
                        int i39 = oVar2.f451586b;
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
                    x3.o oVar3 = kVar4.f451572a;
                    if (oVar3.f451585a >= oVar3.f451586b) {
                        kVar4.f451574c = false;
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
        int length = mVar.f451579c.length;
        for (int i17 = 0; i17 < length; i17++) {
            mVar.a(i17);
        }
        return mVar.f451577a;
    }
}
