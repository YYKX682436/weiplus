package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.view.Display a(android.app.Activity activity) {
        android.view.Display display;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                display = activity.getDisplay();
            } catch (java.lang.UnsupportedOperationException unused) {
                display = null;
            }
            if (display != null) {
                return display;
            }
        }
        return activity.getWindowManager().getDefaultDisplay();
    }
}
