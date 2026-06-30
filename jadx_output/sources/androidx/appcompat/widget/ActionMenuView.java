package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements o.q, o.i0 {
    public o.f0 A;
    public o.p B;
    public boolean C;
    public int D;
    public final int E;
    public final int F;
    public androidx.appcompat.widget.u G;

    /* renamed from: v, reason: collision with root package name */
    public o.r f9336v;

    /* renamed from: w, reason: collision with root package name */
    public android.content.Context f9337w;

    /* renamed from: x, reason: collision with root package name */
    public int f9338x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9339y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.appcompat.widget.q f9340z;

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {

        /* renamed from: c, reason: collision with root package name */
        public boolean f9341c;

        /* renamed from: d, reason: collision with root package name */
        public int f9342d;

        /* renamed from: e, reason: collision with root package name */
        public int f9343e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f9344f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9345g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9346h;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9341c = layoutParams.f9341c;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f9341c = false;
        }
    }

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f17 = context.getResources().getDisplayMetrics().density;
        this.E = (int) (56.0f * f17);
        this.F = (int) (f17 * 4.0f);
        this.f9337w = context;
        this.f9338x = 0;
    }

    @Override // o.q
    public boolean c(o.u uVar) {
        return this.f9336v.q(uVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: g */
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
        layoutParams.f9416b = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
        layoutParams.f9416b = 16;
        return layoutParams;
    }

    public android.view.Menu getMenu() {
        if (this.f9336v == null) {
            android.content.Context context = getContext();
            o.r rVar = new o.r(context);
            this.f9336v = rVar;
            rVar.f341784h = new androidx.appcompat.widget.t(this);
            androidx.appcompat.widget.q qVar = new androidx.appcompat.widget.q(context);
            this.f9340z = qVar;
            qVar.f9674s = true;
            qVar.f9675t = true;
            o.f0 f0Var = this.A;
            if (f0Var == null) {
                f0Var = new androidx.appcompat.widget.s();
            }
            qVar.f341694h = f0Var;
            this.f9336v.b(qVar, this.f9337w);
            androidx.appcompat.widget.q qVar2 = this.f9340z;
            qVar2.f341697n = this;
            this.f9336v = qVar2.f341692f;
        }
        return this.f9336v;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.q qVar = this.f9340z;
        androidx.appcompat.widget.m mVar = qVar.f9671p;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        if (qVar.f9673r) {
            return qVar.f9672q;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f9338x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: h */
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionMenuView.LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2 = new androidx.appcompat.widget.ActionMenuView.LayoutParams(-2, -2);
            layoutParams2.f9416b = 16;
            return layoutParams2;
        }
        androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams3 = layoutParams instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams ? new androidx.appcompat.widget.ActionMenuView.LayoutParams((androidx.appcompat.widget.ActionMenuView.LayoutParams) layoutParams) : new androidx.appcompat.widget.ActionMenuView.LayoutParams(layoutParams);
        if (layoutParams3.f9416b <= 0) {
            layoutParams3.f9416b = 16;
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
        if (i17 < getChildCount() && (childAt instanceof androidx.appcompat.widget.r)) {
            z17 = false | ((androidx.appcompat.widget.r) childAt).c();
        }
        return (i17 <= 0 || !(childAt2 instanceof androidx.appcompat.widget.r)) ? z17 : z17 | ((androidx.appcompat.widget.r) childAt2).d();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.q qVar = this.f9340z;
        if (qVar != null) {
            qVar.c(false);
            if (this.f9340z.m()) {
                this.f9340z.l();
                this.f9340z.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.q qVar = this.f9340z;
        if (qVar != null) {
            qVar.l();
            androidx.appcompat.widget.i iVar = qVar.B;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f341711j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int width;
        int i28;
        if (!this.C) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        int childCount = getChildCount();
        int i29 = (i27 - i18) / 2;
        int dividerWidth = getDividerWidth();
        int i37 = i19 - i17;
        int paddingRight = (i37 - getPaddingRight()) - getPaddingLeft();
        boolean a17 = androidx.appcompat.widget.h3.a(this);
        int i38 = 0;
        int i39 = 0;
        for (int i47 = 0; i47 < childCount; i47++) {
            android.view.View childAt = getChildAt(i47);
            if (childAt.getVisibility() != 8) {
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f9341c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i47)) {
                        measuredWidth += dividerWidth;
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
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f9341c) {
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
            androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f9341c) {
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
    /* JADX WARN: Type inference failed for: r4v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
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
        if (this.C && (rVar = this.f9336v) != null && size != this.D) {
            this.D = size;
            rVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.C || childCount <= 0) {
            for (int i39 = 0; i39 < childCount; i39++) {
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams = (androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i39).getLayoutParams();
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
                boolean z29 = childAt instanceof androidx.appcompat.view.menu.ActionMenuItemView;
                int i78 = i66 + 1;
                if (z29) {
                    childAt.setPadding(i19, 0, i19, 0);
                }
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt.getLayoutParams();
                layoutParams2.f9346h = false;
                layoutParams2.f9343e = 0;
                layoutParams2.f9342d = 0;
                layoutParams2.f9344f = false;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.f9345g = z29 && ((androidx.appcompat.view.menu.ActionMenuItemView) childAt).b();
                int i79 = layoutParams2.f9341c ? 1 : i49;
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt.getLayoutParams();
                i29 = mode;
                i37 = paddingTop;
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                androidx.appcompat.view.menu.ActionMenuItemView actionMenuItemView = z29 ? (androidx.appcompat.view.menu.ActionMenuItemView) childAt : null;
                boolean z37 = actionMenuItemView != null && actionMenuItemView.b();
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
                layoutParams3.f9344f = !layoutParams3.f9341c && z37;
                layoutParams3.f9342d = i38;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i58 * i38, 1073741824), makeMeasureSpec);
                i67 = java.lang.Math.max(i67, i38);
                if (layoutParams2.f9344f) {
                    i69++;
                }
                if (layoutParams2.f9341c) {
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
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams4 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i97).getLayoutParams();
                boolean z47 = z39;
                if (layoutParams4.f9344f) {
                    int i98 = layoutParams4.f9342d;
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
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams5 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt2.getLayoutParams();
                int i101 = i59;
                int i102 = i67;
                long j19 = 1 << i100;
                if ((j18 & j19) != 0) {
                    if (z38 && layoutParams5.f9345g) {
                        r47 = 1;
                        r47 = 1;
                        if (i49 == 1) {
                            childAt2.setPadding(i19 + i58, 0, i19, 0);
                        }
                    } else {
                        r47 = 1;
                    }
                    layoutParams5.f9342d += r47;
                    layoutParams5.f9346h = r47;
                    i49--;
                } else if (layoutParams5.f9342d == i99) {
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
                if ((j17 & 1) != 0 && !((androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(0).getLayoutParams()).f9345g) {
                    bitCount -= 0.5f;
                }
                int i105 = childCount2 - 1;
                if ((j17 & (1 << i105)) != 0 && !((androidx.appcompat.widget.ActionMenuView.LayoutParams) getChildAt(i105).getLayoutParams()).f9345g) {
                    bitCount -= 0.5f;
                }
            }
            int i106 = bitCount > 0.0f ? (int) ((i49 * i58) / bitCount) : 0;
            boolean z49 = z17;
            for (int i107 = 0; i107 < childCount2; i107++) {
                if ((j17 & (1 << i107)) != 0) {
                    android.view.View childAt3 = getChildAt(i107);
                    androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof androidx.appcompat.view.menu.ActionMenuItemView) {
                        layoutParams6.f9343e = i106;
                        layoutParams6.f9346h = true;
                        if (i107 == 0 && !layoutParams6.f9345g) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = (-i106) / 2;
                        }
                        z49 = true;
                    } else {
                        if (layoutParams6.f9341c) {
                            layoutParams6.f9343e = i106;
                            layoutParams6.f9346h = true;
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
                androidx.appcompat.widget.ActionMenuView.LayoutParams layoutParams7 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f9346h) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((layoutParams7.f9342d * i58) + layoutParams7.f9343e, 1073741824), childMeasureSpec);
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
        this.f9336v = rVar;
    }

    public void setExpandedActionViewsExclusive(boolean z17) {
        this.f9340z.f9679x = z17;
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.u uVar) {
        this.G = uVar;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.q qVar = this.f9340z;
        androidx.appcompat.widget.m mVar = qVar.f9671p;
        if (mVar != null) {
            mVar.setImageDrawable(drawable);
        } else {
            qVar.f9673r = true;
            qVar.f9672q = drawable;
        }
    }

    public void setOverflowReserved(boolean z17) {
        this.f9339y = z17;
    }

    public void setPopupTheme(int i17) {
        if (this.f9338x != i17) {
            this.f9338x = i17;
            if (i17 == 0) {
                this.f9337w = getContext();
            } else {
                this.f9337w = new android.view.ContextThemeWrapper(getContext(), i17);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.q qVar) {
        this.f9340z = qVar;
        qVar.f341697n = this;
        this.f9336v = qVar.f341692f;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionMenuView.LayoutParams(getContext(), attributeSet);
    }
}
