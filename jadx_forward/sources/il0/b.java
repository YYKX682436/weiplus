package il0;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ il0.c f373540d;

    public b(il0.c cVar) {
        this.f373540d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        synchronized (this.f373540d.f373541d) {
            il0.e eVar = il0.e.f373542f;
            synchronized (eVar) {
                z17 = eVar.f373546d;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.DiscoveryReddotEnv", "clear res");
                eVar.b();
            }
        }
    }
}
