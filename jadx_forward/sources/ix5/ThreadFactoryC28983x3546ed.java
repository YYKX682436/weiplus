package ix5;

/* renamed from: ix5.t$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class ThreadFactoryC28983x3546ed implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "WVAThread.main");
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
