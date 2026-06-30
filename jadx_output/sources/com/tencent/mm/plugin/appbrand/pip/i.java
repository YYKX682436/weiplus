package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class i {
    public int A;
    public int B;
    public int C;
    public int D;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f87472b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView f87473c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f87474d;

    /* renamed from: e, reason: collision with root package name */
    public final pd1.j f87475e;

    /* renamed from: f, reason: collision with root package name */
    public final pd1.o f87476f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.utils.z3 f87477g;

    /* renamed from: j, reason: collision with root package name */
    public int f87480j;

    /* renamed from: k, reason: collision with root package name */
    public int f87481k;

    /* renamed from: m, reason: collision with root package name */
    public int f87483m;

    /* renamed from: n, reason: collision with root package name */
    public int f87484n;

    /* renamed from: o, reason: collision with root package name */
    public int f87485o;

    /* renamed from: p, reason: collision with root package name */
    public int f87486p;

    /* renamed from: q, reason: collision with root package name */
    public int f87487q;

    /* renamed from: r, reason: collision with root package name */
    public int f87488r;

    /* renamed from: s, reason: collision with root package name */
    public int f87489s;

    /* renamed from: t, reason: collision with root package name */
    public int f87490t;

    /* renamed from: u, reason: collision with root package name */
    public int f87491u;

    /* renamed from: v, reason: collision with root package name */
    public int f87492v;

    /* renamed from: w, reason: collision with root package name */
    public int f87493w;

    /* renamed from: x, reason: collision with root package name */
    public int f87494x;

    /* renamed from: y, reason: collision with root package name */
    public int f87495y;

    /* renamed from: z, reason: collision with root package name */
    public int f87496z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f87471a = "MicroMsg.AppBrand.AppBrandPipContainerOnPageSwitchHandler#" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f87478h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f87479i = false;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.pip.h f87482l = null;
    public final int E = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90977l1;
    public final int F = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90982y0;
    public final int G = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90979p1;
    public final int H = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90981x1;
    public final int I = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90983y1;

    /* renamed from: J, reason: collision with root package name */
    public final int f87470J = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.f90984z1;

    public i(com.tencent.mm.plugin.appbrand.page.v5 v5Var, com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView, android.view.View view, pd1.j jVar, pd1.o oVar, com.tencent.mm.plugin.appbrand.utils.z3 z3Var) {
        this.f87472b = v5Var;
        this.f87473c = appBrandPipContainerView;
        this.f87474d = view;
        this.f87475e = jVar;
        this.f87476f = oVar;
        this.f87477g = z3Var;
    }

    public final void a(float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49) {
        float f18 = f17 / 100.0f;
        int i57 = (int) (i37 * f18);
        int i58 = (int) (i38 * f18);
        int i59 = (int) (i39 * f18);
        int i66 = (int) (i47 * f18);
        int i67 = (int) (i48 * f18);
        int i68 = (int) (f18 * i49);
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = this.f87473c;
        android.view.ViewGroup.LayoutParams layoutParams = appBrandPipContainerView.getLayoutParams();
        layoutParams.width = (i57 * 2) + i28;
        layoutParams.height = i29 + i58 + i59;
        appBrandPipContainerView.setLayoutParams(layoutParams);
        appBrandPipContainerView.setX(i19 + ((i17 - r7) / 2));
        appBrandPipContainerView.setY(i27 + ((i18 - r8) / 2));
        android.view.View view = this.f87474d;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = i28;
        layoutParams2.height = i29;
        view.setLayoutParams(layoutParams2);
        this.f87473c.m(i28, i57, i58, i59, i66, i67, i68);
    }

    public final android.graphics.Point b() {
        com.tencent.mm.plugin.appbrand.page.fb a27 = this.f87472b.a2();
        java.lang.String str = this.f87471a;
        if (a27 == null) {
            com.tencent.mars.xlog.Log.w(str, "calculateWebView2PipContainerParentOffset, null == appBrandWebView");
            return null;
        }
        android.view.View contentView = a27.getContentView();
        if (contentView == null) {
            com.tencent.mars.xlog.Log.w(str, "calculateWebView2PipContainerParentOffset, null == webView");
            return null;
        }
        android.view.ViewParent parent = this.f87473c.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.w(str, "calculateWebView2PipContainerParentOffset, viewParent is not ViewGroup");
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.f87480j = viewGroup.getWidth();
        this.f87481k = viewGroup.getHeight();
        android.view.ViewParent parent2 = contentView.getParent();
        int i17 = 0;
        int i18 = 0;
        while (parent2 != null) {
            if (!(parent2 instanceof android.view.ViewGroup)) {
                com.tencent.mars.xlog.Log.w(str, "calculateWebView2PipContainerParentOffset, parent is not ViewGroup");
                return null;
            }
            i17 = (int) (i17 + contentView.getX());
            i18 = (int) (i18 + contentView.getY());
            if (parent2 == viewGroup) {
                return new android.graphics.Point(i17, i18);
            }
            contentView = parent2;
            parent2 = contentView.getParent();
        }
        return null;
    }

    public void c() {
        com.tencent.mars.xlog.Log.i(this.f87471a, "handleVideoPage2PipEnd");
        if (!this.f87478h) {
            d(false);
        }
        a(100.0f, this.f87495y, this.f87496z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f87470J);
    }

    public final boolean d(boolean z17) {
        pd1.o oVar = this.f87476f;
        int videoWidth = oVar.getVideoWidth();
        int i17 = videoWidth == 0 ? -1 : videoWidth;
        int videoHeight = oVar.getVideoHeight();
        int i18 = videoHeight == 0 ? -1 : videoHeight;
        android.graphics.Point b17 = b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w(this.f87471a, "handleVideoPage2PipStart, null == webView2PipContainerParentOffset");
            return false;
        }
        android.graphics.Point point = new android.graphics.Point();
        com.tencent.mm.plugin.appbrand.pip.f fVar = new com.tencent.mm.plugin.appbrand.pip.f(this, point, b17, i17, i18);
        pd1.j jVar = this.f87475e;
        if (z17) {
            jVar.d(this.f87472b, new com.tencent.mm.plugin.appbrand.pip.g(this, point, fVar));
            return true;
        }
        android.graphics.Point m17 = jVar.m();
        point.x = m17.x;
        point.y = m17.y;
        fVar.run();
        return true;
    }

    public void e(float f17) {
        if (!this.f87478h) {
            com.tencent.mars.xlog.Log.w(this.f87471a, "handleVideoTransferProgress, false == mHandleStarted");
            return;
        }
        float f18 = f17 / 100.0f;
        this.K = this.f87483m + ((int) ((this.f87495y - r0) * f18));
        this.L = this.f87484n + ((int) ((this.f87496z - r2) * f18));
        this.M = this.f87485o + ((int) ((this.A - r2) * f18));
        this.N = this.f87486p + ((int) ((this.B - r2) * f18));
        this.O = this.f87487q + ((int) ((this.C - r2) * f18));
        this.P = this.f87488r + ((int) ((this.D - r3) * f18));
        this.Q = (int) java.lang.Math.ceil((r0 - r2) * 0.5f);
        this.R = (int) java.lang.Math.ceil((this.L - this.P) * 0.4f);
        a(f17, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (int) java.lang.Math.ceil((this.L - this.P) * 0.6f), this.f87492v + ((int) ((this.H - r0) * f18)), this.f87493w + ((int) ((this.I - r0) * f18)), this.f87494x + ((int) (f18 * (this.f87470J - r0))));
    }
}
