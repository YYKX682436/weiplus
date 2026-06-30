package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv.c0 f78174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78175e;

    public y(com.tencent.mm.plugin.appbrand.floatball.u uVar, pv.c0 c0Var) {
        this.f78175e = uVar;
        this.f78174d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.floatball.u uVar = this.f78175e;
        uVar.getClass();
        pv.c0 c0Var = (pv.c0) i95.n0.c(pv.c0.class);
        com.tencent.mm.plugin.appbrand.o6 o6Var = uVar.f78147a;
        com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView appBrandGlobalNativeWidgetContainerView = o6Var.C1;
        if (appBrandGlobalNativeWidgetContainerView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, GlobalNativeWidgetContainerView is null");
        } else if (appBrandGlobalNativeWidgetContainerView.getWidth() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, width is 0");
        } else {
            com.tencent.mm.plugin.appbrand.page.z zVar = o6Var.D1;
            if (zVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, GlobalNativeWidgetContainerView is null");
            } else {
                mi1.v vVar = o6Var.f74821z;
                if (vVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, AppBrandCapsuleBarManager is null");
                } else {
                    com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton d17 = vVar.d();
                    if (d17.getWidth() == 0 || d17.getHeight() == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, optionButton width=" + d17.getWidth() + ",height=" + d17.getHeight());
                    } else {
                        int[] iArr = new int[2];
                        d17.getLocationInWindow(iArr);
                        android.content.Context context = o6Var.f74795d;
                        if (context == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, context is null");
                        } else {
                            android.app.Activity r07 = o6Var.r0();
                            if (r07 == null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, activity is null");
                            } else if (r07.isFinishing() || r07.isDestroyed()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "addFloatBallEduView, activity isDestroyed");
                            } else {
                                com.tencent.mm.plugin.ball.view.ContentFloatBallEduView contentFloatBallEduView = new com.tencent.mm.plugin.ball.view.ContentFloatBallEduView(context);
                                contentFloatBallEduView.setEduText(((ov.f0) c0Var).Bi(pv.a0.f358476g));
                                contentFloatBallEduView.setArrowIconPosition(((appBrandGlobalNativeWidgetContainerView.getWidth() - iArr[0]) - (d17.getWidth() / 2)) - com.tencent.mm.ui.zk.a(context, 15));
                                contentFloatBallEduView.setTopOffsetY(d17.getHeight() + iArr[1]);
                                contentFloatBallEduView.animate().alphaBy(0.0f).alpha(1.0f).setDuration(100L).start();
                                contentFloatBallEduView.setDismissListener(new com.tencent.mm.plugin.appbrand.floatball.a0(uVar, zVar));
                                android.view.ViewGroup frameLayout = new android.widget.FrameLayout(context);
                                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                                layoutParams.topMargin = 0;
                                layoutParams.leftMargin = 0;
                                layoutParams.gravity = 8388613;
                                frameLayout.setPadding(0, com.tencent.mm.ui.zk.a(context, 6), 0, 0);
                                frameLayout.addView(contentFloatBallEduView, layoutParams);
                                zVar.A(frameLayout);
                                uVar.f78160n = true;
                            }
                        }
                    }
                }
            }
        }
        ((ov.f0) this.f78174d).Ri(pv.a0.f358476g, true);
    }
}
