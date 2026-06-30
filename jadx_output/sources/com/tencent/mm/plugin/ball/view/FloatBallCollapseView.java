package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallCollapseView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/graphics/Point;", "size", "setCustomViewSize", "extendWidth", "setExtendWidth", "Lcom/tencent/mm/plugin/ball/view/FloatBallBlurView;", "getBlurView", "Landroid/widget/LinearLayout;", "getCollapseLayout", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getCollapseIconView", "getCollapseViewHeight", "getCollapseViewSize", "getCollapseViewPosY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FloatBallCollapseView extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final int f93479s = qp1.e0.a(qp1.c0.f365707p) * 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f93480t = qp1.e0.a(qp1.c0.f365704m + qp1.c0.f365706o);

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f93481d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout f93482e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallBlurView f93483f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f93484g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93485h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f93486i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallView f93487m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Point f93488n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Point f93489o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93490p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f93491q;

    /* renamed from: r, reason: collision with root package name */
    public int f93492r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallCollapseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f93481d = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489206ei3, this);
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479673ca));
        setPadding(a17, a17, a17, a17);
        setVisibility(8);
        this.f93482e = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById(com.tencent.mm.R.id.sgw);
        this.f93483f = (com.tencent.mm.plugin.ball.view.FloatBallBlurView) findViewById(com.tencent.mm.R.id.sgx);
        this.f93484g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483332ad2);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.sgy);
        this.f93485h = weImageView;
        qp1.g0.e(weImageView, qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9)), qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)));
        android.widget.LinearLayout linearLayout = this.f93484g;
        int a18 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (linearLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = a18;
            } else {
                layoutParams2 = null;
            }
            linearLayout.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93485h;
        if (weImageView2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = weImageView2.getLayoutParams();
            if (layoutParams3 != null) {
                if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    int a19 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj));
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.setMarginStart(a19);
                    marginLayoutParams.setMarginEnd(a19);
                }
                layoutParams = layoutParams3;
            }
            weImageView2.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById(com.tencent.mm.R.id.sgw);
        if (floatBallRoundCornerFrameLayout != null) {
            floatBallRoundCornerFrameLayout.setRadius(qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        }
    }

    public final void b() {
        if (getVisibility() != 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "quickHide");
            setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        r2.x = r9.intValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r7, int r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateCollapseViewSizeAndPos width: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = ", height: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", posX: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", posY: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FloatBallCollapseView"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.plugin.ball.view.FloatBallBlurView r0 = r6.f93483f
            qp1.g0.e(r0, r7, r8)
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r0 = r6.f93482e
            qp1.g0.e(r0, r7, r8)
            int r0 = com.tencent.mm.plugin.ball.view.FloatBallCollapseView.f93479s
            int r7 = r7 + r0
            int r0 = com.tencent.mm.plugin.ball.view.FloatBallCollapseView.f93480t
            int r8 = r8 + r0
            r0 = 0
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()     // Catch: java.lang.Throwable -> Lbb
            boolean r3 = r2 instanceof android.view.WindowManager.LayoutParams     // Catch: java.lang.Throwable -> Lbb
            r4 = 0
            if (r3 == 0) goto L49
            android.view.WindowManager$LayoutParams r2 = (android.view.WindowManager.LayoutParams) r2     // Catch: java.lang.Throwable -> Lbb
            goto L4a
        L49:
            r2 = r4
        L4a:
            if (r2 != 0) goto L53
            java.lang.String r7 = "updateCollapseViewSizeAndPos windowLayoutParams is null"
            com.tencent.mars.xlog.Log.e(r1, r7)     // Catch: java.lang.Throwable -> Lbb
            return
        L53:
            int r3 = r2.x     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L58
            goto L71
        L58:
            int r5 = r9.intValue()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != r3) goto L71
            int r3 = r2.y     // Catch: java.lang.Throwable -> Lbb
            if (r10 != 0) goto L63
            goto L71
        L63:
            int r5 = r10.intValue()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != r3) goto L71
            int r3 = r2.width     // Catch: java.lang.Throwable -> Lbb
            if (r7 != r3) goto L71
            int r3 = r2.height     // Catch: java.lang.Throwable -> Lbb
            if (r8 == r3) goto Lc4
        L71:
            if (r9 == 0) goto L79
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Lbb
            r2.x = r9     // Catch: java.lang.Throwable -> Lbb
        L79:
            if (r10 == 0) goto L81
            int r9 = r10.intValue()     // Catch: java.lang.Throwable -> Lbb
            r2.y = r9     // Catch: java.lang.Throwable -> Lbb
        L81:
            r2.width = r7     // Catch: java.lang.Throwable -> Lbb
            r2.height = r8     // Catch: java.lang.Throwable -> Lbb
            android.view.WindowManager r7 = r6.f93481d     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L8c
            r7.updateViewLayout(r6, r2)     // Catch: java.lang.Throwable -> Lbb
        L8c:
            int r7 = r2.x     // Catch: java.lang.Throwable -> Lbb
            int r8 = r2.y     // Catch: java.lang.Throwable -> Lbb
            android.graphics.Point r9 = r6.f93489o     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L9b
            android.graphics.Point r9 = new android.graphics.Point     // Catch: java.lang.Throwable -> Lbb
            r9.<init>()     // Catch: java.lang.Throwable -> Lbb
            r6.f93489o = r9     // Catch: java.lang.Throwable -> Lbb
        L9b:
            android.graphics.Point r9 = r6.f93489o     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto La0
            goto La2
        La0:
            r9.x = r7     // Catch: java.lang.Throwable -> Lbb
        La2:
            if (r9 != 0) goto La5
            goto La7
        La5:
            r9.y = r8     // Catch: java.lang.Throwable -> Lbb
        La7:
            boolean r7 = r6.f93490p     // Catch: java.lang.Throwable -> Lbb
            java.lang.Integer r8 = r6.f93491q     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto Lc4
            if (r8 == 0) goto Lb6
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> Lbb
            super.setVisibility(r7)     // Catch: java.lang.Throwable -> Lbb
        Lb6:
            r6.f93490p = r0     // Catch: java.lang.Throwable -> Lbb
            r6.f93491q = r4     // Catch: java.lang.Throwable -> Lbb
            goto Lc4
        Lbb:
            r7 = move-exception
            java.lang.String r8 = "updateCollapseViewSizeAndPos exception"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r8, r9)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallCollapseView.c(int, int, java.lang.Integer, java.lang.Integer):void");
    }

    public final void d(float f17, int i17, int i18, boolean z17) {
        int i19;
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f17));
        boolean z18 = max == 1.0f;
        android.graphics.Point point = this.f93488n;
        if (z18) {
            i19 = point.y;
        } else {
            i19 = (int) (max * point.y);
            i18 += (int) ((r0 - i19) / 2.0f);
        }
        if (z17) {
            i17 += this.f93492r;
        }
        c(point.x, i19, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        java.util.Objects.toString(motionEvent);
        getVisibility();
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = this.f93487m;
        boolean z17 = false;
        if (floatBallView2 != null && floatBallView2.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 && (floatBallView = this.f93487m) != null) {
            return floatBallView.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getBlurView, reason: from getter */
    public final com.tencent.mm.plugin.ball.view.FloatBallBlurView getF93483f() {
        return this.f93483f;
    }

    /* renamed from: getCollapseIconView, reason: from getter */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getF93485h() {
        return this.f93485h;
    }

    /* renamed from: getCollapseLayout, reason: from getter */
    public final android.widget.LinearLayout getF93484g() {
        return this.f93484g;
    }

    public final int getCollapseViewHeight() {
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f93483f;
        if (floatBallBlurView != null) {
            return floatBallBlurView.getHeight();
        }
        return 0;
    }

    public final int getCollapseViewPosY() {
        android.graphics.Point point = this.f93489o;
        if (point != null) {
            return point.y;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            return layoutParams2.y;
        }
        return 0;
    }

    public final android.graphics.Point getCollapseViewSize() {
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f93483f;
        int width = floatBallBlurView != null ? floatBallBlurView.getWidth() : 0;
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView2 = this.f93483f;
        return new android.graphics.Point(width, floatBallBlurView2 != null ? floatBallBlurView2.getHeight() : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93487m;
        android.graphics.Point currentFloatBallPosition = floatBallView != null ? floatBallView.getCurrentFloatBallPosition() : null;
        if (currentFloatBallPosition == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "onAttachedToWindow pos: " + currentFloatBallPosition);
        int i17 = currentFloatBallPosition.x;
        int i18 = currentFloatBallPosition.y;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = this.f93487m;
        d(1.0f, i17, i18, floatBallView2 != null ? floatBallView2.f93563x1 : false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = this.f93487m;
        boolean z17 = false;
        if (floatBallView2 != null && floatBallView2.W()) {
            z17 = true;
        }
        if (!z17 || (floatBallView = this.f93487m) == null) {
            return;
        }
        floatBallView.g0(configuration);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93487m;
        return floatBallView != null ? floatBallView.onInterceptTouchEvent(ev6) : super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93487m;
        return floatBallView != null ? floatBallView.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public final void setCustomViewSize(android.graphics.Point size) {
        kotlin.jvm.internal.o.g(size, "size");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "setCustomViewSize size: " + size);
        android.graphics.Point point = this.f93488n;
        point.set(qp1.e0.a(size.x), qp1.e0.a(size.y));
        c(point.x, point.y, null, null);
    }

    public final void setExtendWidth(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "setExtendWidth: " + i17);
        this.f93492r = i17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.util.Objects.toString(this.f93489o);
        if (this.f93489o == null && i17 == 0) {
            this.f93490p = true;
            this.f93491q = java.lang.Integer.valueOf(i17);
        } else {
            this.f93490p = false;
            this.f93491q = null;
            super.setVisibility(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallCollapseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93488n = new android.graphics.Point();
        try {
            a(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallCollapseView", e17, "init exception", new java.lang.Object[0]);
        }
    }
}
