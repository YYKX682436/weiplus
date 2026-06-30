package be1;

/* loaded from: classes7.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.appbrand.y component, java.util.Map data) {
        int i17;
        android.view.View contentView;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = t37 != null ? t37.u0() : null;
        if (u07 == null) {
            com.tencent.mars.xlog.Log.i("JsApiGetSystemInfoWC", "initConfig is null, return");
            return;
        }
        if (u07 instanceof com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) u07;
            if (appBrandInitConfigWC.L1.c()) {
                com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = appBrandInitConfigWC.L1;
                if (!halfScreenConfig.f77364n && halfScreenConfig.f77357d == -1) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("JsApiGetSystemInfoWC", "half screen mode, force [screenTop] and [statusBarHeight] to 0");
                if (appBrandInitConfigWC.L1.W) {
                    com.tencent.mars.xlog.Log.i("JsApiGetSystemInfoWC", "half screen mode, enableExpandToStatusBarTop");
                    return;
                }
                com.tencent.mm.plugin.appbrand.page.v5 a17 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(component);
                if (a17 != null && (contentView = a17.getContentView()) != null) {
                    com.tencent.mm.plugin.appbrand.page.v5 a18 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(component);
                    android.widget.FrameLayout pageArea = a18 != null ? a18.getPageArea() : null;
                    if (pageArea != null) {
                        i17 = java.lang.Math.max(contentView.getMeasuredHeight() - pageArea.getMeasuredHeight(), 0);
                        data.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
                        data.put("statusBarHeight", 0);
                    }
                }
                i17 = 0;
                data.put("screenTop", java.lang.Integer.valueOf(ik1.w.e(i17)));
                data.put("statusBarHeight", 0);
            }
        }
    }
}
