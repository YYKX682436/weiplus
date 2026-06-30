package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:B\u001b\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107B#\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00108\u001a\u00020\u0005¢\u0006\u0004\b6\u00109J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u0003R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u00100¨\u0006;"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallView;", "Landroid/widget/FrameLayout;", "Lgp1/y;", "Landroid/graphics/Point;", "getFloatBallViewSize", "", "getCollapseViewPosY", "", "getCollapseScale", "getCurrentOrientation", "getFloatBallWidth", "getFloatBallHeight", "getFloatBallCurrentWidth", "getViewPosXOnDown", "", "enableClick", "Ljz5/f0;", "setEnableClick", "getClickExpandWidth", "alpha", "setAlpha", "Lgp1/k;", "delegate", "setFloatBallViewDelegate", "getCurrentBallPositionX", "getCurrentBallPositionY", "getCurrentBallPosForConflict", "getCurrentBallSizeForConflict", "Lcom/tencent/mm/plugin/ball/view/ContentFloatBallCollapseView;", "s", "Ljz5/g;", "getCollapseView", "()Lcom/tencent/mm/plugin/ball/view/ContentFloatBallCollapseView;", "collapseView", "<set-?>", "H", "I", "getPositionY", "()I", "positionY", "Lpp1/z;", "Q", "getRecyclerViewHelper", "()Lpp1/z;", "recyclerViewHelper", "Lrp1/v0;", "R", "getIdleHelper", "()Lrp1/v0;", "idleHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rp1/h", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ContentFloatBallView extends android.widget.FrameLayout implements gp1.y {
    public static final rp1.h T = new rp1.h(null);
    public static final jz5.g U = jz5.h.b(rp1.f.f398393d);
    public static final jz5.g V = jz5.h.b(rp1.e.f398384d);
    public static final int W;

    /* renamed from: p0, reason: collision with root package name */
    public static final jz5.g f93415p0;

    /* renamed from: x0, reason: collision with root package name */
    public static float f93416x0;

    /* renamed from: y0, reason: collision with root package name */
    public static int f93417y0;
    public boolean A;
    public android.graphics.Point B;
    public final android.graphics.PointF C;
    public final android.graphics.Point D;
    public boolean E;
    public boolean F;
    public boolean G;

    /* renamed from: H, reason: from kotlin metadata */
    public int positionY;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f93418J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean P;

    /* renamed from: Q, reason: from kotlin metadata */
    public final jz5.g recyclerViewHelper;

    /* renamed from: R, reason: from kotlin metadata */
    public final jz5.g idleHelper;
    public boolean S;

    /* renamed from: d, reason: collision with root package name */
    public int f93419d;

    /* renamed from: e, reason: collision with root package name */
    public int f93420e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f93421f;

    /* renamed from: g, reason: collision with root package name */
    public int f93422g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Vibrator f93423h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f93424i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.WindowManager f93425m;

    /* renamed from: n, reason: collision with root package name */
    public ep1.x f93426n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f93427o;

    /* renamed from: p, reason: collision with root package name */
    public gp1.k f93428p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93429q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f93430r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g collapseView;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView f93432t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBackgroundView f93433u;

    /* renamed from: v, reason: collision with root package name */
    public int f93434v;

    /* renamed from: w, reason: collision with root package name */
    public int f93435w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f93436x;

    /* renamed from: y, reason: collision with root package name */
    public long f93437y;

    /* renamed from: z, reason: collision with root package name */
    public int f93438z;

    static {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        ((ov.p0) j0Var).getClass();
        W = qp1.e0.a(dimensionPixelSize);
        f93415p0 = jz5.h.b(rp1.g.f398400d);
        f93416x0 = -1.0f;
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        f93416x0 = com.tencent.mm.plugin.ball.service.p4.f93200n / 100.0f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "posYPercentOfScreen: " + f93416x0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static void I(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.Integer num, boolean z28, yz5.a aVar, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2;
        boolean z29 = (i17 & 4) != 0 ? false : z19;
        boolean z37 = (i17 & 8) != 0 ? true : z27;
        java.lang.Integer num2 = (i17 & 16) != 0 ? null : num;
        boolean z38 = (i17 & 32) != 0 ? false : z28;
        yz5.a aVar2 = (i17 & 64) == 0 ? aVar : null;
        if (contentFloatBallView.v()) {
            return;
        }
        pp1.z recyclerViewHelper = contentFloatBallView.getRecyclerViewHelper();
        rp1.u uVar = new rp1.u(z17, contentFloatBallView, aVar2);
        recyclerViewHelper.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "setExpand isExpand: " + z17 + ", current: " + pp1.z.B + ", startX: " + num2 + ", currentDockLeft: " + z18 + ", force: " + z29);
        if (z17 && (!pp1.z.B || z29)) {
            if (recyclerViewHelper.f357455p || (contentFloatBallView2 = recyclerViewHelper.f357448f) == null) {
                return;
            }
            if (!z18 || recyclerViewHelper.i()) {
                if (z18 || recyclerViewHelper.j()) {
                    float intValue = num2 != null ? num2.intValue() : contentFloatBallView2.getCurrentBallPositionX();
                    float n17 = z18 ? 0.0f : contentFloatBallView2.n(false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "animateToExpand isDockLeft: " + z18 + ", startX: " + intValue + ", endX: " + n17 + ", ballPosXWhenDockRight: " + recyclerViewHelper.f357464y + ", ballPosXWhenDockLeft: " + recyclerViewHelper.f357465z);
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(intValue, n17);
                    ofFloat.setInterpolator(pp1.z.D);
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new pp1.j(z18, recyclerViewHelper, num2));
                    ofFloat.addListener(new pp1.i(recyclerViewHelper, uVar));
                    recyclerViewHelper.f357455p = true;
                    new pp1.m(recyclerViewHelper, z18, ofFloat).invoke();
                    com.tencent.mm.plugin.ball.service.i.a(4, 1, z18 ? 2 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (z17) {
            return;
        }
        if ((pp1.z.B || z29) && !recyclerViewHelper.f357455p) {
            pp1.h hVar = new pp1.h(recyclerViewHelper, z18, z38, uVar);
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView3 = recyclerViewHelper.f357448f;
            if (contentFloatBallView3 == null) {
                return;
            }
            if (!z18 || recyclerViewHelper.i()) {
                if (z18 || recyclerViewHelper.j()) {
                    int floatBallWidth = contentFloatBallView3.getFloatBallWidth();
                    int floatBallCurrentWidth = contentFloatBallView3.getFloatBallCurrentWidth();
                    int i18 = floatBallCurrentWidth - floatBallWidth;
                    float floatValue = ((java.lang.Number) ((jz5.n) f93415p0).getValue()).floatValue();
                    int p17 = contentFloatBallView3.p(z18, true, (int) floatValue, z38 ? floatBallCurrentWidth : floatBallWidth);
                    if (!z18 && !z38) {
                        p17 -= i18;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBall.FloatBallRecyclerViewHelperV2", "animateToCollapse isDockLeft: " + z18 + ", needAnimation: " + z37 + ", targetPositionX: " + p17 + ", floatBallWidth: " + floatBallWidth + ", floatBallCurrentWidth: " + floatBallCurrentWidth + ", diff: " + i18 + ", collapseShowWidth: " + floatValue + ", totalScrolledOriginX: 0.0, ballPosXWhenDockLeft: " + recyclerViewHelper.f357465z + ", ballPosXWhenDockRight: " + recyclerViewHelper.f357464y + ", startX: " + num2);
                    if (!z37) {
                        if (z18) {
                            pp1.a0.b(recyclerViewHelper, true, p17, null, num2, false, z38, false, 64, null);
                        } else {
                            pp1.a0.a(recyclerViewHelper, false, p17, null, num2, false, z38, false, 64, null);
                        }
                        hVar.invoke();
                        return;
                    }
                    float[] fArr = new float[2];
                    fArr[0] = num2 != null ? num2.intValue() : contentFloatBallView3.getCurrentBallPositionX();
                    fArr[1] = p17;
                    android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(fArr);
                    ofFloat2.setInterpolator(pp1.z.C);
                    ofFloat2.setDuration(300L);
                    ofFloat2.addUpdateListener(new pp1.e(z18, recyclerViewHelper, num2, z38));
                    ofFloat2.addListener(new pp1.d(hVar));
                    ofFloat2.start();
                    recyclerViewHelper.f357455p = true;
                }
            }
        }
    }

    public static /* synthetic */ void L(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, boolean z17, boolean z18, float f17, boolean z19, java.lang.Float f18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = contentFloatBallView.A;
        }
        boolean z27 = z18;
        if ((i17 & 4) != 0) {
            f17 = contentFloatBallView.getCollapseScale();
        }
        float f19 = f17;
        if ((i17 & 8) != 0) {
            z19 = false;
        }
        boolean z28 = z19;
        if ((i17 & 16) != 0) {
            f18 = null;
        }
        contentFloatBallView.K(z17, z27, f19, z28, f18);
    }

    public static /* synthetic */ void P(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, int i17, java.lang.Integer num, boolean z17, boolean z18, boolean z19, boolean z27, int i18, java.lang.Object obj) {
        contentFloatBallView.O(i17, num, z17, z18, (i18 & 16) != 0 ? true : z19, (i18 & 32) != 0 ? true : z27);
    }

    public static /* synthetic */ void S(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            z17 = contentFloatBallView.A;
        }
        contentFloatBallView.R(i17, z17);
    }

    public static void Y(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, float f17, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 1.0f;
        }
        java.lang.Integer num2 = (i17 & 2) != 0 ? null : num;
        contentFloatBallView.U(0.0f);
        boolean z17 = (contentFloatBallView.f93419d & 32) != 0;
        int i18 = (int) i(contentFloatBallView, false, 1, null);
        int floatBallWidth = contentFloatBallView.getFloatBallWidth();
        int p17 = contentFloatBallView.p(contentFloatBallView.A, true, i18, floatBallWidth);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "updateViewWhenCollapsed targetX: " + p17 + ", fixedY: " + num2 + ", isFloatBallViewDockLeft: " + contentFloatBallView.A + ", isCurrentCollapsedState: " + contentFloatBallView.w() + ", floatBallWidth: " + floatBallWidth + ", collapseWidth: " + i18 + ", isForeground: " + z17);
        P(contentFloatBallView, p17, num2, true, false, true, false, 32, null);
        L(contentFloatBallView, contentFloatBallView.s() && z17, false, contentFloatBallView.getCollapseScale(), false, java.lang.Float.valueOf(f17), 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView getCollapseView() {
        return (com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView) ((jz5.n) this.collapseView).getValue();
    }

    private final int getCollapseViewPosY() {
        return getCollapseView().getPositionY();
    }

    public static final float getCollapsedScale() {
        return T.a();
    }

    private final android.graphics.Point getFloatBallViewSize() {
        return new android.graphics.Point(getFloatBallWidth(), getFloatBallHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rp1.v0 getIdleHelper() {
        return (rp1.v0) ((jz5.n) this.idleHelper).getValue();
    }

    private static final int getNavigationBarHeight() {
        int i17 = f93417y0;
        if (i17 != 0) {
            return i17;
        }
        f93417y0 = com.tencent.mm.ui.bk.j(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "getNavigationBarHeight " + f93417y0);
        return f93417y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pp1.z getRecyclerViewHelper() {
        return (pp1.z) ((jz5.n) this.recyclerViewHelper).getValue();
    }

    public static float i(com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            boolean z18 = contentFloatBallView.A;
        }
        contentFloatBallView.getClass();
        return ((java.lang.Number) ((jz5.n) f93415p0).getValue()).floatValue();
    }

    public final void A(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        if (z17) {
            kotlin.jvm.internal.o.d(this.B);
            f93416x0 = i18 / r2.y;
            com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
            int i19 = (int) (f93416x0 * 100);
            f17.getClass();
            if (com.tencent.mm.plugin.ball.service.p4.f93200n != i19) {
                com.tencent.mm.plugin.ball.service.p4.f93200n = i19;
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).A("content_percent_y", com.tencent.mm.plugin.ball.service.p4.f93200n);
            }
        }
        this.positionY = i18;
        int floatBallWidth = getFloatBallWidth();
        int floatBallHeight = getFloatBallHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "notifyBallPositionChanged-content, x:%s, y:%s, collapseViewPosY: " + getCollapseViewPosY() + ", width: " + floatBallWidth + ", height: " + floatBallHeight + ", isSettled: " + z17 + ", isManual: " + z18 + ", isDockLeft: " + this.A);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).a(i17, i18, floatBallWidth, floatBallHeight, z17, this.A, this.L, 1, z18, z19);
        }
    }

    public final void B(boolean z17, boolean z18) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        A(layoutParams2.x, layoutParams2.y, z17, z18, true);
    }

    public final void C() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onDragStart dockLeft: " + this.A + ", collapseState: " + this.L);
        if (this.A) {
            getRecyclerViewHelper().i();
        } else {
            getRecyclerViewHelper().j();
        }
        this.M = w() ? this.A ? 1 : 2 : 0;
        if (w()) {
            d75.b.g(new rp1.t(this));
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
            if (contentFloatBallRecyclerView != null) {
                int e17 = this.A ? getRecyclerViewHelper().e() - 1 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(e17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contentFloatBallRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "onDragStart", "()V", "Undefined", "scrollToPosition", "(I)V");
                contentFloatBallRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contentFloatBallRecyclerView, "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "onDragStart", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    public final void D(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onFloatBallClicked ballInfo: " + ballInfo.f93046d + ", " + ballInfo.f93049g + ", " + ballInfo.f93063x);
        S(this, this.A ? 1 : 2, false, 2, null);
        getRecyclerViewHelper().m(false);
        Y(this, getRecyclerViewHelper().e() == 1 ? 0.0f : 1.0f, null, 2, null);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).h();
        }
    }

    public final void E(android.content.res.Configuration configuration) {
        if (configuration == null) {
            return;
        }
        gp1.k kVar = this.f93428p;
        java.lang.Integer f17 = kVar != null ? kVar.f() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onConfigurationChanged, orientation:%d, lastOrientation: %d, otherOrientation: %s", java.lang.Integer.valueOf(configuration.orientation), java.lang.Integer.valueOf(this.f93438z), f17);
        int i17 = configuration.orientation;
        F(i17, f17 != null && i17 == f17.intValue());
        int i18 = configuration.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).onOrientationChange(i18);
        }
    }

    public final void F(int i17, boolean z17) {
        android.graphics.Point l17;
        android.view.Display defaultDisplay;
        android.graphics.Point point;
        android.graphics.Point point2 = this.B;
        this.B = com.tencent.mm.ui.bk.h(getContext());
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(getContext())) {
            android.graphics.Point point3 = this.B;
            if (point3 != null) {
                point3.x = com.tencent.mm.ui.bk.g();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "processOrientationChanged processMagicWindow " + this.B);
        }
        if (com.tencent.mm.ui.bk.y() && (point = this.B) != null) {
            point.x = com.tencent.mm.ui.bk.f();
        }
        android.view.WindowManager windowManager = this.f93425m;
        this.K = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? 0 : defaultDisplay.getRotation();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "processOrientationChanged, screenResolution: " + this.B + ", lastResolution: " + point2 + ", currentDisplayRotation: " + this.K + ", lastOrientation: " + this.f93438z + ", checkConflict: " + z17);
        if (this.f93438z == i17) {
            java.lang.Integer valueOf = point2 != null ? java.lang.Integer.valueOf(point2.x) : null;
            android.graphics.Point point4 = this.B;
            if (kotlin.jvm.internal.o.b(valueOf, point4 != null ? java.lang.Integer.valueOf(point4.x) : null)) {
                java.lang.Integer valueOf2 = point2 != null ? java.lang.Integer.valueOf(point2.y) : null;
                android.graphics.Point point5 = this.B;
                if (kotlin.jvm.internal.o.b(valueOf2, point5 != null ? java.lang.Integer.valueOf(point5.y) : null)) {
                    return;
                }
            }
        }
        this.f93438z = i17;
        V();
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int p17 = p(this.A, true, (int) i(this, false, 1, null), getFloatBallWidth());
        getFloatBallHeight();
        getCollapseView().getCurrentMaskHeight();
        int i18 = layoutParams2.x;
        rp1.h hVar = T;
        android.graphics.Point point6 = this.B;
        kotlin.jvm.internal.o.d(point6);
        int b17 = hVar.b(point6.y, layoutParams2.y);
        android.graphics.Point j17 = j(i18, b17);
        if (z17 && (l17 = l(j17)) != null) {
            b17 = l17.y;
        }
        int i19 = b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "processOrientationChanged, targetPositionX: " + p17 + ", targetPositionY: " + i19 + ", screenResolution: " + this.B);
        if (!w()) {
            I(this, false, this.A, true, false, null, false, null, 112, null);
        }
        O(p17, java.lang.Integer.valueOf(i19), true, false, true, false);
        L(this, s(), this.A, getCollapseScale(), false, null, 24, null);
    }

    public final void G(android.view.MotionEvent motionEvent, boolean z17) {
        if (!this.E || z17) {
            this.E = true;
            android.graphics.PointF pointF = this.C;
            pointF.x = motionEvent.getRawX();
            pointF.y = motionEvent.getRawY();
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            android.graphics.Point point = this.D;
            point.x = layoutParams2.x;
            point.y = layoutParams2.y;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "recordPositionWhenActionDown " + point);
        }
    }

    public final void H() {
        ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).clear();
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView = getCollapseView();
        collapseView.getClass();
        try {
            android.view.WindowManager windowManager = collapseView.f93388d;
            if (windowManager != null) {
                windowManager.removeView(collapseView);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContentFloatBallCollapseView", th6, "releaseCollapseView exception", new java.lang.Object[0]);
        }
        this.f93428p = null;
    }

    public final void J(boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if ((this.f93419d & 32) != 0) {
            if (w()) {
                L(this, s(), this.A, 0.0f, false, null, 28, null);
            }
            if (getVisibility() == 0 && z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "showContentBall already show");
                return;
            }
            if (!z17 || this.f93426n == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "showContentBall without animation");
                setVisibility(0);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "showContentBall with animation");
                ep1.x xVar = this.f93426n;
                kotlin.jvm.internal.o.d(xVar);
                xVar.f(animatorListenerAdapter);
            }
        }
    }

    public final void K(boolean z17, boolean z18, float f17, boolean z19, java.lang.Float f18) {
        if (z17) {
            T(z18, f17, z19);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView = getCollapseView();
        if (!kotlin.jvm.internal.o.b(collapseView.f93393i, java.lang.Boolean.valueOf(z18))) {
            collapseView.f93393i = java.lang.Boolean.valueOf(z18);
            android.widget.RelativeLayout relativeLayout = collapseView.f93389e;
            android.view.ViewGroup.LayoutParams layoutParams = null;
            if (relativeLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = null;
                } else if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                    if (z18) {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams2).gravity = 8388629;
                    } else {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams2).gravity = 8388627;
                    }
                }
                relativeLayout.setLayoutParams(layoutParams2);
            }
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = collapseView.f93390f;
            if (roundCornerRelativeLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams3 = roundCornerRelativeLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = null;
                } else if (layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams) {
                    if (z18) {
                        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                        layoutParams4.removeRule(20);
                        layoutParams4.addRule(21);
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = collapseView.f93394m;
                        layoutParams4.setMarginEnd(contentFloatBallView != null ? (int) contentFloatBallView.getClickExpandWidth() : 0);
                    } else {
                        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
                        layoutParams5.removeRule(21);
                        layoutParams5.addRule(20);
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = collapseView.f93394m;
                        layoutParams5.setMarginStart(contentFloatBallView2 != null ? (int) contentFloatBallView2.getClickExpandWidth() : 0);
                    }
                }
                roundCornerRelativeLayout.setLayoutParams(layoutParams3);
            }
            com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = collapseView.f93391g;
            if (floatBallRoundCornerFrameLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams6 = floatBallRoundCornerFrameLayout.getLayoutParams();
                if (layoutParams6 == null) {
                    layoutParams6 = null;
                } else if (layoutParams6 instanceof android.widget.RelativeLayout.LayoutParams) {
                    if (z18) {
                        android.widget.RelativeLayout.LayoutParams layoutParams7 = (android.widget.RelativeLayout.LayoutParams) layoutParams6;
                        layoutParams7.removeRule(20);
                        layoutParams7.addRule(21);
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView3 = collapseView.f93394m;
                        layoutParams7.setMarginEnd(contentFloatBallView3 != null ? (int) contentFloatBallView3.getClickExpandWidth() : 0);
                    } else {
                        android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) layoutParams6;
                        layoutParams8.removeRule(21);
                        layoutParams8.addRule(20);
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView4 = collapseView.f93394m;
                        layoutParams8.setMarginStart(contentFloatBallView4 != null ? (int) contentFloatBallView4.getClickExpandWidth() : 0);
                    }
                }
                floatBallRoundCornerFrameLayout.setLayoutParams(layoutParams6);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = collapseView.f93392h;
            if (weImageView != null) {
                android.view.ViewGroup.LayoutParams layoutParams9 = weImageView.getLayoutParams();
                if (layoutParams9 != null) {
                    if (layoutParams9 instanceof android.widget.RelativeLayout.LayoutParams) {
                        if (z18) {
                            android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
                            layoutParams10.removeRule(18);
                            layoutParams10.addRule(19, com.tencent.mm.R.id.sgz);
                        } else {
                            android.widget.RelativeLayout.LayoutParams layoutParams11 = (android.widget.RelativeLayout.LayoutParams) layoutParams9;
                            layoutParams11.removeRule(19);
                            layoutParams11.addRule(18, com.tencent.mm.R.id.sgz);
                        }
                    }
                    layoutParams = layoutParams9;
                }
                weImageView.setLayoutParams(layoutParams);
            }
        }
        M(z17, f18);
    }

    public final void M(boolean z17, java.lang.Float f17) {
        if (z17) {
            if (!((this.f93419d & 32) != 0)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallViewV2", "showCollapseView isForeground and ignore");
                return;
            }
        }
        if (z17) {
            Q(f17 != null ? f17.floatValue() : getIdleHelper().f398539c ? 0.4f : 1.0f);
            getCollapseView().setVisibility(0);
        } else {
            Q(f17 != null ? f17.floatValue() : 0.0f);
            ((ku5.t0) ku5.t0.f312615d).B(new rp1.v(this));
        }
    }

    public final void N(boolean z17, int i17, int i18, int i19, int i27, boolean z18, yz5.a aVar) {
        if (v()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "startStickyAnimation stickToLeft: " + z17 + ", startPositionX: " + i17 + ", startPositionY: " + i18 + ", targetPositionX: " + i19 + ", targetPositionY: " + i27 + ", manual: " + z18);
        android.animation.ValueAnimator valueAnimator = this.f93424i;
        if (valueAnimator != null) {
            kotlin.jvm.internal.o.d(valueAnimator);
            if (valueAnimator.isRunning()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "cancelStickyAnimation");
                android.animation.ValueAnimator valueAnimator2 = this.f93424i;
                kotlin.jvm.internal.o.d(valueAnimator2);
                valueAnimator2.cancel();
            }
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f93424i = ofFloat;
        if (ofFloat != null) {
            ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new rp1.w(i17, i19, i18, i27, this));
            ofFloat.addListener(new rp1.x(aVar, this));
        }
        this.f93429q = true;
        android.animation.ValueAnimator valueAnimator3 = this.f93424i;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public final void O(int i17, java.lang.Integer num, boolean z17, boolean z18, boolean z19, boolean z27) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i18 = layoutParams2.x;
        int i19 = layoutParams2.y;
        if (i18 == i17 && num != null && i19 == num.intValue()) {
            return;
        }
        layoutParams2.x = i17;
        layoutParams2.y = num != null ? num.intValue() : i19;
        try {
            android.view.WindowManager windowManager = this.f93425m;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, layoutParams2);
            }
            if (z19) {
                if (num != null) {
                    i19 = num.intValue();
                }
                A(i17, i19, z17, z18, z27);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallViewV2", th6, "updateBallPosition fail", new java.lang.Object[0]);
        }
    }

    public final void Q(float f17) {
        getCollapseView().setAlpha(f17);
    }

    public final void R(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "updateCollapseState state: " + i17 + ", currentState: " + this.L + ", targetDockLeft: " + z17);
        int i18 = this.L;
        if (i18 != i17) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).iterator();
            while (it.hasNext()) {
                ((gp1.b0) it.next()).b(null, i18, i17);
            }
        }
        this.L = i17;
        if (!gp1.i.a(i17)) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
            if (contentFloatBallRecyclerView != null) {
                contentFloatBallRecyclerView.requestFocus();
                return;
            }
            return;
        }
        getIdleHelper().c();
        if (this.f93436x) {
            this.f93436x = false;
            W(z17);
        }
    }

    public final void T(boolean z17, float f17, boolean z18) {
        float f18;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i17 = layoutParams2.x;
        int i18 = layoutParams2.y;
        if (z17) {
            float floatBallWidth = (getFloatBallWidth() + i17) - qp1.c0.f365700i;
            float collapseScale = 1 + getCollapseScale();
            float f19 = pp1.b.f357395d;
            float f27 = pp1.b.f357396e;
            f18 = (floatBallWidth + (collapseScale * f27)) - ((f17 - getCollapseScale()) * f27);
        } else {
            float f28 = pp1.b.f357395d;
            f18 = i17 + (pp1.b.f357396e * f17);
        }
        float f29 = pp1.b.f357395d;
        float f37 = i18 + pp1.b.f357396e;
        int floatBallWidth2 = getFloatBallWidth();
        if (layoutParams2.width > floatBallWidth2 && ((!z17 && !z18) || (z17 && z18))) {
            f18 += r0 - floatBallWidth2;
        }
        int i19 = (int) f18;
        if (i19 == i17 && ((int) f37) == i18) {
            return;
        }
        getCollapseView().b(f17, i19, (int) f37, z17);
    }

    public final void U(float f17) {
        if (f17 == 0.0f) {
            setAlpha(0.0f);
            setVisibility(8);
            return;
        }
        setAlpha(f17);
        if (getAlpha() <= 0.0f || getVisibility() == 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new rp1.y(this));
    }

    public final void V() {
        android.graphics.Point floatBallViewSize = getFloatBallViewSize();
        int i17 = floatBallViewSize.x;
        int i18 = floatBallViewSize.y;
        if (this.f93421f == null) {
            this.f93421f = new android.graphics.Point();
        }
        android.graphics.Point point = this.f93421f;
        if (point != null) {
            point.x = i17;
            point.y = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        if (i17 == 0 || i18 == 0) {
            layoutParams2.width = 0;
            layoutParams2.height = 0;
        } else {
            layoutParams2.width = i17;
            layoutParams2.height = i18;
        }
        try {
            android.view.WindowManager windowManager = this.f93425m;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, layoutParams2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallViewV2", e17, "updateFloatBallViewSize exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "updateFloatBallViewSize, width:%s, height:%s", java.lang.Integer.valueOf(layoutParams2.width), java.lang.Integer.valueOf(layoutParams2.height));
    }

    public final void W(boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int i17 = layoutParams2.x;
        int i18 = layoutParams2.y;
        android.graphics.Point floatBallViewSize = getFloatBallViewSize();
        int p17 = p(z17, w(), (int) i(this, false, 1, null), getFloatBallWidth());
        rp1.h hVar = T;
        android.graphics.Point point = this.B;
        kotlin.jvm.internal.o.d(point);
        int b17 = hVar.b(point.y, layoutParams2.y);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "updateFloatBallViewSizeAndPosition isDockLeft: " + z17 + ", currentSize: (" + layoutParams2.width + ", " + layoutParams2.height + "), targetSize: " + floatBallViewSize + ", curPos: (" + i17 + ", " + i18 + "), targetPos: (" + p17 + ", " + b17 + ')');
        try {
            if (floatBallViewSize.x == layoutParams2.width && floatBallViewSize.y == layoutParams2.height && i17 == p17 && i18 == b17) {
                return;
            }
            layoutParams2.x = p17;
            layoutParams2.y = b17;
            android.view.WindowManager windowManager = this.f93425m;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, layoutParams2);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new rp1.z(layoutParams2, floatBallViewSize, this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallViewV2", e17, "updateFloatBallViewSizeAndPosition exception", new java.lang.Object[0]);
        }
    }

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        kotlin.jvm.internal.o.g(ballInfoList, "ballInfoList");
        getRecyclerViewHelper().X(ballInfoList, ballInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onFloatBallInfoChanged-content ballInfoList: " + ballInfoList.size() + ", showCount: " + getRecyclerViewHelper().e() + "collapse: " + w() + ", lastShowCount: " + this.f93435w + ", pendingUpdateBallSize: " + this.f93436x + ", currentLayoutState: " + this.f93419d + ", lastLayoutState: " + this.f93420e);
        this.f93420e = this.f93419d;
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            this.f93419d |= 32;
        }
        if (!w() && (i17 = this.f93435w) != -1 && i17 >= getRecyclerViewHelper().e()) {
            this.f93436x = true;
        }
        if (!this.f93436x) {
            W(this.A);
        }
        if (s()) {
            J(false, false, null);
            if (w()) {
                if (getRecyclerViewHelper().e() <= this.f93435w || ballInfoList.size() <= this.f93434v) {
                    Y(this, getIdleHelper().f398539c ? 0.4f : 1.0f, null, 2, null);
                } else {
                    d75.b.g(new rp1.t(this));
                    Y(this, 1.0f, null, 2, null);
                    getIdleHelper().c();
                }
            }
        } else {
            t(false, null);
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f93433u;
            if (floatBackgroundView != null) {
                floatBackgroundView.a(false);
            }
            Y(this, 0.0f, null, 2, null);
            d75.b.g(new rp1.t(this));
        }
        this.f93434v = ballInfoList.size();
        this.f93435w = getRecyclerViewHelper().e();
    }

    public final void d(com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView) {
        this.f93433u = floatBackgroundView;
        getRecyclerViewHelper().f357447e = floatBackgroundView;
    }

    public final boolean e(android.view.MotionEvent motionEvent) {
        boolean z17 = this.A;
        android.graphics.PointF pointF = this.C;
        float rawX = z17 ? motionEvent.getRawX() - pointF.x : -(motionEvent.getRawX() - pointF.x);
        float i17 = i(this, false, 1, null);
        float f17 = qp1.c0.f365700i - i17;
        float f18 = pp1.b.f357395d;
        boolean z18 = rawX >= f17 - pp1.b.f357396e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "canExpandWhenDrag offsetX " + rawX + ", collapseShowWidth " + i17 + ", diff: " + (rawX - i17) + ", canExpand: " + z18);
        return z18;
    }

    public final void f() {
        this.N = false;
        if (this.M == 0) {
            if (this.A) {
                float currentBallPositionX = getCurrentBallPositionX();
                float f17 = pp1.b.f357395d;
                float f18 = currentBallPositionX + pp1.b.f357396e;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "checkCanSwitchEdge-canChangeRight firstItemLeft: " + f18 + ", screenResolution: " + this.B);
                android.graphics.Point point = this.B;
                if (point != null) {
                    this.N = f18 > ((float) point.x) * 0.3f;
                }
            } else {
                float currentBallPositionX2 = getCurrentBallPositionX() + getFloatBallCurrentWidth();
                float f19 = pp1.b.f357395d;
                float f27 = currentBallPositionX2 - pp1.b.f357396e;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "checkCanSwitchEdge-canChangeLeft lastItemRight: " + f27 + ", screenResolution: " + this.B);
                android.graphics.Point point2 = this.B;
                if (point2 != null) {
                    int i17 = point2.x;
                    this.N = ((float) i17) - f27 > ((float) i17) * 0.3f;
                }
            }
        }
        if (!this.N || this.P) {
            return;
        }
        this.P = true;
        android.os.Vibrator vibrator = this.f93423h;
        if (vibrator != null) {
            vibrator.vibrate(20L);
        }
    }

    public final boolean g(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.C;
        return java.lang.Math.abs((double) (rawX - pointF.x)) > ((double) this.f93422g) || java.lang.Math.abs((double) (motionEvent.getRawY() - pointF.y)) > ((double) this.f93422g);
    }

    public final float getClickExpandWidth() {
        return ((java.lang.Number) ((jz5.n) V).getValue()).floatValue();
    }

    public final float getCollapseScale() {
        return T.a();
    }

    public final android.graphics.Point getCurrentBallPosForConflict() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        return j(layoutParams2.x, layoutParams2.y);
    }

    public final int getCurrentBallPositionX() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        return ((android.view.WindowManager.LayoutParams) layoutParams).x;
    }

    public final int getCurrentBallPositionY() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        return ((android.view.WindowManager.LayoutParams) layoutParams).y;
    }

    public final android.graphics.Point getCurrentBallSizeForConflict() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        return k(layoutParams2.width, layoutParams2.height);
    }

    /* renamed from: getCurrentOrientation, reason: from getter */
    public final int getF93438z() {
        return this.f93438z;
    }

    public final int getFloatBallCurrentWidth() {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return getFloatBallWidth();
        }
        int i17 = layoutParams2.width;
        int floatBallWidth = getFloatBallWidth();
        return i17 >= floatBallWidth ? i17 : floatBallWidth;
    }

    public final int getFloatBallHeight() {
        return qp1.c0.f365701j;
    }

    public final int getFloatBallWidth() {
        android.graphics.Point point = this.B;
        if (point != null) {
            kotlin.jvm.internal.o.d(point);
            if (point.x > 0) {
                int e17 = qp1.c0.f365700i * getRecyclerViewHelper().e();
                android.graphics.Point point2 = this.B;
                kotlin.jvm.internal.o.d(point2);
                return java.lang.Math.min(e17, point2.x);
            }
        }
        return qp1.c0.f365700i * getRecyclerViewHelper().e();
    }

    public final int getPositionY() {
        return this.positionY;
    }

    public final int getViewPosXOnDown() {
        return this.D.x;
    }

    public final void h() {
        if (this.F) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "collapseFloatBall isDragging and ignore");
            return;
        }
        if (x()) {
            if (this.A) {
                com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
                if (contentFloatBallRecyclerView != null) {
                    int e17 = getRecyclerViewHelper().e() - 1;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(e17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(contentFloatBallRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "collapseFloatBall", "()V", "Undefined", "scrollToPosition", "(I)V");
                    contentFloatBallRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(contentFloatBallRecyclerView, "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "collapseFloatBall", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            } else {
                com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = this.f93432t;
                if (contentFloatBallRecyclerView2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(contentFloatBallRecyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "collapseFloatBall", "()V", "Undefined", "scrollToPosition", "(I)V");
                    contentFloatBallRecyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(contentFloatBallRecyclerView2, "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "collapseFloatBall", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
            com.tencent.mm.plugin.ball.service.i.a(1, 2, this.A ? 1 : 2);
            ((ku5.t0) ku5.t0.f312615d).B(new rp1.i(this));
        }
    }

    public final android.graphics.Point j(int i17, int i18) {
        int floatBallHeight = (int) ((getFloatBallHeight() - getCollapseView().getCurrentMaskHeight()) / 2.0f);
        float f17 = pp1.b.f357395d;
        return new android.graphics.Point(i17 + ((int) pp1.b.f357396e), (i18 + floatBallHeight) - W);
    }

    public final android.graphics.Point k(int i17, int i18) {
        return new android.graphics.Point(i17, getCollapseView().getCurrentMaskHeight() + (W * 2));
    }

    public final android.graphics.Point l(android.graphics.Point point) {
        int i17;
        int i18;
        java.lang.Boolean e17;
        gp1.k kVar = this.f93428p;
        android.graphics.Point b17 = kVar != null ? kVar.b() : null;
        gp1.k kVar2 = this.f93428p;
        android.graphics.Point c17 = kVar2 != null ? kVar2.c() : null;
        gp1.k kVar3 = this.f93428p;
        boolean booleanValue = (kVar3 == null || (e17 = kVar3.e()) == null) ? false : e17.booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "getFixedPositionAfterConflictFix otherBallViewSize: " + b17 + ", otherBallViewPos: " + c17 + ", otherBallViewDockLeft: " + booleanValue);
        if (b17 == null || (i17 = b17.x) == 0 || (i18 = b17.y) == 0 || c17 == null) {
            return null;
        }
        android.graphics.Point o17 = o(point, c17.x, c17.y, i17, i18, booleanValue);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "getFixedPositionAfterConflictFix fixedPos: " + o17);
        return o17;
    }

    public final int m(boolean z17) {
        int floatValue = (int) ((java.lang.Number) ((jz5.n) f93415p0).getValue()).floatValue();
        int floatBallWidth = getFloatBallWidth();
        int i17 = this.K;
        android.graphics.Point point = this.B;
        kotlin.jvm.internal.o.d(point);
        return q(true, z17, floatValue, floatBallWidth, i17, point.x);
    }

    public final int n(boolean z17) {
        int floatValue = (int) ((java.lang.Number) ((jz5.n) f93415p0).getValue()).floatValue();
        int floatBallCurrentWidth = getFloatBallCurrentWidth();
        int i17 = this.K;
        android.graphics.Point point = this.B;
        kotlin.jvm.internal.o.d(point);
        return q(false, z17, floatValue, floatBallCurrentWidth, i17, point.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Point o(android.graphics.Point r9, int r10, int r11, int r12, int r13, boolean r14) {
        /*
            r8 = this;
            boolean r0 = r8.v()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r8.getCurrentBallPositionX()
            boolean r2 = r8.A
            r3 = 0
            if (r2 == 0) goto L13
            r2 = r3
            goto L14
        L13:
            r2 = r0
        L14:
            if (r9 == 0) goto L19
            int r9 = r9.y
            goto L1d
        L19:
            int r9 = r8.getCollapseViewPosY()
        L1d:
            r4 = 1
            float r5 = i(r8, r3, r4, r1)
            int r5 = (int) r5
            int r6 = pp1.b.f357398g
            int r7 = com.tencent.mm.plugin.ball.view.ContentFloatBallView.W
            int r7 = r7 * 2
            int r6 = r6 + r7
            boolean r7 = r8.A
            if (r14 != r7) goto L94
            if (r2 <= r10) goto L35
            int r5 = r10 + r12
            if (r5 <= r2) goto L39
            goto L38
        L35:
            int r2 = r2 + r5
            if (r2 <= r10) goto L39
        L38:
            r3 = r4
        L39:
            if (r3 != 0) goto L3c
            goto L94
        L3c:
            rp1.l r2 = new rp1.l
            r2.<init>(r8, r6)
            int r2 = qp1.g0.c(r11, r13, r9, r6, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getTargetPositionAfterConflictFix x: "
            r3.<init>(r4)
            r3.append(r10)
            java.lang.String r10 = ", y: "
            r3.append(r10)
            r3.append(r11)
            java.lang.String r10 = ", width: "
            r3.append(r10)
            r3.append(r12)
            java.lang.String r10 = ", height: "
            r3.append(r10)
            r3.append(r13)
            java.lang.String r10 = ", isDockLeft: "
            r3.append(r10)
            r3.append(r14)
            java.lang.String r10 = ", targetCollapsePosY: "
            r3.append(r10)
            r3.append(r2)
            java.lang.String r10 = r3.toString()
            java.lang.String r11 = "MicroMsg.FloatBallViewV2"
            com.tencent.mars.xlog.Log.i(r11, r10)
            if (r2 == r9) goto L94
            android.graphics.Point r9 = new android.graphics.Point
            float r10 = (float) r2
            int r11 = r8.getFloatBallHeight()
            int r11 = r11 - r6
            float r11 = (float) r11
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            float r10 = r10 - r11
            int r10 = (int) r10
            r9.<init>(r0, r10)
            return r9
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.ContentFloatBallView.o(android.graphics.Point, int, int, int, int, boolean):android.graphics.Point");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int i17;
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onAttachedToWindow isCurrentCollapsedState: " + w());
        if (!x()) {
            V();
            android.graphics.Point l17 = l(null);
            Y(this, 0.0f, l17 != null ? java.lang.Integer.valueOf(l17.y) : null, 1, null);
            getIdleHelper().c();
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
        android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
        int floatBallWidth = getFloatBallWidth();
        int p17 = p(this.A, false, (int) i(this, false, 1, null), floatBallWidth);
        rp1.h hVar = T;
        android.graphics.Point point = this.B;
        kotlin.jvm.internal.o.d(point);
        int b17 = hVar.b(point.y, layoutParams2.y);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onAttachedToWindow targetX: " + p17 + ", targetY: " + b17 + ", isFloatBallViewDockLeft: " + this.A + ", isCurrentCollapsedState: " + w() + ", floatBallWidth: " + floatBallWidth);
        int i18 = layoutParams2.x;
        if (i18 == p17 && (i17 = layoutParams2.y) == b17) {
            A(i18, i17, true, false, true);
        } else {
            P(this, p17, java.lang.Integer.valueOf(b17), true, false, true, false, 32, null);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        E(newConfig);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f93424i;
        if (valueAnimator != null) {
            kotlin.jvm.internal.o.d(valueAnimator);
            valueAnimator.cancel();
            this.f93424i = null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        boolean z17;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View findViewByPosition;
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (v()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onInterceptTouchEvent isAnimating and intercept");
            return true;
        }
        ev6.getAction();
        ev6.getRawX();
        ev6.getRawY();
        if (ev6.getAction() == 0 || !this.E) {
            G(ev6, ev6.getAction() == 0);
        }
        if (!(this.L == 0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onInterceptTouchEvent intercept when collapsed");
            return true;
        }
        if (this.f93436x && ev6.getAction() == 0 && qp1.a0.a(this.f93432t, (int) ev6.getRawX(), (int) ev6.getRawY())) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
            int itemCount = (contentFloatBallRecyclerView == null || (adapter = contentFloatBallRecyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
            int rawX = (int) ev6.getRawX();
            int rawY = (int) ev6.getRawY();
            int i17 = 0;
            while (true) {
                if (i17 < itemCount) {
                    com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = this.f93432t;
                    if (contentFloatBallRecyclerView2 != null && (layoutManager = contentFloatBallRecyclerView2.getLayoutManager()) != null && (findViewByPosition = layoutManager.findViewByPosition(i17)) != null && ym5.v6.a(findViewByPosition, rawX, rawY)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "checkInRecyclerViewItem in pos: " + i17);
                        z17 = true;
                        break;
                    }
                    i17++;
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallViewV2", "checkClickInRecyclerView not in any item");
                    z17 = false;
                    break;
                }
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onInterceptTouchEvent intercept down when expanded");
                return true;
            }
        }
        if (ev6.getAction() != 2) {
            return false;
        }
        if (g(ev6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onInterceptTouchEvent not intercept moved when expanded");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onInterceptTouchEvent not intercept when expanded");
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        event.getAction();
        int action = event.getAction();
        if (action != 0) {
            java.util.Set set = this.f93427o;
            android.graphics.Point point = this.D;
            android.graphics.PointF pointF = this.C;
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "ACTION_CANCEL");
                    }
                } else {
                    if (this.G) {
                        return true;
                    }
                    if (!this.F && g(event)) {
                        this.F = true;
                        C();
                        int i17 = point.x;
                        int i18 = point.y;
                        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                        while (it.hasNext()) {
                            ((gp1.b0) it.next()).d(i17, i18);
                        }
                    }
                    if (this.F) {
                        int rawX = (int) (point.x + (event.getRawX() - pointF.x));
                        int rawY = (int) (point.y + (event.getRawY() - pointF.y));
                        android.graphics.Point point2 = this.B;
                        kotlin.jvm.internal.o.d(point2);
                        int i19 = point2.y - qp1.c0.f365701j;
                        int i27 = qp1.c0.f365702k;
                        int max = java.lang.Math.max(java.lang.Math.min(rawY, i19 - i27), i27);
                        boolean z17 = this.L == 0;
                        event.getRawX();
                        if (this.A) {
                            if (!z17 || event.getRawX() - pointF.x <= 0.0f) {
                                pp1.a0.b(getRecyclerViewHelper(), true, rawX, z17 ? null : java.lang.Integer.valueOf(max), null, true, false, w(), 32, null);
                            } else {
                                P(this, rawX, null, false, true, false, false, 32, null);
                            }
                        } else if (!z17 || event.getRawX() - pointF.x >= 0.0f) {
                            pp1.a0.a(getRecyclerViewHelper(), false, rawX, z17 ? null : java.lang.Integer.valueOf(max), null, true, false, w(), 32, null);
                        } else {
                            P(this, rawX, null, false, true, false, false, 32, null);
                        }
                        f();
                        return false;
                    }
                }
            } else {
                if (this.G) {
                    this.G = false;
                    return true;
                }
                this.E = false;
                if (!this.F && !g(event)) {
                    P(this, point.x, java.lang.Integer.valueOf(point.y), true, false, true, false, 32, null);
                    if (this.I) {
                        z(pointF.x, pointF.y);
                        if (this.f93436x) {
                            if ((this.L == 0) && qp1.a0.a(this.f93432t, (int) event.getRawX(), (int) event.getRawY())) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "onTouchEvent is in recyclerView and try collapse");
                                h();
                            }
                        }
                    }
                    return true;
                }
                if (this.F) {
                    this.F = false;
                    r(event);
                    this.M = -1;
                    this.N = false;
                    this.P = false;
                    java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                    while (it6.hasNext()) {
                        ((gp1.b0) it6.next()).f();
                    }
                }
            }
        } else {
            this.F = false;
            G(event, true);
            if (v()) {
                this.G = true;
            }
        }
        return true;
    }

    public final int p(boolean z17, boolean z18, int i17, int i18) {
        int i19 = this.K;
        android.graphics.Point point = this.B;
        kotlin.jvm.internal.o.d(point);
        return q(z17, z18, i17, i18, i19, point.x);
    }

    public final int q(boolean z17, boolean z18, int i17, int i18, int i19, int i27) {
        int i28 = z17 ? z18 ? i17 - i18 : 0 : z18 ? i27 - i17 : i27 - i18;
        return !z18 ? z17 ? i28 + 0 : i28 - 0 : i28;
    }

    public final void r(android.view.MotionEvent event) {
        boolean z17;
        kotlin.jvm.internal.o.g(event, "event");
        int i17 = this.M;
        boolean z18 = i17 == 0;
        boolean a17 = gp1.i.a(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleTouchUp dockLeft: " + this.A + ", collapseStateWhenDragStart: " + this.M + ", canSwitchEdgeWhenDrag: " + this.N + ", isExpandWhenDrag: " + z18 + ", isCollapseWhenDrag: " + a17 + ", canCollapse: " + getRecyclerViewHelper().f357450h);
        int i18 = this.M;
        if (i18 == 1 || ((z17 = this.A) && z18 && !this.N)) {
            if (e(event) || (z18 && !getRecyclerViewHelper().f357450h)) {
                S(this, 0, false, 2, null);
                L(this, false, false, 0.0f, false, null, 30, null);
                android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleTouchUp-left expand currentPos: (%s, %s)", java.lang.Integer.valueOf(layoutParams2.x), java.lang.Integer.valueOf(layoutParams2.y));
                if (layoutParams2.x <= 0) {
                    I(this, true, this.A, z18, false, null, false, null, 120, null);
                    com.tencent.mm.plugin.ball.service.i.a(2, 1, this.A ? 2 : 1);
                } else {
                    getRecyclerViewHelper().m(true);
                    N(true, layoutParams2.x, layoutParams2.y, m(false), layoutParams2.y, false, new rp1.n(this));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleTouchUp-left collapse");
                I(this, false, this.A, a17, false, null, false, null, 120, null);
                com.tencent.mm.plugin.ball.service.i.a(2, 2, this.A ? 1 : 2);
            }
        } else if (i18 == 2 || !(z17 || !z18 || this.N)) {
            if (e(event) || (z18 && !getRecyclerViewHelper().f357450h)) {
                S(this, 0, false, 2, null);
                L(this, false, false, 0.0f, false, null, 30, null);
                android.view.ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
                android.view.WindowManager.LayoutParams layoutParams4 = (android.view.WindowManager.LayoutParams) layoutParams3;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleTouchUp-right expand currentPos: (%s, %s)", java.lang.Integer.valueOf(layoutParams4.x), java.lang.Integer.valueOf(layoutParams4.y));
                if (layoutParams4.x > n(false)) {
                    I(this, true, this.A, z18, false, null, false, null, 120, null);
                    com.tencent.mm.plugin.ball.service.i.a(2, 1, this.A ? 2 : 1);
                } else {
                    getRecyclerViewHelper().m(true);
                    N(false, layoutParams4.x, layoutParams4.y, n(false), layoutParams4.y, false, new rp1.o(this));
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleTouchUp-right collapse");
                I(this, false, this.A, a17, false, null, false, null, 120, null);
                com.tencent.mm.plugin.ball.service.i.a(2, 2, this.A ? 1 : 2);
            }
        } else if (z18 && this.N) {
            getRecyclerViewHelper().p(!this.A);
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
            if (contentFloatBallRecyclerView != null) {
                contentFloatBallRecyclerView.invalidate();
            }
            boolean z19 = !this.A;
            L(this, false, z19, 0.0f, false, null, 28, null);
            int currentBallPositionX = getCurrentBallPositionX();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "handleSwitchEdge dockLeft: " + this.A + ", startX: " + currentBallPositionX);
            if (z19) {
                getRecyclerViewHelper().i();
            } else {
                getRecyclerViewHelper().j();
            }
            com.tencent.mm.plugin.ball.service.i.a(2, 3, z19 ? 1 : 2);
            I(this, false, z19, true, false, java.lang.Integer.valueOf(currentBallPositionX), true, new rp1.m(this, z19), 8, null);
        }
        this.P = false;
        this.E = false;
    }

    public final boolean s() {
        return !getRecyclerViewHelper().f357451i.isEmpty();
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        int i17;
        super.setAlpha(f17);
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i17 = getResources().getConfiguration().orientation) != this.f93438z) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f93438z));
            F(i17, false);
        }
    }

    public final void setEnableClick(boolean z17) {
        this.I = z17;
    }

    public final void setFloatBallViewDelegate(gp1.k delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f93428p = delegate;
    }

    public final void t(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        M(false, null);
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "hideContentBall already hide");
            return;
        }
        if (!z17 || this.f93426n == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "hideContentBall without animation");
            setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "hideContentBall with animation");
            ep1.x xVar = this.f93426n;
            kotlin.jvm.internal.o.d(xVar);
            xVar.e(animatorListenerAdapter);
        }
    }

    public final void u(android.content.Context context) {
        android.view.Display defaultDisplay;
        android.graphics.Point point;
        android.graphics.Point point2;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f93425m = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f489208ei5, this);
        this.f93430r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.szo);
        java.lang.String string = context.getString(com.tencent.mm.R.string.jp9);
        android.widget.LinearLayout linearLayout = this.f93430r;
        kotlin.jvm.internal.o.d(linearLayout);
        linearLayout.setContentDescription(string);
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = (com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView) findViewById(com.tencent.mm.R.id.t2b);
        this.f93432t = contentFloatBallRecyclerView;
        if (contentFloatBallRecyclerView != null) {
            contentFloatBallRecyclerView.setContentFloatBallView(this);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = this.f93432t;
        androidx.recyclerview.widget.n2 itemAnimator = contentFloatBallRecyclerView2 != null ? contentFloatBallRecyclerView2.getItemAnimator() : null;
        if (itemAnimator != null) {
            itemAnimator.f12170e = 200L;
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallCollapseView collapseView = getCollapseView();
        collapseView.getClass();
        collapseView.f93394m = this;
        getCollapseView().setOnClickListener(new rp1.q(this));
        int i17 = 0;
        M(false, null);
        rp1.v0 idleHelper = getIdleHelper();
        rp1.r rVar = new rp1.r(this);
        idleHelper.getClass();
        idleHelper.f398540d = rVar;
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        boolean z17 = com.tencent.mm.plugin.ball.service.p4.f93201o;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "updateFloatBallViewDockLeft targetDockLeft: " + z17);
        this.A = z17;
        pp1.z recyclerViewHelper = getRecyclerViewHelper();
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView3 = this.f93432t;
        boolean z18 = this.A;
        recyclerViewHelper.getClass();
        recyclerViewHelper.p(z18);
        pm0.v.X(new pp1.p(recyclerViewHelper, contentFloatBallRecyclerView3, this));
        getRecyclerViewHelper().p(this.A);
        boolean z19 = this.A;
        this.L = z19 ? 1 : 2;
        float f17 = pp1.b.f357395d;
        com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView4 = this.f93432t;
        if (contentFloatBallRecyclerView4 != null) {
            contentFloatBallRecyclerView4.setDockLeft(z19);
        }
        this.f93426n = new ep1.x(this);
        java.lang.Object systemService2 = context.getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        this.f93423h = (android.os.Vibrator) systemService2;
        this.f93422g = android.view.ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.B = com.tencent.mm.ui.bk.h(context);
        com.tencent.mm.plugin.ball.service.p4.f().getClass();
        f93416x0 = com.tencent.mm.plugin.ball.service.p4.f93200n / 100.0f;
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(context) && (point2 = this.B) != null) {
            point2.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y() && (point = this.B) != null) {
            point.x = com.tencent.mm.ui.bk.f();
        }
        this.f93438z = getResources().getConfiguration().orientation;
        this.f93418J = com.tencent.mm.ui.bk.p(getContext());
        android.view.WindowManager windowManager = this.f93425m;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            i17 = defaultDisplay.getRotation();
        }
        this.K = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "initFloatBallView statusBar: " + this.f93418J + ", screenResolution: " + this.B + ", scaleTouchSlop: " + this.f93422g + ", orientation: " + this.f93438z + ", currentDisplayRotation: " + this.K);
    }

    public final boolean v() {
        return this.f93429q || getRecyclerViewHelper().f357455p;
    }

    public final boolean w() {
        return gp1.i.a(this.L);
    }

    public final boolean x() {
        return !w();
    }

    public final boolean y() {
        if (x()) {
            if (getVisibility() == 0) {
                return true;
            }
        } else if (getCollapseView().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void z(float f17, float f18) {
        if (v()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis <= this.f93437y + 800) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "notifyBallClickedIfNeed, you clicked too fast!");
            return;
        }
        this.f93437y = currentTimeMillis;
        if (x()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "notifyBallClickedIfNeed, click collapseLayout");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93427o).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "expandRecyclerView collapseState: " + this.L + ", expandReason: 1");
        if (x()) {
            return;
        }
        d75.b.g(new rp1.t(this));
        if (this.A) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView = this.f93432t;
            if (contentFloatBallRecyclerView != null) {
                int e17 = getRecyclerViewHelper().e() - 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(e17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(contentFloatBallRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "expandRecyclerView", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                contentFloatBallRecyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(contentFloatBallRecyclerView, "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "expandRecyclerView", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        } else {
            com.tencent.mm.plugin.ball.view.ContentFloatBallRecyclerView contentFloatBallRecyclerView2 = this.f93432t;
            if (contentFloatBallRecyclerView2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(contentFloatBallRecyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "expandRecyclerView", "(I)V", "Undefined", "scrollToPosition", "(I)V");
                contentFloatBallRecyclerView2.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(contentFloatBallRecyclerView2, "com/tencent/mm/plugin/ball/view/ContentFloatBallView", "expandRecyclerView", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new rp1.k(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f93427o = new java.util.concurrent.CopyOnWriteArraySet();
        this.collapseView = jz5.h.b(new rp1.j(this));
        this.f93434v = -1;
        this.f93435w = -1;
        this.C = new android.graphics.PointF();
        this.D = new android.graphics.Point();
        this.I = true;
        this.M = -1;
        this.recyclerViewHelper = jz5.h.b(new rp1.s(this));
        this.idleHelper = jz5.h.b(rp1.p.f398511d);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewV2", "ContentFloatBallView constructor");
            u(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallViewV2", e17, "init exception", new java.lang.Object[0]);
        }
    }
}
