package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes5.dex */
public abstract class m3 {
    public static final com.tencent.mm.plugin.appbrand.utils.l3 a(android.content.Context context) {
        int i17;
        android.view.Display defaultDisplay;
        android.view.WindowMetrics currentWindowMetrics;
        android.graphics.Rect bounds;
        android.view.WindowMetrics currentWindowMetrics2;
        android.graphics.Rect bounds2;
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            int i18 = 0;
            int width = (windowManager == null || (currentWindowMetrics2 = windowManager.getCurrentWindowMetrics()) == null || (bounds2 = currentWindowMetrics2.getBounds()) == null) ? 0 : bounds2.width();
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                i18 = bounds.height();
            }
            if (width != 0 && i18 != 0) {
                return new com.tencent.mm.plugin.appbrand.utils.l3(width, i18);
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        int i19 = point.x;
        return (i19 == 0 || (i17 = point.y) == 0) ? new com.tencent.mm.plugin.appbrand.utils.l3(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : new com.tencent.mm.plugin.appbrand.utils.l3(i19, i17);
    }

    public static final boolean b(android.content.Context ctx) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        com.tencent.mm.plugin.appbrand.utils.l3 a17 = a(ctx);
        android.util.DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return (ctx.getResources().getConfiguration().screenLayout & 15) >= 3 && java.lang.Math.sqrt(java.lang.Math.pow((double) (((float) a17.f90502a) / displayMetrics.xdpi), 2.0d) + java.lang.Math.pow((double) (((float) a17.f90503b) / displayMetrics.ydpi), 2.0d)) >= 7.0d;
    }
}
