package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes7.dex */
public class o implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!"undefined".equals(str)) {
            float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(str, -1.0f);
            if (L > 0.0f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebUtil", "update density with window.devicePixelRatio = %s", str);
                if (L > 0.0f) {
                    ik1.w.f373376b = java.lang.Float.valueOf(L);
                    return;
                } else {
                    android.util.DisplayMetrics displayMetrics = ik1.w.f373375a;
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameWebUtil", "invalid window.devicePixelRatio %s", str);
    }
}
