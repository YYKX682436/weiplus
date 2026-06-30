package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final boolean b(android.content.Context context, yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) systemService).getRunningAppProcesses()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(runningAppProcessInfo);
            if (((java.lang.Boolean) predicate.mo146xb9724478(runningAppProcessInfo)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final void c(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o4Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        o4Var.putLong(key, java.lang.System.currentTimeMillis());
    }

    public static final java.lang.String d(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "<this>");
        return intent.toString() + ' ' + a(intent.getExtras());
    }
}
