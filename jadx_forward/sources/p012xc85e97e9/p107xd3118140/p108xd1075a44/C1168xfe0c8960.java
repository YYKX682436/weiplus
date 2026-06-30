package p012xc85e97e9.p107xd3118140.p108xd1075a44;

/* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout */
/* loaded from: classes14.dex */
public class C1168xfe0c8960 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f93856d;

    /* renamed from: e, reason: collision with root package name */
    public int f93857e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93858f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f93859g;

    /* renamed from: h, reason: collision with root package name */
    public final int f93860h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93861i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f93862m;

    /* renamed from: n, reason: collision with root package name */
    public float f93863n;

    /* renamed from: o, reason: collision with root package name */
    public float f93864o;

    /* renamed from: p, reason: collision with root package name */
    public int f93865p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93866q;

    /* renamed from: r, reason: collision with root package name */
    public int f93867r;

    /* renamed from: s, reason: collision with root package name */
    public float f93868s;

    /* renamed from: t, reason: collision with root package name */
    public float f93869t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f93870u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f93871v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f93872w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f93873x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f93874y;

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState> f3657x681a0c0c = new p012xc85e97e9.p107xd3118140.p108xd1075a44.e();

        /* renamed from: f, reason: collision with root package name */
        public boolean f93880f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f93880f = parcel.readInt() != 0;
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f93880f ? 1 : 0);
        }
    }

    public C1168xfe0c8960(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(android.view.View view, float f17, int i17) {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams();
        if (f17 <= 0.0f || i17 == 0) {
            if (view.getLayerType() != 0) {
                android.graphics.Paint paint = layoutParams.f93879d;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                p012xc85e97e9.p107xd3118140.p108xd1075a44.b bVar = new p012xc85e97e9.p107xd3118140.p108xd1075a44.b(this, view);
                this.f93874y.add(bVar);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.m(this, bVar);
                return;
            }
            return;
        }
        int i18 = (((int) ((((-16777216) & i17) >>> 24) * f17)) << 24) | (i17 & 16777215);
        if (layoutParams.f93879d == null) {
            layoutParams.f93879d = new android.graphics.Paint();
        }
        layoutParams.f93879d.setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.f93879d);
        }
        android.graphics.Paint paint2 = ((p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams()).f93879d;
        java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
        n3.v0.i(view, paint2);
    }

    public boolean b(android.view.View view) {
        if (view == null) {
            return false;
        }
        return this.f93861i && ((p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams()).f93878c && this.f93863n > 0.0f;
    }

    public boolean c() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.v0.d(this) == 1;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f93870u;
        if (lVar.h(true)) {
            if (!this.f93861i) {
                lVar.a();
            } else {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
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
            android.view.View r1 = r9.f93862m
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) r1
            boolean r2 = r1.f93878c
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
            android.view.View r5 = r9.f93862m
            if (r4 != r5) goto L2c
            goto L54
        L2c:
            float r5 = r9.f93864o
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f93867r
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f93864o = r10
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
            float r5 = r9.f93864o
            if (r0 == 0) goto L4d
            float r5 = r5 - r6
            goto L4f
        L4d:
            float r5 = r6 - r5
        L4f:
            int r6 = r9.f93857e
            r9.a(r4, r5, r6)
        L54:
            int r3 = r3 + 1
            goto L21
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.d(float):void");
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int i17;
        int i18;
        super.draw(canvas);
        android.graphics.drawable.Drawable drawable = c() ? this.f93859g : this.f93858f;
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
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f93861i && !layoutParams.f93877b && this.f93862m != null) {
            android.graphics.Rect rect = this.f93873x;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = java.lang.Math.max(rect.left, this.f93862m.getRight());
            } else {
                rect.right = java.lang.Math.min(rect.right, this.f93862m.getLeft());
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
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        if (!this.f93861i) {
            return false;
        }
        boolean c17 = c();
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) this.f93862m.getLayoutParams();
        if (c17) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f17 * this.f93865p)) + this.f93862m.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f17 * this.f93865p));
        }
        android.view.View view = this.f93862m;
        if (!this.f93870u.u(view, paddingLeft, view.getTop())) {
            return false;
        }
        e();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
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
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        return new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams(layoutParams);
    }

    /* renamed from: getCoveredFadeColor */
    public int m8223xe88c57c7() {
        return this.f93857e;
    }

    /* renamed from: getParallaxDistance */
    public int m8224x8c96fe22() {
        return this.f93867r;
    }

    /* renamed from: getSliderFadeColor */
    public int m8225x28c9fc30() {
        return this.f93856d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f93872w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f93872w = true;
        java.util.ArrayList arrayList = this.f93874y;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p107xd3118140.p108xd1075a44.b) arrayList.get(i17)).run();
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        android.view.View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z18 = this.f93861i;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f93870u;
        if (!z18 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f93871v = !lVar.l(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f93861i || (this.f93866q && actionMasked != 0)) {
            lVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            lVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.f93866q = false;
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f93868s = x17;
            this.f93869t = y17;
            if (lVar.l(this.f93862m, (int) x17, (int) y17) && b(this.f93862m)) {
                z17 = true;
                return lVar.t(motionEvent) || z17;
            }
        } else if (actionMasked == 2) {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            float abs = java.lang.Math.abs(x18 - this.f93868s);
            float abs2 = java.lang.Math.abs(y18 - this.f93869t);
            if (abs > lVar.f92654b && abs2 > abs) {
                lVar.b();
                this.f93866q = true;
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
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f93870u;
        if (c17) {
            lVar.f92668p = 2;
        } else {
            lVar.f92668p = 1;
        }
        int i39 = i19 - i17;
        int paddingRight = c17 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c17 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f93872w) {
            this.f93863n = (this.f93861i && this.f93871v) ? 1.0f : 0.0f;
        }
        int i47 = paddingRight;
        for (int i48 = 0; i48 < childCount; i48++) {
            android.view.View childAt = getChildAt(i48);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams layoutParams = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f93877b) {
                    int i49 = i39 - paddingLeft;
                    int min = (java.lang.Math.min(paddingRight, i49 - this.f93860h) - i47) - (((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f93865p = min;
                    int i57 = c17 ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f93878c = ((i47 + i57) + min) + (measuredWidth / 2) > i49;
                    int i58 = (int) (min * this.f93863n);
                    i47 += i57 + i58;
                    this.f93863n = i58 / min;
                    i28 = 0;
                } else if (!this.f93861i || (i29 = this.f93867r) == 0) {
                    i47 = paddingRight;
                    i28 = 0;
                } else {
                    i28 = (int) ((1.0f - this.f93863n) * i29);
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
        if (this.f93872w) {
            if (this.f93861i) {
                if (this.f93867r != 0) {
                    d(this.f93863n);
                }
                if (((p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams) this.f93862m.getLayoutParams()).f93878c) {
                    a(this.f93862m, this.f93863n, this.f93856d);
                }
            } else {
                for (int i59 = 0; i59 < childCount; i59++) {
                    a(getChildAt(i59), 0.0f, this.f93856d);
                }
            }
            g(this.f93862m);
        }
        this.f93872w = false;
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
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState savedState = (p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        if (savedState.f93880f) {
            if (this.f93872w || f(1.0f, 0)) {
                this.f93871v = true;
            }
        } else if (this.f93872w || f(0.0f, 0)) {
            this.f93871v = false;
        }
        this.f93871v = savedState.f93880f;
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState savedState = new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.SavedState(super.onSaveInstanceState());
        boolean z17 = this.f93861i;
        savedState.f93880f = z17 ? !z17 || this.f93863n == 1.0f : this.f93871v;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            this.f93872w = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f93861i) {
            return super.onTouchEvent(motionEvent);
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f93870u;
        lVar.m(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            this.f93868s = x17;
            this.f93869t = y17;
        } else if (actionMasked == 1 && b(this.f93862m)) {
            float x18 = motionEvent.getX();
            float y18 = motionEvent.getY();
            float f17 = x18 - this.f93868s;
            float f18 = y18 - this.f93869t;
            int i17 = lVar.f92654b;
            if ((f17 * f17) + (f18 * f18) < i17 * i17 && lVar.l(this.f93862m, (int) x18, (int) y18) && (this.f93872w || f(0.0f, 0))) {
                this.f93871v = false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f93861i) {
            return;
        }
        this.f93871v = view == this.f93862m;
    }

    /* renamed from: setCoveredFadeColor */
    public void m8226x8c88ecd3(int i17) {
        this.f93857e = i17;
    }

    /* renamed from: setPanelSlideListener */
    public void m8227xc98895e3(p012xc85e97e9.p107xd3118140.p108xd1075a44.d dVar) {
    }

    /* renamed from: setParallaxDistance */
    public void m8228x3093932e(int i17) {
        this.f93867r = i17;
        requestLayout();
    }

    @java.lang.Deprecated
    /* renamed from: setShadowDrawable */
    public void m8229xd04e72e0(android.graphics.drawable.Drawable drawable) {
        m8230x4c3e1707(drawable);
    }

    /* renamed from: setShadowDrawableLeft */
    public void m8230x4c3e1707(android.graphics.drawable.Drawable drawable) {
        this.f93858f = drawable;
    }

    /* renamed from: setShadowDrawableRight */
    public void m8231x3bdb2b1c(android.graphics.drawable.Drawable drawable) {
        this.f93859g = drawable;
    }

    @java.lang.Deprecated
    /* renamed from: setShadowResource */
    public void m8232xed3db650(int i17) {
        m8229xd04e72e0(getResources().getDrawable(i17));
    }

    /* renamed from: setShadowResourceLeft */
    public void m8233xffe2277(int i17) {
        m8230x4c3e1707(b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setShadowResourceRight */
    public void m8234xf01c8dac(int i17) {
        m8231x3bdb2b1c(b3.l.m9707x4a96be14(getContext(), i17));
    }

    /* renamed from: setSliderFadeColor */
    public void m8235x5fa095a4(int i17) {
        this.f93856d = i17;
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams */
    /* loaded from: classes14.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: e, reason: collision with root package name */
        public static final int[] f93875e = {android.R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public final float f93876a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f93877b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f93878c;

        /* renamed from: d, reason: collision with root package name */
        public android.graphics.Paint f93879d;

        public LayoutParams() {
            super(-1, -1);
            this.f93876a = 0.0f;
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f93876a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f93876a = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f93876a = 0.0f;
        }

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f93876a = 0.0f;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f93875e);
            this.f93876a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    public C1168xfe0c8960(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93856d = -858993460;
        this.f93872w = true;
        this.f93873x = new android.graphics.Rect();
        this.f93874y = new java.util.ArrayList();
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f93860h = (int) ((32.0f * f17) + 0.5f);
        setWillNotDraw(false);
        n3.l1.l(this, new p012xc85e97e9.p107xd3118140.p108xd1075a44.a(this));
        n3.u0.s(this, 1);
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l i18 = p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l.i(this, 0.5f, new p012xc85e97e9.p107xd3118140.p108xd1075a44.c(this));
        this.f93870u = i18;
        i18.f92666n = f17 * 400.0f;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p107xd3118140.p108xd1075a44.C1168xfe0c8960.LayoutParams(getContext(), attributeSet);
    }
}
