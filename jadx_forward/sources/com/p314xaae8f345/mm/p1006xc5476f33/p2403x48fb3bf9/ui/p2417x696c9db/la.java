package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class la implements java.lang.Runnable {
    public la(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.f265331w3 <= 0) {
            java.util.HashSet hashSet = com.p314xaae8f345.mm.sdk.p2603x2137b148.b.f273999a;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "recoverAccessibilityEnable");
                android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
                boolean isEnabled = accessibilityManager.isEnabled();
                java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityManager.class.getDeclaredField("mIsHighTextContrastEnabled");
                declaredField.setAccessible(true);
                boolean booleanValue = ((java.lang.Boolean) declaredField.get(accessibilityManager)).booleanValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "recoverAccessibilityEnable enabledNow = " + isEnabled);
                if (!isEnabled) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b.b(accessibilityManager, booleanValue);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "enableAccessibility failed -> " + th6.getMessage());
            }
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "now force sync the cookie between ram and db");
            com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "syncCookie, error:%s", e17);
        }
    }
}
