package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class bh {
    public static final com.p314xaae8f345.mm.ui.ah a(android.content.Context context) {
        int i17;
        android.view.Display defaultDisplay;
        android.view.WindowMetrics currentWindowMetrics;
        android.graphics.Rect bounds;
        android.view.WindowMetrics currentWindowMetrics2;
        android.graphics.Rect bounds2;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            java.lang.Integer num = null;
            java.lang.Integer valueOf = (windowManager == null || (currentWindowMetrics2 = windowManager.getCurrentWindowMetrics()) == null || (bounds2 = currentWindowMetrics2.getBounds()) == null) ? null : java.lang.Integer.valueOf(bounds2.width());
            if (windowManager != null && (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                num = java.lang.Integer.valueOf(bounds.height());
            }
            if ((valueOf == null || valueOf.intValue() != 0) && (num == null || num.intValue() != 0)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                int intValue = valueOf.intValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                return new com.p314xaae8f345.mm.ui.ah(intValue, num.intValue());
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        int i18 = point.x;
        return (i18 == 0 || (i17 = point.y) == 0) ? new com.p314xaae8f345.mm.ui.ah(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : new com.p314xaae8f345.mm.ui.ah(i18, i17);
    }
}
