package androidx.camera.core;

/* loaded from: classes14.dex */
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    public static boolean isDebugEnabled(java.lang.String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(java.lang.String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(java.lang.String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(java.lang.String str, int i17) {
        return sMinLogLevel <= i17 || android.util.Log.isLoggable(str, i17);
    }

    public static boolean isVerboseEnabled(java.lang.String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(java.lang.String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(int i17) {
        sMinLogLevel = i17;
    }

    private static java.lang.String truncateTag(java.lang.String str) {
        return (android.os.Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        isLogLevelEnabled(truncateTag(str), 5);
    }
}
