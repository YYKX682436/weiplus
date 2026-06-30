package com.tencent.liteav.base.logger;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes16.dex */
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid;

    /* loaded from: classes6.dex */
    public enum a {
        kTRTC(0),
        kLive(1),
        kVod(2);

        int value;

        a(int i17) {
            this.value = i17;
        }
    }

    /* loaded from: classes6.dex */
    public enum b {
        kApi(1),
        kInfo(2),
        kWarning(3),
        kError(4);

        int level;

        b(int i17) {
            this.level = i17;
        }
    }

    public OnlineLoggerAndroid(com.tencent.liteav.base.logger.OnlineLoggerAndroid.a aVar, int i17, java.lang.String str, java.lang.String str2) {
        this.mNativeOnlineLoggerAndroid = -1L;
        this.mNativeOnlineLoggerAndroid = nativeCreate(aVar.value, i17, str, str2);
    }

    private static native long nativeCreate(int i17, int i18, java.lang.String str, java.lang.String str2);

    private static native void nativeDestroy(long j17);

    private static native void nativeLog(long j17, int i17, java.lang.String str);

    public synchronized void destroy() {
        long j17 = this.mNativeOnlineLoggerAndroid;
        if (j17 == -1) {
            return;
        }
        nativeDestroy(j17);
        this.mNativeOnlineLoggerAndroid = -1L;
    }

    public void finalize() {
        super.finalize();
        destroy();
    }

    public synchronized void log(com.tencent.liteav.base.logger.OnlineLoggerAndroid.b bVar, java.lang.String str) {
        long j17 = this.mNativeOnlineLoggerAndroid;
        if (j17 == -1) {
            return;
        }
        nativeLog(j17, bVar.level, str);
    }
}
