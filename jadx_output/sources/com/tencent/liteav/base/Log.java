package com.tencent.liteav.base;

/* loaded from: classes13.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static final java.lang.String sDeprecatedTagPrefix = "cr.";
    private static final java.lang.String sTagPrefix = "cr_";
    private static final boolean useChromiumLog = true;

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(3, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(6, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static java.lang.String formatLog(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return objArr != null ? ((th6 != null || objArr.length <= 0) && objArr.length <= 1) ? str : java.lang.String.format(java.util.Locale.US, str, objArr) : str;
    }

    private static java.lang.String formatLogWithStack(java.lang.String str, java.lang.Throwable th6, java.lang.Object... objArr) {
        return "[" + getCallOrigin() + "] " + formatLog(str, th6, objArr);
    }

    private static java.lang.String getCallOrigin() {
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        java.lang.String name = com.tencent.liteav.base.Log.class.getName();
        int i17 = 0;
        while (true) {
            if (i17 >= stackTrace.length) {
                break;
            }
            if (stackTrace[i17].getClassName().equals(name)) {
                i17 += 3;
                break;
            }
            i17++;
        }
        return stackTrace[i17].getFileName() + ":" + stackTrace[i17].getLineNumber();
    }

    public static java.lang.String getStackTraceString(java.lang.Throwable th6) {
        return android.util.Log.getStackTraceString(th6);
    }

    private static java.lang.Throwable getThrowableToLog(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        java.lang.Object obj = objArr[objArr.length - 1];
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        return null;
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(4, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    private static boolean isDebug() {
        return true;
    }

    public static boolean isLoggable(java.lang.String str, int i17) {
        if (isDebug() || i17 > 4) {
            return android.util.Log.isLoggable(str, i17);
        }
        return false;
    }

    private static native void nativeWriteLogToNative(int i17, java.lang.String str, java.lang.String str2);

    public static java.lang.String normalizeTag(java.lang.String str) {
        if (str.startsWith(sTagPrefix)) {
            return str;
        }
        return sTagPrefix + str.substring(str.startsWith(sDeprecatedTagPrefix) ? 3 : 0, str.length());
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(2, str, formatLogWithStack(str2, getThrowableToLog(objArr), objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(5, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }

    public static void wtf(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        nativeWriteLogToNative(7, str, formatLog(str2, getThrowableToLog(objArr), objArr));
    }
}
