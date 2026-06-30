package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public abstract class v9 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            goto L16
        L4:
            java.lang.String r1 = "window"
            java.lang.Object r2 = r5.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 != 0) goto L18
            java.lang.String r5 = "Luggage.LuggageUIHelper"
            java.lang.String r1 = "getRealBottomHeight, get NULL windowManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r1)
        L16:
            r2 = r0
            goto L6b
        L18:
            android.view.Display r2 = r2.getDefaultDisplay()
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r2.getSize(r3)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            java.lang.Object r1 = r5.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealSize(r2)
            int r1 = r3.y
            int r3 = r3.x
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r2.y
            int r2 = r2.x
            int r2 = java.lang.Math.max(r3, r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r4 = r5 instanceof android.app.Activity
            if (r4 == 0) goto L6a
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            r5.getWindowVisibleDisplayFrame(r3)
            int r5 = r3.bottom
            int r1 = r3.top
            int r5 = r5 - r1
            int r1 = r3.right
            int r3 = r3.left
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r5, r1)
        L6a:
            int r2 = r2 - r1
        L6b:
            if (r2 <= 0) goto L6f
            r5 = 1
            goto L70
        L6f:
            r5 = r0
        L70:
            if (r5 == 0) goto L8a
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android"
            java.lang.String r2 = "navigation_bar_height"
            java.lang.String r3 = "dimen"
            int r5 = r5.getIdentifier(r2, r3, r1)
            if (r5 <= 0) goto L8a
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            int r0 = r0.getDimensionPixelSize(r5)
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.v9.a(android.content.Context):int");
    }

    public static int b(android.content.Context context) {
        return fp.j0.a(context, 25);
    }

    public static boolean c(android.view.Window window, boolean z17) {
        if (window == null || window.getDecorView() == null) {
            return false;
        }
        u75.d.g();
        android.view.View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z17 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        return true;
    }

    public static void d(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            e(((android.app.Activity) context).getWindow());
        }
    }

    public static void e(android.view.Window window) {
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static void f(android.app.Activity activity, int i17) {
        if (activity == null) {
            return;
        }
        try {
            if (activity.getWindow() == null) {
                return;
            }
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().setStatusBarColor(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.LuggageUIHelper", th6, "", new java.lang.Object[0]);
        }
    }
}
