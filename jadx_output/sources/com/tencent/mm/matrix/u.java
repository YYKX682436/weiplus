package com.tencent.mm.matrix;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {
    public u(com.tencent.mm.matrix.o oVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.i("MatrixDelegate", "Save AccInfo To MMKV");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.String id6 = it.next().getId();
                if (!sb6.toString().contains(id6)) {
                    sb6.append(id6);
                    sb6.append(";");
                    i17++;
                }
                if (i17 > 3) {
                    break;
                }
            }
            com.tencent.mm.sdk.platformtools.o4.L().D("Matrix-AccInfo", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MatrixDelegate", "get accessibilityInfo error : " + th6.getMessage());
        }
    }
}
