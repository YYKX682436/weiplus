package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallCollapseView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "getCurrentMaskHeight", "getCurrentMasWidth", "getPositionY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ContentFloatBallCollapseView extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final int f93385q = qp1.c0.f365694c;

    /* renamed from: r, reason: collision with root package name */
    public static final int f93386r = qp1.c0.f365695d;

    /* renamed from: s, reason: collision with root package name */
    public static final int f93387s;

    /* renamed from: d, reason: collision with root package name */
    public android.view.WindowManager f93388d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f93389e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundCornerRelativeLayout f93390f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout f93391g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93392h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f93393i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallView f93394m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f93395n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93396o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Integer f93397p;

    static {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int a17 = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
        ((ov.p0) j0Var).getClass();
        f93387s = qp1.e0.a(a17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallCollapseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f93388d = (android.view.WindowManager) systemService;
        android.view.View.inflate(context, com.tencent.mm.R.layout.ehz, this);
        qp1.j.c(this.f93388d, this, 0, 0, null, null);
        setVisibility(8);
        this.f93389e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f483332ad2);
        this.f93390f = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewById(com.tencent.mm.R.id.sgz);
        this.f93392h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483331ad1);
        this.f93391g = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById(com.tencent.mm.R.id.f483333sh0);
        rp1.h hVar = com.tencent.mm.plugin.ball.view.ContentFloatBallView.T;
        int i17 = pp1.b.f357398g;
        int i18 = (com.tencent.mm.plugin.ball.view.ContentFloatBallView.W * 2) + i17;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f93390f;
        int i19 = f93385q;
        qp1.g0.e(roundCornerRelativeLayout, i19, i17);
        qp1.g0.e(this.f93391g, i19, i17);
        qp1.g0.e(this.f93389e, i19, i18);
        android.view.ViewGroup.LayoutParams layoutParams = null;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContentFloatBallCollapseView", "updateCollapseViewSize width: " + i19 + ", height: " + i18);
            android.view.ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams2 : null;
            if (layoutParams3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContentFloatBallCollapseView", "initCollapseViewSize windowLayoutParams is null");
            } else {
                layoutParams3.width = i19;
                layoutParams3.height = i18;
                android.view.WindowManager windowManager = this.f93388d;
                if (windowManager != null) {
                    windowManager.updateViewLayout(this, layoutParams3);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContentFloatBallCollapseView", th6, "updateCollapseViewSize exception", new java.lang.Object[0]);
        }
        qp1.g0.e(this.f93392h, qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9)), qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93392h;
        if (weImageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams4 = weImageView.getLayoutParams();
            if (layoutParams4 != null) {
                if (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj));
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams.setMarginStart(a17);
                    marginLayoutParams.setMarginEnd(a17);
                }
                layoutParams = layoutParams4;
            }
            weImageView.setLayoutParams(layoutParams);
        }
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = this.f93390f;
        if (roundCornerRelativeLayout2 != null) {
            roundCornerRelativeLayout2.setRadius(qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        }
        com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = this.f93391g;
        if (floatBallRoundCornerFrameLayout != null) {
            floatBallRoundCornerFrameLayout.setRadius(qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)));
        }
        com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout2 = this.f93391g;
        if (floatBallRoundCornerFrameLayout2 != null) {
            floatBallRoundCornerFrameLayout2.a(f93387s, getResources().getColor(com.tencent.mm.R.color.aku));
        }
    }

    public final void b(float f17, int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93394m;
        if (contentFloatBallView == null) {
            return;
        }
        int clickExpandWidth = (int) contentFloatBallView.getClickExpandWidth();
        int max = (int) (java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f17)) * f93386r);
        int i19 = (com.tencent.mm.plugin.ball.view.ContentFloatBallView.W * 2) + max;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f93390f;
        int i27 = f93385q;
        qp1.g0.e(roundCornerRelativeLayout, i27, max);
        qp1.g0.e(this.f93391g, i27, max);
        int i28 = i27 + clickExpandWidth;
        qp1.g0.e(this.f93389e, i28, i19);
        int i29 = i18 + ((int) ((r1 - i19) / 2.0f));
        int i37 = z17 ? i17 : i17 - clickExpandWidth;
        try {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            android.view.WindowManager.LayoutParams layoutParams2 = (android.view.WindowManager.LayoutParams) layoutParams;
            if (i17 == layoutParams2.x && i29 == layoutParams2.y && max == layoutParams2.height) {
                return;
            }
            layoutParams2.x = i37;
            layoutParams2.y = i29;
            layoutParams2.width = i28;
            layoutParams2.height = i19;
            if (this.f93395n == null) {
                this.f93395n = new android.graphics.Point();
            }
            android.graphics.Point point = this.f93395n;
            if (point != null) {
                point.x = i37;
            }
            if (point != null) {
                point.y = i29;
            }
            boolean z18 = this.f93396o;
            java.lang.Integer num = this.f93397p;
            if (z18) {
                if (num != null) {
                    super.setVisibility(num.intValue());
                }
                this.f93396o = false;
                this.f93397p = null;
            }
            android.view.WindowManager windowManager = this.f93388d;
            if (windowManager != null) {
                windowManager.updateViewLayout(this, layoutParams2);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContentFloatBallCollapseView", th6, "updateCollapseViewPosition fail", new java.lang.Object[0]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93394m;
        return contentFloatBallView != null ? contentFloatBallView.dispatchTouchEvent(motionEvent) : super.dispatchTouchEvent(motionEvent);
    }

    public final int getCurrentMasWidth() {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f93390f;
        if (roundCornerRelativeLayout != null) {
            return roundCornerRelativeLayout.getWidth();
        }
        return 0;
    }

    public final int getCurrentMaskHeight() {
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = this.f93390f;
        if (roundCornerRelativeLayout != null) {
            return roundCornerRelativeLayout.getHeight();
        }
        return 0;
    }

    public final int getPositionY() {
        android.graphics.Point point = this.f93395n;
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

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93394m;
        if (contentFloatBallView != null) {
            contentFloatBallView.E(configuration);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93394m;
        return contentFloatBallView != null ? contentFloatBallView.onInterceptTouchEvent(ev6) : super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93394m;
        return contentFloatBallView != null ? contentFloatBallView.onTouchEvent(event) : super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        java.util.Objects.toString(this.f93395n);
        if (this.f93395n == null && i17 == 0) {
            this.f93396o = true;
            this.f93397p = java.lang.Integer.valueOf(i17);
        } else {
            this.f93396o = false;
            this.f93397p = null;
            super.setVisibility(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallCollapseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        try {
            a(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContentFloatBallCollapseView", e17, "init exception", new java.lang.Object[0]);
        }
    }
}
