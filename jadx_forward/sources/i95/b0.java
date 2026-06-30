package i95;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] Notify task for delayed ASYNC preload FeatureServices triggered.");
        if (i95.n0.g()) {
            try {
                android.os.Handler handler = i95.n0.f371362m;
                handler.removeCallbacks(i95.n0.f371366q);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceManager", "[+] Notify ASYNC preload FeatureServices was actually executed.");
                i95.n0.e(true, false);
                handler.removeCallbacks(i95.n0.f371365p);
            } catch (java.lang.Throwable th6) {
                i95.n0.f371362m.removeCallbacks(i95.n0.f371365p);
                throw th6;
            }
        }
    }
}
