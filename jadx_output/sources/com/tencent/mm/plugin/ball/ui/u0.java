package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final dp1.x f93358a;

    /* renamed from: b, reason: collision with root package name */
    public final mp1.h f93359b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatIndicatorView f93360c;

    /* renamed from: d, reason: collision with root package name */
    public int f93361d;

    /* renamed from: e, reason: collision with root package name */
    public int f93362e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout.LayoutParams f93363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93364g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93365h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93366i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93367j;

    /* renamed from: k, reason: collision with root package name */
    public long f93368k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f93369l;

    public u0(dp1.x xVar, mp1.h hVar) {
        this.f93358a = xVar;
        this.f93359b = hVar;
        com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView = new com.tencent.mm.plugin.ball.view.FloatIndicatorView(xVar.getActivity(), null);
        this.f93360c = floatIndicatorView;
        floatIndicatorView.setOnOrientationChangedListener(new com.tencent.mm.plugin.ball.ui.r0(this));
        boolean z17 = i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) > i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        this.f93364g = z17;
        d();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        this.f93363f = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f93362e;
        layoutParams.rightMargin = this.f93361d;
        this.f93360c.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(this.f93363f.rightMargin), java.lang.Integer.valueOf(this.f93363f.bottomMargin));
    }

    public final int a() {
        dp1.x xVar = this.f93358a;
        return xVar.b() >= 0 ? xVar.b() : qp1.c0.f365711t;
    }

    public final void b() {
        com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView;
        if (this.f93366i && (floatIndicatorView = this.f93360c) != null) {
            floatIndicatorView.setVisibility(8);
            this.f93366i = false;
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "start FloatIndicatorController");
        b();
        this.f93368k = -1L;
        int i17 = 0;
        this.f93365h = false;
        this.f93366i = false;
        this.f93367j = false;
        dp1.x xVar = this.f93358a;
        if (xVar.t()) {
            xVar.g(new com.tencent.mm.plugin.ball.ui.s0(this));
            com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView = this.f93360c;
            if (floatIndicatorView != null) {
                floatIndicatorView.setVisibility(8);
                android.view.ViewGroup a17 = xVar.a();
                try {
                    if (this.f93360c.getParent() != null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.FloatIndicatorController", "attachFloatIndicatorView, already attached");
                        return;
                    }
                    int childCount = a17.getChildCount();
                    while (true) {
                        if (i17 >= a17.getChildCount()) {
                            break;
                        }
                        if (a17.getChildAt(i17) instanceof com.tencent.mm.ui.widget.SwipeBackLayout) {
                            childCount = i17 + 1;
                            break;
                        }
                        i17++;
                    }
                    a17.addView(this.f93360c, childCount);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatIndicatorController", e17, "attachFloatIndicatorView exception:%s", e17);
                }
            }
        }
    }

    public final void d() {
        int i17;
        android.app.Activity activity = this.f93358a.getActivity();
        int i18 = qp1.c0.f365692a;
        try {
            i17 = com.tencent.mm.ui.bl.c(activity);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e17);
            i17 = 0;
        }
        qp1.c0.f365711t = i17;
        if (this.f93364g) {
            int i19 = qp1.c0.f365709r;
            this.f93362e = -i19;
            this.f93361d = a() - i19;
        } else {
            int i27 = qp1.c0.f365709r;
            this.f93361d = -i27;
            this.f93362e = a() - i27;
        }
    }
}
