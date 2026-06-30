package androidx.gridlayout.widget;

/* loaded from: classes15.dex */
public class GridLayout extends android.view.ViewGroup {
    public static final x3.j A;
    public static final x3.j B;
    public static final x3.j C;
    public static final x3.j D;
    public static final x3.j E;
    public static final x3.j F;

    /* renamed from: o, reason: collision with root package name */
    public static final android.util.Printer f11530o = new android.util.LogPrinter(3, androidx.gridlayout.widget.GridLayout.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final android.util.Printer f11531p = new x3.a();

    /* renamed from: q, reason: collision with root package name */
    public static final int f11532q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final int f11533r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f11534s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f11535t = 6;

    /* renamed from: u, reason: collision with root package name */
    public static final int f11536u = 5;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11537v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final x3.j f11538w = new x3.b();

    /* renamed from: x, reason: collision with root package name */
    public static final x3.j f11539x;

    /* renamed from: y, reason: collision with root package name */
    public static final x3.j f11540y;

    /* renamed from: z, reason: collision with root package name */
    public static final x3.j f11541z;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.gridlayout.widget.a f11542d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.gridlayout.widget.a f11543e;

    /* renamed from: f, reason: collision with root package name */
    public int f11544f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11545g;

    /* renamed from: h, reason: collision with root package name */
    public int f11546h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11547i;

    /* renamed from: m, reason: collision with root package name */
    public int f11548m;

    /* renamed from: n, reason: collision with root package name */
    public android.util.Printer f11549n;

    static {
        x3.c cVar = new x3.c();
        x3.d dVar = new x3.d();
        f11539x = cVar;
        f11540y = dVar;
        f11541z = cVar;
        A = dVar;
        B = new x3.e(cVar, dVar);
        C = new x3.e(dVar, cVar);
        D = new x3.f();
        E = new x3.h();
        F = new x3.i();
    }

    public GridLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f11542d = new androidx.gridlayout.widget.a(this, true);
        this.f11543e = new androidx.gridlayout.widget.a(this, false);
        this.f11544f = 0;
        this.f11545g = false;
        this.f11546h = 1;
        this.f11548m = 0;
        this.f11549n = f11530o;
        this.f11547i = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480261su);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w3.a.f442657a);
        try {
            setRowCount(obtainStyledAttributes.getInt(f11533r, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(f11534s, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(f11532q, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(f11535t, false));
            setAlignmentMode(obtainStyledAttributes.getInt(0, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(f11536u, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(f11537v, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static x3.j d(int i17, boolean z17) {
        int i18 = (i17 & (z17 ? 7 : 112)) >> (z17 ? 0 : 4);
        return i18 != 1 ? i18 != 3 ? i18 != 5 ? i18 != 7 ? i18 != 8388611 ? i18 != 8388613 ? f11538w : A : f11541z : F : z17 ? C : f11540y : z17 ? B : f11539x : D;
    }

    public static void g(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str + ". ");
    }

    public static void k(androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams, int i17, int i18, int i19, int i27) {
        x3.o oVar = new x3.o(i17, i18 + i17);
        x3.r rVar = layoutParams.f11551a;
        layoutParams.f11551a = new x3.r(rVar.f451592a, oVar, rVar.f451594c, rVar.f451595d);
        x3.o oVar2 = new x3.o(i19, i27 + i19);
        x3.r rVar2 = layoutParams.f11552b;
        layoutParams.f11552b = new x3.r(rVar2.f451592a, oVar2, rVar2.f451594c, rVar2.f451595d);
    }

    public static x3.r l(int i17, int i18, x3.j jVar, float f17) {
        return new x3.r(i17 != Integer.MIN_VALUE, new x3.o(i17, i18 + i17), jVar, f17);
    }

    public final void a(androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams, boolean z17) {
        java.lang.String str = z17 ? "column" : "row";
        x3.o oVar = (z17 ? layoutParams.f11552b : layoutParams.f11551a).f451593b;
        int i17 = oVar.f451585a;
        if (i17 != Integer.MIN_VALUE && i17 < 0) {
            g(str.concat(" indices must be positive"));
            throw null;
        }
        int i18 = (z17 ? this.f11542d : this.f11543e).f11554b;
        if (i18 != Integer.MIN_VALUE) {
            int i19 = oVar.f451586b;
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
                i17 = (i17 * 31) + ((androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams()).hashCode();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.c():void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof androidx.gridlayout.widget.GridLayout.LayoutParams)) {
            return false;
        }
        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams2 = (androidx.gridlayout.widget.GridLayout.LayoutParams) layoutParams;
        a(layoutParams2, true);
        a(layoutParams2, false);
        return true;
    }

    public final int e(android.view.View view, boolean z17, boolean z18) {
        int[] iArr;
        if (this.f11546h == 1) {
            return f(view, z17, z18);
        }
        androidx.gridlayout.widget.a aVar = z17 ? this.f11542d : this.f11543e;
        if (z18) {
            if (aVar.f11562j == null) {
                aVar.f11562j = new int[aVar.f() + 1];
            }
            if (!aVar.f11563k) {
                aVar.c(true);
                aVar.f11563k = true;
            }
            iArr = aVar.f11562j;
        } else {
            if (aVar.f11564l == null) {
                aVar.f11564l = new int[aVar.f() + 1];
            }
            if (!aVar.f11565m) {
                aVar.c(false);
                aVar.f11565m = true;
            }
            iArr = aVar.f11564l;
        }
        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) view.getLayoutParams();
        x3.o oVar = (z17 ? layoutParams.f11552b : layoutParams.f11551a).f451593b;
        return iArr[z18 ? oVar.f451585a : oVar.f451586b];
    }

    public int f(android.view.View view, boolean z17, boolean z18) {
        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) view.getLayoutParams();
        int i17 = z17 ? z18 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : z18 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (i17 != Integer.MIN_VALUE) {
            return i17;
        }
        if (this.f11545g) {
            x3.r rVar = z17 ? layoutParams.f11552b : layoutParams.f11551a;
            androidx.gridlayout.widget.a aVar = z17 ? this.f11542d : this.f11543e;
            x3.o oVar = rVar.f451593b;
            if (z17) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.v0.d(this) == 1) {
                    z18 = !z18;
                }
            }
            if (z18) {
                int i18 = oVar.f451585a;
            } else {
                int i19 = oVar.f451586b;
                aVar.f();
            }
            if (view.getClass() != androidx.legacy.widget.Space.class && view.getClass() != android.widget.Space.class) {
                return this.f11547i / 2;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        x3.r rVar = x3.r.f451591e;
        return new androidx.gridlayout.widget.GridLayout.LayoutParams(rVar, rVar);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.gridlayout.widget.GridLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getAlignmentMode() {
        return this.f11546h;
    }

    public int getColumnCount() {
        return this.f11542d.f();
    }

    public int getOrientation() {
        return this.f11544f;
    }

    public android.util.Printer getPrinter() {
        return this.f11549n;
    }

    public int getRowCount() {
        return this.f11543e.f();
    }

    public boolean getUseDefaultMargins() {
        return this.f11545g;
    }

    public final void h() {
        this.f11548m = 0;
        androidx.gridlayout.widget.a aVar = this.f11542d;
        if (aVar != null) {
            aVar.l();
        }
        androidx.gridlayout.widget.a aVar2 = this.f11543e;
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
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                if (z17) {
                    i(childAt, i17, i18, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height);
                } else {
                    boolean z18 = this.f11544f == 0;
                    x3.r rVar = z18 ? layoutParams.f11552b : layoutParams.f11551a;
                    if (rVar.a(z18) == F) {
                        int[] h17 = (z18 ? this.f11542d : this.f11543e).h();
                        x3.o oVar = rVar.f451593b;
                        int e17 = (h17[oVar.f451586b] - h17[oVar.f451585a]) - (e(childAt, z18, true) + e(childAt, z18, false));
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
        androidx.gridlayout.widget.a aVar;
        int i28;
        boolean z18;
        int i29;
        androidx.gridlayout.widget.GridLayout gridLayout = this;
        c();
        int i37 = i19 - i17;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i38 = (i37 - paddingLeft) - paddingRight;
        androidx.gridlayout.widget.a aVar2 = gridLayout.f11542d;
        aVar2.f11574v.f451587a = i38;
        aVar2.f11575w.f451587a = -i38;
        boolean z19 = false;
        aVar2.f11569q = false;
        aVar2.h();
        int i39 = ((i27 - i18) - paddingTop) - paddingBottom;
        androidx.gridlayout.widget.a aVar3 = gridLayout.f11543e;
        aVar3.f11574v.f451587a = i39;
        aVar3.f11575w.f451587a = -i39;
        aVar3.f11569q = false;
        aVar3.h();
        int[] h17 = aVar2.h();
        int[] h18 = aVar3.h();
        int childCount = getChildCount();
        int i47 = 0;
        while (i47 < childCount) {
            android.view.View childAt = gridLayout.getChildAt(i47);
            if (childAt.getVisibility() == 8) {
                i28 = i47;
                i29 = childCount;
                aVar = aVar2;
                z18 = z19;
                iArr = h17;
            } else {
                androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) childAt.getLayoutParams();
                x3.r rVar = layoutParams.f11552b;
                x3.r rVar2 = layoutParams.f11551a;
                x3.o oVar = rVar.f451593b;
                x3.o oVar2 = rVar2.f451593b;
                int i48 = childCount;
                int i49 = h17[oVar.f451585a];
                int i57 = h18[oVar2.f451585a];
                int i58 = h17[oVar.f451586b];
                int i59 = h18[oVar2.f451586b];
                int i66 = i58 - i49;
                int i67 = i59 - i57;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                iArr = h17;
                x3.j a17 = rVar.a(true);
                x3.j a18 = rVar2.a(false);
                x3.q g17 = aVar2.g();
                x3.n nVar = (x3.n) g17.f451590c[g17.f451588a[i47]];
                x3.q g18 = aVar3.g();
                aVar = aVar2;
                x3.n nVar2 = (x3.n) g18.f451590c[g18.f451588a[i47]];
                i28 = i47;
                int d17 = a17.d(childAt, i66 - nVar.d(true));
                int d18 = a18.d(childAt, i67 - nVar2.d(true));
                int e17 = gridLayout.e(childAt, true, true);
                int e18 = gridLayout.e(childAt, false, true);
                int e19 = gridLayout.e(childAt, true, false);
                int i68 = e17 + e19;
                int e27 = e18 + gridLayout.e(childAt, false, false);
                z18 = false;
                i29 = i48;
                int a19 = nVar.a(this, childAt, a17, measuredWidth + i68, true);
                int a27 = nVar2.a(this, childAt, a18, measuredHeight + e27, false);
                int e28 = a17.e(childAt, measuredWidth, i66 - i68);
                int e29 = a18.e(childAt, measuredHeight, i67 - e27);
                int i69 = i49 + d17 + a19;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                int i76 = !(n3.v0.d(this) == 1) ? paddingLeft + e17 + i69 : (((i37 - e28) - paddingRight) - e19) - i69;
                int i77 = paddingTop + i57 + d18 + a27 + e18;
                if (e28 != childAt.getMeasuredWidth() || e29 != childAt.getMeasuredHeight()) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(e28, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(e29, 1073741824));
                }
                childAt.layout(i76, i77, e28 + i76, e29 + i77);
            }
            i47 = i28 + 1;
            gridLayout = this;
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
        androidx.gridlayout.widget.a aVar = this.f11543e;
        androidx.gridlayout.widget.a aVar2 = this.f11542d;
        if (aVar2 != null && aVar != null) {
            aVar2.m();
            aVar.m();
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize((-paddingLeft) + i17), android.view.View.MeasureSpec.getMode(i17));
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize((-paddingTop) + i18), android.view.View.MeasureSpec.getMode(i18));
        j(makeMeasureSpec, makeMeasureSpec2, true);
        if (this.f11544f == 0) {
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

    public void setAlignmentMode(int i17) {
        this.f11546h = i17;
        requestLayout();
    }

    public void setColumnCount(int i17) {
        this.f11542d.n(i17);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z17) {
        androidx.gridlayout.widget.a aVar = this.f11542d;
        aVar.f11573u = z17;
        aVar.l();
        h();
        requestLayout();
    }

    public void setOrientation(int i17) {
        if (this.f11544f != i17) {
            this.f11544f = i17;
            h();
            requestLayout();
        }
    }

    public void setPrinter(android.util.Printer printer) {
        if (printer == null) {
            printer = f11531p;
        }
        this.f11549n = printer;
    }

    public void setRowCount(int i17) {
        this.f11543e.n(i17);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z17) {
        androidx.gridlayout.widget.a aVar = this.f11543e;
        aVar.f11573u = z17;
        aVar.l();
        h();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z17) {
        this.f11545g = z17;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof androidx.gridlayout.widget.GridLayout.LayoutParams) {
            return new androidx.gridlayout.widget.GridLayout.LayoutParams((androidx.gridlayout.widget.GridLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            return new androidx.gridlayout.widget.GridLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new androidx.gridlayout.widget.GridLayout.LayoutParams(layoutParams);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public static final int f11550c = 1;

        /* renamed from: a, reason: collision with root package name */
        public x3.r f11551a;

        /* renamed from: b, reason: collision with root package name */
        public x3.r f11552b;

        public LayoutParams(x3.r rVar, x3.r rVar2) {
            super(-2, -2);
            x3.r rVar3 = x3.r.f451591e;
            this.f11551a = rVar3;
            this.f11552b = rVar3;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.f11551a = rVar;
            this.f11552b = rVar2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) obj;
            return this.f11552b.equals(layoutParams.f11552b) && this.f11551a.equals(layoutParams.f11551a);
        }

        public int hashCode() {
            return (this.f11551a.hashCode() * 31) + this.f11552b.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        public void setBaseAttributes(android.content.res.TypedArray typedArray, int i17, int i18) {
            ((android.view.ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i17, -2);
            ((android.view.ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i18, -2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            x3.r rVar = x3.r.f451591e;
            this.f11551a = rVar;
            this.f11552b = rVar;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            x3.r rVar = x3.r.f451591e;
            this.f11551a = rVar;
            this.f11552b = rVar;
        }

        public LayoutParams(androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            x3.r rVar = x3.r.f451591e;
            this.f11551a = rVar;
            this.f11552b = rVar;
            this.f11551a = layoutParams.f11551a;
            this.f11552b = layoutParams.f11552b;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            x3.r rVar = x3.r.f451591e;
            this.f11551a = rVar;
            this.f11552b = rVar;
            int[] iArr = w3.a.f442658b;
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
                    int i19 = f11550c;
                    this.f11552b = androidx.gridlayout.widget.GridLayout.l(i18, obtainStyledAttributes.getInt(8, i19), androidx.gridlayout.widget.GridLayout.d(i17, true), obtainStyledAttributes.getFloat(9, 0.0f));
                    this.f11551a = androidx.gridlayout.widget.GridLayout.l(obtainStyledAttributes.getInt(11, Integer.MIN_VALUE), obtainStyledAttributes.getInt(12, i19), androidx.gridlayout.widget.GridLayout.d(i17, false), obtainStyledAttributes.getFloat(13, 0.0f));
                } finally {
                }
            } finally {
            }
        }
    }

    public GridLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
