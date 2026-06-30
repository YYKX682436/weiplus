package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.TaskRunnerJNI */
/* loaded from: classes7.dex */
public class C28602x9ef83230 {
    private static final java.lang.String TAG = "TaskRunnerJNI";

    /* renamed from: jniAddress */
    private long f71004x95fc248f = 0;

    public C28602x9ef83230() {
        m137838x316510();
    }

    /* renamed from: nativeDestroy */
    private native void m137828x23caefe3(long j17);

    /* renamed from: nativeGetTaskRunnerAddress */
    private native long m137829x6045d320(long j17);

    /* renamed from: nativeInit */
    private native long m137830xb90145c7();

    /* renamed from: nativePost */
    private native void m137831xb9047957(long j17, java.lang.Runnable runnable);

    /* renamed from: nativePostDelay */
    private native void m137832x5c428e6c(long j17, java.lang.Runnable runnable, long j18);

    /* renamed from: nativeRunNowOrPost */
    private native void m137833x24c85b05(long j17, java.lang.Runnable runnable);

    /* renamed from: nativeRunOnCurrentThread */
    private native boolean m137834xad0ae7b0(long j17);

    public static void run(java.lang.Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: destroy */
    public void m137835x5cd39ffa() {
        m137828x23caefe3(this.f71004x95fc248f);
        this.f71004x95fc248f = 0L;
    }

    /* renamed from: getAddress */
    public long m137836xf964d7be() {
        return this.f71004x95fc248f;
    }

    /* renamed from: getTaskRunnerAddress */
    public long m137837xd9c84069() {
        long j17 = this.f71004x95fc248f;
        if (j17 == 0) {
            return 0L;
        }
        return m137829x6045d320(j17);
    }

    /* renamed from: init */
    public void m137838x316510() {
        this.f71004x95fc248f = m137830xb90145c7();
    }

    /* renamed from: post */
    public void m137839x3498a0(java.lang.Runnable runnable) {
        m137831xb9047957(this.f71004x95fc248f, runnable);
    }

    /* renamed from: postDelay */
    public void m137840x75df94c3(java.lang.Runnable runnable, long j17) {
        m137832x5c428e6c(this.f71004x95fc248f, runnable, j17);
    }

    /* renamed from: runNowOrPost */
    public void m137841xcced214e(java.lang.Runnable runnable) {
        m137833x24c85b05(this.f71004x95fc248f, runnable);
    }

    /* renamed from: runOnCurrentThread */
    public boolean m137842xd1aa1339() {
        return m137834xad0ae7b0(this.f71004x95fc248f);
    }
}
