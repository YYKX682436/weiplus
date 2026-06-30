package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class f5 {
    public static int[] a(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        xi1.g windowAndroid = d0Var.t3() != null ? d0Var.t3().getWindowAndroid() : null;
        android.util.DisplayMetrics vDisplayMetrics = windowAndroid != null ? windowAndroid.getVDisplayMetrics() : d0Var.getContext().getResources().getDisplayMetrics();
        return new int[]{vDisplayMetrics.widthPixels, vDisplayMetrics.heightPixels};
    }

    public static int[] b(com.tencent.mm.plugin.appbrand.y yVar) {
        int[] a17;
        com.tencent.mm.plugin.appbrand.page.v5 a18 = com.tencent.mm.plugin.appbrand.jsapi.gg.a(yVar);
        android.widget.FrameLayout pageArea = a18 == null ? null : a18.getPageArea();
        if (pageArea == null || !pageArea.isLaidOut()) {
            xi1.g windowAndroid = yVar.getWindowAndroid();
            if (windowAndroid != null) {
                com.tencent.mars.xlog.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: windowAndroid %s", windowAndroid.getClass().getCanonicalName());
                android.util.DisplayMetrics vDisplayMetrics = windowAndroid.getVDisplayMetrics();
                int i17 = vDisplayMetrics.widthPixels;
                if (i17 <= 0) {
                    com.tencent.mars.xlog.Log.e("Luggage.WXA.UIUtil", "getWindowWidthHeight try Method(windowAndroid) but width<=0, use Method(Screen) instead");
                    a17 = a(yVar);
                } else {
                    a17 = new int[]{i17, vDisplayMetrics.heightPixels};
                }
            } else {
                com.tencent.mars.xlog.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: Screen");
                a17 = a(yVar);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.UIUtil", "getWindowWidthHeight Method: normal");
            a17 = new int[]{pageArea.getWidth(), pageArea.getHeight()};
        }
        int i18 = a17[0];
        int i19 = a17[1];
        return a17;
    }

    public static boolean c(android.view.View view) {
        android.app.Activity a17;
        return (view == null || (a17 = q75.a.a(view.getContext())) == null || !a17.isInMultiWindowMode()) ? false : true;
    }
}
