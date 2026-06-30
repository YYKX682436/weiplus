package l52;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.f f398112d;

    public e(l52.f fVar) {
        this.f398112d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.f fVar = this.f398112d;
        java.util.Map map = fVar.f398118e;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        ((java.util.concurrent.ConcurrentHashMap) fVar.f398123j).clear();
        fVar.L = null;
        java.lang.ref.WeakReference weakReference = fVar.f398137x;
        if (weakReference != null) {
            weakReference.clear();
            fVar.f398137x = null;
        }
        fVar.f398136w = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "freeOnDestroy: cost=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
