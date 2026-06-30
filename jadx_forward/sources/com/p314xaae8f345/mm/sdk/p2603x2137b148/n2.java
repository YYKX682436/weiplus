package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public abstract class n2 {
    public static boolean a() {
        try {
            return ((android.location.LocationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(ya.b.f77489x9ff58fb5)).isProviderEnabled("gps");
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }

    public static boolean b() {
        try {
            return ((android.location.LocationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(ya.b.f77489x9ff58fb5)).isProviderEnabled("network");
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationUtil", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return false;
        }
    }

    public static void c(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(-1);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/sdk/platformtools/LocationUtil", "jumpToOpenGps", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
