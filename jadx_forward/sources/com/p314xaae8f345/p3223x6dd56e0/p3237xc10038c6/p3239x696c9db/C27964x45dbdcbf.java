package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db;

/* renamed from: com.tencent.youtu.ytcommon.tools.YTThreadOperate */
/* loaded from: classes16.dex */
public class C27964x45dbdcbf {

    /* renamed from: mHandler */
    private static android.os.Handler f62614xc7640a1d = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: mExecutorService */
    private static java.util.concurrent.ExecutorService f62613x59d59235 = java.util.concurrent.Executors.newFixedThreadPool(3);

    /* renamed from: com.tencent.youtu.ytcommon.tools.YTThreadOperate$UiThreadCallback */
    /* loaded from: classes16.dex */
    public interface UiThreadCallback<T> {
        /* renamed from: callback */
        void m121284xf5bc2045(T t17);
    }

    /* renamed from: runOnSubThread */
    public static void m121280x309ebdc0(final java.lang.Runnable runnable) {
        f62613x59d59235.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.1
            @Override // java.lang.Runnable
            public void run() {
                runnable.run();
            }
        });
    }

    /* renamed from: runOnUiThread */
    public static void m121282x925811a8(java.lang.Runnable runnable) {
        f62614xc7640a1d.post(runnable);
    }

    /* renamed from: runOnUiThreadDelay */
    public static void m121283x49a680bb(java.lang.Runnable runnable, long j17) {
        f62614xc7640a1d.postDelayed(runnable, j17);
    }

    /* renamed from: runOnSubThread */
    public static <T> java.util.concurrent.Future<T> m121279x309ebdc0(final java.util.concurrent.Callable<T> callable) {
        return f62613x59d59235.submit(new java.util.concurrent.Callable<T>() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.2
            @Override // java.util.concurrent.Callable
            public T call() {
                try {
                    return (T) callable.call();
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        });
    }

    /* renamed from: runOnSubThread */
    public static <T> void m121281x309ebdc0(final java.util.concurrent.Callable<T> callable, final com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27964x45dbdcbf.UiThreadCallback<T> uiThreadCallback) {
        f62613x59d59235.submit(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.3
            @Override // java.lang.Runnable
            public void run() {
                final java.lang.Object obj;
                try {
                    obj = callable.call();
                } catch (java.lang.Exception unused) {
                    obj = null;
                }
                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27964x45dbdcbf.f62614xc7640a1d.post(new java.lang.Runnable() { // from class: com.tencent.youtu.ytcommon.tools.YTThreadOperate.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27964x45dbdcbf.UiThreadCallback uiThreadCallback2 = uiThreadCallback;
                        if (uiThreadCallback2 != null) {
                            try {
                                uiThreadCallback2.m121284xf5bc2045(obj);
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3239x696c9db.C27960xbb5d3374.m121259xc84c5534(e17);
                            }
                        }
                    }
                });
            }
        });
    }
}
