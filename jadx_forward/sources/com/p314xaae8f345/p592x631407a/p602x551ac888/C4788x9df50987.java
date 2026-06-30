package com.p314xaae8f345.p592x631407a.p602x551ac888;

/* renamed from: com.tencent.midas.download.APMidasPluginDownloadManager */
/* loaded from: classes12.dex */
public class C4788x9df50987 {

    /* renamed from: MAX_CURRENCY_DOWNLOAD_THREAD */
    private static final int f20663xafb4b00e = 1;
    private static final java.lang.String TAG = "APMidasPluginDownloadManager";

    /* renamed from: executorService */
    private java.util.concurrent.ExecutorService f20664x8a276262 = m41949x6e89342c();

    private C4788x9df50987() {
    }

    /* renamed from: enqueue */
    private synchronized void m41948xa0f98e08(com.p314xaae8f345.p592x631407a.p602x551ac888.RunnableC4790x6142b664 runnableC4790x6142b664) {
        if (runnableC4790x6142b664 == null) {
            com.p314xaae8f345.p592x631407a.p595x2eaf0c.C4755x3b98095.e(TAG, "Cannot enqueue null worker!");
        } else {
            this.f20664x8a276262.execute(runnableC4790x6142b664);
        }
    }

    /* renamed from: getExecutorService */
    private java.util.concurrent.ExecutorService m41949x6e89342c() {
        if (this.f20664x8a276262 == null) {
            this.f20664x8a276262 = java.util.concurrent.Executors.newFixedThreadPool(1, m41951xc662bba0("Plugin Download Thread", false));
        }
        return this.f20664x8a276262;
    }

    /* renamed from: startDownload */
    public static void m41950x5cae6f0a(android.content.Context context, java.util.ArrayList<com.p314xaae8f345.p592x631407a.p602x551ac888.C4787x4ae5972e> arrayList, com.p314xaae8f345.p592x631407a.p602x551ac888.InterfaceC4791x6f8c6b0b interfaceC4791x6f8c6b0b) {
        new com.p314xaae8f345.p592x631407a.p602x551ac888.C4788x9df50987().m41948xa0f98e08(new com.p314xaae8f345.p592x631407a.p602x551ac888.RunnableC4790x6142b664(context, arrayList, context.getApplicationContext().getDir("midaspluginsTemp", 0), interfaceC4791x6f8c6b0b));
    }

    /* renamed from: threadFactory */
    private static java.util.concurrent.ThreadFactory m41951xc662bba0(final java.lang.String str, final boolean z17) {
        return new java.util.concurrent.ThreadFactory() { // from class: com.tencent.midas.download.APMidasPluginDownloadManager.1

            /* renamed from: netThreadCount */
            private java.util.concurrent.atomic.AtomicInteger f20665x78735348 = new java.util.concurrent.atomic.AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable, str + " " + this.f20665x78735348.getAndIncrement());
                thread.setPriority(10);
                thread.setDaemon(z17);
                return thread;
            }
        };
    }
}
