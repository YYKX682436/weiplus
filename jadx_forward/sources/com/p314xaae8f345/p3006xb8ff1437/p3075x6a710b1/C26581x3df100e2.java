package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPThreadPool */
/* loaded from: classes13.dex */
public class C26581x3df100e2 {

    /* renamed from: CORE_POOL_SIZE */
    private static final int f55366x354499a4 = 4;

    /* renamed from: MAX_POOL_SIZE */
    private static final int f55367xc5601109 = 20;

    /* renamed from: PRE_THREAD_NAME */
    private static final java.lang.String f55368x8705c7e4 = "TP-HandlerThread";

    /* renamed from: SHARE_THREAD_NAME */
    private static final java.lang.String f55369xdb43ef20 = "TP-ShareThreadPool";
    private static final java.lang.String TAG = "TPPlayer[TPThreadPool]";

    /* renamed from: sCustomExecutor */
    private static volatile java.util.concurrent.ExecutorService f55370xf3886eb7;

    /* renamed from: sHandlerThread */
    private static volatile android.os.HandlerThread f55371x8941f441;

    /* renamed from: sInstance */
    private static volatile com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2 f55372xbfaed628;

    /* renamed from: sMainThreadHandler */
    private static volatile android.os.Handler f55373x5192b474;

    /* renamed from: sScheduler */
    private static volatile java.util.concurrent.ScheduledExecutorService f55374x2adbb188;

    /* renamed from: sShareSingleExecutor */
    private static volatile java.util.concurrent.ExecutorService f55375x5eb29787;

    /* renamed from: sShareThreadCount */
    private static int f55376x892b8e59;

    private C26581x3df100e2() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2 m104405x9cf0d20b() {
        if (f55372xbfaed628 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
                if (f55372xbfaed628 == null) {
                    f55372xbfaed628 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2();
                }
            }
        }
        return f55372xbfaed628;
    }

    /* renamed from: initHandlerThread */
    private static void m104406x4877b6c4() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
            if (f55371x8941f441 == null) {
                f55371x8941f441 = new android.os.HandlerThread(f55369xdb43ef20);
                f55371x8941f441.start();
            } else if (!f55371x8941f441.isAlive()) {
                f55371x8941f441.start();
            }
            if (f55371x8941f441.getLooper() == null) {
                f55371x8941f441.quit();
                f55371x8941f441 = new android.os.HandlerThread(f55369xdb43ef20);
                f55371x8941f441.start();
            }
        }
    }

    /* renamed from: initMainThreadHandler */
    private static void m104407x234d7d77() {
        if (f55373x5192b474 != null) {
            return;
        }
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
            if (f55373x5192b474 != null) {
                return;
            }
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                f55373x5192b474 = new android.os.Handler(mainLooper);
            } else {
                f55373x5192b474 = null;
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "cannot get thread looper");
            }
        }
    }

    /* renamed from: obtainHandleThread */
    public android.os.HandlerThread m104408x3ccacf97(java.lang.String str) {
        return m104409x3ccacf97(str, 0);
    }

    /* renamed from: obtainScheduledExecutorService */
    public java.util.concurrent.ScheduledExecutorService m104410x2b7e2fba() {
        if (f55374x2adbb188 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
                if (f55374x2adbb188 == null) {
                    f55374x2adbb188 = java.util.concurrent.Executors.newScheduledThreadPool(4);
                }
            }
        }
        return f55374x2adbb188;
    }

    /* renamed from: obtainShareThread */
    public android.os.HandlerThread m104411x2a51c4e4() {
        android.os.HandlerThread handlerThread;
        m104406x4877b6c4();
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
            f55376x892b8e59++;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "handlerThread obtainShareThread mShareThreadCount:" + f55376x892b8e59);
            handlerThread = f55371x8941f441;
        }
        return handlerThread;
    }

    /* renamed from: obtainSingleThreadExecutor */
    public java.util.concurrent.ExecutorService m104412x6dce83aa() {
        if (f55375x5eb29787 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
                if (f55375x5eb29787 == null) {
                    f55375x5eb29787 = java.util.concurrent.Executors.newSingleThreadExecutor();
                }
            }
        }
        return f55375x5eb29787;
    }

    /* renamed from: obtainThreadExecutor */
    public java.util.concurrent.ExecutorService m104413x137f2902() {
        if (f55370xf3886eb7 == null) {
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
                if (f55370xf3886eb7 == null) {
                    f55370xf3886eb7 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26582x1efb5bd5.m104418x7e198c8e(4, 20);
                }
            }
        }
        return f55370xf3886eb7;
    }

    /* renamed from: postDelayRunnableOnMainThread */
    public void m104414x56639d82(java.lang.Runnable runnable, long j17) {
        m104407x234d7d77();
        if (f55373x5192b474 != null) {
            f55373x5192b474.postDelayed(runnable, j17);
        }
    }

    /* renamed from: postRunnableOnMainThread */
    public void m104415xf2510df(java.lang.Runnable runnable) {
        m104407x234d7d77();
        if (f55373x5192b474 != null) {
            f55373x5192b474.post(runnable);
        }
    }

    /* renamed from: postRunnableOnMainThreadFront */
    public void m104416x6e1d908a(java.lang.Runnable runnable) {
        m104407x234d7d77();
        if (f55373x5192b474 != null) {
            f55373x5192b474.postAtFrontOfQueue(runnable);
        }
    }

    /* renamed from: recycle */
    public void m104417x408b7293(android.os.HandlerThread handlerThread, android.os.Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(f55371x8941f441)) {
            handlerThread.quit();
            return;
        }
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.class) {
            f55376x892b8e59--;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "handlerThread recycle mShareThreadCount:" + f55376x892b8e59);
        }
    }

    /* renamed from: obtainHandleThread */
    public android.os.HandlerThread m104409x3ccacf97(java.lang.String str, int i17) {
        if (i17 >= 19 || i17 <= -19) {
            i17 = 0;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = f55368x8705c7e4;
        }
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, i17);
        handlerThread.start();
        return handlerThread;
    }
}
