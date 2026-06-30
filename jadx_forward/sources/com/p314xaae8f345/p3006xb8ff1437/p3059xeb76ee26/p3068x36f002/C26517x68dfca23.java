package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002;

/* renamed from: com.tencent.thumbplayer.tmediacodec.util.ThreadManager */
/* loaded from: classes12.dex */
public final class C26517x68dfca23 {

    /* renamed from: mHandlerThread */
    private static final android.os.HandlerThread f54300x3e0f3a87;

    /* renamed from: sSubHandler */
    private static android.os.Handler f54302x2a89d1bd;

    /* renamed from: mHandler */
    private static final android.os.Handler f54299xc7640a1d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: mThreadPool */
    private static final java.util.concurrent.ExecutorService f54301x958efd93 = java.util.concurrent.Executors.newCachedThreadPool();

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("tmediacodec-sub");
        f54300x3e0f3a87 = handlerThread;
        handlerThread.start();
        f54302x2a89d1bd = new android.os.Handler(handlerThread.getLooper());
    }

    private C26517x68dfca23() {
    }

    /* renamed from: execute */
    public static void m103555xb158f775(java.lang.Runnable runnable) {
        f54301x958efd93.execute(runnable);
    }

    /* renamed from: postOnSubThread */
    public static void m103556x2c27b08b(java.lang.Runnable runnable) {
        f54302x2a89d1bd.post(runnable);
    }

    /* renamed from: runOnSubThread */
    public static void m103557x309ebdc0(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            f54301x958efd93.execute(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: runOnUiThread */
    public static void m103558x925811a8(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
        } else {
            f54299xc7640a1d.post(runnable);
        }
    }
}
