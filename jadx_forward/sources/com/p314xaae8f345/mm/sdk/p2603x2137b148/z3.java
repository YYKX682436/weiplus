package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class z3 {
    public static java.lang.String a() {
        try {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 3) {
                return (stackTrace[2].getClassName().substring(15) + ":" + stackTrace[2].getMethodName()) + "(" + stackTrace[2].getLineNumber() + ")";
            }
            return "";
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util.MMStack", "getCaller e:%s", c(th6));
            return "";
        }
    }

    public static java.lang.String b(boolean z17) {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace == null || stackTrace.length < 4) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 3; i17 < stackTrace.length; i17++) {
            if (stackTrace[i17].getClassName().contains("com.tencent.") && !stackTrace[i17].getClassName().contains("sdk.platformtools.Log")) {
                sb6.append("[");
                sb6.append(stackTrace[i17].getClassName().replace("com.tencent.mm", ""));
                sb6.append(":");
                sb6.append(stackTrace[i17].getMethodName());
                if (z17) {
                    sb6.append("(" + stackTrace[i17].getLineNumber() + ")]");
                } else {
                    sb6.append("]");
                }
            }
        }
        return sb6.toString();
    }

    public static java.lang.String c(java.lang.Throwable th6) {
        if (th6 == null) {
            return "";
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.PrintStream printStream = new java.io.PrintStream(byteArrayOutputStream);
            th6.printStackTrace(printStream);
            java.lang.String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            printStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: toString */
    public java.lang.String m77837x9616526c() {
        return b(true);
    }
}
