package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1;

/* renamed from: com.tencent.thumbplayer.core.utils.TPThreadPool */
/* loaded from: classes13.dex */
public class C26452x3df100e2 {

    /* renamed from: CORE_POOL_SIZE */
    private static final int f53756x354499a4 = 1;

    /* renamed from: MAX_POOL_SIZE */
    private static final int f53757xc5601109 = 20;

    /* renamed from: PRE_THREAD_NAME */
    private static final java.lang.String f53758x8705c7e4 = "TPCoreHdr";

    /* renamed from: SHARE_THREAD_NAME */
    private static final java.lang.String f53759xdb43ef20 = "TPCore-ShareThread";
    private static final java.lang.String TAG = "TPCore[TPThreadPool]";

    /* renamed from: sCustomExecutor */
    private static volatile java.util.concurrent.ExecutorService f53760xf3886eb7;

    /* renamed from: sHandlerThread */
    private static volatile android.os.HandlerThread f53761x8941f441;

    /* renamed from: sInstance */
    private static volatile com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2 f53762xbfaed628;

    /* renamed from: sMainThreadHandler */
    private static volatile android.os.Handler f53763x5192b474;

    /* renamed from: sScheduler */
    private static volatile java.util.concurrent.ScheduledExecutorService f53764x2adbb188;

    /* renamed from: sShareSingleExecutor */
    private static volatile java.util.concurrent.ExecutorService f53765x5eb29787;

    /* renamed from: sShareThreadCount */
    private static int f53766x892b8e59;

    private C26452x3df100e2() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2 m102976x9cf0d20b() {
        if (f53762xbfaed628 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
                if (f53762xbfaed628 == null) {
                    f53762xbfaed628 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2();
                }
            }
        }
        return f53762xbfaed628;
    }

    /* renamed from: initHandlerThread */
    private static void m102977x4877b6c4() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
            if (f53761x8941f441 == null) {
                f53761x8941f441 = new android.os.HandlerThread(f53759xdb43ef20);
                f53761x8941f441.start();
            } else if (!f53761x8941f441.isAlive()) {
                f53761x8941f441.start();
            }
            if (f53761x8941f441.getLooper() == null) {
                f53761x8941f441.quit();
                f53761x8941f441 = new android.os.HandlerThread(f53759xdb43ef20);
                f53761x8941f441.start();
            }
        }
    }

    /* renamed from: initMainThreadHandler */
    private static void m102978x234d7d77() {
        if (f53763x5192b474 != null) {
            return;
        }
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
            if (f53763x5192b474 != null) {
                return;
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                f53763x5192b474 = new android.os.Handler(mainLooper);
            } else {
                f53763x5192b474 = null;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "cannot get thread looper");
            }
        }
    }

    /* renamed from: obtainHandleThread */
    public android.os.HandlerThread m102979x3ccacf97(java.lang.String str) {
        return m102980x3ccacf97(str, 0);
    }

    /* renamed from: obtainScheduledExecutorService */
    public java.util.concurrent.ScheduledExecutorService m102981x2b7e2fba() {
        if (f53764x2adbb188 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
                if (f53764x2adbb188 == null) {
                    f53764x2adbb188 = java.util.concurrent.Executors.newScheduledThreadPool(1);
                }
            }
        }
        return f53764x2adbb188;
    }

    /* renamed from: obtainShareThread */
    public android.os.HandlerThread m102982x2a51c4e4() {
        android.os.HandlerThread handlerThread;
        m102977x4877b6c4();
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
            f53766x892b8e59++;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "handlerThread obtainShareThread mShareThreadCount:" + f53766x892b8e59);
            handlerThread = f53761x8941f441;
        }
        return handlerThread;
    }

    /* renamed from: obtainSingleThreadExecutor */
    public java.util.concurrent.ExecutorService m102983x6dce83aa() {
        if (f53765x5eb29787 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
                if (f53765x5eb29787 == null) {
                    f53765x5eb29787 = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        return f53765x5eb29787;
    }

    /* renamed from: obtainThreadExecutor */
    public java.util.concurrent.ExecutorService m102984x137f2902() {
        if (f53760xf3886eb7 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
                if (f53760xf3886eb7 == null) {
                    f53760xf3886eb7 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26453x1efb5bd5.m102989x7e198c8e(1, 20);
                }
            }
        }
        return f53760xf3886eb7;
    }

    /* renamed from: postDelayRunnableOnMainThread */
    public void m102985x56639d82(java.lang.Runnable runnable, long j17) {
        m102978x234d7d77();
        if (f53763x5192b474 != null) {
            f53763x5192b474.postDelayed(runnable, j17);
        }
    }

    /* renamed from: postRunnableOnMainThread */
    public void m102986xf2510df(java.lang.Runnable runnable) {
        m102978x234d7d77();
        if (f53763x5192b474 != null) {
            f53763x5192b474.post(runnable);
        }
    }

    /* renamed from: postRunnableOnMainThreadFront */
    public void m102987x6e1d908a(java.lang.Runnable runnable) {
        m102978x234d7d77();
        if (f53763x5192b474 != null) {
            f53763x5192b474.postAtFrontOfQueue(runnable);
        }
    }

    /* renamed from: recycle */
    public void m102988x408b7293(android.os.HandlerThread handlerThread, android.os.Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(f53761x8941f441)) {
            handlerThread.quit();
            return;
        }
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3051x6a710b1.C26452x3df100e2.class) {
            f53766x892b8e59--;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "handlerThread recycle mShareThreadCount:" + f53766x892b8e59);
        }
    }

    /* renamed from: obtainHandleThread */
    public android.os.HandlerThread m102980x3ccacf97(java.lang.String str, int i17) {
        if (i17 >= 19 || i17 <= -19) {
            i17 = 0;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = f53758x8705c7e4;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, i17);
        handlerThread.start();
        return handlerThread;
    }
}
