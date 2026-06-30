package androidx.core.widget;

/* loaded from: classes14.dex */
public class NestedScrollView extends android.widget.FrameLayout implements n3.h0, n3.d0, n3.o0 {
    public static final float H = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));
    public static final androidx.core.widget.m I = new androidx.core.widget.m();

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f11052J = {android.R.attr.fillViewport};
    public int A;
    public int B;
    public androidx.core.widget.NestedScrollView.SavedState C;
    public final n3.j0 D;
    public final n3.f0 E;
    public float F;
    public androidx.core.widget.o G;

    /* renamed from: d, reason: collision with root package name */
    public final float f11053d;

    /* renamed from: e, reason: collision with root package name */
    public long f11054e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f11055f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.OverScroller f11056g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.EdgeEffect f11057h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.EdgeEffect f11058i;

    /* renamed from: m, reason: collision with root package name */
    public int f11059m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11060n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11061o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f11062p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11063q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.VelocityTracker f11064r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11065s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11066t;

    /* renamed from: u, reason: collision with root package name */
    public int f11067u;

    /* renamed from: v, reason: collision with root package name */
    public int f11068v;

    /* renamed from: w, reason: collision with root package name */
    public int f11069w;

    /* renamed from: x, reason: collision with root package name */
    public int f11070x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f11071y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f11072z;

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState> CREATOR = new androidx.core.widget.p();

        /* renamed from: d, reason: collision with root package name */
        public int f11073d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11073d = parcel.readInt();
        }

        public java.lang.String toString() {
            return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.f11073d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f11073d);
        }
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478352hj);
    }

    public static boolean f(android.view.View view, android.view.View view2) {
        if (view == view2) {
            return true;
        }
        java.lang.Object parent = view.getParent();
        return (parent instanceof android.view.ViewGroup) && f((android.view.View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.F == 0.0f) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.Context context = getContext();
            if (!context.getTheme().resolveAttribute(android.R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new java.lang.IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.F;
    }

    @Override // n3.g0
    public boolean B(android.view.View view, android.view.View view2, int i17, int i18) {
        return (i17 & 2) != 0;
    }

    public boolean a(int i17) {
        android.view.View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        android.view.View findNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, findFocus, i17);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !g(findNextFocus, maxScrollAmount, getHeight())) {
            if (i17 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i17 == 130 && getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                maxScrollAmount = java.lang.Math.min((childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i17 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            q(maxScrollAmount, 0, 1, true);
        } else {
            android.graphics.Rect rect = this.f11055f;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            q(b(rect), 0, 1, true);
            findNextFocus.requestFocus(i17);
        }
        if (findFocus != null && findFocus.isFocused() && (!g(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    public int b(android.graphics.Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i17 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i18 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i17 - verticalFadingEdgeLength : i17;
        int i19 = rect.bottom;
        if (i19 > i18 && rect.top > scrollY) {
            return java.lang.Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i18) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i17);
        }
        if (rect.top >= scrollY || i19 >= i18) {
            return 0;
        }
        return java.lang.Math.max(rect.height() > height ? 0 - (i18 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f11055f
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L61
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L61
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L4c
            r6 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L5f
            if (r6 == r5) goto L5f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc7
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto Lb8
            r1 = 20
            if (r0 == r1) goto La8
            r1 = 62
            if (r0 == r1) goto L9d
            r6 = 92
            if (r0 == r6) goto L98
            r6 = 93
            if (r0 == r6) goto L93
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L8f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L8b
            goto Lc7
        L8b:
            r5.n(r3)
            goto Lc7
        L8f:
            r5.n(r4)
            goto Lc7
        L93:
            boolean r2 = r5.e(r3)
            goto Lc7
        L98:
            boolean r2 = r5.e(r4)
            goto Lc7
        L9d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto La4
            r3 = r4
        La4:
            r5.n(r3)
            goto Lc7
        La8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lb3
            boolean r2 = r5.e(r3)
            goto Lc7
        Lb3:
            boolean r2 = r5.a(r3)
            goto Lc7
        Lb8:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lc3
            boolean r2 = r5.e(r4)
            goto Lc7
        Lc3:
            boolean r2 = r5.a(r4)
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.c(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computeScroll() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        android.view.View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = java.lang.Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public void d(int i17) {
        if (getChildCount() > 0) {
            this.f11056g.fling(getScrollX(), getScrollY(), 0, i17, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.B = getScrollY();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || c(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.E.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.E.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.E.d(i17, i18, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.E.e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        super.draw(canvas);
        int scrollY = getScrollY();
        android.widget.EdgeEffect edgeEffect = this.f11057h;
        int i18 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = java.lang.Math.min(0, scrollY);
            if (androidx.core.widget.n.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i17 = getPaddingLeft() + 0;
            } else {
                i17 = 0;
            }
            if (androidx.core.widget.n.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i17, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.k(this);
            }
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect2 = this.f11058i;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = java.lang.Math.max(getScrollRange(), scrollY) + height2;
        if (androidx.core.widget.n.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i18 = 0 + getPaddingLeft();
        }
        if (androidx.core.widget.n.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i18 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.k(this);
        }
        canvas.restoreToCount(save2);
    }

    public boolean e(int i17) {
        int childCount;
        boolean z17 = i17 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f11055f;
        rect.top = 0;
        rect.bottom = height;
        if (z17 && (childCount = getChildCount()) > 0) {
            android.view.View childAt = getChildAt(childCount - 1);
            rect.bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.top = rect.bottom - height;
        }
        return o(i17, rect.top, rect.bottom);
    }

    public final boolean g(android.view.View view, int i17, int i18) {
        android.graphics.Rect rect = this.f11055f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i17 >= getScrollY() && rect.top - i17 <= getScrollY() + i18;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.D;
        return j0Var.f334346b | j0Var.f334345a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        android.view.View childAt = getChildAt(0);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        return java.lang.Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // n3.g0
    public void h(android.view.View view, android.view.View view2, int i17, int i18) {
        this.D.a(view, view2, i17, i18);
        u(2, i18);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.E.h(0);
    }

    public final void i(int i17, int i18, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i17);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.E.f(0, scrollY2, 0, i17 - scrollY2, null, i18, iArr);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.E.f334334d;
    }

    @Override // n3.g0
    public void j(android.view.View view, int i17) {
        this.D.b(view, i17);
        p(i17);
    }

    public final void k(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11070x) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.f11059m = (int) motionEvent.getY(i17);
            this.f11070x = motionEvent.getPointerId(i17);
            android.view.VelocityTracker velocityTracker = this.f11064r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // n3.g0
    public void l(android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        i(i27, i28, null);
    }

    public boolean m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        boolean z18;
        boolean z19;
        int overScrollMode = getOverScrollMode();
        boolean z27 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z28 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z29 = overScrollMode == 0 || (overScrollMode == 1 && z27);
        boolean z37 = overScrollMode == 0 || (overScrollMode == 1 && z28);
        int i39 = i19 + i17;
        int i47 = !z29 ? 0 : i37;
        int i48 = i27 + i18;
        int i49 = !z37 ? 0 : i38;
        int i57 = -i47;
        int i58 = i47 + i28;
        int i59 = -i49;
        int i66 = i49 + i29;
        if (i39 > i58) {
            i39 = i58;
            z18 = true;
        } else if (i39 < i57) {
            z18 = true;
            i39 = i57;
        } else {
            z18 = false;
        }
        if (i48 > i66) {
            i48 = i66;
            z19 = true;
        } else if (i48 < i59) {
            z19 = true;
            i48 = i59;
        } else {
            z19 = false;
        }
        if (z19 && !this.E.h(1)) {
            this.f11056g.springBack(i39, i48, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i39, i48, z18, z19);
        return z18 || z19;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(int i17) {
        boolean z17 = i17 == 130;
        int height = getHeight();
        android.graphics.Rect rect = this.f11055f;
        if (z17) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                android.view.View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        int i18 = rect.top;
        int i19 = height + i18;
        rect.bottom = i19;
        return o(i17, i18, i19);
    }

    public final boolean o(int i17, int i18, int i19) {
        boolean z17;
        int height = getHeight();
        int scrollY = getScrollY();
        int i27 = height + scrollY;
        boolean z18 = i17 == 33;
        java.util.ArrayList<android.view.View> focusables = getFocusables(2);
        int size = focusables.size();
        android.view.View view = null;
        boolean z19 = false;
        for (int i28 = 0; i28 < size; i28++) {
            android.view.View view2 = focusables.get(i28);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i18 < bottom && top < i19) {
                boolean z27 = i18 < top && bottom < i19;
                if (view == null) {
                    view = view2;
                    z19 = z27;
                } else {
                    boolean z28 = (z18 && top < view.getTop()) || (!z18 && bottom > view.getBottom());
                    if (z19) {
                        if (z27) {
                            if (!z28) {
                            }
                            view = view2;
                        }
                    } else if (z27) {
                        view = view2;
                        z19 = true;
                    } else {
                        if (!z28) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i18 < scrollY || i19 > i27) {
            q(z18 ? i18 - scrollY : i19 - i27, 0, 1, true);
            z17 = true;
        } else {
            z17 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i17);
        }
        return z17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11061o = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent motionEvent) {
        int i17;
        float f17;
        if (motionEvent.getAction() != 8 || this.f11063q) {
            return false;
        }
        if (n3.c0.a(motionEvent, 2)) {
            f17 = motionEvent.getAxisValue(9);
            i17 = (int) motionEvent.getX();
        } else if (n3.c0.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i17 = getWidth() / 2;
            f17 = axisValue;
        } else {
            i17 = 0;
            f17 = 0.0f;
        }
        if (f17 == 0.0f) {
            return false;
        }
        q(-((int) (f17 * getVerticalScrollFactorCompat())), i17, 1, n3.c0.a(motionEvent, 8194));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        int i29 = 0;
        this.f11060n = false;
        android.view.View view = this.f11062p;
        if (view != null && f(view, this)) {
            android.view.View view2 = this.f11062p;
            android.graphics.Rect rect = this.f11055f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b17 = b(rect);
            if (b17 != 0) {
                scrollBy(0, b17);
            }
        }
        this.f11062p = null;
        if (!this.f11061o) {
            if (this.C != null) {
                scrollTo(getScrollX(), this.C.f11073d);
                this.C = null;
            }
            if (getChildCount() > 0) {
                android.view.View childAt = getChildAt(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
                i28 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i28 = 0;
            }
            int paddingTop = ((i27 - i18) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i28 && scrollY >= 0) {
                i29 = paddingTop + scrollY > i28 ? i28 - paddingTop : scrollY;
            }
            if (i29 != scrollY) {
                scrollTo(getScrollX(), i29);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f11061o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f11065s && android.view.View.MeasureSpec.getMode(i18) != 0 && getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f17, float f18, boolean z17) {
        if (z17) {
            return false;
        }
        dispatchNestedFling(0.0f, f18, true);
        d((int) f18);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f17, float f18) {
        return dispatchNestedPreFling(f17, f18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i17, int i18, int[] iArr) {
        t(view, i17, i18, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
        i(i27, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        h(view, view2, i17, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i17, int i18, boolean z17, boolean z18) {
        super.scrollTo(i17, i18);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        if (i17 == 2) {
            i17 = 130;
        } else if (i17 == 1) {
            i17 = 33;
        }
        android.view.View findNextFocus = rect == null ? android.view.FocusFinder.getInstance().findNextFocus(this, null, i17) : android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i17);
        if (findNextFocus == null || (true ^ g(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i17, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.core.widget.NestedScrollView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.core.widget.NestedScrollView.SavedState savedState = (androidx.core.widget.NestedScrollView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.C = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.core.widget.NestedScrollView.SavedState savedState = new androidx.core.widget.NestedScrollView.SavedState(super.onSaveInstanceState());
        savedState.f11073d = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i17, int i18, int i19, int i27) {
        super.onScrollChanged(i17, i18, i19, i27);
        androidx.core.widget.o oVar = this.G;
        if (oVar != null) {
            oVar.a(this, i17, i18, i19, i27);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        android.view.View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !g(findFocus, 0, i27)) {
            return;
        }
        android.graphics.Rect rect = this.f11055f;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int b17 = b(rect);
        if (b17 != 0) {
            if (this.f11066t) {
                s(0, b17, 250, false);
            } else {
                scrollBy(0, b17);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        return B(view, view2, i17, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        j(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // n3.d0
    public void p(int i17) {
        this.E.k(i17);
    }

    public final int q(int i17, int i18, int i19, boolean z17) {
        int i27;
        int i28;
        if (i19 == 1) {
            u(2, i19);
        }
        boolean d17 = this.E.d(0, i17, this.f11072z, this.f11071y, i19);
        boolean z18 = false;
        int[] iArr = this.f11072z;
        int[] iArr2 = this.f11071y;
        if (d17) {
            i27 = i17 - iArr[1];
            i28 = iArr2[1] + 0;
        } else {
            i27 = i17;
            i28 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z19 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z17;
        boolean z27 = m(0, i27, 0, scrollY, 0, scrollRange, 0, 0, true) && !this.E.h(i19);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.E.f(0, scrollY2, 0, i27 - scrollY2, this.f11071y, i19, iArr);
        int i29 = i28 + iArr2[1];
        int i37 = i27 - iArr[1];
        int i38 = scrollY + i37;
        android.widget.EdgeEffect edgeEffect = this.f11058i;
        android.widget.EdgeEffect edgeEffect2 = this.f11057h;
        if (i38 < 0) {
            if (z19) {
                androidx.core.widget.i.d(edgeEffect2, (-i37) / getHeight(), i18 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i38 > scrollRange && z19) {
            androidx.core.widget.i.d(edgeEffect, i37 / getHeight(), 1.0f - (i18 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z18 = z27;
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
        if (z18 && i19 == 0) {
            this.f11064r.clear();
        }
        if (i19 == 1) {
            p(i19);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i29;
    }

    public final boolean r(android.widget.EdgeEffect edgeEffect, int i17) {
        if (i17 > 0) {
            return true;
        }
        float a17 = androidx.core.widget.i.a(edgeEffect) * getHeight();
        float abs = java.lang.Math.abs(-i17) * 0.35f;
        float f17 = this.f11053d * 0.015f;
        double log = java.lang.Math.log(abs / f17);
        double d17 = H;
        return ((float) (((double) f17) * java.lang.Math.exp((d17 / (d17 - 1.0d)) * log))) < a17;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (this.f11060n) {
            this.f11062p = view2;
        } else {
            android.graphics.Rect rect = this.f11055f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int b17 = b(rect);
            if (b17 != 0) {
                scrollBy(0, b17);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z17) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b17 = b(rect);
        boolean z18 = b17 != 0;
        if (z18) {
            if (z17) {
                scrollBy(0, b17);
            } else {
                s(0, b17, 250, false);
            }
        }
        return z18;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        android.view.VelocityTracker velocityTracker;
        if (z17 && (velocityTracker = this.f11064r) != null) {
            velocityTracker.recycle();
            this.f11064r = null;
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f11060n = true;
        super.requestLayout();
    }

    public final void s(int i17, int i18, int i19, boolean z17) {
        if (getChildCount() == 0) {
            return;
        }
        if (android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.f11054e > 250) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f11056g.startScroll(getScrollX(), scrollY, 0, java.lang.Math.max(0, java.lang.Math.min(i18 + scrollY, java.lang.Math.max(0, height - height2))) - scrollY, i19);
            if (z17) {
                u(2, 1);
            } else {
                p(1);
            }
            this.B = getScrollY();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        } else {
            if (!this.f11056g.isFinished()) {
                this.f11056g.abortAnimation();
                p(1);
            }
            scrollBy(i17, i18);
        }
        this.f11054e = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i17 < 0) {
                i17 = 0;
            } else if (width + i17 > width2) {
                i17 = width2 - width;
            }
            if (height >= height2 || i18 < 0) {
                i18 = 0;
            } else if (height + i18 > height2) {
                i18 = height2 - height;
            }
            if (i17 == getScrollX() && i18 == getScrollY()) {
                return;
            }
            super.scrollTo(i17, i18);
        }
    }

    public void setFillViewport(boolean z17) {
        if (z17 != this.f11065s) {
            this.f11065s = z17;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.E.i(z17);
    }

    public void setOnScrollChangeListener(androidx.core.widget.o oVar) {
        this.G = oVar;
    }

    public void setSmoothScrollingEnabled(boolean z17) {
        this.f11066t = z17;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return u(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        p(0);
    }

    @Override // n3.g0
    public void t(android.view.View view, int i17, int i18, int[] iArr, int i19) {
        this.E.d(i17, i18, iArr, null, i19);
    }

    public boolean u(int i17, int i18) {
        return this.E.j(i17, i18);
    }

    public final boolean v(android.view.MotionEvent motionEvent) {
        boolean z17;
        android.widget.EdgeEffect edgeEffect = this.f11057h;
        if (androidx.core.widget.i.a(edgeEffect) != 0.0f) {
            androidx.core.widget.i.d(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z17 = true;
        } else {
            z17 = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.f11058i;
        if (androidx.core.widget.i.a(edgeEffect2) == 0.0f) {
            return z17;
        }
        androidx.core.widget.i.d(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // n3.h0
    public void z(android.view.View view, int i17, int i18, int i19, int i27, int i28, int[] iArr) {
        i(i27, i28, iArr);
    }

    public NestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.EdgeEffect edgeEffect;
        android.widget.EdgeEffect edgeEffect2;
        this.f11055f = new android.graphics.Rect();
        this.f11060n = true;
        this.f11061o = false;
        this.f11062p = null;
        this.f11063q = false;
        this.f11066t = true;
        this.f11070x = -1;
        this.f11071y = new int[2];
        this.f11072z = new int[2];
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 31) {
            edgeEffect = androidx.core.widget.h.a(context, attributeSet);
        } else {
            edgeEffect = new android.widget.EdgeEffect(context);
        }
        this.f11057h = edgeEffect;
        if (i18 >= 31) {
            edgeEffect2 = androidx.core.widget.h.a(context, attributeSet);
        } else {
            edgeEffect2 = new android.widget.EdgeEffect(context);
        }
        this.f11058i = edgeEffect2;
        this.f11053d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f11056g = new android.widget.OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        this.f11067u = viewConfiguration.getScaledTouchSlop();
        this.f11068v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11069w = viewConfiguration.getScaledMaximumFlingVelocity();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11052J, i17, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.D = new n3.j0(this);
        this.E = new n3.f0(this);
        setNestedScrollingEnabled(true);
        n3.l1.l(this, I);
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (getChildCount() <= 0) {
            super.addView(view, i17);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i17, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException("ScrollView can host only one direct child");
    }
}
