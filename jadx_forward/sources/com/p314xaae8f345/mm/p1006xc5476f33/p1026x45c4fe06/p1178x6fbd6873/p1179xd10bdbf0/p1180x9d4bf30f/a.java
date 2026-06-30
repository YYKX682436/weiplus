package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

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
