package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI f84509d;

    public b0(com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI appBrandLaunchProxyUI) {
        this.f84509d = appBrandLaunchProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.launching.precondition.y yVar;
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI appBrandLaunchProxyUI = this.f84509d;
        if (appBrandLaunchProxyUI.isDestroyed() || appBrandLaunchProxyUI.isFinishing() || (yVar = appBrandLaunchProxyUI.f84349h) == null || !yVar.b()) {
            return;
        }
        try {
            android.view.View view = appBrandLaunchProxyUI.f84350i;
            if (view == null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) appBrandLaunchProxyUI.findViewById(android.R.id.content);
                android.view.View inflate = android.view.View.inflate(appBrandLaunchProxyUI, com.tencent.mm.R.layout.c1_, null);
                frameLayout.addView(inflate, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jma)).setText(com.tencent.mm.R.string.ggc);
                appBrandLaunchProxyUI.f84350i = inflate;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            appBrandLaunchProxyUI.n6(appBrandLaunchProxyUI.f84353o);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLaunchProxyUI", "attach dialog View e=%s", e17);
        }
    }
}
