package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {
    public u(com.p314xaae8f345.mm.p849xbf8d97c1.o oVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MatrixDelegate", "Save AccInfo To MMKV");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = ((android.view.accessibility.AccessibilityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("Matrix-AccInfo", sb6.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MatrixDelegate", "get accessibilityInfo error : " + th6.getMessage());
        }
    }
}
