package p012xc85e97e9.p083x1317bb5b.p084xd1075a44;

/* renamed from: androidx.drawerlayout.widget.DrawerLayout */
/* loaded from: classes14.dex */
public class C1097xe647fb9b extends android.view.ViewGroup {
    public static final int[] G = {android.R.attr.colorPrimaryDark};
    public static final int[] H = {android.R.attr.layout_gravity};
    public android.graphics.drawable.Drawable A;
    public java.lang.Object B;
    public boolean C;
    public final java.util.ArrayList D;
    public android.graphics.Rect E;
    public android.graphics.Matrix F;

    /* renamed from: d, reason: collision with root package name */
    public float f92675d;

    /* renamed from: e, reason: collision with root package name */
    public final int f92676e;

    /* renamed from: f, reason: collision with root package name */
    public int f92677f;

    /* renamed from: g, reason: collision with root package name */
    public float f92678g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f92679h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f92680i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f92681m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b f92682n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b f92683o;

    /* renamed from: p, reason: collision with root package name */
    public int f92684p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f92685q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f92686r;

    /* renamed from: s, reason: collision with root package name */
    public int f92687s;

    /* renamed from: t, reason: collision with root package name */
    public int f92688t;

    /* renamed from: u, reason: collision with root package name */
    public int f92689u;

    /* renamed from: v, reason: collision with root package name */
    public int f92690v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f92691w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f92692x;

    /* renamed from: y, reason: collision with root package name */
    public float f92693y;

    /* renamed from: z, reason: collision with root package name */
    public float f92694z;

    public C1097xe647fb9b(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a(android.view.View view, int i17) {
        return (h(view) & i17) == i17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i17, int i18) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        boolean z17 = false;
        while (true) {
            java.util.ArrayList arrayList2 = this.D;
            if (i19 >= childCount) {
                if (!z17) {
                    int size = arrayList2.size();
                    for (int i27 = 0; i27 < size; i27++) {
                        android.view.View view = (android.view.View) arrayList2.get(i27);
                        if (view.getVisibility() == 0) {
                            view.addFocusables(arrayList, i17, i18);
                        }
                    }
                }
                arrayList2.clear();
                return;
            }
            android.view.View childAt = getChildAt(i19);
            if (!j(childAt)) {
                arrayList2.add(childAt);
            } else {
                if (!j(childAt)) {
                    throw new java.lang.IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if ((((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) childAt.getLayoutParams()).f92698d & 1) == 1) {
                    childAt.addFocusables(arrayList, i17, i18);
                    z17 = true;
                }
            }
            i19++;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i17, layoutParams);
        if (e() != null || j(view)) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.s(view, 4);
        } else {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.s(view, 1);
        }
    }

