package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.Toolbar */
/* loaded from: classes15.dex */
public class C0102x1f44235b extends android.view.ViewGroup {
    public int A;
    public int B;
    public final int C;
    public java.lang.CharSequence D;
    public java.lang.CharSequence E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f91010J;
    public final java.util.ArrayList K;
    public final int[] L;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v2 M;
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u N;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 P;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q Q;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2 R;
    public o.f0 S;
    public o.p T;
    public boolean U;
    public final java.lang.Runnable V;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a f91011d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f91012e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f91013f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f91014g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f91015h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f91016i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.CharSequence f91017m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageButton f91018n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f91019o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f91020p;

    /* renamed from: q, reason: collision with root package name */
    public int f91021q;

    /* renamed from: r, reason: collision with root package name */
    public int f91022r;

    /* renamed from: s, reason: collision with root package name */
    public int f91023s;

    /* renamed from: t, reason: collision with root package name */
    public final int f91024t;

    /* renamed from: u, reason: collision with root package name */
    public final int f91025u;

    /* renamed from: v, reason: collision with root package name */
    public int f91026v;

    /* renamed from: w, reason: collision with root package name */
    public int f91027w;

    /* renamed from: x, reason: collision with root package name */
    public int f91028x;

    /* renamed from: y, reason: collision with root package name */
    public int f91029y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 f91030z;

