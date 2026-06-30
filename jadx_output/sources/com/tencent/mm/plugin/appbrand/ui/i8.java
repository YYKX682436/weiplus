package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class i8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89779d;

    public i8(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        this.f89779d = appBrandUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI = this.f89779d;
        appBrandUI.f89419w = new android.content.res.Configuration(com.tencent.mm.plugin.appbrand.ui.AppBrandUI.p7(appBrandUI));
        appBrandUI.f89420x = false;
        com.tencent.mm.plugin.appbrand.task.b1 b1Var = appBrandUI.W;
        appBrandUI.mRuntimeContainer = new com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC(b1Var);
        appBrandRuntimeContainerWC = appBrandUI.mRuntimeContainer;
        android.view.View view = appBrandUI.f90318h;
        com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = (com.tencent.mm.plugin.appbrand.widget.input.h1) com.tencent.mm.plugin.appbrand.widget.input.h1.f91462u.pollFirst();
        if (h1Var != null) {
            h1Var.f91464e = view;
            android.app.Activity a17 = q75.a.a(appBrandUI);
            if (a17 == null) {
                a17 = appBrandUI;
            }
            if (h1Var.getContext() instanceof android.content.MutableContextWrapper) {
                android.content.MutableContextWrapper mutableContextWrapper = (android.content.MutableContextWrapper) h1Var.getContext();
                if (mutableContextWrapper.getBaseContext() != a17) {
                    mutableContextWrapper.setBaseContext(a17);
                    if (a17 instanceof androidx.fragment.app.FragmentActivity) {
                        h1Var.f91470n = new com.tencent.mm.plugin.appbrand.widget.input.q5(a17);
                    } else {
                        h1Var.f91470n = null;
                    }
                }
            }
        } else {
            h1Var = new com.tencent.mm.plugin.appbrand.widget.input.h1(appBrandUI, view);
        }
        android.widget.FrameLayout frameLayout = appBrandRuntimeContainerWC.f74838q;
        frameLayout.removeView(h1Var);
        frameLayout.addView(h1Var, frameLayout.getChildCount(), new android.view.ViewGroup.LayoutParams(-1, -1));
        appBrandRuntimeContainerWC.f74845x = h1Var;
        frameLayout.requestChildFocus(h1Var, h1Var);
        com.tencent.mm.plugin.appbrand.ui.b8 b8Var = (com.tencent.mm.plugin.appbrand.ui.b8) b1Var;
        b8Var.getClass();
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) b8Var.f89579a.f90318h;
        com.tencent.mm.plugin.appbrand.widget.input.a aVar = appBrandUI.f89412p;
        android.app.Activity activity = aVar.f91275a;
        if (activity != null && activity.getWindow() != null && frameLayout2 != null && frameLayout2.getParent() != null && (frameLayout2.getParent() instanceof android.view.ViewGroup)) {
            aVar.f91276b = true;
        }
        com.tencent.mm.plugin.appbrand.ui.h8 h8Var = new com.tencent.mm.plugin.appbrand.ui.h8(this, appBrandUI);
        appBrandUI.f89415s = h8Var;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        try {
            boolean a18 = fp.h.a(33);
            android.content.BroadcastReceiver broadcastReceiver = h8Var.f425436a;
            if (a18) {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter);
            } else {
                com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter, 4);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = " + e17);
        }
    }
}