    public void b(android.view.View view) {
        if (!j(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams();
        if (this.f92686r) {
            layoutParams.f92696b = 0.0f;
            layoutParams.f92698d = 0;
        } else {
            layoutParams.f92698d |= 4;
            if (a(view, 3)) {
                this.f92680i.u(view, -view.getWidth(), view.getTop());
            } else {
                this.f92681m.u(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public void c(boolean z17) {
        int childCount = getChildCount();
        boolean z18 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) childAt.getLayoutParams();
            if (j(childAt) && (!z17 || layoutParams.f92697c)) {
                z18 |= a(childAt, 3) ? this.f92680i.u(childAt, -childAt.getWidth(), childAt.getTop()) : this.f92681m.u(childAt, getWidth(), childAt.getTop());
                layoutParams.f92697c = false;
            }
        }
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar = this.f92682n;
        bVar.f92707d.removeCallbacks(bVar.f92706c);
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar2 = this.f92683o;
        bVar2.f92707d.removeCallbacks(bVar2.f92706c);
        if (z18) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f17 = 0.0f;
        for (int i17 = 0; i17 < childCount; i17++) {
            f17 = java.lang.Math.max(f17, ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) getChildAt(i17).getLayoutParams()).f92696b);
        }
        this.f92678g = f17;
        boolean h17 = this.f92680i.h(true);
        boolean h18 = this.f92681m.h(true);
        if (h17 || h18) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    public android.view.View d(int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(this)) & 7;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f92678g <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        for (int i17 = childCount - 1; i17 >= 0; i17--) {
            android.view.View childAt = getChildAt(i17);
            if (this.E == null) {
                this.E = new android.graphics.Rect();
            }
            childAt.getHitRect(this.E);
            if (this.E.contains((int) x17, (int) y17) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    android.graphics.Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.F == null) {
                            this.F = new android.graphics.Matrix();
                        }
                        matrix.invert(this.F);
                        obtain.transform(this.F);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        int height = getHeight();
        boolean i17 = i(view);
        int width = getWidth();
        int save = canvas.save();
        int i18 = 0;
        if (i17) {
            int childCount = getChildCount();
            int i19 = 0;
            for (int i27 = 0; i27 < childCount; i27++) {
                android.view.View childAt = getChildAt(i27);
                if (childAt != view && childAt.getVisibility() == 0) {
                    android.graphics.drawable.Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && j(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i19) {
                                i19 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i19, 0, width, getHeight());
            i18 = i19;
        }
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.restoreToCount(save);
        float f17 = this.f92678g;
        if (f17 > 0.0f && i17) {
            int i28 = this.f92677f;
            android.graphics.Paint paint = this.f92679h;
            paint.setColor((((int) ((((-16777216) & i28) >>> 24) * f17)) << 24) | (i28 & 16777215));
            canvas.drawRect(i18, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public android.view.View e() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if ((((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) childAt.getLayoutParams()).f92698d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public android.view.View f() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (j(childAt)) {
                if (!j(childAt)) {
                    throw new java.lang.IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) childAt.getLayoutParams()).f92696b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public int g(android.view.View view) {
        if (!j(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i17 = ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92695a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int d17 = n3.v0.d(this);
        if (i17 == 3) {
            int i18 = this.f92687s;
            if (i18 != 3) {
                return i18;
            }
            int i19 = d17 == 0 ? this.f92689u : this.f92690v;
            if (i19 != 3) {
                return i19;
            }
        } else if (i17 == 5) {
            int i27 = this.f92688t;
            if (i27 != 3) {
                return i27;
            }
            int i28 = d17 == 0 ? this.f92690v : this.f92689u;
            if (i28 != 3) {
                return i28;
            }
        } else if (i17 == 8388611) {
            int i29 = this.f92689u;
            if (i29 != 3) {
                return i29;
            }
            int i37 = d17 == 0 ? this.f92687s : this.f92688t;
            if (i37 != 3) {
                return i37;
            }
        } else if (i17 == 8388613) {
            int i38 = this.f92690v;
            if (i38 != 3) {
                return i38;
            }
            int i39 = d17 == 0 ? this.f92688t : this.f92687s;
            if (i39 != 3) {
                return i39;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams ? new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) layoutParams) : layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams(layoutParams);
    }

    /* renamed from: getDrawerElevation */
    public float m7267x8432a636() {
        return this.f92675d;
    }

    /* renamed from: getStatusBarBackgroundDrawable */
    public android.graphics.drawable.Drawable m7268x89f26357() {
        return this.A;
    }

    public int h(android.view.View view) {
        int i17 = ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92695a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(this));
    }

    public boolean i(android.view.View view) {
        return ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92695a == 0;
    }

    public boolean j(android.view.View view) {
        int i17 = ((p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams()).f92695a;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i17, n3.v0.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public void k(android.view.View view) {
        if (!j(view)) {
            throw new java.lang.IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams();
        if (this.f92686r) {
            layoutParams.f92696b = 1.0f;
            layoutParams.f92698d = 1;
            n(view, true);
        } else {
            layoutParams.f92698d |= 2;
            if (a(view, 3)) {
                this.f92680i.u(view, 0, view.getTop());
            } else {
                this.f92681m.u(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public void l(int i17, int i18) {
        android.view.View d17;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i18, n3.v0.d(this));
        if (i18 == 3) {
            this.f92687s = i17;
        } else if (i18 == 5) {
            this.f92688t = i17;
        } else if (i18 == 8388611) {
            this.f92689u = i17;
        } else if (i18 == 8388613) {
            this.f92690v = i17;
        }
        if (i17 != 0) {
            (absoluteGravity == 3 ? this.f92680i : this.f92681m).b();
        }
        if (i17 != 1) {
            if (i17 == 2 && (d17 = d(absoluteGravity)) != null) {
                k(d17);
                return;
            }
            return;
        }
        android.view.View d18 = d(absoluteGravity);
        if (d18 != null) {
            b(d18);
        }
    }

    public void m(android.view.View view, float f17) {
        int size;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) view.getLayoutParams();
        if (f17 == layoutParams.f92696b) {
            return;
        }
        layoutParams.f92696b = f17;
        if (this.f92692x == null || ((java.util.ArrayList) r2).size() - 1 < 0) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.util.ArrayList) this.f92692x).get(size));
        throw null;
    }

    public final void n(android.view.View view, boolean z17) {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if ((z17 || j(childAt)) && !(z17 && childAt == view)) {
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.s(childAt, 4);
            } else {
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                n3.u0.s(childAt, 1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f92686r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92686r = true;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.A == null) {
            return;
        }
        java.lang.Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((android.view.WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.A.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.A.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055 A[LOOP:1: B:31:0x0022->B:40:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0053 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.view.View f17 = f();
        if (f17 != null && g(f17) == 0) {
            c(false);
        }
        return f17 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        float f17;
        int i28;
        boolean z18 = true;
        this.f92685q = true;
        int i29 = i19 - i17;
        int childCount = getChildCount();
        int i37 = 0;
        while (i37 < childCount) {
            android.view.View childAt = getChildAt(i37);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i38 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i38, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i38, ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f18 = measuredWidth;
                        i28 = (-measuredWidth) + ((int) (layoutParams.f92696b * f18));
                        f17 = (measuredWidth + i28) / f18;
                    } else {
                        float f19 = measuredWidth;
                        f17 = (i29 - r10) / f19;
                        i28 = i29 - ((int) (layoutParams.f92696b * f19));
                    }
                    boolean z19 = f17 != layoutParams.f92696b ? z18 : false;
                    int i39 = layoutParams.f92695a & 112;
                    if (i39 == 16) {
                        int i47 = i27 - i18;
                        int i48 = (i47 - measuredHeight) / 2;
                        int i49 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i48 < i49) {
                            i48 = i49;
                        } else {
                            int i57 = i48 + measuredHeight;
                            int i58 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i57 > i47 - i58) {
                                i48 = (i47 - i58) - measuredHeight;
                            }
                        }
                        childAt.layout(i28, i48, measuredWidth + i28, measuredHeight + i48);
                    } else if (i39 != 80) {
                        int i59 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i28, i59, measuredWidth + i28, measuredHeight + i59);
                    } else {
                        int i66 = i27 - i18;
                        childAt.layout(i28, (i66 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i28, i66 - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z19) {
                        m(childAt, f17);
                    }
                    int i67 = layoutParams.f92696b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i67) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(java.lang.Integer.valueOf(i67));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(childAt, arrayList.toArray(), "androidx/drawerlayout/widget/DrawerLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "androidx/drawerlayout/widget/DrawerLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            i37++;
            z18 = true;
        }
        this.f92685q = false;
        this.f92686r = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View d17;
        if (!(parcelable instanceof p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState savedState = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f92645d);
        int i17 = savedState.f92699f;
        if (i17 != 0 && (d17 = d(i17)) != null) {
            k(d17);
        }
        int i18 = savedState.f92700g;
        if (i18 != 3) {
            l(i18, 3);
        }
        int i19 = savedState.f92701h;
        if (i19 != 3) {
            l(i19, 5);
        }
        int i27 = savedState.f92702i;
        if (i27 != 3) {
            l(i27, 8388611);
        }
        int i28 = savedState.f92703m;
        if (i28 != 3) {
            l(i28, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i17) {
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState savedState = new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams = (p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams) getChildAt(i17).getLayoutParams();
            int i18 = layoutParams.f92698d;
            boolean z17 = i18 == 1;
            boolean z18 = i18 == 2;
            if (z17 || z18) {
                savedState.f92699f = layoutParams.f92695a;
                break;
            }
        }
        savedState.f92700g = this.f92687s;
        savedState.f92701h = this.f92688t;
        savedState.f92702i = this.f92689u;
        savedState.f92703m = this.f92690v;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (g(r7) != 2) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.l r0 = r6.f92680i
            r0.m(r7)
            androidx.customview.widget.l r1 = r6.f92681m
            r1.m(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L59
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L67
        L1a:
            r6.c(r3)
            r6.f92691w = r2
            goto L67
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.j(r4, r5)
            if (r4 == 0) goto L54
            boolean r4 = r6.i(r4)
            if (r4 == 0) goto L54
            float r4 = r6.f92693y
            float r1 = r1 - r4
            float r4 = r6.f92694z
            float r7 = r7 - r4
            int r0 = r0.f92654b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r1 = r1 + r7
            int r0 = r0 * r0
            float r7 = (float) r0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L54
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L54
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L55
        L54:
            r2 = r3
        L55:
            r6.c(r2)
            goto L67
        L59:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f92693y = r0
            r6.f92694z = r7
            r6.f92691w = r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        super.requestDisallowInterceptTouchEvent(z17);
        if (z17) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f92685q) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: setDrawerElevation */
    public void m7269xbb093faa(float f17) {
        this.f92675d = f17;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            android.view.View childAt = getChildAt(i17);
            if (j(childAt)) {
                float f18 = this.f92675d;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.s(childAt, f18);
            }
        }
    }

    @java.lang.Deprecated
    /* renamed from: setDrawerListener */
    public void m7270x3b2d5c7(t3.d dVar) {
        if (dVar != null) {
            if (this.f92692x == null) {
                this.f92692x = new java.util.ArrayList();
            }
            ((java.util.ArrayList) this.f92692x).add(dVar);
        }
    }

    /* renamed from: setDrawerLockMode */
    public void m7271x2540f681(int i17) {
        l(i17, 3);
        l(i17, 5);
    }

    /* renamed from: setScrimColor */
    public void m7272xe272883f(int i17) {
        this.f92677f = i17;
        invalidate();
    }

    /* renamed from: setStatusBarBackground */
    public void m7274x47d0e70d(android.graphics.drawable.Drawable drawable) {
        this.A = drawable;
        invalidate();
    }

    /* renamed from: setStatusBarBackgroundColor */
    public void m7275x63bab856(int i17) {
        this.A = new android.graphics.drawable.ColorDrawable(i17);
        invalidate();
    }

    public C1097xe647fb9b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new t3.c();
        this.f92677f = -1728053248;
        this.f92679h = new android.graphics.Paint();
        this.f92686r = true;
        this.f92687s = 3;
        this.f92688t = 3;
        this.f92689u = 3;
        this.f92690v = 3;
        setDescendantFocusability(262144);
        float f17 = getResources().getDisplayMetrics().density;
        this.f92676e = (int) ((64.0f * f17) + 0.5f);
        float f18 = 400.0f * f17;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar = new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b(this, 3);
        this.f92682n = bVar;
        p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b bVar2 = new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.b(this, 5);
        this.f92683o = bVar2;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l i18 = p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l.i(this, 1.0f, bVar);
        this.f92680i = i18;
        i18.f92668p = 1;
        i18.f92666n = f18;
        bVar.f92705b = i18;
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l i19 = p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l.i(this, 1.0f, bVar2);
        this.f92681m = i19;
        i19.f92668p = 2;
        i19.f92666n = f18;
        bVar2.f92705b = i19;
        setFocusableInTouchMode(true);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(this, 1);
        n3.l1.l(this, new t3.b(this));
        setMotionEventSplittingEnabled(false);
        if (n3.u0.b(this)) {
            setOnApplyWindowInsetsListener(new t3.a(this));
            setSystemUiVisibility(1280);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(G);
            try {
                this.A = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f92675d = f17 * 10.0f;
        this.D = new java.util.ArrayList();
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: setStatusBarBackground */
    public void m7273x47d0e70d(int i17) {
        this.A = i17 != 0 ? b3.l.m9707x4a96be14(getContext(), i17) : null;
        invalidate();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$LayoutParams */
    /* loaded from: classes14.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public final int f92695a;

        /* renamed from: b, reason: collision with root package name */
        public float f92696b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f92697c;

        /* renamed from: d, reason: collision with root package name */
        public int f92698d;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f92695a = 0;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.H);
            this.f92695a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f92695a = 0;
        }

        public LayoutParams(p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.LayoutParams layoutParams) {
            super((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            this.f92695a = 0;
            this.f92695a = layoutParams.f92695a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f92695a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f92695a = 0;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState */
    /* loaded from: classes14.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p083x1317bb5b.p084xd1075a44.C1097xe647fb9b.SavedState> f2899x681a0c0c = new p012xc85e97e9.p083x1317bb5b.p084xd1075a44.a();

        /* renamed from: f, reason: collision with root package name */
        public int f92699f;

        /* renamed from: g, reason: collision with root package name */
        public int f92700g;

        /* renamed from: h, reason: collision with root package name */
        public int f92701h;

        /* renamed from: i, reason: collision with root package name */
        public int f92702i;

        /* renamed from: m, reason: collision with root package name */
        public int f92703m;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f92699f = 0;
            this.f92699f = parcel.readInt();
            this.f92700g = parcel.readInt();
            this.f92701h = parcel.readInt();
            this.f92702i = parcel.readInt();
            this.f92703m = parcel.readInt();
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f92699f);
            parcel.writeInt(this.f92700g);
            parcel.writeInt(this.f92701h);
            parcel.writeInt(this.f92702i);
            parcel.writeInt(this.f92703m);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.f92699f = 0;
        }
    }
}
