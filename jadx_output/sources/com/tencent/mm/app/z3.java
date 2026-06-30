package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class z3 {
    public static void a(java.lang.String str, java.lang.String str2) {
        while (str2.length() > 8192) {
            try {
                int lastIndexOf = str2.substring(0, 8192).lastIndexOf("\n");
                if (-1 == lastIndexOf) {
                    com.tencent.mars.xlog.Log.e(str, str2.substring(0, 8192));
                    str2 = str2.substring(8193);
                } else {
                    com.tencent.mars.xlog.Log.e(str, str2.substring(0, lastIndexOf));
                    str2 = str2.substring(lastIndexOf + 1);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "Failed printing stack trace.", new java.lang.Object[0]);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(str, str2);
        com.tencent.mars.xlog.Log.appenderFlush();
    }

    public static java.lang.Object b(java.util.concurrent.Callable callable) {
        try {
            return callable.call();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
