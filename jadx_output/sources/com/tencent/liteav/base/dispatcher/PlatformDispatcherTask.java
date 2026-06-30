package com.tencent.liteav.base.dispatcher;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes7.dex */
class PlatformDispatcherTask implements java.lang.Runnable {
    private long mNativePlatformDispatcherTask;

    public PlatformDispatcherTask(long j17) {
        this.mNativePlatformDispatcherTask = j17;
    }

    private void destroyTask() {
        long j17 = this.mNativePlatformDispatcherTask;
        if (j17 != 0) {
            nativeDestroyTask(j17);
            this.mNativePlatformDispatcherTask = 0L;
        }
    }

    public static android.os.Handler getMainHandler() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private static native void nativeDestroyTask(long j17);

    private static native void nativeRunTask(long j17);

    public void finalize() {
        destroyTask();
        super.finalize();
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.mNativePlatformDispatcherTask;
        if (j17 != 0) {
            nativeRunTask(j17);
            destroyTask();
        }
    }
}
