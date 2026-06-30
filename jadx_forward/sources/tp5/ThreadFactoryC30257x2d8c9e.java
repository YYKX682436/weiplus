package tp5;

/* renamed from: tp5.c$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ThreadFactoryC30257x2d8c9e implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "WCDBLazyResultLeakMonitor");
        thread.setDaemon(true);
        return thread;
    }
}
