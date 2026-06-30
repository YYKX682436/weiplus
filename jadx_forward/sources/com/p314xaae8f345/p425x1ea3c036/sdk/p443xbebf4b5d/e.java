package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes7.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        try {
            android.content.pm.PackageManager packageManager = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager();
            android.content.pm.ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) clazz), 128) : null;
            if (activityInfo != null) {
                java.lang.String str = activityInfo.processName;
                if (str != null) {
                    return str;
                }
            }
            return "";
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageMiniProgramProcess", "processNameOfComponent: catch cmpClass[" + clazz + "] " + e17.getMessage());
            return null;
        }
    }
}
