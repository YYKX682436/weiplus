package uh1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.f f509304e;

    public c(uh1.f fVar, java.lang.String str) {
        this.f509304e = fVar;
        this.f509303d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Runnable runnable;
        synchronized (this.f509304e.f509325i) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f509304e.f509325i).get(this.f509303d);
            concurrentLinkedQueue.size();
            runnable = (java.lang.Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandNetworkDownload", "hy: need execute more");
                uh1.f fVar = this.f509304e;
                java.lang.String str = this.f509303d;
                fVar.getClass();
                s75.d.b(new uh1.c(fVar, str), "appbrand_download_thread");
            }
        }
    }
}
