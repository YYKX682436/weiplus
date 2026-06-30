package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f87453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f87454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f87456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.i f87457h;

    public f(com.tencent.mm.plugin.appbrand.pip.i iVar, android.graphics.Point point, android.graphics.Point point2, int i17, int i18) {
        this.f87457h = iVar;
        this.f87453d = point;
        this.f87454e = point2;
        this.f87455f = i17;
        this.f87456g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f87457h.f87478h) {
            com.tencent.mars.xlog.Log.i(this.f87457h.f87471a, "handleVideoPage2PipStart, true == mHandleStarted");
            return;
        }
        int i17 = this.f87457h.f87475e.i();
        int k17 = this.f87457h.f87475e.k();
        android.graphics.Point point = this.f87453d;
        int i18 = point.x;
        android.graphics.Point point2 = this.f87454e;
        com.tencent.mars.xlog.Log.i(this.f87457h.f87471a, "handleVideoPage2PipStart, originVideoPosX: %d, originVideoPosY: %d", java.lang.Integer.valueOf(i18 + point2.x), java.lang.Integer.valueOf(point.y + point2.y));
        com.tencent.mm.plugin.appbrand.pip.i iVar = this.f87457h;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView = iVar.f87473c;
        android.graphics.Point point3 = this.f87453d;
        int i19 = point3.x;
        int i27 = point3.y;
        android.graphics.Point point4 = this.f87454e;
        if (iVar.f87482l == null) {
            iVar.f87482l = new com.tencent.mm.plugin.appbrand.pip.h(iVar, null);
        }
        com.tencent.mm.plugin.appbrand.pip.h hVar = iVar.f87482l;
        hVar.f87464a = i19;
        hVar.f87465b = i27;
        hVar.f87466c = point4;
        appBrandPipContainerView.a(hVar);
        com.tencent.mm.plugin.appbrand.pip.i iVar2 = this.f87457h;
        int i28 = this.f87455f;
        int i29 = this.f87456g;
        iVar2.getClass();
        boolean z17 = false;
        if (!((-1 == i28 || -1 == i29) ? false : true) ? i17 >= k17 : i28 >= i29) {
            z17 = true;
        }
        if (z17) {
            iVar2.f87495y = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.K;
            iVar2.f87496z = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.L;
        } else {
            iVar2.f87495y = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.P;
            iVar2.f87496z = com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView.Q;
        }
        android.view.KeyEvent.Callback callback = iVar2.f87474d;
        if (callback instanceof pd1.h) {
            pd1.h hVar2 = (pd1.h) callback;
            pd1.g gVar = z17 ? pd1.g.f353536d : pd1.g.f353537e;
            tf.q0 q0Var = (tf.q0) hVar2;
            com.tencent.mars.xlog.Log.i(q0Var.f418841g.f418844a, "onModeConfirmed, mode: " + gVar);
            if (pd1.g.f353537e == gVar) {
                ((android.widget.LinearLayout.LayoutParams) q0Var.f418838d.getLayoutParams()).weight = 75.0f;
                ((android.widget.LinearLayout.LayoutParams) q0Var.f418840f.getLayoutParams()).weight = 75.0f;
                ((android.widget.LinearLayout.LayoutParams) q0Var.f418839e.getLayoutParams()).weight = 48.0f;
            }
        }
        com.tencent.mm.plugin.appbrand.pip.i iVar3 = this.f87457h;
        com.tencent.mm.plugin.appbrand.widget.AppBrandPipContainerView appBrandPipContainerView2 = iVar3.f87473c;
        int i37 = iVar3.f87495y;
        int i38 = iVar3.f87496z;
        appBrandPipContainerView2.f90997r = appBrandPipContainerView2.k(appBrandPipContainerView2.f90997r, i37);
        appBrandPipContainerView2.o(appBrandPipContainerView2.f90998s, i38);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPipContainerView", "adjustStablePos, mStablePosX: " + appBrandPipContainerView2.f90997r + ", mStablePosY: " + appBrandPipContainerView2.f90998s);
        appBrandPipContainerView2.d(appBrandPipContainerView2.f90997r, appBrandPipContainerView2.f90998s);
        com.tencent.mm.plugin.appbrand.pip.i iVar4 = this.f87457h;
        iVar4.a(0.0f, iVar4.f87483m, iVar4.f87484n, iVar4.f87485o, iVar4.f87486p, iVar4.f87487q, iVar4.f87488r, iVar4.f87489s, iVar4.f87490t, iVar4.f87491u, iVar4.f87492v, iVar4.f87493w, iVar4.f87494x);
        this.f87457h.f87478h = true;
        com.tencent.mm.plugin.appbrand.pip.i iVar5 = this.f87457h;
        if (iVar5.f87477g != null) {
            com.tencent.mars.xlog.Log.i(iVar5.f87471a, "handleVideoPage2PipStart, run afterStartTask");
            this.f87457h.f87477g.a();
        }
    }
}
