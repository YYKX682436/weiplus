package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78112v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78113w;

    public l(com.tencent.mm.plugin.appbrand.floatball.n nVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(nVar);
        this.f78112v = o6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78112v.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public boolean L() {
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = this.f78112v.u0().f47269b2;
        return appBrandStatObject != null && appBrandStatObject.f87790f == 1131;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(1);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void e0(com.tencent.mm.plugin.ball.service.f5 f5Var) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78112v;
        com.tencent.mm.plugin.appbrand.floatball.w0 w0Var = (com.tencent.mm.plugin.appbrand.floatball.w0) o6Var.k(com.tencent.mm.plugin.appbrand.floatball.w0.class);
        if (w0Var != null && w0Var.w0()) {
            w0Var.x0(o6Var.r0(), new com.tencent.mm.plugin.appbrand.floatball.j(this, f5Var));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "beforeOnMenuFloatBallSelected, not show vpip tip");
        if (f5Var != null) {
            ((com.tencent.mm.plugin.ball.service.u4) f5Var).a();
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean k0() {
        return L() && !this.f78113w;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void l0() {
        dp1.x xVar = this.f93239n;
        if (xVar.f()) {
            xVar.q(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78112v.hashCode()));
        return super.m0(i17);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return !this.f78112v.u0().f77292e2;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78112v.hashCode()));
        super.o0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void q0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "resetAnimateView");
        android.view.View u17 = this.f93239n.u();
        if (u17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallHelper", "resetAnimateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallHelper", "resetAnimateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(u17, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallHelper", "resetAnimateView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            u17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/appbrand/floatball/AppBrandFloatBallHelper", "resetAnimateView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            u17.setScaleX(1.0f);
            u17.setScaleY(1.0f);
            u17.setTranslationX(0.0f);
            u17.setTranslationY(0.0f);
            u17.setClipToOutline(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return this.f93239n.t();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78112v;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onEnterPage, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(o6Var)) {
            p0();
        } else {
            super.x();
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallHelper", "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f78112v.hashCode()));
        super.z();
        this.f78113w = false;
    }
}
