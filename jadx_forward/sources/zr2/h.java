package zr2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final zr2.h f556722d = new zr2.h();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchRelPreLoader", "clear task");
        synchronized (zr2.d.f556713b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchRelBatchLoadObjectCache", "clear cache");
            ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) zr2.d.f556714c).mo141623x754a37bb()).clear();
        }
    }
}
