package ee3;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee3.m f333165e;

    public k(ee3.m mVar, java.lang.String str) {
        this.f333165e = mVar;
        this.f333164d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        ee3.d dVar;
        synchronized (this.f333165e.f333172d) {
            concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333165e.f333172d).get(this.f333164d);
            concurrentLinkedQueue.size();
            dVar = (ee3.d) concurrentLinkedQueue.peek();
        }
        if (dVar != null) {
            dVar.execute(new java.lang.Void[0]);
            concurrentLinkedQueue.poll();
            if (concurrentLinkedQueue.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "lm: need execute more");
                ee3.m mVar = this.f333165e;
                java.lang.String str = this.f333164d;
                mVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).h(new ee3.k(mVar, str), "magicbrush_cdndownload_thread");
            }
        }
    }
}
