package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f273999a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f273999a = hashSet;
        hashSet.add("com.eg.android.AlipayGphone/com.alipay.mobile.rome.voicebroadcast.a11y.A11yService");
        hashSet.add("com.apowersoft.mirror/.service.ListenAppService");
        hashSet.add("com.tencent.android.qqdownloader/com.tencent.nucleus.manager.accessibility.YYBAccessibilityService");
        hashSet.add("com.huawei.recsys/.service.PortraitDaService");
        hashSet.add("com.samsung.android.app.sreminder/.phone.shoppingassistant.ShoppingAssistantService");
        hashSet.add("com.samsung.android.app.sreminder/.shoppingassistant.ShoppingAssistantService");
        hashSet.add("com.liuzh.quickly/.accservice.QuicklyAccService");
        hashSet.add("com.kugou.android.ringtone/.ringcommon.util.permission.accessibilitysuper.service.AccessibilitySuperService");
        hashSet.add("com.tencent.qqpinyin/.accessibility.EmotionHelperService");
        hashSet.add("com.samsung.android.bixbytouch/com.samsung.android.bixbytouch.library.shopping.ShoppingAccessibilityService");
        hashSet.add("org.autojs.autojs/com.stardust.autojs.core.accessibility.AccessibilityService");
        hashSet.add("com.whatsbug.litiaotiao/.MyAccessibilityService");
        hashSet.add("com.auto.greenskipad/com.auto.skip.service.NewTiaoGuoService");
        hashSet.add("com.hihonor.awareness/.server.pageanalysis.AccessibleInfoStuck");
        hashSet.add("com.coloros.colordirectservice/.ColorTextAccessibilityService");
        hashSet.add("com.huawei.contentsensor/.accessibility.ContentAccessibilityService");
        hashSet.add("com.huawei.hiai/.awareness.service.AwarenessAccessibilityService");
        hashSet.add("cn.litiaotiao.app/com.litiaotiao.app.LttService");
    }

    public static void a(android.view.accessibility.AccessibilityManager accessibilityManager) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "printEnabledAccessibilityServiceInfo");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "printEnabledAccessibilityServiceInfo enabled = " + accessibilityManager.isEnabled());
            java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = accessibilityManager.getEnabledAccessibilityServiceList(-1).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "enabledAccessibilityServiceInfo : %s", it.next().toString());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AccessibilityUtil", "printEnabledAccessibilityServiceInfo error : %s", th6.getMessage());
        }
    }

    public static void b(android.view.accessibility.AccessibilityManager accessibilityManager, boolean z17) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "recoverAccessibilityEnable");
            java.lang.reflect.Method declaredMethod = android.view.accessibility.AccessibilityManager.class.getDeclaredMethod("setStateLocked", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            int i17 = accessibilityManager.isTouchExplorationEnabled() ? 3 : 1;
            if (z17) {
                i17 |= 4;
            }
            declaredMethod.invoke(accessibilityManager, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "recoverAccessibilityEnable setStateLocked is invoked, flag = %d", java.lang.Integer.valueOf(i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AccessibilityUtil", "recoverAccessibilityEnable error : %s", th6.getMessage());
        }
    }

    public static void c() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "smartDisableAccessibility");
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityManager.class.getDeclaredField("mIsHighTextContrastEnabled");
            declaredField.setAccessible(true);
            boolean booleanValue = ((java.lang.Boolean) declaredField.get(accessibilityManager)).booleanValue();
            if (!isEnabled) {
                b(accessibilityManager, booleanValue);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "isCoolassistEnv or flavor red, return");
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.util.Iterator<android.accessibilityservice.AccessibilityServiceInfo> it = accessibilityManager.getEnabledAccessibilityServiceList(1).iterator();
            while (it.hasNext()) {
                if (!f273999a.contains(it.next().getId())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "has spoken service, return");
                    a(accessibilityManager);
                    return;
                }
            }
            if (accessibilityManager.isTouchExplorationEnabled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "isTouchExplorationEnabled is true, return");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "disableAccessibility");
            java.lang.reflect.Method declaredMethod = android.view.accessibility.AccessibilityManager.class.getDeclaredMethod("setStateLocked", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            int i17 = booleanValue ? 4 : 0;
            declaredMethod.invoke(accessibilityManager, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AccessibilityUtil", "smartDisableAccessibility setStateLocked is invoked, flag = %d", java.lang.Integer.valueOf(i17));
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.sdk.p2603x2137b148.a(accessibilityManager));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AccessibilityUtil", "disableAccessibility exception -> " + th6.getMessage());
        }
    }
}
