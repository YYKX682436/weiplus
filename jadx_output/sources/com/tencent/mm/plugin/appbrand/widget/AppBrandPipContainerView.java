package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public final class AppBrandPipContainerView extends android.widget.FrameLayout {
    public android.view.View A;
    public android.view.View B;
    public android.view.ViewGroup C;
    public android.view.View D;
    public android.view.View E;
    public android.view.View F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.id f90985J;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f90986d;

    /* renamed from: e, reason: collision with root package name */
    public int f90987e;

    /* renamed from: f, reason: collision with root package name */
    public int f90988f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Point f90989g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Point f90990h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90991i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.PointF f90992m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.PointF f90993n;

    /* renamed from: o, reason: collision with root package name */
    public float f90994o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90995p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90996q;

    /* renamed from: r, reason: collision with root package name */
    public int f90997r;

    /* renamed from: s, reason: collision with root package name */
    public int f90998s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f90999t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.Set f91000u;

    /* renamed from: v, reason: collision with root package name */
    public int f91001v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Float f91002w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f91003x;

    /* renamed from: y, reason: collision with root package name */
    public android.animation.ValueAnimator f91004y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f91005z;
    public static final int K = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 196);
    public static final int L = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 119);
    public static final int M = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 176);
    public static final int N = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 99);
    public static final int P = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 119);
    public static final int Q = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 196);
    public static final int R = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 99);
    public static final int S = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 176);
    public static final int T = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 32);
    public static final int U = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 56);
    public static final int V = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 52);
    public static final int W = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);

    /* renamed from: p0, reason: collision with root package name */
    public static final int f90978p0 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 80);

    /* renamed from: x0, reason: collision with root package name */
    public static final int f90980x0 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 52);

    /* renamed from: y0, reason: collision with root package name */
    public static final int f90982y0 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);

    /* renamed from: l1, reason: collision with root package name */
    public static final int f90977l1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10);

    /* renamed from: p1, reason: collision with root package name */
    public static final int f90979p1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);

    /* renamed from: x1, reason: collision with root package name */
    public static final int f90981x1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);

    /* renamed from: y1, reason: collision with root package name */
    public static final int f90983y1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10);

    /* renamed from: z1, reason: collision with root package name */
    public static final int f90984z1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
    public static final int A1 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
    public static final android.graphics.Point B1 = new android.graphics.Point();

    public AppBrandPipContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getMarginBottom() {
        return 1 == this.f90988f ? f90980x0 : V;
    }

    private int getMarginHorizontal() {
        return 1 == this.f90988f ? W : T;
    }

    private int getMarginTopDefault() {
        return 1 == this.f90988f ? f90978p0 : U;
    }

    private int getMinX() {
        return getMarginHorizontal();
    }

    private int getMinY() {
        java.lang.Integer num = this.f90986d;
        return num != null ? num.intValue() : getMarginTopDefault();
    }

    private int getTargetPositionXWhenOrientationChanged() {
        return !this.f90995p ? g(getWidth()) : getMinX();
    }

    public void a(com.tencent.mm.plugin.appbrand.widget.m mVar) {
        if (this.f91000u == null) {
            this.f91000u = new java.util.HashSet();
        }
        this.f91000u.add(mVar);
    }

    public final boolean b(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.f90992m;
        return java.lang.Math.abs(rawX - pointF.x) > ((float) this.f90987e) || java.lang.Math.abs(motionEvent.getRawY() - pointF.y) > ((float) this.f90987e);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "disableTouch");
        android.view.View view = this.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "disableTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "disableTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G = false;
    }

    public final void d(int i17, int i18) {
        java.util.Set set = this.f91000u;
        if (set == null) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.appbrand.widget.m) it.next()).a(i17, i18);
        }
    }

    public void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableShadow, isEnabled: " + z17);
        this.I = z17;
        if (!z17) {
            android.view.View view = this.E;
            int i17 = com.tencent.mm.plugin.appbrand.ui.id.f89786j;
            view.setLayerType(1, null);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.q(view, null);
            return;
        }
        if (this.f90985J != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableShadow, setShadowDrawable");
            android.view.View view2 = this.E;
            com.tencent.mm.plugin.appbrand.ui.id idVar = this.f90985J;
            int i18 = com.tencent.mm.plugin.appbrand.ui.id.f89786j;
            view2.setLayerType(1, null);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.q(view2, idVar);
        }
    }

    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "enableTouch");
        android.view.View view = this.A;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "enableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "enableTouch", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.G = true;
    }

    public final int g(int i17) {
        int i18 = this.f90989g.x;
        int marginHorizontal = getMarginHorizontal();
        int i19 = (i18 - i17) - marginHorizontal;
        return i19 < 0 ? (this.f90990h.x - i17) - marginHorizontal : i19;
    }

    public int getStablePosX() {
        return this.f90997r;
    }

    public int getStablePosY() {
        return this.f90998s;
    }

    public final int h(int i17) {
        int i18 = this.f90989g.y;
        int marginBottom = getMarginBottom();
        int i19 = (i18 - i17) - marginBottom;
        if (i19 >= 0) {
            return i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "getMaxY mParentViewSize.y:%d, mScreenSize.y:%d", java.lang.Integer.valueOf(this.f90989g.y), java.lang.Integer.valueOf(this.f90990h.y));
        return (this.f90990h.y - i17) - marginBottom;
    }

    public final int i(android.view.MotionEvent motionEvent) {
        int i17 = this.f90989g.x;
        if (i17 <= 0) {
            i17 = this.f90990h.x;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipContainerView", "getMotionEventNewPositionX, mParentViewSize: " + this.f90989g + ", mScreenSize: " + this.f90990h);
        }
        return (int) java.lang.Math.max(java.lang.Math.min((this.f90993n.x + motionEvent.getRawX()) - this.f90992m.x, i17 - getWidth()), 0.0f);
    }

    public final int j(android.view.MotionEvent motionEvent) {
        int i17 = this.f90989g.y;
        if (i17 <= 0) {
            i17 = this.f90990h.y;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipContainerView", "getMotionEventNewPositionY, mParentViewSize: " + this.f90989g + ", mScreenSize: " + this.f90990h);
        }
        return (int) java.lang.Math.max(java.lang.Math.min((this.f90993n.y + motionEvent.getRawY()) - this.f90992m.y, i17 - getHeight()), 0.0f);
    }

    public final int k(int i17, int i18) {
        int minX = getMinX();
        int i19 = this.f90989g.x;
        if (i19 <= 0) {
            i19 = this.f90990h.x;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipContainerView", "isPositionLeft, mParentViewSize: " + this.f90989g + ", mScreenSize: " + this.f90990h);
        }
        boolean z17 = i17 + (i18 / 2) <= i19 / 2;
        this.f90995p = z17;
        return !z17 ? g(i18) : minX;
    }

    public void l() {
        this.C.setVisibility(4);
        android.view.View view = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "hidePlayProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "hidePlayProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f91002w = null;
    }

    public void m(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f91001v = i17;
        java.lang.Float f17 = this.f91002w;
        if (f17 != null) {
            q(f17.floatValue());
        }
        this.E.setPadding(i18, i19, i18, i27);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.F.getLayoutParams();
        layoutParams.leftMargin = i18;
        layoutParams.rightMargin = i18;
        layoutParams.topMargin = i19;
        layoutParams.bottomMargin = i27;
        this.F.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.appbrand.ui.hd hdVar = new com.tencent.mm.plugin.appbrand.ui.hd();
        hdVar.f89762a = i28;
        hdVar.f89763b = android.graphics.Color.parseColor("#4C000000");
        hdVar.f89764c = i29;
        hdVar.f89765d = 0;
        hdVar.f89766e = i37;
        com.tencent.mm.plugin.appbrand.ui.id idVar = new com.tencent.mm.plugin.appbrand.ui.id(1, hdVar.f89767f, hdVar.f89762a, hdVar.f89763b, hdVar.f89764c, hdVar.f89765d, hdVar.f89766e, null);
        if (!this.I) {
            this.f90985J = idVar;
            return;
        }
        android.view.View view = this.E;
        view.setLayerType(1, null);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.q(view, idVar);
    }

    public void n(int i17, android.content.res.Configuration configuration) {
        android.view.View view;
        this.f90986d = java.lang.Integer.valueOf(i17 - f90982y0);
        if (configuration == null || (view = (android.view.View) getParent()) == null) {
            return;
        }
        this.f90989g = new android.graphics.Point(view.getWidth(), view.getHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, mParentViewSize: " + this.f90989g);
        android.content.Context context = getContext();
        android.graphics.Point point = new android.graphics.Point();
        if (context != null) {
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        }
        this.f90990h = point;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustOnConfigurationChanged, mScreenSize: " + this.f90990h);
        if (this.f90988f == configuration.orientation || getVisibility() != 0) {
            return;
        }
        this.f90988f = configuration.orientation;
        int minX = getMinX();
        int g17 = g(getWidth());
        int minY = getMinY();
        int h17 = h(getHeight());
        float x17 = getX();
        float f17 = minY;
        float f18 = (this.f90994o * (h17 - minY)) + f17;
        int max = (int) java.lang.Math.max(java.lang.Math.min(x17, g17), minX);
        int max2 = (int) java.lang.Math.max(java.lang.Math.min(f18, h17), f17);
        int targetPositionXWhenOrientationChanged = getTargetPositionXWhenOrientationChanged();
        int height = getHeight();
        int minY2 = getMinY();
        if (max2 >= minY2 && max2 <= (minY2 = h(height))) {
            minY2 = max2;
        }
        r(max, max2, targetPositionXWhenOrientationChanged, minY2);
    }

    public void o(int i17, int i18) {
        int minY = getMinY();
        if (i17 < minY) {
            i17 = minY;
        } else {
            int h17 = h(i18);
            if (i17 > h17) {
                i17 = h17;
            }
        }
        this.f90998s = i17;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = (android.view.View) getParent();
        if (view == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandPipContainerView", "onLayout, null == parentView");
            return;
        }
        if (B1 == this.f90989g) {
            this.f90989g = new android.graphics.Point(view.getWidth(), view.getHeight());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "onLayout, mParentViewSize: " + this.f90989g);
            if (this.f90999t == null) {
                s(getY(), true);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "mPendingInitPos run");
            this.f90999t.run();
            this.f90999t = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r0 != 3) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.G
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r8.getAction()
            java.lang.String r2 = "MicroMsg.AppBrand.AppBrandPipContainerView"
            r3 = 0
            if (r0 == 0) goto Lad
            if (r0 == r1) goto L4b
            r4 = 2
            if (r0 == r4) goto L19
            r4 = 3
            if (r0 == r4) goto L4b
            goto Le8
        L19:
            boolean r0 = r7.f90991i
            if (r0 != 0) goto L25
            boolean r0 = r7.b(r8)
            if (r0 == 0) goto L25
            r7.f90991i = r1
        L25:
            boolean r0 = r7.f90991i
            if (r0 == 0) goto Le8
            int r0 = r7.i(r8)
            float r0 = (float) r0
            int r1 = r7.j(r8)
            float r1 = (float) r1
            float r2 = r7.getX()
            float r3 = r7.getX()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L43
            int r2 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r2 == 0) goto Le8
        L43:
            r7.setX(r0)
            r7.setY(r1)
            goto Le8
        L4b:
            boolean r0 = r7.f90991i
            if (r0 != 0) goto L57
            boolean r0 = r7.b(r8)
            if (r0 != 0) goto L57
            goto Le8
        L57:
            boolean r0 = r7.f90991i
            if (r0 == 0) goto L5d
            r7.f90991i = r3
        L5d:
            int r0 = r7.i(r8)
            int r3 = r7.getWidth()
            int r8 = r7.j(r8)
            int r4 = r7.getHeight()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onTouchEvent, startPositionX: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = ", width: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", startPositionY: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r6 = ", height: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            int r2 = r7.k(r0, r3)
            int r3 = r7.getMinY()
            if (r8 >= r3) goto La1
            goto La9
        La1:
            int r3 = r7.h(r4)
            if (r8 <= r3) goto La8
            goto La9
        La8:
            r3 = r8
        La9:
            r7.r(r0, r8, r2, r3)
            return r1
        Lad:
            r7.f90991i = r3
            android.graphics.PointF r0 = r7.f90992m
            float r1 = r8.getRawX()
            r0.x = r1
            float r1 = r8.getRawY()
            r0.y = r1
            android.graphics.PointF r1 = r7.f90993n
            float r3 = r7.getX()
            int r3 = (int) r3
            float r3 = (float) r3
            r1.x = r3
            float r3 = r7.getY()
            int r3 = (int) r3
            float r3 = (float) r3
            r1.y = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "recordPositionWhenActionDown, fingerPosOnDown: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", viewPosOnDown: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
        Le8:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "showOnLoadEnd");
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoadEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showOnLoadEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void q(float f17) {
        if (this.H) {
            this.C.setVisibility(0);
            android.view.View view = this.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showPlayProgress", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", "showPlayProgress", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = this.D.getLayoutParams();
            layoutParams.width = (int) ((this.f91001v * f17) / 100.0f);
            this.D.setLayoutParams(layoutParams);
            this.f91002w = java.lang.Float.valueOf(f17);
        }
    }

    public final void r(int i17, int i18, int i19, int i27) {
        android.animation.ValueAnimator valueAnimator = this.f91004y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f91004y.cancel();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f91004y = ofFloat;
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        this.f91004y.setDuration(100L);
        this.f91004y.addUpdateListener(new com.tencent.mm.plugin.appbrand.widget.k(this, i17, i19, i18, i27));
        this.f91004y.addListener(new com.tencent.mm.plugin.appbrand.widget.l(this, i19, i27));
        this.f91004y.start();
    }

    public final void s(float f17, boolean z17) {
        if (z17) {
            int minY = getMinY();
            float f18 = minY;
            this.f90994o = (java.lang.Math.min(java.lang.Math.max(f17, f18), h(getHeight())) - f18) / (r0 - minY);
        }
    }

    public void setInitPositionIfNeed(final pd1.b bVar) {
        int g17;
        int h17;
        if (this.f90996q) {
            return;
        }
        if (bVar != null && this.f90989g == B1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "setInitPositionIfNeed customInitPos but mParentViewSize empty, pending");
            this.f90999t = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.K;
                    com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.this.setInitPositionIfNeed(bVar);
                }
            };
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (bVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "setInitPositionIfNeed isAlignmentRight:%b y:%s", java.lang.Boolean.valueOf(bVar.f353529a), java.lang.Double.valueOf(bVar.f353530b));
            g17 = bVar.f353529a ? g(width) : getMinX();
            h17 = (int) (((h(height) - getMinY()) * bVar.f353530b) + getMinY());
        } else {
            g17 = g(width);
            h17 = h(height);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "setInitPositionIfNeed, x: " + g17 + ", y: " + h17);
        setX((float) g17);
        setY((float) h17);
        s(getY(), true);
        this.f90997r = k(g17, width);
        int minY = getMinY();
        if (h17 < minY || h17 > (minY = h(height))) {
            h17 = minY;
        }
        this.f90998s = h17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "setPosition, mStablePosX: " + this.f90997r + ", mStablePosY: " + this.f90998s);
        d(this.f90997r, this.f90998s);
        this.f90996q = true;
    }

    public void setOnCloseButtonClickListener(android.view.View.OnClickListener onClickListener) {
        this.A.setOnClickListener(onClickListener);
    }

    public void setStablePos(android.graphics.Point point) {
        java.util.Objects.toString(point);
        this.f90997r = point.x;
        this.f90998s = point.y;
        this.f90996q = true;
    }

    public AppBrandPipContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f90986d = null;
        android.graphics.Point point = B1;
        this.f90989g = point;
        this.f90990h = point;
        this.f90991i = false;
        this.f90992m = new android.graphics.PointF();
        this.f90993n = new android.graphics.PointF();
        this.f90994o = -1.0f;
        this.f90995p = false;
        this.f90996q = false;
        this.f90999t = null;
        this.f91000u = null;
        this.f91001v = M;
        this.f91002w = null;
        com.tencent.mm.plugin.appbrand.widget.j jVar = new com.tencent.mm.plugin.appbrand.widget.j(this);
        this.f91003x = jVar;
        this.G = true;
        this.H = true;
        this.I = false;
        this.f90985J = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488067fy, this);
        setBackgroundColor(0);
        this.E = inflate.findViewById(com.tencent.mm.R.id.f483193z6);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f483192z5);
        this.F = findViewById;
        findViewById.setOutlineProvider(jVar);
        this.F.setClipToOutline(true);
        this.f91005z = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f483194z7);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483191z4);
        this.A = findViewById2;
        zk1.m.a(findViewById2, android.widget.Button.class, java.lang.Integer.valueOf(com.tencent.mm.R.string.f490246p6), false, null, null, null, null, null, null, null, null, null);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.z_);
        this.B = findViewById3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f483197za);
        this.C = viewGroup;
        viewGroup.setVisibility(4);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f483198zb);
        this.D = findViewById4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/appbrand/widget/AppBrandPipContainerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m(this.f91001v, f90977l1, f90982y0, f90979p1, f90981x1, f90983y1, f90984z1);
        this.f90987e = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f90988f = context.getResources().getConfiguration().orientation;
        android.graphics.Point point2 = new android.graphics.Point();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point2);
        this.f90990h = point2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "init, mScreenSize: " + this.f90990h);
    }
}
