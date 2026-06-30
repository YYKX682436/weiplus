package com.tencent.cloud.aicamare.util;

/* loaded from: classes14.dex */
public class CameraLogger {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL f45865a = com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL.LEVEL_VERBOSE;

    /* loaded from: classes14.dex */
    public enum LOG_LEVEL {
        LEVEL_VERBOSE,
        LEVEL_DEBUG,
        LEVEL_INFO,
        LEVEL_WARN,
        LEVEL_ERROR,
        LEVEL_NONE
    }

    public static void a(java.lang.String str, java.lang.String str2, com.tencent.cloud.aicamare.callback.CameraLoggerCallBack cameraLoggerCallBack) {
        if (com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL.LEVEL_DEBUG.compareTo(f45865a) >= 0) {
            a(true, str, str2, cameraLoggerCallBack);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, com.tencent.cloud.aicamare.callback.CameraLoggerCallBack cameraLoggerCallBack) {
        if (com.tencent.cloud.aicamare.util.CameraLogger.LOG_LEVEL.LEVEL_ERROR.compareTo(f45865a) >= 0) {
            a(false, str, str2, cameraLoggerCallBack);
        }
    }

    public static void a(boolean z17, java.lang.String str, java.lang.String str2, com.tencent.cloud.aicamare.callback.CameraLoggerCallBack cameraLoggerCallBack) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (z17) {
            sb6.append("[ai-camera-debug]");
        } else {
            sb6.append("[ai-camera-error]");
        }
        sb6.append(str2);
        if (cameraLoggerCallBack != null) {
            cameraLoggerCallBack.logger(str, sb6.toString());
        }
    }
}
