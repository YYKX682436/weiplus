package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

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
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f169005b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 f169006c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f169007d;

    /* renamed from: e, reason: collision with root package name */
    public final pd1.j f169008e;

    /* renamed from: f, reason: collision with root package name */
    public final pd1.o f169009f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.z3 f169010g;

    /* renamed from: j, reason: collision with root package name */
    public int f169013j;

    /* renamed from: k, reason: collision with root package name */
    public int f169014k;

    /* renamed from: m, reason: collision with root package name */
    public int f169016m;

    /* renamed from: n, reason: collision with root package name */
    public int f169017n;

    /* renamed from: o, reason: collision with root package name */
    public int f169018o;

    /* renamed from: p, reason: collision with root package name */
    public int f169019p;

    /* renamed from: q, reason: collision with root package name */
    public int f169020q;

    /* renamed from: r, reason: collision with root package name */
    public int f169021r;

    /* renamed from: s, reason: collision with root package name */
    public int f169022s;

    /* renamed from: t, reason: collision with root package name */
    public int f169023t;

    /* renamed from: u, reason: collision with root package name */
    public int f169024u;

    /* renamed from: v, reason: collision with root package name */
    public int f169025v;

    /* renamed from: w, reason: collision with root package name */
    public int f169026w;

    /* renamed from: x, reason: collision with root package name */
    public int f169027x;

    /* renamed from: y, reason: collision with root package name */
    public int f169028y;

    /* renamed from: z, reason: collision with root package name */
    public int f169029z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169004a = "MicroMsg.AppBrand.AppBrandPipContainerOnPageSwitchHandler#" + hashCode();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f169011h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f169012i = false;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.h f169015l = null;
    public final int E = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172510l1;
    public final int F = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172515y0;
    public final int G = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172512p1;
    public final int H = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172514x1;
    public final int I = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172516y1;

    /* renamed from: J, reason: collision with root package name */
    public final int f169003J = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895.f172517z1;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895, android.view.View view, pd1.j jVar, pd1.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.z3 z3Var) {
        this.f169005b = v5Var;
        this.f169006c = c12753x672cc895;
        this.f169007d = view;
        this.f169008e = jVar;
        this.f169009f = oVar;
        this.f169010g = z3Var;
    }

    public final void a(float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49) {
        float f18 = f17 / 100.0f;
        int i57 = (int) (i37 * f18);
        int i58 = (int) (i38 * f18);
        int i59 = (int) (i39 * f18);
        int i66 = (int) (i47 * f18);
        int i67 = (int) (i48 * f18);
        int i68 = (int) (f18 * i49);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895 = this.f169006c;
        android.view.ViewGroup.LayoutParams layoutParams = c12753x672cc895.getLayoutParams();
        layoutParams.width = (i57 * 2) + i28;
        layoutParams.height = i29 + i58 + i59;
        c12753x672cc895.setLayoutParams(layoutParams);
        c12753x672cc895.setX(i19 + ((i17 - r7) / 2));
        c12753x672cc895.setY(i27 + ((i18 - r8) / 2));
        android.view.View view = this.f169007d;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = i28;
        layoutParams2.height = i29;
        view.setLayoutParams(layoutParams2);
        this.f169006c.m(i28, i57, i58, i59, i66, i67, i68);
    }

    public final android.graphics.Point b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb a27 = this.f169005b.a2();
        java.lang.String str = this.f169004a;
        if (a27 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "calculateWebView2PipContainerParentOffset, null == appBrandWebView");
            return null;
        }
        android.view.View mo14662xc2a54588 = a27.mo14662xc2a54588();
        if (mo14662xc2a54588 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "calculateWebView2PipContainerParentOffset, null == webView");
            return null;
        }
        android.view.ViewParent parent = this.f169006c.getParent();
        if (!(parent instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "calculateWebView2PipContainerParentOffset, viewParent is not ViewGroup");
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        this.f169013j = viewGroup.getWidth();
        this.f169014k = viewGroup.getHeight();
        android.view.ViewParent parent2 = mo14662xc2a54588.getParent();
        int i17 = 0;
        int i18 = 0;
        while (parent2 != null) {
            if (!(parent2 instanceof android.view.ViewGroup)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "calculateWebView2PipContainerParentOffset, parent is not ViewGroup");
                return null;
            }
            i17 = (int) (i17 + mo14662xc2a54588.getX());
            i18 = (int) (i18 + mo14662xc2a54588.getY());
            if (parent2 == viewGroup) {
                return new android.graphics.Point(i17, i18);
            }
            mo14662xc2a54588 = parent2;
            parent2 = mo14662xc2a54588.getParent();
        }
        return null;
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169004a, "handleVideoPage2PipEnd");
        if (!this.f169011h) {
            d(false);
        }
        a(100.0f, this.f169028y, this.f169029z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.f169003J);
    }

    public final boolean d(boolean z17) {
        pd1.o oVar = this.f169009f;
        int mo129531x8d5c7601 = oVar.mo129531x8d5c7601();
        int i17 = mo129531x8d5c7601 == 0 ? -1 : mo129531x8d5c7601;
        int mo129530x463504c = oVar.mo129530x463504c();
        int i18 = mo129530x463504c == 0 ? -1 : mo129530x463504c;
        android.graphics.Point b17 = b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169004a, "handleVideoPage2PipStart, null == webView2PipContainerParentOffset");
            return false;
        }
        android.graphics.Point point = new android.graphics.Point();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.f(this, point, b17, i17, i18);
        pd1.j jVar = this.f169008e;
        if (z17) {
            jVar.d(this.f169005b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.g(this, point, fVar));
            return true;
        }
        android.graphics.Point m17 = jVar.m();
        point.x = m17.x;
        point.y = m17.y;
        fVar.run();
        return true;
    }

    public void e(float f17) {
        if (!this.f169011h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169004a, "handleVideoTransferProgress, false == mHandleStarted");
            return;
        }
        float f18 = f17 / 100.0f;
        this.K = this.f169016m + ((int) ((this.f169028y - r0) * f18));
        this.L = this.f169017n + ((int) ((this.f169029z - r2) * f18));
        this.M = this.f169018o + ((int) ((this.A - r2) * f18));
        this.N = this.f169019p + ((int) ((this.B - r2) * f18));
        this.O = this.f169020q + ((int) ((this.C - r2) * f18));
        this.P = this.f169021r + ((int) ((this.D - r3) * f18));
        this.Q = (int) java.lang.Math.ceil((r0 - r2) * 0.5f);
        this.R = (int) java.lang.Math.ceil((this.L - this.P) * 0.4f);
        a(f17, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (int) java.lang.Math.ceil((this.L - this.P) * 0.6f), this.f169025v + ((int) ((this.H - r0) * f18)), this.f169026w + ((int) ((this.I - r0) * f18)), this.f169027x + ((int) (f18 * (this.f169003J - r0))));
    }
}
