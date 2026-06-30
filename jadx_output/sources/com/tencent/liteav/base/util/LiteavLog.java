package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes14.dex */
public class LiteavLog {
    private static final int LEVEL_DEBUG = 1;
    private static final int LEVEL_ERROR = 4;
    private static final int LEVEL_FATAL = 5;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_NULL = 6;
    private static final int LEVEL_VERBOSE = 0;
    private static final int LEVEL_WARN = 3;
    private static com.tencent.liteav.base.util.LiteavLog.a sCallback = null;
    private static final boolean useChromiumBaseLog = true;

    /* loaded from: classes4.dex */
    public interface a {
        void a(int i17, java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes16.dex */
    public enum b {
        kAll(0),
        kInfo(1),
        kWarning(2),
        kError(3),
        kFatal(4),
        kNone(5);

        public int mNativeValue;

        b(int i17) {
            this.mNativeValue = i17;
        }

        public static int a(int i17) {
            if (i17 == 0) {
                return 0;
            }
            if (i17 == 1) {
                return 2;
            }
            if (i17 == 2) {
                return 3;
            }
            if (i17 != 3) {
                return i17 != 4 ? 6 : 5;
            }
            return 4;
        }
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public static void d(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        d(str, str2, objArr);
    }

    public static void e(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, objArr);
    }

    public static int getLogLevel() {
        return nativeGetLogLevel();
    }

    public static void i(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        i(str, str2, objArr);
    }

    public static native int nativeGetLogLevel();

    public static native void nativeSetConsoleLogEnabled(boolean z17);

    public static native void nativeSetLogCallbackEnabled(boolean z17);

    public static native void nativeSetLogCompressEnabled(boolean z17);

    public static native void nativeSetLogFilePath(java.lang.String str);

    public static native void nativeSetLogLevel(int i17);

    public static native void nativeSetLogToFileEnabled(boolean z17);

    public static void onLog(int i17, java.lang.String str) {
        com.tencent.liteav.base.util.LiteavLog.a aVar = sCallback;
        if (aVar != null) {
            aVar.a(com.tencent.liteav.base.util.LiteavLog.b.a(i17), "TXLiteAVSDK", str);
        }
    }

    public static void setCallback(com.tencent.liteav.base.util.LiteavLog.a aVar) {
        sCallback = aVar;
    }

    public static void v(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        v(str, str2, objArr);
    }

    public static void w(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        w(str, str2, objArr);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        i(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        v(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        w(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.d(str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.e(str, str2, new java.lang.Object[0]);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.i(str, str2, new java.lang.Object[0]);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.v(str, str2, new java.lang.Object[0]);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.tencent.liteav.base.Log.w(str, str2, new java.lang.Object[0]);
    }

    public static void e(com.tencent.liteav.base.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, th6);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        e(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }
}
