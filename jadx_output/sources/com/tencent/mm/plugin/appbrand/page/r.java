package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class r extends com.tencent.mm.plugin.appbrand.y {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.c0 f87047y = new com.tencent.mm.plugin.appbrand.jsapi.c0();

    public void A(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
        this.f87047y.A(yVar);
    }

    public void C(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
        this.f87047y.C(yVar);
    }

    public void D() {
        this.f87047y.D();
    }

    public void E(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
        this.f87047y.E(uVar);
    }

    public void F(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
        this.f87047y.F(uVar);
    }

    public void G(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
        this.f87047y.G(a0Var);
    }

    public boolean H() {
        return this.f87047y.H();
    }

    public void I(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
        this.f87047y.I(xVar);
    }

    public void J(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
        this.f87047y.J(zVar);
    }

    public void K(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
        this.f87047y.K(wVar);
    }

    public void N(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
        this.f87047y.N(b0Var);
    }

    public void O(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
        this.f87047y.O(vVar);
    }

    public void O0() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void P(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
        this.f87047y.P(a0Var);
    }

    public void P0(java.lang.Runnable runnable) {
        android.view.View contentView;
        if (runnable == null || (contentView = getContentView()) == null) {
            return;
        }
        contentView.post(runnable);
    }

    public void Q(boolean z17) {
        this.f87047y.Q(z17);
    }

    public final /* synthetic */ void Q0(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.post(new com.tencent.mm.plugin.appbrand.page.p(block));
        }
    }

    public void R(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
        this.f87047y.R(vVar);
    }

    public void R0(java.lang.Runnable runnable, long j17) {
        android.view.View contentView;
        if (runnable == null || (contentView = getContentView()) == null) {
            return;
        }
        contentView.postDelayed(runnable, j17);
    }

    public void S0(java.lang.Runnable runnable) {
        android.view.View contentView;
        if (runnable == null || (contentView = getContentView()) == null) {
            return;
        }
        contentView.removeCallbacks(runnable);
    }

    public void T(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
        this.f87047y.T(zVar);
    }

    public final void T0(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            runnable.run();
        } else {
            P0(runnable);
        }
    }

    public void U(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
        this.f87047y.U(xVar);
    }

    public final /* synthetic */ void U0(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            block.invoke();
            return;
        }
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.post(new com.tencent.mm.plugin.appbrand.page.q(block));
        }
    }

    public void V() {
        this.f87047y.V();
    }

    public void V0() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/page/AppBrandComponentViewWxa", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void W(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
        this.f87047y.W(b0Var);
    }

    public void X() {
        this.f87047y.X();
    }

    public void Y() {
        this.f87047y.Y();
    }

    public void Z() {
        this.f87047y.Z();
    }

    public abstract android.view.View getContentView();

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: getRuntime */
    public abstract /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime t3();

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    public void w(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
        this.f87047y.w(wVar);
    }

    public void z() {
        this.f87047y.z();
    }
}
