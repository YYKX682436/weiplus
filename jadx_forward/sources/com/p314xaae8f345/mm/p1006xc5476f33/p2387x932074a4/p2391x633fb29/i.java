package com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29;

/* loaded from: classes9.dex */
public class i implements cu4.f {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.i f262898a;

    public boolean a(android.app.Activity activity) {
        android.content.ComponentName componentName = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRunningTasks(1).get(0).topActivity;
        java.lang.String className = componentName != null ? componentName.getClassName() : "";
        return className == null || className.equals(activity.getClass().getName()) || !className.contains("com.tencent.mm") || !(className.contains("plugin.mall") || className.contains("plugin.card") || className.contains("plugin.wallet") || className.contains("plugin.wallet_index") || className.contains("plugin.webview") || className.contains("plugin.offline") || className.contains("plugin.recharge"));
    }
}