    /* renamed from: androidx.appcompat.widget.Toolbar$SavedState */
    /* loaded from: classes15.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState> f105x681a0c0c = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w2();

        /* renamed from: f, reason: collision with root package name */
        public int f91032f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f91033g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f91032f = parcel.readInt();
            this.f91033g = parcel.readInt() != 0;
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f91032f);
            parcel.writeInt(this.f91033g ? 1 : 0);
        }
    }

    public C0102x1f44235b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f560001kn);
    }

    /* renamed from: getMenuInflater */
    private android.view.MenuInflater m2803x2ef72c40() {
        return new n.j(getContext());
    }

    public final void a(java.util.List list, int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.v0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(this));
        list.clear();
        if (!z17) {
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = getChildAt(i18);
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f91031b == 0 && p(childAt)) {
                    int i19 = layoutParams.f90603a;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    int d17 = n3.v0.d(this);
                    int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(i19, d17) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d17 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        list.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i27 = childCount - 1; i27 >= 0; i27--) {
            android.view.View childAt2 = getChildAt(i27);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f91031b == 0 && p(childAt2)) {
                int i28 = layoutParams2.f90603a;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                int d18 = n3.v0.d(this);
                int absoluteGravity3 = android.view.Gravity.getAbsoluteGravity(i28, d18) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d18 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    public final void b(android.view.View view, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) layoutParams;
        generateDefaultLayoutParams.f91031b = 1;
        if (!z17 || this.f91019o == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.K.add(view);
        }
    }

    public final void c() {
        d();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91011d;
        if (c0076xa566151a.f90869v == null) {
            o.r rVar = (o.r) c0076xa566151a.m2623xfb827dd5();
            if (this.R == null) {
                this.R = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2(this);
            }
            this.f91011d.m2627xc7106781(true);
            rVar.b(this.R, this.f91020p);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams);
    }

    public final void d() {
        if (this.f91011d == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a(getContext(), null);
            this.f91011d = c0076xa566151a;
            c0076xa566151a.m2631xa9dea67f(this.f91021q);
            this.f91011d.m2628x99906709(this.N);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a2 = this.f91011d;
            o.f0 f0Var = this.S;
            o.p pVar = this.T;
            c0076xa566151a2.A = f0Var;
            c0076xa566151a2.B = pVar;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f90603a = (this.f91024t & 112) | 8388613;
            this.f91011d.setLayoutParams(generateDefaultLayoutParams);
            b(this.f91011d, false);
        }
    }

    public final void e() {
        if (this.f91014g == null) {
            this.f91014g = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a(getContext(), null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f560000km);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f90603a = (this.f91024t & 112) | 8388611;
            this.f91014g.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams ? new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) layoutParams) : layoutParams instanceof p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 ? new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams((p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams(layoutParams);
    }

    /* renamed from: getContentInsetEnd */
    public int m2804x95231fe1() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        if (q1Var != null) {
            return q1Var.f91223g ? q1Var.f91217a : q1Var.f91218b;
        }
        return 0;
    }

    /* renamed from: getContentInsetEndWithActions */
    public int m2805x797366b6() {
        int i17 = this.B;
        return i17 != Integer.MIN_VALUE ? i17 : m2804x95231fe1();
    }

    /* renamed from: getContentInsetLeft */
    public int m2806xf43e9c1() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        if (q1Var != null) {
            return q1Var.f91217a;
        }
        return 0;
    }

    /* renamed from: getContentInsetRight */
    public int m2807xd98fafa2() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        if (q1Var != null) {
            return q1Var.f91218b;
        }
        return 0;
    }

    /* renamed from: getContentInsetStart */
    public int m2808xd9a2b1e8() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        if (q1Var != null) {
            return q1Var.f91223g ? q1Var.f91218b : q1Var.f91217a;
        }
        return 0;
    }

    /* renamed from: getContentInsetStartWithNavigation */
    public int m2809xeecddf82() {
        int i17 = this.A;
        return i17 != Integer.MIN_VALUE ? i17 : m2808xd9a2b1e8();
    }

    /* renamed from: getCurrentContentInsetEnd */
    public int m2810xcf56fe54() {
        o.r rVar;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91011d;
        return c0076xa566151a != null && (rVar = c0076xa566151a.f90869v) != null && rVar.hasVisibleItems() ? java.lang.Math.max(m2804x95231fe1(), java.lang.Math.max(this.B, 0)) : m2804x95231fe1();
    }

    /* renamed from: getCurrentContentInsetLeft */
    public int m2811x1b8bd9ae() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(this) == 1 ? m2810xcf56fe54() : m2813x5658bf9b();
    }

    /* renamed from: getCurrentContentInsetRight */
    public int m2812x5645bd55() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(this) == 1 ? m2813x5658bf9b() : m2810xcf56fe54();
    }

    /* renamed from: getCurrentContentInsetStart */
    public int m2813x5658bf9b() {
        return m2818xf8c55da3() != null ? java.lang.Math.max(m2808xd9a2b1e8(), java.lang.Math.max(this.A, 0)) : m2808xd9a2b1e8();
    }

    /* renamed from: getLogo */
    public android.graphics.drawable.Drawable m2814xfb822e21() {
        android.widget.ImageView imageView = this.f91015h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    /* renamed from: getLogoDescription */
    public java.lang.CharSequence m2815x57a8f1b() {
        android.widget.ImageView imageView = this.f91015h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: getMenu */
    public android.view.Menu m2816xfb827dd5() {
        c();
        return this.f91011d.m2623xfb827dd5();
    }

    /* renamed from: getNavigationContentDescription */
    public java.lang.CharSequence m2817x205c716d() {
        android.widget.ImageButton imageButton = this.f91014g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* renamed from: getNavigationIcon */
    public android.graphics.drawable.Drawable m2818xf8c55da3() {
        android.widget.ImageButton imageButton = this.f91014g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* renamed from: getOuterActionMenuPresenter */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q m2819x69241a6e() {
        return this.Q;
    }

    /* renamed from: getOverflowIcon */
    public android.graphics.drawable.Drawable m2820x38c92611() {
        c();
        return this.f91011d.m2624x38c92611();
    }

    /* renamed from: getPopupContext */
    public android.content.Context m2821xffb015d9() {
        return this.f91020p;
    }

    /* renamed from: getPopupTheme */
    public int m2822x7bba5873() {
        return this.f91021q;
    }

    /* renamed from: getSubtitle */
    public java.lang.CharSequence m2823x109898e() {
        return this.E;
    }

    /* renamed from: getTitle */
    public java.lang.CharSequence m2824x7531c8a2() {
        return this.D;
    }

    /* renamed from: getTitleMarginBottom */
    public int m2825x783ecb3b() {
        return this.f91029y;
    }

    /* renamed from: getTitleMarginEnd */
    public int m2826x1f471cb() {
        return this.f91027w;
    }

    /* renamed from: getTitleMarginStart */
    public int m2827x57673152() {
        return this.f91026v;
    }

    /* renamed from: getTitleMarginTop */
    public int m2828x1f4aa45() {
        return this.f91028x;
    }

    /* renamed from: getWrapper */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 m2829x9ce6c05d() {
        if (this.P == null) {
            this.P = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2(this, true);
        }
        return this.P;
    }

    public final int h(android.view.View view, int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i18 = i17 > 0 ? (measuredHeight - i17) / 2 : 0;
        int i19 = layoutParams.f90603a & 112;
        if (i19 != 16 && i19 != 48 && i19 != 80) {
            i19 = this.C & 112;
        }
        if (i19 == 48) {
            return getPaddingTop() - i18;
        }
        if (i19 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i18;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i27 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i28 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i27 < i28) {
            i27 = i28;
        } else {
            int i29 = (((height - paddingBottom) - measuredHeight) - i27) - paddingTop;
            int i37 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i29 < i37) {
                i27 = java.lang.Math.max(0, i27 - (i37 - i29));
            }
        }
        return paddingTop + i27;
    }

    public final int i(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return n3.u.c(marginLayoutParams) + n3.u.b(marginLayoutParams);
    }

    public final int j(android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean k(android.view.View view) {
        return view.getParent() == this || this.K.contains(view);
    }

    public final int l(android.view.View view, int i17, int[] iArr, int i18) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) view.getLayoutParams();
        int i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i17 + java.lang.Math.max(0, i19);
        iArr[0] = java.lang.Math.max(0, -i19);
        int h17 = h(view, i18);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h17, max + measuredWidth, view.getMeasuredHeight() + h17);
        return max + measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public final int m(android.view.View view, int i17, int[] iArr, int i18) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams) view.getLayoutParams();
        int i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i17 - java.lang.Math.max(0, i19);
        iArr[1] = java.lang.Math.max(0, -i19);
        int h17 = h(view, i18);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h17, max, view.getMeasuredHeight() + h17);
        return max - (measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int n(android.view.View view, int i17, int i18, int i19, int i27, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i28 = marginLayoutParams.leftMargin - iArr[0];
        int i29 = marginLayoutParams.rightMargin - iArr[1];
        int max = java.lang.Math.max(0, i28) + java.lang.Math.max(0, i29);
        iArr[0] = java.lang.Math.max(0, -i28);
        iArr[1] = java.lang.Math.max(0, -i29);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + max + i18, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(i19, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void o(android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width);
        int childMeasureSpec2 = android.view.ViewGroup.getChildMeasureSpec(i19, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i28 >= 0) {
            if (mode != 0) {
                i28 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i28);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.I = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029f A[LOOP:0: B:40:0x029d->B:41:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02bb A[LOOP:1: B:44:0x02b9->B:45:0x02bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d9 A[LOOP:2: B:48:0x02d7->B:49:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0327 A[LOOP:3: B:57:0x0325->B:58:0x0327, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0291  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (!(parcelable instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState savedState = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91011d;
        o.r rVar = c0076xa566151a != null ? c0076xa566151a.f90869v : null;
        int i17 = savedState.f91032f;
        if (i17 != 0 && this.R != null && rVar != null && (findItem = rVar.findItem(i17)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f91033g) {
            java.lang.Runnable runnable = this.V;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
        if (this.f91030z == null) {
            this.f91030z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        boolean z17 = i17 == 1;
        if (z17 == q1Var.f91223g) {
            return;
        }
        q1Var.f91223g = z17;
        if (!q1Var.f91224h) {
            q1Var.f91217a = q1Var.f91221e;
            q1Var.f91218b = q1Var.f91222f;
            return;
        }
        if (z17) {
            int i18 = q1Var.f91220d;
            if (i18 == Integer.MIN_VALUE) {
                i18 = q1Var.f91221e;
            }
            q1Var.f91217a = i18;
            int i19 = q1Var.f91219c;
            if (i19 == Integer.MIN_VALUE) {
                i19 = q1Var.f91222f;
            }
            q1Var.f91218b = i19;
            return;
        }
        int i27 = q1Var.f91219c;
        if (i27 == Integer.MIN_VALUE) {
            i27 = q1Var.f91221e;
        }
        q1Var.f91217a = i27;
        int i28 = q1Var.f91220d;
        if (i28 == Integer.MIN_VALUE) {
            i28 = q1Var.f91222f;
        }
        q1Var.f91218b = i28;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        o.u uVar;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState savedState = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.SavedState(super.onSaveInstanceState());
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u2 u2Var = this.R;
        if (u2Var != null && (uVar = u2Var.f91262e) != null) {
            savedState.f91032f = uVar.f423337d;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = this.f91011d;
        boolean z17 = false;
        if (c0076xa566151a != null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = c0076xa566151a.f90873z;
            if (qVar != null && qVar.m()) {
                z17 = true;
            }
        }
        savedState.f91033g = z17;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final boolean p(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: setCollapsible */
    public void m2830x2143aa48(boolean z17) {
        this.U = z17;
        requestLayout();
    }

    /* renamed from: setContentInsetEndWithActions */
    public void m2831x69321cc2(int i17) {
        if (i17 < 0) {
            i17 = Integer.MIN_VALUE;
        }
        if (i17 != this.B) {
            this.B = i17;
            if (m2818xf8c55da3() != null) {
                requestLayout();
            }
        }
    }

    /* renamed from: setContentInsetStartWithNavigation */
    public void m2832xcc4b10f6(int i17) {
        if (i17 < 0) {
            i17 = Integer.MIN_VALUE;
        }
        if (i17 != this.A) {
            this.A = i17;
            if (m2818xf8c55da3() != null) {
                requestLayout();
            }
        }
    }

    /* renamed from: setLogo */
    public void m2833x764cf52d(int i17) {
        m2834x764cf52d(k.a.a(getContext(), i17));
    }

    /* renamed from: setLogoDescription */
    public void m2835x3c51288f(int i17) {
        m2836x3c51288f(getContext().getText(i17));
    }

    /* renamed from: setNavigationContentDescription */
    public void m2837x1b45d479(int i17) {
        m2838x1b45d479(i17 != 0 ? getContext().getText(i17) : null);
    }

    /* renamed from: setNavigationIcon */
    public void m2839xc0bbc5af(int i17) {
        m2840xc0bbc5af(k.a.a(getContext(), i17));
    }

    /* renamed from: setNavigationOnClickListener */
    public void m2841x9bc083c7(android.view.View.OnClickListener onClickListener) {
        e();
        this.f91014g.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnMenuItemClickListener */
    public void m2842x99906709(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v2 v2Var) {
        this.M = v2Var;
    }

    /* renamed from: setOverflowIcon */
    public void m2843x6f12211d(android.graphics.drawable.Drawable drawable) {
        c();
        this.f91011d.m2629x6f12211d(drawable);
    }

    /* renamed from: setPopupTheme */
    public void m2844xa9dea67f(int i17) {
        if (this.f91021q != i17) {
            this.f91021q = i17;
            if (i17 == 0) {
                this.f91020p = getContext();
            } else {
                this.f91020p = new android.view.ContextThemeWrapper(getContext(), i17);
            }
        }
    }

    /* renamed from: setSubtitle */
    public void m2845xfbc1ea9a(int i17) {
        mo2846xfbc1ea9a(getContext().getText(i17));
    }

    /* renamed from: setSubtitleTextColor */
    public void m2847xfb00b0bc(int i17) {
        this.G = i17;
        android.widget.TextView textView = this.f91013f;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: setTitle */
    public void m2848x53bfe316(int i17) {
        mo2849x53bfe316(getContext().getText(i17));
    }

    /* renamed from: setTitleMarginBottom */
    public void m2850x53d4d7af(int i17) {
        this.f91029y = i17;
        requestLayout();
    }

    /* renamed from: setTitleMarginEnd */
    public void m2851xc9ead9d7(int i17) {
        this.f91027w = i17;
        requestLayout();
    }

    /* renamed from: setTitleMarginStart */
    public void m2852xfb63c65e(int i17) {
        this.f91026v = i17;
        requestLayout();
    }

    /* renamed from: setTitleMarginTop */
    public void m2853xc9eb1251(int i17) {
        this.f91028x = i17;
        requestLayout();
    }

    /* renamed from: setTitleTextColor */
    public void m2854xc8cc83c0(int i17) {
        this.F = i17;
        android.widget.TextView textView = this.f91012e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 {

        /* renamed from: b, reason: collision with root package name */
        public int f91031b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f91031b = 0;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f91031b = 0;
            this.f90603a = 8388627;
        }

        public LayoutParams(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams layoutParams) {
            super((p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7) layoutParams);
            this.f91031b = 0;
            this.f91031b = layoutParams.f91031b;
        }

        public LayoutParams(p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
            super(c0063x293d4d7);
            this.f91031b = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f91031b = 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f91031b = 0;
        }
    }

    public C0102x1f44235b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.C = 8388627;
        this.f91010J = new java.util.ArrayList();
        this.K = new java.util.ArrayList();
        this.L = new int[2];
        this.N = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r2(this);
        this.V = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.s2(this);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(getContext(), attributeSet, j.a.f377731z, i17, 0);
        this.f91022r = l17.i(27, 0);
        this.f91023s = l17.i(18, 0);
        android.content.res.TypedArray typedArray = l17.f91226b;
        this.C = typedArray.getInteger(0, 8388627);
        this.f91024t = typedArray.getInteger(2, 48);
        int c17 = l17.c(21, 0);
        c17 = l17.k(26) ? l17.c(26, c17) : c17;
        this.f91029y = c17;
        this.f91028x = c17;
        this.f91027w = c17;
        this.f91026v = c17;
        int c18 = l17.c(24, -1);
        if (c18 >= 0) {
            this.f91026v = c18;
        }
        int c19 = l17.c(23, -1);
        if (c19 >= 0) {
            this.f91027w = c19;
        }
        int c27 = l17.c(25, -1);
        if (c27 >= 0) {
            this.f91028x = c27;
        }
        int c28 = l17.c(22, -1);
        if (c28 >= 0) {
            this.f91029y = c28;
        }
        this.f91025u = l17.d(13, -1);
        int c29 = l17.c(9, Integer.MIN_VALUE);
        int c37 = l17.c(5, Integer.MIN_VALUE);
        int d17 = l17.d(7, 0);
        int d18 = l17.d(8, 0);
        if (this.f91030z == null) {
            this.f91030z = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q1 q1Var = this.f91030z;
        q1Var.f91224h = false;
        if (d17 != Integer.MIN_VALUE) {
            q1Var.f91221e = d17;
            q1Var.f91217a = d17;
        }
        if (d18 != Integer.MIN_VALUE) {
            q1Var.f91222f = d18;
            q1Var.f91218b = d18;
        }
        if (c29 != Integer.MIN_VALUE || c37 != Integer.MIN_VALUE) {
            q1Var.a(c29, c37);
        }
        this.A = l17.c(10, Integer.MIN_VALUE);
        this.B = l17.c(6, Integer.MIN_VALUE);
        this.f91016i = l17.e(4);
        this.f91017m = l17.j(3);
        java.lang.CharSequence j17 = l17.j(20);
        if (!android.text.TextUtils.isEmpty(j17)) {
            mo2849x53bfe316(j17);
        }
        java.lang.CharSequence j18 = l17.j(17);
        if (!android.text.TextUtils.isEmpty(j18)) {
            mo2846xfbc1ea9a(j18);
        }
        this.f91020p = getContext();
        m2844xa9dea67f(l17.i(16, 0));
        android.graphics.drawable.Drawable e17 = l17.e(15);
        if (e17 != null) {
            m2840xc0bbc5af(e17);
        }
        java.lang.CharSequence j19 = l17.j(14);
        if (!android.text.TextUtils.isEmpty(j19)) {
            m2838x1b45d479(j19);
        }
        android.graphics.drawable.Drawable e18 = l17.e(11);
        if (e18 != null) {
            m2834x764cf52d(e18);
        }
        java.lang.CharSequence j27 = l17.j(12);
        if (!android.text.TextUtils.isEmpty(j27)) {
            m2836x3c51288f(j27);
        }
        if (l17.k(28)) {
            m2854xc8cc83c0(typedArray.getColor(28, -1));
        }
        if (l17.k(19)) {
            m2847xfb00b0bc(typedArray.getColor(19, -1));
        }
        l17.m();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: setLogo */
    public void m2834x764cf52d(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.f91015h == null) {
                this.f91015h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd(getContext(), null);
            }
            if (!k(this.f91015h)) {
                b(this.f91015h, true);
            }
        } else {
            android.widget.ImageView imageView = this.f91015h;
            if (imageView != null && k(imageView)) {
                removeView(this.f91015h);
                this.K.remove(this.f91015h);
            }
        }
        android.widget.ImageView imageView2 = this.f91015h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* renamed from: setLogoDescription */
    public void m2836x3c51288f(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence) && this.f91015h == null) {
            this.f91015h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd(getContext(), null);
        }
        android.widget.ImageView imageView = this.f91015h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    /* renamed from: setNavigationContentDescription */
    public void m2838x1b45d479(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            e();
        }
        android.widget.ImageButton imageButton = this.f91014g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* renamed from: setNavigationIcon */
    public void m2840xc0bbc5af(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            e();
            if (!k(this.f91014g)) {
                b(this.f91014g, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.f91014g;
            if (imageButton != null && k(imageButton)) {
                removeView(this.f91014g);
                this.K.remove(this.f91014g);
            }
        }
        android.widget.ImageButton imageButton2 = this.f91014g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* renamed from: setSubtitle */
    public void mo2846xfbc1ea9a(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f91013f == null) {
                android.content.Context context = getContext();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(context, null);
                this.f91013f = c0092xf45d4375;
                c0092xf45d4375.setSingleLine();
                this.f91013f.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i17 = this.f91023s;
                if (i17 != 0) {
                    this.f91013f.setTextAppearance(context, i17);
                }
                int i18 = this.G;
                if (i18 != 0) {
                    this.f91013f.setTextColor(i18);
                }
            }
            if (!k(this.f91013f)) {
                b(this.f91013f, true);
            }
        } else {
            android.widget.TextView textView = this.f91013f;
            if (textView != null && k(textView)) {
                removeView(this.f91013f);
                this.K.remove(this.f91013f);
            }
        }
        android.widget.TextView textView2 = this.f91013f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.E = charSequence;
    }

    /* renamed from: setTitle */
    public void mo2849x53bfe316(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f91012e == null) {
                android.content.Context context = getContext();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375(context, null);
                this.f91012e = c0092xf45d4375;
                c0092xf45d4375.setSingleLine();
                this.f91012e.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i17 = this.f91022r;
                if (i17 != 0) {
                    this.f91012e.setTextAppearance(context, i17);
                }
                int i18 = this.F;
                if (i18 != 0) {
                    this.f91012e.setTextColor(i18);
                }
            }
            if (!k(this.f91012e)) {
                b(this.f91012e, true);
            }
        } else {
            android.widget.TextView textView = this.f91012e;
            if (textView != null && k(textView)) {
                removeView(this.f91012e);
                this.K.remove(this.f91012e);
            }
        }
        android.widget.TextView textView2 = this.f91012e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }
}
