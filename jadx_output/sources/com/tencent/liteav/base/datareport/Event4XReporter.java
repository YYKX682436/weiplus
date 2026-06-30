package com.tencent.liteav.base.datareport;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes7.dex */
public class Event4XReporter {
    private static final int INVALID_INSTANCE = 0;
    public static final int REPORT_EVENT = 1;
    public static final int REPORT_STATUS = 2;
    private static final java.lang.String TAG = "Event4XReporter";
    private long mNativeEvent4XReporterAndroid;

    public Event4XReporter(int i17, int i18, java.lang.String str, boolean z17, int i19) {
        this.mNativeEvent4XReporterAndroid = 0L;
        this.mNativeEvent4XReporterAndroid = nativeCreate(i17, i18, str, z17, i19);
    }

    private static native long nativeCreate(int i17, int i18, java.lang.String str, boolean z17, int i19);

    private static native void nativeDestroy(long j17);

    private static native int nativeGetColdDownTime(long j17);

    private static native void nativeSendReport(long j17);

    private static native void nativeSetCommonIntValue(long j17, java.lang.String str, long j18);

    private static native void nativeSetCommonStringValue(long j17, java.lang.String str, java.lang.String str2);

    private static native void nativeSetEventIntValue(long j17, java.lang.String str, long j18);

    private static native void nativeSetEventStringValue(long j17, java.lang.String str, java.lang.String str2);

    public synchronized void destroy() {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 == 0) {
            return;
        }
        nativeDestroy(j17);
        this.mNativeEvent4XReporterAndroid = 0L;
    }

    public void finalize() {
        super.finalize();
        destroy();
    }

    public int getColdDownTime() {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 == 0) {
            return 10000;
        }
        return nativeGetColdDownTime(j17);
    }

    public synchronized void reportDau(int i17, int i18, java.lang.String str) {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 == 0) {
            return;
        }
        nativeSetEventStringValue(j17, "event_id", java.lang.String.valueOf(i17));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_code", java.lang.String.valueOf(i18));
        nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_info", str);
        nativeSendReport(this.mNativeEvent4XReporterAndroid);
    }

    public synchronized void sendReport() {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 == 0) {
            return;
        }
        nativeSendReport(j17);
    }

    public synchronized void setCommonIntValue(java.lang.String str, long j17) {
        long j18 = this.mNativeEvent4XReporterAndroid;
        if (j18 != 0 && str != null) {
            nativeSetCommonIntValue(j18, str, j17);
        }
    }

    public synchronized void setCommonStringValue(java.lang.String str, java.lang.String str2) {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 != 0 && str != null && str2 != null) {
            nativeSetCommonStringValue(j17, str, str2);
        }
    }

    public synchronized void setEventIntValue(java.lang.String str, long j17) {
        long j18 = this.mNativeEvent4XReporterAndroid;
        if (j18 != 0 && str != null) {
            nativeSetEventIntValue(j18, str, j17);
        }
    }

    public synchronized void setEventStringValue(java.lang.String str, java.lang.String str2) {
        long j17 = this.mNativeEvent4XReporterAndroid;
        if (j17 != 0 && str != null && str2 != null) {
            nativeSetEventStringValue(j17, str, str2);
        }
    }
}
