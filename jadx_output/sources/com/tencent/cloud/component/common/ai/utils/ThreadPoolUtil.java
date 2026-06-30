package com.tencent.cloud.component.common.ai.utils;

/* loaded from: classes13.dex */
public class ThreadPoolUtil {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.ThreadPoolExecutor f45901a;

    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil f45902a = new com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil();
    }

    public ThreadPoolUtil() {
        a();
    }

    public static com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil getInstance() {
        return com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.a.f45902a;
    }

    public final void a() {
        this.f45901a = new java.util.concurrent.ThreadPoolExecutor(8, 64, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void addWork(java.lang.Runnable runnable) {
        if (this.f45901a.isShutdown()) {
            return;
        }
        this.f45901a.execute(runnable);
    }

    public void showDown() {
        if (this.f45901a.isShutdown()) {
            return;
        }
        this.f45901a.shutdown();
    }

    public void waitThreadTime() {
        if (android.os.Looper.getMainLooper().getThread().getId() == java.lang.Thread.currentThread().getId()) {
            return;
        }
        try {
            java.lang.Thread.sleep(500L);
        } catch (java.lang.InterruptedException unused) {
        }
    }
}
