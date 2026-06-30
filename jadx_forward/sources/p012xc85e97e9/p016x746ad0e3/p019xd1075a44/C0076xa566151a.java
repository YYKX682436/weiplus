package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActionMenuView */
/* loaded from: classes15.dex */
public class C0076xa566151a extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331 implements o.q, o.i0 {
    public o.f0 A;
    public o.p B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u G;

    /* renamed from: v, reason: collision with root package name */
    public o.r f90869v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Context f90870w;

    /* renamed from: x, reason: collision with root package name */
    public int f90871x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f90872y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f90873z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public boolean f90874c;

        /* renamed from: d, reason: collision with root package name */
        public int f90875d;

        /* renamed from: e, reason: collision with root package name */
        public int f90876e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f90877f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f90878g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f90879h;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams) {
            super(layoutParams);
            this.f90874c = layoutParams.f90874c;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f90874c = false;
        }
    }

    public C0076xa566151a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        m2720x24c46b9d(false);
        float f17 = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f17);
        this.F = (int) (f17 * 4.0f);
        this.f90870w = context;
        this.f90871x = 0;
    }

    @Override // o.q
    public boolean c(o.u uVar) {
        return this.f90869v.q(uVar, null, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331
    /* renamed from: g */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams generateDefaultLayoutParams() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(-2, -2);
        layoutParams.f90949b = 16;
        return layoutParams;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(-2, -2);
        layoutParams.f90949b = 16;
        return layoutParams;
    }

    /* renamed from: getMenu */
    public android.view.Menu m2623xfb827dd5() {
        if (this.f90869v == null) {
            android.content.Context context = getContext();
            o.r rVar = new o.r(context);
            this.f90869v = rVar;
            rVar.f423317h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.t(this);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q(context);
            this.f90873z = qVar;
            qVar.f91207s = true;
            qVar.f91208t = true;
            o.f0 f0Var = this.A;
            if (f0Var == null) {
                f0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.s();
            }
            qVar.f423227h = f0Var;
            this.f90869v.b(qVar, this.f90870w);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar2 = this.f90873z;
            qVar2.f423230n = this;
            this.f90869v = qVar2.f423225f;
        }
        return this.f90869v;
    }

    /* renamed from: getOverflowIcon */
    public android.graphics.drawable.Drawable m2624x38c92611() {
        m2623xfb827dd5();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f90873z;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m mVar = qVar.f91204p;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        if (qVar.f91206r) {
            return qVar.f91205q;
        }
        return null;
    }

    /* renamed from: getPopupTheme */
    public int m2625x7bba5873() {
        return this.f90871x;
    }

    /* renamed from: getWindowAnimations */
    public int m2626xac0048f5() {
        return 0;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331
    /* renamed from: h */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(getContext(), attributeSet);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(-2, -2);
            layoutParams2.f90949b = 16;
            return layoutParams2;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams3 = layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams ? new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) layoutParams) : new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(layoutParams);
        if (layoutParams3.f90949b <= 0) {
            layoutParams3.f90949b = 16;
        }
        return layoutParams3;
    }

    public boolean l(int i17) {
        boolean z17 = false;
        if (i17 == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i17 - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i17);
        if (i17 < getChildCount() && (childAt instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r)) {
            z17 = false | ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r) childAt).c();
        }
        return (i17 <= 0 || !(childAt2 instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r)) ? z17 : z17 | ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r) childAt2).d();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f90873z;
        if (qVar != null) {
            qVar.c(false);
            if (this.f90873z.m()) {
                this.f90873z.l();
                this.f90873z.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f90873z;
        if (qVar != null) {
            qVar.l();
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = qVar.B;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f423244j.mo2732x63a3b28a();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int width;
        int i28;
        if (!this.C) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        int childCount = getChildCount();
        int i29 = (i27 - i18) / 2;
        int m2714x185ec4a3 = m2714x185ec4a3();
        int i37 = i19 - i17;
        int paddingRight = (i37 - getPaddingRight()) - getPaddingLeft();
        boolean a17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.a(this);
        int i38 = 0;
        int i39 = 0;
        for (int i47 = 0; i47 < childCount; i47++) {
            android.view.View childAt = getChildAt(i47);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f90874c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i47)) {
                        measuredWidth += m2714x185ec4a3;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a17) {
                        i28 = getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        width = i28 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        i28 = width - measuredWidth;
                    }
                    int i48 = i29 - (measuredHeight / 2);
                    childAt.layout(i28, i48, width, measuredHeight + i48);
                    paddingRight -= measuredWidth;
                    i38 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    l(i47);
                    i39++;
                }
            }
        }
        if (childCount == 1 && i38 == 0) {
            android.view.View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i49 = (i37 / 2) - (measuredWidth2 / 2);
            int i57 = i29 - (measuredHeight2 / 2);
            childAt2.layout(i49, i57, measuredWidth2 + i49, measuredHeight2 + i57);
            return;
        }
        int i58 = i39 - (i38 ^ 1);
        int max = java.lang.Math.max(0, i58 > 0 ? paddingRight / i58 : 0);
        if (a17) {
            int width2 = getWidth() - getPaddingRight();
            for (int i59 = 0; i59 < childCount; i59++) {
                android.view.View childAt3 = getChildAt(i59);
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f90874c) {
                    int i66 = width2 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i67 = i29 - (measuredHeight3 / 2);
                    childAt3.layout(i66 - measuredWidth3, i67, i66, measuredHeight3 + i67);
                    width2 = i66 - ((measuredWidth3 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i68 = 0; i68 < childCount; i68++) {
            android.view.View childAt4 = getChildAt(i68);
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams3 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f90874c) {
                int i69 = paddingLeft + ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i76 = i29 - (measuredHeight4 / 2);
                childAt4.layout(i69, i76, i69 + measuredWidth4, measuredHeight4 + i76);
                paddingLeft = i69 + measuredWidth4 + ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + max;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        boolean z17;
        boolean z18;
        int i27;
        int i28;
        ?? r47;
        int i29;
        int i37;
        int i38;
        o.r rVar;
        boolean z19 = this.C;
        boolean z27 = android.view.View.MeasureSpec.getMode(i17) == 1073741824;
        this.C = z27;
        if (z19 != z27) {
            this.D = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (this.C && (rVar = this.f90869v) != null && size != this.D) {
            this.D = size;
            rVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i39 = 0; i39 < childCount; i39++) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) getChildAt(i39).getLayoutParams();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i17, i18);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i17);
        int size3 = android.view.View.MeasureSpec.getSize(i18);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i18, paddingTop, -2);
        int i47 = size2 - paddingLeft;
        int i48 = this.E;
        int i49 = i47 / i48;
        int i57 = i47 % i48;
        if (i49 == 0) {
            setMeasuredDimension(i47, 0);
            return;
        }
        int i58 = i48 + (i57 / i49);
        int childCount2 = getChildCount();
        int i59 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        boolean z28 = false;
        int i69 = 0;
        long j17 = 0;
        while (true) {
            i19 = this.F;
            if (i68 >= childCount2) {
                break;
            }
            android.view.View childAt = getChildAt(i68);
            int i76 = size3;
            int i77 = i47;
            if (childAt.getVisibility() == 8) {
                i29 = mode;
                i37 = paddingTop;
            } else {
                boolean z29 = childAt instanceof p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d;
                int i78 = i66 + 1;
                if (z29) {
                    childAt.setPadding(i19, 0, i19, 0);
                }
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt.getLayoutParams();
                layoutParams2.f90879h = false;
                layoutParams2.f90876e = 0;
                layoutParams2.f90875d = 0;
                layoutParams2.f90877f = false;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.f90878g = z29 && ((p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d) childAt).b();
                int i79 = layoutParams2.f90874c ? 1 : i49;
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams3 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt.getLayoutParams();
                i29 = mode;
                i37 = paddingTop;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d viewOnClickListenerC0069xaad3004d = z29 ? (p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d) childAt : null;
                boolean z37 = viewOnClickListenerC0069xaad3004d != null && viewOnClickListenerC0069xaad3004d.b();
                if (i79 <= 0 || (z37 && i79 < 2)) {
                    i38 = 0;
                } else {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i79 * i58, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i38 = measuredWidth / i58;
                    if (measuredWidth % i58 != 0) {
                        i38++;
                    }
                    if (z37 && i38 < 2) {
                        i38 = 2;
                    }
                }
                layoutParams3.f90877f = !layoutParams3.f90874c && z37;
                layoutParams3.f90875d = i38;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i58 * i38, 1073741824), makeMeasureSpec);
                i67 = java.lang.Math.max(i67, i38);
                if (layoutParams2.f90877f) {
                    i69++;
                }
                if (layoutParams2.f90874c) {
                    z28 = true;
                }
                i49 -= i38;
                i59 = java.lang.Math.max(i59, childAt.getMeasuredHeight());
                if (i38 == 1) {
                    j17 |= 1 << i68;
                }
                i66 = i78;
            }
            i68++;
            size3 = i76;
            i47 = i77;
            paddingTop = i37;
            mode = i29;
        }
        int i86 = mode;
        int i87 = i47;
        int i88 = size3;
        boolean z38 = z28 && i66 == 2;
        boolean z39 = false;
        while (i69 > 0 && i49 > 0) {
            int i89 = Integer.MAX_VALUE;
            int i96 = 0;
            int i97 = 0;
            long j18 = 0;
            while (i97 < childCount2) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams4 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) getChildAt(i97).getLayoutParams();
                boolean z47 = z39;
                if (layoutParams4.f90877f) {
                    int i98 = layoutParams4.f90875d;
                    if (i98 < i89) {
                        j18 = 1 << i97;
                        i89 = i98;
                        i96 = 1;
                    } else if (i98 == i89) {
                        j18 |= 1 << i97;
                        i96++;
                    }
                }
                i97++;
                z39 = z47;
            }
            z17 = z39;
            j17 |= j18;
            if (i96 > i49) {
                break;
            }
            int i99 = i89 + 1;
            int i100 = 0;
            while (i100 < childCount2) {
                android.view.View childAt2 = getChildAt(i100);
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams5 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt2.getLayoutParams();
                int i101 = i59;
                int i102 = i67;
                long j19 = 1 << i100;
                if ((j18 & j19) != 0) {
                    if (z38 && layoutParams5.f90878g) {
                        r47 = 1;
                        r47 = 1;
                        if (i49 == 1) {
                            childAt2.setPadding(i19 + i58, 0, i19, 0);
                        }
                    } else {
                        r47 = 1;
                    }
                    layoutParams5.f90875d += r47;
                    layoutParams5.f90879h = r47;
                    i49--;
                } else if (layoutParams5.f90875d == i99) {
                    j17 |= j19;
                }
                i100++;
                i59 = i101;
                i67 = i102;
            }
            z39 = true;
        }
        z17 = z39;
        int i103 = i59;
        int i104 = i67;
        boolean z48 = !z28 && i66 == 1;
        if (i49 <= 0 || j17 == 0 || (i49 >= i66 - 1 && !z48 && i104 <= 1)) {
            z18 = z17;
        } else {
            float bitCount = java.lang.Long.bitCount(j17);
            if (!z48) {
                if ((j17 & 1) != 0 && !((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) getChildAt(0).getLayoutParams()).f90878g) {
                    bitCount -= 0.5f;
                }
                int i105 = childCount2 - 1;
                if ((j17 & (1 << i105)) != 0 && !((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) getChildAt(i105).getLayoutParams()).f90878g) {
                    bitCount -= 0.5f;
                }
            }
            int i106 = bitCount > 0.0f ? (int) ((i49 * i58) / bitCount) : 0;
            boolean z49 = z17;
            for (int i107 = 0; i107 < childCount2; i107++) {
                if ((j17 & (1 << i107)) != 0) {
                    android.view.View childAt3 = getChildAt(i107);
                    p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams6 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.ViewOnClickListenerC0069xaad3004d) {
                        layoutParams6.f90876e = i106;
                        layoutParams6.f90879h = true;
                        if (i107 == 0 && !layoutParams6.f90878g) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (-i106) / 2;
                        }
                        z49 = true;
                    } else {
                        if (layoutParams6.f90874c) {
                            layoutParams6.f90876e = i106;
                            layoutParams6.f90879h = true;
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (-i106) / 2;
                            z49 = true;
                        } else {
                            if (i107 != 0) {
                                ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = i106 / 2;
                            }
                            if (i107 != childCount2 - 1) {
                                ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = i106 / 2;
                            }
                        }
                    }
                }
            }
            z18 = z49;
        }
        if (z18) {
            for (int i108 = 0; i108 < childCount2; i108++) {
                android.view.View childAt4 = getChildAt(i108);
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams layoutParams7 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f90879h) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((layoutParams7.f90875d * i58) + layoutParams7.f90876e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i86 != 1073741824) {
            i28 = i87;
            i27 = i103;
        } else {
            i27 = i88;
            i28 = i87;
        }
        setMeasuredDimension(i28, i27);
    }

    @Override // o.i0
    public void r(o.r rVar) {
        this.f90869v = rVar;
    }

    /* renamed from: setExpandedActionViewsExclusive */
    public void m2627xc7106781(boolean z17) {
        this.f90873z.f91212x = z17;
    }

    /* renamed from: setOnMenuItemClickListener */
    public void m2628x99906709(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u uVar) {
        this.G = uVar;
    }

    /* renamed from: setOverflowIcon */
    public void m2629x6f12211d(android.graphics.drawable.Drawable drawable) {
        m2623xfb827dd5();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f90873z;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m mVar = qVar.f91204p;
        if (mVar != null) {
            mVar.setImageDrawable(drawable);
        } else {
            qVar.f91206r = true;
            qVar.f91205q = drawable;
        }
    }

    /* renamed from: setOverflowReserved */
    public void m2630x7ff37dcc(boolean z17) {
        this.f90872y = z17;
    }

    /* renamed from: setPopupTheme */
    public void m2631xa9dea67f(int i17) {
        if (this.f90871x != i17) {
            this.f90871x = i17;
            if (i17 == 0) {
                this.f90870w = getContext();
            } else {
                this.f90870w = new android.view.ContextThemeWrapper(getContext(), i17);
            }
        }
    }

    /* renamed from: setPresenter */
    public void m2632x24cd7466(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar) {
        this.f90873z = qVar;
        qVar.f423230n = this;
        this.f90869v = qVar.f423225f;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0098xfb43a331, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a.LayoutParams(getContext(), attributeSet);
    }
}
