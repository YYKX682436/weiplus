package p012xc85e97e9.p088x532b79f0.p089xd1075a44;

/* renamed from: androidx.gridlayout.widget.GridLayout */
/* loaded from: classes15.dex */
public class C1110x93624230 extends android.view.ViewGroup {
    public static final x3.j A;
    public static final x3.j B;
    public static final x3.j C;
    public static final x3.j D;
    public static final x3.j E;
    public static final x3.j F;

    /* renamed from: o, reason: collision with root package name */
    public static final android.util.Printer f93063o = new android.util.LogPrinter(3, p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final android.util.Printer f93064p = new x3.a();

    /* renamed from: q, reason: collision with root package name */
    public static final int f93065q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f93066r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f93067s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f93068t = 6;

    /* renamed from: u, reason: collision with root package name */
    public static final int f93069u = 5;

    /* renamed from: v, reason: collision with root package name */
    public static final int f93070v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final x3.j f93071w = new x3.b();

    /* renamed from: x, reason: collision with root package name */
    public static final x3.j f93072x;

    /* renamed from: y, reason: collision with root package name */
    public static final x3.j f93073y;

    /* renamed from: z, reason: collision with root package name */
    public static final x3.j f93074z;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p088x532b79f0.p089xd1075a44.a f93075d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p088x532b79f0.p089xd1075a44.a f93076e;

    /* renamed from: f, reason: collision with root package name */
    public int f93077f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93078g;

    /* renamed from: h, reason: collision with root package name */
    public int f93079h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93080i;

    /* renamed from: m, reason: collision with root package name */
    public int f93081m;

    /* renamed from: n, reason: collision with root package name */
    public android.util.Printer f93082n;

    static {
        x3.c cVar = new x3.c();
        x3.d dVar = new x3.d();
        f93072x = cVar;
        f93073y = dVar;
        f93074z = cVar;
        A = dVar;
        B = new x3.e(cVar, dVar);
        C = new x3.e(dVar, cVar);
        D = new x3.f();
        E = new x3.h();
        F = new x3.i();
    }

    public C1110x93624230(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93075d = new p012xc85e97e9.p088x532b79f0.p089xd1075a44.a(this, true);
        this.f93076e = new p012xc85e97e9.p088x532b79f0.p089xd1075a44.a(this, false);
        this.f93077f = 0;
        this.f93078g = false;
        this.f93079h = 1;
        this.f93081m = 0;
        this.f93082n = f93063o;
        this.f93080i = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561794su);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f524190a);
        try {
            m7777x77a15dd7(obtainStyledAttributes.getInt(f93066r, Integer.MIN_VALUE));
            m7773x3ceded97(obtainStyledAttributes.getInt(f93067s, Integer.MIN_VALUE));
            m7775x1a6eb00e(obtainStyledAttributes.getInt(f93065q, 0));
            m7779x42440429(obtainStyledAttributes.getBoolean(f93068t, false));
            m7772xdb80c8e4(obtainStyledAttributes.getInt(0, 1));
            m7778x604ae022(obtainStyledAttributes.getBoolean(f93069u, true));
            m7774xdc40862(obtainStyledAttributes.getBoolean(f93070v, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static x3.j d(int i17, boolean z17) {
        int i18 = (i17 & (z17 ? 7 : 112)) >> (z17 ? 0 : 4);
        return i18 != 1 ? i18 != 3 ? i18 != 5 ? i18 != 7 ? i18 != 8388611 ? i18 != 8388613 ? f93071w : A : f93074z : F : z17 ? C : f93073y : z17 ? B : f93072x : D;
    }

    public static void g(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str + ". ");
    }

    public static void k(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams, int i17, int i18, int i19, int i27) {
        x3.o oVar = new x3.o(i17, i18 + i17);
        x3.r rVar = layoutParams.f93084a;
        layoutParams.f93084a = new x3.r(rVar.f533125a, oVar, rVar.f533127c, rVar.f533128d);
        x3.o oVar2 = new x3.o(i19, i27 + i19);
        x3.r rVar2 = layoutParams.f93085b;
        layoutParams.f93085b = new x3.r(rVar2.f533125a, oVar2, rVar2.f533127c, rVar2.f533128d);
    }

    public static x3.r l(int i17, int i18, x3.j jVar, float f17) {
        return new x3.r(i17 != Integer.MIN_VALUE, new x3.o(i17, i18 + i17), jVar, f17);
    }

    public final void a(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams, boolean z17) {
        java.lang.String str = z17 ? "column" : "row";
        x3.o oVar = (z17 ? layoutParams.f93085b : layoutParams.f93084a).f533126b;
        int i17 = oVar.f533118a;
        if (i17 != Integer.MIN_VALUE && i17 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i18 = (z17 ? this.f93075d : this.f93076e).f93087b;
        if (i18 != Integer.MIN_VALUE) {
            int i19 = oVar.f533119b;
            if (i19 > i18) {
                g(str + " indices (start + span) mustn't exceed the " + str + " count");
                throw null;
            }
            if (i19 - i17 <= i18) {
                return;
            }
            g(str + " span mustn't exceed the " + str + " count");
            throw null;
        }
    }

    public final int b() {
        int childCount = getChildCount();
        int i17 = 1;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                i17 = (i17 * 31) + ((p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams()).m7782x8cdac1b();
            }
        }
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092 A[EDGE_INSN: B:58:0x0092->B:32:0x0092 BREAK  A[LOOP:1: B:34:0x0070->B:51:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.c():void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams)) {
            return false;
        }
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams2 = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) layoutParams;
        a(layoutParams2, true);
        a(layoutParams2, false);
        return true;
    }

    public final int e(android.view.View view, boolean z17, boolean z18) {
        int[] iArr;
        if (this.f93079h == 1) {
            return f(view, z17, z18);
        }
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = z17 ? this.f93075d : this.f93076e;
        if (z18) {
            if (aVar.f93095j == null) {
                aVar.f93095j = new int[aVar.f() + 1];
            }
            if (!aVar.f93096k) {
                aVar.c(true);
                aVar.f93096k = true;
            }
            iArr = aVar.f93095j;
        } else {
            if (aVar.f93097l == null) {
                aVar.f93097l = new int[aVar.f() + 1];
            }
            if (!aVar.f93098m) {
                aVar.c(false);
                aVar.f93098m = true;
            }
            iArr = aVar.f93097l;
        }
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) view.getLayoutParams();
        x3.o oVar = (z17 ? layoutParams.f93085b : layoutParams.f93084a).f533126b;
        return iArr[z18 ? oVar.f533118a : oVar.f533119b];
    }

