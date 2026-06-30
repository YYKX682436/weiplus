package com.tencent.luggage.sdk.processes;

/* loaded from: classes7.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        try {
            android.content.pm.PackageManager packageManager = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager();
            android.content.pm.ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) clazz), 128) : null;
            if (activityInfo != null) {
                java.lang.String str = activityInfo.processName;
                if (str != null) {
                    return str;
                }
            }
            return "";
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("Luggage.LuggageMiniProgramProcess", "processNameOfComponent: catch cmpClass[" + clazz + "] " + e17.getMessage());
            return null;
        }
    }
}
