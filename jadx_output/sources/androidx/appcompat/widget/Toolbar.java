package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class Toolbar extends android.view.ViewGroup {
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
    public final java.util.ArrayList f9477J;
    public final java.util.ArrayList K;
    public final int[] L;
    public androidx.appcompat.widget.v2 M;
    public final androidx.appcompat.widget.u N;
    public androidx.appcompat.widget.z2 P;
    public androidx.appcompat.widget.q Q;
    public androidx.appcompat.widget.u2 R;
    public o.f0 S;
    public o.p T;
    public boolean U;
    public final java.lang.Runnable V;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.ActionMenuView f9478d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f9479e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f9480f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f9481g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f9482h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f9483i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.CharSequence f9484m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageButton f9485n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f9486o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f9487p;

    /* renamed from: q, reason: collision with root package name */
    public int f9488q;

    /* renamed from: r, reason: collision with root package name */
    public int f9489r;

    /* renamed from: s, reason: collision with root package name */
    public int f9490s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9491t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9492u;

    /* renamed from: v, reason: collision with root package name */
    public int f9493v;

    /* renamed from: w, reason: collision with root package name */
    public int f9494w;

    /* renamed from: x, reason: collision with root package name */
    public int f9495x;

    /* renamed from: y, reason: collision with root package name */
    public int f9496y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.appcompat.widget.q1 f9497z;

    /* loaded from: classes15.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.SavedState> CREATOR = new androidx.appcompat.widget.w2();

        /* renamed from: f, reason: collision with root package name */
        public int f9499f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f9500g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9499f = parcel.readInt();
            this.f9500g = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeInt(this.f9499f);
            parcel.writeInt(this.f9500g ? 1 : 0);
        }
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478468kn);
    }

    private android.view.MenuInflater getMenuInflater() {
        return new n.j(getContext());
    }

    public final void a(java.util.List list, int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = n3.v0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(this));
        list.clear();
        if (!z17) {
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = getChildAt(i18);
                androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f9498b == 0 && p(childAt)) {
                    int i19 = layoutParams.f9070a;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
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
            androidx.appcompat.widget.Toolbar.LayoutParams layoutParams2 = (androidx.appcompat.widget.Toolbar.LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f9498b == 0 && p(childAt2)) {
                int i28 = layoutParams2.f9070a;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
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
        androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams;
        generateDefaultLayoutParams.f9498b = 1;
        if (!z17 || this.f9486o == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.K.add(view);
        }
    }

    public final void c() {
        d();
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9478d;
        if (actionMenuView.f9336v == null) {
            o.r rVar = (o.r) actionMenuView.getMenu();
            if (this.R == null) {
                this.R = new androidx.appcompat.widget.u2(this);
            }
            this.f9478d.setExpandedActionViewsExclusive(true);
            rVar.b(this.R, this.f9487p);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams);
    }

    public final void d() {
        if (this.f9478d == null) {
            androidx.appcompat.widget.ActionMenuView actionMenuView = new androidx.appcompat.widget.ActionMenuView(getContext(), null);
            this.f9478d = actionMenuView;
            actionMenuView.setPopupTheme(this.f9488q);
            this.f9478d.setOnMenuItemClickListener(this.N);
            androidx.appcompat.widget.ActionMenuView actionMenuView2 = this.f9478d;
            o.f0 f0Var = this.S;
            o.p pVar = this.T;
            actionMenuView2.A = f0Var;
            actionMenuView2.B = pVar;
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f9070a = (this.f9491t & 112) | 8388613;
            this.f9478d.setLayoutParams(generateDefaultLayoutParams);
            b(this.f9478d, false);
        }
    }

    public final void e() {
        if (this.f9481g == null) {
            this.f9481g = new androidx.appcompat.widget.AppCompatImageButton(getContext(), null, com.tencent.mm.R.attr.f478467km);
            androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f9070a = (this.f9491t & 112) | 8388611;
            this.f9481g.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams() {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.Toolbar.LayoutParams ? new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.widget.Toolbar.LayoutParams) layoutParams) : layoutParams instanceof androidx.appcompat.app.ActionBar$LayoutParams ? new androidx.appcompat.widget.Toolbar.LayoutParams((androidx.appcompat.app.ActionBar$LayoutParams) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.appcompat.widget.Toolbar.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.appcompat.widget.Toolbar.LayoutParams(layoutParams);
    }

    public int getContentInsetEnd() {
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        if (q1Var != null) {
            return q1Var.f9690g ? q1Var.f9684a : q1Var.f9685b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i17 = this.B;
        return i17 != Integer.MIN_VALUE ? i17 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        if (q1Var != null) {
            return q1Var.f9684a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        if (q1Var != null) {
            return q1Var.f9685b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        if (q1Var != null) {
            return q1Var.f9690g ? q1Var.f9685b : q1Var.f9684a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i17 = this.A;
        return i17 != Integer.MIN_VALUE ? i17 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        o.r rVar;
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9478d;
        return actionMenuView != null && (rVar = actionMenuView.f9336v) != null && rVar.hasVisibleItems() ? java.lang.Math.max(getContentInsetEnd(), java.lang.Math.max(this.B, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? java.lang.Math.max(getContentInsetStart(), java.lang.Math.max(this.A, 0)) : getContentInsetStart();
    }

    public android.graphics.drawable.Drawable getLogo() {
        android.widget.ImageView imageView = this.f9482h;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public java.lang.CharSequence getLogoDescription() {
        android.widget.ImageView imageView = this.f9482h;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public android.view.Menu getMenu() {
        c();
        return this.f9478d.getMenu();
    }

    public java.lang.CharSequence getNavigationContentDescription() {
        android.widget.ImageButton imageButton = this.f9481g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
        android.widget.ImageButton imageButton = this.f9481g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.q getOuterActionMenuPresenter() {
        return this.Q;
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
        c();
        return this.f9478d.getOverflowIcon();
    }

    public android.content.Context getPopupContext() {
        return this.f9487p;
    }

    public int getPopupTheme() {
        return this.f9488q;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.E;
    }

    public java.lang.CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.f9496y;
    }

    public int getTitleMarginEnd() {
        return this.f9494w;
    }

    public int getTitleMarginStart() {
        return this.f9493v;
    }

    public int getTitleMarginTop() {
        return this.f9495x;
    }

    public androidx.appcompat.widget.x0 getWrapper() {
        if (this.P == null) {
            this.P = new androidx.appcompat.widget.z2(this, true);
        }
        return this.P;
    }

    public final int h(android.view.View view, int i17) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i18 = i17 > 0 ? (measuredHeight - i17) / 2 : 0;
        int i19 = layoutParams.f9070a & 112;
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
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
        int i19 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = i17 + java.lang.Math.max(0, i19);
        iArr[0] = java.lang.Math.max(0, -i19);
        int h17 = h(view, i18);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h17, max + measuredWidth, view.getMeasuredHeight() + h17);
        return max + measuredWidth + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    public final int m(android.view.View view, int i17, int[] iArr, int i18) {
        androidx.appcompat.widget.Toolbar.LayoutParams layoutParams = (androidx.appcompat.widget.Toolbar.LayoutParams) view.getLayoutParams();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem findItem;
        if (!(parcelable instanceof androidx.appcompat.widget.Toolbar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.Toolbar.SavedState savedState = (androidx.appcompat.widget.Toolbar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9478d;
        o.r rVar = actionMenuView != null ? actionMenuView.f9336v : null;
        int i17 = savedState.f9499f;
        if (i17 != 0 && this.R != null && rVar != null && (findItem = rVar.findItem(i17)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f9500g) {
            java.lang.Runnable runnable = this.V;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
        if (this.f9497z == null) {
            this.f9497z = new androidx.appcompat.widget.q1();
        }
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        boolean z17 = i17 == 1;
        if (z17 == q1Var.f9690g) {
            return;
        }
        q1Var.f9690g = z17;
        if (!q1Var.f9691h) {
            q1Var.f9684a = q1Var.f9688e;
            q1Var.f9685b = q1Var.f9689f;
            return;
        }
        if (z17) {
            int i18 = q1Var.f9687d;
            if (i18 == Integer.MIN_VALUE) {
                i18 = q1Var.f9688e;
            }
            q1Var.f9684a = i18;
            int i19 = q1Var.f9686c;
            if (i19 == Integer.MIN_VALUE) {
                i19 = q1Var.f9689f;
            }
            q1Var.f9685b = i19;
            return;
        }
        int i27 = q1Var.f9686c;
        if (i27 == Integer.MIN_VALUE) {
            i27 = q1Var.f9688e;
        }
        q1Var.f9684a = i27;
        int i28 = q1Var.f9687d;
        if (i28 == Integer.MIN_VALUE) {
            i28 = q1Var.f9689f;
        }
        q1Var.f9685b = i28;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        o.u uVar;
        androidx.appcompat.widget.Toolbar.SavedState savedState = new androidx.appcompat.widget.Toolbar.SavedState(super.onSaveInstanceState());
        androidx.appcompat.widget.u2 u2Var = this.R;
        if (u2Var != null && (uVar = u2Var.f9729e) != null) {
            savedState.f9499f = uVar.f341804d;
        }
        androidx.appcompat.widget.ActionMenuView actionMenuView = this.f9478d;
        boolean z17 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.q qVar = actionMenuView.f9340z;
            if (qVar != null && qVar.m()) {
                z17 = true;
            }
        }
        savedState.f9500g = z17;
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

    public void setCollapsible(boolean z17) {
        this.U = z17;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i17) {
        if (i17 < 0) {
            i17 = Integer.MIN_VALUE;
        }
        if (i17 != this.B) {
            this.B = i17;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i17) {
        if (i17 < 0) {
            i17 = Integer.MIN_VALUE;
        }
        if (i17 != this.A) {
            this.A = i17;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i17) {
        setLogo(k.a.a(getContext(), i17));
    }

    public void setLogoDescription(int i17) {
        setLogoDescription(getContext().getText(i17));
    }

    public void setNavigationContentDescription(int i17) {
        setNavigationContentDescription(i17 != 0 ? getContext().getText(i17) : null);
    }

    public void setNavigationIcon(int i17) {
        setNavigationIcon(k.a.a(getContext(), i17));
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onClickListener) {
        e();
        this.f9481g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.v2 v2Var) {
        this.M = v2Var;
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable drawable) {
        c();
        this.f9478d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i17) {
        if (this.f9488q != i17) {
            this.f9488q = i17;
            if (i17 == 0) {
                this.f9487p = getContext();
            } else {
                this.f9487p = new android.view.ContextThemeWrapper(getContext(), i17);
            }
        }
    }

    public void setSubtitle(int i17) {
        setSubtitle(getContext().getText(i17));
    }

    public void setSubtitleTextColor(int i17) {
        this.G = i17;
        android.widget.TextView textView = this.f9480f;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public void setTitle(int i17) {
        setTitle(getContext().getText(i17));
    }

    public void setTitleMarginBottom(int i17) {
        this.f9496y = i17;
        requestLayout();
    }

    public void setTitleMarginEnd(int i17) {
        this.f9494w = i17;
        requestLayout();
    }

    public void setTitleMarginStart(int i17) {
        this.f9493v = i17;
        requestLayout();
    }

    public void setTitleMarginTop(int i17) {
        this.f9495x = i17;
        requestLayout();
    }

    public void setTitleTextColor(int i17) {
        this.F = i17;
        android.widget.TextView textView = this.f9479e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends androidx.appcompat.app.ActionBar$LayoutParams {

        /* renamed from: b, reason: collision with root package name */
        public int f9498b;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9498b = 0;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f9498b = 0;
            this.f9070a = 8388627;
        }

        public LayoutParams(androidx.appcompat.widget.Toolbar.LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar$LayoutParams) layoutParams);
            this.f9498b = 0;
            this.f9498b = layoutParams.f9498b;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
            super(actionBar$LayoutParams);
            this.f9498b = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9498b = 0;
            ((android.view.ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((android.view.ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9498b = 0;
        }
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.C = 8388627;
        this.f9477J = new java.util.ArrayList();
        this.K = new java.util.ArrayList();
        this.L = new int[2];
        this.N = new androidx.appcompat.widget.r2(this);
        this.V = new androidx.appcompat.widget.s2(this);
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(getContext(), attributeSet, j.a.f296198z, i17, 0);
        this.f9489r = l17.i(27, 0);
        this.f9490s = l17.i(18, 0);
        android.content.res.TypedArray typedArray = l17.f9693b;
        this.C = typedArray.getInteger(0, 8388627);
        this.f9491t = typedArray.getInteger(2, 48);
        int c17 = l17.c(21, 0);
        c17 = l17.k(26) ? l17.c(26, c17) : c17;
        this.f9496y = c17;
        this.f9495x = c17;
        this.f9494w = c17;
        this.f9493v = c17;
        int c18 = l17.c(24, -1);
        if (c18 >= 0) {
            this.f9493v = c18;
        }
        int c19 = l17.c(23, -1);
        if (c19 >= 0) {
            this.f9494w = c19;
        }
        int c27 = l17.c(25, -1);
        if (c27 >= 0) {
            this.f9495x = c27;
        }
        int c28 = l17.c(22, -1);
        if (c28 >= 0) {
            this.f9496y = c28;
        }
        this.f9492u = l17.d(13, -1);
        int c29 = l17.c(9, Integer.MIN_VALUE);
        int c37 = l17.c(5, Integer.MIN_VALUE);
        int d17 = l17.d(7, 0);
        int d18 = l17.d(8, 0);
        if (this.f9497z == null) {
            this.f9497z = new androidx.appcompat.widget.q1();
        }
        androidx.appcompat.widget.q1 q1Var = this.f9497z;
        q1Var.f9691h = false;
        if (d17 != Integer.MIN_VALUE) {
            q1Var.f9688e = d17;
            q1Var.f9684a = d17;
        }
        if (d18 != Integer.MIN_VALUE) {
            q1Var.f9689f = d18;
            q1Var.f9685b = d18;
        }
        if (c29 != Integer.MIN_VALUE || c37 != Integer.MIN_VALUE) {
            q1Var.a(c29, c37);
        }
        this.A = l17.c(10, Integer.MIN_VALUE);
        this.B = l17.c(6, Integer.MIN_VALUE);
        this.f9483i = l17.e(4);
        this.f9484m = l17.j(3);
        java.lang.CharSequence j17 = l17.j(20);
        if (!android.text.TextUtils.isEmpty(j17)) {
            setTitle(j17);
        }
        java.lang.CharSequence j18 = l17.j(17);
        if (!android.text.TextUtils.isEmpty(j18)) {
            setSubtitle(j18);
        }
        this.f9487p = getContext();
        setPopupTheme(l17.i(16, 0));
        android.graphics.drawable.Drawable e17 = l17.e(15);
        if (e17 != null) {
            setNavigationIcon(e17);
        }
        java.lang.CharSequence j19 = l17.j(14);
        if (!android.text.TextUtils.isEmpty(j19)) {
            setNavigationContentDescription(j19);
        }
        android.graphics.drawable.Drawable e18 = l17.e(11);
        if (e18 != null) {
            setLogo(e18);
        }
        java.lang.CharSequence j27 = l17.j(12);
        if (!android.text.TextUtils.isEmpty(j27)) {
            setLogoDescription(j27);
        }
        if (l17.k(28)) {
            setTitleTextColor(typedArray.getColor(28, -1));
        }
        if (l17.k(19)) {
            setSubtitleTextColor(typedArray.getColor(19, -1));
        }
        l17.m();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.Toolbar.LayoutParams(getContext(), attributeSet);
    }

    public void setLogo(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.f9482h == null) {
                this.f9482h = new androidx.appcompat.widget.AppCompatImageView(getContext(), null);
            }
            if (!k(this.f9482h)) {
                b(this.f9482h, true);
            }
        } else {
            android.widget.ImageView imageView = this.f9482h;
            if (imageView != null && k(imageView)) {
                removeView(this.f9482h);
                this.K.remove(this.f9482h);
            }
        }
        android.widget.ImageView imageView2 = this.f9482h;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence) && this.f9482h == null) {
            this.f9482h = new androidx.appcompat.widget.AppCompatImageView(getContext(), null);
        }
        android.widget.ImageView imageView = this.f9482h;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            e();
        }
        android.widget.ImageButton imageButton = this.f9481g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            e();
            if (!k(this.f9481g)) {
                b(this.f9481g, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.f9481g;
            if (imageButton != null && k(imageButton)) {
                removeView(this.f9481g);
                this.K.remove(this.f9481g);
            }
        }
        android.widget.ImageButton imageButton2 = this.f9481g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f9480f == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context, null);
                this.f9480f = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9480f.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i17 = this.f9490s;
                if (i17 != 0) {
                    this.f9480f.setTextAppearance(context, i17);
                }
                int i18 = this.G;
                if (i18 != 0) {
                    this.f9480f.setTextColor(i18);
                }
            }
            if (!k(this.f9480f)) {
                b(this.f9480f, true);
            }
        } else {
            android.widget.TextView textView = this.f9480f;
            if (textView != null && k(textView)) {
                removeView(this.f9480f);
                this.K.remove(this.f9480f);
            }
        }
        android.widget.TextView textView2 = this.f9480f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            if (this.f9479e == null) {
                android.content.Context context = getContext();
                androidx.appcompat.widget.AppCompatTextView appCompatTextView = new androidx.appcompat.widget.AppCompatTextView(context, null);
                this.f9479e = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f9479e.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i17 = this.f9489r;
                if (i17 != 0) {
                    this.f9479e.setTextAppearance(context, i17);
                }
                int i18 = this.F;
                if (i18 != 0) {
                    this.f9479e.setTextColor(i18);
                }
            }
            if (!k(this.f9479e)) {
                b(this.f9479e, true);
            }
        } else {
            android.widget.TextView textView = this.f9479e;
            if (textView != null && k(textView)) {
                removeView(this.f9479e);
                this.K.remove(this.f9479e);
            }
        }
        android.widget.TextView textView2 = this.f9479e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }
}
