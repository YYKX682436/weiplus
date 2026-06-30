package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class z3 {
    public static void a(java.lang.String str, java.lang.String str2) {
        while (str2.length() > 8192) {
            try {
                int lastIndexOf = str2.substring(0, 8192).lastIndexOf("\n");
                if (-1 == lastIndexOf) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2.substring(0, 8192));
                    str2 = str2.substring(8193);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2.substring(0, lastIndexOf));
                    str2 = str2.substring(lastIndexOf + 1);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "Failed printing stack trace.", new java.lang.Object[0]);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
    }

    public static java.lang.Object b(java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
