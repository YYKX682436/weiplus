package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class na extends com.p314xaae8f345.mm.ui.v9 {
    public static void g(android.content.Context context, boolean z17) {
        android.app.Activity a17 = q75.a.a(context);
        if (a17 == null || a17.getWindow() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUIUtil", "configFullScreen with context(%s), get NULL activity", context);
        } else {
            h(a17.getWindow(), z17, false);
        }
    }

    public static void h(android.view.Window window, boolean z17, boolean z18) {
        if (!z17) {
            window.getDecorView().setSystemUiVisibility(i(window, false));
            window.getDecorView().setOnSystemUiVisibilityChangeListener(null);
            try {
                window.clearFlags(1024);
                return;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandUIUtil", e17, "[CAUGHT CRASH]", new java.lang.Object[0]);
                return;
            }
        }
        window.getDecorView().setSystemUiVisibility(i(window, true));
        window.getDecorView().setOnSystemUiVisibilityChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ma(z17, z18, window));
        window.addFlags(1024);
        if (!z18 || android.os.Build.VERSION.SDK_INT < 28) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        window.setAttributes(window.getAttributes());
    }

    public static int i(android.view.Window window, boolean z17) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        int i17 = z17 ? systemUiVisibility | 1024 | 256 | 512 | 2 | 4 | 4096 : systemUiVisibility & (-1025) & (-257) & (-513) & (-3) & (-5) & (-4097);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIUtil", "hy: setting ui visibility: %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static boolean j(android.content.Context context) {
        android.app.Activity a17 = q75.a.a(context);
        if (a17 == null) {
            return false;
        }
        try {
            return (a17.getWindow().getAttributes().flags & 1024) == 1024;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static boolean k(android.view.View view) {
        android.app.Activity a17;
        return (view == null || (a17 = q75.a.a(view.getContext())) == null || !a17.isInMultiWindowMode()) ? false : true;
    }
}
