package ee3;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333174d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.p f333175e;

    public n(ee3.p pVar, java.lang.String str) {
        this.f333175e = pVar;
        this.f333174d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Runnable runnable;
        synchronized (this.f333175e.f333184f) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333175e.f333184f).get(this.f333174d);
            concurrentLinkedQueue.size();
            runnable = (java.lang.Runnable) concurrentLinkedQueue.peek();
        }
        if (runnable != null) {
            runnable.run();
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "lm: need execute more");
                ee3.p pVar = this.f333175e;
                java.lang.String str = this.f333174d;
                pVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new ee3.n(pVar, str), "magicbrush_download_thread");
            }
        }
    }
}