    public int f(android.view.View view, boolean z17, boolean z18) {
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) view.getLayoutParams();
        int i17 = z17 ? z18 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : z18 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (i17 != Integer.MIN_VALUE) {
            return i17;
        }
        if (this.f93078g) {
            x3.r rVar = z17 ? layoutParams.f93085b : layoutParams.f93084a;
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = z17 ? this.f93075d : this.f93076e;
            x3.o oVar = rVar.f533126b;
            if (z17) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                if (n3.v0.d(this) == 1) {
                    z18 = !z18;
                }
            }
            if (z18) {
                int i18 = oVar.f533118a;
            } else {
                int i19 = oVar.f533119b;
                aVar.f();
            }
            if (view.getClass() != p012xc85e97e9.p090xbe0af3c9.p092xd1075a44.C1112x4c600e6.class && view.getClass() != android.widget.Space.class) {
                return this.f93080i / 2;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        x3.r rVar = x3.r.f533124e;
        return new p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams(rVar, rVar);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getAlignmentMode */
    public int m7766x48aa6270() {
        return this.f93079h;
    }

    /* renamed from: getColumnCount */
    public int m7767xa6887a23() {
        return this.f93075d.f();
    }

    /* renamed from: getOrientation */
    public int m7768x84093c9a() {
        return this.f93077f;
    }

    /* renamed from: getPrinter */
    public android.util.Printer m7769x2b0b03e4() {
        return this.f93082n;
    }

    /* renamed from: getRowCount */
    public int m7770x7ce8fccb() {
        return this.f93076e.f();
    }

    /* renamed from: getUseDefaultMargins */
    public boolean m7771x66adf7b5() {
        return this.f93078g;
    }

    public final void h() {
        this.f93081m = 0;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = this.f93075d;
        if (aVar != null) {
            aVar.l();
        }
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar2 = this.f93076e;
        if (aVar2 != null) {
            aVar2.l();
        }
        if (aVar == null || aVar2 == null) {
            return;
        }
        aVar.m();
        aVar2.m();
    }

    public final void i(android.view.View view, int i17, int i18, int i19, int i27) {
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, e(view, true, true) + e(view, true, false), i19), android.view.ViewGroup.getChildMeasureSpec(i18, e(view, false, true) + e(view, false, false), i27));
    }

    public final void j(int i17, int i18, boolean z17) {
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                if (z17) {
                    i(childAt, i17, i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height);
                } else {
                    boolean z18 = this.f93077f == 0;
                    x3.r rVar = z18 ? layoutParams.f93085b : layoutParams.f93084a;
                    if (rVar.a(z18) == F) {
                        int[] h17 = (z18 ? this.f93075d : this.f93076e).h();
                        x3.o oVar = rVar.f533126b;
                        int e17 = (h17[oVar.f533119b] - h17[oVar.f533118a]) - (e(childAt, z18, true) + e(childAt, z18, false));
                        if (z18) {
                            i(childAt, i17, i18, e17, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height);
                        } else {
                            i(childAt, i17, i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, e17);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int[] iArr;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar;
        int i28;
        boolean z18;
        int i29;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230 c1110x93624230 = this;
        c();
        int i37 = i19 - i17;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i38 = (i37 - paddingLeft) - paddingRight;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar2 = c1110x93624230.f93075d;
        aVar2.f93107v.f533120a = i38;
        aVar2.f93108w.f533120a = -i38;
        boolean z19 = false;
        aVar2.f93102q = false;
        aVar2.h();
        int i39 = ((i27 - i18) - paddingTop) - paddingBottom;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar3 = c1110x93624230.f93076e;
        aVar3.f93107v.f533120a = i39;
        aVar3.f93108w.f533120a = -i39;
        aVar3.f93102q = false;
        aVar3.h();
        int[] h17 = aVar2.h();
        int[] h18 = aVar3.h();
        int childCount = getChildCount();
        int i47 = 0;
        while (i47 < childCount) {
            android.view.View childAt = c1110x93624230.getChildAt(i47);
            if (childAt.getVisibility() == 8) {
                i28 = i47;
                i29 = childCount;
                aVar = aVar2;
                z18 = z19;
                iArr = h17;
            } else {
                p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) childAt.getLayoutParams();
                x3.r rVar = layoutParams.f93085b;
                x3.r rVar2 = layoutParams.f93084a;
                x3.o oVar = rVar.f533126b;
                x3.o oVar2 = rVar2.f533126b;
                int i48 = childCount;
                int i49 = h17[oVar.f533118a];
                int i57 = h18[oVar2.f533118a];
                int i58 = h17[oVar.f533119b];
                int i59 = h18[oVar2.f533119b];
                int i66 = i58 - i49;
                int i67 = i59 - i57;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                iArr = h17;
                x3.j a17 = rVar.a(true);
                x3.j a18 = rVar2.a(false);
                x3.q g17 = aVar2.g();
                x3.n nVar = (x3.n) g17.f533123c[g17.f533121a[i47]];
                x3.q g18 = aVar3.g();
                aVar = aVar2;
                x3.n nVar2 = (x3.n) g18.f533123c[g18.f533121a[i47]];
                i28 = i47;
                int d17 = a17.d(childAt, i66 - nVar.d(true));
                int d18 = a18.d(childAt, i67 - nVar2.d(true));
                int e17 = c1110x93624230.e(childAt, true, true);
                int e18 = c1110x93624230.e(childAt, false, true);
                int e19 = c1110x93624230.e(childAt, true, false);
                int i68 = e17 + e19;
                int e27 = e18 + c1110x93624230.e(childAt, false, false);
                z18 = false;
                i29 = i48;
                int a19 = nVar.a(this, childAt, a17, measuredWidth + i68, true);
                int a27 = nVar2.a(this, childAt, a18, measuredHeight + e27, false);
                int e28 = a17.e(childAt, measuredWidth, i66 - i68);
                int e29 = a18.e(childAt, measuredHeight, i67 - e27);
                int i69 = i49 + d17 + a19;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                int i76 = !(n3.v0.d(this) == 1) ? paddingLeft + e17 + i69 : (((i37 - e28) - paddingRight) - e19) - i69;
                int i77 = paddingTop + i57 + d18 + a27 + e18;
                if (e28 != childAt.getMeasuredWidth() || e29 != childAt.getMeasuredHeight()) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(e28, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(e29, 1073741824));
                }
                childAt.layout(i76, i77, e28 + i76, e29 + i77);
            }
            i47 = i28 + 1;
            c1110x93624230 = this;
            h17 = iArr;
            aVar2 = aVar;
            childCount = i29;
            z19 = z18;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int j17;
        int j18;
        c();
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = this.f93076e;
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar2 = this.f93075d;
        if (aVar2 != null && aVar != null) {
            aVar2.m();
            aVar.m();
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize((-paddingLeft) + i17), android.view.View.MeasureSpec.getMode(i17));
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize((-paddingTop) + i18), android.view.View.MeasureSpec.getMode(i18));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.f93077f == 0) {
            j18 = aVar2.j(makeMeasureSpec);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            j17 = aVar.j(makeMeasureSpec2);
        } else {
            j17 = aVar.j(makeMeasureSpec2);
            j(makeMeasureSpec, makeMeasureSpec2, false);
            j18 = aVar2.j(makeMeasureSpec);
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(j18 + paddingLeft, getSuggestedMinimumWidth()), i17, 0), android.view.View.resolveSizeAndState(java.lang.Math.max(j17 + paddingTop, getSuggestedMinimumHeight()), i18, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        h();
    }

    /* renamed from: setAlignmentMode */
    public void m7772xdb80c8e4(int i17) {
        this.f93079h = i17;
        requestLayout();
    }

    /* renamed from: setColumnCount */
    public void m7773x3ceded97(int i17) {
        this.f93075d.n(i17);
        h();
        requestLayout();
    }

    /* renamed from: setColumnOrderPreserved */
    public void m7774xdc40862(boolean z17) {
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = this.f93075d;
        aVar.f93106u = z17;
        aVar.l();
        h();
        requestLayout();
    }

    /* renamed from: setOrientation */
    public void m7775x1a6eb00e(int i17) {
        if (this.f93077f != i17) {
            this.f93077f = i17;
            h();
            requestLayout();
        }
    }

    /* renamed from: setPrinter */
    public void m7776x9e7c5158(android.util.Printer printer) {
        if (printer == null) {
            printer = f93064p;
        }
        this.f93082n = printer;
    }

    /* renamed from: setRowCount */
    public void m7777x77a15dd7(int i17) {
        this.f93076e.n(i17);
        h();
        requestLayout();
    }

    /* renamed from: setRowOrderPreserved */
    public void m7778x604ae022(boolean z17) {
        p012xc85e97e9.p088x532b79f0.p089xd1075a44.a aVar = this.f93076e;
        aVar.f93106u = z17;
        aVar.l();
        h();
        requestLayout();
    }

    /* renamed from: setUseDefaultMargins */
    public void m7779x42440429(boolean z17) {
        this.f93078g = z17;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) {
            return new p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams((p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams(layoutParams);
    }

    /* renamed from: androidx.gridlayout.widget.GridLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f93083c = 1;

        /* renamed from: a, reason: collision with root package name */
        public x3.r f93084a;

        /* renamed from: b, reason: collision with root package name */
        public x3.r f93085b;

        public LayoutParams(x3.r rVar, x3.r rVar2) {
            super(-2, -2);
            x3.r rVar3 = x3.r.f533124e;
            this.f93084a = rVar3;
            this.f93085b = rVar3;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f93084a = rVar;
            this.f93085b = rVar2;
        }

        /* renamed from: equals */
        public boolean m7781xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams = (p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams) obj;
            return this.f93085b.m174937xb2c87fbf(layoutParams.f93085b) && this.f93084a.m174937xb2c87fbf(layoutParams.f93084a);
        }

        /* renamed from: hashCode */
        public int m7782x8cdac1b() {
            return (this.f93084a.m174938x8cdac1b() * 31) + this.f93085b.m174938x8cdac1b();
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(android.content.res.TypedArray typedArray, int i17, int i18) {
            ((android.view.ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i17, -2);
            ((android.view.ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i18, -2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            x3.r rVar = x3.r.f533124e;
            this.f93084a = rVar;
            this.f93085b = rVar;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            x3.r rVar = x3.r.f533124e;
            this.f93084a = rVar;
            this.f93085b = rVar;
        }

        public LayoutParams(p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            x3.r rVar = x3.r.f533124e;
            this.f93084a = rVar;
            this.f93085b = rVar;
            this.f93084a = layoutParams.f93084a;
            this.f93085b = layoutParams.f93085b;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            x3.r rVar = x3.r.f533124e;
            this.f93084a = rVar;
            this.f93085b = rVar;
            int[] iArr = w3.a.f524191b;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
                ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
                ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
                ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
                ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
                try {
                    int i17 = obtainStyledAttributes.getInt(10, 0);
                    int i18 = obtainStyledAttributes.getInt(7, Integer.MIN_VALUE);
                    int i19 = f93083c;
                    this.f93085b = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(i18, obtainStyledAttributes.getInt(8, i19), p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.d(i17, true), obtainStyledAttributes.getFloat(9, 0.0f));
                    this.f93084a = p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.l(obtainStyledAttributes.getInt(11, Integer.MIN_VALUE), obtainStyledAttributes.getInt(12, i19), p012xc85e97e9.p088x532b79f0.p089xd1075a44.C1110x93624230.d(i17, false), obtainStyledAttributes.getFloat(13, 0.0f));
                } finally {
                }
            } finally {
            }
        }
    }

    public C1110x93624230(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
