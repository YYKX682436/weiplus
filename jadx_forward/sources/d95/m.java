package d95;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d95.f f309228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f309229e;

    public m(d95.f fVar, java.lang.Runnable runnable) {
        this.f309228d = fVar;
        this.f309229e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (d95.f.class) {
            java.util.Set set = d95.f.f309193f;
            if (!set.contains(this.f309228d.k())) {
                set.add(this.f309228d.k());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMDataBase", "executeTaskSilently");
                this.f309229e.run();
            }
        }
    }
}
