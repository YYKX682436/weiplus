package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0006J\u0006\u0010\u0013\u001a\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallCollapseView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/graphics/Point;", "size", "setCustomViewSize", "extendWidth", "setExtendWidth", "Lcom/tencent/mm/plugin/ball/view/FloatBallBlurView;", "getBlurView", "Landroid/widget/LinearLayout;", "getCollapseLayout", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getCollapseIconView", "getCollapseViewHeight", "getCollapseViewSize", "getCollapseViewPosY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallCollapseView */
/* loaded from: classes14.dex */
public final class C12925xf55305ed extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final int f175012s = qp1.e0.a(qp1.c0.f447240p) * 2;

    /* renamed from: t, reason: collision with root package name */
    public static final int f175013t = qp1.e0.a(qp1.c0.f447237m + qp1.c0.f447239o);

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f175014d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af f175015e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 f175016f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f175017g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175018h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f175019i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f175020m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Point f175021n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Point f175022o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f175023p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f175024q;

    /* renamed from: r, reason: collision with root package name */
    public int f175025r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12925xf55305ed(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f175014d = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570739ei3, this);
        int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca));
        setPadding(a17, a17, a17, a17);
        setVisibility(8);
        this.f175015e = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af) findViewById(com.p314xaae8f345.mm.R.id.sgw);
        this.f175016f = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27) findViewById(com.p314xaae8f345.mm.R.id.sgx);
        this.f175017g = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564865ad2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.sgy);
        this.f175018h = c22699x3dcdb352;
        qp1.g0.e(c22699x3dcdb352, qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)), qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)));
        android.widget.LinearLayout linearLayout = this.f175017g;
        int a18 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175018h;
        if (c22699x3dcdb3522 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = c22699x3dcdb3522.getLayoutParams();
            if (layoutParams3 != null) {
                if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    int a19 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj));
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.setMarginStart(a19);
                    marginLayoutParams.setMarginEnd(a19);
                }
                layoutParams = layoutParams3;
            }
            c22699x3dcdb3522.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af c12927xb2f1d9af = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12927xb2f1d9af) findViewById(com.p314xaae8f345.mm.R.id.sgw);
        if (c12927xb2f1d9af != null) {
            c12927xb2f1d9af.m54164x205ac394(qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        }
    }

    public final void b() {
        if (getVisibility() != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseView", "quickHide");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            com.tencent.mm.plugin.ball.view.FloatBallBlurView r0 = r6.f175016f
            qp1.g0.e(r0, r7, r8)
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout r0 = r6.f175015e
            qp1.g0.e(r0, r7, r8)
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12925xf55305ed.f175012s
            int r7 = r7 + r0
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12925xf55305ed.f175013t
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r7)     // Catch: java.lang.Throwable -> Lbb
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
            android.view.WindowManager r7 = r6.f175014d     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto L8c
            r7.updateViewLayout(r6, r2)     // Catch: java.lang.Throwable -> Lbb
        L8c:
            int r7 = r2.x     // Catch: java.lang.Throwable -> Lbb
            int r8 = r2.y     // Catch: java.lang.Throwable -> Lbb
            android.graphics.Point r9 = r6.f175022o     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L9b
            android.graphics.Point r9 = new android.graphics.Point     // Catch: java.lang.Throwable -> Lbb
            r9.<init>()     // Catch: java.lang.Throwable -> Lbb
            r6.f175022o = r9     // Catch: java.lang.Throwable -> Lbb
        L9b:
            android.graphics.Point r9 = r6.f175022o     // Catch: java.lang.Throwable -> Lbb
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
            boolean r7 = r6.f175023p     // Catch: java.lang.Throwable -> Lbb
            java.lang.Integer r8 = r6.f175024q     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto Lc4
            if (r8 == 0) goto Lb6
            int r7 = r8.intValue()     // Catch: java.lang.Throwable -> Lbb
            super.setVisibility(r7)     // Catch: java.lang.Throwable -> Lbb
        Lb6:
            r6.f175023p = r0     // Catch: java.lang.Throwable -> Lbb
            r6.f175024q = r4     // Catch: java.lang.Throwable -> Lbb
            goto Lc4
        Lbb:
            r7 = move-exception
            java.lang.String r8 = "updateCollapseViewSizeAndPos exception"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r7, r8, r9)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12925xf55305ed.c(int, int, java.lang.Integer, java.lang.Integer):void");
    }

    public final void d(float f17, int i17, int i18, boolean z17) {
        int i19;
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f17));
        boolean z18 = max == 1.0f;
        android.graphics.Point point = this.f175021n;
        if (z18) {
            i19 = point.y;
        } else {
            i19 = (int) (max * point.y);
            i18 += (int) ((r0 - i19) / 2.0f);
        }
        if (z17) {
            i17 += this.f175025r;
        }
        c(point.x, i19, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        java.util.Objects.toString(motionEvent);
        getVisibility();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a02 = this.f175020m;
        boolean z17 = false;
        if (c12929x567537a02 != null && c12929x567537a02.getVisibility() == 0) {
            z17 = true;
        }
        if (z17 && (c12929x567537a0 = this.f175020m) != null) {
            return c12929x567537a0.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getBlurView, reason: from getter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 getF175016f() {
        return this.f175016f;
    }

    /* renamed from: getCollapseIconView, reason: from getter */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 getF175018h() {
        return this.f175018h;
    }

    /* renamed from: getCollapseLayout, reason: from getter */
    public final android.widget.LinearLayout getF175017g() {
        return this.f175017g;
    }

    /* renamed from: getCollapseViewHeight */
    public final int m54151x3923d5af() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27 = this.f175016f;
        if (c12922xc01b5b27 != null) {
            return c12922xc01b5b27.getHeight();
        }
        return 0;
    }

    /* renamed from: getCollapseViewPosY */
    public final int m54152x57b75f0d() {
        android.graphics.Point point = this.f175022o;
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

    /* renamed from: getCollapseViewSize */
    public final android.graphics.Point m54153x57b8a689() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27 = this.f175016f;
        int width = c12922xc01b5b27 != null ? c12922xc01b5b27.getWidth() : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b272 = this.f175016f;
        return new android.graphics.Point(width, c12922xc01b5b272 != null ? c12922xc01b5b272.getHeight() : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f175020m;
        android.graphics.Point m54190xee69f5c1 = c12929x567537a0 != null ? c12929x567537a0.m54190xee69f5c1() : null;
        if (m54190xee69f5c1 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseView", "onAttachedToWindow pos: " + m54190xee69f5c1);
        int i17 = m54190xee69f5c1.x;
        int i18 = m54190xee69f5c1.y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a02 = this.f175020m;
        d(1.0f, i17, i18, c12929x567537a02 != null ? c12929x567537a02.f175096x1 : false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0;
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a02 = this.f175020m;
        boolean z17 = false;
        if (c12929x567537a02 != null && c12929x567537a02.W()) {
            z17 = true;
        }
        if (!z17 || (c12929x567537a0 = this.f175020m) == null) {
            return;
        }
        c12929x567537a0.g0(configuration);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f175020m;
        return c12929x567537a0 != null ? c12929x567537a0.onInterceptTouchEvent(ev6) : super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f175020m;
        return c12929x567537a0 != null ? c12929x567537a0.onTouchEvent(event) : super.onTouchEvent(event);
    }

    /* renamed from: setCustomViewSize */
    public final void m54154x55bfd7d9(android.graphics.Point size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseView", "setCustomViewSize size: " + size);
        android.graphics.Point point = this.f175021n;
        point.set(qp1.e0.a(size.x), qp1.e0.a(size.y));
        c(point.x, point.y, null, null);
    }

    /* renamed from: setExtendWidth */
    public final void m54155x4649990a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallCollapseView", "setExtendWidth: " + i17);
        this.f175025r = i17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.util.Objects.toString(this.f175022o);
        if (this.f175022o == null && i17 == 0) {
            this.f175023p = true;
            this.f175024q = java.lang.Integer.valueOf(i17);
        } else {
            this.f175023p = false;
            this.f175024q = null;
            super.setVisibility(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12925xf55305ed(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f175021n = new android.graphics.Point();
        try {
            a(context);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallCollapseView", e17, "init exception", new java.lang.Object[0]);
        }
    }
}
