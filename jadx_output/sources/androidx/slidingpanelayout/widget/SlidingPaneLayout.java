package androidx.slidingpanelayout.widget;

/* loaded from: classes14.dex */
public class SlidingPaneLayout extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f12323d;

    /* renamed from: e, reason: collision with root package name */
    public int f12324e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f12325f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f12326g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12327h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12328i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f12329m;

    /* renamed from: n, reason: collision with root package name */
    public float f12330n;

    /* renamed from: o, reason: collision with root package name */
    public float f12331o;

    /* renamed from: p, reason: collision with root package name */
    public int f12332p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12333q;

    /* renamed from: r, reason: collision with root package name */
    public int f12334r;

    /* renamed from: s, reason: collision with root package name */
    public float f12335s;

    /* renamed from: t, reason: collision with root package name */
    public float f12336t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.customview.widget.l f12337u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12338v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12339w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f12340x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f12341y;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState> CREATOR = new androidx.slidingpanelayout.widget.e();

        /* renamed from: f, reason: collision with root package name */
        public boolean f12347f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12347f = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeInt(this.f12347f ? 1 : 0);
        }
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.view.View view, float f17, int i17) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        if (f17 <= 0.0f || i17 == 0) {
            if (view.getLayerType() != 0) {
                android.graphics.Paint paint = layoutParams.f12346d;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                androidx.slidingpanelayout.widget.b bVar = new androidx.slidingpanelayout.widget.b(this, view);
                this.f12341y.add(bVar);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.m(this, bVar);
                return;
            }
            return;
        }
        int i18 = (((int) ((((-16777216) & i17) >>> 24) * f17)) << 24) | (i17 & 16777215);
        if (layoutParams.f12346d == null) {
            layoutParams.f12346d = new android.graphics.Paint();
        }
        layoutParams.f12346d.setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f12346d);
        }
        android.graphics.Paint paint2 = ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f12346d;
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        n3.v0.i(view, paint2);
    }

    public boolean b(android.view.View view) {
        if (view == null) {
            return false;
        }
        return this.f12328i && ((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams()).f12345c && this.f12330n > 0.0f;
    }

    public boolean c() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.v0.d(this) == 1;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f12337u;
        if (lVar.h(true)) {
            if (!this.f12328i) {
                lVar.a();
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.k(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.c()
            android.view.View r1 = r9.f12329m
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f12345c
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L57
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f12329m
            if (r4 != r5) goto L2c
            goto L54
        L2c:
            float r5 = r9.f12331o
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f12334r
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f12331o = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L42
            int r5 = -r5
        L42:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L54
            float r5 = r9.f12331o
            if (r0 == 0) goto L4d
            float r5 = r5 - r6
            goto L4f
        L4d:
            float r5 = r6 - r5
        L4f:
            int r6 = r9.f12324e
            r9.a(r4, r5, r6)
        L54:
            int r3 = r3 + 1
            goto L21
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.d(float):void");
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = c() ? this.f12326g : this.f12325f;
        android.view.View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            i18 = childAt.getRight();
            i17 = intrinsicWidth + i18;
        } else {
            int left = childAt.getLeft();
            int i19 = left - intrinsicWidth;
            i17 = left;
            i18 = i19;
        }
        drawable.setBounds(i18, top, i17, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f12328i && !layoutParams.f12344b && this.f12329m != null) {
            android.graphics.Rect rect = this.f12340x;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = java.lang.Math.max(rect.left, this.f12329m.getRight());
            } else {
                rect.right = java.lang.Math.min(rect.right, this.f12329m.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public void e() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 4) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "androidx/slidingpanelayout/widget/SlidingPaneLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "androidx/slidingpanelayout/widget/SlidingPaneLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public boolean f(float f17, int i17) {
        int paddingLeft;
        if (!this.f12328i) {
            return false;
        }
        boolean c17 = c();
        androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.f12329m.getLayoutParams();
        if (c17) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f17 * this.f12332p)) + this.f12329m.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f17 * this.f12332p));
        }
        android.view.View view = this.f12329m;
        if (!this.f12337u.u(view, paddingLeft, view.getTop())) {
            return false;
        }
        e();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
        return true;
    }

    public void g(android.view.View view) {
        int i17;
        int i18;
        int i19;
        int i27;
        android.view.View childAt;
        boolean z17;
        android.view.View view2 = view;
        boolean c17 = c();
        int width = c17 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = c17 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i27 = 0;
        } else {
            i17 = view.getLeft();
            i18 = view.getRight();
            i19 = view.getTop();
            i27 = view.getBottom();
        }
        int childCount = getChildCount();
        int i28 = 0;
        while (i28 < childCount && (childAt = getChildAt(i28)) != view2) {
            if (childAt.getVisibility() == 8) {
                z17 = c17;
            } else {
                z17 = c17;
                int i29 = (java.lang.Math.max(c17 ? paddingLeft : width, childAt.getLeft()) < i17 || java.lang.Math.max(paddingTop, childAt.getTop()) < i19 || java.lang.Math.min(c17 ? width : paddingLeft, childAt.getRight()) > i18 || java.lang.Math.min(height, childAt.getBottom()) > i27) ? 0 : 4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i29));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "androidx/slidingpanelayout/widget/SlidingPaneLayout", "updateObscuredViewsVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "androidx/slidingpanelayout/widget/SlidingPaneLayout", "updateObscuredViewsVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i28++;
            view2 = view;
            c17 = z17;
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f12324e;
    }

    public int getParallaxDistance() {
        return this.f12334r;
    }

    public int getSliderFadeColor() {
        return this.f12323d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12339w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12339w = true;
        java.util.ArrayList arrayList = this.f12341y;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((androidx.slidingpanelayout.widget.b) arrayList.get(i17)).run();
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        android.view.View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = this.f12328i;
        androidx.customview.widget.l lVar = this.f12337u;
        if (!z18 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f12338v = !lVar.l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f12328i || (this.f12333q && actionMasked != 0)) {
            lVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            lVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f12333q = false;
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f12335s = x17;
            this.f12336t = y17;
            if (lVar.l(this.f12329m, (int) x17, (int) y17) && b(this.f12329m)) {
                z17 = true;
                return lVar.t(motionEvent) || z17;
            }
        } else if (actionMasked == 2) {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            float abs = java.lang.Math.abs(x18 - this.f12335s);
            float abs2 = java.lang.Math.abs(y18 - this.f12336t);
            if (abs > lVar.f11121b && abs2 > abs) {
                lVar.b();
                this.f12333q = true;
                return false;
            }
        }
        z17 = false;
        if (lVar.t(motionEvent)) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        int i37;
        int i38;
        boolean c17 = c();
        androidx.customview.widget.l lVar = this.f12337u;
        if (c17) {
            lVar.f11135p = 2;
        } else {
            lVar.f11135p = 1;
        }
        int i39 = i19 - i17;
        int paddingRight = c17 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c17 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f12339w) {
            this.f12330n = (this.f12328i && this.f12338v) ? 1.0f : 0.0f;
        }
        int i47 = paddingRight;
        for (int i48 = 0; i48 < childCount; i48++) {
            android.view.View childAt = getChildAt(i48);
            if (childAt.getVisibility() != 8) {
                androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams layoutParams = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f12344b) {
                    int i49 = i39 - paddingLeft;
                    int min = (java.lang.Math.min(paddingRight, i49 - this.f12327h) - i47) - (((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f12332p = min;
                    int i57 = c17 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f12345c = ((i47 + i57) + min) + (measuredWidth / 2) > i49;
                    int i58 = (int) (min * this.f12330n);
                    i47 += i57 + i58;
                    this.f12330n = i58 / min;
                    i28 = 0;
                } else if (!this.f12328i || (i29 = this.f12334r) == 0) {
                    i47 = paddingRight;
                    i28 = 0;
                } else {
                    i28 = (int) ((1.0f - this.f12330n) * i29);
                    i47 = paddingRight;
                }
                if (c17) {
                    i38 = (i39 - i47) + i28;
                    i37 = i38 - measuredWidth;
                } else {
                    i37 = i47 - i28;
                    i38 = i37 + measuredWidth;
                }
                childAt.layout(i37, paddingTop, i38, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f12339w) {
            if (this.f12328i) {
                if (this.f12334r != 0) {
                    d(this.f12330n);
                }
                if (((androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) this.f12329m.getLayoutParams()).f12345c) {
                    a(this.f12329m, this.f12330n, this.f12323d);
                }
            } else {
                for (int i59 = 0; i59 < childCount; i59++) {
                    a(getChildAt(i59), 0.0f, this.f12323d);
                }
            }
            g(this.f12329m);
        }
        this.f12339w = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = (androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f11112d);
        if (savedState.f12347f) {
            if (this.f12339w || f(1.0f, 0)) {
                this.f12338v = true;
            }
        } else if (this.f12339w || f(0.0f, 0)) {
            this.f12338v = false;
        }
        this.f12338v = savedState.f12347f;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState savedState = new androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState(super.onSaveInstanceState());
        boolean z17 = this.f12328i;
        savedState.f12347f = z17 ? !z17 || this.f12330n == 1.0f : this.f12338v;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            this.f12339w = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f12328i) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.customview.widget.l lVar = this.f12337u;
        lVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f12335s = x17;
            this.f12336t = y17;
        } else if (actionMasked == 1 && b(this.f12329m)) {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            float f17 = x18 - this.f12335s;
            float f18 = y18 - this.f12336t;
            int i17 = lVar.f11121b;
            if ((f17 * f17) + (f18 * f18) < i17 * i17 && lVar.l(this.f12329m, (int) x18, (int) y18) && (this.f12339w || f(0.0f, 0))) {
                this.f12338v = false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f12328i) {
            return;
        }
        this.f12338v = view == this.f12329m;
    }

    public void setCoveredFadeColor(int i17) {
        this.f12324e = i17;
    }

    public void setPanelSlideListener(androidx.slidingpanelayout.widget.d dVar) {
    }

    public void setParallaxDistance(int i17) {
        this.f12334r = i17;
        requestLayout();
    }

    @java.lang.Deprecated
    public void setShadowDrawable(android.graphics.drawable.Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(android.graphics.drawable.Drawable drawable) {
        this.f12325f = drawable;
    }

    public void setShadowDrawableRight(android.graphics.drawable.Drawable drawable) {
        this.f12326g = drawable;
    }

    @java.lang.Deprecated
    public void setShadowResource(int i17) {
        setShadowDrawable(getResources().getDrawable(i17));
    }

    public void setShadowResourceLeft(int i17) {
        setShadowDrawableLeft(b3.l.getDrawable(getContext(), i17));
    }

    public void setShadowResourceRight(int i17) {
        setShadowDrawableRight(b3.l.getDrawable(getContext(), i17));
    }

    public void setSliderFadeColor(int i17) {
        this.f12323d = i17;
    }

    /* loaded from: classes14.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        public static final int[] f12342e = {android.R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public final float f12343a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f12344b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f12345c;

        /* renamed from: d, reason: collision with root package name */
        public android.graphics.Paint f12346d;

        public LayoutParams() {
            super(-1, -1);
            this.f12343a = 0.0f;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f12343a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12343a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12343a = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12343a = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12342e);
            this.f12343a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f12323d = -858993460;
        this.f12339w = true;
        this.f12340x = new android.graphics.Rect();
        this.f12341y = new java.util.ArrayList();
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f12327h = (int) ((32.0f * f17) + 0.5f);
        setWillNotDraw(false);
        n3.l1.l(this, new androidx.slidingpanelayout.widget.a(this));
        n3.u0.s(this, 1);
        androidx.customview.widget.l i18 = androidx.customview.widget.l.i(this, 0.5f, new androidx.slidingpanelayout.widget.c(this));
        this.f12337u = i18;
        i18.f11133n = f17 * 400.0f;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams(getContext(), attributeSet);
    }
}
