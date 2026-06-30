package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public abstract class w {
    public static final java.lang.String a(android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Bundle[");
        if (bundle == null) {
            sb6.append("null");
        } else {
            try {
                boolean z17 = true;
                for (java.lang.String str : bundle.keySet()) {
                    if (!z17) {
                        sb6.append(", ");
                    }
                    sb6.append(str);
                    sb6.append('=');
                    java.lang.Object obj = bundle.get(str);
                    if (obj instanceof java.lang.Object[]) {
                        sb6.append(java.util.Arrays.toString((java.lang.Object[]) obj));
                    } else if (obj instanceof android.os.Bundle) {
                        sb6.append(a((android.os.Bundle) obj));
                    } else {
                        sb6.append(obj);
                    }
                    z17 = false;
                }
            } catch (java.lang.Exception unused) {
                sb6.append("can not read bundle");
            }
        }
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final boolean b(android.content.Context context, yz5.l predicate) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(predicate, "predicate");
        java.lang.Object systemService = context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) systemService).getRunningAppProcesses()) {
            kotlin.jvm.internal.o.d(runningAppProcessInfo);
            if (((java.lang.Boolean) predicate.invoke(runningAppProcessInfo)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void c(com.tencent.mm.sdk.platformtools.o4 o4Var, java.lang.String key) {
        kotlin.jvm.internal.o.g(o4Var, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        o4Var.putLong(key, java.lang.System.currentTimeMillis());
    }

    public static final java.lang.String d(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        return intent.toString() + ' ' + a(intent.getExtras());
    }
}
