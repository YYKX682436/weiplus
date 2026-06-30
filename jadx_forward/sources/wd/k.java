package wd;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final he.a f526220a = new he.a();

    public void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ah.d.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBLogDelegateRegistry", "dl: load magicbrush [%d]ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void b() {
        boolean z17;
        he.a aVar = f526220a;
        wd.i iVar = new wd.i(this);
        if (aVar.f362189a) {
            return;
        }
        synchronized (he.b.class) {
            if (aVar.f362189a) {
                z17 = false;
            } else {
                z17 = true;
                aVar.f362189a = true;
            }
        }
        if (z17) {
            iVar.run();
        }
    }
}
