package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class WakerLock {
    private static final java.lang.String TAG = "MicroMsg.WakerLock";
    private byte _hellAccFlag_;
    private android.os.Handler mHandler;
    private java.lang.Runnable mReleaser = new java.lang.Runnable() { // from class: com.tencent.mars.comm.WakerLock.1
        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mars.comm.WakerLock.this.unLock();
        }
    };
    private android.os.PowerManager.WakeLock wakeLock;

    public WakerLock(android.content.Context context) {
        this.wakeLock = null;
        this.mHandler = null;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, TAG);
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        this.mHandler = new android.os.Handler(context.getMainLooper());
    }

    public void finalize() {
        unLock();
    }

    public boolean isLocking() {
        return this.wakeLock.isHeld();
    }

    public void lock(long j17) {
        lock();
        this.mHandler.postDelayed(this.mReleaser, j17);
    }

    public void unLock() {
        this.mHandler.removeCallbacks(this.mReleaser);
        if (this.wakeLock.isHeld()) {
            android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
            yj0.a.c(wakeLock, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/mars/comm/WakerLock", "unLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void lock() {
        this.mHandler.removeCallbacks(this.mReleaser);
        android.os.PowerManager.WakeLock wakeLock = this.wakeLock;
        yj0.a.c(wakeLock, "com/tencent/mars/comm/WakerLock", "lock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mars/comm/WakerLock", "lock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
    }
}
