package gf;

/* loaded from: classes7.dex */
public abstract class f1 extends android.widget.FrameLayout implements pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowInsets f352580d;

    /* renamed from: e, reason: collision with root package name */
    public final gf.z f352581e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f352582f;

    /* renamed from: g, reason: collision with root package name */
    public int f352583g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f352584h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f352585i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f352586m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnApplyWindowInsetsListener f352587n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f352588o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedHashSet f352589p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f352590q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f352591r;

    /* renamed from: s, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6 f352592s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f352593t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f352581e = new gf.z(this);
        this.f352586m = new gf.e1(this);
        this.f352589p = new java.util.LinkedHashSet();
        this.f352590q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f352591r = new gf.a1(this);
        this.f352592s = new gf.b1(this);
        this.f352593t = new gf.d1(this);
    }

    public final void a() {
        this.f352590q.mo50300x3fa464aa(this.f352586m);
        android.widget.ImageView imageView = this.f352584h;
        if (imageView != null) {
            removeView(imageView);
            imageView.setImageBitmap(null);
        }
        this.f352584h = null;
        android.graphics.Bitmap bitmap = this.f352585i;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        this.f352585i = null;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df;
        android.graphics.Bitmap m138025x12501425;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.util.Iterator it = this.f352589p.iterator();
        while (true) {
            if (!it.hasNext()) {
                c28641x1f60b8df = null;
                break;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137262x60866884 = ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) it.next()).m137262x60866884();
            c28641x1f60b8df = m137262x60866884 != null ? m137262x60866884.m137441x5e5b7e39() : null;
            if (c28641x1f60b8df != null) {
                break;
            }
        }
        if (c28641x1f60b8df == null || (m138025x12501425 = c28641x1f60b8df.m138025x12501425()) == null || m138025x12501425.isRecycled()) {
            return true;
        }
        canvas.drawBitmap(m138025x12501425, 0.0f, 0.0f, (android.graphics.Paint) null);
        return true;
    }

    public final void d() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137262x60866884;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39;
        a();
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) kz5.n0.Y(this.f352589p);
        android.graphics.Bitmap m138025x12501425 = (c28553x45ef20c1 == null || (m137262x60866884 = c28553x45ef20c1.m137262x60866884()) == null || (m137441x5e5b7e39 = m137262x60866884.m137441x5e5b7e39()) == null) ? null : m137441x5e5b7e39.m138025x12501425();
        if (m138025x12501425 == null || m138025x12501425.isRecycled()) {
            return;
        }
        android.graphics.Bitmap.Config config = m138025x12501425.getConfig();
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Boolean.FALSE);
        arrayList.add(config);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m138025x12501425, arrayList.toArray(), "com/tencent/luggage/skyline/wxa/SkylineScreenshotLayout", "showSheetModeCover", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap copy = m138025x12501425.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
        yj0.a.e(m138025x12501425, copy, "com/tencent/luggage/skyline/wxa/SkylineScreenshotLayout", "showSheetModeCover", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
        if (copy == null) {
            return;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
        imageView.setImageBitmap(copy);
        int width = c28553x45ef20c1.getWidth();
        if (width < 1) {
            width = 1;
        }
        int height = c28553x45ef20c1.getHeight();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, height >= 1 ? height : 1);
        layoutParams.gravity = 48;
        addView(imageView, layoutParams);
        this.f352584h = imageView;
        this.f352585i = copy;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f352590q;
        java.lang.Runnable runnable = this.f352586m;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 100L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        super.dispatchTouchEvent(ev6);
        if (this.f352588o && (ev6.getAction() == 0 || ev6.getAction() == 5)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f352590q;
            n3Var.mo50300x3fa464aa(this.f352593t);
            java.lang.Runnable runnable = this.f352591r;
            n3Var.mo50300x3fa464aa(runnable);
            ((gf.a1) runnable).run();
        }
        return !this.f352589p.isEmpty();
    }

    /* renamed from: getEnableFixSize */
    public final boolean m131390xcdc452fd() {
        return this.f352582f;
    }

    /* renamed from: getEnabledSnapshotCover */
    public final boolean m131391x1961fb08() {
        return this.f352588o;
    }

    /* renamed from: getFixedHeight */
    public final int m131392x58c4485() {
        return this.f352583g;
    }

    /* renamed from: getFlutterViewportMetricsCompat$luggage_skyline_ext_release */
    public final gf.z m131393x5911f26b() {
        return this.f352581e;
    }

    /* renamed from: getNoInterceptOnApplyWindowInsetsListener */
    public final android.view.View.OnApplyWindowInsetsListener m131394xe334c77e() {
        return this.f352587n;
    }

    @Override // android.view.ViewGroup
    public void measureChild(android.view.View view, int i17, int i18) {
        if (!this.f352582f || this.f352583g <= 0 || view == null) {
            super.measureChild(view, i17, i18);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight(), layoutParams.width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(this.f352583g, 1073741824), getPaddingTop() + getPaddingBottom(), layoutParams.height));
        }
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(android.view.View view, int i17, int i18, int i19, int i27) {
        if (!this.f352582f || this.f352583g <= 0 || view == null) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            super.measureChildWithMargins(view, i17, i18, i19, i27);
        } else {
            view.measure(android.view.ViewGroup.getChildMeasureSpec(i17, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i18, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(android.view.View.MeasureSpec.makeMeasureSpec(this.f352583g, 1073741824), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i27, marginLayoutParams.height));
        }
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets insets) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        android.view.WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(insets);
        if (!(!this.f352589p.isEmpty())) {
            this.f352580d = new android.view.WindowInsets(onApplyWindowInsets);
            int i17 = android.os.Build.VERSION.SDK_INT;
            gf.z zVar = this.f352581e;
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df.ViewportMetrics viewportMetrics = zVar.f352727a;
            if (i17 == 29) {
                android.graphics.Insets systemGestureInsets = insets.getSystemGestureInsets();
                viewportMetrics.f71254x9a0ea132 = systemGestureInsets.top;
                viewportMetrics.f71253x50cc1eb9 = systemGestureInsets.right;
                viewportMetrics.f71251xadc4d12e = systemGestureInsets.bottom;
                viewportMetrics.f71252xa7c1bbca = systemGestureInsets.left;
            }
            android.view.View view = zVar.f352728b;
            boolean z17 = (view.getWindowSystemUiVisibility() & 4) == 0;
            boolean z18 = (view.getWindowSystemUiVisibility() & 2) == 0;
            if (i17 >= 30) {
                int navigationBars = z18 ? 0 | android.view.WindowInsets.Type.navigationBars() : 0;
                if (z17) {
                    navigationBars |= android.view.WindowInsets.Type.statusBars();
                }
                android.graphics.Insets insets2 = insets.getInsets(navigationBars);
                viewportMetrics.f71262xab8f1409 = insets2.top;
                viewportMetrics.f71261x3fb37d0 = insets2.right;
                viewportMetrics.f71259x6078daf7 = insets2.bottom;
                viewportMetrics.f71260xc64fa3d3 = insets2.left;
                android.graphics.Insets insets3 = insets.getInsets(android.view.WindowInsets.Type.ime());
                viewportMetrics.f71258xe9ea0bd = insets3.top;
                viewportMetrics.f71257xe15a6784 = insets3.right;
                viewportMetrics.f71255x2effa1c3 = insets3.bottom;
                viewportMetrics.f71256xc531ad9f = insets3.left;
                android.graphics.Insets insets4 = insets.getInsets(android.view.WindowInsets.Type.systemGestures());
                viewportMetrics.f71254x9a0ea132 = insets4.top;
                viewportMetrics.f71253x50cc1eb9 = insets4.right;
                viewportMetrics.f71251xadc4d12e = insets4.bottom;
                viewportMetrics.f71252xa7c1bbca = insets4.left;
                android.view.DisplayCutout displayCutout = insets.getDisplayCutout();
                if (displayCutout != null) {
                    android.graphics.Insets waterfallInsets = displayCutout.getWaterfallInsets();
                    viewportMetrics.f71262xab8f1409 = java.lang.Math.max(java.lang.Math.max(viewportMetrics.f71262xab8f1409, waterfallInsets.top), displayCutout.getSafeInsetTop());
                    viewportMetrics.f71261x3fb37d0 = java.lang.Math.max(java.lang.Math.max(viewportMetrics.f71261x3fb37d0, waterfallInsets.right), displayCutout.getSafeInsetRight());
                    viewportMetrics.f71259x6078daf7 = java.lang.Math.max(java.lang.Math.max(viewportMetrics.f71259x6078daf7, waterfallInsets.bottom), displayCutout.getSafeInsetBottom());
                    viewportMetrics.f71260xc64fa3d3 = java.lang.Math.max(java.lang.Math.max(viewportMetrics.f71260xc64fa3d3, waterfallInsets.left), displayCutout.getSafeInsetLeft());
                }
            } else {
                gf.y yVar = gf.y.NONE;
                gf.y yVar2 = gf.y.LEFT;
                gf.y yVar3 = gf.y.RIGHT;
                gf.y yVar4 = gf.y.BOTH;
                if (!z18) {
                    android.content.Context context = view.getContext();
                    int i18 = context.getResources().getConfiguration().orientation;
                    int rotation = ((android.view.WindowManager) b3.l.m9714xac92a5d0(context, android.view.WindowManager.class)).getDefaultDisplay().getRotation();
                    if (i18 == 2) {
                        if (rotation == 1) {
                            yVar = yVar3;
                        } else if (rotation == 3) {
                            yVar = yVar2;
                        } else if (rotation == 0 || rotation == 2) {
                            yVar = yVar4;
                        }
                    }
                }
                viewportMetrics.f71262xab8f1409 = z17 ? insets.getSystemWindowInsetTop() : 0;
                viewportMetrics.f71261x3fb37d0 = (yVar == yVar3 || yVar == yVar4) ? 0 : insets.getSystemWindowInsetRight();
                viewportMetrics.f71259x6078daf7 = (z18 && zVar.a(insets) == 0) ? insets.getSystemWindowInsetBottom() : 0;
                viewportMetrics.f71260xc64fa3d3 = (yVar == yVar2 || yVar == yVar4) ? 0 : insets.getSystemWindowInsetLeft();
                viewportMetrics.f71258xe9ea0bd = 0;
                viewportMetrics.f71257xe15a6784 = 0;
                viewportMetrics.f71255x2effa1c3 = zVar.a(insets);
                viewportMetrics.f71256xc531ad9f = 0;
            }
            int i19 = viewportMetrics.f71262xab8f1409;
        }
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f352587n;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(this, onApplyWindowInsets);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(onApplyWindowInsets, "also(...)");
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) {
            this.f352589p.add(view);
            android.view.WindowInsets windowInsets = this.f352580d;
            if (windowInsets != null) {
                ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) view).dispatchApplyWindowInsets(windowInsets);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if (view instanceof io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) {
            this.f352589p.remove(view);
        }
    }

    /* renamed from: setEnableFixSize */
    public final void m131395x609ab971(boolean z17) {
        if (this.f352582f != z17) {
            this.f352582f = z17;
            if (z17) {
                requestLayout();
            }
        }
    }

    /* renamed from: setEnabledSnapshotCover */
    public final void m131396x93b52a14(boolean z17) {
        this.f352588o = z17;
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f352590q;
        n3Var.mo50300x3fa464aa(this.f352593t);
        n3Var.mo50300x3fa464aa(this.f352591r);
    }

    /* renamed from: setFixedHeight */
    public final void m131397x9bf1b7f9(int i17) {
        if (this.f352583g != i17) {
            this.f352583g = i17;
            if (!this.f352582f || i17 <= 0) {
                return;
            }
            requestLayout();
        }
    }

    /* renamed from: setNoInterceptOnApplyWindowInsetsListener */
    public final void m131398x7ab6cb8a(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f352587n = onApplyWindowInsetsListener;
    }

    /* renamed from: setSheetMode */
    public final void m131399xbbaf7560(boolean z17) {
    }
}
