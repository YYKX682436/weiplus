package i95;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices triggered.");
        if (i95.n0.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ServiceManager", "[!] Watchdog task for delayed ASYNC preload FeatureServices actually post notify task.");
            android.os.Handler handler = i95.n0.f371362m;
            java.lang.Runnable runnable = i95.n0.f371365p;
            handler.removeCallbacks(runnable);
            handler.postAtFrontOfQueue(runnable);
            i95.n0.f371350a.unregisterActivityLifecycleCallbacks(i95.n0.f371367r);
            handler.removeCallbacks(i95.n0.f371366q);
        }
    }
}
